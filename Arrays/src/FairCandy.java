import java.util.Arrays;
import java.util.HashSet;

public class FairCandy {
    public static void main(String[] args)
    {
        int[] aliceSizes = {1,1}, bobSizes = {2,2};
        int[] ans = fairCandySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    static int[] fairCandySwap(int[] A, int[] B)
    {
        int sumA = 0;
        int sumB = 0;

        for(int a: A)
        {
            sumA += a;
        }
        for(int b: B)
        {
            sumB += b;
        }

        int diff = (sumB - sumA) /2;

        HashSet<Integer> setB = new HashSet<>();

        for(int b : B)
        {
            setB.add(b);
        }

        for(int a : A)
        {
            int target = a + diff;
            if(setB.contains(target))
            {
                return new int[]{a,target};
            }
        }
        return new int[]{-1,-1};
    }
}
 /*
Compute sumA and sumB

Compute diff = (sumB - sumA) / 2

Store all elements of B in a HashSet

For each a in A, check if a + diff exists in B’s set

If yes, return {a, a + diff}


formula steps:

first we calculate sum of the both array sumA and sumB

sumA -a +b = sumB +a -b then we can say that pair is right and both have the equal candies
sumA - sumB = a-b+a-b
sumA - sumB = 2a - 2b

if we divide both of them by 2 then...
(sumA - sumB) / 2 = a-b

if we make b as anchor then

b = a - (sumA - sumB) /2

if we flip the sign then..

b = a + (sumB - sumA) /2

so we check for every a is there any b(diff) available in b named array..

hashset is just only for quick look up o(1) complexity to find element called diff in B
  */