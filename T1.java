import java.util.Scanner;

public class T1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String string = sc.nextLine();
    System.out.println();
    System.out.println("Enter the key");
    int key = sc.nextInt();
    encryption(string,key);
  }
  
  private static void encryption(String string, int key){
    char[] stringToCharArray = string.toCharArray();
    for(int i=0; i<stringToCharArray.length;i++){
      if((int)stringToCharArray[i]>=97 && (int)stringToCharArray[i]<=122){
        int num = (int)stringToCharArray[i] + key;
        if(num>122){
          num = (num-123)+97;
          stringToCharArray[i] = (char)num;
        }
        else{
          stringToCharArray[i] = (char)num;
        }
      }
      else{
        System.out.println("Wrong input.");
        break;
      }
    }
    for(int i=0; i<stringToCharArray.length;i++){
      System.out.print(stringToCharArray[i]);
    }
  }
}