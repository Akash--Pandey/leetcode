package pundeyJava;

public class MinimumDeletionCost {

    public static void main(String[] args) {
        String s = "abaaccc";
        int [] cost = {1, 2, 3, 4, 5,1,3};

        System.out.println(minCost(s, cost));
    }

    /**
     *
     * @param s
     * @param cost
     * @return
     */
    private static int minCost(String s, int[] cost) {

        int n = s.length();
        int minCost=0 ;

        for(int i =0 ;i<n; ){

            int j = i+1;
            int sum = cost[i];
            int max = cost[i];

            while(j<n && s.charAt(j)==s.charAt(i)){

                //find max cost from consecutive repeated characters
                max= Math.max(max,cost[j]);

                //calculate total cost for all consecutive characters
                sum+=cost[j];
                j++;

            }

            i=j;

            //calculate minimum cost to remove duplicate characters by subtracting max value of duplicate chharacters
            minCost+=sum-max;

        }

        return  minCost;

    }
}