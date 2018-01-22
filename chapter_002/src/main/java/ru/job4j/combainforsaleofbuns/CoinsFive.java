package ru.job4j.combainforsaleofbuns;

/**
 * класс coins5 for and realisation geting and keeping coins.
 *
 * @author Sirotkin.
 */
public class CoinsFive implements ICoins {

    /**
     * @ param field for name string.
     */
    private final String name = "Coin_5";

    public int getNominal() {
        return nominal;
    }

    @Override
    public int getCashBalance() {

        return cashBalance;
    }

    private final int nominal = 5;

    String yourChange;

    /**
     * @ param field int for pay maney back.
     */
    private int change;

    private int quantity;

    /**
     * @ param int for max sum coins.
     */
    private final int maxCash = 1500;

    /**
     * @ param int field for max monets.
     */
    private final int maxQuantity = 300;

    /**
     * @ param int for quantity monets.
     */
    private int balanceMonets;

    /**
     * @ param int for cout cash 10 coins.
     */
    private int cashBalance = balanceMonets * 5;


    /**
     * @ param int that show remaining place for monets.
     */
    private int difference = maxQuantity - balanceMonets;

    private int differenceCashBalance = maxCash - cashBalance;

    /**
     * method for creaction Coinx_10 object.
     *
     * @param balanceMonets int
     */
    public CoinsFive(int balanceMonets, int change) {
        this.balanceMonets = balanceMonets;
        this.cashBalance = balanceMonets * 5;
        this.change = change;
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getBalanceMonets() {
        return balanceMonets;
    }

    public int getDifference() {
        return difference;
    }

    @Override
    public int getMaxCash() {
        return maxCash;
    }

    @Override
    public int getDifferenceCashBalance() {
        return differenceCashBalance;
    }

    @Override
    public int getChange() {
        return change;
    }

    public void giveChange() {
        System.out.println(" Your change =" + " " + change);
    }

    /**
     * method for download coins to stock.
     *
     * @return balanceMonets
     */
    public int putMoney(int quantity) {
        int temporraryBank = quantity;

        if (quantity > difference) {
            change = quantity - differenceCashBalance;
            giveChange(change);
            temporraryBank = differenceCashBalance;
            cashBalance = temporraryBank + cashBalance;
            temporraryBank = 0;
        } else {
            cashBalance = quantity + cashBalance;
            temporraryBank = 0;

        }
        info();
        return cashBalance;
    }

    public void giveChange(int quantity) {
        change = quantity;
        giveChange();

    }

    public void info() {
        System.out.print("Your balanceMonets is" + balanceMonets + "5 coins" + ", cashBalance" + cashBalance);
    }

    public void setChange(int change) {
        this.change = change;
    }

    public void setCashBalance(int cashBalance) {
        this.cashBalance = cashBalance;
    }
}

