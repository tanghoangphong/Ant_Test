import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'THOAI' at '12/3/15 5:54 PM' with Gradle 2.9
 *
 * @author THOAI, @date 12/3/15 5:54 PM
 */
public class so_nguyen_toTest4 {
	  private check N;
	  private so_nguyen_to snt;
	  private int number=9;
	    @Before
	    public void setUp() {
	        N = new check();
	        snt.setResult(number);
	    }

	    @Test
	    public void unitTestCase_9() {
	  
	        assertEquals(0, N.kiemtrasonguyento(number));	      
	    }
	    @Test
	    public void unitTestCase_12() {
	  
	        assertEquals(0, N.kiemtrasonguyento(12));	      
	    }
	    @Test
	    public void unitTestCase_13() {
	  
	        assertEquals(1, N.kiemtrasonguyento(13));	      
	    }
	    @Test
	    public void unitTestCase_19() {
	  
	        assertEquals(1, N.kiemtrasonguyento(19));	      
	    }
	    @Test
	    public void unitTestCase_55() {
	  
	        assertEquals(0, N.kiemtrasonguyento(55));	      
	    }
	    @Test
	    public void unitTestCase_99() {
	  
	        assertEquals(0, N.kiemtrasonguyento(99));	      
	    }
	    @Test
	    public void unitTestCase_211() {
	  
	        assertEquals(1, N.kiemtrasonguyento(211));	      
	    }
	    @Test
	    public void IntegrationTest() {
	  
	        assertEquals("True", snt.getResult());	      
	    }
}
