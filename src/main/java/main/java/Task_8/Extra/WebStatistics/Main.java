package main.java.Task_8.Extra.WebStatistics;

public class Main {
    public static void main(String[] args) {
        // Предполагаем, что статистику не нужно очищать - то есть храним её за всё время наблюдений
        // Добавление страницы происходит не в момент её посещения первым пользователем
        // Непосещаемые никем страницы так и остаются с нулевыми количеством посещений

        WebStatistics webStatistics = new WebStatistics();
        // Наполняем статистику страницами
        webStatistics.printWebStatics();
        webStatistics.addNewPage("/index");
        webStatistics.addNewPage("/search");
        webStatistics.addNewPage("/users");
        webStatistics.addNewPage("/topics/topic=123");
        webStatistics.addNewPage("/topics/topic=456");
        webStatistics.printWebStatics();

        // Пробуем добавить дубли страниц
        webStatistics.addNewPage("/topics/topic=123");
        webStatistics.addNewPage("/topics/topic=456");
        webStatistics.printWebStatics();

        // Обновляем количество посещений
        webStatistics.updatePageViewsCount("/index");
        webStatistics.updatePageViewsCount("/search");
        webStatistics.updatePageViewsCount("/index");
        webStatistics.updatePageViewsCount("/index");
        webStatistics.updatePageViewsCount("/topics/topic=123");
        webStatistics.updatePageViewsCount("/index");
        webStatistics.updatePageViewsCount("/topics/topic=123");
        webStatistics.updatePageViewsCount("/topics/topic=456");
        webStatistics.updatePageViewsCount("/index");
        webStatistics.printWebStatics();

        // Пробуем обновить статистику несуществующей страницы
        webStatistics.updatePageViewsCount("/chat");
        webStatistics.printWebStatics();
    }
}
