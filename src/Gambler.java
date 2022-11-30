public class Gambler {
    public  static void  twenty_days_play(){
        for(int i=0;i<20;i++) {
            int num_games=0;
            boolean condition=true;
            int purse_value=100;
            int bet_value=1;
            while (condition) {
                double result = Math.random();
                num_games++;
                if (result <= 0.5) {
                    System.out.print("W");
                    purse_value = purse_value + bet_value;
                } else {
                    System.out.print("L");
                    purse_value = purse_value - bet_value;
                }
                if (purse_value >= 150 || purse_value <= 50) {
                    condition = false;
                }
            }
            System.out.println();
            System.out.println("Number of games played on Day "+i + num_games);
            if(purse_value>=100){
                System.out.println("Profit for the day is=" + (purse_value-100));
            }else{
                System.out.println("Loss for the day is=" + (100-purse_value));
            }
        }
        return;
    }
    public static void main(String[] args) {
        twenty_days_play();
    }
}