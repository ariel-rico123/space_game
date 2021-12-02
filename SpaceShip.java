import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    private List<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);
        
        initSpaceShip();
    }

    private void initSpaceShip() {

        missiles = new ArrayList<>();
        
        loadImage("resources/spaceship.png"); 
        getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;
        
        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
        
        if (x > GameConstants.B_WIDTH.get() - width) {
            x = GameConstants.B_WIDTH.get() - width;
        }

        if (y > GameConstants.B_HEIGHT.get() - height) {
            y = GameConstants.B_HEIGHT.get() - height;
        }
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -GameConstants.SPACE_CRAFT_SPEED.get();
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = GameConstants.SPACE_CRAFT_SPEED.get();
        }

        if (key == KeyEvent.VK_UP) {
            dy = -GameConstants.SPACE_CRAFT_SPEED.get();
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = GameConstants.SPACE_CRAFT_SPEED.get();
        }
    }

    public void fire() {
        missiles.add(new Missile(x + (width/4), y + (height/2) ) );
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}