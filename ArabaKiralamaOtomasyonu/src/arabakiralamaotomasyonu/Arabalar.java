
package arabakiralamaotomasyonu;

/**
 *
 * @author EKREM
 */
public class Arabalar {

    private int  arabaId; 
    private String plaka;
    private String marka;
    private String model;
    private String durum;
    private int ucret;
    
    public Arabalar(int arabaId,String plaka,String marka,String model,String durum,int ucret){
        this.arabaId=arabaId;
        this.plaka=plaka;
        this.marka=marka;
        this.model=model;
        this.durum=durum;
        this.ucret=ucret;
        
    }
    public int getArabaId() {
        return arabaId;
    }

    /**
     * @param arabaId the arabaId to set
     */
    public void setArabaId(int arabaId) {
        this.arabaId = arabaId;
    }

    
    
    public String getPlaka() {
        return plaka;
    }

   
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    
    public String getMarka() {
        return marka;
    }

   
    public void setMarka(String marka) {
        this.marka = marka;
    }

   
    public String getModel() {
        return model;
    }

   
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the durum
     */
    public String getDurum() {
        return durum;
    }

    /**
     * @param durum the durum to set
     */
    public void setDurum(String durum) {
        this.durum = durum;
    }

    /**
     * @return the ucret
     */
    public int getUcret() {
        return ucret;
    }

    /**
     * @param ucret the ucret to set
     */
    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
    
    
    
    
    
}
