import java.util.Arrays;

public class FillDownUp {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        int[] array = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12
        };

        int[][] array2D = new int[3][4];

        int counter = 0;

        for (int row = 0; row < array2D.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < array2D[0].length; col++) {

                    array2D[row][col] = array[counter];
                    
                    counter++;
                }
            } else {
                for (int col = array2D[0].length; col > 0; col--) {
                    array2D[row][col - 1] = array[counter];

                    counter++;
                }
            }
        }

        System.out.println("1D Array:\n" + Arrays.toString(array) + "\n\n");

        System.out.println("2D Array: ");

        for (int row = 0; row < array2D.length; row++) {

            for (int col = 0; col < array2D[0].length; col++) {

                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}