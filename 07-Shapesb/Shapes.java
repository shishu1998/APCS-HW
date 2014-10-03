public class Shapes{
    public String tri3(int h){
	int count;
	int count2;
	int base = 2*h - 1;
	int space;
	String output = "";
	int star;
	for(star = 1;star<=base;star = star + 2){
	    space = (base - star) / 2;
	    for(count = 0;count < space;count =count +1){
		output = output + " ";}
	    for (count2 = 0;count2 < star;count2 = count2 + 1){
		output = output + "*";}
	    for(count = 0;count < space;count = count +1){
		output = output + " ";}
	    output = output + "\n";
	}
	return output;
    }
    public String diamond(int h){
	int star;
	int mid = h;
	int space;
	int counter;
	int counter2;
	String output = "";
	for (star = 1;star <= h; star = star + 2){
	    space = (mid - star)/2;
	    for(counter = 0;counter < space;counter = counter + 1){
		output = output + " ";}
	    for(counter2 = 0;counter2 < star;counter2 = counter2 + 1){
		output = output + "*";}
	    for(counter = 0;counter < space;counter = counter + 1){
		output = output + " ";}
	    output = output + "\n";}
	for (star = h - 2;star > 0; star = star - 2){
	    space = (mid - star)/2;
	    for(counter = 0;counter < space;counter = counter + 1){
		output = output + " ";}
	    for(counter2 = 0;counter2 <star; counter2=counter2 + 1){
		output = output + "*";}
	    for(counter = 0;counter < space;counter = counter + 1){
		output = output + " ";}
	    output = output + "\n";}
	return output;}
    public String tri4(int h){
	int counter;
	int counter2;
	int star;
	int space;
	String output = "";
	for (star = h; star > 0;star = star -1){
	    space = h - star;
	    for(counter = space;counter > 0;counter= counter -1){
		output = output + " ";}
	    for(counter2 = star;counter2 > 0;counter2 = counter2 -1){
		output = output + "*";}
	    output = output + "\n";}
	return output;
    }
	    
}

