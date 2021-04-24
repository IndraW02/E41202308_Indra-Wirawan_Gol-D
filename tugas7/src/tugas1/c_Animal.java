
package tugas1;

public class c_Animal {
    public void makeNoise() {
        System.out.println("talk");
    }

    public static void main(String[] args) {
        c_Animal animal = new c_Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        c_Animal animalDog = new Dog();
        animalDog.makeNoise();
        
        if(animal instanceof c_Animal) {
            System.out.println("animal is Animal");
        }
        
        if (dog instanceof c_Animal) {
            System.out.println("dog is Animal");
        }
        
        if (animalDog instanceof c_Animal) {
            System.out.println("animalDog is Animal");
        }
        
        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
    
    
}

class Dog extends c_Animal {
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
}


