package apna_java.array_part2_17.topic;

public class bestTimeToBuyAndSellStock {
    public static int sellAndBuyStock(int[] stockPrice) {
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < stockPrice.length; i++) {
            if (buyPrice < stockPrice[i]) {
                //yaha par stock becha jata hai
                int profit = stockPrice[i] - buyPrice;
                maxPrice = Math.max(profit, maxPrice);
            } else {
                //yaha par stock kharida jata hai
                buyPrice = stockPrice[i];
            }
        }
        return maxPrice;
    }

/*
    public static int sellAndBuyStock(int[] stockPrice){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i=0; i<stockPrice.length; i++){
            if (buyPrice < stockPrice[i]){
                int profit = stockPrice[i] - buyPrice;
                maxPrice = Math.max(maxPrice, profit);
            }else {
                buyPrice = stockPrice[i];
            }
        }
        return maxPrice;
    }*/
    public static void main(String[] args) {
        int[] stockPrice = {7, 1, 5, 3, 6, 4}; // O(n)
        System.out.println(sellAndBuyStock(stockPrice));
    }

}
