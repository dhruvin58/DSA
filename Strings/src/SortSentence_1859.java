public class SortSentence_1859 {
    public static void main(String[] args) {
       String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] sortedArr = new String[arr.length];
        for (String part : arr)
        {
            StringBuilder sb = new StringBuilder(part);
            int ch = part.charAt(part.length() - 1)-'0';
            sortedArr[ch-1] = String.valueOf(sb.deleteCharAt(sb.length()-1));
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String finalArr : sortedArr)
        {
            if (count== sortedArr.length-1)
            {
                stringBuilder.append(finalArr);
            }
            else
            {
                stringBuilder.append(finalArr);
                stringBuilder.append(" ");
            }
            count++;
        }

        return stringBuilder.toString();

    }
}
