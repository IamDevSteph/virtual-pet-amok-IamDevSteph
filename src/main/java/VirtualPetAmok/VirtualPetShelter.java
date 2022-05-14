package VirtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter implements PuppyDuties{

        Map<String, VirtualPet> listAllPets = new HashMap<>();

        public Collection<VirtualPet> AllPets(){

            return listAllPets.values();
        }

        public void addPet(VirtualPet petToAdd){
            listAllPets.put(petToAdd.getName(), petToAdd);
        }

        public void removePet(VirtualPet petToRemove){
            listAllPets.remove(petToRemove.getName(), petToRemove);
        }

        public VirtualPet findPet(String petName){
            return listAllPets.get(petName);
        }

        public void showListOfAmokPets(){
            for(String amokPets : listAllPets.keySet()){
                System.out.println(amokPets);
                listAllPets.toString();
            }
        }

        public void showCatStats(){
            for(VirtualPet bioCat : listAllPets.values()) {
                if(bioCat instanceof Cat)
                System.out.println("Cat name: " + bioCat.getName() + "|" + "Happiness : " + bioCat.getHappiness() + "|" + "Health: " + bioCat.getHealthLevel() + "|" + "Hunger: " + ((Cat) bioCat).getHungerLevel() + "|" + "Water: " + ((Cat) bioCat).getWaterLevel() + "|" + "Boredom: " + ((Cat) bioCat).getBoredom() + "|" + "Litter Box: " + ((Cat) bioCat).getLitterBox());
            }
            //Display pet name and traits ^
        }
        public void showDogStats(){
            for(VirtualPet bioDog : listAllPets.values()){
                if(bioDog instanceof Dog)
                    System.out.println("Dog name: " + bioDog.getName() + "|" + "Happiness : " + bioDog.getHappiness() + "|" + "Health: " + bioDog.getHealthLevel() + "|" + "Hunger: " + ((Dog) bioDog).getHungerLevel() + "|" + "Thirst: " + ((Dog) bioDog).getWaterLevel() + "|" + "Poop Inventory: " + ((Dog) bioDog).getPoopInventory() + "|" + "Cage dirtiness: " + ((Dog) bioDog).getCage());
                }
        }
        public void showRoboDogStats(){
            for(VirtualPet roboDog : listAllPets.values()){
                if(roboDog instanceof RobotDog)
                    System.out.println("Robot Dog name: " + roboDog.getName() + "|" + "Health: " + roboDog.getHealthLevel() + "|" + "Condition: " + ((RobotDog) roboDog).getConditionLevel() + "|" + "Oil Level: " + ((RobotDog) roboDog).getOilLevel());
            }
        }
        public void showRoboCatStats(){
            for(VirtualPet roboCat : listAllPets.values()){
                if(roboCat instanceof RobotCat)
                    System.out.println("Robot Cat name: " + roboCat.getName() + "|" + "Happiness: " + roboCat.getHappiness() + "|" + "Health: " + roboCat.getHealthLevel() + "|" + "Condition: " + ((RobotCat) roboCat).getConditionLevel() + "|" + "Oil Level: " + ((RobotCat) roboCat).getOilLevel());
            }
        }

        public void oilRobots(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Robotic) {
                    Robotic roboticPet = (Robotic) pet;
                    roboticPet.oilRobots();
                }
            }
        }


        public void repairRobots(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Robotic){
                    Robotic roboticPet = (Robotic) pet;
                    roboticPet.repairRobots();
                }
            }
        }
        public void feed(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Organic){
                    Organic organicPet = (Organic) pet;
                    organicPet.feed();
                }
            }
        }
        public void water(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Organic){
                    Organic organicPet = (Organic) pet;
                    organicPet.water();
                }
            }
        }
        public void emptyPoopInventory(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Organic){
                    Organic organicPet = (Organic) pet;
                    organicPet.emptyPoopInventory();
                }
            }
        }
        public void cageNeedsCleaning(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Dog){
                    Dog organicPet = (Dog) pet;
                    organicPet.cageNeedsCleaning();
                }
            }
        }
        @Override
        public void walkTheDogs(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof PuppyDuties){
                    pet.walkTheDogs();


                }
            }

        }
        public void litterBoxNeedsCleaning(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Cat){
                    Cat organicPet = (Cat) pet;
                    organicPet.litterBoxNeedsCleaning();
                }
            }
        }
        public void playWithPets(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof VirtualPet){

                }
            }
        }
        public void useCatNip(){
            for(VirtualPet pet : listAllPets.values()){
                if(pet instanceof Cat){
                    Cat organicPet = (Cat) pet;
                    organicPet.useCatNip();
                }
            }
        }

        public void tickAll(){
            for(VirtualPet pet : listAllPets.values()){
                pet.tickAll();
            }
        }

    }

