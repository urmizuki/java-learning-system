package exercises;

public class Halo {
    public static void main(String[] args) {
        String str = "Halo, Selamat Datang di Java Programming!";
        int vocalCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vocalCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Number of vocals: " + vocalCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
