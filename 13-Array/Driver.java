public class Driver{
    public static void main(String[] args){
	Array ints = new Array();
	int[] List1 = new int[3];
	List1[0] = 5;
	List1[1] = 3;
	List1[2] = 4;
	int[] List2 = new int[5];
	List2[0] = 13;
	List2[3] = 5;
	List2[1] = 10;
	System.out.println(ints.frontPiece(List1));
	System.out.println(ints.sum13(List2));
    }
}
