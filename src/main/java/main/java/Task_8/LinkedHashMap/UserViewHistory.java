package main.java.Task_8.LinkedHashMap;

import java.util.*;

public class UserViewHistory {
    private final Map<String, String> history;

    public UserViewHistory() {
        this.history = new LinkedHashMap<>();
    }

    public void printViewHistory() {
        System.out.println(history);
    }

    public void addView(String url, String pageName) {
        if (history.size() < 9) {
            history.put(url, pageName);
        } else {
            Iterator<String> iterator = history.keySet().iterator();
            String removableElement = iterator.next();
            history.remove(removableElement);

            history.put(url, pageName);
        }
    }
}
