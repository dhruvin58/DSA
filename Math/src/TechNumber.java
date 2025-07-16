public class TechNumber {
    public static void main(String[] args) {
        System.out.println(techNUmber(2025));
    }
    static boolean techNUmber(int n)
    {
        String s = String.valueOf(n);
        int total_length = s.length();
        int half_length = total_length/2;

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int i=0; i<half_length; i++)
        {
            sb.append(s.charAt(i));
        }
        int num1 = Integer.parseInt(sb.toString());

        for (int i=half_length; i<total_length; i++)
        {
            sb1.append(s.charAt(i));
        }
        int num2 = Integer.parseInt(sb1.toString());

        int sum = num1+num2;

        return sum*sum==n;
    }
}
