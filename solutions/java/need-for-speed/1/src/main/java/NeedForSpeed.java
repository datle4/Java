// Completed locally
class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery;
    public int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;
        this.battery = 100;
        this.distanceDriven = 0;
    }
    
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery == 0)
            return;
        distanceDriven += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4); 
    }
}

class RaceTrack {
    private int distance = 800;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained())
            car.drive();
        return car.distanceDriven >= distance;
    }
}
