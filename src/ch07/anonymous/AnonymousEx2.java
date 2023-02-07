package ch07.anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousEx2 {

    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }

    static class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ActionEvent occured!!! ");
        }
    }
}

