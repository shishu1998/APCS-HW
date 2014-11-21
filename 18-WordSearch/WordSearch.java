/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;
    private int column;
    private int rw;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	rw = r;
	column = c;
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void addWordRight(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (c + w.length()- 1 > column){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}

	    
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    c ++;
	}
	c = col;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
    }
    public void addWordLeft(String w, int row, int col){
	int r = row,c = col;
	boolean check = true;
	if(col - w.length() + 1 < 0){
	    System.out.println("Error,the word " +  w + " is too long for that index");
	    check = false;
	}
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    c --;
	}
	c = col;
	if (check == true){
	    for(int i =0; i < w.length(); i++){
		board[r][c] = w.charAt(i);
		c --;
	    }
	}
    }
    public void addWordUp(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (r - w.length()- 1 < 0){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}
	
	
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    r --;
	}
	r = row;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
	    }
	}
    }
     public void addWordDown(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (r + w.length()- 1 > rw){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}
	
	
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    r ++;
	}
	r = row;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
	    }
	}
    }
    public void addWordTopRight(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (r - w.length()- 1 < 0 || c + w.length()- 1 > column){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}
	
	
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    r --;
	    c ++;
	}
	r = row;
	c = col;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
		c++;
	    }
	}
    }
    public void addWordTopLeft(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (r - w.length()- 1 < 0 ||col - w.length() + 1 < 0){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}
	
	
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    r --;
	    c --;
	}
	r = row;
	c = col;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
		c--;
	    }
	}
    }
    public void addWordDownLeft(String w,int row, int col){
	int r = row, c = col;
	boolean check = true;
	if (r + w.length()- 1 > rw||col - w.length() + 1 < 0){
	    check = false;
	    System.out.println("The word " + w + " is too long");
	}
	
	
	for(int i = 0;i< w.length(); i ++){
	    if(board[r][c] != '.' && board[r][c] != w.charAt(i)){
		System.out.println(w + " conflicts letters with other words");
		check = false;
		i = w.length();
	    }
	    r ++;
	    c --;
	}
	r = row;
	c = col;
	if(check == true){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
		c--;
	    }
	}
    }
   
   
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);
	w.addWordRight("hello",3,5);
	w.addWordRight("lock",3,8);
	w.addWordRight("bah",3,5);
	w.addWordLeft("look",4,8);
	w.addWordLeft("man",4,2);
	w.addWordLeft("tan",4,3);
	w.addWordRight("brown",5,25);
	w.addWordUp("boo",5,9);
	w.addWordDown("mope",10,10);
	w.addWordDown("nothing",4,0);
	w.addWordTopRight("something", 10,10);
	w.addWordTopLeft("jasonmason",15,15);
	w.addWordDownLeft("awesome",9,9);
	
	System.out.println(w);
    }
    
}
