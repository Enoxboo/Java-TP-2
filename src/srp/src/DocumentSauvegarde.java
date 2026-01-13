package srp.src;

import java.io.FileWriter;
import java.io.IOException;

public class DocumentSauvegarde {
    public void sauvegarderFacture(Facture facture) {
        try (FileWriter writer = new FileWriter("factures.txt", true)) {
            writer.write("FACTURE | " + facture.getDate()
                    + " | Client=" + facture.getClientName()
                    + " | HT=" + facture.getMontantHT()
                    + " | TVA=" + facture.getTva()
                    + " | TTC=" + facture.getTotalTTC() + "\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde de la facture : " + e.getMessage());
        }
    }

    public void sauvegarderDevis(Devis devis) {
        try (FileWriter writer = new FileWriter("devis.txt", true)) {
            writer.write("DEVIS | " + devis.getDate()
                    + " | HT=" + devis.getMontantHT()
                    + " | TVA=" + devis.getTva()
                    + " | TTC=" + devis.getTotalTTC()
                    + " | validite=" + devis.getValiditeJours() + "j\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du devis : " + e.getMessage());
        }
    }
}
