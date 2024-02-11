package project.data.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_cards")
public class Cards {

    @Id
    @GenericGenerator(strategy = "uuid", name = "cards_uuid")
    @GeneratedValue(generator = "cards_uuid")
    @Column(name = "card_id")
    private String id;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_number")
    private String cardNumber;


    @Column(name = "card_balance")
    private double cardBalance;

    @Column(name = "card_cvv")
    private int cvv;
    /*@ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;*/

    public Cards() {
    }

    public Cards(String id, String cardName, String cardNumber, double cardBalance, int cvv) {
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

    /*public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }*/

}
