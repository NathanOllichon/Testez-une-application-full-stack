# Yoga-app

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.1.0.

## Start the project
Git clone:
> git clone https://github.com/OpenClassrooms-Student-Center/P5-Full-Stack-testing

### Database
SQL script for creating the schema is available `ressources/sql/script.sql`

By default the admin account is:
- login: yoga@studio.com
- password: test!1234
  
### Launch Front
Go inside front folder:
> cd front

Install dependencies:
> npm install

Launch Front-end:
> npm run start;

### Launch Back
Open an eclipse IDE and configure a Run as a Spring Boot App.
Run your app

## Ressource
### Postman collection
For Postman import the collection in 'ressources/postman/yoga.postman_collection.json'

## How launch tests ?

### Front

#### Unitaries tests
> cd front
> npm run test unit
    
The report is in "Testez-une-application-full-stack/front/coverage/jest/lcov-report/index.html"
  
#### Tests d'intégration
> cd front
> npm run test int
    
The report is in "Testez-une-application-full-stack/front/coverage/jest/lcov-report/index.html"

### Back
For launch unitaries and integrations tests, the configuration launch this test on maven task, try with
> mvn clean install
He will generate a rapport in 'Testez-une-application-full-stack\back\target\jacoco.exec'.

### End to End tests
Go in front folder and launch the run command
> cd front
> npm run e2e

For create coverage, this report is in "/Testez-une-application-full-stack/front/coverage/lcov-report/index.html" 
> npm run e2e:coverage
  
