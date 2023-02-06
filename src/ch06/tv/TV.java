package ch06.tv;

public class TV {
    String color;
    boolean power;
    int channel;
    int volume;

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
    void volumeUp() { volume++; }
    void volumeDown() { volume--; }
}
