package ocp.src;

public class CalculateurRemise {
    private StrategieRemise strategieRemise;

    public CalculateurRemise(StrategieRemise strategieRemise) {
        this.strategieRemise = strategieRemise;
    }

    public void setStrategieRemise(StrategieRemise strategieRemise) {
        this.strategieRemise = strategieRemise;
    }

    public double calculerTotal(double montant) {
        return strategieRemise.appliquerRemise(montant);
    }
}
