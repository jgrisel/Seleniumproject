Feature: achat

Scenario: Verifier la fonctionnalite achat d'un produit

	Given Le prix des produits de cette liste
      | cafe  |  1   | 
      | donut |  2   | 
	When Je commande 2 "cafe"
	And Je commande 1 "donut"
	Then Je dois payer 4 euros