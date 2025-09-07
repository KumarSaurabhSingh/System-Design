package ObserverPatternRevision.Observable;

import ObserverPatternRevision.Observable.StockObservable;
import ObserverPatternRevision.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObserverableImpl implements StockObservable {

    public List<NotificationAlertObserver> ObserverList = new ArrayList<>();
    public int stockCount = 0;

    //Add the Users
    @Override
    public void addObserver(NotificationAlertObserver observer){
        ObserverList.add(observer);
    }

    //Removing the Users
    @Override
    public void removeObserver(NotificationAlertObserver observer){
        ObserverList.remove(observer);
    }

    //Updating all the Users
    @Override
    public void notifySubscriber(){
        for (NotificationAlertObserver observer : ObserverList){
            observer.update();
        }
    }


    //Set the stockCounts / update the count
    public void setStockCount(int newStocksUpdated){
        if(stockCount== 0 && newStocksUpdated != 0){
            notifySubscriber();
        } else if (stockCount !=0 && newStocksUpdated == 0) {
            stockCount = 0;
        }

        stockCount = stockCount + newStocksUpdated;
    }

    //Return the stocks count
    public int getStockCount(){
        return  stockCount;
    }
}
