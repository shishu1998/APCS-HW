public class Mage extends Basechar{
    private int mana = 200;
    private String name = "NoName";

    public int getMana(){
	return mana;
    }
    public void SetName(String name){
	this.name = name;
    }
   public String toString(){
	return this.getName();
    }
    public String getName(){
	return name;
    }
    public void SetNameNMana(String name, int mana){
	this.mana = mana;
	this.name = name;
    }
}
