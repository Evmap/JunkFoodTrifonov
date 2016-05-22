import java.util.IntSummaryStatistics;

/**
 *
 * Еда. Пища. Блюдо.
 */
public class Meal {

    private static String title;

    public Meal() {}

    public Meal(String title) {
        this.title = title;
    }

    //todo Добавьте необходимые конструктуры и/или методы, чтобы можно было создать блюдо с указанием его наименования
    //todo Подумайте, что лучше подходит. Считается, что у блюда название не изменяется ;)

    /**
     *
     * @return наименование блюда
     */
    public String getTitle(){
        return title;
        //throw new UnsupportedOperationException();
    }

}
