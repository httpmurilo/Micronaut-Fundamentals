package smart.oven.beans;

public class DIApplication {

    public static void main(String[] args) {
        Lights lights = new Lights();
        Grill grill = new Grill();

        Oven oven = new Oven(lights, grill);
        oven.turnOn();
    }
}
