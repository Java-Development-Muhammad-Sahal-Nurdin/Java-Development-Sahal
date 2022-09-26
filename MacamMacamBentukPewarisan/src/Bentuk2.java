// Sebuah contoh pewarisan sederhana
// Menciptakan sebuah superkelas
class A {
    int i, j;
    void tampilij() {
        System.out.println("i dan j: " + i + " " + j);
    }
    }
// Menciptakan sebuah subkelas dengan mewarisi kelas A
class B extends A {
    int k;
    
    void tampilk() {
            System.out.println("k: " + k);
    }
    
    void jum() {
        System.out.println("i+j+k: " + (i+j+k));
    
    }     
}
public class Bentuk2 {
    
}
