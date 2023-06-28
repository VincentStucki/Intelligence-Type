package ch.bbw.vs;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.DoublePredicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int SummeLing = 0;
        String ling[] = {"- Können Sie komplexe Ideen in Worte fassen und klar kommunizieren?",
                "- Genießen Sie das Lesen von Büchern und das Verfassen von Texten? ",
                "- Sind Sie gut darin, verschiedene Schreibstile anzupassen, z. B. formell oder informell?",
                "- Haben Sie Spaß daran, Gedichte oder Geschichten zu schreiben?",
                "- Können Sie sich leicht an sprachliche Regeln und Grammatik halten?"};

        int SummeMathe = 0;
        String mathe[] = {"- Haben Sie eine Vorliebe für logisches Denken und das Lösen von komplexen mathematischen Problemen? ",
                "- Können Sie abstrakte Konzepte verstehen und auf logische Weise darauf zugreifen? ",
                "- Finden Sie Freude daran, Muster und Zusammenhänge in Zahlenreihen oder geometrischen Formen zu erkennen?",
                "- Sind Sie gut darin, Hypothesen aufzustellen und logische Schlussfolgerungen zu ziehen? ",
                "- Sind Sie ein guter Problemlöser und können komplexe Probleme in kleinere Schritte zerlegen?"};

        int SummeRaum = 0;
        String raum[] = {"- Können Sie sich leicht räumlich orientieren und Karten oder Wegbeschreibungen lesen?",
                "- Haben Sie eine Vorliebe für visuelle Gestaltung und Ästhetik?  ",
                "- Sind Sie gut darin, Objekte im Raum zu arrangieren oder zu visualisieren? ",
                "- Können Sie sich lebhaft an Bilder oder Szenen erinnern? ",
                "- Finden Sie Freude daran, 3D-Puzzles zu lösen oder Modelle zu bauen?"};

        int SummeKoerper = 0;
        String koeper[] = {"- Haben Sie eine gute Körperbeherrschung und können feinmotorische Aufgaben gut ausführen? ",
                "- Sind Sie gut darin, Bewegungen zu koordinieren und neue körperliche Fähigkeiten zu erlernen?",
                "- Fühlen Sie sich wohl bei körperlicher Aktivität und Sportarten? ",
                "- Können Sie Bewegungen oder Aktionen anderer Menschen gut imitieren? ",
                "- Sind Sie gut darin, durch Handlungen oder körperlichen Ausdruck Gefühle oder Ideen zu vermitteln?"};

        int SummeMusik = 0;
        String musik[] = {"- Haben Sie ein gutes Gehör für Rhythmus, Melodie und Tonhöhe?",
                "- Können Sie verschiedene Musikinstrumente spielen oder haben Sie ein starkes Interesse an Musiktheorie?",
                "- Können Sie musikalische Strukturen oder Harmonien intuitiv erkennen? ",
                "- Genießen Sie das Komponieren oder Improvisieren von Musik? ",
                "- Haben Sie eine gute Fähigkeit, Stimmungen oder Emotionen in Musik zu erkennen und auszudrücken?"};

        int SummeZwischen = 0;
        String zwischen[] = {"- Sind Sie gut darin, Konflikte zu erkennen und zu lösen? ",
                "- Können Sie sich gut in andere Menschen hineinversetzen und deren Perspektiven verstehen?",
                "- Sind Sie ein guter Zuhörer und können Sie effektiv kommunizieren? ",
                "- Haben Sie die Fähigkeit, Beziehungen aufzubauen und zu pflegen?",
                "- Können Sie in Gruppen gut zusammenarbeiten und Menschen motivieren? "};

        int SummeIntra = 0;
        String intra[] = {"- Verbringen Sie gerne Zeit allein, um über Ihre eigenen Gedanken und Gefühle nachzudenken? ",
                "- Können Sie Ihre eigenen Stärken und Schwächen gut einschätzen?",
                "- Haben Sie ein gutes Verständnis für Ihre eigenen Ziele und Werte? ",
                "- Sind Sie in der Lage, Ihre eigenen Emotionen gut zu regulieren? ",
                "- Können Sie Entscheidungen treffen, die im Einklang mit Ihrem eigenen Selbst stehen?"};

        int SummeNatur = 0;
        String natur[] = {"- Sind Sie fasziniert von der natürlichen Umwelt und haben Sie ein Interesse an Tieren und Pflanzen?",
                "- Können Sie verschiedene Arten oder Eigenschaften von Tieren und Pflanzen leicht erkennen?",
                "- Haben Sie ein gutes Verständnis für ökologische Zusammenhänge und Nachhaltigkeit?",
                "- Genießen Sie Outdoor-Aktivitäten wie Wandern, Gartenarbeit oder Camping? ",
                "- Haben Sie ein Auge für Details in der Natur und können Muster oder Veränderungen leicht erkennen? "};

        String ergebnis[] = {"Herzlichen Glückwunsch! Du bist ein wahres Sprachgenie!\n Mit deiner Gabe, komplexe Ideen in präzise Worte zu fassen, beeindruckst du jeden um dich herum. \nDu kannst mit Leichtigkeit verschiedene Schreibstile anpassen und beherrschst die Regeln und Nuancen der Sprache mühelos. \nDein Talent, Gedichte und Geschichten zu schreiben, ist bewundernswert. Du bist ein wahrer Meister der Kommunikation!",
        "Herzlichen Glückwunsch! Du bist ein brillanter Denker mit einer außergewöhnlichen logisch-mathematischen Intelligenz!\n Du betrachtest die Welt durch die Linse der Logik und findest Lösungen für komplexe Probleme mit Leichtigkeit. Zahlen und Muster sind deine Spielzeuge, und du hast ein bemerkenswertes Talent, komplexe mathematische Konzepte zu erfassen. Dein scharfer Verstand und deine analytischen Fähigkeiten machen dich zu einem wahren Denkgenie!",
        "Herzlichen Glückwunsch! Du bist ein wahrer Künstler der visuellen Vorstellungskraft!\n Mit deiner visuell-räumlichen Intelligenz kannst du Bilder und Szenen in deinem Geist zum Leben erwecken. Du hast ein Auge für Details und Ästhetik und kannst komplexe Zusammenhänge in Form von Bildern und Diagrammen veranschaulichen. Deine Fähigkeit, die Welt auf visuelle Weise zu interpretieren, ist beeindruckend!",
        "Herzlichen Glückwunsch! Du bist ein Meister der Körperbeherrschung und Bewegung!\n Mit deiner körperlich-kinästhetischen Intelligenz kannst du dich auf elegante und geschickte Weise ausdrücken. Ob durch Tanz, Sport oder Handwerkskunst, du bist in der Lage, deinen Körper als Instrument zu nutzen und deine Fähigkeiten zu perfektionieren. Deine Geschicklichkeit und Koordination sind beeindruckend!",
        "Herzlichen Glückwunsch! Du bist ein musikalisches Wunderkind!\n Mit deinem außergewöhnlichen Gehör und deinem Sinn für Rhythmus und Melodie kannst du die Emotionen der Menschen berühren und ihre Seelen zum Schwingen bringen. Du verstehst die Sprache der Musik und kannst sie mit Leidenschaft und Ausdruck interpretieren. Deine Kreativität und dein Talent sind ein Geschenk für die Welt!",
        "Herzlichen Glückwunsch! Du bist ein wahrer Menschenkenner!\n Mit deiner interpersonalen Intelligenz bist du in der Lage, dich in andere hineinzuversetzen und ihre Gefühle und Bedürfnisse zu verstehen. Du bist einfühlsam, kommunikativ und ein wahrer Teamplayer. Menschen fühlen sich von dir verstanden und geschätzt. Deine zwischenmenschlichen Fähigkeiten sind bewundernswert!",
        "Herzlichen Glückwunsch! Du hast eine aussergewöhnliche innere Weisheit und Selbstreflexion!\n Mit deiner intrapersonalen Intelligenz bist du in der Lage, dich selbst zu verstehen, deine Stärken und Schwächen anzuerkennen und deine Ziele klar zu definieren. Du hast eine tiefe Verbindung zu deinem Inneren und kannst dein eigenes Wachstum und deine Entwicklung fördern. Dein Selbstbewusstsein und deine Selbsterkenntnis sind inspirierend!",
        "Herzlichen Glückwunsch! Du bist ein Naturtalent, wenn es um das Verständnis der natürlichen Welt geht!\n Mit deiner naturalistischen Intelligenz kannst du die Schönheit und Komplexität der Natur erkennen und schätzen. Du hast ein Auge für Details und Zusammenhänge in der natürlichen Umgebung. Deine Verbindung zur Natur ist tiefgreifend und inspirierend! "};

            Scanner scanner = new Scanner(System.in);
        System.out.println("Für jede Frage wählen Sie bitte eine Bewertung von 0-10 aus, wobei 0 für \"trifft gar nicht zu\" steht und 10 für \"trifft sehr stark zu\". Bewerten Sie jede Frage entsprechend Ihrem persönlichen Empfinden. Beantworten Sie dann alle Fragen und addieren Sie die Punkte für jede Intelligenztyp-Kategorie. Der Intelligenztyp mit den meisten Punkten ist dann der entsprechende Typ.   \n" +
                "   \n" +
                " Pro Frage auswählen zwischen 0-10 bzw. Trifft gar nicht zu, trifft eher nicht zu, trifft weder zu noch nicht, trifft eher zu und trifft sehr stark zu. Dann alle Punkte der 5 Fragen beantworten und welcher Intelligenz Typ am meisten Punkte hat, ist man.  ");
        System.out.println("1. Linguistische Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(ling[i]);
            String linguistikstr = scanner.nextLine();
            int linguistik = Integer.parseInt(linguistikstr);
            SummeLing = SummeLing + linguistik;

        }
        System.out.println("2. Logisch-mathematische Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(mathe[i]);
            String mathematikstr = scanner.nextLine();
            int mathematik = Integer.parseInt(mathematikstr);
            SummeMathe = SummeMathe + mathematik;
        }
        System.out.println("3. Räumliche Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(raum[i]);
            String raumlichstr = scanner.nextLine();
            int raumlich = Integer.parseInt(raumlichstr);
            SummeRaum = SummeRaum + raumlich;
        }
        System.out.println("4. Körperlich-kinästhetische Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(koeper[i]);
            String koerperlichstr = scanner.nextLine();
            int koerperlich = Integer.parseInt(koerperlichstr);
            SummeKoerper = SummeKoerper + koerperlich;
        }
        System.out.println("5. Musikalische Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(musik[i]);
            String musikalischstr = scanner.nextLine();
            int musikalisch = Integer.parseInt(musikalischstr);
            SummeMusik = SummeMusik + musikalisch;
        }
        System.out.println("6. Zwischenmenschliche Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(zwischen[i]);
            String zwischenmenschstr = scanner.nextLine();
            int zwischenmensch = Integer.parseInt(zwischenmenschstr);
            SummeZwischen = SummeZwischen + zwischenmensch;
        }
        System.out.println("7. Intrapersonale Intelligenz: ");
        for(int i=0; i<5; i++){
            System.out.println(intra[i]);
            String intrapersstr = scanner.nextLine();
            int intrapers = Integer.parseInt(intrapersstr);
            SummeIntra = SummeIntra + intrapers;
        }
        System.out.println("8. Naturalistische Intelligenz:");
        for(int i=0; i<5; i++){
            System.out.println(natur[i]);
            String naturalstr = scanner.nextLine();
            int natural = Integer.parseInt(naturalstr);
            SummeNatur = SummeNatur + natural;
        }
        Umfrage umfrage = new Umfrage();
        double prozLing = umfrage.prozent(SummeLing);
        double prozMathe = umfrage.prozent(SummeMathe);
        double prozRaum = umfrage.prozent(SummeRaum);
        double prozKoerper = umfrage.prozent(SummeKoerper);
        double prozMusik = umfrage.prozent(SummeMusik);
        double prozZwischen = umfrage.prozent(SummeZwischen);
        double prozIntra = umfrage.prozent(SummeIntra);
        double prozNatur = umfrage.prozent(SummeNatur);

       //  double endLing = Double.valueOf(SummeLing);
        // double prozLing = endLing / 50 * 100;
        Map<String, Double> variableMap = new HashMap<>();
        variableMap.put("Linguistische Intelligenz", prozLing);
        variableMap.put("Logisch-mathematische Intelligenz", prozMathe);
        variableMap.put("Räumliche Intelligenz", prozRaum);
        variableMap.put("Körperlich-kinästhetische Intelligenz", prozKoerper);
        variableMap.put("Musikalische Intelligenz", prozMusik);
        variableMap.put("Zwischenmenschliche Intelligenz", prozZwischen);
        variableMap.put("Intrapersonale Intelligenz", prozIntra);
        variableMap.put("Naturalistische Intelligenz", prozNatur);



        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(variableMap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));





        String end = "_";
        int rank = 1;
        double temp = 0;
        for (Map.Entry<String, Double> entry : sortedList) {
            if(entry.getValue() == prozLing){
                end = ergebnis[0];
            }
            else if(entry.getValue() == prozMathe){
                end = ergebnis[1];
            }
            else if(entry.getValue() == prozRaum){
                end = ergebnis[2];
            }
            else if(entry.getValue() == prozKoerper){
                end = ergebnis[3];
            }
            else if(entry.getValue() == prozMusik){
                end = ergebnis[4];
            }
            else if(entry.getValue() == prozZwischen){
                end = ergebnis[5];
            }
            else if(entry.getValue() == prozIntra){
                end = ergebnis[6];
            }
            else if(entry.getValue() == prozNatur){
                end = ergebnis[7];
            }

            if(rank == 1)
            {
                System.out.println(end + "\n");
            }

            if(entry.getValue() == temp){
                rank--;
                System.out.println("Rang " + rank + ": " + entry.getKey() + " - Wert: " + entry.getValue() + "%" + "\n--\n");
                rank++;
            }
            else{
                System.out.println("Rang " + rank + ": " + entry.getKey() + " - Wert: " + entry.getValue() + "%" + "\n--\n");
            }


            temp = entry.getValue();
            rank++;
        }
        System.out.println("Jeder Intelligenztyp ist einzigartig und hat seine eigenen Stärken und Talente. Möge deine außergewöhnliche Intelligenz weiterhin erblühen und die Welt mit deinem einzigartigen Beitrag bereichern!");








    }
}
