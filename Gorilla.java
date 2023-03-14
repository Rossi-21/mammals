public class Gorilla extends Mammal {
    public void throwSomething(){
        energyLeval -= 5;
        System.out.println("It's not kind to throw things.");
        System.out.println(displayEnergy());
        
    }
    public void eatBannanas(){
        energyLeval += 10;
        System.out.println("Bananas are yummy!");
        System.out.println(displayEnergy());
        
    }
    public void climb(){
        energyLeval -= 10;
        System.out.println("Climbing is fun!");
        System.out.println(displayEnergy());
        
    }


}