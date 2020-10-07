package main;

import client.gui.ClientMain;
import server.servlets.Servlet;

public class ProgramMain {
    public static void main(String[] args) {
        if (args.length == 4) {
            System.out.println("Launching CritterWorld server");
            try {
                int port = Integer.parseInt(args[0]);
                String readPwd = args[1];
                String writePwd = args[2];
                String adminPwd = args[3];

                Servlet servlet = new Servlet(readPwd, writePwd, adminPwd, port);
                servlet.initializeRoutes();
            } catch (NumberFormatException e) {
                System.err.println(
                        "Illegal Arguments.  Usage:" +
                                "\nServer: java -jar <CritterWorldJar> [port] [read] [write] [admin]" +
                                "\nClient: java -jar <CritterWorldJar>"
                );
            }
        } else if (args.length == 0) {
            System.out.println("Launching CritterWorld client");
            ClientMain.main(args);
        } else {
            System.err.println(
                    "Illegal Arguments.  Usage:" +
                            "\nServer: java -jar <CritterWorldJar> [port] [read] [write] [admin]" +
                            "\nClient: java -jar <CritterWorldJar>"
            );
        }
    }
}
