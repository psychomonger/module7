/***********************************************************************
 * George E. Mitchell
 * 202330 Software Development I CEN-3024C-32552
 * Module 7 | Testing Assignment
 * 
 * This JUnit test suite automates the various application unit tests.
 * 
 * @author George E. Mitchell
 * @since 6/24/2023
***********************************************************************/
package application;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ 
		ConvertText2ArrayTest.class, 
		ReadFileAsStringTest.class 
})


public class AllTests {}
