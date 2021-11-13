package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Number_of_Moves_to_Seat_Everyone {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        for (int i = 0; i < seats.length; i++) {
            moves+=Math.abs(seats[i]-students[i]);
        }
        System.out.println(moves);


    }
}
