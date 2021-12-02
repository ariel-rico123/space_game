public class Background extends Sprite {

    public Background(int x, int y, int index) {
        super(x, y);
        
        initBackground(index);
    }
    
    private void initBackground(int index) {
        switch (index) {
            case 0:
                loadImage("resources/space_background1.png");
                break;
            case 1:
                loadImage("resources/space_background2.png");
                break;
            default:
                break;
        }
        getImageDimensions();
        switch (index) {
            case 0:
                x = 0;
                y = 0;
                break;
            case 1:
                x = 0;
                y = -height;
                break;
            default:
                break;
        }
    }

    public void move() {
        y += 1;
        if (y > GameConstants.B_HEIGHT.get())
            y = -height;
    }
}