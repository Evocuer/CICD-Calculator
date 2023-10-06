package Calculator;

import Entity.Operator;
import Service.OperatorService;

public class CalculatorMain {

    public static void main(String[] args) {

        OperatorService os = new OperatorService();

        Double numA = Math.random()*100;
        Double numB = Math.random()*100;

        Operator o = os.createOperator(numA, numB);

        System.out.println("la suma es: " + os.sumOperators(o));
        System.out.println("la resta es: " + os.minusOperators(o));
        System.out.println("la Division es: " + os.multiplicationOperators(o));

        try {
            System.out.println("la Multiplicacion es: " + os.divisionOperators(o));
        } catch (ArithmeticException e) {
            System.out.println("Error Multiplicacion x cero");
        }

    }

}
