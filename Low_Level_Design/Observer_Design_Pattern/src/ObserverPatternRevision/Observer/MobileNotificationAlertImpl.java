package ObserverPatternRevision.Observer;

import ObserverPatternRevision.Observable.IphoneObserverableImpl;
import ObserverPatternRevision.Observable.StockObservable;

public class MobileNotificationAlertImpl implements NotificationAlertObserver{

    public String userEmail;
    public StockObservable observable;

    public MobileNotificationAlertImpl(String email, StockObservable observers){
        this.userEmail = email;
        this.observable = observers;
    }

    @Override
    public void update(){
        sendMessage(userEmail, "Message has been sent to the user");
    }

    public void sendMessage(String userName, String Message){
        System.out.println("Message sent to: "+ userName);
    }
}
