package smart.oven.beans;

public class Oven {

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public Grill getGrill() {
        return grill;
    }

    public void setGrill(Grill grill) {
        this.grill = grill;
    }

    private Lights lights;
    private Grill grill;

    public Oven(Lights lights, Grill grill) {
        this.lights = lights;
        this.grill = grill;
    }

    public void turnOn() {
        System.out.println("Turning on the Oven");
        lights.turnOn();
        grill.turnOn();
    }
}
