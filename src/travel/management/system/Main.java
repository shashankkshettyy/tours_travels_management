/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

public class Main {
    public static void main(String[] args) {
        Splash splash = new Splash();
        Thread splashThread = new Thread(splash);
        splashThread.start();
    }
}
