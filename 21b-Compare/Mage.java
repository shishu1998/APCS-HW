import java.io.*;
import java.util.*;
public class Mage implements Comparable extends basechar{
    public static void main(String[] args){
        Mage[] al = new Mage[5];
	for(int i = 0; i < al.length; i ++){
	    al[i] = new Mage();
	}
        Arrays.sort(al);
	for(int b = 0; b < al.length; b ++){
	    System.out.println(al[b].getname());
	}
    }
}
