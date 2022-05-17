import java.util.Scanner;


    public class Test {
        
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            
            System.out.print("알파벳 한 문자 입력>> ");
            String s = scan.next();
            char c = s.charAt(0);

            for(char a='a'; a<=c; a++){
                for(char b=a; b<=c; b++){
                    System.out.print(b);
                }
                System.out.println();
            }
            
            scan.close();
            }
            
            }
            
    