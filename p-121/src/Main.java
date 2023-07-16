public class Main {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,2,10,1,4}));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int todayProfit;

        for (int todayPrice : prices) {
            if (todayPrice < minPrice) {
                minPrice = todayPrice;
            }

            todayProfit = todayPrice - minPrice;
            if (todayProfit > maxProfit) {
                maxProfit = todayProfit;
            }
        }
        return maxProfit;
    }
}