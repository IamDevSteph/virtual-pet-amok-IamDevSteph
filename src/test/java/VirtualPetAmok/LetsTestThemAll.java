package VirtualPetAmok;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetsTestThemAll {

    VirtualPetShelter underTestShelter = new VirtualPetShelter();
    RobotCat battleKitty = new RobotCat("Fluffy", 10,10,10,10);
    RobotDog battlePuppy = new RobotDog("Fifi", 10, 10, 10, 10);
    Cat normalKitty = new Cat("Steve", 10, 10, 10, 10, 10, 10);
    Dog normalPuppy = new Dog("Eve", 10, 10, 10, 10, 10, 10);

    @Test
    public void shouldAddRobotKitty(){
        underTestShelter.addRobotPet(battleKitty);
        underTestShelter.addRobotPet(battlePuppy);
        underTestShelter.addBioPet(normalKitty);
        underTestShelter.addBioPet(normalPuppy);
        VirtualPet foundRobotCat = underTestShelter.findRobotPet("Fluffy");
        VirtualPet foundRobotDog = underTestShelter.findRobotPet("Fifi");
        VirtualPet foundBioCat = underTestShelter.findBioPet("Steve");
        VirtualPet foundBioDog = underTestShelter.findBioPet("Eve");
        assertEquals("Fluffy", foundRobotCat.getName());
        assertEquals("Fifi", foundRobotDog.getName());
        assertEquals("Steve", foundBioCat.getName());
        assertEquals("Eve", foundBioDog.getName());
    }

    @Test
    public void shouldCleanDogCages(){
        underTestShelter.findBioPet(normalPuppy.getName());
    }

}
