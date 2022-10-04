package tugaskelompokpbo;

public class TugasKelompokPBO {

    public static void main(String[] args) {
        Deluxe kamar1 = new Deluxe("101", "5000000");
        Junior kamar2 = new Junior("102", "3000000");
        President kamar3 = new President("103", "10000000");
        Suites kamar4 = new Suites("104", "8000000");
        
        kamar1.bayarKamar(0.1);
        kamar2.setPass("0011");
        System.out.println("Password kamar2 adalah : " + kamar2.getPass() + '\n');
        
        System.out.println("Akses kolam renang kamar4:");
        kamar4.aksesKolamRenang();
        System.out.println("Akses rooftop kamar4:");
        kamar4.aksesRooftop();
        
        System.out.println("Akses rooftop kamar3:");
        kamar3.aksesRooftop();
        
        
        
    }
    
}
