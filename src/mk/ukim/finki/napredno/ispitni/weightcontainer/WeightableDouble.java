package mk.ukim.finki.napredno.ispitni.weightcontainer;

public class WeightableDouble implements Weightable{
    double weight;

    public WeightableDouble(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
