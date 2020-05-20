package zoo;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla coco = new Gorilla();
        coco.throwSomething();
        coco.throwSomething();
        coco.throwSomething();
        coco.eatBananas();
        coco.eatBananas();
        coco.climb();

        System.out.println(coco.getEnergy());
    }

}
