public class MinMaxDifference_2566 {
    public static void main(String[] args)
    {
        int num = 11891;
        System.out.println(minMaxDifference(num));
    }
    static int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];

        for(int i=0; i<str.length(); i++)
        {
            digits[i] = str.charAt(i) - '0';
        }

        int[] demo = new int[digits.length];
        for(int i=0; i<digits.length; i++)
        {
            demo[i] = digits[i];
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i=0; i<digits.length; i++)
        {
            if(digits[i] != 9)
            {
                val = digits[i];
                break;
            }
        }
        for(int i=0; i<digits.length; i++)
        {
            if(digits[i]  == val)
            {
                digits[i] = 9;
            }
        }

        int max_num = makeDigit(digits);

        int min = Integer.MAX_VALUE;
        int val_min = -1;
        for(int i=0; i<demo.length; i++)
        {
            if(demo[i] != 0)
            {
                val_min = demo[i];
                break;
            }
        }
        for(int i=0; i<demo.length; i++)
        {
            if(demo[i]  == val_min)
            {
                demo[i] = 0;
            }
        }

        int min_num = makeDigit(demo);

        return max_num - min_num;
    }
    static int makeDigit(int[] arr)
    {
        int digit = 0;
        for(int i : arr)
        {
            digit = digit * 10 + i;
        }
        return digit;
    }
}
