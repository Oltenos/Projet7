package org.biblioWebapp.services.generated.utilisateurservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.biblioWebapp.services.generated.types.Utilisateur;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-10-02T06:52:23.102+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.example.org/UtilisateurService/", name = "UtilisateurService")
@XmlSeeAlso({org.biblioWebapp.services.generated.types.ObjectFactory.class, ObjectFactory.class})
public interface UtilisateurService {

    @WebMethod
    @RequestWrapper(localName = "creerUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.CreerUtilisateur")
    @ResponseWrapper(localName = "creerUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.CreerUtilisateurResponse")
    public void creerUtilisateur(
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "mdp", targetNamespace = "")
        java.lang.String mdp
    ) throws CreerUtilisateurFault1, CreerUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "authentifierUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.AuthentifierUtilisateur")
    @ResponseWrapper(localName = "authentifierUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.AuthentifierUtilisateurResponse")
    @WebResult(name = "utilisateur", targetNamespace = "")
    public Utilisateur authentifierUtilisateur(
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "mdp", targetNamespace = "")
        java.lang.String mdp
    ) throws AuthentifierUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "modifierUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.ModifierUtilisateur")
    @ResponseWrapper(localName = "modifierUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.ModifierUtilisateurResponse")
    public void modifierUtilisateur(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "ancienMdp", targetNamespace = "")
        java.lang.String ancienMdp,
        @WebParam(name = "nouveauNom", targetNamespace = "")
        java.lang.String nouveauNom,
        @WebParam(name = "nnouveauPrenom", targetNamespace = "")
        java.lang.String nnouveauPrenom,
        @WebParam(name = "nouveauEmail", targetNamespace = "")
        java.lang.String nouveauEmail,
        @WebParam(name = "nouveauMdp", targetNamespace = "")
        java.lang.String nouveauMdp,
        @WebParam(name = "nouveauMailRappel", targetNamespace = "")
        java.lang.Boolean nouveauMailRappel
    ) throws ModifierUtilisateurFault1, ModifierUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "supprimerUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.SupprimerUtilisateur")
    @ResponseWrapper(localName = "supprimerUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.SupprimerUtilisateurResponse")
    public void supprimerUtilisateur(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "mdp", targetNamespace = "")
        java.lang.String mdp
    ) throws SupprimerUtilisateurFault_Exception;
}
