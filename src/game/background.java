package game;
import java.awt.*;

import javax.swing.*;

public class background {
    public void runbackground(Graphics g) {
        g.drawImage(new ImageIcon("image/background.png")
                .getImage(), -220, 0, null);
        g.drawImage(new ImageIcon("image/shopping.png")
                .getImage(), 10, 0, null);
    }
}