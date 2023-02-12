package Bank.Conturi;

public class Account {
    private double sold;
    private String dataUltimeiTranzactii;
    private String moneda;

    public Account(double sold, String dataUltimeiTranzactii, String moneda) {
        this.sold = sold;
        this.dataUltimeiTranzactii = dataUltimeiTranzactii;
        this.moneda = moneda;
    }

    public double getSold() {
        return sold;
    }

    public String getDataUltimeiTranzactii() {
        return dataUltimeiTranzactii;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cont: ");

        sb.append(getSold()).append(" ")
                .append(getDataUltimeiTranzactii()).append(" ")
                .append(getMoneda());

        return sb.toString();
    }
}
