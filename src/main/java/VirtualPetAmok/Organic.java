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

    Organic(){
        super();
    }

    public Organic(String name, int happiness, int healthLevel, int hungerLevel, int waterLevel, int poopInventory){
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.waterLevel = waterLevel;
        this.poopInventory = poopInventory;
    }
    //I decided to default the organic pet health levels at 100. Kinda like a video game. This was giving me trouble in my testing but I noticed I had actually defaulted it lol.

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
}
