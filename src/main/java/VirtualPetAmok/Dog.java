package VirtualPetAmok;

public class Dog extends Organic implements PuppyDuties{

    private int cage;

    public int getCage(){
        return cage;
    }

    Dog(){
        super();
    }

    public Dog(String name, int happiness, int healthLevel, int hungerLevel, int waterLevel, int poopInventory, int cage){
        super(name, happiness, healthLevel, hungerLevel, waterLevel, poopInventory);
        this.cage = cage;
    }

    public void cageNeedsCleaning() {
        cage -= 20;
    }

    @Override
    public void playWithPets() {
        healthLevel+=5;
        happiness+=5;

    }

    @Override
    public void walkTheDogs() {
        healthLevel+=5;
        happiness+=5;

    }
    @Override
    public void tickAll(){
        healthLevel++;
        happiness++;
        hungerLevel--;
        waterLevel--;
        poopInventory++;
        cage++;
    }
}