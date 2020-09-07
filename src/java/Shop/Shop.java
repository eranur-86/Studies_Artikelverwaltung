package Shop;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Thomas
 */
@ManagedBean(name = "Shop")
@ApplicationScoped
public class Shop {
    private List<Artikelspeicher> sortiment = new ArrayList<Artikelspeicher>();
    private static Shop instance = new Shop();
    

    /**
     * Creates a new instance of Shop
     */
    public Shop() {
    }
    
    public List<Artikelspeicher> getSortiment(){
        return sortiment;
    }
    
    public static Shop getInstance(){
        return instance;
    }
    
}
