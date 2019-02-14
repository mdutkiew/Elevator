public class Elevator {

    private int maxLoad;
    private int maxPeople;
    private boolean doorStatus;
    public  int currentFloor;

    public Elevator(boolean doorStatus, int currentFloor, int maxLoad, int maxPeople) {
        this.doorStatus = doorStatus;
        this.currentFloor = currentFloor;
        this.maxLoad = maxLoad;
        this.maxPeople = maxPeople;
    }


}
