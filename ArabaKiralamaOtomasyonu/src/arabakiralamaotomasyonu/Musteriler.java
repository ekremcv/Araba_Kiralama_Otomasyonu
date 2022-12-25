
package arabakiralamaotomasyonu;

/**
 *
 * @author EKREM
 */
public class Musteriler {

    private int musteriId;
    private String musteriAd;
    private String musteriSoyad;
    private String musteriAdres;
    private String musteriTel;
    private String musteriEposta;
    
    public Musteriler(int musteriId,String musteriAd,String musteriSoyad,String musteriAdres,String musteriTel,String musteriEposta ){
        
        this.musteriId=musteriId;
        this.musteriAd=musteriAd;
        this.musteriSoyad=musteriSoyad;
        this.musteriAdres=musteriAdres;
        this.musteriTel=musteriTel;
        this.musteriEposta=musteriEposta;
    }
    
    public int getMusteriId() {
        return musteriId;
    }

    
    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    /**
     * @return the musteriAd
     */
    public String getMusteriAd() {
        return musteriAd;
    }

    /**
     * @param musteriAd the musteriAd to set
     */
    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    /**
     * @return the musteriSoyad
     */
    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    /**
     * @param musteriSoyad the musteriSoyad to set
     */
    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    /**
     * @return the musteriAdres
     */
    public String getMusteriAdres() {
        return musteriAdres;
    }

    /**
     * @param musteriAdres the musteriAdres to set
     */
    public void setMusteriAdres(String musteriAdres) {
        this.musteriAdres = musteriAdres;
    }

    /**
     * @return the musteriTel
     */
    public String getMusteriTel() {
        return musteriTel;
    }

    /**
     * @param musteriTel the musteriTel to set
     */
    public void setMusteriTel(String musteriTel) {
        this.musteriTel = musteriTel;
    }

    /**
     * @return the musteriEposta
     */
    public String getMusteriEposta() {
        return musteriEposta;
    }

    /**
     * @param musteriEposta the musteriEposta to set
     */
    public void setMusteriEposta(String musteriEposta) {
        this.musteriEposta = musteriEposta;
    }
   
    
    
}
