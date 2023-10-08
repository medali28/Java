package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;

public class Zoo {
    private  ArrayList<Animal> animals ;
    private String name;
    private String city;
    final private int nbrCages = 25;

    public String getName() {
        return name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setName(String name) {
      if (name.isEmpty()){
          this.name = name;
      }else{
          System.out.println("Name not empty");
          System.exit(0);
      }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Zoo() {
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "name=" + name + "\n" +
                ", city=" + city + "\n" +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public int searchAnimal(Animal animalToSearch) {
        for (Animal animal : animals)
        {
            if (animal.getName().equals(animalToSearch.getName())){
                return  animals.indexOf(animalToSearch) ;
             }
        }
       return  -1;
    }

     public boolean addAnimal(Animal animal) {
        if (!isZooFull() && !animals.contains(animal) ) {
            animals.add(animal);
            return true;
        }
        return false;
    }



    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (Animal animal : animals)
        {
            System.out.println(animal);
        }
    }

     public boolean removeAnimal(Animal animalToRemove) {
        return  animals.remove(animalToRemove);
    }


    public boolean isZooFull() {
        return animals.size() == nbrCages;
    }


    public Zoo comparerZoo(Zoo myZoo, Zoo secondZoo) {
        return myZoo.animals.size() < secondZoo.animals.size() ? secondZoo:myZoo;
    }
}
