package org.classic.swing.snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ClassicSnakeGameEngine extends JFrame {

    public ClassicSnakeGameEngine() {
        
        initScreen();
    }
    
    private void initScreen() {
        
        add(new ClassicGameScreen());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame frame = new ClassicSnakeGameEngine();
            frame.setVisible(true);
        });
    }
}
