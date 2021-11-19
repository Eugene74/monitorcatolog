/*
Реализуйте программу, которая с переодичностью 1 сек будут проверять состояниезаданного каталог.
Если в этом каталоге появится новый файл или исчезнет, то выведет сообщение
об этом событии. Программа должна работать в параллельном потоке выполнения.
 */
import utils.Monitor;
import utils.MyEvents;
import utils.MyStop;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor("FilesFolder");
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();

        Runtime.getRuntime().addShutdownHook(new MyStop(m)); // не работает зараза, на какое сочетание клавишь реагирует не поняно
    }
}
