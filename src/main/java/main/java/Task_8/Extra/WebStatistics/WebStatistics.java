package main.java.Task_8.Extra.WebStatistics;

import java.util.HashMap;

public class WebStatistics {
    private final HashMap<String, Integer> webStatistics;

    public WebStatistics() {
        this.webStatistics = new HashMap<>();
    }

    public void addNewPage(String url) {
        if (webStatistics.get(url) == null) {
            webStatistics.put(url, 0);
        } else {
            System.out.println("Страница с адресом \"" + url + "\" уже существует");
        }
    }

    public void updatePageViewsCount(String url) {
        if (webStatistics.get(url) != null) {
            int newViewCount = webStatistics.get(url) + 1;
            webStatistics.put(url, newViewCount);
        } else {
            System.out.println("Сначала необходимо добавить страницу с адресом \"" + url + "\"");
        }
    }

    public void printWebStatics() {
        System.out.println(webStatistics);
    }
}
