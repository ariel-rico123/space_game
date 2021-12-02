public class Missile extends Sprite {

    public Missile(int x, int y) {
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("resources/missile.png");  
        getImageDimensions();
    }

    public void move() {
        
        y -= GameConstants.MISSILE_SPEED.get();
        
        if (y < 0) {
            visible = false;
        }
    }
}