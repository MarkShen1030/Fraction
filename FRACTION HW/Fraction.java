public class Fraction {

    private int num;
    private int dem;

    public static final Fraction HALF = new Fraction(1,2);
    public static final Fraction THIRD = new Fraction(1,3);
    public static final Fraction FOURTH = new Fraction(1,4);
    public static final Fraction FIFTH = new Fraction(1,5);

    public Fraction () {
        this(0,1);
        this.num = 0;
        this.dem = 0;

    }

    public  Fraction (int num, int dem) {
    this.num = num;
    this.dem = dem;

    if (dem == 0) {
    System.out.println("ERROR");
    dem = 1;
    } else {
    dem = dem;
    }

    }

    public Fraction (String slash) {
    int slashIndex = slash.indexOf("/");   

    String nume = slash.substring(0, slashIndex);
    String denom = slash.substring(slashIndex+1);

    this.num = Integer.parseInt(nume);
    this.dem = Integer.parseInt(denom);

    if (this.dem == 0) {
    System.out.println("ERROR");
    this.dem = 1;
    } else {
    this.dem = dem;
    }
    }
   
    public Fraction (Fraction f) {
        this.num = num;
        this.dem = dem;
    }

    public int getNum (int num) {
        this.num = num;

        return this.num;
    }

    public int getDenom (int dem) {
        this.dem = dem;

        return this.dem;
    }

    public String toString () {
        this.num = num;
        this.dem = dem;

        return this.num + "/" + this.dem;
    }

    public double toDouble () {
        this.num = num;
        this.dem = dem;

        double dob = this.num/this.dem;

        return dob;
    }

    public static int GCF(int a, int b){
        if(a == b) {
            return a;
        }
        if(a < b) {
            return GCF(b,a);
        }
        return GCF(a - b, b);
    }

    public void reduce() {
        int gcf = GCF(Math.abs(this.num), Math.abs(this.dem));

        this.num /= gcf;
        this.dem /= gcf;
    }

    public void setNum(int num) {
        this.num = num;

    }

    public void setDenom(int dem) {
        this.dem = dem;

    }

    public Fraction add(Fraction in){
        return add(this, in);
    }

    public static Fraction mutiply(Fraction a, Fraction b) {
        Fraction out = new Fraction(a.num*b.num, a.dem*b.dem);

        return out;
    }

    public static Fraction divide(Fraction a, Fraction b) {
        Fraction out = new Fraction(a.num*b.dem, a.dem*b.num);

        return out;
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction out = new Fraction(a.num*b.dem + b.num*a.dem, a.dem*b.dem);

        return out;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction out = new Fraction(a.num*b.dem - b.num*a.dem, a.dem*b.dem);

        return out;
    }

}
