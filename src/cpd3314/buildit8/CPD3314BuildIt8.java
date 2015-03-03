/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.buildit8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314BuildIt8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this Sandbox to Access the Methods Below
        doExercise6();
    }

    /**
     * Build me a program that asks the user for three numbers, and then outputs
     * them in reverse order. (eg- 1 2 3  3 2 1). Use arrays.
     */
    public static void doExercise1() {
        int[] nums = new int[3];
        Scanner kb = new Scanner(System.in);
        System.out.println("Number 1: ");
        nums[0] = kb.nextInt();
        System.out.println("Number 2: ");
        nums[1] = kb.nextInt();
        System.out.println("Number 3: ");
        nums[2] = kb.nextInt();
        System.out.printf("You gave %d, %d, %d\n", nums[2], nums[1], nums[0]);
    }

    /**
     * Build a program that builds an array of integers. Initialize the array to
     * hold 100 integers. Use a for-loop to set each element to a random number
     * between 1-100. Use a second for-loop to output all 100 elements.
     */
    public static void doExercise2() {
        Random random = new Random();
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * Quick! Change the for-loops in the previous Build It to advanced
     * for-loops. How does the behavior differ? Why? What does that mean?
     */
    public static void doExercise3() {
        Random random = new Random();
        int[] nums = new int[100];
        for (int n : nums) {
            n = random.nextInt(100) + 1;
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }

    /**
     * Take a few minutes to solve this problem: Retrieve five grades from user
     * input. Store them in an array. Calculate: the average, the highest, the
     * lowest and the median (the one in the middle). Display all calculated
     * values.
     */
    public static void doExercise4() {
        int[] grades = new int[5];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            grades[i] = kb.nextInt();
        }

        int sum = 0;
        int min = grades[0];
        int max = grades[0];
        for (int g : grades) {
            sum += g;
            if (g < min) {
                min = g;
            }
            if (g > max) {
                max = g;
            }
        }
        double avg = (double) sum / grades.length;
        Arrays.sort(grades);
        int median = grades[grades.length / 2];

        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Median: " + median);
    }

    /**
     * Build a method called getSquared that accepts an array of integers, and
     * returns a new array of integers that has the value of the originals,
     * squared.
     *
     * @param array - The original array
     * @return - An array with the original values squared
     */
    
    public static int[] getSquared(int[] array) {
        int[] newArray = array.clone();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] *= newArray[i];
        }
        return newArray;
    }

    /**
     * Build a conversion table. First column is Celsius temperatures (0-20)
     * second column is Fahrenheit temperatures (32-68)
     *
     * Conversion formula is: F = (9/5) * C + 32
     *
     */
    
    public static void doExercise6() {
        double[][] cToF = new double[2][21];
        final int CELSIUS = 0;
        final int FAHRENHEIT = 1;
        for (int i = 0; i < cToF[0].length; i++) {
            cToF[CELSIUS][i] = i;
            cToF[FAHRENHEIT][i] = (9.0 / 5) * i + 32;
        }

        for (int i = 0; i < cToF.length; i++) {
            for (int j = 0; j < cToF[i].length; j++) {
                System.out.printf("%.1f\t", cToF[i][j]);
            }
            System.out.println();
        }
    }
}
