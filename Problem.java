public class Problem {

    int problemId;
    String problemName;
    String difficulty;
    String platform;

    public Problem(int problemId, String problemName, String difficulty, String platform) {
        this.problemId = problemId;
        this.problemName = problemName;
        this.difficulty = difficulty;
        this.platform = platform;
    }

    public void displayProblem() {
        System.out.println("----------------------------");
        System.out.println("Problem ID : " + problemId);
        System.out.println("Problem Name : " + problemName);
        System.out.println("Difficulty : " + difficulty);
        System.out.println("Platform : " + platform);
    }
}
