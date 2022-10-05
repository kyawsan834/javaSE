// package mytesting; 
 
import java.util.Scanner; 
 
public class BotProgram2 { 
 
 public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in); 
  System.out.println("\nTrain Your Robot------------"); 
  System.out.println("------------------------------"); 
 
  Dictionary[] humanQuestion = new Dictionary[50]; 
  humanQuestion[0] = new Dictionary("What is your name?", "My name is Crazy Robot......"); 
 
  for (int i = 0; i < humanQuestion.length; i++) { 
   System.out.println("What you would like to ask?"); 
   System.out.print("Human ask >> "); 
   String humanquestion = sc.nextLine(); 
   Boolean found = false; 
   for (int j = 0; j < humanQuestion.length; j++) { 
    Dictionary dictionary = humanQuestion[j]; 
    if (dictionary == null) { 
     found = false; 
     break; 
    } 
    if (dictionary.question.equalsIgnoreCase(humanquestion)) { 
     System.out.println("Robot answer >> " + dictionary.answer + "\n"); 
     found = true; 
     break; 
    } 
   } 
   if (found == false) { 
    System.out.println("Robot : No match data found in my dictionary. How should I answer?"); 
    System.out.print("Human answer >> "); 
    String humananswer = sc.nextLine(); 
    System.out.print("Robot reply >> Thanks.......\n"); 
 
    System.out.println("\nWould you like to ask more?(y/n)"); 
    String yorn = sc.nextLine(); 
    if ("y".equals(yorn)) { 
     System.out.print("\n"); 
     Dictionary dict = new Dictionary(humanquestion, humananswer); 
     for (int j = 0; j < humanQuestion.length; j++) { 
      Dictionary dictionary = humanQuestion[j]; 
      if (dictionary == null) { 
       humanQuestion[j] = dict; 
       break; 
      } 
 
     } 
 
    } else if ("n".equals(yorn)) { 
     System.out.print("Process END----------"); 
     break; 
    } 
 
   } 
  } 
 
 } 
} 
 
class Dictionary { 
 
 public String question; 
 public String answer; 
 
 public Dictionary(String question, String answer) { 
  this.question = question; 
  this.answer = answer; 
 } 
}