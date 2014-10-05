public class For{
    public String frame(int r, int c){
	int star;
	int star2;
	int space;
	int counter;
	int counter2;
	String output = "";
	for (counter = 0;counter < r;counter = counter + 1){
	    if (counter == 0 || counter == r - 1){
		for(star = c;star > 0;star = star - 1){
		    output = output + "*";}
		output = output + "\n";}
	    else{  
		output = output + "*";
		space = c - 2;
		while (space > 0){
		    space = space -1;
		    output = output + " ";}
		output = output + "*";
		output = output + "\n";
	    }
	}
	return output;
    }
    public String stringSplosion(String str) {
	int counter;
	String output = "";
	for (counter = 0;counter < str.length();counter = counter + 1){
	    output = output + str.substring(0,counter + 1);
	}
	return output;
    }
    public String stringX(String str) {
	if (str == ""){
	    return "";}
	if(str == "x"){
	    return "x";}
	String output = "";
	int counter;
	for(counter = 0;counter < str.length();counter = counter + 1){
	    if(str.charAt(counter) != 'x'){
		output = output + str.substring(counter, counter + 1);}}
	if(str.charAt(0) == 'x'){
	    output = "x" + output;}
	if(str.charAt(str.length() - 1) == 'x'){
	    output = output + "x";}
	return output;
  
}
}
