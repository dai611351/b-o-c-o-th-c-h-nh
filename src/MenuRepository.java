import java.util.*;

public class MenuRepository {

    private List<MenuItem> menu = new ArrayList<>();

    public void add(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> findAll() {
        return menu;
    }

}