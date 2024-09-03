public class Main {

    public static void main(String[] args) {
        VIEW v = new VIEW();
        Model m = new Model();
        new Controller(v, m);
        v.setVisible(true);

    }
}



