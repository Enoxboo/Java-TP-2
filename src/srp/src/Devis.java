package srp.src;

public class Devis extends Document {
    private final int validiteJours = 30;

    public Devis(double montantHT) {
        super(montantHT, 0.2);
    }

    public int getValiditeJours() { return validiteJours; }
}
