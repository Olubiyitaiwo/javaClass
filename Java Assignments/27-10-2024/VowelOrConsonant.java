import java.util.Scanner;

public class VowelOrConsonant{

       public static void main(String[] args){
     
              Scanner input = new Scanner(System.in);

              System.out.print("Enter alphabet: ");
              char alphabet = input.next().charAt(0);

              if(alphabet == 'a' ||alphabet == 'e' || alphabet =='i' ||alphabet == 'o' ||alphabet == 'u'){
              System.out.print("vowel");
             }else if(alphabet =='b'|| alphabet =='c' ||alphabet =='d' || alphabet =='f'|| alphabet =='g'||alphabet =='h'||alphabet =='j'||alphabet =='k'||alphabet =='l'||alphabet =='m'||alphabet =='n'||alphabet =='p'||alphabet =='q'||alphabet =='r'||alphabet =='s'||alphabet =='t'||alphabet =='v'||alphabet =='w'||alphabet =='x'||alphabet =='y'||alphabet =='z'){
             System.out.print("Consonant");
             } else{
             System.out.print("Error message");
             }    
      }
}