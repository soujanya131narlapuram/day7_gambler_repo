public class UseCase2 {
    public  static void  bet_win_Loose(){
        int num_games=100;
        for (int i=0;i<num_games;i++){
            int purse_value=100;
            int bet_value=1;
            double result=Math.random();
            if(result<=0.5){
                System.out.println("Won");
                purse_value=purse_value+bet_value;
            }else {
                System.out.println("Lose");
                purse_value=purse_value-bet_value;
            }
        }
        return;
    }
    public static void main(String[] args) {
        bet_win_Loose();
    }
}