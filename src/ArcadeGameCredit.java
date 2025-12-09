public class ArcadeGameCredit {
    private String gameName; // e.g. "Dance Machine"
    private int credits; // how many credits are currently loaded
    private int costPerPlay; // how many credits one play costs
    private int playsCompleted; // used at higher levels

    public ArcadeGameCredit(String gameName, int credits, int costPerPlay) {
        this.gameName = gameName;
         
        if (credits < 0) {
            credits = 0;
        }
        this.credits = credits;
        if (costPerPlay <= 0) {
            costPerPlay = 1;
        }
        this.costPerPlay = costPerPlay;
        playsCompleted = 0;
    }

    public void playOnce() {
        if (credits >= costPerPlay) {
            credits -= costPerPlay;
            playsCompleted++; //Increase playsCompleted by 1.
        }
        if (credits <= costPerPlay) {
           // credits = credits;
        }
    }
     public int getTotalCreditsUsed(){
        return playsCompleted * costPerPlay;
     }

    public String toString() {
        return "Game:" + gameName + " Credits: " + credits + " Cost Per Play: " + costPerPlay + " Plays completed: " + playsCompleted;
    }

}
