package Task_8.Extra.Settings;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    private HashMap<String, String> settings;
    private final HashMap<String, String> defaultSettings;

    public Settings(Map<String, String> settings) {
        this.settings = new HashMap<>(settings);
        this.defaultSettings = new HashMap<>(settings);
    }

    public void showAllSettings() {
        System.out.println(settings);
    }

    public String getSettingsItemValue(String name) {
        return settings.get(name);
    }

    public void updateSettingsItemValue(String name, String newValue) {
        settings.put(name, newValue);
    }

    public void resetSettingsToDefault() {
        settings = defaultSettings;
    }
}
