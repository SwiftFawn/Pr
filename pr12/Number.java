package pr12;

import java.util.Scanner;

public class Number
{
    Scanner scr = new Scanner(System.in);
    String number;
    String Code;


    public void Ins()
    {
        Code = scr.nextLine();
        StringBuffer sb = new StringBuffer(number= scr.nextLine());
        sb.insert( 3,"-" );
        sb.insert( 7,"-" );
        if(Code.contains("+"))
        {
            System.out.println(Code +  sb);
        }
        else
        {
            Code = "+7";
            System.out.println(Code +  sb);
        }
    }

}