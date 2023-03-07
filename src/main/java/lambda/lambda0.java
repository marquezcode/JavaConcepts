package lambda;

import java.awt.*;
public class lambda0 {
    public static void main(String[] args) {
        Frame frame = new Frame("Java - 8 Action-listener");

        Button b = new Button("click me");
        b.setBounds(40,80,60,40);

        //Creates listener for the button with lambda function
        b.addActionListener(e -> System.out.println("TEST"));
        frame.add(b);

        frame.setSize(150,150);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
