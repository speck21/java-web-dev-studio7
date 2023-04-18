package org.launchcode.studio7;

public interface OpticalDisc {
    //spins, stores data, read/write via laser,
    //information: name, capacity, contents, disc type
    void spinDisc();
    String read();
    void write();

}
