package org.biblioService.webapp.livreService.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilisateurId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "utilisateurId"
})
@XmlRootElement(name = "listerPretEnCours")
public class ListerPretEnCours {

    protected int utilisateurId;

    /**
     * Ruft den Wert der utilisateurId-Eigenschaft ab.
     * 
     */
    public int getUtilisateurId() {
        return utilisateurId;
    }

    /**
     * Legt den Wert der utilisateurId-Eigenschaft fest.
     * 
     */
    public void setUtilisateurId(int value) {
        this.utilisateurId = value;
    }

}