public class Shapes {
    public String tr4(int h){
	int count;
	int count2;
	int base = 2*h - 1;
	int space;
	Strin output = "";
	for(star = 1;star<=base;star + 2){
	    space = (base - star) / 2;
	    for(count = 0;count < space;count +1){
		output = output + " ";}
	    for (count2 = 0;count2 < star;count2 + 1){
		output = output + "*";}
	    for(count = 0;count < space;count +1){
		output = output + " ";}
	    output = output + "\n";
	    
