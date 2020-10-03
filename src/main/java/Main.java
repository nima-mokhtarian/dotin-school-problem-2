import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] inputArray = new int[3][3];
        String line_1 = scanner.nextLine();
        inputArray[0] = new int[]{
                Integer.parseInt(line_1.split(" ")[0]),
                Integer.parseInt(line_1.split(" ")[1]),
                Integer.parseInt(line_1.split(" ")[2])};
        String line_2 = scanner.nextLine();
        inputArray[1] = new int[]{
                Integer.parseInt(line_2.split(" ")[0]),
                Integer.parseInt(line_2.split(" ")[1]),
                Integer.parseInt(line_2.split(" ")[2])};
        String line_3 = scanner.nextLine();
        inputArray[2] = new int[]{
                Integer.parseInt(line_3.split(" ")[0]),
                Integer.parseInt(line_3.split(" ")[1]),
                Integer.parseInt(line_3.split(" ")[2])};
        int minPrice = MagicSquare.minTransferPriceToMagicSquare(inputArray);
        System.out.println("min price to change array to magic square is " + minPrice);
    }
}
