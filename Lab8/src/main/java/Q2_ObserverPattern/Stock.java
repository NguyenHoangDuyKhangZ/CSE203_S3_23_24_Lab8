/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_ObserverPattern;

/**
 *
 * @author copbu
 */
import java.util.ArrayList;
import java.util.List;
public interface Stock {
    public void addObserver(Investor investor);
    public void removeObserver(Investor investor);
    public void notifyInvestors(double priceChange);
}
