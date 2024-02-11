package project.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.CardsDao;
import project.data.model.CardsDto;
import project.data.pojo.Cards;

import java.util.Random;

@Service
public class CardsServiceImpl implements CardsService{

    @Autowired
    private CardsDao cardsDao;
    @Override
    public void createNewCard(CardsDto cardsDto) {
        Cards cards = new Cards();

        cards.setCardNumber(cardNumber());
        cards.setCardName(cardsDto.getCardName());
        cards.setCardBalance(1000.00);
        cards.setCvv(randomCvv());
        cardsDao.createCard(cards);

    }

    private String cardNumber(){

        int accountNum = 16;
        Random random =new Random();
        int randomNumber;
        StringBuilder builder =new StringBuilder();

        for (int i=0;i<accountNum;i++){
            randomNumber = random.nextInt(9);
            builder.append(randomNumber);
        }
        int checkDigit = this.getCheckDigit(builder.toString());
        builder.append(checkDigit);

        return builder.toString();
    }

    private int getCheckDigit(String number) {

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {

            // Get the digit at the current position.
            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }
            sum += digit;
        }

        // The check digit is the number required to make the sum a multiple of
        // 10.
        int mod = sum % 10;
        return ((mod == 0) ? 0 : 10 - mod);
    }

    private int randomCvv() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <3; i++) {
            builder.append(random.nextInt(10));
        }
        return Integer.parseInt(builder.toString());
    }
}
