import java.util.*;
public class Driver{
    public static void main(String[] args){
        Warrior fighter = new Warrior();
        Mage caster = new Mage();
        fighter.initialize();
        caster.initialize();
        Random number = new Random();
        int attack1 = fighter.getattack();
        int armor1 = fighter.getarmor();
        int attack2 = caster.getattack();
        int armor2 = caster.getattack();
        while (fighter.gethealth() > 0 && caster.gethealth() > 0){
            int strike1 = number.nextInt(fighter.attack) - caster.getarmor();
            int strike2 = number.nextInt(caster.attack) - fighter.getarmor();
            if(strike1 > 0){
                caster.sethealth(caster.gethealth() - strike1);
                System.out.println(caster.getname() + " took " + strike1 + " damage");}
            else{
                System.out.println(caster.getname() + " took " + 0 + " damage");
            }
            if(strike2> 0){
                fighter.sethealth(fighter.gethealth() - strike2);
                System.out.println(fighter.getname() + " took " + strike2 + " damage");}
            else{
                System.out.println(fighter.getname() + " took " + 0 + " damage");
            }
            if(fighter.gethealth() <= 0){
                System.out.println(caster.getname() + " kills " +  fighter.getname()+  " with fireballs!");
            }
            if(caster.gethealth() <= 0){
                System.out.println(fighter.getname() + " kills " +  caster.getname()+  " with a swing to the head!");
            }
            System.out.println("Warrior Health: " + fighter.gethealth() + "\nMage Health: " + caster.gethealth());
        }   
        
                
    }
}
