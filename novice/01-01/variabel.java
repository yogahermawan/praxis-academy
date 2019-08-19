
public class variabel{
    public static final int abang = 5;
    public static void panggil() {
        System.out.println("ini method panggil");
    }
    
    public static void main(String []args){
        String anu="Selamat Datang DI BHV";
        int angka=1000;
        System.out.println(anu+angka);
        System.out.println(abang);
        // panggil();
        // for(int i=1;i<5;i++){
        // System.out.println("looping ke = "+i);
        // //percabangan
        // int a=5;
        // if (a==5) {
        // System.out.println("kondisi benar");            
        // }
        // else{
        // System.out.println("kondisi salah");
        // } */
        int pilihan=5;
        switch (pilihan) {
            case 1:  
            System.out.println("pilihan 1");
            break;
            case 5:  
            System.out.println("pilihan 5");
            break;
            default:
                break;
        }

        int[] numbers = new int[10];
        numbers[0]=1;
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
        }
    }