package org.biblioService.webapp.impl;

import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.biblioService.business.contrat.ManagerFactory;
import org.biblioService.model.bean.Utilisateur;
import org.biblioService.model.exception.AuthentificationException;
import org.biblioService.model.exception.AutreException;
import org.biblioService.model.exception.NotFoundException;
import org.biblioService.model.exception.ParamsInvalidException;
import org.biblioService.model.exception.TechnicalException;
import org.biblioService.webapp.contrat.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {
	
	private static final Logger LOGGER = LogManager.getLogger(UtilisateurServiceImpl.class);
	
	@Inject
	private ManagerFactory managerFactory;

	@Override
	public void creerUtilisateur(String pNom, String pPrenom, String pEmail, String pMdp) throws ParamsInvalidException, TechnicalException {
		LOGGER.traceEntry("nom = " + pNom + " prenom = " + pPrenom + " email = " + pEmail + " mdp = " + pMdp);

		managerFactory.getUtilisateurManager().createUtilisateur(pNom, pPrenom, pEmail, pMdp);
		
		LOGGER.traceExit();
	}

	@Override
	public Utilisateur authentifierUtilisateur(String pEmail, String pMdp) throws AuthentificationException, NotFoundException {
		LOGGER.traceEntry("email = " + pEmail + " mdp = " + pMdp);

		Utilisateur vUtilisateur = managerFactory.getUtilisateurManager().authentifierUtilisateur(pEmail, pMdp);
		
		LOGGER.traceExit(vUtilisateur);
		return vUtilisateur;
	}

	@Override
	public void modifierUtilisateur(int pId, String pAncienMdp, String pNouveauNom, String pNouveauPrenom,String pNouveauMail, String pNouveauMdp) throws NotFoundException, AuthentificationException, ParamsInvalidException, TechnicalException {
		LOGGER.traceEntry("id = " + pId + " ancienMdp = " + pAncienMdp + " nouveauNom = " + pNouveauNom + " nouveauPrenom = " + pNouveauPrenom + " nouveauMail = " + pNouveauMail + " nouveauMdp = " + pNouveauMdp);

		managerFactory.getUtilisateurManager().updateUtilisateur(pId, pAncienMdp, pNouveauNom, pNouveauPrenom, pNouveauMail, pNouveauMdp);
		
		LOGGER.traceExit();

	}

	@Override
	public void supprimerUtilisateur(int pId, String pMdp)  throws NotFoundException, AuthentificationException,TechnicalException, AutreException{
		LOGGER.traceEntry("id = " + pId + " mdp = " + pMdp);
		
		managerFactory.getUtilisateurManager().deleteUtilisateur(pId, pMdp);
		
		LOGGER.traceExit();
	}

}
