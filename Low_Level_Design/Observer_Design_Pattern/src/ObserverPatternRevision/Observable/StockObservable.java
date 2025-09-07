package ObserverPatternRevision.Observable;

import ObserverPatternRevision.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void addObserver(NotificationAlertObserver observer);

    public void removeObserver(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStocksUpdated);

    public int getStockCount();
}
