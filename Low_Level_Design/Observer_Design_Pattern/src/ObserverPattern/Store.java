package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotifcationAlertImpl;
import ObserverPattern.Observer.MobileNotificationAlertImple;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {


    //Notify Me Module of Amazon - Walmart LLD round Question

    public static void main(String[] args) {
        StocksObservable iphonStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailNotifcationAlertImpl("aaa@gmail.com", iphonStocksObservable);
        NotificationAlertObserver observer2 = new EmailNotifcationAlertImpl("bbb@gmail.com", iphonStocksObservable);
        NotificationAlertObserver observer3 = new MobileNotificationAlertImple("ccc_Username", iphonStocksObservable);


        iphonStocksObservable.add(observer1);
        iphonStocksObservable.add(observer2);
        iphonStocksObservable.add(observer3);

        iphonStocksObservable.setStockCount(10);
    }

}
