package Shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Thomas
 */
@ManagedBean
@RequestScoped
public class Artikel {
    
    private int nr;
    private String name;
    private String beschreibung;

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
  

    /**
     * Creates a new instance of Artikel
     */
    
    public Artikel() {
    }

    public Artikel(int nr, String name, String beschreibung) {
        this.nr = nr;
        this.name = name;
        this.beschreibung = beschreibung;
    }
    
    
    
}
