public class Asus extends Handphone{

	String merk;
	
	public static void main (String[] args){
		Asus ass = new Asus();
		ass.Handphone();
		
		Handphone hp = new Handphone();
        hp.setMerk("Asus");
        hp.setHarga(2500000);        
        System.out.println("Merk Handphone  : "+hp.getMerk());
        System.out.println("Harga Handphone : "+hp.getHarga());
    }

        public void Handphone(){

		super.tampilkan();
		super.sms();
		super.tlp();
		super.selfie();
	}
}