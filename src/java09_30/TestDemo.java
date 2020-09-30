package java09_30;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-30
 * Time:20:55
 **/
public class TestDemo {
    public static int findMax(int[] array){
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            max = array[0];
            if (array[i] > max){

            }
        }
    }
    public static void main(String[] args) {

    }

    public static int[] copyArray(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static void main2(String[] args) {
        int[] array = {12,23,34,45};
       /* int[] tmp = copyArray(array);
        System.out.println(Arrays.toString(tmp));*/
    }
    public static String myToString(int[] arr){
        String tmp = "[";
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
            if (i != arr.length-1){
                tmp += ",";
            }
        }
        return tmp+"]";
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        String tmp = myToString(array);
        System.out.println(tmp);
    }
}
