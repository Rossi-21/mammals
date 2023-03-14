public class Bat extends Mammal {
    public int batEnergyLeval = 300;
      public int getBatEnergy(){
        return batEnergyLeval;
    }

    public String displayBatEnergy(){
        return String.format("Your energy level is %s", getBatEnergy());
    }
    public void fly(){
        batEnergyLeval -= 50;
        System.out.println("Woooosh! The Bat is taking off!");
        System.out.println(displayBatEnergy());
        
    }
    public void eatHumans(){
        batEnergyLeval += 25;
        System.out.println("Humans are yummy!");
        System.out.println(displayBatEnergy());
        
    }
    public void attackTown(){
        batEnergyLeval -= 100;
        System.out.println("The Bat attacks a town! Fire! Burn! AAAAARGH!");
        System.out.println(displayBatEnergy());
        
    }


}