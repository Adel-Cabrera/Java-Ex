package jigsaw;

import java.util.*;
import java.util.stream.IntStream;

public class PuzzleJava {


    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(shuffleNames());
        System.out.println(alphabet());
        System.out.println(getRandomNumbers());
        System.out.println(getRandomNumbers(true));
        System.out.println(createRandomChars());
        System.out.println(createRandomChars(true));

    }


    public static ArrayList<Integer> getSum() {
        int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        float sum = IntStream.of(arr).sum();
        System.out.println(String.format("Sum is %.0f", sum));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int value : arr) {
            if (value > 10) {
                numbers.add(value);
            }
        }
        return numbers;
    }

    public static ArrayList<String> shuffleNames() {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        ArrayList<String> newNames = new ArrayList<String>();

        Collections.shuffle(names);

        for (String name : names) {
            System.out.println(name);
            if (name.length() > 5) {
                newNames.add(name);
            }
        }
        return newNames;
    }

    public static ArrayList<Character> alphabet() {
        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        ArrayList<Character> charList = new ArrayList<Character>();
        for (char c : alpha) {
            charList.add(c);
        }

        Collections.shuffle(charList);
        System.out.println(charList.get(charList.size() - 1));

        char myChar = charList.get(0);
        switch (myChar) {
            case (char) 'a':
                System.out.println("Is the vowel a");
                break;
            case (char) 'e':
                System.out.println("Is the vowel e");
                break;
            case (char) 'i':
                System.out.println("Is the vowel i");
                break;
            case (char) 'o':
                System.out.println("Is the vowel o");
                break;
            case (char) 'u':
                System.out.println("Is the vowel u");
                break;
        }

        return charList;

    }

    public static ArrayList<Integer> getRandomNumbers() {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            int rand = 5 + (int) (Math.random() * ((100 - 55) + 1));
            nums.add(rand);
        }

        return nums;

    }

    public static ArrayList<Integer> getRandomNumbers(boolean sorted) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            int rand = 5 + (int) (Math.random() * ((100 - 55) + 1));
            nums.add(rand);
        }

        Collections.sort(nums);

        return nums;

    }

    public static String createRandomChars() {
        char[] alpha = new char[26];
        ArrayList<Character> myChars = new ArrayList<Character>();
        String listString = "";

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (26));
            myChars.add(alpha[random]);
        }

        for (Character s : myChars) {
            listString += s;
        }


        return listString;

    }

    public static ArrayList<String> createRandomChars(boolean chained) {
        char[] alpha = new char[26];
        ArrayList<Character> myChars = new ArrayList<Character>();
        StringBuilder listString = new StringBuilder();
        ArrayList<String> chainedStrings = new ArrayList<String>();

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }



        for (int i = 0; i < 5; i++) {

            // Se elijen 5 chars al azar y se agregan desde alpha a myChars
            for (int j = 0; j < 5; j++) {
                int random = (int) (Math.random() * (26));
                myChars.add(alpha[random]);
            }

            // Convierte cada caracter a String y lo concatena al string listString
            for (Character s : myChars)
            {
                listString.append(s.toString());
            }

            chainedStrings.add(listString.toString());
            listString = new StringBuilder();
            myChars.clear();
        }


        return chainedStrings;

    }


}


