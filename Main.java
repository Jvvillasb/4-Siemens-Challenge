import java.util.Scanner;

public class Main {
    public static String concatRemove(String s, String t, int k) {
        int commonLength = 0;
        while (commonLength < Math.min(s.length(), t.length()) && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }
        
        int operationsNeeded = (s.length() - commonLength) + (t.length() - commonLength);
        
        return (k == operationsNeeded || (k > operationsNeeded && (k - operationsNeeded) % 2 == 0) || k >= s.length() + t.length()) ? "yes" : "no";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        
        System.out.println(concatRemove(s, t, k));
        
        scanner.close();
    }
}
