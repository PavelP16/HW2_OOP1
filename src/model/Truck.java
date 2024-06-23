package model;

public class Truck extends Transport implements Serviceable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkTrailer();
    }



    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
