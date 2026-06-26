public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public static int remainingMinutesInOven(int Minutes) {
        Lasagna lasagna = new Lasagna();
        return lasagna.expectedMinutesInOven() - Minutes;
    }
    public int preparationTimeInMinutes(int Layers) {
        return Layers*2;
    }
    public int totalTimeInMinutes(int Layers, int TimeinOven) {
        Lasagna lasagna = new Lasagna();
        return lasagna.preparationTimeInMinutes(Layers) + TimeinOven;
    }
}
