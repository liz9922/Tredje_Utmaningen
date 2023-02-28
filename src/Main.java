
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList<String> namnlista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Lägg till namn");
            System.out.println("2. Radera namn");
            System.out.println("3. Uppdatera listan");
            System.out.println("4. Ersätt i listan");
            System.out.println("5. Skriv ut hela listan");
            System.out.println("6. Avsluta hela programmet");
            int val = scan.nextInt();

            if (val == 1) {
                System.out.println("Skriv in ett namn att lägga till: ");
                String namn = scan.next();
                namnlista.add(namn);
                System.out.println(namn + " har lagts till i listan.");

            } else if (val == 2) {
                System.out.println("Skriv in namn att ta bort: ");
                String namn = scan.next();
                boolean borttagen = namnlista.remove(namn);
                if (borttagen) {
                    System.out.println(namn + " har tagits bort.");
                } else {
                    System.out.println(namn + " finns inte i listan.");
                }
            } else if (val == 3) {
                System.out.println("Listan inehåller dessa namnen: ");
                for (String namn : namnlista) {
                    System.out.println(namn);
                }
            } else if (val == 4) {
                System.out.println("Skriv in index för namnet att ersätta: ");
                int index = scan.nextInt();
                System.out.println("Skriv in ett nytt namn: ");
                String nyttNamn = scan.next();
                namnlista.set(index, nyttNamn);
                System.out.println("Namnet har ersatts.");
            } else if (val == 5) {
                System.out.println("Listan inehåller dessa namnen: ");
                for (String namn : namnlista) {
                    System.out.println(namn);
                }
            }
            else if (val == 6) {
                System.out.println("Programmet avslutas.");
                scan.close();

                break;
            }
            else {
                System.out.println("Felaktig inmatning, skriv ett nummer från 1-6.");
            }
        }
    }
}