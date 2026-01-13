package lsp.src;

public class PEL implements Compte {
    protected double solde = 100;
    private final double tauxInteret = 0.03;

    @Override
    public double getSolde() {
        return solde;
    }

    public double calculerInterets() {
        return solde * tauxInteret;
    }
}
