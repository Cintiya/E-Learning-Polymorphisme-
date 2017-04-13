public class Handphone{
    
    String merk;
    int harga;
    
   
    public Handphone(){
        this.merk="Merk Handphone Anda ?";
        this.harga=0;
    }
    public Handphone(String c, int n ){
        this.merk = c;
        this.harga = n;
    }    
    public void setMerk(String c){ 
        this.merk=c;
    }
    public void setHarga(int n){ 
        this.harga = n;        
    }
    public String getMerk(){ 
        return this.merk;
    }
    public int getHarga(){ 
        return this.harga;
    }    
    public void sms(){ 
        System.out.println("Handphone untuk SMS");        
    }
    public void tlp(){
        System.out.println("Handphone untuk Tlp");        
    }
    public void selfie(){
        System.out.println("Handphone untuk Selfie");        
    }
	public void tampilkan(){
	System.out.println("Kelas Handphone");
	}
}