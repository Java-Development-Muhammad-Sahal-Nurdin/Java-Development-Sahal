
public class ForLoop {
    public static void main(String[] args) {
        /*for(;;)
        {
            System.out.println("Perulangan");// DeadLock atau stuck 
        }*/
        /*int count = 1;
        for(;count <= 10;)
        {
            System.out.println("Perulangan " + count);
            count++;
        }
        System.out.println(count);*/
       /* 
        // Innit Statement dimasukkan agar lebih simpple
        for(int count = 1;count <= 10;)
        {
            System.out.println("Perulangan " + count);
            count++;
        }
        
        // Innit + post Statement dimasukkan agar lebih simpple
        for(int count = 1;count <= 10;count++)
        {
            System.out.println("Perulangan " + count);
            
        }
        
        // WHILE FOR
        // HANYA DIPAKAI UNTUK PERULANGAN SAJA DENGAN KONDISI SAJA
        // Innit + post Statement dimasukkan agar lebih simpple
        int count = 1;
        while(count <= 10)
        {
            System.out.println("Perulangan " + count);
            count++;
        }
        // DO WHILE LOOP
        int counter = 100;
        do { // PASTI DIULANG MINIMAL SEKALI MISALNYA PILIHAN MENU WALAUPUN SALAH KONDISINYA
            System.out.println("Perulangan ke - " + counter);
            counter++;
        } while(counter <=10);
        
        
        // BREAK
        int counters = 1;
        while(true)
        {
            System.out.println("Perulangan" + counters);
            counters++;
            if (counters > 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");
        
        */
        // CONTINUE
        for(int counts = 1; counts <=100; counts++){
            if (counts % 2 == 0 )
            {
                continue;
            }
        System.out.println("Perulangan ganjil " + counts);
        
    }
}
}
