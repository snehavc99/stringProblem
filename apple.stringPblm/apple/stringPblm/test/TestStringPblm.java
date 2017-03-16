package apple.stringPblm.test;


import org.junit.Test;

import apple.stringPblm.main.StringPblm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.Before;
/*
 * @author-Sneha
 */
public class TestStringPblm {
	StringPblm stringObj;

	@Before
	public void setUp(){
		stringObj = new StringPblm();
	}
	
	//testing with valid input for iterate method
	@Test
	   public void testIterateMtd_success() {
		String testData = "This is my test data";
		char charData='s';
		String expected ="Thi i my tet data";
		String actualStr=stringObj.iterateMtd(testData, charData);
		assertEquals("Got Expected Result", expected, actualStr);
	   }
	// checking with specialcharacters and the character to remove at the end and start
	@Test
	   public void testIterateMtd_withSpace() {
		String testData = " ello I a$m here";
		char charData='e';
		String expected =" llo I a$m hr";
		String actualStr=stringObj.iterateMtd(testData, charData);
		assertEquals("Got Expected Result", expected, actualStr);
	   }
	
	//testing with wrong expected result
	@Test
	   public void testIterateMtd_fail() {
		String testData = " This is wrong";
		char charData='w';
		String expected =" This is wrong";
		String actualStr=stringObj.iterateMtd(testData, charData);
		assertNotSame("Got Expected Result", expected, actualStr);
	} 
	//testing with valid input for API method
	@Test
	   public void teststringAPI_success() {
		String testData = "My data is right";
		char charData='a';
		String expected = "My dt is right";
		String actualStr=stringObj.stringAPI(testData, charData);
		System.out.println(actualStr);
		assertEquals("Got Expected Result", expected, actualStr);
	   }
	//testing with unexpected result
	@Test
	   public void teststringAPI_fail() {
		String testData = "Caps is not considered the same";
		char charData='c';
		String expected = "aps is not onsidered the same";
		String actualStr=stringObj.stringAPI(testData, charData);
		assertNotSame("Got Expected Result", expected, actualStr);
	   }
	@After
	public void tearDown(){
		stringObj=null;
	}
}
