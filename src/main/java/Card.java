public abstract class Card {
    String cardNumber;
    String expiryDate;
    int securityNumber;

    public Card(String cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }
}
