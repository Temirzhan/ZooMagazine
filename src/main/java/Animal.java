public abstract class Animal {
    private String name;
    private String color;
    private String type;
    private int lives;
    private static int count =0;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.lives = 1;
        count++;
    }

    public abstract void run(int l);

    public abstract void swimming(int l);


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getLives() {
        return lives;
    }

    public static int getCount(){
        return count;
    }

    protected void setLives(int lives) {
        this.lives = lives;
    }

    protected static void setCount(int i){
        count = i;
    }
}
