public class checking {
    double p;
    double r;
    int t;
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
         
        checking BobAccount = new checking(100000, 5, 5);
          double simpleInterest = BobAccount.calculate();
        System.out.println("Simple Interest for Mr.Bob: " + simpleInterest  );
    }
}    

