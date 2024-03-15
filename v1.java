package monpackage;

import java.lang.Math;
import java.lang.Thread;

public class v1 {

	public static void main(String[] args) throws InterruptedException {

		String nom_j1, nom_j2; // Définir les deux joueurs
		int points_j1 = 0; // Définir le score de joueur 1
		int points_j2 = 0; // Définir le score de joueur 2
		int lancer = 2; // Définir le nombre de lancers
		boolean actuel = false;

		System.out.println("Bienvenue sur le jeu de dé ! Le premier des 2 joueurs à cumuler 30 points gagne.");
		nom_j1 = Saisie.lire_String("------JOUEUR 1 saisissez votre prenom------"); // Nom du joueur 1
		nom_j2 = Saisie.lire_String("------JOUEUR 2 saisissez votre prenom------"); // Nom du joueur 2
		java.util.concurrent.TimeUnit.SECONDS.sleep(2);

		// définir le joueur qui commence
		// début = math.random

		int max = 6; // nombre max de l'aléatoire sur le des
		int min = 1; // nombre min de l'aléatoire sur le des
		int range = max - min + 1;

		for (var p = 0; p < 1; p++) {
			var rand1 = (int) (Math.random() * range) + min; // random qui désigne le nombre aléatoire pour le joueur1
			var rand2 = (int) (Math.random() * range) + min; // random qui désigne le nombre aléatoire pour le joueur2

			// définir le joueur qui commence

			int j1 = 1; // nombre max de l'aléatoire
			int j2 = 0; // nombre min de l'aléatoire
			int range_joueur = j1 - j2 + 1;
			for (int c = 0; c < 1; c++) {
				int randDébut = (int) (Math.random() * range_joueur) + j2; // Pour designer le joueur qui commence

				if (randDébut == 1) { // Définir qui commence
					System.out.println("C'est à " + nom_j1 + " de commencer !"); // Pour designer le joueur 1 qui
																					// commence
				} else {
					System.out.println("C'est à " + nom_j2 + " de commencer !"); // Pour designer le joueur 2 qui
																					// commence
				}
				java.util.concurrent.TimeUnit.SECONDS.sleep(2);

				while ((points_j1 < 30) && (points_j2 < 30)) { // tant que les deux scores sont inférieurs à 30 le
																// programme continue
					System.out.println("------------------");
					if (randDébut == 1) {
						if (actuel) {
							System.out.println("C'est au tour de " + nom_j1 + " pour le lancer numéro : " + lancer);
							System.out.println("");

							lancer++; // le nombre de lancers que le robot a fait

							

						}

						actuel = true;
						
						points_j1 += rand1; // rajout du nombre obtenu via dé au score du joueur
						if (rand1 == 6) {
							while (rand1 == 6) { // tant que la valeur obtenue au dé est égale à 6 alors le joueur
													// relance
								System.out.println(nom_j1 + " relance !");
								
								System.out.println(nom_j1 + " obtient " + rand1 + " au lancer.");
								points_j1 += rand1;
							}
						} else {
							System.out.println(nom_j1 + " lance le dé, et c'est : " + rand1);
							System.out.println(nom_j1 + " est à  : " + points_j1 + " point(s)");
							System.out.println("");

						}
						if (points_j1 > 1) {
							System.out.println("Le score de " + nom_j1 + " est de " + points_j1 + " points");
						} else {
							System.out.println("Le score de " + nom_j1 + " est de " + points_j1 + " point");
						}
						
						randDébut = 2;

					} else {
						if (actuel) {
							System.out.println("C'est au tour de " + nom_j2 + " pour le lancer numéro : " + lancer);
							System.out.println("");

							lancer++; // le nombre de lancers que le robot a fait

							

						}
						actuel = true;
						
						points_j2 += rand2; // rajout du nombre obtenu via dé au score du joueur
						if (rand2 == 6) {
							while (rand2 == 6) { // tant que la valeur obtenue au dé est égale à 6 alors le joueur
													// relance
								System.out.println(nom_j2 + " relance !");
								
								System.out.println(nom_j2 + " obtient " + rand2 + " au lancer.");
								points_j2 += rand2;
							}
						} else {
							System.out.println(nom_j2 + " lance le dé, et c'est : " + rand2);
							System.out.println(nom_j2 + " est a  : " + points_j2 + " point(s)");
							System.out.println("");
						}
						if (points_j2 > 1) {
							System.out.println("Le score de " + nom_j2 + " est de " + points_j2 + " points");
						} else {
							System.out.println("Le score de " + nom_j2 + " est de " + points_j2 + " point");
						}
						
						randDébut = 1;
					}
				}

				if (points_j1 >= 30) { // quand un des joueurs obtient plus ou autant que 30 le robot s'arrête
					System.out.println(nom_j1 + " à gagné avec " + points_j1 + " !");

				} else {
					System.out.println(nom_j2 + " à gagné avec " + points_j2 + " !");
				}
			}
		}
	}
}
