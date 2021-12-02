public class Alien extends Sprite {

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("resources/alien.png");
        getImageDimensions();
    }

    public void move() {

        if (y > GameConstants.B_HEIGHT.get() + GameConstants.ALIEN_FINAL_Y.get()) {
            y = GameConstants.ALIEN_INITIAL_Y.get();
        }

        y += GameConstants.ALIEN_SPEED.get();
    }
}