public class Main{
    public static void main(String[] args){
       int answer = tringle(3);
        System.out.println("Tringle " + answer);

    }
    public static int tringle(int n){
        if(n==1){
            return 1;
        }else{
            return(n+tringle(n-1));
        }
    }

}