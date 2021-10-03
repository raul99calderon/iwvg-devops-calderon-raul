package searches;

import es.upm.miw.iwvg_devops.searches.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    void TestDecimal() {
        assertEquals(-0.12d,new Fraction(-9,75).decimal());
        assertEquals(0,new Fraction(0,8768768).decimal());
    }
}
