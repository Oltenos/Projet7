package org.biblioService.webapp.livreService.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-19T21:40:55.650+02:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "voirDispoFault", targetNamespace = "http://www.example.org/LivreService/")
public class VoirDispoFault_Exception extends Exception {
	private static final long serialVersionUID = 1L;
	
	private VoirDispoFault voirDispoFault;

    public VoirDispoFault_Exception() {
        super();
    }

    public VoirDispoFault_Exception(String message) {
        super(message);
    }

    public VoirDispoFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public VoirDispoFault_Exception(String message, VoirDispoFault voirDispoFault) {
        super(message);
        this.voirDispoFault = voirDispoFault;
    }

    public VoirDispoFault_Exception(String message, VoirDispoFault voirDispoFault, java.lang.Throwable cause) {
        super(message, cause);
        this.voirDispoFault = voirDispoFault;
    }

    public VoirDispoFault getFaultInfo() {
        return this.voirDispoFault;
    }
}
