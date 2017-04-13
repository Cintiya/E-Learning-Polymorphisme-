public class Samsung extends Handphone{
	
	String merk;
	
	public static void main (String[] args){
		Samsung smg = new Samsung();
		smg.Handphone();
		
		Handphone hp = new Handphone();
        hp.setMerk("Samsung");
        hp.setHarga(3000000);        
        System.out.println("Merk Handphone   : "+hp.getMerk());
        System.out.println("Harga Handphone  : "+hp.getHarga());
	}

	public void Handphone(){ //overloading
	
		super.tampilkan();
		super.sms();
		super.tlp();
		super.selfie();
	}
}