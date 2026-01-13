package srp.src;

public class FacturationService {
    private final DocumentAfficheur afficheur;
    private final DocumentSauvegarde sauvegarde;

    public FacturationService() {
        this.afficheur = new DocumentAfficheur();
        this.sauvegarde = new DocumentSauvegarde();
    }

    public void creerFacture(double montantHT, String clientName) {
        Facture facture = new Facture(montantHT, clientName);
        afficheur.afficherFacture(facture);
        sauvegarde.sauvegarderFacture(facture);
    }

    public void creerDevis(double montantHT) {
        Devis devis = new Devis(montantHT);
        afficheur.afficherDevis(devis);
        sauvegarde.sauvegarderDevis(devis);
    }
}
