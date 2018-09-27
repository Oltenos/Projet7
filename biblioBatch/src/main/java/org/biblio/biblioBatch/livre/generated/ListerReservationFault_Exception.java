package org.biblio.biblioBatch.livre.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-09-27T17:14:38.599+02:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "listerReservationFault", targetNamespace = "http://www.example.org/LivreService/")
public class ListerReservationFault_Exception extends Exception {
	private static final long serialVersionUID = 1L;
	
	private ListerReservationFault listerReservationFault;

    public ListerReservationFault_Exception() {
        super();
    }

    public ListerReservationFault_Exception(String message) {
        super(message);
    }

    public ListerReservationFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ListerReservationFault_Exception(String message, ListerReservationFault listerReservationFault) {
        super(message);
        this.listerReservationFault = listerReservationFault;
    }

    public ListerReservationFault_Exception(String message, ListerReservationFault listerReservationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.listerReservationFault = listerReservationFault;
    }

    public ListerReservationFault getFaultInfo() {
        return this.listerReservationFault;
    }
}
