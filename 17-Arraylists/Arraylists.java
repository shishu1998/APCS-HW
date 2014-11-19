import java.io.*;
import java.util.*;

public class Arraylists{
    public static void main(String [] args){
	ArrayList <Integer> al, al2;
	al = new ArrayList<Integer>();
	Random r = new Random();
	for(int i =0;i < 20;i ++){
	    al.add(i);
	}
	System.out.println(al);
	for(int i = 0; i < 100; i ++){
	    int index1 =  r.nextInt(al.size());
	    int index2 = r.nextInt(al.size());
	    int num1 = al.get(index1);
	    int num2 = al.get(index2);
	    al.set(index1,num2);
	    al.set(index2,num1);
	    
	}
	System.out.println(al);
	int[] array = new int[20];
	for(int i = 0; i < 20; i ++){
	    array[i] = i;
	}
	String in = "";
	for(int i = 0;i < array.length; i ++){
	    in  = in + array[i] + ", ";
	}
	System.out.println(in);
	for(int i = 0; i < 100; i ++){
	    int index1 = r.nextInt(array.length);
	    int index2 = r.nextInt(array.length);
	    int num1 = array[index1];
	    int num2 = array[index2];
	    array[index1] = num2;
	    array[index2] = num1;
	    
	}
	String out = "";
	for(int i = 0;i < array.length; i ++){
	    out = out + array[i] + ", ";
	}
	System.out.println(out);
	
	
    }



}
