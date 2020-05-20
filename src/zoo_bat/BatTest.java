package zoo_bat;

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        System.out.println(bat.getEnergy());

        bat.attackTown();
        System.out.println(bat.getEnergy());

        bat.attackTown();
        System.out.println(bat.getEnergy());

        bat.attackTown();
        System.out.println(bat.getEnergy());

        bat.eatHumans();
        System.out.println(bat.getEnergy());

        bat.eatHumans();
        System.out.println(bat.getEnergy());

        bat.fly();
        System.out.println(bat.getEnergy());

        bat.fly();
        System.out.println(bat.getEnergy());

    }
}
