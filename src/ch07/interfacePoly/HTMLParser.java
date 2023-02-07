package ch07.interfacePoly;

public class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- html parsing completed");
    }
}
