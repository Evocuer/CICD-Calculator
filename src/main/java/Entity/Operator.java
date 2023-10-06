package Entity;

public class Operator {

    private Double numberA;
    private Double numberB;

    public Operator() {
    }

    public Operator(Double numberA, Double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return "Operators{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }
}
