package com.example.idea.NetworkProgramming;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EchoService extends Remote {

    /**
     * Returns the same string passed as parameter
     * @param s a string
     * @return the same string passed as parameter
     */

    String echo(String s) throws RemoteException;


}
