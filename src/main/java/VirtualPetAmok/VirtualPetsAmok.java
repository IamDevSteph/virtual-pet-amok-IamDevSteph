package VirtualPetAmok;

import java.util.Scanner;

public class VirtualPetsAmok {

    public static void main(String[] args) {

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);

        RobotCat battleKitty = new RobotCat("Fluffy", 10, 10, 10, 10);
        RobotDog battlePuppy = new RobotDog("Fifi", 10, 10, 10, 10);
        Cat normalKitty = new Cat("Steve", 10, 10, 10, 10, 10, 10);
        Dog normalPuppy = new Dog("Summer", 10, 10, 10, 10, 10, 10);

        myVirtualPetShelter.addPet(battleKitty);
        myVirtualPetShelter.addPet(battlePuppy);
        myVirtualPetShelter.addPet(normalKitty);
        myVirtualPetShelter.addPet(normalPuppy);


        String userChoice;
        String userChoice2;
        String userChoice3;


        System.out.println("Welcome to Stephanie's virtual pet amok!");
        System.out.println("");
        System.out.println("These pets are out of control! Let's get them calmed down to find them a new home!");
        System.out.println("You also have robotic pets to take care of as well");
        System.out.println("");
        System.out.println("What do you call yourself?");
        userChoice = input.nextLine();
        System.out.println("");
        System.out.println("Thank you " + userChoice + " for being brave enough to take on this task!");

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        myVirtualPetShelter.showCatStats();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        myVirtualPetShelter.showDogStats();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        myVirtualPetShelter.showRoboCatStats();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        myVirtualPetShelter.showRoboDogStats();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");


        do {
//            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
//            myVirtualPetShelter.showCatStats();
//            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
//            myVirtualPetShelter.showDogStats();
//            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
//            myVirtualPetShelter.showRoboCatStats();
//            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
//            myVirtualPetShelter.showRoboDogStats();
//            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");


            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("Choose your method");
            System.out.println("");
            System.out.println("Press 1 to feed pets");
            System.out.println("");
            System.out.println("Press 2 to give water to pets");
            System.out.println("");
            System.out.println("Press 3 to drop the kids off the super bowl");
            System.out.println("");
            System.out.println("Press 4 to clean their cage");
            System.out.println("");
            System.out.println("Press 5 to adopt out a pet");
            System.out.println("");
            System.out.println("Press 6 to rescue a pet");
            System.out.println("");
            System.out.println("Press 7 to repair your robots");
            System.out.println("");
            System.out.println("Press 8 to oil your robots");
            System.out.println("");
            System.out.println("Press 9 to walk the dogs");
            System.out.println("");
            System.out.println("Type 10 to clean the litter box and dog cages");
            System.out.println("");
            System.out.println("Type 11 to check their status");
            System.out.println("");
            System.out.println("Type 12 to clock out for the day");
            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                System.out.println("You have decided to feed the pets");
                myVirtualPetShelter.feed();
            }
            if (userChoice.equals("2")) {
                System.out.println("You decided to give water to your organic pets");
                myVirtualPetShelter.water();
            }
            if (userChoice.equals("3")) {
                System.out.println("You have decided to give your pets their bathroom relief");
                myVirtualPetShelter.emptyPoopInventory();

            }
            if (userChoice.equals("4")) {
                System.out.println("You have decided to clean their cage");
                myVirtualPetShelter.cageNeedsCleaning();
            }
            if (userChoice.equals("5")) {
                System.out.println("Who would you like to adopt out?");
                System.out.println("");
                myVirtualPetShelter.showListOfAmokPets();
                userChoice2 = input.nextLine();
                myVirtualPetShelter.listAllPets.remove(userChoice2);
            }
            if (userChoice.equals("6")) {
                System.out.println("Let's bring in a new pet to rehabilitate");
                System.out.println("What kind of breed are they?");
                System.out.println("");
                System.out.println("A" + ") Dog");
                System.out.println("B" + ") Cat");
                System.out.println("C" + ") RobotDog");
                System.out.println("D" + ") RobotCat");
                userChoice = input.nextLine();

                if (userChoice.equals("A")) {
                    System.out.println("What will you name your dog?");
                    String dogName = input.nextLine();
                    VirtualPet newDog = new Dog(dogName, 10, 10, 10, 10, 10, 0);
                    myVirtualPetShelter.addPet(newDog);

                }
                if (userChoice.equals("B")) {
                    System.out.println("What will you name your cat?");
                    String catName = input.nextLine();
                    VirtualPet newCat = new Cat(catName, 10, 10, 10, 10, 10, 0);
                    myVirtualPetShelter.addPet(newCat);

                }
                if (userChoice.equals("C")) {
                    System.out.println("What will you name your robot dog?");
                    String roboDogName = input.nextLine();
                    VirtualPet newRoboDog = new RobotDog(roboDogName, 10, 10, 10, 10);
                    myVirtualPetShelter.addPet(newRoboDog);

                }
                else if (userChoice.equals("D")) {
                    System.out.println("What will you name your robot cat?");
                    String roboCatName = input.nextLine();
                    VirtualPet newRoboCat = new RobotCat(roboCatName, 10, 10, 10, 10);
                    myVirtualPetShelter.addPet(newRoboCat);
                }

            }if(userChoice.equals("7")){
                System.out.println("Let's repair our robotic friends");
                myVirtualPetShelter.repairRobots();
                System.out.println("");
                System.out.println("You have done maintenance to your pets");
            }
            if(userChoice.equals("8")){
                System.out.println("Let's oil our robotic friends to keep their gears running smoothly!");
                myVirtualPetShelter.oilRobots();
                System.out.println("");
                System.out.println("This is great! They are operating much more smoothly now!");
            }
            if(userChoice.equals("9")){
                System.out.println("Alright, let's take our dogs for a walk!");
                myVirtualPetShelter.walkTheDogs();
            }
            if(userChoice.equals("10")){
                System.out.println("Time for our mandatory cleaning of the litter box and dog cages!");
                myVirtualPetShelter.cageNeedsCleaning();
                myVirtualPetShelter.litterBoxNeedsCleaning();
            }
            if(userChoice.equals("11")){
                System.out.println("Let's check their status");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                myVirtualPetShelter.showCatStats();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                myVirtualPetShelter.showDogStats();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                myVirtualPetShelter.showRoboCatStats();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                myVirtualPetShelter.showRoboDogStats();
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            }


        }while (!userChoice.equals("12"));
            System.out.println("You have decided to clock out for the day");
            System.out.println("");
            System.out.println("THank you for helping me with my shelter! It was running amok!");

            myVirtualPetShelter.tickAll();

    }

}






