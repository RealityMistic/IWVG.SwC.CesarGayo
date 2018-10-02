package es.upm.miw.iwvg.forge.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {
    private Fraction fraction;
    private Fraction propiaFraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4, 2);
        this.propiaFraction = new Fraction(2, 4);
    }

    @Test
    void testDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testNumerator() {
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testDenominator() {
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testIsEquivalent() {
        Fraction fractionA = new Fraction(this.fraction.getNumerator() * 3, this.fraction.getDenominator() * 3);
        assertTrue(this.fraction.isEquivalent(fractionA));
        Fraction fractionB = new Fraction(this.fraction.getNumerator() * 2, this.fraction.getDenominator() * 3);
        assertFalse(this.fraction.isEquivalent(fractionB));
    }

    @Test
    void testIsPropia() {
        assertTrue(propiaFraction.isPropia());
        assertFalse(fraction.isPropia());
    }

    @Test
    void testIsImpropia() {
        assertTrue(fraction.isImpropia());
        assertFalse(propiaFraction.isImpropia());
    }
}