package project.data.model;

public class CardsDto {

    private String id;

    private String cardName;

    private String cardNumber;

    private double cardBalance;

    private int cvv;

    public CardsDto() {
    }

    public CardsDto(String id, String cardName, String cardNumber, double cardBalance, int cvv) {
        this.id = id;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.cvv = cvv;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
