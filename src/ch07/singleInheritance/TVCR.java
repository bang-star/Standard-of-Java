package ch07.singleInheritance;

public class TVCR extends TV {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() { vcr.play(); }
    void stop() { vcr.stop(); }
    void rew()  { vcr.rew(); }
    void ff()   { vcr.rew(); }
}
