import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {

    ArithmeticOperation object = new ArithmeticOperation();


    @Test
    void givenTwoNumbersWhenAddedShouldReturnSum(){
        int result = object.addition(5,5);
        Assertions.assertEquals(10,result);
    }

    @Test
    void givenTwoNumbersWhenSubstractShouldReturnDifference(){
        int result = object.substract(5,5);
        Assertions.assertEquals(0,result);
    }

    @Test
    void givenTwoNumbersWhenMultipliedShouldReturnProduct(){
        int result = object.multiply(5,5);
        Assertions.assertEquals(25,result);
    }
}
