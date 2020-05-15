package basic_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class BasicJava {

    public void get255() {
        for (var i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void getOdds255() {
        for (var i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void getSum() {

        int acumulator = 0;
        String output = "";

        for (var i = 0; i <= 255; i++) {
            acumulator += i;
            output = String.format("New number: %s, Sum: %d", i, acumulator);
            System.out.println(output);
        }
    }

    public void forArray() {
        int[] myArray = {1, 3, 5, 7, 9, 13};
//        for(int i = 0; i < myArray.length; i++){
//            System.out.println(myArray[i]);
//        }
        for (int value : myArray) {
            System.out.println(value);
        }
    }

    public void maxInArray() {
        Integer[] arr = {-3, 7, 10, 0, -5};
        System.out.println(Collections.max(Arrays.asList(arr)));
    }

    public void mean() {
        int[] arr = {2, 10, 3};
        float sum = IntStream.of(arr).sum();
        float mean = sum / arr.length;
        System.out.println(String.format("Promedio de %.0f", mean));
    }

    public void odsArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (var i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
    }

    public void greaterThanY(int[] arr, int y) {
        int counter = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > y) {
//                counter++;
//            }
//        }
        for (int value : arr) {
            if (value > y) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void squared(){
        int[] arrayOne = {1,5,10,-2};
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for(int i = 0; i < arrayOne.length; i++){
            myArray.add((int) Math.pow(arrayOne[i], 2));
        }

        System.out.println(myArray);
    }

    public void noNegative(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,10,-2));

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < 0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }

    public ArrayList<Object>  minMaxMean(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,10,-2));
        ArrayList<Object> newArray = new ArrayList<Object>();

        int max = Collections.max(numbers);
        newArray.add(max);

        int min = Collections.min(numbers);
        newArray.add(min);

        float sum = numbers.stream().mapToLong(Integer::longValue).sum();
        float mean = sum / numbers.size();
        newArray.add(mean);

        return newArray;
    }

    public void changeValues(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,10,7,-2));
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for(int i = 0; i < numbers.size()-1; i++){
            newArray.add(numbers.get(i+1));
        }
        newArray.add(0);

        System.out.println(newArray);

    }
}
