package project.data.dao;

import project.data.pojo.Cards;

public interface CardsDao {
    void createCard(Cards cards);
    Cards getCardById(String id);

    void updateCard(Cards cards);

    boolean deleteCard(Cards cards);

    Cards getCardByNumber(String cardNumber);
}
