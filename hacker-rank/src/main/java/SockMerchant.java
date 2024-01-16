import java.util.HashMap;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/sock-merchant
 * */
public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20);
        int pairs = sockMerchant(9,list);
        System.out.println("Pairs = "+pairs);
    }
    public static int sockMerchant(int n, List<Integer> arr) {
        // Write your code here
        int pairCount = 0;
        HashMap<Integer,Integer> pairTrack = new HashMap<>();
        for (Integer integer : arr) {
            if (pairTrack.containsKey(integer)) {
                int currentCount = pairTrack.get(integer) + 1;
                if (currentCount == 2) {
                    pairTrack.put(integer, currentCount);
                    pairCount++;
                } else {
                    pairTrack.put(integer, 1);
                }
            } else {
                pairTrack.put(integer, 1);
            }
        }
        return pairCount;
    }
}
