public class ElevatorBasic extends Elevator {

    private String doorSensor;
    private boolean warnLowPerson;


    public ElevatorBasic(boolean doorStatus, int currentFloor, int maxLoad, int maxPeople, String doorSensor) {
        super(doorStatus, currentFloor, maxLoad, maxPeople);
        this.doorSensor = doorSensor;
    }

    public String getDoorSensor() {
        return doorSensor;
    }

    public void setDoorSensor(String doorSensor) {
        this.doorSensor = doorSensor;
    }

    public boolean isWarnLowPerson() {
        return warnLowPerson;
    }

    public void setWarnLowPerson(boolean warnLowPerson) {
        this.warnLowPerson = warnLowPerson;
    }
}
