import Bank.AdvancedBank;
import Bank.Conturi.Cont;
import Sarcini.Sarcina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Sarcina sarcina = new Sarcina();

        List<AdvancedBank> banks = new ArrayList<>(List.of(
                new AdvancedBank("Chisinau", "458956", new Cont(500.8, "12.12.2022", "LEI"), 3, "Bank1"),
                new AdvancedBank("Chisinau", "558956", new Cont(501.8, "12.12.2022", "EUR"), 4, "Bank2"),
                new AdvancedBank("Chisinau", "458956", new Cont(503.8, "12.12.2022", "LEI"), 5, "Bank3"),
                new AdvancedBank("Chisinau", "458956", new Cont(500.8, "12.12.2022", "LEI"), 6, "Bank4"),
                new AdvancedBank("Chisinau", "558956", new Cont(500.8, "12.12.2022", "LEI"), 7, "Bank5"),
                new AdvancedBank("Chisinau", "458956", new Cont(902.8, "12.12.2022", "EUR"), 8, "Bank6"),
                new AdvancedBank("Chisinau", "558956", new Cont(500.8, "12.12.2022", "LEI"), 9, "Bank7"),
                new AdvancedBank("Chisinau", "558956", new Cont(510.8, "12.12.2022", "LEI"), 10, "Bank8"),
                new AdvancedBank("Chisinau", "558956", new Cont(500.8, "12.12.2022", "EUR"), 3, "Bank9"),
                new AdvancedBank("Chisinau", "458956", new Cont(600.8, "12.12.2022", "LEI"), 2, "Bank10")
        ));


        getMeniu();
        System.out.print("\nIntroduceti tasta: ");
        int nrSarcina;
        do {
            nrSarcina = Integer.parseInt(input.readLine());
            System.out.println();
            switch (nrSarcina) {
                case 1 -> {
                    System.out.println("Lista nr. de telefon ce incepe cu 45\n");
                    sarcina.getSarcina1(banks);
                }
                case 2 -> {
                    System.out.println("Datele contului cu  suma max\n");
                    sarcina.getSarcina2(banks);
                }
                case 3 -> {
                    System.out.println("Nr. si datele bancilor cu nr. de etaje de la tastatura\n");
                    System.out.print("Introduceti nr. etajului dorit: ");
                    sarcina.getSarcina3(banks, Integer.parseInt(input.readLine()));
                }
                case 4 -> {
                    System.out.println("Importa lista de conturi\n");
                    sarcina.getSarcina4(banks);
                }
                case 5 -> {
                    System.out.println("Exporta lista bancilor cu conturi in lei\n");
                    sarcina.getSarcina5(banks);
                }
                case 0 -> System.out.println("La revedere!");
                
                default -> System.out.println("Eroare de introducere!");
            }
        } while(nrSarcina != 0);
    }

    public static void getMeniu() {
        System.out.println("0 - Iesire");
        System.out.println("1 - Lista nr. de telefon ce incepe cu 45");
        System.out.println("2 - Datele contului cu  suma max");
        System.out.println("3 - Nr. si datele bancilor cu nr. de etaje de la tastatura");
        System.out.println("4 - Importa lista de conturi");
        System.out.println("5 - Exporta  lista bancilor cu conturi in lei");
    }
}
