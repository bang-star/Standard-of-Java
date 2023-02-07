package ch07.interfaceAdvantages.ex2;

public class LiftableImpl implements Liftable {

    private static final LiftableImpl liftable = new LiftableImpl();;

    private LiftableImpl() {}

    public static LiftableImpl getInstance() {
        return liftable;
    }

    @Override public void liftOff() { System.out.println("liftOff"); }
    @Override public void move(int x, int y) { System.out.println("move"); }
    @Override public void stop() { System.out.println("stop"); }
    @Override public void land() { System.out.println("land"); }
}
