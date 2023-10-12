public class Suma {
    int suma1, suma2,suma3;
    double sumando1, sumando2, sumando3, total;

    public Suma() {

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getSument1() {
        return suma1;
    }

    public void setSument1(int sument1) {
        this.suma1 = sument1;
    }

    public int getSument2() {
        return suma2;
    }

    public void setSument2(int sument2) {
        this.suma2 = sument2;
    }

    public double getSumdou1() {
        return sumando1;
    }

    public void setSumdou1(double sumdou1) {
        this.sumando1 = sumdou1;
    }

    public double getSumdou2() {
        return sumando2;
    }

    public void setSumdou2(double sumdou2) {
        this.sumando2 = sumdou2;
    }

    public double getSumdou3() {
        return sumando3;
    }

    public void setSumdou3(double sumdou3) {
        this.sumando3 = sumdou3;
    }

    public Suma(int sument1, int sument2, double sumdou1, double sumdou2, double sumdou3, double total) {
        this.suma1 = sument1;
        this.suma2 = sument2;
        this.sumando1 = sumdou1;
        this.sumando2= sumdou2;
        this.sumando3= sumdou3;
        this.total = total;
    }

    public void calcularSuma(int suma1, int suma2) {
        total = suma1 + suma2;
        System.out.println("La suma de los dos enteros es: " + total);
    }



    public void calcularSuma(int suma1,int suma2,int suma3){
        total=suma1+suma2+suma3;
        System.out.println("la suma de los tres enteros es : "+total);
    }

    public void calcularSuma(double sumando1, double sumando2) {
        total = sumando1 + sumando2;
        System.out.println("La suma de los dos valores double es: " + total);
    }

    public void calcularSuma(double sumando1, double sumando2, double sumando3) {
        total = sumando1 + sumando2 + sumando3;
        System.out.println("La suma de los tres valores double es: " + total);
    }
}
