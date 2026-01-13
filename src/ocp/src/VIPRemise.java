package ocp.src;

public class VIPRemise implements StrategieRemise {
    @Override
    public double appliquerRemise(double montant) {
        return montant * 0.8;
    }
}
