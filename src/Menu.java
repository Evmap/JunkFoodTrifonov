import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Меню. Список блюд
 *
 */
public class Menu {
    private List<Meal> menu;
    //todo Создайте свое меню. Должен быть хотя бы один конструктор, который создает объект класса Menu, содержащий список не менее чем из 10 блюд.
    //todo Должно быть не менее 10 блюд.
    //todo Список должен быть не пуст
    //todo Это намеки на создание тестов. Сначала тесты, потом реализация!

    public Menu() {
        List<Meal> menu = new ArrayList<Meal>();
        menu.add(new Meal("Meal A"));
        menu.add(new Meal("Meal B"));
        menu.add(new Meal("Meal C"));
        menu.add(new Meal("Meal D"));
        menu.add(new Meal("Meal E"));
        menu.add(new Meal("Meal F"));
        menu.add(new Meal("Meal G"));
        menu.add(new Meal("Meal H"));
        menu.add(new Meal("Meal J"));
        menu.add(new Meal("Meal K"));
        System.out.println(menu[2].getTitle());
        this.menu = menu;
    }
    /**
     * Возвращает список блюд в меню.
     * Должен быть неизменяемым. @see Collections.unmodifiableList
     * Должен возвращать одну и ту же коллекцию объектов при кажом вызове.
     * @return список блюд в меню
     */
    public List<Meal> list(){
        return menu;
    }
}
