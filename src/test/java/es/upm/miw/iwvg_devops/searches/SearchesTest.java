package es.upm.miw.iwvg_devops.searches;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SearchesTest {

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Óscar","Ana","Óscar","Antonio","Paula"),new Searches()
                .findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(List.of(-0.2,-0.5),new Searches()
                .findDecimalFractionByNegativeSignFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionDivisionByUserId() {
        assertEquals(Optional.of(new Fraction(-48,60)),new Searches()
                .findFractionDivisionByUserId("3"));
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernández","Blanco","López","Blanco","Torres"),new Searches()
                .findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }
}