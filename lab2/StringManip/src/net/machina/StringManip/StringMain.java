package net.machina.StringManip;

public class StringMain {
    public static void main(String[] args) {
        String[] tab1 = new String[4];
        tab1[0] = "Józek";
        tab1[1] = "Wiesiek";
        tab1[2] = "Marian";
        tab1[3] = "Adam";

        String[] tab2 = {"Maryśka", "Celina", "Marian", "Zośka" };

        for(int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i].compareTo(tab2[i]));
        }

        String zdanie = "Dzisiaj była ładna pogoda była.";
        System.out.println(zdanie.indexOf("była"));
        System.out.println(zdanie.lastIndexOf("była"));

        String[] urls = {
                "http://files.up.krakow.pl/plik1.pdf",
                "ftp://ftp.iks.de/lolz/datum2.jpg",
                "http://wannac.ry/payload/app.exe"
        };

        for(int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].substring(urls[i].lastIndexOf("/") + 1));
        }

        System.out.println("Niepoprawne adresy:");

//      pętla foreach
        for(String url : urls) {
            if(!url.contains("http://")) {
                System.out.println(url);
            }
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Józek ma ").append(39).append(" lat");
        String s = sb.toString();
        System.out.println(s);

        // podmianka w StringBuilderze
        int idx = s.indexOf("39");
        System.out.println(idx);
        sb.delete(idx, idx+2);
        System.out.println(sb); //można tak zrobić
        sb.insert(idx, 49);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("To jest mój string testowy");
        System.out.println(sb2);
        sb2.delete(8, 12);
        System.out.println(sb2);
        sb2.insert(8, "twój ");
        System.out.println(sb2);
    }
}
