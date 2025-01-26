package AirCondition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test
    public void testThatAirConditionIsTurnedOff() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        assertTrue(airCondition.isTurnedOff());
    }

    @Test
    public void testThatAirConditionIsTurnedOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        airCondition.turnedOn();
        assertTrue(airCondition.turnedOn());
    }

    @Test
    public void testThatAirConditionTemperatureCanBeIncreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        airCondition.turnedOn();
        airCondition.increaseTemperature();
        assertEquals(19, airCondition.getTemperature());
    }
    @Test
    public void testThatAirConditionTemperatureCanBeDecreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        airCondition.turnedOn();
        airCondition.decreaseTemperature();
        assertEquals(17, airCondition.getTemperature());
    }

    @Test
    public void testThatAirConditionTemperatureCanBeIncreasedToHighestTemperature() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        airCondition.turnedOn();
        airCondition.setTemperature(18);
        assertEquals(18, airCondition.getTemperature());
    }
    @Test
    public void testThatAirConditionTemperatureCanBeDecreasedToLowestTemperature() {
        AirCondition airCondition = new AirCondition();
        airCondition.isTurnedOff();
        airCondition.turnedOn();
        airCondition.setTemperature(30);
        assertEquals(30, airCondition.getTemperature());
    }
}