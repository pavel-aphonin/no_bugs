package Task_6.Subtask_6;

public class Orchid implements Plant {
    public Orchid(String name, String lightCount, String waterCount) {
        this.name = name;
        this.lightCount = lightCount;
        this.waterCount = waterCount;
    }

    private final String name;
    private final String lightCount;
    private final String waterCount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLightCount() {
        return lightCount;
    }

    @Override
    public String getWaterCount() {
        return waterCount;
    }

    @Override
    public void makeWater() {
        System.out.println("Растение '" + this.getName() + "' было полито");
    }
}
