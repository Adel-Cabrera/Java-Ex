package zoo_bat;

public class Bat extends Mammal{

    public Bat(){
        this.setEnergy(300);
    }

    public void fly(){
        System.out.println("ffffffffffffffffffff");
        this.setEnergy(getEnergy() - 50);
    }

    public void eatHumans(){
        System.out.println("aaarrggghhh");
        this.setEnergy(getEnergy() + 25);
    }

    public void attackTown(){
        System.out.println("ggggggg");
        this.setEnergy(getEnergy() - 100);
    }

}
