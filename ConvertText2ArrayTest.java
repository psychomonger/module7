/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 7 | Testing Assignment
 * 
 * This class tests if a text analyzer object is able to
 * convert a space delimited string to an array.
 * 
 * @author George E. Mitchell
 * @since 6/24/2023
***********************************************************************/
package application;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ConvertText2ArrayTest {

	@Test
	void test() {
		
		TextAnalyzer ta = new TextAnalyzer();
		String text = "This is a test for text to array";
		String[] array = null;
		int arrayLength = 0;
		
		array = ta.convertText2Array(text);
		arrayLength = array.length;

		assertEquals(8, arrayLength);
		
	}

}
