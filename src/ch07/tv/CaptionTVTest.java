package ch07.tv;

public class CaptionTVTest {
    public static void main(String[] args) {
        CaptionTV captionTV = new CaptionTV();
        captionTV.channel = 10;
        captionTV.channelUp();

        System.out.println(captionTV.channel);

        captionTV.displayCaption("Hello World");
        captionTV.caption = true;
        captionTV.displayCaption("Hello World");
    }
}
