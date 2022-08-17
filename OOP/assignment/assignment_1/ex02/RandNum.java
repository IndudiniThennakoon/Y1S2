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

    }

    public void calculate() {

        int maxVal = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }

    }
}
