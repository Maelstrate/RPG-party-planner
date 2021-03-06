import java.util.ArrayList;
import java.util.Scanner;


public class AdventureParty {


    private ArrayList<Character> adventureParty = new ArrayList<>();

    public void addCharacter(Character character){
        adventureParty.add(character);
    }

    public void printAdventureParty(){
        if (adventureParty.size() == 1){
            System.out.println("There is 1 character in your adventure party");
        }
        else {
            System.out.println("There are " + adventureParty.size() + " characters in your adventure party");
        }
        printCharacters();
    }

    public void printCharacterInfo(Scanner scan){
        printCharacters();
        System.out.println("Select character:");
        int characterSelection;
        characterSelection = scan.nextInt();
        scan.nextLine();
        adventureParty.get(characterSelection-1).showInfo();
    }

    public void removeCharacter(int position){
        adventureParty.remove(position-1);
    }

    public void assignMentor(Scanner scan){
        printCharacters();
        System.out.println("Select character for mentorship:");
        int mentorSelection;
        mentorSelection = scan.nextInt();
        scan.nextLine();
        adventureParty.get(mentorSelection-1).setIsMentor(true);
    }

    private void printCharacters(){
        for (int i = 0; i < adventureParty.size(); i++){
            System.out.println((i+1) + ": " + adventureParty.get(i).getName() + " - " + adventureParty.get(i).getClass());
        }
    }

    public void showMentors(){
        for (int i = 0; i < adventureParty.size(); i++){
            if(adventureParty.get(i).getIsMentor()){
                System.out.println((i+1) + ": " + adventureParty.get(i).getName() + " - " + adventureParty.get(i).getClass()
                        + " \nIs a mentor character.");
            }
        }
    }
}
