import java.util.Scanner;
public class LongestWord 
{
 public static void main(String[] args) 
 {
  Scanner ghostrayn = new Scanner(System.in);
  System.out.print("Enter a sentence: ");
  String sentence = ghostrayn.nextLine();
  int l = 0; //variable for counting letters in the longest word
  int currentL = 0; //length of present word being checked
  for (int i = 0; i < sentence.length(); i++) 
  {
   char ch = sentence.charAt(i);
   if (ch==' ') 
   {
    if (currentL > l)
     {
        l = currentL;      
     }
       currentL = 0;
   } 
   else 
   {
    currentL++;
   }
  }
 if (currentL > l) 
        {
           l = currentL;
        }
        System.out.println("The longest word has "+l+" characters");
    }
}
