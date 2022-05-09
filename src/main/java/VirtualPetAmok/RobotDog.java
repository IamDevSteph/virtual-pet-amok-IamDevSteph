package VirtualPetAmok;

public class RobotDog extends Robotic implements PuppyDuties{

    RobotDog mechaMutt = new RobotDog("UltraMutt", 100, 25, 25, 25);


    public RobotDog(String name, int healthLevel, int happiness, int conditionLevel, int oilLevel) {
        super(name, healthLevel, happiness, conditionLevel, oilLevel);
    }


    @Override
    public void walkTheDogs() {
        healthLevel +=10;
        happiness +=5;
        conditionLevel -=5;
        oilLevel -=5;
    }

    @Override
    public void playWithPets(){
        happiness +=10;
        conditionLevel -=5;
        oilLevel -=5;
    }

//    @Override
//    public void tick() {
//
//    }
}
