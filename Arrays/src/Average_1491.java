import java.util.Arrays;

public class Average_1491 {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
//        Arrays.sort(salary);
//
//        double sum = 0;
//        int count = 0;
//        for(int i=1; i<salary.length-1; i++)
//        {
//            sum += salary[i];
//            count++;
//        }
//
//        return sum / count;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int s : salary)
        {
            sum += s;
            min = Math.min(s,min);
            max = Math.max(s,max);
        }
        double finalSum = sum - min - max;
        int length = salary.length-2;
        return finalSum/ length;

    }
}
