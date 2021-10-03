package searches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testAddFraction() {
        User user = new User();
        user.addFraction(new Fraction(1,2));
        user.addFraction(new Fraction(3,7));
        user.addFraction(new Fraction(-1,10));

        assertEquals(3, user.getFractions().size());
        assertEquals(10,user.getFractions().get(2).getDenominator());
        assertEquals(3,user.getFractions().get(1).getNumerator());
        assertEquals(0.5d,user.getFractions().get(0).decimal());
    }

    @Test
    void testFullName() {
        User user = new User();
        user.setName("Frodo");
        user.setFamilyName("Bolsón");
        assertEquals("Frodo Bolsón",user.fullName());
    }

    @Test
    void testInitials() {
        User user = new User();
        user.setName("Gandalf");
        assertEquals("G.",user.initials());
    }
}