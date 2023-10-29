package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Aquatic extends Animal{
    private  String habitat ;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    @Override
    public String toString() {
        return "Aquatic{"  +
                super.toString()+
                ", habitat='" + habitat + '\'' +
                '}';
    }


//    public void swim(){
//        System.out.println("This aquatic animal is swimming.");
//    }
    @Override
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aquatic aquatic = (Aquatic) o;
        return super.getAge() == aquatic.getAge() &&
                Objects.equals(super.getName(), aquatic.getName()) &&
                Objects.equals(habitat, aquatic.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
