package kit.org.kata;

import java.util.List;

public class FilterList {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(FilterList::check).toList();
    }

    private static boolean check(Object val) {
        return val.getClass().getName().contains("Integer");
    }
}
