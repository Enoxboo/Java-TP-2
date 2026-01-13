package ocp.src;

public class StandartRemise implements StrategieRemise {
    @Override
    public double appliquerRemise(double montant) {
        return montant;
    }
}
