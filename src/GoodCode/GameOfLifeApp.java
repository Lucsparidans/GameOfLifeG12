package GoodCode;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOfLifeApp extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 800;
    private final JButton button = new JButton("pause");
    private final int delay = 100;
    private static GameOfLifeApp app;
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
        button.addActionListener(new buttonListener());
        this.setVisible(true);

        //Game
        th = new Thread();
        paused = false;
        app = new GameOfLifeApp();
    }
    public static void main(String[] args){
        app = new GameOfLifeApp();
        app.run();
    }

    private void run(){
        while (true) {
            try {
                Thread.sleep(delay);
            }
            catch (Exception e) {e.printStackTrace();}
            if (!paused) ;//update GameOfLifeUI
        }
    }
    private void pause(){
        if(paused){
            paused = false;
        }
        else{
            paused = true;
        }
    }
    private class buttonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            app.pause();
        }
    }
}
