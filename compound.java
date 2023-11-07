
//the program that will find compound interest of mr bob
class compound {
    double pv;
    double r;
    int t;
    int n;
    public compound (double presentvalue, double rate, int time, int year) {
       this.pv = presentvalue;
        this.r = rate;
        this.n = time;
        this.t = year;
    }
    public double calculate() {
        r=r/100;
        double futurevalue = pv*Math.pow(1+r/n,n*t);
        return futurevalue ;
    }
    public static void main(String[] args) {
         
        compound mycompound = new compound (500000,18,3, 12);
          double futurevalue = mycompound.calculate();
        System.out.println("The compound interest for Mr.Bob: " + futurevalue  );
    }}