import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Kata {

    public static int equalizeArray(List<Integer> arr) {

        List<Integer> nums = new ArrayList<>();
        int maxNum = arr.stream().max((i, j) -> i.compareTo(j)).get();

        for (int i = 0; i <= maxNum; i++) {
            nums.add(0);
        }

        int max = 0;
        for (Integer integer : arr) {
            System.out.println(nums.get(integer));
            int temp = nums.get(integer) + 1;
            if (temp > max) {
                max = temp;
            }
            nums.set(integer, temp);

        }

        return arr.size() - max;

    }

    public static void main(String[] args) {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter wr = new BufferedWriter(null)

        int num = Kata.equalizeArray(Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3));
        System.out.println("number: " + num);
        // List<Integer> temp = new ArrayList<>(Arrays.asList(1, 2, -3, 4, 5));

        // System.out.println("values: " + temp);
        // int min = temp.stream().min((i, j) -> i.compareTo(j)).get();
        // System.out.println("minimum value: " + min);
        // System.out.println("values: " + temp);

    }
}