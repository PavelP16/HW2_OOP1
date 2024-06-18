package model;

public abstract class Transport implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected void service2() {
        updateTyre();
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }


    }
}
