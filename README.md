# LoadedDice

##Règles

###Partie 1

- Un dé (Dice) est défini par :
    - Un nombre de faces (minimum 4 et maximum 20)
    - Un nombre positif par face allant de 1 au nombre de face (pour un dé à 6 faces on aura les valeurs de 1 à 6)
    - Il peut être jeté (roll), il indique alors une face aléatoire
    
- Une pièce de monnaie (Coin) est définie par :
    - Deux faces : 1 et 2
    - Elle peut être jetée, elle indique alors une face aléatoire
    
- Un osselet (Knucklebones) est une sorte de dé dont:
    - le nombre de faces est fixé à 4
    - Les faces valent 1, 3, 4 ou 6
    - Il peut être jeté, il indique alors une face aléatoire

###Partie 2

- Un jet (Throw) est défini par :
    - Un nombre de dés, d'osselets ou de pièces (minimum 1 et maximum 5), un jet peut contenir à la fois des dés, des pièces ou des osselets
    - Un jet peut être effectué (run), dans ce cas chacun des dés, osselets ou pièces est jeté et le résultat est retourné de la plus grande à la plus petite valeur obtenue
    - Le résultat du dernier run est consultable, si le jet n'a pas encore été effectué, le résultat est -1

###Partie 3

- Un dé pipé (LoadedDice) est défini par :
    - Les mêmes règles qu'un dé classique
    - Une de ses faces a une probabilité supplémentaire de sortir (50% à 100% de chances d'être la face indiquée par le dé)
    - Un dé pipé ne peut pas être cassé

###Partie 4

- Chaque dé ou pièce a une probabilité d'être "cassé" (entre 0 et 10% pour un dé, entre 0 et 5% pour une pièce). Ce qui rend le jet invalide (résultat -1)
- Un osselet ne peut pas être "cassé"

La qualité et le soin apportés aux tests seront pris en compte dans la notation autant que le code lui-même.

#Préambule

Afin de pouvoir maîtriser la partie aléatoire dans les tests, mettre en place un mécanisme permettant de stubber la génération de nombres aléatoires (pensez à vous inspirer du RollingDice...)

Pensez à l'organisation de vos classes avant de vous lancer (création de classes abstraites pour générifier vos classes ?), la généricité de votre code et la qualité de vos tests sont les facteurs les plus importants pour la notation.


#Kata


    1.1. Ecrire le code pour créer un dé
    1.2. Ecrire le code pour créer un osselet
    1.3. Ecrire le code pour créer une pièce de monnaie
    1.4. Ecrire les tests validant les règles de la partie 1

 

    2.1. Créer la ou les classes représentant un jet
    2.2. Ecrire les tests validant les règles de la partie 2

 

    3.1. Adapter le code et ajouter le code nécessaire pour gérer un dé pipé. La face ainsi que sa probabilité de sortir sont à passer au constructeur
    3.2. Ajouter les tests nécessaires
    
     
    
    4.1. Adapter le code pour y intégrer les nouvelles règles concernant les jets cassés
    4.2. Ajouter les tests nécessaires

    Bonus : implémenter et tester une classe template SpecialThrow permettant de lancer soit des dés (pipés ou non), soit des osselets, soit des pièces
