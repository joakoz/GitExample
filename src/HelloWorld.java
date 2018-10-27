public class HelloWorld {

    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        double c = a / (double) b;
// musimy zamienic na double

        String name = "Monika bla";

        int[] tablica = {1, 2, 3};
        double[] tablica1 = new double[10];
        tablica1[0]=0.9;
// jeszcze są tablice wielowymiarowe. tablica w tablicy: int[][] tablica = new int[3][];
// --> 3 półeczki i nie jest określone ile kolumn
        int[][] f = new int[3][];
        f[0] = new int[5];
        f[1] = new int[3];
        f[2] = new int[2];
        f[1][0] = 1;
        System.out.println();

    }
}
