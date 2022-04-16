public class FindLY {
    public static void main(String[] args) {
        int year[] = {2000, 2002, 2004, 2006, 2008, 2010, 2012, 2014, 2016, 2018, 2020, 2022, 2024};
        for (int i = 0; i < year.length; i++) {
            if (year[i] % 4 != 0) {
                System.out.println("This is a leap year " + year[i]);
            } else {
                System.out.println("This is not a leap year.");
            }
        }
    }
}

