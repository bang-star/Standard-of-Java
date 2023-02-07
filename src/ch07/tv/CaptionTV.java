package ch07.tv;

public class CaptionTV extends TV {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
