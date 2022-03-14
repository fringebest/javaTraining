package C10Classes;

public class PlayerStatus extends Calculations {

    private String nickname;
    private int score;
    private int lives;
    private int health;
    private String weaponInHand;
    private double positionX;
    private double positionY;
    protected static String gameName;


            //initializare obiect
    public PlayerStatus(String nickname, int score, int lives, int health, String weaponInHand, double positionX, double positionY, String gameName){
        this.nickname = nickname;
        this.score = score;
        this.lives = lives;
        this.health = health;
        this.weaponInHand = weaponInHand;
        this.positionX = positionX;
        this.positionY = positionY;
        this.gameName = gameName;

    }

    Calculations calc = new Calculations();
    public String getNickname(){
        return this.nickname;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getPositionX() {
        return positionX;
    }
    private void setPositionX(double positionX){
        this.positionX = positionX;
    }

    public double getPositionY(){
        return this.positionY;
    }

    public void setPositionY(double positionY){
        this.positionY = positionY;
    }

    protected static void setGameName(String newGameName){
        gameName = newGameName;
    }

    public static String getGameName(){
        return gameName;
    }

    //setare Health
    public void setHealth(int health){
        if (health>0 && health <=100){
            this.health = health;
        }

        if (health <=0){
            if(this.lives > 0){
                this.lives -= 1;
                this.health = 100;
            }
            else if(lives == 0){
                System.out.println("Game Over");
            }

            if(health > 100){
            this.health = 100;
            }
        }

    }

    public int getHealth() {
        return health;
    }

    public void setLives(int lives){
        this.lives = lives;
    }

    public int getLives(){
        return lives;
    }

    //3 metode de initializare, cu diverse seturi de parametri:
    public void initPlayer(String nickname) {
        setNickname(nickname);
    }

    public void initPlayer(String nickname, int lives) {
        setNickname(nickname);
        setLives(lives);
    }

    public void initPlayer(String nickname, int lives,int score){
        setScore(score);
        this.nickname = nickname;
        this.lives = lives;
    }

    //findArtifact(int artifactCode): metoda va actualiza starea jucatorului in functie de artifactul gasit, astfel:

    public void findArtifact(int artifactCode){
        if (calc.perfectNumber(artifactCode)){
            this.score += 5000;
            this.lives += 1;
            this.health = 100;
        }
        else if (calc.isPrime(artifactCode) && health <100){
            this.score += 1000;
            this.lives += 1;
            this.health += 25;
        }
        else if (artifactCode % 2 == 0 && (calc.sumaCifrelor(artifactCode)) % 3 ==0 ){
            this.score -= 3000;
            this.health -= 25;
        }
        else
            score += artifactCode;
    }


    //setWeaponInHand(String weaponInHand): actiunea va schimba arma folosita de jucator in joc
    public boolean setWeaponInHand(String weaponInHand){
        if ((weaponInHand.equals("knife") && weaponInHand.equals("sniper") && weaponInHand.equals("kalashnikov"))){
            return true;
        }
        if(weaponInHand.equals("knife") && score>=1000) {
            this.weaponInHand = weaponInHand;
            this.score -= 2000;
            return  true;
        }
        if(weaponInHand.equals("sniper") && score >=10000) {
            this.weaponInHand = weaponInHand;
            this.score -= 8000;
            return true;
        }
        if(weaponInHand.equals("kalashnikov") && score >=20000) {
            this.weaponInHand = weaponInHand;
            this.score -= 8000;
            return true;
        }
        return true;
    }

    public String getWeaponInHand(){
        this.weaponInHand = weaponInHand;
        return weaponInHand;
    }

   public void movePlayerTo(double positionX, double positionY) {
       setPositionX(positionX);
       setPositionY(positionY);

   }

   public double winProbability() {
        return(3 * health + score / 1000) / 4;
   }

   public boolean shouldAttackOpponent(PlayerStatus opponent) {
       double distance = calc.distanceBetweenPlayers(getPositionX(), getPositionY(),
               opponent.getPositionX(), opponent.getPositionY());

       //for same weapon
       if (this.getWeaponInHand().equals((opponent.getWeaponInHand()))) {
           if (this.winProbability() >= opponent.winProbability()) {
               return true;
           } else {
               return false;
           }
       }

       if (distance > 1000) {
           if (this.getWeaponInHand().equals("Sniper")) {
               return true;
           } else if (this.getWeaponInHand().equals("kalashnikov") && opponent.getWeaponInHand().equals("knife")) {
               return true;
           } else {
               return false;
           }
       }

       if (distance >= 1000) {
           if (this.getWeaponInHand().equals("kalashnikov")) {
               return true;
           } else if (this.getWeaponInHand().equals("sniper") && opponent.getWeaponInHand().equals("knife")) {
               return true;
           } else {
               return false;
           }

       }
       return false;
   }

   public void showState () {
        System.out.println("PlayerStatus [nickname=" + getNickname() + ", score=" + getScore() + ", lives=" + getLives() +
                ", health=" + getHealth() + " this.health " + this.getHealth()
                + ", weaponInHand=" + getWeaponInHand() + ", positionX=" + getPositionX() + ", positionY=" + getPositionY() + "]");
   }

}
