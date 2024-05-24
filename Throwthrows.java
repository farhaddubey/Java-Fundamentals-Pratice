class NegativeRadiusException extends Exception{
    @Override
    public string toString(){
        return "I'm toString()";

    }
    @Override
    public string getMessage() {
        return "I'm getMessage()";
    }
}
public class Throwthrows {
    public static double area(inr r) throws NegativeRadiusException{
        double result=Math.PI*r*r;
        return result;

    }
    public static void main(String[] args){

    }
    
}
