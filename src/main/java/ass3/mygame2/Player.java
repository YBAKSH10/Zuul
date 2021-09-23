package ass3.mygame2;


import java.util.ArrayList;


/**
 * Write a description of class Player here.
 * This is a player class
 * There are items placed in inventory
 * These items can be added and removed as well
 * @author (Yamini Bakshi and Umer Jahangir)
 * @version 3.0(22.09.2021)
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
    
    public Player()
    {
        playerItem = new ArrayList();
    }
    
    /**
    * @param ( Yamini Bakshi and Umer Jahangir)
    * @return (3.0)
    * @exception (22.09.2021)
    * @see (22.09.2021)
    */
    
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        //System.out.println(item.getDescription() + " was added from the room"); // add extra information to inform user that the item has been taken
    }

    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
