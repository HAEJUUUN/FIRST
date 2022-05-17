import java.util.Scanner;

public class Capitalizer {
    private char[] array = {};
    public Capitalizer(char[] array) {
        this.array = array;
}
    void replace() {
        for (int i=0; i<array.length; i++) {
// if (array[i] == ' ') array[i] = ',';
        }
    }
    void print() {
        for (char c : array) System.out.print(c);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        int i =0;
        
        System.out.println("영문을 입력하세요: ");
        str = s.nextLine();
        char[] a = new char[str.length()];
        
        while(i<str.length()) {
            a[i]= str.charAt(i);
            
            if(a[i]>='A' && a[i]<= 'Z') { 
                a[i] += 32;
            } else if(a[i]>='a' && a[i]<= 'z') {
                a[i] -= 32;
            }
            
          
            System.out.print(a[i]);
            i++;
        }
        s.close();
    }
}
    

