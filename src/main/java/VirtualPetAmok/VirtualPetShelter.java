package VirtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

        Map<String, Organic> bioList = new HashMap<>();
        Map<String, Robotic> roboticList = new HashMap<>();
//        private int roboticID;
//        //Considering deleting organicID and just have roboticID as an array list, numerical values as a pet microchip.
//        private int organicID;

        public Collection<Robotic> getAllMechs(){
            return roboticList.values();
        }
        public Collection<Organic> getAllBios(){
            return bioList.values();
            //I think I need to create another Abstract class for BioPets. Just like what I did for Robotic pets
        }

        public void addRobotPet(VirtualPet roboticToAdd){
//            roboticID++;
            roboticList.put(roboticToAdd.getName(), (Robotic) roboticToAdd);
        }

        public void removeRobotPet(Robotic robotToRemove){
        roboticList.remove(robotToRemove.getName(), robotToRemove);

        }


        public void addBioPet(Organic organicToAdd){
//            organicID++;
            bioList.put(organicToAdd.getName(), organicToAdd);
        }

        public void removeBioPet(Organic organicToRemove){
            bioList.remove(organicToRemove.getName(), organicToRemove);
        }

        public VirtualPet findBioPet(String petName){
            return bioList.get(petName);
        }
        public VirtualPet findRobotPet(String petName){
            return roboticList.get(petName);
        }

    }

