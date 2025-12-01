package Task_6.Subtask_6;

public class Garden {
    public void add(Plant plant) {
        System.out.println("Растение '" + plant.getName() + "' было посажено");
        System.out.println(
                "'" + plant.getName() + "' необходим " + plant.getWaterCount()
                        + " полив и требуется " + plant.getLightCount() + " света"
        );
    }

    public void getCare(Plant plant) {
        plant.makeWater();
    }
}
