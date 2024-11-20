public class java{
    public static void main(String[] args){
        try{
            int data = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }catch(Exception e){
            System.out.println("An unexpected error occurred!");
        }finally{
            System.out.println("Execution completed.");
        }
    }
}