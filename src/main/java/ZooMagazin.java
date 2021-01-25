import java.awt.*;

public class ZooMagazin {
    public static void main(String[] args) {
     Animal Cat1  = new Cat("Тимон","Черный", "Сиамская");
     Animal Cat2  = new Cat("Пумба","Коричневый", "Без пароды");

     Animal Dog1 = new Dog("Рэкс", "Черный", "Бульдок");
     Animal Dog2= new Dog("Бим", "Белый", "Долматинец");

     Cat1.run(250);
     Cat2.run(550);
     Dog1.run(600);
     Dog2.run(300);
     System.out.println("Animal " + Animal.getCount());
     System.out.println("Cat " + Cat.getCountCat());
     System.out.println("Dog " + Cat.getCountCat());
     Cat1.swimming(100);
     Cat1.swimming(100);
     Dog1.swimming(15);
     Dog2.swimming(10);
     System.out.println("Animal " + Animal.getCount());
     System.out.println("Cat " + Cat.getCountCat());
     System.out.println("Dog" + Cat.getCountCat());

    }
}
