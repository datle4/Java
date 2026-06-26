import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasZero = Arrays.stream(birdsPerDay)
            .anyMatch(n -> n == 0);
        return hasZero;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
    
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            count += birdsPerDay[i];
        }
    
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i=0; i<birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5)
                busyDays++;
        }
        return busyDays;
    }
}
