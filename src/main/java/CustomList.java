import java.util.LinkedList;
import java.util.List;

public class CustomList {
    private List<String> list = new LinkedList<String>();

    public boolean isEmpty() {
        if (list.size() == 0)
            return true;
        return false;
    }

    public void add(String val) {
        list.add(val);
    }

    public int size() {
        return list.size();
    }

    public String get(int i) {
        if (list.size() == 0)
            return null;
        return list.get(i);
    }
}
