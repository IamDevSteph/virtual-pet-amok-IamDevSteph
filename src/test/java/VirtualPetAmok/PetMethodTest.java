package VirtualPetAmok;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class PetMethodTest {

    VirtualPetShelter underTestShelter = new VirtualPetShelter();
    RobotCat battleKitty = new RobotCat("Fluffy", 10, 5, 5, 5);
    RobotDog battlePuppy = new RobotDog("Fifi", 10, 10, 10, 10);
    Cat normalKitty = new Cat("Steve", 10, 100, 10, 10, 10, 30);
    Dog normalPuppy = new Dog("Eve", 15, 100, 15, 15, 15, 20);

    @Test
    public void shouldAddRobotPets() {
        underTestShelter.addRobotPet(battleKitty);
        underTestShelter.addRobotPet(battlePuppy);
        Collection<Robotic> addRoboticPets = underTestShelter.getAllMechs();
        VirtualPet foundRobotCat = underTestShelter.findRobotPet("Fluffy");
        VirtualPet foundRobotDog = underTestShelter.findRobotPet("Fifi");
        assertEquals("Fluffy", foundRobotCat.getName());
        assertEquals("Fifi", foundRobotDog.getName());
    }

    @Test
    public void shouldCleanDogCages() {
        normalPuppy.cageNeedsCleaning();
        int spotlessCage = normalPuppy.getCage();
        assertEquals(0, spotlessCage);


    }

    @Test
    public void shouldOilAllRobots(){
        battlePuppy.oilRobots();
        battleKitty.oilRobots();
        int oilCheck = battlePuppy.getOilLevel();
        int oilCheck2 = battleKitty.getOilLevel();
        assertEquals(30, oilCheck);
        assertEquals(25, oilCheck2);

    }

    @Test
    public void shouldGetConditionLevel(){
        battlePuppy.repairRobots();
        battleKitty.repairRobots();
        int maintenanceLevel1 = battlePuppy.getConditionLevel();
        int maintenanceLevel2 = battleKitty.getConditionLevel();
        assertEquals(30, maintenanceLevel1);
        assertEquals(25, maintenanceLevel2);
    }
    @Test
    public void shouldPlayWithRobots(){
        battleKitty.playWithPets();
        battlePuppy.playWithPets();
        int playCheck = battlePuppy.getHappiness();
        int playCheck2 = battleKitty.getHappiness();
        assertEquals(20, playCheck);
        assertEquals(15, playCheck2);
    }

    @Test
    public void shouldWalkAllDogs(){
        battlePuppy.walkTheDogs();
        normalPuppy.walkTheDogs();
        int walk1 = battlePuppy.getHealthLevel();
        int walk2 = normalPuppy.getHealthLevel();
        assertEquals(20, walk1);
        assertEquals(105, walk2);
    }

    @Test
    public void shouldRemoveARoboticPet(){
        underTestShelter.removeRobotPet(battlePuppy);
        VirtualPet findRoboPuppy = underTestShelter.findRobotPet("Fluffy");
        assertEquals(findRoboPuppy, null);
    }
    @Test
    public void shouldRemoveBioPet(){
        underTestShelter.removeBioPet(normalKitty);
        VirtualPet findBioKitty = underTestShelter.findBioPet("Steve");
        assertEquals(findBioKitty, null);
    }

    @Test
    public void shouldCleanOutStevesLitterBox(){
        normalKitty.litterBoxNeedsCleaning();
        int litterRobot = normalKitty.getLitterBox();
        assertEquals(10, litterRobot);
    }
    @Test
    public void shouldFeedOrganicPets(){
        normalPuppy.feed();
        normalKitty.feed();
        int hungryPuppy = normalPuppy.getHungerLevel();
        int hungryKitty = normalKitty.getHungerLevel();
        assertEquals(25, hungryPuppy);
        assertEquals(20, hungryKitty);
    }

    @Test
    public void shouldWaterOrganicPets(){
        normalKitty.water();
        normalPuppy.water();
        int thirstyKitty = normalKitty.getWaterLevel();
        int thirstyPuppy = normalPuppy.getWaterLevel();
        assertEquals(20, thirstyKitty);
        assertEquals(25, thirstyPuppy);
    }
    @Test
    public void shouldGiveBathroomBreakToPets(){
        normalPuppy.emptyPoopInventory();
        normalKitty.emptyPoopInventory();
        int poopyKitty= normalKitty.getPoopInventory();
        int poopyPuppy= normalPuppy.getPoopInventory();
        assertEquals(5, poopyPuppy);
        assertEquals(0, poopyKitty);
        //Kitty should not have a poopInventory, only puppy as they can accidentally soil their cages.
    }
    @Test
    public void giveThemFelinesCatNap(){
        normalKitty.useCatNip();
        int hyperKitty = normalKitty.getBoredom();
        assertEquals(0, hyperKitty);
    }
}


