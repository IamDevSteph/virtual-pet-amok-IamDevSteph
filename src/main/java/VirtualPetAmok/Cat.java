package VirtualPetAmok;

public class Cat extends Organic{

    Cat kitty = new Cat("", 10, 10, 10, 10,10, 10);

    private int cleanLitterBox;

    public int getLitterBox(){
        return cleanLitterBox;
    }

    public Cat(String name, int happiness, int health, int hunger, int water, int boredom, int cleanLitterBox) {
        super(name, happiness, health, hunger, water, boredom);
        this.cleanLitterBox = cleanLitterBox;
    }

    public void litterBoxNeedsCleaning(){
        cleanLitterBox -= 20;
    }

}
