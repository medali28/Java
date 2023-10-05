import java.util.Arrays;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
/*
        Instruction 5 :
        Animal lion = new Animal("Félin", "lion", 3, true);
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25);
*/




/*      Instruction 6 :
        On remarque qu'il faut additionner les valeurs des objets car nous avons créé un constructeur
*/




//        Instruction 7 :
        Animal lion = new Animal();
        lion.setAge(6);
        lion.setName("lion");
        lion.setMammal(true);
        lion.setFamily("Félin");

        Animal elephant = new Animal();
        elephant.setAge(5);
        elephant.setName("elephant");
        elephant.setMammal(true);
        elephant.setFamily("Éléphant");




//        Instruction 8 :

        Zoo myZoo = new Zoo();
        myZoo.setName("Mon Zoo");
        myZoo.setCity("Ma Ville");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*
        output de instruction  myZoo.displayZoo();
        Nom du zoo : Mon Zoo
        Ville du zoo : Ma Ville
        Nombre de cages : 2

        output de instruction System.out.println(myZoo); et System.out.println(myZoo.toString());
        Zoo@5f184fc6
        Zoo@5f184fc6
        */
        /*
        Lorsque vous utilisez System.out.println(myZoo); et System.out.println(myZoo.toString());
        et que la classe Zoo n'a pas redéfini la méthode toString()
        donc ils afficher adresse mémoire
        */

//        Instruction 9 :
//        pour corriger cette erreur on doit ajouter methode toString()


//        Instruction 10 :
        // on propos number de cages est 2
        Animal tigre = new Animal();
        tigre.setAge(8);
        tigre.setName("Tigre");
        tigre.setMammal(true);
        tigre.setFamily("Félin");
        boolean animal1 = myZoo.addAnimal(lion);
        boolean animal2 = myZoo.addAnimal(tigre);
        boolean animal3 = myZoo.addAnimal(elephant);
        if (animal1) {
            System.out.println("L'animal 1 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 1 n'a pas pu être ajouté au zoo.");
        }
        if (animal2) {
            System.out.println("L'animal 2 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 2 n'a pas pu être ajouté au zoo.");
        }
        if (animal3) {
            System.out.println("L'animal 3 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 3 n'a pas pu être ajouté au zoo.");
        }
        /*
        output:
        L'animal 1 a été ajouté au zoo avec succès !
        L'animal 2 a été ajouté au zoo avec succès !
        L'animal 3 n'a pas pu être ajouté au zoo.


        On note le nombre maximum d'animaux peuvent être ajoutés inferieur la valeur de nbrcages
         dans ce cas nombre de cages est 2 on peut ajouter 2 animaux .

         */


//      Instruction 11 :
        System.out.println("------------------------ Instruction 11 -------------------------");
        myZoo.displayAnimals();
        /*
        output :
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
         */
        Animal animalRecherche1 = new Animal();
        animalRecherche1.setAge(3);
        animalRecherche1.setName("lion");
        animalRecherche1.setMammal(true);
        animalRecherche1.setFamily("Félin");
        int index1 = myZoo.searchAnimal(animalRecherche1);
        if (index1 != -1) {
            System.out.println("L'animal " + animalRecherche1.getName() + " a été trouvé à l'indice: "+index1);
        } else {
            System.out.println("L'animal " + animalRecherche1.getName() + " n'a pas été trouvé dans le zoo.");
        }
        Animal animalRecherche2 = new Animal();
        animalRecherche2.setAge(2);
        animalRecherche2.setName("cat");
        animalRecherche2.setMammal(true);
        animalRecherche2.setFamily("Félin");
        int index2 = myZoo.searchAnimal(animalRecherche2);
        if (index2 != -1) {
            System.out.println("L'animal " + animalRecherche2.getName() + " a été trouvé à l'indice: "+index2);
        } else {
            System.out.println("L'animal " + animalRecherche2.getName() + " n'a pas été trouvé dans le zoo.");
        }
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
         */


        //  Créez un autre animal identique au premier
        Animal lion2 = new Animal();
        lion2.setAge(4);
        lion2.setName("lion");
        lion2.setMammal(true);
        lion2.setFamily("Félin");
        boolean animal4 = myZoo.addAnimal(lion2);
        if (animal4) {
            System.out.println("L'animal 4 a été ajouté au zoo avec succès !");
        } else {
            System.out.println("L'animal 4 n'a pas pu être ajouté au zoo.");
        }
        Animal animalRecherche3 = new Animal();
        animalRecherche3.setAge(4);
        animalRecherche3.setName("lion");
        animalRecherche3.setMammal(true);
        animalRecherche3.setFamily("Félin");
        int index3 = myZoo.searchAnimal(animalRecherche3);
        if (index3 != -1) {
            System.out.println("L'animal " + animalRecherche1.getName() + " a été trouvé à l'indice:"+index3);
        } else {
            System.out.println("L'animal " + animalRecherche1.getName() + " n'a pas été trouvé dans le zoo.");
        }
        myZoo.displayAnimals();
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 a été ajouté au zoo avec succès !
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        Animal 3:
        Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
        Animal 4:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        J'ai remarqué que la méthode renverra l'index du premier animal correspondant trouvé dans le zoo.

        */

//       Instruction 12 :
        System.out.println("------------------------ Instruction 12 -------------------------");
        /*
        pour corriger cette erreur on ajouter function boolean pour test si animail existe ou non
        avant ajouter dans le zoo et utilise function equals pour compare 2 objects
        - function equals est ajouter dans la classe animal
        - function isAnimalInZoo(animal) est ajouter dans le class Zoo et appelle dans le function addAnimal(animal)
         */
        myZoo.displayAnimals();
    /*
        output :
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 n'a pas pu être ajouté au zoo.
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        Animal 1:
        Animal{family='Félin', name='lion', age=3, isMammal=true}
        Animal 2:
        Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        Animal 3:
        Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
     */




//        Instruction 13 :
        System.out.println("------------------------ Instruction 13 -------------------------");
        myZoo.displayAnimals();
        Animal animalToRemove = new Animal();
        animalToRemove.setAge(4);
        animalToRemove.setName("lion");
        animalToRemove.setMammal(true);
        animalToRemove.setFamily("Félin");
        boolean removed = myZoo.removeAnimal(animalToRemove);
        if (removed) {
            System.out.println("L'animal a été supprimé avec succès du zoo.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo et n'a pas été supprimé.");
        }
        myZoo.displayAnimals();
        /*
            output:
            avant remove:
            Animaux dans le zoo:
            Animal 1:
            Animal{family='Félin', name='lion', age=3, isMammal=true}

            Animal 2:
            Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            Animal 3:
            Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
            *******************
            L'animal a été supprimé avec succès du zoo.
            *******************
            apres remove :
            Animaux dans le zoo:
            Animal 1:
            Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            Animal 2:
            Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
         */


//         Instruction 14 :
        /*
        final private int nbrCages = 25;
         */
//        Instruction 15 :
        boolean isZooFull = myZoo.isZooFull();
        if (isZooFull) {
            System.out.println("The zoo is full");
        } else {
            System.out.println("The zoo is not yet full");
        }

        /*
        Output:
        The zoo is not yet full.
         */
//        Instruction 16 :

        Zoo secondZoo = new Zoo();
        secondZoo.setName("Second Zoo");
        secondZoo.setCity("Ville 2");
        Animal lionToSecondZoo = new Animal();
        lionToSecondZoo.setAge(8);
        lionToSecondZoo.setName("lion");
        lionToSecondZoo.setMammal(true);
        lionToSecondZoo.setFamily("Félin");
        secondZoo.addAnimal(lionToSecondZoo);
        Animal tigerToSecondZoo = new Animal();
        tigerToSecondZoo.setAge(6);
        tigerToSecondZoo.setName("tiger");
        tigerToSecondZoo.setMammal(true);
        tigerToSecondZoo.setFamily("Félin");
        secondZoo.addAnimal(tigerToSecondZoo);
        Animal elephantToSecondZoo = new Animal();
        elephantToSecondZoo.setAge(11);
        elephantToSecondZoo.setName("elephant");
        elephantToSecondZoo.setMammal(true);
        elephantToSecondZoo.setFamily("Éléphant");
        secondZoo.addAnimal(elephantToSecondZoo);
        Animal catToSecondZoo = new Animal();
        catToSecondZoo.setAge(2);
        catToSecondZoo.setName("cat");
        catToSecondZoo.setMammal(true);
        catToSecondZoo.setFamily("Félin");
        secondZoo.addAnimal(catToSecondZoo);
        Zoo comparisonResult =myZoo.comparerZoo(myZoo,secondZoo);
        if (comparisonResult.equals(myZoo)){
            System.out.println("Zoo win is " + myZoo);
        }else{
            System.out.println("Zoo win is " + secondZoo);
        }
        comparisonResult.displayAnimals();
        /*
        output:
        Animaux dans le zoo:
        Animal :Animal{family='Félin', name='lion', age=8, isMammal=true}
        Animal :Animal{family='Félin', name='tiger', age=6, isMammal=true}
        Animal :Animal{family='Éléphant', name='elephant', age=11, isMammal=true}
        Animal :Animal{family='Félin', name='cat', age=2, isMammal=true}


         */
    }
}

