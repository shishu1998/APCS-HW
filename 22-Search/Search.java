import java.io.*;
import java.util.*;
public class Search{
    private ArrayList<Integers> al;
    al = new ArrayList<Integers>();
    private Random r = new Random();
    public Search(){
	for(int i = 0; i < 10000; i ++){
	    al.set(i, r.nextInt(10000));
	}
    }
    public comparable lsearch(ArrayList<comparable> a, comparable b){
	for(int i = 0; i < a.size(); i ++){
	    if(a.get(i).equals(b)){
		return b;
	    }
	    if(i == a.size()){
		return null;
	    }
	}
    }
}
