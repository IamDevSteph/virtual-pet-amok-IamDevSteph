package VirtualPetAmok;

public abstract class VirtualPet {
    protected String name;
    public int healthLevel;
    protected int happiness;

    protected VirtualPet() {
    }

    public String getName(){
        return name;
    }

    public int getHealthLevel(){
        return healthLevel;
    }

    public int getHappiness(){
        return happiness;
    }


    public VirtualPet(String name, int healthLevel, int happiness){
        this.name = name;
        this.healthLevel = healthLevel;
        this.happiness = happiness;
    }

    public void playWithPets(){
        happiness +=10;
    }

    public void walkTheDogs(){

    }
    public void tickAll(){

    }


}
