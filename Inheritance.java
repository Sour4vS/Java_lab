import java.util.Scanner;

interface Person {
    final int jobCode = 1050;

    void acquireSkills(String skill);

    void performTasks();
}

interface JobProcess {
    void evaluate(int score);
}

class Developer implements Person, JobProcess {
    public void acquireSkills(String skill) {
        System.out.println("My area of expertise is: " + skill);
    }

    public void evaluate(int score) {
        System.out.println("Interview Test Score: " + score);
    }

    public void performTasks() {
        System.out.println("Assigned to the Development Role");
    }
}

public class JobPlacement {
    public static void main(String[] args) {
        Developer applicant = new Developer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your area of expertise");
        String skill = scanner.nextLine();
        System.out.println("Enter your Interview Test Score");
        int score = scanner.nextInt();
        System.out.println("----PLACEMENT DETAILS----");
        applicant.acquireSkills(skill);
        applicant.evaluate(score);
        applicant.performTasks();
        System.out.println("My Job Code is: " + Person.jobCode);
        scanner.close();
    }
}
