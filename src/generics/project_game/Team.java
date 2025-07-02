package generics.project_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();
    public Team(String name){
        this.name =name;
    }

    public void addParticipant(T participant){
        participants.add(participant);
        System.out.println("Participant with name " +participant.name + " was added!");

    }

    public void playGame(Team<T> team){
        Random random = new Random();
        boolean result = random.nextBoolean();
        String winnersName;
        if(result){
            winnersName = this.name;

        }
        else {
            winnersName = team.name;
        }
        System.out.println("The winner is " + winnersName);
    }

}
