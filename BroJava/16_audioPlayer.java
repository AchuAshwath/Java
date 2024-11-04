package BroJava;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;


class audio {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, NullPointerException,  LineUnavailableException{
        
        File audioFile = new File("D:\\achu\\packs\\sube\\day new x riun my life.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

        Clip audioClip = AudioSystem.getClip();
        Scanner scanner = new Scanner(System.in);
        audioClip.open(audioStream);

        String response = "null";
        while(!response.equals("Q")){
            
            System.out.println("P - Play, S - Stop, R - Reset, Q - Quit");

            response = scanner.next();
            response = response.toUpperCase();
            
            switch (response) {
                case "P":
                    audioClip.start();
                    break;
                case "S":
                    audioClip.stop();
                    break;
                case "R":
                    audioClip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    audioClip.close();
                    break;
            
                default:
                    System.out.println("Invalid response");
                    break;
            }System.err.println();
        }

    }
    
}
