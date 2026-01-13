package srp.src;

public class Facture extends Document {
    private final String clientName;

    public Facture(double montantHT, String clientName) {
        super(montantHT, 0.2);
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }
}
