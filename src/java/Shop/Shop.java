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
    private List<Artikel> sortiment = new ArrayList<Artikel>();
    private static Shop instance = new Shop();
    
    public Shop(){
        
        sortiment.add(new Artikel(123456,"Gesunde Pommes","Pommes aus reinem Eiweiss. Ohne Kohlenhydrate und ohne Fette."));
        sortiment.add(new Artikel(123457,"Gesunde Chips","Proteinchips aus Eiweiss. Ohne Pulver, welches sich auf der Tastatur ausbreitet."));
        sortiment.add(new Artikel(123458,"Pizza - Gamer Style","Welcher Gamer würde auf eine Pizza verzichten wollen? Diese Pizza kannst du bedenkenlos genießen. Nur 3 kcal pro Stück"));
    }
    
    public List<Artikel> getSortiment(){
        return sortiment;
    }
    
    public static Shop getInstance(){
        return instance;
    }
    
}
