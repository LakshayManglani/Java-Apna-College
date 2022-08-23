package _VQ;

public class _VQ_11_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };

        calculateMaxPrice(price);
    }

    public static void calculateMaxPrice(int price[]) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        int buyDay = 0;
        int sellDay = 0;
        int check = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyingPrice > price[i]) {
                buyingPrice = price[i];
                buyDay = i + 1;
            }
            check = price[i] - buyingPrice;
            if (check >= -1 && check >= maxProfit) {
                maxProfit = price[i] - buyingPrice;
                sellDay = i + 1;
            }
        }
        System.out.println("\nBuying Day : " + buyDay + ", Buying Price : " + buyingPrice);
        System.out.println("\nSelling Day : " + sellDay + ", Selling Price : " + (maxProfit + buyingPrice));
        System.out.println("\n\nProfit : " + maxProfit);
    }
}
