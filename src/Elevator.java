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

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public boolean isDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(boolean doorStatus) {
        this.doorStatus = doorStatus;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}
