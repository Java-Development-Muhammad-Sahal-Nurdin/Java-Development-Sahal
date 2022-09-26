
public class SwitchStatement {
    public static void main(String[] args) {
        // SWITCH DIPERLUKAN JIKA KONDISI PERBANDINGAN == ATAU SETARA
        String nilai = "B";
        switch(nilai)
        {
            case "A":
                System.out.println("Wow nilai Anda baik!");
                break;
            case "B":
                
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus!");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }
    }
}
