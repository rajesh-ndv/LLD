package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    private String email;
    private StockObservable stockObservable;

    public EmailAlertObserver(String mailId,StockObservable stockObservable){

        this.email = mailId;

        this.stockObservable = stockObservable;

    }

    @Override
    public void update() {

        sendEmail(this.email);

    }

    private void sendEmail(String email) {

        System.out.println("Stock was refilled email sent to "+email);

    }

}
