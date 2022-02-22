package NewBank;

/**
 * Class Terminal aims at accepting, denying and connecting to the Bank System.
 * After this, Terminal get's answer from system and choose between adding user to allUsers list and printing talon or
 * denying his request.
 * Also, it prints out everything about Bank, its services and exct.
 */

import java.util.ArrayList;
import java.util.Date;

public class Terminal {
    private String[] allServices = new String[5];
    private int answer1;
    private int answer2;
    private int answer3;

    public Terminal() {
        allServices[0] = "Кредит";
        allServices[1] = "Дебетовые и кредитные карты";
        allServices[2] = "Платежи";
        allServices[3] = "Бизнес";
        allServices[4] = "Получение документов";
    }
    public int connectToSystem(String p, Date date) {
        return 1;
    }
    public int checkStatus () {
        return 1;
    }
    public void addToTable () {}
    public int accept() {
        return 1;
    }
    public int deny() {
        return 0;
    }
    public void showAllServices() {
        for (int i = 0; i < allServices.length; i++) {
            System.out.println(allServices[i]);
        }
    }
    public int inList (ArrayList arrayList) {return 1;}
    public void endSession () {}
}