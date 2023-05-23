import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testInput {
    dolgozat dolg ;
    
    @BeforeEach
    public void init(){
        this.dolg = new dolgozat();
    }

    @Test
    public void testCheckInput1(){
        boolean actual=this.dolg.checkInput("3.0", null);
        assertTrue(actual);
    }

    @Test
    public void testCheckInput2(){
        boolean actual=this.dolg.checkInput("0.0", null);
        assertFalse(actual);
    }

    @Test
    public void testCheckInput3(){
        boolean actual=this.dolg.checkInput("a", null);
        assertFalse(actual);
    }
}
