package com.main.NetworkProgramming;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class EchoServerLauncher {

    public void launch() {
        try {
            // 1. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 2. Create the server object
            EchoServer server = new EchoServer();
            // 3. Register (bind) the server object on the registy.
            // The registry may be on a different machine
            String registryAddress = "localhost";
            String registryUrl = "//" + registryAddress + "/";
            String serviceName = "echo";
            Naming.rebind(registryUrl, server);
        }catch (MalformedURLException ex) {
            ex.printStackTrace();
        }catch (RemoteException ex) {
            ex.printStackTrace();
        }

        // The registry will listen on port 1099 by default

    }

    public static void main(String[] args) {

        try{
            String registryAddress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAddress + ":1099/echo");
            EchoService echoService = (EchoService) service;
            String receivedEcho = echoService.echo("Hello!");

        }catch (RemoteException ex){
            ex.printStackTrace();
        }catch (NotBoundException ex){
            ex.printStackTrace();
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }

}
