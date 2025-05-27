public class Smallest_Letter {
        public static void main(String[] args)
        {
            char[] letters = {'c','f','j'};
            char target = 'd';
            char ans = Smallest_Letter(letters,target);
            System.out.println(ans);

        }
        static char Smallest_Letter(char[] arr, char target)
        {
            int start = 0;
            int end = arr.length-1;
            while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(target >= arr[mid])
                {
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            return arr[start % arr.length];
        }
}
