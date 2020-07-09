package com.sparta.sc;
import java.awt.*;
import javax.swing.*;
//public class ColourPopUp extends JFrame{
//    Color c;
//        // constructor
//
//        ColourPopUp(Color c)
//        {
//            super("colour");
//            this.c=c;
//            // create a new Color
//            // RGB value of Yellow is 225, 255, 0
//            //new Color(255, 255, 0);
//
//            // create a panel
//            JPanel p = new JPanel();
//
//            // set the background of the
//            // frame to the specified Color
//            p.setBackground(c);
//
//            setSize(200, 200);
//            add(p);
//            show();
//        }

//        // Main Method
//        public static void main(String args[])
//        {
//            colour c = new colour();
//        }
  //  }
class colour extends JFrame {

    // constructor
    colour() {
        super("colour");

        // create a new Color
        // RGB value of Yellow is 225, 255, 0
        Color c = new Color(255, 255, 0);

        // create a panel
        JPanel p = new JPanel();

        // set the background of the
        // frame to the specified Color
        p.setBackground(c);

        setSize(200, 200);
        add(p);
        setVisible(true);
    }
}

