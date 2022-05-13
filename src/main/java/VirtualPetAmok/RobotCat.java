package VirtualPetAmok;

public class RobotCat extends Robotic{

    RobotCat(){
        super();
    }

    public RobotCat(String name, int healthLevel, int happiness, int conditionLevel, int oilLevel) {
        super(name, healthLevel, happiness, conditionLevel, oilLevel);
    }

    @Override
    public void playWithPets(){
        happiness +=10;
        conditionLevel -=5;
        oilLevel -=5;
    }

    public void tick(){
        happiness--;
        healthLevel--;
        conditionLevel--;
        oilLevel--;
    }

}
