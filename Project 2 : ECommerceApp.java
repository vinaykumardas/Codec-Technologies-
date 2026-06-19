import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidates = {
            "Candidate A",
            "Candidate B",
            "Candidate C"
        };

        int[] votes = new int[3];

        System.out.print("Enter Voter Name: ");
        String voter = sc.nextLine();

        System.out.println("\nCandidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }

        System.out.print("Enter Candidate Number to Vote: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 3) {
            votes[choice - 1]++;
            System.out.println("Vote Cast Successfully!");
        } else {
            System.out.println("Invalid Candidate!");
        }

        System.out.println("\nVote Count:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " : " + votes[i] + " votes");
        }

        sc.close();
    }
}
