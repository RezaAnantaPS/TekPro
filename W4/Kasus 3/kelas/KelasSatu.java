package kelas;

class KelasSatu {
	{
	System.out.println(11); // ditampilkan setiap sebelum menampilkan constructor yang dipanggil
	}
	static
	{
	System.out.println(2); // ditampilkan satu kali dan pertama kali ketika class diakses
	}
	public KelasSatu(int i)
	{
	System.out.println(3); // ditampilkan ketika constructor KelasSatu dengan parameter dipanggil
	}
	public KelasSatu()
	{
	System.out.println(4); // ditampilkan ketika constructor KelasSatu tanpa parameter dipanggil
	}
}