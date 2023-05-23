import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test {
    dolgozat dolg ;
    
    @BeforeEach
    public void init(){
        this.dolg = new dolgozat();
    }

    @Test
    public void testClacParalelepipedon(){
        double actual = this.dolg.clacParalelepipedon(3, 3, 3);
        double expected=27;
        assertEquals(expected,actual,0.1);
    }
}
