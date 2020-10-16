package Ninth;
import java.util.Scanner;

public class ex1 {

           public static void main(String[] args) {
                      
                      Scanner scan = new Scanner (System.in);
                                            
                      System.out.println("Enter a Sentence ");
                      String sentence = scan.nextLine();
                                            

                      getNoVowels(sentence);
                                          
                    
           }

           private static void getNoVowels(String sentence) {
                      
                      sentence = sentence.toLowerCase();
                      sentence = sentence.replaceAll(" ", "");
                      
                      //System.out.println(sentence);
                      
                      char[] spilt = sentence.toCharArray();
                      int noofAvowels = 0;
                      int noofEvowels = 0;
                      int noofIvowels = 0;
                      int noofOvowels = 0;
                      int noofUvowels = 0;
                      int totalvowels =0;
                                            
                      for (int i = 0 ; i < spilt.length-1;i++)  {
                      
                                 switch (spilt[i]) {
                                 
                                 
                                 case 'a':
                                            noofAvowels +=1;
                                            totalvowels +=1;
                                 case 'e':
                                            noofEvowels +=1;
                                            totalvowels +=1;
                                 case 'i':
                                            noofIvowels +=1;
                                            totalvowels +=1;
                                 case 'o':
                                            noofOvowels +=1;
                                            totalvowels +=1;
                                 case 'u':
                                            noofUvowels +=1;
                                            totalvowels +=1;
                                 }                     
                      }
                      
                      
                      System.out.println("No of a vowels " + noofAvowels);
                      System.out.println("No of e vowels " + noofEvowels);
                      System.out.println("No of i vowels " + noofIvowels);
                      System.out.println("No of o vowels " + noofOvowels);
                      System.out.println("No of u vowels " + noofUvowels);
                      System.out.println("Total no of vowels " + totalvowels);
                      
                      
           }
}
