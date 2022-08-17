class RandNum {
    // create a 2D array
    int[][] arr = new int[5][5];

    int max = 100;
    int min = 1;

    // default constructor
    public RandNum() {
    }

    public void random() {
        int range = max - min + 1;
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "  );
            }
            System.out.println(" ]");
        }
        System.out.print(" ]");

        calculate();
    }

    public void calculate() {

        int maxVal = arr[0][0];
        int minVal = arr[0][0];
        double sum = 0.0, avgVal = 0.0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                }
                sum += arr[i][j];
                avgVal = sum / 25;

                System.out.println("\nMax value is : " + maxVal);
                System.out.println("Min value is : " + minVal);
                System.out.println("Total value is : " + sum);
                System.out.println("AVG value is : " + avgVal);
            }
        }
        display(maxVal,minVal,(int) sum,avgVal);
    }

    public void display(int maxVal, int minVal,int sumVal, double avgVal) {

        int max = maxVal;
        int min = minVal;
        int sum = sumVal;
        double avg = avgVal;
    }
}
