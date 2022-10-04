package tugaskelompokpbo;

// Inheritence

public class Suites extends Kamar {
    
    public Suites(String a, String b){
        this.harga = b;
        this.noKamar = a;
    }
    
    // Override
    @Override
    public void aksesKolamRenang() {
        System.out.println("Akses kolam renang diberikan!");
    }
}
