/*
    Program ini mendemonstrasikan himpunan
	irisan, gabungan, dan selisih
*/

// Mengimpor Scanner ke program
import java.util.Scanner;

// Nama class harus sama dengan nama file
public class Himp
{ 
	// Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard
	// Membuat objek pemindai dengan nama input
	Scanner input = new Scanner(System.in);

	// Deklarasi dan pembuatan objek (instance)array dimensi 1
	int[] himpunanA = new int[100];
	int[] himpunanB = new int[100];
	
	// Deklarasi variabel pada java
	int jumlahAnggotaA;
	int jumlahAnggotaB;

	public void dataAnggota() 
	{
		// Tampilkan output ke user dengan menanyakan anggota himpunan A ada berapa
		System.out.print("Masukkan jumlah anggota himpunan A : ");

		// Menggunakan scanner dan menyimpan apa yang diketik di variabel jumlahAnggota
		jumlahAnggotaA = input.nextInt();

		// Menanyakan anggota himpunan A, inputan dari user
		System.out.println("Anggota himpunan A");
		
		// Perintah 'for' pada program ini digunakan untuk melakukan perulangan sesuai dengan variabel jumlahAnggotaA yang telah diinputkan oleh pengguna
		for(int i=1; i<=jumlahAnggotaA; i++)
		{
			System.out.print("Anggota "+i+" : ");
			himpunanA[i] = input.nextInt();
		}

		// Tampilkan output ke user dengan menanyakan anggota himpunan B ada berapa
		System.out.print("Masukkan jumlah anggota himpunan B : ");
		jumlahAnggotaB = input.nextInt();

		// Menanyakan anggota himpunan B, inputan dari user
		System.out.println("Anggota himpunan B");
		for(int i=1; i<=jumlahAnggotaB; i++)
		{
			System.out.print("Anggota "+i+" : ");
			himpunanB[i] = input.nextInt();
		}
	}

	// Menampilkan himpunan yang telah diinput sebelumnya
	public void tampilAnggota()
	{
		System.out.print("Anggota himpunan A = { ");
		for(int i=1; i<=jumlahAnggotaA; i++)
		{
			System.out.print(himpunanA[i]+" ");
		}
		System.out.println("}");
		System.out.print("Anggota himpunan B = { ");
		for(int i=1; i<=jumlahAnggotaB; i++)
		{
			System.out.print(himpunanB[i]+ " ");
		}
		System.out.println("}");
	}

	// Menampilkan himpunan gabungan dari anggota himpunan yang telah diinput sebelumnya
	public void himpunanGabungan()
	{
		System.out.print("Himpunan gabungan A U B : { ");
		for(int i=1; i<=jumlahAnggotaA; i++)
		{
			System.out.print(himpunanA[i]+" ");
		}
		for( int i=1; i<=jumlahAnggotaB; i++)
		{
			boolean adaSama = false;
			for(int j=1; j<=jumlahAnggotaA; j++)
			{
				if(himpunanB[i] == himpunanA[j])
				{
				adaSama = true;
				}
			}
			if(adaSama == false)
			{
				System.out.print(himpunanB[i]+" ");
			}
		}
		System.out.println("}");
	}

	// Menampilkan irisan dari anggota himpunan yang telah diinput sebelumnya
	public void himpunanIrisan()
	{
		System.out.print("Himpunan irisan A n B : { ");
		for( int i=1; i<=jumlahAnggotaB; i++)
		{
			boolean adaSama = false;
			for(int j=1; j<=jumlahAnggotaA; j++)
			{
				if(himpunanB[i] == himpunanA[j])
				{
					adaSama = true;
				}
			}
			if(adaSama == true)
			{
				System.out.print(himpunanB[i]+" ");
			}
		}
		System.out.println(" }");
	}

	// Menampilkan himpunan selisih dari anggota himpunan yang telah diinput sebelumnya
	public void himpunanSelisih()
	{
		System.out.print("Himpunan selisih A - B : { ");
		for( int i=1; i<=jumlahAnggotaA; i++)
		{
			boolean adaSama = false;
			for(int j=1; j<=jumlahAnggotaB; j++)
			{
				if(himpunanA[i] == himpunanB[j])
				{
					adaSama = true;
				}
			}
			if(adaSama == false)
			{
				System.out.print(himpunanA[i]+" ");
			}
		}
		System.out.println("}");
		System.out.print("Himpunan selisih B - A : { ");
		for( int i=1; i<=jumlahAnggotaB; i++)
		{
			boolean adaSama = false;
			for(int j=1; j<=jumlahAnggotaA; j++)
			{
				if(himpunanB[i] == himpunanA[j])
				{
					adaSama = true;
				}
			}
			if(adaSama == false)
			{
				System.out.print(himpunanB[i]+" ");
			}
		}
		System.out.println("}");
	}

	// Urutan untuk memanggil program, yaitu input data, menampilkan data, lalu menampilkan gabungan,irisan, dan selisih
	public static void main(String args[])
	{
		Himp bilangan = new Himp();
		bilangan.dataAnggota();
		bilangan.tampilAnggota();
		bilangan.himpunanGabungan();
		bilangan.himpunanIrisan();
		bilangan.himpunanSelisih();
	}
}