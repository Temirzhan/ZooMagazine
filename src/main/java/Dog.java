public class Dog extends  Animal{
    private static int countDog = 0;

    public Dog(String name, String color, String type) {
        super(name, color, type);
        countDog++;
    }

    @Override
    public void run(int l) {
        if(getLives()==1) {
            if (l < 500) System.out.println(getName() + " пробежал 200м, и устал! дальше бежать не будет!");
            else System.out.println(getName() + " пробежал : " + l + "м");
        }else {
            System.out.println(getName() + " не бежит. Устал наверное");
        }
    }

    @Override
    public void swimming(int l) {
        if(getLives()==1){
            if (l <= 10) {
                System.out.println(getName() + " проплыл : " + l + "м");

            } else{
                System.out.println(getName() + " ПРОПЛЫЛ 10М!, И НЫРНУЛ. Странно где он выплал?");
                setLives(0);
                countDog--;
                setCount(getCount()-1);
            };
        }else{
            System.out.println("Хватит издеваться над " + getName());
        }
    }

    public static int getCountDog(){
        return countDog;
    }



}
