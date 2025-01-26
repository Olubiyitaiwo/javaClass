import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveOrNegativeTest {

    @Test
    public void testPositiveOrNegative() {
        int[] number = {1,2,3,4,5,6,-7,2,8};
        int number1 = 3;
        int number2 = 2;
        int actual = PositiveOrNegative.positiveNumber(number, number1);
        assertEquals(number2, actual);

    }

}