package Sarcini;

import Bank.AdvancedBank;
import Bank.Conturi.Cont;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Sarcina {
    public void getSarcina1 (List<AdvancedBank> banks) {
        List<AdvancedBank> banksTel = banks.stream()
                .filter(banca -> banca.getTelefon().startsWith("45"))
                .toList();

        if (banksTel.isEmpty()) {
            System.err.println("Nu s-au gasit astfel de banci!");
        } else {
            banksTel.forEach(System.out::println);
        }
    }

    public void getSarcina2 (List<AdvancedBank> banks) {
        banks.stream()
                .max(Comparator.comparing(banca -> banca.getCont().getSold()))
                .ifPresent(System.out::println);
    }

    public void getSarcina3 (List<AdvancedBank> banks, int nrEtaj) {
        List<AdvancedBank> banksEtaj = banks.stream()
                .filter(banca -> banca.getNrEtaje() == nrEtaj)
                .toList();

        if (banksEtaj.isEmpty()) {
            System.err.println("Nu s-au gasit banci cu nr. de etaje respective!");
        } else {
            banksEtaj.forEach(System.out::println);
        }
    }

    public void getSarcina4 (List<AdvancedBank> banks) {
        try (BufferedReader br = new BufferedReader(new FileReader("banciImport.txt"))) {
            String currentLine;

            while((currentLine = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(currentLine, ",");

                while (st.hasMoreTokens()) {
                    banks.add(new AdvancedBank(st.nextToken(), st.nextToken(),
                            new Cont(Double.parseDouble(st.nextToken()), st.nextToken(), st.nextToken()),
                            Integer.parseInt(st.nextToken()), st.nextToken()));
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Lista tuturor bancior:");
        banks.forEach(System.out::println);
    }

    public void getSarcina5 (List<AdvancedBank> banks) {
        List<AdvancedBank> banksLei = banks.stream()
                .filter(banca -> banca.getCont().getMoneda().equals("LEI"))
                .toList();

        try (FileWriter fw = new FileWriter("banciExport.txt", false)) {
            for (AdvancedBank bank: banksLei) {
                fw.write(bank.toString() + "\n");
            }
            System.out.println("Introducerea a fost realizata cu succes!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
