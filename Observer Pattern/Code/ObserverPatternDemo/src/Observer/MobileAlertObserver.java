package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    private String userId;
    private StockObservable stockObservable;

    public MobileAlertObserver(String userId,StockObservable stockObservable){

        this.userId = userId;

        this.stockObservable = stockObservable;

    }

    @Override
    public void update() {

        sendMessage(userId);

    }

    private void sendMessage(String userId) {

        System.out.println("Stock was refilled message sent to "+userId);

    }


}
