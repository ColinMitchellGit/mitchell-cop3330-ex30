/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex30;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        generateMultiplicationTable();
    }

    public static void generateMultiplicationTable() {
        for(int i = 1; i <= 12; i ++) {
            for(int j = 1; j <= 12; j ++) {
                int length = String.valueOf(i * j).length();

                if(length == 3) {
                    System.out.print(" " + (i * j));
                }else if(length == 2) {
                    System.out.print("  " + (i * j));
                }else{
                    System.out.print("   " + (i * j));
                }

            }
            System.out.print("\n");
        }
    }
}