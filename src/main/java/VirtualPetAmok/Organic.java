package VirtualPetAmok;

public abstract class Organic extends VirtualPet {


    public int hungerLevel;
    public int waterLevel;
    public int poopInventory;



    public int getHungerLevel(){
        return hungerLevel;
    }
    public int getWaterLevel(){
        return waterLevel;
    }
    public int getPoopInventory(){
        return poopInventory;
    }

    public Organic(String name, int happiness, int healthLevel, int hungerLevel, int waterLevel, int poopInventory){
        this.healthLevel = 100;
        this.hungerLevel = 25;
        this.waterLevel = 25;
        this.poopInventory = 25;
    }

    public void feed(){
        hungerLevel += 10;
        poopInventory += 5;
    }
    public void water(){
        waterLevel += 10;
        poopInventory ++;
    }
    public void emptyPoopInventory(){
        poopInventory -=10;
        hungerLevel -=5;
        waterLevel --;
    }
    @Override
    public void playWithPets(){
        happiness +=10;
        hungerLevel -=10;
        waterLevel ++;

    }
    public void walkTheDogs(){
            poopInventory-=5;
            happiness+=5;
    }
}
