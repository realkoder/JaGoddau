package lamp;

public class TestLamp {
    public void run(){
        Lamp justLamp = new Lamp(true);
        justLamp.pushSwitch();
        Lamp deskLamp = new Lamp(false);
        Lamp bedLamo = new Lamp();
        Lamp officeLamp = new Lamp(true);
    }

    public static void main(String[] args){
        new TestLamp().run();
    }
}
