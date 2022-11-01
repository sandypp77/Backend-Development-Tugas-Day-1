import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner inputOption = new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<>();

        do {
            System.out.println("==============DIGIJOBS==============");
            System.out.println("Please Choose Following Command :");
            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete job");
            System.out.println("4. Exit");

            input = inputOption.nextInt();

            if (input == 1) {
                String newJob = "";
                String[] jobDetailed = {};
                System.out.print("Please input new job using following format : ");
                System.out.println("[job_id], [job_address], [job_position_id], [job_position_name]");
                newJob = inputOption.next();
                jobDetailed = newJob.split(",");
                Job newest = new Job(jobDetailed[0], jobDetailed[1], jobDetailed[2], jobDetailed[3]);
                jobs.add(newest);
            } else if (input == 2) {
                for (int x = 0; x < jobs.size(); x++) {
                    System.out.println("id:" + jobs.get(x).getId() + ", address: " + jobs.get(x).getJobAddress() + ", job id position: " + jobs.get(x).getIdJobPosition() + ", job position name: " + jobs.get(x).getJobPosition());
                }
            } else if (input == 3) {
                for (int x = 0; x < jobs.size(); x++) {
                    System.out.println("id:" + jobs.get(x).getId() + ", address: " + jobs.get(x).getJobAddress() + ", job id position: " + jobs.get(x).getIdJobPosition() + ", job position name: " + jobs.get(x).getJobPosition());
                }
                System.out.println("Please input id job number");
                int jobId = inputOption.nextInt();
                jobs.remove(jobId - 1);

                for (int x = 0; x < jobs.size(); x++) {
                    System.out.println("id:" + jobs.get(x).getId() + ", address: " + jobs.get(x).getJobAddress() + ", job id position: " + jobs.get(x).getIdJobPosition() + ", job position name: " + jobs.get(x).getJobPosition());
                }
            } else if (input == 4) {
                System.exit(0);
            }
        } while (input != 4);
    }
}