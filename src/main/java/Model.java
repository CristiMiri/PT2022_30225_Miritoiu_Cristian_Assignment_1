import java.util.Collections;

public class Model {
    public static Polinom adunare(Polinom p1, Polinom p2) {
        if (p1 == null || p2 == null)
            return null;
        int max = Math.max(p1.getGrad(), p2.getGrad());
        int min = Math.min(p1.getGrad(), p2.getGrad());
        Collections.reverse(p1.getV());
        Collections.reverse(p2.getV());
        Polinom res = new Polinom();
        res.setGrad(max);
        for (int i = 0; i <= min; i++) {
            res.getV().add(new Monom(i, p1.getV().get(i).getCoeficient() + p2.getV().get(i).getCoeficient()));
        }
        if (p1.getGrad() > p2.getGrad()) {
            for (int i = min + 1; i < max + 1; i++)
                res.getV().add(new Monom(i, p1.getV().get(i).getCoeficient()));
        } else {
            for (int i = min + 1; i < max + 1; i++)
                res.getV().add(new Monom(i, p2.getV().get(i).getCoeficient()));
        }
        Collections.reverse(p1.getV());
        Collections.reverse(p2.getV());
        Collections.reverse(res.getV());
        res.sentinel();
        return res;
    }

    public static Polinom scadere(Polinom p1, Polinom p2) {
        if (p1 == null || p2 == null)
            return null;
        int max = Math.max(p1.getGrad(), p2.getGrad());
        int min = Math.min(p1.getGrad(), p2.getGrad());
        Collections.reverse(p1.getV());
        Collections.reverse(p2.getV());
        Polinom res = new Polinom();
        res.setGrad(max);
        for (int i = 0; i <= min; i++) {
            res.getV().add(new Monom(i, p1.getV().get(i).getCoeficient() - p2.getV().get(i).getCoeficient()));
        }
        if (p1.getGrad() > p2.getGrad()) {
            for (int i = min + 1; i < max + 1; i++)
                res.getV().add(new Monom(i, p1.getV().get(i).getCoeficient()));
        } else {
            for (int i = min + 1; i < max + 1; i++)
                res.getV().add(new Monom(i, p2.getV().get(i).getCoeficient()));
        }
        Collections.reverse(res.getV());
        Collections.reverse(p1.getV());
        Collections.reverse(p2.getV());
        res.sentinel();
        return res;
    }

    public static Polinom inmultire(Polinom p1, Polinom p2) {
        if (p1 == null || p2 == null)
            return null;
        Polinom res = new Polinom();
        for (Monom i : p1.getV()) {
            for (Monom j : p2.getV()) {
                if ((j.getCoeficient() == 0) || (i.getCoeficient() == 0))
                    continue;
                res.getV().add(new Monom(i.getExponent() + j.getExponent(), i.getCoeficient() * j.getCoeficient()));
            }
        }
        res.sentinel();
        res.setGrad(res.getV().get(0).getExponent());
        return res;
    }

    public static Polinom impartire(Polinom n, Polinom d) {
        if (n == null || d == null)
            return null;
        Polinom cat = new Polinom();
        cat.getV().add(new Monom(0, 0));
        Polinom rest = n;
        while ((rest.getGrad() >= d.getGrad()) && !(rest.getV().isEmpty())) {
            Monom rest_lead = rest.getV().get(0);
            Monom d_lead = d.getV().get(0);
            Monom x = new Monom(rest_lead.getExponent() - d_lead.getExponent(), rest_lead.getCoeficient() / d_lead.getCoeficient());
            Polinom t = new Polinom();
            t.getV().add(x);
            t.sentinel();
            t.setGrad(t.getV().get(0).getExponent());
            cat = Model.adunare(cat, t);
            Polinom aux = Model.inmultire(t, d);
            rest = Model.scadere(rest, aux);
            rest.getV().remove(0);
            rest.setGrad(rest.getGrad() - 1);
        }
        n.setV(rest.getV());
        return cat;
    }

    public static Polinom derivare(Polinom p) {
        if (p == null)
            return null;
        Polinom res = new Polinom();
        for (Monom i : p.getV()) {
            if (i.getExponent() == 0)
                i.setCoeficient(0);
            res.getV().add(new Monom(i.getExponent() - 1, i.getCoeficient() * i.getExponent()));
        }
        return res;
    }

    public static Polinom integrare(Polinom p) {
        if (p == null)
            return null;
        Polinom res = new Polinom();
        for (Monom i : p.getV()) {
            res.getV().add(new Monom(i.getExponent() + 1, i.getCoeficient() / (i.getExponent() + 1)));
        }
        res.sentinel();
        return res;
    }

}
