package GoodCode;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Panel;

public class GameOfLifeApp extends JFrame {
    private int WIDTH = 600;
    private int HEIGHT = 800;
    private final JButton button = new JButton("pause");
    private Panel panel = new Panel();
    private GameOfLifeApp(){
        super("Game of life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(WIDTH,HEIGHT);
        this.setLocationRelativeTo(null);
        this.add(panel, BorderLayout.NORTH);
        panel.add(button);
        pack();
        this.setVisible(true);
    }
    public static void main(String[] args){
        GameOfLifeApp app = new GameOfLifeApp();

    }
}
