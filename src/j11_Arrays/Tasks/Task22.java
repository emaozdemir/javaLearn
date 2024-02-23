package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("agam bir metin gir : ");//hayat java ile cok kolay
        String str=scan.nextLine().replaceAll("\\W","");
        System.out.println(str);
        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));

        int count=0;
        String output="";
        int enBuyuk=0;

        for (int i = 0; i < arr.length; i++) {

            count=0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                }
                enBuyuk=count;
            }
            if(!(output.contains(arr[i]))){
               // output+=arr[i]+""+count+" ";

            }
        }
        System.out.println(output);

    }
}

