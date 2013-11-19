//Quispe, Sunnam
//Period 08
//Homework #27
//2013-11-18

public class Rational {

    private int num;
    private int den;

    public Rational() {
	num = 0;
	den = 1;
    }

    public Rational(int newnum, int newdon){
	if (newdon == 0) {
	    num = 0;
	    den = 1;
	}
	else {
	    num = newnum;
	    den = newdon;
	}
    }

    public String toString() {
	return "Rational number:" + this.getNum() + "/" + this.getDen();
    }

    public float floatValue() {
	float ans;
	ans = ((float) num) / ((float) den);
	return ans;
    }
    
    public double getNum() {
	return num;
    }

    public double getDen() {
	return den;
    }

    public void multiply(Rational Nick) {
	double newernum = (Nick.getNum() * this.getNum());
	double newerden = (Nick.getDen() * this.getDen());
    }

    public void divide(Rational Oliver) {
	double newernum = (Oliver.getNum() * this.getDen());
	double newerden = (Oliver.getDen() * this.getNum());
    }


    public void add(Rational foo) {
       num = num*(foo.den) + (foo.num)*den;

	den *= (foo.den);
    } 


   public void subtract(Rational foo) {
       num = num*(foo.den) - (foo.num)*den;

	den *= (foo.den);
    } 


   public int gcd() {
       int a = Math.max(num, den);
       int b = Math.min(num, den);

        while (b != 0) {
            int ans = b;
            b = a % b;
            a = ans;
        }
        return a;
    }

 

    public int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    public void reduce() {
     int gcd = this.gcd();

     num /= gcd;

     den /= gcd;

    }

    public static int gcdint(int a, int b) {
        while (b != 0) {
            int ans = b;
            b = a % b;
            a = ans;
        }
        return a;
    }

    public int compareTo(Rational foo) {
	int ans;
	if ((foo.floatValue()) == (this.floatValue())) {
	    ans = 0;
	}
	else if ((foo.floatValue()) > (this.floatValue())) {
	    ans = -80;
	}
	else ans = 80;
	return ans;
    }

}
