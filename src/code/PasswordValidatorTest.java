package code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	public class PasswordValidatorTest {

	    @Test
	    // <5
	    public void testLength1() {
	        assertFalse(PasswordValidator.validate("abc1"));
	    }
	    @Test
	     // 5-9
	        public void testLength2() {
	        assertTrue(PasswordValidator.validate("abcd1"));
	        assertTrue(PasswordValidator.validate("abcd123"));
	        assertTrue(PasswordValidator.validate("1234567ab"));
	        }
	    
	    @Test
	    // >9
	        public void testLength3() {
	        assertFalse(PasswordValidator.validate("abcde12345"));
	    }
	    
	    @Test
	    // letter& number
	    public void testCharacters1() {	        
	        assertTrue(PasswordValidator.validate("abc123"));
	    }
	    @Test
	     // other
	        public void testCharacters2() {	       
	        assertFalse(PasswordValidator.validate("abc$123"));
	        assertFalse(PasswordValidator.validate("abc 123"));
	    }

	    @Test
	     //  letter& number
	    public void testComposition1() {	       
	        assertTrue(PasswordValidator.validate("a1b2c3d"));
	    }
	    
	    @Test 
	        // letter only
	        public void testComposition2() {
	        assertFalse(PasswordValidator.validate("abcdefg"));
	        }
	    @Test
	      // number only
	        public void testComposition3() {	      
	        assertFalse(PasswordValidator.validate("1234567"));
	    }
}
