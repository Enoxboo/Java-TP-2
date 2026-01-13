package ocp.src;

public class EtudiantRemise implements StrategieRemise {
    @Override
    public double appliquerRemise(double montant) {
        return montant * 0.9;
    }
}
