import java.util.Arrays;

public class SPTV21_ulesanne5_KeplastBogdan {
    public static void main(String[] args) {
        int[][] num = new int[5][];
        int[] num_all = new int[32];
        int ite = 0;
        num[0] = new int[3];
        num[1] = new int[5];
        num[2] = new int[7];
        num[3] = new int[8];
        num[4] = new int[9];
        int k = 0;
        while (k < num.length) {
            int l = 0;
            while (l < num[k].length) {
                num[k][l] = (int) (Math.random() * 50 + 50);
                l++;}
                k++;}
        printNumbers(num);
        for (int[] ints : num) {
            for (int anInt : ints) {
                num_all[ite] = anInt;
                ite++;}}
        ite = 0;
        System.out.println(" ");
        Arrays.sort(num_all);
        int s = 0;
        while (s < num.length) {
            int v = 0;
            while (v < num[s].length) {
                 num[s][v] = num_all[ite];
                 ite++;
                 v++;
                }s++;
        }
        printNumbers(num);
        }
    public static void printNumbers(int[][] numbers) {
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.print(i + " ");
            }   System.out.print("\n");
        }
    }
}