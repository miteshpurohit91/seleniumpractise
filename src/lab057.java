import java.util.Scanner;

public class lab057 {

          //If, Switch condition
        // TO find out which day is today
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the Number of day in 1-7, I will tell which day it is");
              int dayNumber = sc.nextInt();


              switch (dayNumber) {
                  case 1 :
                      System.out.println("Mon");
                      break;
                  case 2 :
                      System.out.println("Tue");
                      break;
                  case 3 :
                      System.out.println("Wed");
                      break;
                  case 4 :
                      System.out.println("Thu");
                      break;
                  case 5 :
                      System.out.println("Fri");
                      break;
                  case 6 :
                      System.out.println("Sat");
                      break;
                  case 7 :
                      System.out.println("Sun");
                      break;
                  default:
                      System.out.println("Are you made?");

              }
          }
    }


