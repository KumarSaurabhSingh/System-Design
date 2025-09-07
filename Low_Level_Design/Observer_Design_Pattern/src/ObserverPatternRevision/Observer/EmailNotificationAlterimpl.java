package ObserverPatternRevision.Observer;

import ObserverPatternRevision.Observable.StockObservable;

public class EmailNotificationAlterimpl implements  NotificationAlertObserver{

    public String ObserverEmail;
    public StockObservable observable;

    public EmailNotificationAlterimpl(String email, StockObservable observable){
        this.ObserverEmail = email;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendEmail(ObserverEmail, "The user has received an email.");
    }

    public void sendEmail(String userEmail, String Message){
        System.out.println("Email sent to : " + userEmail);
    }
}
