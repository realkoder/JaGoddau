package lamp;

public class Lamp {
    private static int countCreatedLamps = 0;
    private boolean turnedOn = false;

    public Lamp(boolean turnedOn) {
        this.turnedOn = turnedOn;
        countCreatedLamps++;
        System.out.println(countCreatedLamps);
    }

    public Lamp() {
        countCreatedLamps++;
    }

    public void pushSwitch() {
        if (turnedOn == true) {
            turnedOn = false;
        } else {
            turnedOn = true;
        }
    }
}
