package Bank;

import Bank.Conturi.Cont;

public class AdvancedBank extends Bank {
    private int nrEtaje;
    private String denumire;

    public AdvancedBank(String adresa, String telefon, Cont cont, int nrEtaje, String denumire) {
        super(adresa, telefon, cont);
        this.nrEtaje = nrEtaje;
        this.denumire = denumire;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(getNrEtaje()).append(" etaje ")
                .append(getDenumire()).append("\n");

        return sb.toString();
    }
}
