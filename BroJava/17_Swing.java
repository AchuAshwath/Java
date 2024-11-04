package BroJava;
import java.awt.Color;

import javax.swing.*;


class SwingGUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); // creating a new instance of JFrame
        frame.setTitle("Jframe java GUI components");

        // by default the CloseOperation is set to HIDE_ON_CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(980, 720);
        frame.setVisible(true); // making the frame visible
        frame.setResizable(false); // makes the frame to not be resized
        frame.getContentPane().setBackground(Color.LIGHT_GRAY); // new Color(r,g,b); new Color(#HEXDEC);
        

}
    
}
