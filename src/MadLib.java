import java.util.Scanner;

public class MadLib {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args)

    {
        System.out.print("Your name: ");
        String name = in.nextLine();
        System.out.print("Available position on your team: ");
        String position = in.nextLine();
        System.out.print("Your company: ");
        String company = in.nextLine();

        madLib(name, position, company);
    }

    public static void madLib(String name, String position, String company) {

        System.out.println(" ");
        System.out.println("Dear " + name + ",");
        System.out.println(" ");
        System.out.println("I am very intrigued by the job posting for the " + position + " position at " + company + ".");
        System.out.println(" ");
        System.out.println("I am a highly adaptive software engineer who thrives in an environment where people collaborate and tap into each other’s strengths to solve problems.");
        System.out.println("Joining a team where I could offer the influence of my customer-centered past, my collaborative approach to problem-solving and drive to solve problems ");
        System.out.println("in a way that can contribute to efficiency, of both the team and the product, as well as a quality deliverable is highly motivating to me.");
        System.out.println(" ");
        System.out.println(name + "," + " thank you for taking a minute to look at my project. I would appreciate an opportunity to discuss how I might add value to your team.");
        System.out.println(" ");
        System.out.println("Regards,");
        System.out.println("Erin Kinnen");
        System.out.println("erin.kinnen@gmail.com");
        System.out.println("612-716-4713");
    }

}
