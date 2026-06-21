public class DigitFrequencyScore_3945 {
    public static void main(String[] args) {
        int n = 122;
        System.out.println(digitFrequencyScore(n));
    }
    public static int digitFrequencyScore(int n) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        while (n != 0)
//        {
//            int digit  = n%10;
//            map.put(digit, map.getOrDefault(digit,0)+1);
//            n /= 10;
//        }
//
//        int total = 0;
//        for (Map.Entry<Integer,Integer> entry : map.entrySet())
//        {
//            total += entry.getKey()*entry.getValue();
//        }
//
//        return total;
        int total = 0;
        while (n != 0)
        {
            int digit  = n%10;
            total += digit;
            n /= 10;
        }
        return total;
    }
}
