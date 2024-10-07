import java.util.LinkedList;

public class linkMyList{
    public static void main(String[] args){
        
        LinkedList<String> mobaylapps = new LinkedList<>();
        
        mobaylapps.add("Fruit Ninja");
        mobaylapps.add("Facebook");
        mobaylapps.add("Tiktok");
        mobaylapps.add("Instagram");
        
        System.out.println("My favorite mobile applications are: ");
        
        for (String mobapps : mobaylapps){
            System.out.println(mobapps);
        }
        
    }
}
