package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    private List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if(this.stockCount == 0){
            this.notifySubscribers();
        }
        this.stockCount+=stock;
    }

    @Override
    public int getStock() {
        return this.stockCount;
    }
}
