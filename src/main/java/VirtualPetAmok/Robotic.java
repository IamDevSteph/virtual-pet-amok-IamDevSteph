package VirtualPetAmok;

public abstract class Robotic extends VirtualPet{

    public int conditionLevel;
    public int oilLevel;

    public int getConditionLevel() {
        return conditionLevel;
    }

    public int getOilLevel(){
        return oilLevel;
    }
    Robotic(){
        super();
    }

    public Robotic(String name, int healthLevel, int happiness, int conditionLevel, int oilLevel){
        super(name, healthLevel, happiness);
        this.conditionLevel = conditionLevel;
        this.oilLevel = oilLevel;
    }

    public void oilRobots() {
        oilLevel +=20;

    }
    public void repairRobots() {
        conditionLevel +=20;
    }
    @Override
    public void playWithPets(){
        conditionLevel -= 10;
        oilLevel -= 10;
    }

}
