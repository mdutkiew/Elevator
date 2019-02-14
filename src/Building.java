public class Building {


    public static void main(String[] args){

        ElevatorBasic elevatorOne = new ElevatorBasic(true, 0, 1000, 15,"Dot");

        ElevatorBasic elevatorTwo = new ElevatorBasic(true,0, 1000, 15, "Strip");

        if((elevatorOne.getDoorSensor() == "Strip") || (elevatorTwo.getDoorSensor() == "Strip")){
            System.out.println("Everyone can enter safely");
        }
        else {
            System.out.println("Watch over children below 100 centimeters.");

        }

    }





}
