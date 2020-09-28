import java.util.Scanner;

public class MainClassRPGPartyPlanner {

    private static Scanner scan = new Scanner(System.in);
    private static AdventureParty adventureParty = new AdventureParty();
    private static int tankCounter = 0;
    private static int healerCounter = 0;

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        //printIntructions();
        while (quit == false){
            printIntructions();
            System.out.println("Enter your selection");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    printIntructions();
                    break;
                case 1:
                    addCharacter();
                    break;
                case 2:
                    removeCharacter();
                    break;
                case 3:
                    adventureParty.printAdventureParty();
                    if (tankCounter == 0){
                        System.out.println("You have no tanks in your adventure party");
                    }
                    else if (tankCounter == 1){
                        System.out.println("You have " + tankCounter + " tank in your adventure party");
                    }
                    else {
                        System.out.println("You have " + tankCounter + " tanks in your adventure party");
                    }
                    if (healerCounter == 0){
                        System.out.println("You have no healers in your adventure party");
                    }
                    else if (healerCounter == 1){
                        System.out.println("You have " + healerCounter + " healer in your adventure party");
                    }
                    else {
                        System.out.println("You have " + healerCounter + " healers in your adventure party");
                    }

                    break;
                case 4:
                    adventureParty.printCharacterInfo(scan);
                    break;
                case 5:
                    adventureParty.assignMentor(scan);
                    break;
                case 6:
                    adventureParty.showMentors();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }


    }
    public static void printIntructions(){
        System.out.println("\nChoose: ");
        System.out.println("\t 0 - Show alternatives.");
        System.out.println("\t 1 - Add character.");
        System.out.println("\t 2 - Remove character.");
        System.out.println("\t 3 - Show adventure party.");
        System.out.println("\t 4 - Show character information.");
        System.out.println("\t 5 - Assign mentor character");
        System.out.println("\t 6 - Show mentor characters");
        System.out.println("\t 7 - End application");
    }

    public static void addCharacter(){
        System.out.println("Add character to adventure party:");
        int characterChoice;
        System.out.println("\nChoose class from list");
        System.out.println("\t 1 - Warrior");
        System.out.println("\t 2 - Mage");
        System.out.println("\t 3 - Rogue");
        System.out.println("\t 4 - Cleric");
        characterChoice = scan.nextInt();
        scan.nextLine();

        String inputName = "No choice";
        int inputAge;
        String inputAncestry = "No choice";
        int weaponChoice;
        String inputWeaponry = "No choice";
        String inputMagicSchool = "No choice";
        switch (characterChoice){
            case 1:
                System.out.println("Please enter your name");
                inputName = scan.nextLine();
                System.out.println("Please enter your age");
                inputAge = scan.nextInt();
                scan.nextLine();
                System.out.println("Please enter your ancestry");
                inputAncestry = scan.nextLine();
                System.out.println("Choose weaponry. \n1 for sword and shield or 2 for greataxe");
                weaponChoice = scan.nextInt();
                scan.nextLine();
                switch (weaponChoice){
                    case 1:
                         inputWeaponry = "Sword and shield";
                         tankCounter++;
                        break;
                    case 2:
                         inputWeaponry = "Greataxe";
                         break;
                }
                Warrior warrior = new Warrior(inputName, inputAge, inputAncestry,inputWeaponry);
                adventureParty.addCharacter(warrior);
                break;

            case 2:
                System.out.println("Please enter your name");
                inputName = scan.nextLine();
                System.out.println("Please enter your age");
                inputAge = scan.nextInt();
                scan.nextLine();
                System.out.println("Please enter your ancestry");
                inputAncestry = scan.nextLine();
                System.out.println("Choose magic school. \n1 for elementalism or 2 for conjuration or 3 for illusion");
                int magicChoice;
                magicChoice = scan.nextInt();
                scan.nextLine();
                switch (magicChoice){
                    case 1:
                        inputMagicSchool = "Elementalism";
                        break;
                    case 2:
                        inputMagicSchool = "Conjuration";
                        break;
                    case 3:
                        inputMagicSchool = "Illusion";
                        break;
                }
                Mage mage = new Mage(inputName, inputAge, inputAncestry,inputMagicSchool);
                adventureParty.addCharacter(mage);
                break;

            case 3:
                System.out.println("Please enter your name");
                inputName = scan.nextLine();
                System.out.println("Please enter your age");
                inputAge = scan.nextInt();
                scan.nextLine();
                System.out.println("Please enter your ancestry");
                inputAncestry = scan.nextLine();
                System.out.println("Choose weaponry. \n1 for daggers or 2 for bow");
                weaponChoice = scan.nextInt();
                scan.nextLine();
                switch (weaponChoice){
                    case 1:
                        inputWeaponry = "Daggers";
                        break;
                    case 2:
                        inputWeaponry = "Bow";
                        break;
                }
                Rogue rogue = new Rogue(inputName, inputAge, inputAncestry,inputWeaponry);
                adventureParty.addCharacter(rogue);
                break;

            case 4:
                System.out.println("Please enter your name");
                inputName = scan.nextLine();
                System.out.println("Please enter your age");
                inputAge = scan.nextInt();
                scan.nextLine();
                System.out.println("Please enter your ancestry");
                inputAncestry = scan.nextLine();
                System.out.println("Choose weaponry. \n1 for mace and shield or 2 for staff");
                weaponChoice = scan.nextInt();
                scan.nextLine();
                switch (weaponChoice){
                    case 1:
                        inputWeaponry = "Mace and shield";
                        break;
                    case 2:
                        inputWeaponry = "Staff";
                        break;
                }
                healerCounter++;
                Cleric cleric = new Cleric(inputName, inputAge, inputAncestry,inputWeaponry);
                adventureParty.addCharacter(cleric);
                break;
        }



    }
    public static void removeCharacter(){
        adventureParty.printAdventureParty();
        System.out.println("Enter number of character to remove:");
        int characterNumber = scan.nextInt();
        scan.nextLine();
        adventureParty.removeCharacter(characterNumber);
    }
}
