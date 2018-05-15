package GoodCode;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Panel;

public class GameOfLifeApp extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 800;
    private final JButton button = new JButton("pause");
    private final int delay = 100;
    private boolean paused;
    private Panel panel;
    private Thread th;
    private GameOfLifeApp(){
        //Window
        super("Game of life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);
        panel = new Panel();
        this.add(panel, BorderLayout.NORTH);
        panel.add(button);
        this.setVisible(true);

        //Game
        th = new Thread();
        paused = false;
    }
    public static void main(String[] args){
        GameOfLifeApp app = new GameOfLifeApp();

    }

    public void run(){
        while (true) {
            try {
                Thread.sleep(delay);
            }
            catch (Exception e) {e.printStackTrace();}
            if (!paused) ;//update GameOfLifeUI
        }
    }
    public void pause(){
        if(paused){
            paused = false;
        }
        else{
            paused = true;
        }
    }
}
