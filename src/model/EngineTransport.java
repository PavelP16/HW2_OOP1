package model;


abstract public class EngineTransport extends Transport{

    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}



