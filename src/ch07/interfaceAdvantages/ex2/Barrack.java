package ch07.interfaceAdvantages.ex2;

public class Barrack extends Building implements Liftable {

    LiftableImpl liftable = LiftableImpl.getInstance();

    public Barrack(int x, int y) {
        super(x, y);
    }

    @Override
    public void liftOff() {
        liftable.liftOff();
    }

    @Override
    public void move(int x, int y) {
        liftable.move(x, y);
    }

    @Override
    public void stop() {
        liftable.stop();
    }

    @Override
    public void land() {
        liftable.land();
    }
}
