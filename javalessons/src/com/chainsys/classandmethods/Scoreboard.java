package com.chainsys.classandmethods;
public class Scoreboard {
private int currentScore;
private int runRate;
private final int target;
public final static int max_overs=20;
private int completed_overs;
public int getCurrentScore() {
return currentScore;
}
public void setCurrentScore(int currentScore) {
this.currentScore = currentScore;
}
public int getRunRate() {
return runRate;
}
public int getCompleted_overs() {
return completed_overs;
}
public void setCompleted_overs(int completed_overs) {
this.completed_overs = completed_overs;
}
public Scoreboard(int targetscore) {
this.target=targetscore;
}
public int getTarget() {
return target;
}
public int getRequiredRunrate() {
int runstoscore=(target-currentScore);
int oversremaining=(max_overs-completed_overs);
return runstoscore/oversremaining;
}

}
