
package KoneksiDatabase;

/**
 *
 * @author LENOVO
 */
import java.util.Date;

public class WaktuSekarang {
    private Date Wkt;
    private String $jam = "", $menit = "", $detik = "";
    public String getWkt (){
        Wkt = new Date();
        int jam = Wkt.getHours ();
        int menit = Wkt.getMinutes();
        int detik = Wkt.getSeconds();
        if(jam <= 9)$jam = "0";
        if(menit <= 9)$menit = "0";
        if(detik <= 9)$detik = "0";
        return $jam + Integer.toString(jam)+":"+$menit + Integer.toString(menit)+":"+$detik + Integer.toString(detik);
    }
    public String getTgl(){
        Wkt = new Date ();
        java.text.SimpleDateFormat Tgl = new java.text.SimpleDateFormat("dd/MM/yyyy");
        return Tgl.format(Wkt);
    }
    }