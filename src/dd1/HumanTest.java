package dd1;

public class HumanTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Wizard wizard = new Wizard();
        Samurai samurai = new Samurai();

        ninja.attack(wizard);
        System.out.println(wizard.name + " health: " + wizard.getHealth());
        samurai.attack(ninja);
        samurai.attack(ninja);
        System.out.println(ninja.name + " health: " + ninja.getHealth());
        wizard.attack(samurai);
        wizard.attack(samurai);
        wizard.attack(samurai);
        System.out.println(samurai.name + " health: " + samurai.getHealth());

    }
}
