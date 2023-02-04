package ch06.tv;

public class TvTest {
    public static void main(String[] args) {
        tvTest4();
    }

    public static void tvTest1() {
        TV tv = new TV();
        tv.channel = 7;
        tv.channelDown();

        System.out.println("현재 채널: " + tv.channel);
    }

    public static void tvTest2() {
        TV tv1 = new TV();
        TV tv2 = new TV();
        System.out.println("tv1의 channel: " + tv1.channel);
        System.out.println("tv2의 channel: " + tv2.channel);

        tv1.channel = 5;
        System.out.printf("tv1 channel이 %d로 변경되었습니다. %n", tv1.channel);

        System.out.println("tv1의 channel: " + tv1.channel);
        System.out.println("tv2의 channel: " + tv2.channel);
    }

    public static void tvTest3() {
        TV tv1 = new TV();
        TV tv2 = new TV();
        System.out.println("tv1의 channel: " + tv1.channel);
        System.out.println("tv2의 channel: " + tv2.channel);

        tv2 = tv1;
        tv1.channel = 5;
        System.out.printf("tv1 channel이 %d로 변경되었습니다. %n", tv1.channel);

        System.out.println("tv1의 channel: " + tv1.channel);
        System.out.println("tv2의 channel: " + tv2.channel);
    }

    public static void tvTest4() {
        TV[] tvs = new TV[3];

        for(int i=0; i<tvs.length; i++){
            tvs[i] = new TV();
            tvs[i].channel = (int)(Math.random() * 100) + 1;
        }

        for(int i=0; i<tvs.length; i++) {
            System.out.printf("tv[%d]의 channel은 %d입니다. %n", i, tvs[i].channel);
        }
    }
}
