/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2_ObserverPattern;

/**
 *
 * @author copbu
 */
interface Investor {
    String getName();
    Strategy addapStrategy();
    void update(String stockSymbol, double priceChange);
}
