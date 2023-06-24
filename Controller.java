/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 7 | Testing Assignment
 * 
 * This application reads an HTML file to extract a poem for analysis;
 * specifically to count the number of occurrences of each word and
 * output a list of the most used words. This is achieved by creating 
 * two parallel arrays lists, one to record the word itself and the other 
 * to record the number of occurrences. 
***********************************************************************/
package application;
import javafx.application.Application;

public class Controller {
	
	public static void main(String[] args) {
		
		// Launching application GUI.
    	Application.launch(GUI.class, args);
    
    }

}