public class NumbOfNotes {
    public static void main(String[] args) {
        int amount = 530;
//        int amount = 1693;
        countNotes(amount);
    }

    public static void countNotes(int amount) {
        int[] notes = new int[]{1000,500,100,50,20,10,5, 2, 1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        System.out.println("Notes Count ");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + "  "
                        + noteCounter[i]);
            }
        }
    }
}
