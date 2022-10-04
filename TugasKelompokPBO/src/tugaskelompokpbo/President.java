package tugaskelompokpbo;

public class President extends Kamar {
    
    public President(String a, String b){
        this.harga = b;
        this.noKamar = a;
    }
    
    // Override
    @Override
    public void aksesKolamRenang() {
        System.out.println("Akses kolam renang diberikan!");
    }
    
    @Override
    public void aksesRooftop() {
        System.out.println("Akses rooftop diberikan!");
    }
}
