package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileNotificationAlertImple implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileNotificationAlertImple(String name, StocksObservable observable){
        this.userName = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgMobile(userName, "Woohoo we are back in stocks ..........");
    }

    private void sendMsgMobile(String userName, String msg){
        System.out.println("SMS has been sent to : "+ userName);
    }

}
