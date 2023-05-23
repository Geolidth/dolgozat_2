import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCalculate {
    dolgozat dolg ;
    
    @BeforeEach
    public void init(){
        this.dolg = new dolgozat();
    }

    @Test
    public void testClacParalelepipedon1(){
        double actual = this.dolg.clacParalelepipedon(3.0, 3.0, 3.0);
        double expected=27;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void testClacParalelepipedon2(){
        double actual = this.dolg.clacParalelepipedon(10.0, 10.0, 10.0);
        double expected=1000;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void testClacParalelepipedon3(){
        double actual = this.dolg.clacParalelepipedon(1.0, 1.0, 1.0);
        double expected=1;
        assertEquals(expected,actual,0.1);
    }
}
