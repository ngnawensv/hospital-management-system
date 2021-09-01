##### Multi-modules spring-boot application demonstration


- Creation de l'application root
- Creation des different modules

Les etapes:
1)	Créer le projet parent (module parent). Un projet spring initializr. Type de projet maven POM. Choisir les dépendances jpa, lombok, h2/mysql, …

2)	Créer différents modules en sélectionnant le projet parent, choisir module, puis maven et enfin saisir le artefactI et nom du module. Dans notre cas nous avons les modules suivants :
- **Domain** : contient les entités
- **Repository** : contient les interfaces repositories (couche d’accès aux données)
- **Service** : contient les interfaces et les classes de la couche métier
- **Web** : contient les contrôleurs
- **Email-app** : représente un service d’envoi des mails.

3)	Ajouter <packaging>jar</packaging> aux pom.xml de tous les sous modules.
4)	Injecter dans le module repository, le module domain via le pom.xml. En effet, le module repository a besoin du module domain.
5)	Injecter dans le module service, les modules repository et email-app via le pom.xml. En effet, le module service a besoin des modules repository et email-app.
6)	Injecter dans le module web, le module service via le pom.xml. En effet, le module web a besoin du module service.
7)	Injecter aussi dans la couche web, la dépendance spring web et créer la classe contenant la méthode main() pour permettre l’exécution de l’application


##
For beginning, watch this video https://www.youtube.com/watch?v=DG9B2w-N42s
##
Les principaux avantages de cette approche sont : la réutilisabilité et la maintenabilité.