import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final VIEW v;
    private final Model m;

    public Controller(VIEW v, Model m) {
        super();
        this.v = v;
        this.m = m;
        this.v.derivate(new Derivative());
        this.v.Integrate(new Integrate());
        this.v.Addition(new Addition());
        this.v.Substaction(new Subtraction());
        this.v.Multiplication(new Multiplication());
        this.v.Division(new Division());
    }

    class Derivative implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, res;
            p1 = Polinom.generate(v.getFirst_P());
            res = Model.derivare(p1);
            if (res != null)
                v.Dialog_Result(res.toString());
        }
    }

    class Integrate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, res;
            p1 = Polinom.generate(v.getFirst_P());
            res = Model.integrare(p1);
            if (res != null)
                v.Dialog_Result(res.toString());
        }
    }

    class Addition implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, p2, res;
            p1 = Polinom.generate(v.getFirst_P());
            p2 = Polinom.generate(v.getSeconf_P());
            res = Model.adunare(p1, p2);
            if (res != null)
                v.Dialog_Result(res.toString());
        }
    }

    class Subtraction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, p2, res;
            p1 = Polinom.generate(v.getFirst_P());
            p2 = Polinom.generate(v.getSeconf_P());
            res = Model.scadere(p1, p2);
            if (res != null)
                v.Dialog_Result(res.toString());
        }
    }

    class Multiplication implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, p2, res;
            p1 = Polinom.generate(v.getFirst_P());
            p2 = Polinom.generate(v.getSeconf_P());
            res = Model.inmultire(p1, p2);
            if (res != null)
                v.Dialog_Result(res.toString());
        }
    }

    class Division implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Polinom p1, p2, rest;
            p1 = Polinom.generate(v.getFirst_P());
            p2 = Polinom.generate(v.getSeconf_P());
            rest = Model.impartire(p1, p2);
            if (rest != null)
                v.Dialog_Division(rest.toString(), p1.toString());
        }
    }
}
