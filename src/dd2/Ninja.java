package dd2;

public class Ninja extends Human {
    String name = "Ninja";

    public Ninja(){
        this.setStealth(10);
    }

    public void stealHealth(Human human){
        human.setHealth(human.getHealth() - this.getStealth());
        this.setHealth(this.getHealth() + this.getStealth());
    }

    public void runAway(){
        this.setHealth(this.getHealth() - 10);
    }
}
