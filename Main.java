import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        
        int commonLength = 0;
        while (commonLength < Math.min(s.length(), t.length()) && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }
        
        int operationsNeeded = (s.length() - commonLength) + (t.length() - commonLength);
        
        boolean canTransform = k == operationsNeeded || (k > operationsNeeded && (k - operationsNeeded) % 2 == 0) || k >= s.length() + t.length();
        
        System.out.println(canTransform ? "yes" : "no");
        
        scanner.close();
    }
}
