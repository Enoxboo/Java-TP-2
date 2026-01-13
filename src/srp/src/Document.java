package srp.src;

import java.time.LocalDate;

public class Document {
    private final LocalDate date;
    private final double montantHT;
    private final double tva;
    private final double totalTTC;

    public Document(double montantHT, double tauxTVA) {
        this.date = LocalDate.now();
        this.montantHT = montantHT;
        this.tva = montantHT * tauxTVA;
        this.totalTTC = montantHT + tva;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public double getTva() {
        return tva;
    }

    public double getTotalTTC() {
        return totalTTC;
    }
}
