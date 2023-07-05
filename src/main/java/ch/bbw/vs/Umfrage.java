package ch.bbw.vs;

import java.util.Scanner;

public class Umfrage {
    public Umfrage() {

    }

    public double prozent(int pro){
        double sum = Double.valueOf(pro);
        return sum / 50 * 100;
    }
    public int fragen(){
        Scanner scanner = new Scanner(System.in);
        boolean kontrolle = true;
        String antwortstr = scanner.nextLine();
        int antwort = Integer.parseInt(antwortstr);
        if (antwort > 10 || antwort < 0) {
            while(kontrolle) {
                System.out.println("Ungültige Eingabe, bitte gebe einen Wert zwischen 0-10");
                antwortstr = scanner.nextLine();
                antwort = Integer.parseInt(antwortstr);
                if(antwort <= 10 && antwort >= 0){
                    kontrolle = false;
                }
            }
        }

        return antwort;
    }
}
