package OOPs.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.acc();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = new ElectricEngine();
    }

}
