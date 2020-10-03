public class MagicSquare {
    private static int[][][] allMagicSquares = {
            { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
            { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
            { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
            { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
            { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
            { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
            { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
            { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
    };

    public static int transferPrice(int[][] a, int[][] b){
        int price = 0;
        for (int i = 0; i < 3; i++){
            for (int j =0; j < 3; j++){
                price += Math.abs(a[i][j] - b[i][j]);
            }
        }
        return price;
    }

    public static int minTransferPriceToMagicSquare(int[][] a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < allMagicSquares.length; i++) {
            int price = transferPrice(a, allMagicSquares[i]);
            if (price < min) {
                min = price;
            }
        }
        return min;
    }
}
