public class Client {
	private int age;
    private boolean isStudying;
    private boolean isWorking;
    private boolean livesWithParents;
    
    //Constructor
    public Client(int age, boolean isStudying, boolean isWorking, boolean livesWithParents) {
        this.setAge(age);
        this.setStudying(isStudying);
        this.setWorking(isWorking);
        this.setLivesWithParents(livesWithParents);
    }
    
    // Getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isStudying() {
        return isStudying;
    }
    public void setStudying(boolean studying) {
        isStudying = studying;
    }
    public boolean isWorking() {
        return isWorking;
    }
    public void setWorking(boolean working) {
        isWorking = working;
    }
    public boolean livesWithParents() {
        return livesWithParents;
    }
    public void setLivesWithParents(boolean livesWithParents) {
        this.livesWithParents = livesWithParents;
    }
}
