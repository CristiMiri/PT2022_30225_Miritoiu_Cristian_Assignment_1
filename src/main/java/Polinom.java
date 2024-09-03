import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class represents a Polynomial object;
 * v is used to store an undefined number of monomials;
 * grad is used to represent degree of a polynomial;
 */
public class Polinom {
    private List<Monom> v = new ArrayList<>();
    private int grad;

    /**
     * @return private v attribute.
     */
    public List<Monom> getV() {
        return v;
    }

    /**
     * @param v set private attribute of object.
     */
    public void setV(List<Monom> v) {
        this.v = v;
    }

    /**
     * @return private grad attribute.
     */
    public int getGrad() {
        return grad;
    }

    /**
     * @param grad set private attribute of object.
     */
    public void setGrad(int grad) {
        this.grad = grad;
    }

    /**
     * Method used to display a polynomial.
     * If coefficient of a monomial is zero it is not included.
     * If the String starts with + the + is removed.
     * If String is empty return zero as result.
     *
     * @return variable res for polynomial representation.
     */
    @Override
    public String toString() {
        String res = "";
        for (Monom i : v) {
            if (i.getCoeficient() == 0)
                continue;
            res = res + i;
        }
        if (res.isEmpty())
            res = "0";
        if (res.charAt(0) == '+')
            res = res.substring(1);
        return res;
    }

    /**
     * If the  String is valid it split in between +/- and check 3 cases:if it doesn't contain X,
     * if it doesn't contain ^(X at power 1) and if it has ^ and for each case variables coeficient and exponent
     * are modified.After the if cases in the list is added a new monomial with the respective variables.
     * This process is repeated for each split of the monoame String.At the end is it called the method sentinel.
     *
     * @param monoame String used in the construction of the polynomial.
     * @return new Polynomial generated from the parameter string.
     * Also, check the {@link #sentinel() Sentinel} method for more movement details
     */
    public static Polinom generate(String monoame) {
        if (!Polinom.valid_p(monoame))
            return null;
        Polinom q = new Polinom();
        q.grad = 1;
        float coeficient = 1;
        int exponent = 0;
        String[] m = monoame.split("((?=[+-]))");
        for (String i : m) {
            if (!i.contains("X")) {
                coeficient = Float.parseFloat(i);
            } else if (!(i.contains("^"))) {
                exponent = 1;
                i = i.replace("X", "");
                if (i.matches(".*\\d+")) {
                    coeficient = Float.parseFloat(i);
                } else {
                    if (i.contains("-"))
                        coeficient = -1;
                }
            } else if (
                    i.contains("^")) {
                String[] z = i.split("X\\^");
                if (z[0].matches(".*\\d+")) {
                    coeficient = Float.parseFloat(z[0]);
                } else {
                    if (i.contains("-"))
                        coeficient = -1;
                }
                exponent = Integer.parseInt(z[1]);
            }
            if (exponent > q.grad)
                q.grad = exponent;
            q.v.add(new Monom(exponent, coeficient));
            coeficient = 1;
            exponent = 0;
        }
        q.sentinel();
        return q;
    }

    /**
     * Method to check if a string matches the standard polynomial notation.
     *
     * @param polynomial String representing the polynomial.
     * @return boolean true if it matches or false if it doesn't.
     */
    public static boolean valid_p(String polynomial) {
        Pattern pattern = Pattern.compile("((\\+|-)?(\\d*.\\d*X?|\\d+)(\\^?\\d+)?)+");
        Matcher m = pattern.matcher(polynomial);
        if (m.matches())
            return true;
        else {
            VIEW.Dialog_error("Polinom Invalid");
            return false;
        }
    }

    /**
     * Method to add sentinel elements in monomial list.
     * Sorting descending + simplify to reduce the elements.
     * After if not at the last element if the exponents of consecutive monomials are not consecutive add,
     * between then elements having coefficient zero.
     * If at the end the exponent isn't zero we add new sentinel elements until we have exponent zero.
     */
    public void sentinel() {
        Collections.sort(v);
        this.simplify();
        int i = 0;
        while (v.get(v.size() - 1) != v.get(i)) {
            int e = v.get(i).getExponent();
            {
                if (e != v.get((i + 1)).getExponent() + 1) {
                    v.add(i + 1, new Monom(e - 1, 0));
                }
            }
            i++;
        }
        while (v.get(v.size() - 1).getExponent() != 0)
            v.add(new Monom(v.get(v.size() - 1).getExponent() - 1, 0));
        this.grad = v.get(0).getExponent();
    }

    /**
     * Method used to simplify a polynomial.
     * If monomials with the same exponent are found they are added together and the second monomial is eliminated.
     * j-- => because after an element is removed we don't want to skip the element after it.
     */
    public void simplify() {
        for (int i = 0; i < v.size(); i++) {
            int e = v.get(i).getExponent();
            Monom aux = v.get(i);
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(j).getExponent() == e) {
                    aux.setCoeficient(aux.getCoeficient() + v.get(j).getCoeficient());
                    v.remove(j);
                    j--;
                }
            }
        }
        if (v.isEmpty())
            v.add(new Monom(0, 0));
    }
}