package wipro;

public class Enc_vote {
    private String voterId;
    private boolean hasVoted = false;

    public void setVoterId(String voterId)
    {
        this.voterId = voterId;
    }

    public String getVoterId()
    {
        return voterId;
    }

    public boolean isHasVoted() 
    {
        return hasVoted;
    }

    public boolean castVote()
    {
        if (!hasVoted) 
        {
            hasVoted = true;
            System.out.println("Voted successfully!");
            return true;
        } 
        else
        {
            System.out.println("You have already voted.");
            return false;
        }
    }
}

class VoterService {
    public void processVoting(Enc_vote voter) 
    {
        System.out.println("Voter ID: " + voter.getVoterId());

        if (!voter.isHasVoted())
        {
            voter.castVote();
        } 
        else 
        {
            System.out.println("You already voted.");
        }

        System.out.println("Has Voted? " + voter.isHasVoted());
    }
}
