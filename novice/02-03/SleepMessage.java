public class SleepMessages {
    public static void main(String args[])
        throws InterruptedException {
        String proses[] = {
            "Proses 1 selesai",
            "proses 2 selesai",
            "proses 3 selesai",
            "proses 4 selesai"
        };

        for (int i = 0;
             i < proses.length;
             i++) {
            //Pause for 4 seconds
            //ktp 500s
            //pendaftar 1000s
            Thread.sleep(4000);
            //Print a message
            System.out.println(proses[i]);
        }
    }
}