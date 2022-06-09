
/*İlk sorunun cevabı :3 obje oluşmuş olur. */

/*İkinci sorunun cevabı aşağıdadır!m!*/

import java.util.Scanner;

public class Week1{
private static String myStr = "<<code>>";


public static void main(String[] args) {
        /*String str = HomeWork1st.myStr;*/
        String [] myArray = new String[5];

        for (int i = 0; i < 5 ; i++){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter String");
        String Value = myInput.nextLine();
        myArray[i] = Value;
        }

        String myString = myFunction(myArray);
        System.out.println(myString);


        }

private static String myFunction(String[] myArray) {
        for (int i = 0; i < 5 ; i++){
        if (myArray[i].equals(myStr)){
        return "Tanımlı " + i +  ". value yu içeren String deger:" + myArray[i];
        }

        }
        return null;
        }
        }
