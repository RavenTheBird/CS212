import javax.swing.JOptionPane;
/**
 * This code takes in the user's input and outputs the amount of lower and capital cased e's there are in the sentence
 * @author 
 * CSCI212-11D
 *
 */
public class Main{
  public static void main(String[] args) {
    int j = 0;
while(j <= 0) {
String usersinput =  JOptionPane.showInputDialog(null,"Enter a message");  //Prompts user for message, stores in string usersinput
    
    int count= 0;
    int count2 = 0; 
    
    for(int i = 0; i <= usersinput.length()-1; i++){ //Checks to see if character e is in string user entered
        if(usersinput.charAt(i) == 'e'){
            count++;
        }
    }
    
    for(int i = 0; i <= usersinput.length()-1; i++){ //Checks to see if character E is in string user entered
        if(usersinput.charAt(i) == 'E'){
            count2++;
        }
    }
    if(usersinput.equalsIgnoreCase("Stop")) { //Used by user to exit program 
    System.exit(0);
    }
    JOptionPane.showMessageDialog(null,"Char 'e' occured " + count +" times in the string\n" +"Char 'E' occured " + count2 +" times in the string"); //Tells user the amount of times the letters appeared.     
  }
  }
}

