package org.biblioService.webapp.contrat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.biblioService.model.bean.Utilisateur;
import org.biblioService.model.exception.AuthentificationException;
import org.biblioService.model.exception.AutreException;
import org.biblioService.model.exception.ParamsInvalidException;
import org.biblioService.model.exception.TechnicalException;
import org.biblioService.model.exception.NotFoundException;

@WebService (name = "UtilisateurService")
public interface UtilisateurService {
	
	/**
	 * Creer un Utilisateur
	 * @param pNom
	 * @param pPrenom
	 * @param pEmail
	 * @param pMdp
	 * @throws ParamsInvalidException lancé lorque les paramètres reçus sont incorrectes
	 * @throws TechnicalException lancé lors d'un problème technique de la base de donnée
	 */
	@WebMethod
	public void creerUtilisateur(@WebParam(name="nom") String pNom, @WebParam(name="prenom") String pPrenom, @WebParam(name="email") String pEmail, @WebParam(name="mdp") String pMdp) throws ParamsInvalidException, TechnicalException;
	
	/**
	 * Vérifier les identifiants (email/mot de passse) d'un utilisateur et retourne ses informations
	 * @param pEmail
	 * @param pMdp
	 * @return Utilisateur
	 * @throws AuthentificationException lancé en cas d'erreur dans l'authentification
	 * @throws NotFoundException lancé lorque aucun utilisateur ne correspond à l'email
	 */
	@WebMethod
	public Utilisateur authentifierUtilisateur(@WebParam(name="email") String pEmail, @WebParam(name="mdp") String pMdp) throws AuthentificationException, NotFoundException;

	/**
	 * Modifier les données de l'utilisateur correspondant à l'id</br>
	 * Remarque les paramètres (saud pId) peuvent être null ou vide, il ne seront alors pas modifié et l'ancienne valeur sera conservée
	 * @param pId
	 * @param pAncienMdp
	 * @param pNouveauNom
	 * @param pNouveauPrenom
	 * @param pNouveauMail
	 * @param pNouveauMdp
	 * @throws NotFoundException lancé lorque aucun utilisateur ne correspond à l'identifiant
	 * @throws AuthentificationException lancé en cas d'erreur dans l'authentification
	 * @throws ParamsInvalidException  lancé lorque les paramètres reçus sont incorrectes
	 * @throws TechnicalException  lancé lors d'un problème technique de la base de donnée
	 */
	@WebMethod
	public void modifierUtilisateur(@WebParam(name="id") int pId, @WebParam(name="ancienMdp") String pAncienMdp, @WebParam(name="nouveauNom") String pNouveauNom, @WebParam(name="nouveauPrenom") String pNouveauPrenom, @WebParam(name="nouveauEmail") String pNouveauMail, @WebParam(name="nouveauMdp") String pNouveauMdp) throws NotFoundException, AuthentificationException, ParamsInvalidException, TechnicalException;
	

	/**
	 * Supprimer l'utilisateur correspondant à l'id
	 * @param pId
	 * @param pMdp
	 * @throws NotFoundException lancé lorque aucun utilisateur ne correspond à l'identifiant
	 * @throws AuthentificationException lancé en cas d'erreur dans l'authentification
	 * @throws TechnicalException lancé lors d'un problème technique de la base de donnée
	 * @throws AutreException lancé lors que l'utilisateur à encore des prêt en cours : le compte ne peut pas être supprimé
	 */
	@WebMethod
	public void supprimerUtilisateur(@WebParam(name="id") int pId, @WebParam(name="mdp") String pMdp) throws NotFoundException, AuthentificationException,TechnicalException, AutreException;
	
}
