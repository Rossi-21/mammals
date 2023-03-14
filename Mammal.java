public class Mammal {
    public int energyLeval = 100;

    public int getEnergy(){
        return energyLeval;
    }

    public String displayEnergy(){
        return String.format("Your energy level is %s", getEnergy());
    }

}