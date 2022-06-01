import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){
        // GamePanel panel = new GamePanel();
        // this.add(panel);
        // shortcut:
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();                // Wenn komponente zu dem JFrame hinzugefügt werden, wird die pack Methode, die Komponente regeln
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
