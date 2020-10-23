public class ATM {

    public static void main(String[] args) {
        int coins50;
        int coins100;
        int coins500;
        int coins1000;
        int coins5000;
        int AllCoins;

    }

    public ATM (int coins50, int coins100, int coins500,int coins1000,int coins5000){
        coins50 = 0;
        coins100 = 0;
        coins500=0;
        coins1000=0;
        coins5000=0;
    }
    public static void addMoney(int coins50, int coins100, int coins500,int coins1000,int coins5000, int addCoins50, int addCoins100, int addCoins500,int addCoins1000,int addCoins5000){
        coins50 += addCoins50;
        coins100 += addCoins100;
        coins500 += addCoins500;
        coins1000 += addCoins1000;
        coins5000 += addCoins5000;
        int allAddCoins = addCoins50 * 50 + addCoins100 * 100 + addCoins500 * 500+addCoins1000*1000+addCoins5000*5000;
        int allCoins = coins50 * 50 + coins100 * 100 + coins500 * 500+coins1000*1000+coins5000*5000;

    }

    public static boolean takeAwayMoney(int sum,int coins50, int coins100, int coins500,int coins1000,int coins5000){
        if(sum >coins50 * 50 + coins100 * 100 + coins500 * 500+coins1000*1000+coins5000*5000 ){
            sum -= coins50 * 50 + coins100 * 100 + coins500 * 500+coins1000*1000+coins5000*5000;
            return true;

        }

        else return false;

    }

}