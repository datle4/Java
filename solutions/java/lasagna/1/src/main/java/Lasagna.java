public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int Minutes) {
        Lasagna lasagna = new Lasagna();
        return lasagna.expectedMinutesInOven() - Minutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int Layers) {
        return Layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int Layers, int TimeinOven) {
        return Layers*2 + TimeinOven;
    }
}
