package recitations.rec10;

public class Elevator {
    private int currentWeight;
    private int maxCapacity;
    private int floors;
    private int currentFloor;
    public Elevator(int floors) {
        this.floors = floors;
        this.maxCapacity = 1000;
    }
    public int goUp() {
        if (this.currentFloor == floors) {
            System.out.println("Cannot go higher.");
            return this.currentFloor;
        }
        this.currentFloor++;
        return this.currentFloor;
    }
    public int goDown() {
        if (this.currentFloor == 0) {
            System.out.println("Cannot go lower.");
            return this.currentFloor;
        }
        this.currentFloor--;
        return this.currentFloor;
    }
    public int addPassenger(int weight) {
        this.currentWeight += weight;
        if (this.currentWeight > this.maxCapacity) {
            System.out.println("Cannot get on, over max capacity");
            this.currentWeight -= weight;
            return this.currentWeight;
        }
        return this.currentWeight;
    }
    public int removePassenger(int weight) {
        if (weight > this.currentWeight) {
            this.currentWeight = 0;
            return this.currentWeight;
        }
        this.currentWeight -= weight;
        return this.currentWeight;
    }
    public static void main(String[] args) {
        Elevator elevator = new Elevator(100);
        System.out.println(elevator.goUp());
        System.out.println(elevator.addPassenger(1100));
        System.out.println(elevator.addPassenger(130));
        System.out.println(elevator.goDown());
        System.out.println(elevator.removePassenger(130));
    }
}