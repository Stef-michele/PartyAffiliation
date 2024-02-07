public class PartyAffiliation {
    public static void main(String[] args)
    { //declaring variables/setting up menu;
        String MenuChoice = "";
        String menu = "D-Democrat\t R-Republican\t I-Independent\n Choose Your Party Affiliation:\n ";
        //display the menu
        System.out.print(menu);
        // faking scanner input
        String menuChoice = "s";
        // process cascaded if
        if (menuChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (menuChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (menuChoice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Error.");
        }
    }
}
