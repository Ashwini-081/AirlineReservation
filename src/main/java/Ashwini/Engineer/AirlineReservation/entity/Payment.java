package Ashwini.Engineer.AirlineReservation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private String passangerName;
    private long cardNumber;
    private String cardType;

    public Payment(String passangerName, long cardNumber, String cardType) {
        this.passangerName = passangerName;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
    public Payment(){}

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
