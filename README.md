# TP Spring Boot

## Aloïs FLEURY, Noé JOUAN, Evan RUNEMBERG

### Consignes

- 10 minutes de présentation, 5 minutes de questions
- Objectifs :
    - Faire évoluer l'application Spring Boot
    - Montrer que ce qui a été fait a été compris
    - Expliquer les choix, contraintes rencontrées et solutions trouvées

Exemple de répartition :

- 4' présentation fonctionnelle (démo possible) => ce qui a été fait
- 4' présentation technique => comment cela a été fait
- 2' focus sur un problème rencontré et comment il a été résolu

### Import du projet

Récupérer le projet :

```bash
git clone https://github.com/Nimedas/imt-spring-2025.git
```

Importer le projet dans IntelliJ :

- File > New > Project from existing sources
- Import project from external model > Maven

![Import du projet](import.png)

![Import du projet](import2.png)

IntelliJ va importer le projet en lisant le pom.xml, télécharger les dépendances et indexer les fichiers.

Si besoin, faire un `mvn clean install` pour télécharger les dépendances OU rafraichir via le menu maven sur la droite
de l'IDE :

![Menu maven](maven.png)
