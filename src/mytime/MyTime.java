package mytime;

public class MyTime {
    private int hours = 0;
    private int minutes = 0;

    public MyTime(int hours, int minutes){
        setHours(hours);
        setMinutes(minutes);
    }

    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        } else {
            System.out.println("You can't add negative hours!");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 60){
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
            else if (minutes >= 0) {
                this.minutes = minutes;
            } else {
                System.out.println("You can't add negative minutes!");
            }
    }

    public String toString() {
        return hours + ":" + minutes;
    }
}
