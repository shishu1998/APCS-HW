public class loops{
    // Problem 1 
public String frontTimes(String str, int n) {
  String s = "";
  if(str.length() > 3){
  str = str.substring(0,3);}
  while(n > 0){
  n = n -1;
  s = s + str;}
  return s;
}
    //2 min
    //Problem 2
public String stringBits(String str) {
  int counter1 = 0;
  int counter2 = str.length();
  String output = "";
  while (counter1 < counter2){
  if(counter1 % 2 != 1){
  output = output + str.substring(counter1,counter1 + 1);}
  
  counter1 = counter1 + 1;}
  return output;
  }
    //4 min
    //Problem 3
public String stringYak(String str) {
  String output = "";
  int counter = 0;
  while (counter < str.length()){
  if (counter + 2 < str.length() && str.charAt(counter) == 'y' && str.charAt(counter + 2) == 'k'){
  counter = counter + 2;}
  else {output = output + str.charAt(counter);
  }
  counter = counter + 1;
  }
  return output;
  
}

    //Problem 4
public int stringMatch(String a, String b) {
  int counter = 0;
  int count = 0;
  String match1 = "";
  String match2 = "";
  if (a == "" || b == ""){return 0;}
  while (counter != a.length() - 1 && counter != b.length() - 1){
  if (a.charAt(counter) == b.charAt(counter) && a.charAt(counter + 1) == b.charAt(counter + 1)){count = count + 1;}
  counter = counter + 1;}
  return count;
}
    //10 min
}
