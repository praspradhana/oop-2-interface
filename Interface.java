
// variabel interface menjadi variabel static apabila di implementasi di program utama
public interface Club{
	public void Berlatih();
	public void Bertanding();
}


public class SubClum implements Club{  // di implementasi 
	public void Berlatih(){
	System.out.println("Club Bertanding");
	}


	public void Bertanding(){
	System.out.println("Club Bertanding");
	}

	public static void main (String []args){ //menjadi variabel static di program utama
	Club tampil = new Club();
	tampil.Berlatih();
	tampil.Bertanding();

}
}
	

	// inter face dapat meng extends lebih dari satu interface
public interface Olahraga {
	public void tuanrumah (String nama);
	public void timtamu (String nama);
}
public interface Sepakbola extends Olahraga{ //extends yang pertama
	public void Sekortuanrumah(int point);
	public void Sekortimtamu ( int point);
	public void Sekorakhir (String sekor);
}
public interface Volly extends Olahraga{	//extends yang kedua
	public void SetPertama(String set1);
	public void Setkedua(String set2);
	public void SetKetiga(String set3);
}

//interface tidak dapat di intanisiasi
publi interface Interface{
	public int id = 9;
	public String nama ="nilai";

	public static void main (String []args){
		Interface show = new Interface();  //ini tidak bisa di instanisiasi
		show.id();
		show.nama();
	}

}
