import java.applet.Applet;
import java.awt.*;
import java.text.AttributedCharacterIterator;

public class Main extends Applet {

    public void init() {

        setSize(400, 300);
        setBackground(Color.white);
    }
    public  void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Peyman", 50, 60);
        g.setColor(Color.RED);
        g.drawString("Mahmoudi", 50, 80);
    }

}