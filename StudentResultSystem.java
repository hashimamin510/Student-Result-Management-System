
public class StudentResultSystem {
    public static void main(String[] args) {
        String[] names = {
            "Abdul", "Ama", "Kojo", "Akosua", "Yaw"
        };

        int[] scores = {75, 80, 65, 90, 85};
        int total = 0;
        int highestIndex = 0;

        System.out.println("STUDENT RESULT SYSTEM");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
            total += scores[i];

            if (scores[i] > scores[highestIndex]) {
                highestIndex = i;
            }
        }

        double average = (double) total / scores.length;

        System.out.println("Class Average: " + average);
        System.out.println("Highest Scorer: " + names[highestIndex]);
        System.out.println("Highest Score: " + scores[highestIndex]);
    }
}
