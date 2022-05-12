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
}



//
//    @Override
//    public void walkTheDogs(Dog bioDog) {
//        bioDog.walkTheDogs(5);
////        //I want to increase their happiness. Happiness is a shared variable among all the pets. How do I implement a way to gather and increase their happiness in a method?
////        bioDog.calculateHappiness();
////
//    }
//
//    @Override
//    public void playWithDogs(RobotDog bioDog) {
////        bioDog.decreaseBoredom(10);
////        bioDog.increaseHunger(5);
//
//    }

