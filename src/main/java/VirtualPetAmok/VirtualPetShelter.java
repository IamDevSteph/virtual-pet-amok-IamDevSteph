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

        public void showAmokStats(){
            for(VirtualPet pets : listAllPets.values());
            System.out.println();
            //Display pet name and traits ^
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

    }

