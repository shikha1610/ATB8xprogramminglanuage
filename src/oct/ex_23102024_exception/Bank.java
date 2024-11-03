package oct.ex_23102024_exception;

import java.io.FileNotFoundException;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName) throws FileNotFoundException, Exception { // this is add function

        if(!bankName.currency.equalsIgnoreCase("INR")){
   //         throw new Exception("Currency Mismatch, Can't Proceed!");
//            throw new Exception("Currency Mismatch, Can't Proceed!");
        }
        return bankName.amount + this.amount;
    }
}
