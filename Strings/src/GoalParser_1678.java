public class GoalParser_1678 {
    public static void main(String[] args)
    {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        char[] arr = command.toCharArray();

        int i=0;
        while(i<arr.length)
        {
            if(arr[i] == 'G')
            {
                result.append('G');
                i++;
            }
            else if(i+1 < command.length() && arr[i] == '(' && arr[i+1] == ')')
            {
                result.append('o');
                i = i+2;
            }
            else if(i+3 < command.length() && arr[i] == '(' && arr[i+1] == 'a')
            {
                result.append("al");
                i = i+4;
            }
        }
        return result.toString();
    }
}
