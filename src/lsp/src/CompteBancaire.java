package lsp.src;

public class CompteBancaire implements CompteRetirable {
    protected double solde = 100;

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
