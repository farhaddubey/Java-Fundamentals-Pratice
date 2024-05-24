import java.util.*;
public class TryCatch {
    public static void main(String[] args){
        int[] marks=new int[3];
        marks[0]=90;
        marks[1]=32;
        marks[2]=44;
        try{
            System.out.println("Welcome to the Video no 82");
            try{
                System.out.println(marks[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this Index does not exist.");
                System.out.println("Exception in Level 2"); 
            }
        }
        catch(Exception e){
            System.out.println("Exception in Level 1");
        }
    }
    
}
