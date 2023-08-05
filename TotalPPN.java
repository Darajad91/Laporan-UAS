package pbo.uas;

/**
 *
 * @author sabda
 */
public class TotalPPN implements PajakProduk{
    

    private String vendor;
    private String tipe;
    private double harga;
    
    public TotalPPN(String vendor, String tipe, int harga){
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    @Override
    public double PPN(double harga) {
        double PPN = harga;
        if (harga > 4500000 ){
            PPN = harga +  harga * 0.05; //PPN 5%
        }
        else if (harga >= 4200000 ){
            PPN = harga + harga * 0.02; //PPN 2%
        }
        else if (harga > 4000000 ){
            PPN = harga + harga * 0.01; //PPN 1%
        }
        return PPN;
    }
    
    public static void main(String[] args) {
       
        TotalPPN samsung = new TotalPPN("Samsung", "A 51", 5000000);
        TotalPPN oppo = new TotalPPN("Oppo", "Reno 5", 4400000);
        TotalPPN xiaomi = new TotalPPN("Xiaomi", "A1", 4100000);
        
        double ppnsamsung =  samsung.PPN(samsung.harga);
        double ppnoppo =  oppo.PPN(oppo.harga);
        double ppnxiaomi =  xiaomi.PPN(xiaomi.harga);
        
        System.out.println("Vendor: "+ samsung.vendor + " || Tipe: " + samsung.tipe + " || Harga Awal: Rp" + samsung.harga + " || Harga+PPN: Rp" + ppnsamsung);
        System.out.println("Vendor: "+ oppo.vendor + " || Tipe: " + oppo.tipe + " || Harga Awal: Rp" + oppo.harga + " || Harga+PPN: Rp" + ppnoppo);
        System.out.println("Vendor: "+ xiaomi.vendor + " || Tipe: " + xiaomi.tipe + " || Harga Awal: Rp" + xiaomi.harga + " || Harga+PPN: Rp" + ppnxiaomi);
    }
}


