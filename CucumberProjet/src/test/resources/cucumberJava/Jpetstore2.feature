Feature: Se connecter a l'application JpetStore

	Scenario Outline: Je veux me connecter a l'application Jpestore
		Given j'accede a l'URL de JpetStore
		And Je clique sur le bouton Login
		And Je saisis dans le champ username <login>
		And Je saisis dans le champs password <password>
		And Je clique sur le bouton Login2
		Then Je suis connecte
		Then Le message accueil suivant est lisible <message>
		

Examples:
| login | password | message |
| "j2ee" | "j2ee" | "Welcome ABC!" |
| "ACID" | "ACID" | "Welcome ABC!" |

