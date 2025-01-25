public class Analizer {
    /// <summary>
    /// Analizer for this. Thats all
    /// </summary>

    public static int massiveSize = 4; // Change this parameter if contributing lol

    public static void analize(String input) {
        for (int i = 0; i < massiveSize; i++) {
            if (input.equals(Database.data[i]) != true) {
                System.out.println("Input is not equals " + Database.data[i]);
            } else {
                System.out.println("Input IS equals " + Database.data[i]);
            }
        }
    }
}
