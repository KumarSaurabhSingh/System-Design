package ObserverPatternRevision;

import ObserverPatternRevision.Observable.IphoneObserverableImpl;
import ObserverPatternRevision.Observer.EmailNotificationAlterimpl;
import ObserverPatternRevision.Observer.MobileNotificationAlertImpl;

public class Amazon_Store {

    public static void main(String[] args){
        IphoneObserverableImpl iphoneObservable = new IphoneObserverableImpl();

        EmailNotificationAlterimpl observer1 = new EmailNotificationAlterimpl("abc@gmail.com", iphoneObservable);
        EmailNotificationAlterimpl observer2 = new EmailNotificationAlterimpl("def@gmail.com", iphoneObservable);

        MobileNotificationAlertImpl observer3 = new MobileNotificationAlertImpl("xyz@gmail.com", iphoneObservable);


        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        iphoneObservable.addObserver(observer3);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(10);
    }
}
