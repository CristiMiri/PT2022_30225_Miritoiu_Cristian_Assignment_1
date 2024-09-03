import java.text.DecimalFormat;

/**
 * @author Miritoiu Cristian;
 * Class represent a monomial used for constructing a polynomial;
 * exponent used to represent the exponent/power of a monomial;
 * coeficient used to represent the coefficient of a monomial;
 */
public class Monom implements Comparable<Monom> {
    private int exponent;
    private float coeficient;

    /**
     * @return private attribute exponent/power of monomial;
     */
    public int getExponent() {
        return exponent;
    }

    /**
     * @param exponent int used to set private power of monomial;
     */
    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    /**
     * @return private coefficient of monomial
     */
    public float getCoeficient() {
        return coeficient;
    }

    /**
     * @param coeficient double used to set private attribute coefficient of monomial;
     */
    public void setCoeficient(float coeficient) {
        this.coeficient = coeficient;
    }

    /**
     * Constructor of monom/monomial class
     *
     * @param exponent initialize exponent of monomial
     * @param d        initialize coefficient of monomial
     */
    public Monom(int exponent, float d) {
        super();
        this.exponent = exponent;
        this.coeficient = d;
    }

    /**
     * Method used to display monomial;
     * If coefficient is positive it adds a + at the beginning
     *
     * @return String which represent a monomial;
     */
    @Override
    public String toString() {
        DecimalFormat dfZero = new DecimalFormat("0.0");
        if (this.coeficient >= 0)
            return "+" + dfZero.format(coeficient) + "X^" + exponent;
        else
            return dfZero.format(coeficient) + "X^" + exponent;
    }

    /**
     * Method used for sorting a list of monomials in descending order;
     */
    @Override
    public int compareTo(Monom o) {
        // TODO Auto-generated method stub
        return o.exponent - this.exponent;
    }
}
