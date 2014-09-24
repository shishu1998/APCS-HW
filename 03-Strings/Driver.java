public class Driver{
    public static void main(String[] args){
	String s ="shi shu";
	String firstname = s.substring(0,s.indexOf(' '));
	String lastname = s.substring(s.indexOf(' ') + 1);
	System.out.println(firstname);
	System.out.println(lastname);
    }
}
