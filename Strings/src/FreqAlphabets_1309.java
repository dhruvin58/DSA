public class FreqAlphabets_1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    static String freqAlphabets(String s) {
        int i=0;
        int length = s.length();

        StringBuilder sb = new StringBuilder();
        while(i<length)
        {
            if(i+2 < length && s.charAt(i+2) == '#')
            {
                String subPart = s.substring(i,i+3);
                sb.append(convert(subPart));
                i = i+3;
            }
            else
            {
                String subPart = s.substring(i,i+1);
                sb.append(convert(subPart));
                i++;
            }
        }

        return sb.toString();
    }

    static String convert(String s) {
        switch (s) {
            case "1":
                return "a";
            case "2":
                return "b";
            case "3":
                return "c";
            case "4":
                return "d";
            case "5":
                return "e";
            case "6":
                return "f";
            case "7":
                return "g";
            case "8":
                return "h";
            case "9":
                return "i";
            case "10#":
                return "j";
            case "11#":
                return "k";
            case "12#":
                return "l";
            case "13#":
                return "m";
            case "14#":
                return "n";
            case "15#":
                return "o";
            case "16#":
                return "p";
            case "17#":
                return "q";
            case "18#":
                return "r";
            case "19#":
                return "s";
            case "20#":
                return "t";
            case "21#":
                return "u";
            case "22#":
                return "v";
            case "23#":
                return "w";
            case "24#":
                return "x";
            case "25#":
                return "y";
            case "26#":
                return "z";
            default:
                return "?";
        }
    }
}
