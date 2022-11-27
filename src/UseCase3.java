public class UseCase3 {
    public  static void  play_game_until_condition(){
        int num_games=0;
        boolean condition=true;
        int purse_value=100;
        int bet_value=1;
        while (condition){
            double result=Math.random();
            num_games++;
            if(result<=0.5){
                System.out.println("Won");
                purse_value=purse_value+bet_value;
            }else {
                System.out.println("Lost");
                purse_value=purse_value-bet_value;
            }
            if(purse_value>=150 || purse_value <=50){
                condition=false;
            }
        }
        System.out.println("Number of games played "+num_games);
        System.out.println("Purse Value="+purse_value);
        return;
    }
    public static void main(String[] args) {
        play_game_until_condition();
    }
}