import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args){

        StockObservable stockObservable = new IphoneObservableImpl();

        NotificationAlertObserver mobilePhone = new MobileAlertObserver("rajubhai182000",stockObservable);

        NotificationAlertObserver laptop = new EmailAlertObserver("rajubhai182000@gmail.com",stockObservable);

        stockObservable.add(mobilePhone);

        stockObservable.add(laptop);

        stockObservable.setStock(10);



    }

}
