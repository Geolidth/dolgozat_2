//Csajbók-Reményi László SZOFT I/2/E 2023.05.23. Dolgozat_2
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
        boolean actual=this.dolg.checkInput("3", null);   //helyesen megadott érték
        assertTrue(actual);
    }

    @Test
    public void testCheckInput2(){
        boolean actual=this.dolg.checkInput("5.4", null);     //helyesen megadott érték
        assertTrue(actual);
    }

    @Test
    public void testCheckInput3(){
        boolean actual=this.dolg.checkInput("0.0", null);   //0 nem lehetséges oldalhossz
        assertFalse(actual);
    }

    @Test
    public void testCheckInput4(){
        boolean actual=this.dolg.checkInput("a", null);     //karakter nem lehet oldalhossz
        assertFalse(actual);
    }
}
