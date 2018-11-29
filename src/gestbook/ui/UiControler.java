package gestbook.ui;


import gestbook.repozytory.NotatkaRepozytory;
import gestbook.ui.*;

import java.util.Scanner;

public class UiControler {
    private NotatkaRepozytory repozytory;
    Command createCommand(String cmdStr, Scanner s) {
        Command cmd = null;
        switch (cmdStr) {
            case "L":
                return new ShowListCommand(repozytory);
            case "N":
                return new NewNotatkaCommand(repozytory,s);
            case "U":
                return new DeleteCommand(repozytory,s);
            case "Q":
                return new ExitCommand();
            case "H":
            default:
                return new HelpCommand();
        }
    }

    public UiControler(NotatkaRepozytory repozytory) {
        this.repozytory = repozytory;
    }

    public void start() {

        try (  Scanner input = new Scanner(System.in)) {
            String tekst;
            while (true) {
                createCommand("",null).execute();
                tekst = input.nextLine().trim().toUpperCase();
                createCommand(tekst,input).execute();
            }
        }catch (ExpectedExitException ex){
            System.out.println(ex.getMessage());

            System.exit(0);
        }catch (UnExpectedExitException uex){
            System.out.println(uex.getMessage());
        }
    }

}
