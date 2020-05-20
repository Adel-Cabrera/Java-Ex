package dd2;

public class Samurai extends Human {
    public String name = "Samurai";
    private int counter = 0;

    public Samurai(){
        this.setHealth(200);
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        this.setHealth(this.getHealth() / 2);
    }

    public void meditate(){
        this.setHealth(this.getHealth() + this.getHealth()/2);
    }

    public int howMany(){
        this.counter += 1;
        return this.counter;
    }

}
