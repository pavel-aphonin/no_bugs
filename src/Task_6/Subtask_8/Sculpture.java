package Task_6.Subtask_8;

public class Sculpture implements Exhibit {
    public Sculpture(String name, int temperature, int humidity, String history) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.history = history;
    }

    private final String name;
    private final int temperature;
    private final int humidity;
    private final String history;

    @Override
    public void environmentControl() {
        System.out.println("Для экспоната '" + this.getName() + "' был проведён контроль условий окружающей среды");
        System.out.println(
                "Для '" + this.getName() + "' необходимо поддерживать постоянными температуру "
                        + this.getTemperature() + " градусов и влажность "
                        + this.getHumidity() + "%"
        );
    }

    @Override
    public void restoration() {
        System.out.println("Для экспоната '" + this.getName() + "' была выполнена реставрация");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public int getHumidity() {
        return this.humidity;
    }

    @Override
    public String getHistory() {
        return this.history;
    }
}
