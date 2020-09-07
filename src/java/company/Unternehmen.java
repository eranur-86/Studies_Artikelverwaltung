package company;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Thomas
 */
@ManagedBean(name = "Unternehmen")
@RequestScoped
public class Unternehmen {
    
    private String name;
    private String strasse;
    private int hausnummer;
    private String plz;
    private String ort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    

    /**
     * Creates a new instance of Unternehmen
     */
    public Unternehmen() {
    }
    
}
