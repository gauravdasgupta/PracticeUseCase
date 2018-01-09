/**
 * 
 */
package org.abccorp.java.test;

import org.abccorp.java.dao.ABCCorpSampleInput;
import org.abccorp.java.utility.FileHandlingUtility;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gaurav_Dasgupta
 *
 */
public class FileHandlingUtilityTest {

	FileHandlingUtility<Object> fileHandler;
	List<ABCCorpSampleInput> testInput;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fileHandler = new FileHandlingUtility<>();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void readCSVTest() {
		testInput=fileHandler.readCSV();
		
		testInput.forEach(input -> System.out.println(input.getAmount()));
		assertNotNull(testInput);
		//fail("Not yet implemented");
	}

}
