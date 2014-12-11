import java.io.*;
import java.util.*;
public class Warrior extends basechar implements Comparable{
    public static void main(String[] args){
	Warrior[] al = new Warrior[5];
	for(int i = 0; i < al.length; i ++){
	    al[i] = new Warrior();
	}
        Arrays.sort(al);
	for(int b = 0; b < al.length; b ++){
	    System.out.println(al[b].getname());
	}
    }
}
