// java to find simple interest 
public class checking {
    //declare a variables
    double p;
    double r;
    int t;
    //create method and method name
    public checking (double principal, double rate, int time) {
       this.p = principal;
        this.r = rate;
        this.t = time;
    }
    public double calculate() {
        double simpleInterest = (p * r * t) / 100;
        return simpleInterest;
    }
    public static void main(String[] args) {
         //create a checking object
        checking BobAccount = new checking(100000, 5, 5);
        //compute the simple interest
          double simpleInterest = BobAccount.calculate();
        // print the simple interest amount
        System.out.println("Simple Interest for Mr.Bob: " + simpleInterest  );
    }
}    

