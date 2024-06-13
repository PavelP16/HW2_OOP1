package model;

public class Car extends Transport {
    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель\n");
    }
}