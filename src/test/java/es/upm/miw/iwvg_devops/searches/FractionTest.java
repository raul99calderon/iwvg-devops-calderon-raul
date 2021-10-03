package es.upm.miw.iwvg_devops.searches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testDecimal() {
        assertEquals(-0.12d,new Fraction(-9,75).decimal());
        assertEquals(0,new Fraction(0,8768768).decimal());
    }

    @Test
    void testIsProper() {
        assertTrue(new Fraction(1,2).isProper());
        assertFalse(new Fraction(5,5).isProper());
        assertFalse(new Fraction(1,0).isProper());
    }

    @Test
    void testIsNotProper() {
        assertTrue(new Fraction(4,3).isNotProper());
        assertFalse(new Fraction(0,0).isNotProper());
        assertFalse(new Fraction(3,7).isNotProper());
    }

    @Test
    void testIsEquivalent() {
        assertTrue(new Fraction(3,7).isEquivalent(new Fraction(9,21)));
        assertFalse(new Fraction(3,7).isEquivalent(new Fraction(0,1)));
    }

    @Test
    void testAddition() {
        assertEquals(new Fraction(4,4),new Fraction(2,4).addition(new Fraction(2,4)));
        assertEquals(new Fraction(26,12),new Fraction(2,3).addition(new Fraction(6,4)));
    }

    @Test
    void testSubtraction() {
        assertEquals(new Fraction(1,3),new Fraction(2,3).substraction(new Fraction(1,3)));
        assertEquals(new Fraction(0,6),new Fraction(2,3).substraction(new Fraction(4,6)));
    }

    @Test
    void testMultiplicate() {
        assertEquals(new Fraction(21,21),new Fraction(7,3).multiplicate(new Fraction(3,7)));
        assertEquals(new Fraction(-4,35),new Fraction(-1,7).multiplicate(new Fraction(4,5)));
    }

    @Test
    void testDivide() {
        assertEquals(new Fraction(-12,42),new Fraction(4,6).divide(new Fraction(7,-3)));
    }

    @Test
    void testEquals() {
        assertEquals(new Fraction(0, 0), new Fraction(0, 0));
        assertNotEquals(new Fraction(0, 1), new Fraction(1, 0));
    }

    @Test
    void testCompareTo() {
        assertEquals(1,new Fraction(1,0).compareTo(new Fraction(1,1)));
        assertEquals(0,new Fraction(0,0).compareTo(new Fraction(0,0)));
        assertEquals(-1,new Fraction(-1,3).compareTo(new Fraction(4,3)));
    }
}