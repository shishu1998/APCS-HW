import java.io.*;
import java.util.*;
public class basechar implements Comparable{
    private int health = 200;
    private  int attack = 30;
    private  int armor = 10;
    private int mana = 50;
    private  String name = "";
    private int luck = 0;
    private Random rand = new Random();
    
    //Constructors
    public basechar(){
	int sub;
	String letters = "abcdefghijklmnopqrstuvwxyz";
	for(int i = 0; i < 5; i ++){
	    sub = rand.nextInt(26);
	    name = name + letters.substring(sub,sub + 1);
	
	}
    }
    //Methods
    public int gethealth(){
	return health;
    }
    
    public int getattack(){
        return this.attack;
    }
    public int getarmor(){
        return this.armor;
    }
    public int getmana(){
        return this.mana;
    }
    public String getname(){
        return this.name;
    }
    
    public void sethealth(int value){
        health = value;
    }
    
    public void setattack(int value){
        attack = value;
    }
    
    public void setarmor(int value){
        armor = value;
    }
    
    public void setmana(int value) {
        mana = value;
    }
    
    public void setname(String value){
        name = value;
    }
    public void setcrit(int value){
        luck = value;
    }
    public int getcrit(){
        return this.luck;
    }
    public int compareTo(Object other){
	basechar a = (basechar)other;
	return this.getname().compareTo(a.getname());
    }
    public static void main(String[] args){
	basechar[] al = new basechar[5];
	for(int i = 0; i < al.length; i ++){
	    al[i] = new basechar();
	}
	Arrays.sort(al);
	for(int b = 0; b < al.length - 1; b ++){
	    System.out.println(al[b].getname());
	}
    }
}
