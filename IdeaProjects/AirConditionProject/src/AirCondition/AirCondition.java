package AirCondition;

public class AirCondition {

    private boolean turnedOn;
    private int temperature = 18;

    public boolean turnedOn() {
        return true;
    }
    public boolean isTurnedOff() {
        return !turnedOn;
    }

    public void increaseTemperature() {
        temperature++;
    }

    public void decreaseTemperature() {
        temperature--;
    }

    public void setTemperature(int temp) {
        if(temperature >= 30) {
            turnedOn = true;
            System.out.println("The temperature is now " + temp);
        }
        temperature = temp;
    }

    public int getTemperature() {
        if(temperature <= 18) {
            turnedOn = true;
            System.out.println("The temperature is now can't go beyond 18'C");
        }
        return temperature;
    }
}


