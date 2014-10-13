public class Mage extends basechar{
    //Instance Variables for Mage:
    public void initialize(){
        this.attack = 40;
        this.name = "Mage";
    }
    public int getattack(){
        return this.attack;
    }
    public int getarmor(){
        return this.armor;
    }
    public String getname(){
        return this.name;
    }
}
