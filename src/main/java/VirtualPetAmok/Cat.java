package VirtualPetAmok;

public class Cat extends Organic{


    private int cleanLitterBox;
    private int boredom;
    public int getBoredom(){
        return boredom;
    }

    Cat (){
        super();
    }

    public int getLitterBox(){
        return cleanLitterBox;
    }

    public Cat(String name, int happiness, int healthLevel, int hungerLevel, int water, int boredom, int cleanLitterBox) {
        super(name, happiness, healthLevel, hungerLevel, water, boredom);
        this.cleanLitterBox = cleanLitterBox;
        this.boredom = boredom;
    }

    public void litterBoxNeedsCleaning(){
        cleanLitterBox -= 20;
    }

    public void useCatNip(){
        boredom-=10;
        hungerLevel++;

    }

}
