package Service;

import Entity.Operator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperatorServiceTest {

    OperatorService os;
    Operator o;

    @BeforeEach
    void setup() {
        //Arrange
        this.os = new OperatorService();
        this.o = new Operator(25d , 5d);
    }

    @Test
    @DisplayName("Crear Operator")
    void createOperators() {
        //Act
        Double numA = 25d;
        Double numB = 5d;
        Operator rTest = os.createOperator(numA, numB);
        //Assert
        assertThat(rTest).usingRecursiveComparison().isEqualTo(o);
    }

    @Test
    @DisplayName("Validar suma")
    void sumOperators() {
        //Act
        Double rTest = 30d;
        Double test = os.sumOperators(o);
        //Assert
        assertEquals(rTest, test);
    }

    @Test
    @DisplayName("Validar resta")
    void minusOperators() {
        //Act
        Double rTest = 20d;
        Double test = os.minusOperators(o);
        //Assert
        assertEquals(rTest, test);
    }

    @Test
    @DisplayName("Validar multiplicacion")
    void multiplicationOperators() {
        //Act
        Double rTest = 125d;
        Double test = os.multiplicationOperators(o);
        //Assert
        assertEquals(rTest, test);
    }

    @Test
    @DisplayName("Validar division")
    void divisionOperators() {
        //Act
        Double rTest = 5d;
        Double test = os.divisionOperators(o);
        //Assert
        assertEquals(rTest, test);
    }

    @Test
    @DisplayName("Validar Exception x division de 0")
    void throwsException() {
        //Arrange
        Operator o1 = new Operator(25d , 0d);
        //Act

        //Assert
        assertThrows(ArithmeticException.class, () -> os.divisionOperators(o1));
    }

}