public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                ans++;
            } else {
                ans--;
            }
        }

        return ans;
    }
}
