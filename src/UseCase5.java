public class UseCase5 {
    public  static void  twelve_months_play(){
        for(int months=0;months<12;months++) {
            int number_of_days_won=0;
            int number_of_days_lost=0;
            for (int i = 0; i < 30; i++) {
                int num_games = 0;
                boolean condition = true;
                int purse_value = 100;
                int bet_value = 1;
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
                System.out.println("Number of games played on Day " + (i+1)+"="+ num_games);
                if (purse_value >= 100) {
                    System.out.println("Profit for the day is=" + (purse_value - 100));
                    number_of_days_won++;
                } else {
                    System.out.println("Loss for the day is=" + (100 - purse_value));
                    number_of_days_lost++;
                }
            }
            System.out.println("Number of days won in the month"+(months+1)+"="+number_of_days_won);
            System.out.println("Number of days lost in the month"+(months+1)+"="+number_of_days_won);
        }
        return;
    }
    public static void main(String[] args) {
        twelve_months_play();
    }
}