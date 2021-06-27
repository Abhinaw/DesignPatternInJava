package dsalgo;

public class TrappingRainWaterProblem {
    // for input = arr[] = {3,0,1,2,5}
    public static void main(String[] args) {

        int arr[] = {3, 0, 1, 2, 5}, n = 5;
        System.out.println("Naive Solution:" + getWater(arr, n)); // naive solution
        System.out.println("Efficient Solution : " +
                getWaterEfficientSolution(arr, n)); // efficient Solution
    }

    /*****Naive Solution****/
    public static int getWater(int arr[], int n) {
        int res = 0;

        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];

            for (int j = 0; j < i; j++)
                lMax = Math.max(lMax, arr[j]);

            int rMax = arr[i];

            for (int j = i + 1; j < n; j++)
                rMax = Math.max(rMax, arr[j]);

            res = res + (Math.min(lMax, rMax) - arr[i]);
        }
        System.out.println("Naive Time : " + System.nanoTime());
        return res;
    }

    public static int getWaterEfficientSolution(int arr[], int n) {
        int res = 0;

        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++)
            lMax[i] = Math.max(arr[i], lMax[i - 1]);


        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rMax[i] = Math.max(arr[i], rMax[i + 1]);

        for (int i = 1; i < n - 1; i++)
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);

        System.out.println("Efficient Time::" + System.nanoTime());
        return res;
    }

}
