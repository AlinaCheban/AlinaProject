package ua.edu.npu.lab06.task03;

public class Application {
    public static void main(String[] args) {
        Interface inter;
        inter = (String str) -> {
            String reverse;
            StringBuilder sb = new StringBuilder();
            for (int i=(str.length()-1); i>=0; i--) {
                sb.append(str.charAt(i));
            }
            reverse = sb.toString();
            return reverse;
        };
        System.out.println(inter.method("Kelvin"));
        inter = (String str) -> {
            for (int i = 0; i < str.length(); i++) {
                if(!Character.isDigit(str.charAt(i))){
                    str = str.substring(0, i) + ' ' + str.substring(i+1);
                }
            }
            return str;
        };
        System.out.println(inter.method("afs47 6s sf 6gfr3s4"));
        inter = (String str) -> {
            str = str.toLowerCase();
            String reverse;
            StringBuilder sb = new StringBuilder();
            for (int i=(str.length()-1); i>=0; i--) {
                sb.append(str.charAt(i));
            }
            reverse = sb.toString();
            if (str.equals(reverse)){
                return "Palindrome";
            }
            else {
                return "";
            }
        };
        System.out.println(inter.method("Radar"));
    }
}
