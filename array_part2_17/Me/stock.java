package apna_java.array_part2_17.Me;

public class stock {
public static int stockBuy(int []num){
    int buy = Integer.MAX_VALUE;
    int maxProfit = 0;
    // num = stock
    for (int i=0; i< num.length; i++){
        if (buy < num[i]){
            // sell
            int profit = buy - num[i];
            maxProfit = Math.max(maxProfit, profit);
        }else {// buy time
            buy = num[i];
        }
    }
    return maxProfit;
}

    public static void main(String[] args) {

        int [] arr = { 7, 1, 5, 3, 6, 4};
        System.out.println(stockBuy(arr));
    }
}
