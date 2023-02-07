package ch07.interfaceAdvantages.ex2;

public interface Liftable {

    /* 건문을 들어 올린다. */
    public abstract void liftOff();
    /* 건물을 이동한다. */
    public abstract void move(int x, int y);
    /* 건물을 정지시킨다. */
    public abstract void stop();
    /* 건물을 착륙시키다. */
    public abstract  void land();
}
