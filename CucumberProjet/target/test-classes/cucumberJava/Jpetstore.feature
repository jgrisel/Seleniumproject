Feature: Se connecter a l'application JpetStore

	Scenario: Je veux me connecter a l'application Jpestore
		Given j'accede a l'URL de JpetStore
		And Je clique sur le bouton Login
		And Je saisis dans le champ username "j2ee"
		And Je saisis dans le champs password "j2ee"
		And Je clique sur le bouton Login2
		Then Je suis connecte
		Then Le message accueil suivant est lisible "Welcome ABC!"



