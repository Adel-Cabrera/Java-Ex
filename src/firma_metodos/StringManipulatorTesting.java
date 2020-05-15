package firma_metodos;

public class StringManipulatorTesting {
    public static void main(String[] args){

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMuno

        char letter = 'n';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
        Integer c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // null

        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        Integer aa = manipulator.getIndexOrNull(word, subString);
        Integer bb = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(aa); // 2
        System.out.println(bb); // null

        String wordTwo = manipulator.concatSubstring("Hola", 1, 2, "mundo");
        System.out.println(wordTwo); // omundo

    }
}
