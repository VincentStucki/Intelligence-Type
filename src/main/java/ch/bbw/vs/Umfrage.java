package ch.bbw.vs;

public class Umfrage {
    public Umfrage() {

    }

    public double prozent(int pro){
        double sum = Double.valueOf(pro);
        return sum / 50 * 100;
    }
}
