
package ass3.mygame2;
/**
 * @author (Yamini Bakshi and Umer Jahangir)
 * @version (3.0 and 22.09.2021)
 */
public class Item
{
    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;
    
    public Item(String name, String description, int destructivePower)
    {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }
    
    public Item(String name, String description, double healingPower)
    {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
  
    public int getPower(){
        return destructivePower;
    }
}
