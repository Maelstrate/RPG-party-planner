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
        for (int i = 0; i < adventureParty.size(); i++){
            System.out.println((i+1) + ": " + adventureParty.get(i).getName() + " - " + adventureParty.get(i).getClass());
        }
    }
    public void printCharacterInfo(Scanner scan){
        for (int i = 0; i < adventureParty.size(); i++){
            System.out.println((i+1) + ": " + adventureParty.get(i).getName() + " - " + adventureParty.get(i).getClass());
        }
        System.out.println("Select character:");
        int characterSelection;
        characterSelection = scan.nextInt();
        scan.nextLine();
        adventureParty.get(characterSelection-1).showInfo();


    }
    public void removeCharacter(int position){
        adventureParty.remove(position-1);
    }

}
