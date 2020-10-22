package com.example.session12;

public class ArraySample {

    public static void main(String[] args) {
        float score[] = new float[10];
        score[0] = 19;
        score[1] = 18;
        score[2] = 19.5f;
        score[3] = 10;
        score[4] = 12;
        score[5] = 18.75f;
        score[6] = 18.25f;
        score[7] = 15.75f;
        score[8] = 12.5f;
        score[9] = 13.75f;
        printScores(score);
        System.out.println("\n");
        sort(score);
        printScores(score);
        System.out.printf("Average is: %.2f\n", average(score));
        System.out.printf("Best score: %.2f\n", max(score));
        System.out.printf("Worst score: %.2f\n", min(score));
    }


    public static void printScores(float score[]) {
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + ": " + score[i]);
        }
    }

    public static float average(float numbers[]) {
        float sum = 0;
        /*
        for (int i = 0; i < numbers.length; i++) {
            float number = numbers[i];
        }
         */

        for(float number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static float max(float numbers[]) {
        float max = Float.NEGATIVE_INFINITY;
        for (float number : numbers) {
            max = (max < number) ? number : max;
        }
        return max;
    }

    public static float maxAlternative(float numbers[]) {
        float max = numbers[0];
        for (float number : numbers) {
            max = (max < number) ? number : max;
        }
        return max;
    }

    public static float min(float numbers[]) {
        float min = Float.POSITIVE_INFINITY;
        for (float number : numbers) {
            min = (min > number) ? number : min;
        }
        return min;
    }

    public static float[] sort(float numbers[]) {
        for(int i = 0; i < numbers.length; i++ ) {
            for( int j = i +1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    float temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
}
