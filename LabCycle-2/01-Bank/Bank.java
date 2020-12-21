abstract class Bank{
    String bankType;
    boolean offerCreditCard;
    int term;
    double rateOfInterest, balance;
    
    Bank(String bankType){
        this.balance=0.0;
        this.term=0;
        this.rateOfInterest=0;
        this.bankType=bankType;
    }

    boolean isInternational(){
        if(bankType.equalsIgnoreCase("international"))
            return true;
        return false;
    }

    void setCreditCardOffer(){
        if(isInternational()) offerCreditCard=true;
        else offerCreditCard=false;
    }

    abstract void getRateOfInterest();

    void depositAmount(double amount,int term){
        this.balance+=amount;
        this.term=term;
        getRateOfInterest();
    }
}

class SBI extends Bank{
    SBI(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.8;
            else rateOfInterest=0.7;
        }
    }
}

class PNB extends Bank{
    PNB(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.8;
            else rateOfInterest=07;
        }
    }
}

class KTK extends Bank{
    KTK(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.8;
            else rateOfInterest=07;
        }
    }
}

class CORP extends Bank{
    CORP(String bankType){
        super(bankType);
        setCreditCardOffer();
    }

    void getRateOfInterest(){
        if(term>=3){
            if(isInternational()) rateOfInterest=0.8;
            else rateOfInterest=07;
        }
    }
}
