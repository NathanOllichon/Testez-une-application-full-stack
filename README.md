
---------------------------------------------------------------------------
# Testez-une-application-full-stack
# Yoga

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.1.0.

## Start the project

Git clone:

> git clone https://github.com/OpenClassrooms-Student-Center/P5-Full-Stack-testing

Go inside folder:

> cd yoga

Install dependencies:

> npm install

Launch Front-end:

> npm run start;


## Ressources

### Mockoon env 

### Postman collection

For Postman import the collection

> ressources/postman/yoga.postman_collection.json 

by following the documentation: 

https://learning.postman.com/docs/getting-started/importing-and-exporting-data/#importing-data-into-postman


### MySQL

SQL script for creating the schema is available `ressources/sql/script.sql`

By default the admin account is:
- login: yoga@studio.com
- password: test!1234
- 

# How launch tests ?

# Front:
- Tests unitaires
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run test unit'.
  
- Tests d'intégration
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run test int'.
    
- Tests e2e:
    Dans un invité de commande aller dans le dossier 'front/' et faites un 'npm run e2e'.
    Ensuite pour générer le coverage faite un 'npm run e2e:coverage'.

# Back:
- Test unitaires et intégration
  Configuré pour se lancer lors des taches maven, un simple 'clean install' va lancer tout les tests et gébérer un rapport dans 'Testez-une-application-full-stack\back\target\jacoco.exec'.
  
