public class Fraction {

    private int num;
    private int dem;

    public Fraction () {

        this.num = 0;
        this.dem = 0;

    }

    public Fraction (int num, int dem) {
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
        
 
    }
    
    
    public String toDouble () {
       
        
        
    }
}






