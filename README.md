
● Le README doit expliquer :
○ comment installer la base de données ;
○ comment installer l’application ;
○ comment faire fonctionner l’application ;
○ comment lancer les différents tests ;
○ comment générer les différents rapports de couverture.


---------------------------------------------------------------------------
# Testez-une-application-full-stack

How install dependencies ?
// pour le front avec npm install ;
// pour le back avec la commande mvn clean install.

Front:

launch 
  npm run e2e
generate coverage:
  npm run e2e:coverage
Back:

# How launch tests ?

# Front:


lancer les tests:

- Tests unitaires
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run test unit'.
  
- Tests d'intégration
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run test int'.
    
- Tests e2e:
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run e2e'.
    Ensuite pour générer le coverage faite un 'npm run e2e:coverage'.

# Back:
