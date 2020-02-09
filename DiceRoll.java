// Rolls a virtual pair of dice
// Records frequency & percentage of all possible sums

public class DiceRoll {
    public static void main(String[] args) {
        int roll;
// 2D array to hold dice rolls
        double[][] list = new double[11][3];
        list[0][0] = 2;
        list[1][0] = 3;
        list[2][0] = 4;
        list[3][0] = 5;
        list[4][0] = 6;
        list[5][0] = 7;
        list[6][0] = 8;
        list[7][0] = 9;
        list[8][0] = 10;
        list[9][0] = 11;
        list[10][0] = 12;

        for (int i = 0; i <= 36000; ) {
            roll = (int)(Math.random() * 7) + (int)(Math.random() * 7);

            if (roll == 2)
                list[0][1]++;
            else if (roll == 3)
                list[1][1]++;
            else if (roll == 4)
                list[2][1]++;
            else if (roll == 5)
                list[3][1]++;
            else if (roll == 6)
                list[4][1]++;
            else if (roll == 7)
                list[5][1]++;
            else if (roll == 8)
                list[6][1]++;
            else if (roll == 9)
                list[7][1]++;
            else if (roll == 10)
                list[8][1]++;
            else if (roll == 11)
                list[9][1]++;
            else if (roll == 12)
                list[10][1]++;
            i++;
        }
        list[0][2] = (((list[0][1])/36000)*100);
        list[1][2] = ((list[1][1] / 36000)*100);
        list[2][2] = ((list[2][1] / 36000)*100);
        list[3][2] = ((list[3][1] / 36000)*100);
        list[4][2] = ((list[4][1] / 36000)*100);
        list[5][2] = ((list[5][1] / 36000)*100);
        list[6][2] = ((list[6][1] / 36000)*100);
        list[7][2] = ((list[7][1] / 36000)*100);
        list[8][2] = ((list[8][1] / 36000)*100);
        list[9][2] = ((list[9][1] / 36000)*100);
        list[10][2] = ((list[10][1] / 36000)*100);

        System.out.println("Sum\t\tFrequency\tPercentage");

        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.print(list[row][column] + "\t\t ");
            }
            System.out.println();
        }
    }
}
