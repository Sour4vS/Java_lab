import java.util.Scanner;

class Worker {
    String fullName, homeAddress;
    int age;
    long phoneNumber;
    double salary;

    Worker(String fullName, String homeAddress, int age, long phoneNumber, double salary) {
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Home Address: " + homeAddress);
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class TeamLead extends Worker {
    String teamName;

    TeamLead(String fullName, String homeAddress, int age, long phoneNumber, double salary, String teamName) {
        super(fullName, homeAddress, age, phoneNumber, salary);
        this.teamName = teamName;
    }

    void displayTeam() {
        System.out.println(fullName + " leads the " + teamName + " team.");
    }
}

class Specialist extends Worker {
    String expertise;

    Specialist(String fullName, String homeAddress, int age, long phoneNumber, double salary, String expertise) {
        super(fullName, homeAddress, age, phoneNumber, salary);
        this.expertise = expertise;
    }

    void displayExpertise() {
        System.out.println(fullName + " specializes in " + expertise + ".");
    }
}

public class Organization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName, homeAddress, teamName, expertise;
        int age;
        long phoneNumber;
        double salary;

        System.out.println("Enter the details of the Team Lead:");
        System.out.print("Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone Number: ");
        phoneNumber = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Home Address: ");
        homeAddress = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Team Name: ");
        teamName = sc.nextLine();

        TeamLead lead = new TeamLead(fullName, homeAddress, age, phoneNumber, salary, teamName);

        System.out.println("\nEnter the details of the Specialist:");
        System.out.print("Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone Number: ");
        phoneNumber = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Home Address: ");
        homeAddress = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Expertise: ");
        expertise = sc.nextLine();

        Specialist specialist = new Specialist(fullName, homeAddress, age, phoneNumber, salary, expertise);

        System.out.println("\nTHE DETAILS OF THE TEAM LEAD ARE:");
        lead.displayEmployeeDetails();
        lead.displaySalary();
        lead.displayTeam();

        System.out.println("\nTHE DETAILS OF THE SPECIALIST ARE:");
        specialist.displayEmployeeDetails();
        specialist.displaySalary();
        specialist.displayExpertise();

        sc.close();
    }
}

       
