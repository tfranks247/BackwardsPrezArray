package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String[] uinput = new String[10];

        for (int i = uinput.length -1; i >= 0 ; i--){

            Scanner key = new Scanner(System.in);

            System.out.println("Please enter 10 presidents");
            uinput[i] = key.nextLine();

        }

        System.out.print("Presidents " + Arrays.asList(uinput));
    }

}
//    We can try the following program which can accept data from users,after that it will store user data into an array.
//
//        String[] uinput=new String[4];
//
//        for(int i=0;i<sc.length();i++){
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println(“ASk your users to input some data”);
//
//        uinput[i]=sc.nextLine();
//
//        }
//
//        System.out.println("Now we are printing the array data : "+ Arrays.asList(uinput));
//
//        As you can see an array has some limitation because you need to predefined array size before declare the array,therefore i am trying to work with Arraylist instead of array.
//
//        ArrayList<String> uinput=new ArrayList<String>();
//
//        for(int i=0;i<5;i++){
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Please enter the name");
//
//        uinput.add(sc.nextLine());
//
//        }
//
//        System.out.println("Now print the array : "+ uinput);




//            for (int i = 0; i < presidents.length; i++) {
//                presidents[i] = key.nextLine();
//                System.out.println(presidents);
//                    }
//                }
   //* Storing the history of values in a program is a common task.
// Maintaining an object's history requires the programmer to either write specific code or use a library which supports history logging.
// Today you're going to write specific code to store the history of a list.

   //     Type in the names of the last ten presidents in the order they were elected. When you are done, enter the word history.
//     Your program should display their names starting with the most recent.

    //    For your convenience, the names of the last 10 presidents are:

      //  Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama, Trump *\