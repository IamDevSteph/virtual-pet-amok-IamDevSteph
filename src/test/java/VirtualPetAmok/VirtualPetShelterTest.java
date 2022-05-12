package VirtualPetAmok;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetShelterTest {
    
    VirtualPetShelter underTestShelter = new VirtualPetShelter();
    RobotCat battleKitty = new RobotCat("Fluffy", 10,10,10,10);
    RobotDog battlePuppy = new RobotDog("Fifi", 10, 10, 10, 10);


    @Test
    void getAllMechs() {
        underTestShelter.addRobotPet(battleKitty);
        underTestShelter.addRobotPet(battlePuppy);
        Collection<Robotic> addRoboticPets = underTestShelter.getAllMechs();
        VirtualPet foundRobotCat = underTestShelter.findRobotPet("Fluffy");
        VirtualPet foundRobotDog = underTestShelter.findRobotPet("Fifi");
        assertEquals("Fluffy", foundRobotCat.getName());
        assertEquals("Fifi", foundRobotDog.getName());
    }

    @Test
    void addRobotPet() {
    }
}