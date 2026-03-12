public class Main {

    public static void main(String[] args) {

        MenuRepository repo = new MenuRepository();

        repo.add(new Food("F1","Burger",30000));
        repo.add(new Drink("D1","Coca",10000,"M"));

        repo.findAll().forEach(m ->
                System.out.println(m.getName() + " - " + m.calculatePrice())
        );

    }
}