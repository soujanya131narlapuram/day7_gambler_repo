public class Gambler {
    public  static void  luckiest_day(){
        for(int months=0;months<12;months++) {
            int number_of_days_won=0;
            int number_of_days_lost=0;
            int luckiest_day=-1;
            int unluckiest_day=-1;
            int max_won=0;
            int max_lost=0;
            for (int days = 0; days < 30; days++) {
                int num_games = 0;
                boolean condition = true;
                int purse_value = 100;
                int bet_value = 1;
                int num_games_won=0;
                int num_games_lost=0;
                while (condition) {
                    double result = Math.random();
                    num_games++;
                    if (result <= 0.5) {
                        System.out.print("W");
                        purse_value = purse_value + bet_value;
                        num_games_won++;
                    } else {
                        System.out.print("L");
                        purse_value = purse_value - bet_value;
                        num_games_lost++;
                    }
                    if (purse_value >= 150 || purse_value <= 50) {
                        condition = false;
                    }
                }
                System.out.println();
                System.out.println("Number of games played on Day " + (days+1)+"="+ num_games);
                if (purse_value >= 100) {
                    System.out.println("Profit for the day is=" + (purse_value - 100));
                    number_of_days_won++;
                } else {
                    System.out.println("Loss for the day is=" + (100 - purse_value));
                    number_of_days_lost++;
                }
                if(num_games_won>max_won){
                    max_won=num_games_won;
                    luckiest_day=days+1;
                } else if (num_games_lost>max_lost) {
                    max_lost=num_games_lost;
                    unluckiest_day=days+1;
                }
            }
            System.out.println("Number of days won in the month"+(months+1)+"="+number_of_days_won);
            System.out.println("Number of days lost in the month"+(months+1)+"="+number_of_days_lost);
            System.out.println("Luckiest day in the month"+(months+1)+"="+luckiest_day);
            System.out.println("Unluckiest day in the month"+(months+1)+"="+unluckiest_day);
        }
        return;
    }
    public static void main(String[] args) {
        luckiest_day();
    }
}