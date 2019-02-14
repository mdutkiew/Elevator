public class ElevatorBasic extends Elevator {

    private int doorSensor;


    public ElevatorBasic(boolean doorStatus, int currentFloor, int maxLoad, int maxPeople, int doorSensor) {
        super(doorStatus, currentFloor, maxLoad, maxPeople);
        this.doorSensor = doorSensor;
    }
}
