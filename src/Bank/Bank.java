package Bank;

import Bank.Conturi.Cont;

public class Bank {
    private String adresa;
    private String telefon;
    private Cont cont;

    public Bank(String adresa, String telefon, Cont cont) {
        this.adresa = adresa;
        this.telefon = telefon;
        this.cont = cont;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public Cont getCont() {
        return cont;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Date despre banca:\n");

        sb.append(getAdresa()).append(" ")
                .append(getTelefon()).append("\n")
                .append(getCont().toString()).append("\n");

        return sb.toString();
    }
}
