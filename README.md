# IT_Support_App

## Description

Ce système facilite la gestion des équipements informatiques au sein d'une organisation et fournit un suivi efficace des pannes et des tickets de support. Il permet également la génération de rapports et de statistiques pour évaluer les performances et l'état des équipements.

## User Stories

### Gestion des Équipements Informatiques

- **Administrateur IT:** Ajouter de nouveaux équipements informatiques au système afin de suivre leur état et leur utilisation.
- **Administrateur IT:** Modifier les informations des équipements existants pour maintenir des données à jour.
- **Administrateur IT:** Supprimer des équipements obsolètes ou hors service pour garder le système organisé.
- **Administrateur IT:** Voir une liste de tous les équipements avec leur état actuel pour une gestion efficace.

### Suivi des Pannes

- **Utilisateur:** Signaler une panne sur un équipement pour que le service IT puisse la prendre en charge.
- **Administrateur IT:** Enregistrer les pannes détectées pour un suivi et une réparation efficace.
- **Administrateur IT:** Suivre l'état des réparations pour chaque panne signalée pour assurer une résolution rapide.
- **Administrateur IT:** Consulter l'historique des pannes pour chaque équipement afin d'identifier les équipements problématiques.

### Gestion des Tickets de Support

- **Utilisateur:** Créer un ticket de support pour signaler un problème technique afin de recevoir de l'aide.
- **Administrateur IT:** Attribuer les tickets de support aux techniciens disponibles pour une résolution rapide.
- **Technicien IT:** Voir les tickets qui lui sont attribués pour les traiter efficacement.
- **Utilisateur:** Suivre l'état de son ticket de support pour savoir quand son problème sera résolu.


## Technologies Utilisées

- **Backend:** Spring Boot, Spring Data JPA, Spring Security
- **Frontend:** Angular 16
- **Base de données:** MySQL
- **Test unitaire:** JUnit
- **Conteneurisation:** Docker
