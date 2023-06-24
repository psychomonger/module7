/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 7 | Testing Assignment
 * 
 * This class handles the methods related to manipulating text.
***********************************************************************/
package application;
import java.util.Arrays;


public class TextAnalyzer {
	
	public String getTextFromHTML(String html, String startOfTextDelim, String endOfTextDelim) {
		
		int posStartOfPoem = 0;
		int posEndOfPoem = 0;
		String text = null;
		
		// Get position of the start of the poem.
		posStartOfPoem = html.indexOf(startOfTextDelim);
		
		// Remove ALL text prior to the start of the poem.
		html = html.substring(posStartOfPoem);
		
		// Get position of end of the poem.
		posEndOfPoem = html.indexOf(endOfTextDelim);
				
		// Remove ALL text after the end of the poem.
		html = html.substring(0, posEndOfPoem);
		
		// Convert all HTML tags to spaces		
		html = html.replaceAll("<[^>]*>", " ");
		
		// Remove all line breaks.
		html = html.replace("\n", "").replace("\r", "");
		
		// Remove all non-alpha characters.
		html = html.replaceAll("[^A-Za-z0-9]", " ");
		
		// Replace all multiple spaces with a single space.
		html = html.trim().replaceAll(" +", " ");
		
		// Convert text to lower case.
		text = html.toLowerCase();
		
		return text;
	
	}
	
	
	public String[] convertText2Array(String text) {
		
		String[] array = null;
		array = text.split(" ");
		Arrays.sort(array);
		
		return array;
	}	
	
}
