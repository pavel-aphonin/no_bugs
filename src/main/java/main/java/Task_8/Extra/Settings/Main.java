package main.java.Task_8.Extra.Settings;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Настройки обычно нельзя добавлять или удалять
        // Поэтому предположим, что изначально у нас есть список настроек и работаем с ним

        // Создаём настройки приложения
        Settings settings = new Settings(Map.of(
                "Тема оформления", "Светлая",
                "Язык", "Английский",
                "Подписка", "Неактивна",
                "Папка по умолчанию", "/root/app/files",
                "Автоматическая синхронизация", "Неактивна"
        ));

        // Выводим все текущие настройки приложения
        settings.showAllSettings();

        // Выводим значение выбранной настройки
        System.out.println(settings.getSettingsItemValue("Тема оформления"));
        System.out.println(settings.getSettingsItemValue("Папка по умолчанию"));

        // Обновляем настройки приложения
        settings.updateSettingsItemValue("Тема оформления", "Тёмная");
        settings.updateSettingsItemValue("Язык", "Русский");
        settings.updateSettingsItemValue("Папка по умолчанию", "/user/files");
        settings.showAllSettings();

        // Сбрасываем настройки к стандартным
        settings.resetSettingsToDefault();
        settings.showAllSettings();
    }
}
