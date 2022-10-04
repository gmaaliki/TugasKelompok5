package tugaskelompokpbo;

public class Kamar {
    protected String noKamar;
    protected String harga;
    private String pass;
    
    // Encapsulation
    
    public void setPass(String str) {
        this.pass = str;
    }
    
    public String getPass() {
        return pass;
    }
    
    // Overloading
    
    public void bayarKamar(){
        System.out.println("Total yang dibayarkan adalah : Rp" + harga);
    }
    
    public void bayarKamar(double diskon){
        //Conversion
        
        double total = Double.parseDouble(harga);
        total = total - (total*diskon);
        System.out.println("Total yang dibayarkan adalah : Rp" + total + '\n');
    }
    
    public void aksesKolamRenang() {
        System.out.println("Akses kolam renang TIDAK diberikan!\n");
    }
    
    public void aksesRooftop() {
        System.out.println("Akses rooftop TIDAK diberikan!\n");
    }
    
    public void bersihkanKamar() {
        System.out.println("Kamar akan segera dibersihkan!\n");
    }
    
    
}
