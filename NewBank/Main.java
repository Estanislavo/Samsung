package NewBank;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Date currentDate = new Date();
        user.start();
        user.setPurpose("Цель");
        user.setDate(currentDate);
        user.setPasport("Данные");
        Terminal terminal = new Terminal();
        terminal.connectToSystem("Цель:", currentDate);
        if (terminal.checkStatus() == 1) {
            terminal.accept();
            terminal.addToTable();
        } else {
            terminal.deny();
            terminal.endSession();
        }
    }
}