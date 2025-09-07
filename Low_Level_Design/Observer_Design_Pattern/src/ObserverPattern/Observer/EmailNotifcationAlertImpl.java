package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotifcationAlertImpl implements NotificationAlertObserver{

    String email;
    StocksObservable observable;

    public EmailNotifcationAlertImpl(String email, StocksObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email, "Woohoo we are back in stocks ..........");
    }

    private void sendEmail(String email, String msg){
        System.out.println("Mail has been sent to : "+ email);
    }

}
