package zoo_bat;

public class Mammal {
    private int energy = 100;

    public Mammal() {

    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int displayEnergy(){
        System.out.println(energy);
        return this.energy;
    }
}
