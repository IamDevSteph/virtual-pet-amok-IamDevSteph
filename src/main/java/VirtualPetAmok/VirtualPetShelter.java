package VirtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

        Map<String, Organic> bioList = new HashMap<>();
        Map<String, Robotic> roboticList = new HashMap<>();
        private int roboticID;
        private int organicID;

        public Collection<Robotic> getAllMechs(){
            return roboticList.values();
        }
        public Collection<Organic> getAllBios(){
            return bioList.values();
            //I think I need to create another Abstract class for BioPets. Just like what I did for Robotic pets
        }

        public void addRobotPet(VirtualPet roboticToAdd){
            roboticID++;
            roboticList.put(roboticToAdd.getName(), (Robotic) roboticToAdd);
        }

        public void addBioPet(Organic organicToAdd){
            organicID++;
            bioList.put(organicToAdd.getName(), organicToAdd);
        }
        public VirtualPet findBioPet(String petName){
            return bioList.get(petName);
        }
        public VirtualPet findRobotPet(String petName){
            return roboticList.get(petName);
        }



    }
