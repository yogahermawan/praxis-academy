package testingWithJunit4;
/**
 * InnerPengujianKalkulator
 */
class PengujianKalkulator extends InnerPengujianKalkulator{
    
    public static void main(String[] args) {
        InnerPengujianKalkulator kalkulator=new InnerPengujianKalkulator();
        System.out.println(" 10 * 2 = "+kalkulator.kali(10, 2)); //hasilnya seharusnya 20
        System.out.println(" 10 / 2 = "+kalkulator.bagi(10, 2)); //hasilnya seharusnya 5
        System.out.println(" 10 + 2 = "+kalkulator.tambah(10, 2)); //hasilnya seharusnya 12
        System.out.println(" 10 - 2 = "+kalkulator.kurang(10, 2)); //hasilnya seharusnya 8
    }
}
class InnerPengujianKalkulator {
    public double kali(double operandA,double operandB){
        double math= operandA* operandB;
        return math;
    }

    public double bagi(double operandA,double operandB){
        return 0;
    }

    public double tambah(double operandA,double operandB){
        return 0;
    }

    public double kurang(double operandA,double operandB){
        return 0;
    }
}