USE BurgerProject;

INSERT INTO Utilisateur(idUtil, nom, prenom, mail, password, typeUtil )
  VALUES
    (1, 'HADJ', 'Clément', 'clement.hadj@outlook.fr', "clementh", 1),
	  (2, 'DE ALMEIDA', 'Pierre', 'pierre.dealmeida@outlook.fr', "pierreD", 0),
	  (3, 'MARTEAU', 'Nicolas', 'nicolas.marteau@outlook.fr', "nicolasM", 1),
	  (4, 'DUTHION', 'Mathias', 'mathias.duthion@outlook.fr', "mathiasD", 0),
	  (5, 'CHEVALLIER', 'Guillaume', 'guillaume.chevallier@outlook.fr', "guillaumeC", 1),
	  (6, 'GIRARD', 'Quentin', 'quentin.girard@outlook.fr', "quentinG", 0),
	  (7, 'PRATTICO', 'Emilien', 'emilien.prattico@outlook.fr', "emilienP", 1);

INSERT INTO Viande(idViande, libelle)
  VALUES
    (1,"Poulet"),
    (2,"Steak haché"),
    (3,"Poisson"),
    (4,"Veggie");

INSERT INTO Sauce(idSauce, libelle)
  VALUES
    (1,"Ketchup"),
    (2,"Sauce burger"),
    (3,"Mayonnaise"),
    (4,"Biggy");

INSERT INTO Burger(idBurger, libelle, isPain, isByCreator, prix, idViande, idSauce)
  VALUES
    (1,"Chicken Burger", 1, 1, 5.00, 1, 1),
    (2,"Beef Burger", 1, 1, 5.00, 2, 1),
    (3,"Cheese Burger", 1, 1, 5.50, 2, 2),
    (4,"Fish Burger", 1, 1, 5.00, 3, 1),
    (5,"Veggie Burger", 1, 1, 5.00, 4, 1),
    (6,"Real Bread Burger", 0, 1, 5.00, 2, 1);

