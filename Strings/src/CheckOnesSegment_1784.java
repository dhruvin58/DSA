public class CheckOnesSegment_1784 {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s)
    {
        return ! s.contains("01");
    }
}
