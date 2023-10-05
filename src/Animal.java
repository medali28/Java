import java.util.Objects;

public class Animal {
    private  String family;
    private String name;
    private  int age;
    private boolean isMammal;


    public Animal() {
    }


    void cal(int i , Animal l){
        l.age=5;
        i=2;
    }

    public static void main(String args[]) {
        Animal lion = new Animal();
        lion.setFamily("Félin");
        lion.setAge(9);
        lion.setName("lion");
        lion.setMammal(true);
        System.out.println(lion.toString());
        new Animal().cal(2,lion);
        System.out.println(lion.age);
    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 ) {
            this.age = age;
        }else {
            System.out.println("Age cannot be negative");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isMammal == animal.isMammal && Objects.equals(family, animal.family) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
