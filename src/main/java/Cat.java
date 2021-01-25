public class Cat extends Animal {
    private static int countCat = 0;

    public Cat(String name, String color, String type) {
        super(name, color, type);

        countCat++;
    }
    @Override
    public void run(int l){
        if(getLives()==1) {
            if (l < 200) System.out.println(getName() + " пробежал 200м, и устал! дальше бежать не будет!");
            else System.out.println(getName() + "  пробежал : " + l + "м");
        }else {
            System.out.println(getName() + "  не бежит. Устал наверное");
        }
    };
    @Override
    public void swimming(int l){
        if(getLives()==1){
        setLives(getLives()-1);
        System.out.println("У " + getName() + "  9, 8, 7, 6, 5, 4, 3, 2, 1, 0........ ");
        System.out.println(getName() + " утонул");
        setLives(0);
        countCat--;
        setCount(getCount()-1);
        }else{
            System.out.println("Хватит издеваться над " + getName());
        }
    };

    public static int getCountCat(){
        return countCat;
    }
}
