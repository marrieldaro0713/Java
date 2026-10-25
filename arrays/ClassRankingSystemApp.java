package classrankingsystemapp;

// 1. Create a Student class with a name and a quizzes array holding at least 4 scores each
class Student {
    String name;
    int[] quizzes;
    double average;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = calculateAverage();
    }

    // Method para kuhanin ang average ng mga quiz scores
    private double calculateAverage() {
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        return (double) sum / quizzes.length;
    }
}

public class ClassRankingSystemApp {

    public static void main(String[] args) {
        // Raw data: Mga pangalan at 2D array ng raw quiz data (4 quizzes bawat isa)
        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        int[][] rawQuizData = {
            {85, 90, 88, 92}, // Alice: Average = 88.75
            {70, 75, 80, 85}, // Bob: Average = 77.50
            {95, 90, 85, 80}, // Charlie: Average = 87.50
            {85, 90, 88, 92}, // Diana: Average = 88.75 (TIE kay Alice!)
            {60, 65, 70, 75}  // Ethan: Average = 67.50
        };

        // 2. Build an array of Student objects from a 2D array of raw quiz data
        Student[] students = new Student[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            students[i] = new Student(studentNames[i], rawQuizData[i]);
        }

        // 3a. Sort students by average using OWN sorting algorithm (Bubble Sort - descending order, NO Arrays.sort())
        sortStudentsByAverage(students);

        // 4. Print a formatted leaderboard and correctly handle ties between two students with the same average
        printLeaderboard(students);

        // 3b. Execute OWN linear search returning a student's rank
        String searchTarget = "Diana";
        int rank = searchStudentRank(students, searchTarget);

        System.out.println("\n=== LINEAR SEARCH RESULT ===");
        if (rank != -1) {
            System.out.println("Student '" + searchTarget + "' is ranked Rank " + rank + " in the class.");
        } else {
            System.out.println("Student '" + searchTarget + "' was not found in the record.");
        }
    }

    // Sariling Sorting Algorithm (Bubble Sort - Pataas ang rank / Pababa ang average)
    public static void sortStudentsByAverage(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].average < students[j + 1].average) {
                    // Magpalit ng puwesto (Swap)
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Method para i-print ang Leaderboard na nag-a-handle ng TIES
    public static void printLeaderboard(Student[] students) {
        System.out.println("=================================================");
        System.out.println("              CLASS RANKING LEADERBOARD          ");
        System.out.println("=================================================");
        System.out.printf("%-6s | %-12s | %-10s%n", "Rank", "Name", "Average");
        System.out.println("-------------------------------------------------");

        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            // Pag-check sa TIE: Kung kapareho ng nakaraang estudyante ang average, pareho sila ng rank
            if (i > 0 && students[i].average == students[i - 1].average) {
                // Mananatili ang currentRank sa dating value para sa tie
            } else {
                currentRank = i + 1;
            }

            System.out.printf("Rank %-1d | %-12s | %-10.2f%n", currentRank, students[i].name, students[i].average);
        }
        System.out.println("=================================================");
    }

    // Sariling Linear Search Algorithm na nagbabalik ng tamang Rank
    public static int searchStudentRank(Student[] students, String name) {
        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average == students[i - 1].average) {
                // Mananatili ang rank kapag tie
            } else {
                currentRank = i + 1;
            }

            if (students[i].name.equalsIgnoreCase(name)) {
                return currentRank; // Isasauli ang rank kung nahanap ang estudyante
            }
        }
        return -1; // -1 kapag hindi nahanap
    }
}