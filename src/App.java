import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;

public class App {
    public static void main(String[] args) throws Exception {
        int boardHeight = 600;
        int boardWidth = boardHeight;
        int score = 0;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Score");
        frame.add(label);

        SnakeGame snakeGame = new SnakeGame(boardHeight, boardWidth);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
