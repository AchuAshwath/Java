package BroJava;
import javax.swing.*;
class GUI {
    public static void main(String[] args) {
        String Name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, "Hi!, Your name is, "+Name);
        
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        if(age >= 18){
            JOptionPane.showMessageDialog(null, "You are an adult");
        }else{
            JOptionPane.showMessageDialog(null, "You are a minor");
        }
    }    
}
