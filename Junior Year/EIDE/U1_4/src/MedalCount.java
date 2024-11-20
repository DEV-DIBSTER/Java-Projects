
/**
 * @author salam.1
 * Class: MedalCount
 * Assignment: U1-4 Extension Part 5
 * Purpose: The purpose of this extension is to first store a listing of values, then generate an aligned listing of those values and then finally, summing (and displaying the sums) of those values.
 */
public class MedalCount {

	public static void main(String[] args) {

        String[] countries = {"Russia", "United States", "Norway", "Canada", "Netherlands", "Germany"}; //The countries stored as variables.

        int[][] medalCounts = {
                {13, 11, 9},
                {9, 7, 12},
                {11, 5, 10},
                {10, 10, 5},
                {8, 7, 9},
                {8, 6, 5}
        }; //The countries medals stored in 2D array.



        //The column heads for my console output stored as variables.
        String countryHeader = "Country";
        String goldHeader = "Gold";
        String silverHeader = "Silver";
        String bronzeHeader = "Bronze";
      
        System.out.printf("%-15s%-8s%-8s%-8s%n", countryHeader, goldHeader, silverHeader, bronzeHeader);

        System.out.println("==========================================");

        for (int i = 0; i < countries.length; i++) {

            System.out.printf("%-15s%-8d%-8d%-8d%n",

                    countries[i],

                    medalCounts[i][0],

                    medalCounts[i][1],

                    medalCounts[i][2]

            );

        }

        System.out.println("\n\n");
        
        //Tite col variable.
        String totalsHeader = "Totals";

        //Stores the total number of medals of each country.
        int totalGold = 0;
        int totalSilver = 0;
        int totalBronze = 0;
        

        System.out.printf("%-15s%-8s%-8s%-8s%-8s%n", countryHeader, goldHeader, silverHeader, bronzeHeader, totalsHeader);

        System.out.println("===================================================");



        for (int i = 0; i < countries.length; i++) {

            //Used this so it would be formatted in a way I could read and debug.

            System.out.printf("%-15s%-8d%-8d%-8d%-8d%n",

                    countries[i],

                    medalCounts[i][0],

                    medalCounts[i][1],

                    medalCounts[i][2],

                    (medalCounts[i][0] + medalCounts[i][1] + medalCounts[i][2])

            );

            totalGold += medalCounts[i][0];
            totalSilver += medalCounts[i][1];
            totalBronze += medalCounts[i][2];

        }

        System.out.println("===================================================");

        System.out.printf("%-15s%-8d%-8d%-8d%-8d%n", totalsHeader, totalGold, totalSilver, totalBronze, (totalGold + totalSilver + totalBronze));
    }

}  