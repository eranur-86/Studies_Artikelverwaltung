package Articles;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Thomas
 */
@ManagedBean
@RequestScoped
public class Artikelspeicher {
    
    private String name;
    private String artikelnummer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    
    

    /**
     * Creates a new instance of Artikelspeicher
     */
    public Artikelspeicher() {
    }
    
}
