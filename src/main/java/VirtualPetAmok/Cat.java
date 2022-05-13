package VirtualPetAmok;

public class Cat extends Organic{


    private int cleanLitterBox;
    private int boredom;
    public int getBoredom(){
        return boredom;
    }
//default constructor with no parameters.
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
    //add poopInventory to increase litterBoxNeedsCleaning.

    public void litterBoxNeedsCleaning(){
        cleanLitterBox -= 20;
        if(hungerLevel>=30)
            cleanLitterBox+=10;
        if(cleanLitterBox>=40)
            cleanLitterBox = 0;
        if(cleanLitterBox<=0)
            cleanLitterBox=1;

    }

    public void useCatNip(){
        boredom-=10;
        hungerLevel++;
        if(hungerLevel>=30)
            hungerLevel=0;
        if(hungerLevel<=0)
            hungerLevel=1;
    }

    public void tick(){
        hungerLevel++;
        happiness--;
        healthLevel--;
        waterLevel--;
        boredom--;
        cleanLitterBox++;

    }

}
