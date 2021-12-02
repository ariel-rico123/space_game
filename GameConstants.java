public enum GameConstants {
    B_WIDTH             (400),
    B_HEIGHT            (600),
    DELAY               (15),
    SPACE_CRAFT_X       (200),
    SPACE_CRAFT_Y       (500),
    SPACE_CRAFT_SPEED   (4),
    ALIEN_INITIAL_Y     (-30),
    ALIEN_FINAL_Y       (100),
    ALIEN_SPEED         (3),
    ALIEN_COUNT         (40),
    ALIEN_CHANCE        (95),
    MISSILE_SPEED       (5);

    private final int value;
    GameConstants(int value) {
        this.value = value;
    }
    public final int get() { return value; }
}