package Service;

import Entity.Operator;

public class OperatorService {

    public Operator createOperator(Double numA, Double numB) {
        return new Operator(numA, numB);
    }

    public Double sumOperators(Operator o) {

        return (o.getNumberA() + o.getNumberB());
    }

    public Double minusOperators(Operator o) {

        return (o.getNumberA() - o.getNumberB());
    }

    public Double multiplicationOperators(Operator o) {

        return (o.getNumberA() * o.getNumberB());
    }

    public Double divisionOperators(Operator o) throws ArithmeticException {
        if (o.getNumberB() == 0d){
            throw new ArithmeticException();
        }
        return (o.getNumberA() / o.getNumberB());
    }

}
