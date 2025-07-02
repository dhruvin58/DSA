public class AddDigits_258 {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(addDigits(num));
    }
    static int addDigits(int num) {
        String s = String.valueOf(num);

        if(s.length() == 1)
        {
            return Integer.parseInt(s);
        }

        int sum = 0;
        while (num > 0)
        {
            int digit = num%10;
            sum += digit;
            num = num/10;
        }

        return addDigits(sum);
    }
}
