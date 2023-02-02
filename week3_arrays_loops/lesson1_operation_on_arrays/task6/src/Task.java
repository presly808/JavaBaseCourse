public class Task {

    public static int calculateSalary(int[] hoursPerDay, int hourRate) {

        if (hoursPerDay.length != 7 || hourRate < 0) {
            return -1;
        }

        return (hoursPerDay[0] + hoursPerDay[1] +
                hoursPerDay[2] + hoursPerDay[3] +
                hoursPerDay[4]+ hoursPerDay[5] +
                hoursPerDay[6]) * hourRate;
    }

}