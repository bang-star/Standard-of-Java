package ch07.singleInheritance;

public class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() { System.out.println("TVCR - play"); }
    void stop() { System.out.println("TVCR - stop"); }
    void rew()  { System.out.println("TVCR - rew"); }
    void ff()   { System.out.println("TVCR - ff"); }
}
