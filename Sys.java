import java.util.Scanner;
public class Sys
{
    public static void main(String[] args){
        int [] marks=new int[3];
        marks[0]=9;
        marks[1]=89;
        marks[2]=34;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Index");
        int ind=sc.nextInt();
        System.out.println("Enter the no. you want to divide wiht");
        int div=sc.nextInt();
        try{
            System.out.println("The value at Enter array indes is"+marks[ind]);
            System.out.println("The divided result is" +marks[ind]/div);
        }
        catch(Exception e){
            System.out.println("Some Exception Occuerred.");
            System.out.println(e);

        }
    }
}