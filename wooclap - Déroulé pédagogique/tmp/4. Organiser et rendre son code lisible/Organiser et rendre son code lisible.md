---
marp: true
---

# 🌟 Wooclap – Organiser et rendre son code lisible (20 questions)

## 🔹 Partie 1 – Gestion des packages

**1. QCU – Pourquoi organise-t-on le code en packages ?**  
- a) Pour réduire la taille du code  
- b) Pour éviter les conflits de noms et structurer le projet ✅  
- c) Pour améliorer les performances d’exécution  
- d) Pour accélérer la compilation

---

**2. QCM – Que doit-on prendre en compte lors du nommage des packages ?**  
- a) Hiérarchie fonctionnelle ✅  
- b) Lisibilité ✅  
- c) Convention : nom de domaine inversé ✅  
- d) Longueur minimale

---

**3. QCU – Parmi ces noms de packages, lequel respecte une bonne convention ?**  
- a) `MonApplication/ServiceClient`  
- b) `serviceClient`  
- c) `com.insee.client.service` ✅  
- d) `PackageServiceClient`

---

## 🔹 Partie 2 – Règles de nommage

**4. QCU – Quel est un bon nom pour une méthode retournant une liste de clients ?**  
- a) `getData()`  
- b) `clients()`  
- c) `retrieveClients()` ✅  
- d) `doSomething()`

---

**5. QCM – Quels principes s’appliquent au nommage des variables ?**  
- a) Noms explicites ✅  
- b) Préférer les abréviations  
- c) Cohérence avec la langue du projet ✅  
- d) Longueur arbitraire

---

**6. QCU – Quelle convention de nommage est généralement utilisée pour les constantes ?**  
- a) `camelCase`  
- b) `PascalCase`  
- c) `UPPER_SNAKE_CASE` ✅  
- d) `lowercase`

---

**7. Ouverte – Donnez un exemple de nom de méthode mal choisi et une amélioration possible.**

---

## 🔹 Partie 3 – Normes et formatage du code

**8. QCU – Pourquoi suivre une norme de codage ?**  
- a) Pour faciliter la maintenance et le travail collaboratif ✅  
- b) Pour que le code fonctionne plus vite  
- c) Pour obéir aux règles de sécurité  
- d) Pour contourner les erreurs de compilation

---

**9. QCM – Quels éléments peuvent être définis dans une norme de codage ?**  
- a) Longueur maximale d’une ligne ✅  
- b) Position des accolades ✅  
- c) Format des logs ✅  
- d) Style des icônes d’interface

---

**10. QCU – Quelle est une bonne pratique pour indenter son code ?**  
- a) Ne pas indenter  
- b) Indenter aléatoirement  
- c) Utiliser 2 ou 4 espaces ou une tabulation cohérente ✅  
- d) Changer de style selon les fichiers

---

**11. QCU – Le formatage automatique du code avec des outils comme Prettier ou Eclipse formatter est utile pour :**  
- a) Ajouter des commentaires  
- b) Corriger les erreurs de logique  
- c) Uniformiser la présentation ✅  
- d) Gérer les dépendances

---

**12. Ouverte – Pourquoi est-il important de ne pas laisser de code commenté obsolète dans un projet partagé ?**

---

## 🔹 Partie 4 – Visibilité des attributs et méthodes

**13. QCU – Quel est le niveau de visibilité le plus restrictif en Java ?**  
- a) `public`  
- b) `protected`  
- c) `private` ✅  
- d) `package-private`

---

**14. QCU – Quelle visibilité permet un accès uniquement au sein du même package ?**  
- a) `private`  
- b) `public`  
- c) (absence de mot-clé) ✅  
- d) `protected`

---

**15. QCM – Pourquoi limiter la visibilité des membres d’une classe ?**  
- a) Favoriser l'encapsulation ✅  
- b) Améliorer la lisibilité externe ✅  
- c) Réduire les dépendances ✅  
- d) Pour simplifier les tests unitaires

---

**16. Ouverte – Donnez un exemple d’attribut privé et expliquez pourquoi ce choix est judicieux.**

---

## 🔹 Partie 5 – Documenter avec Javadoc

**17. QCU – À quoi sert la Javadoc ?**  
- a) À exécuter le code  
- b) À générer une documentation HTML à partir des commentaires ✅  
- c) À commenter des blocs SQL  
- d) À remplacer les logs

---

**18. QCM – Quels éléments peut-on documenter avec Javadoc ?**  
- a) Classes ✅  
- b) Méthodes ✅  
- c) Fichiers de configuration  
- d) Interfaces ✅

---

**19. QCU – Quelle balise Javadoc décrit un paramètre d’une méthode ?**  
- a) `@return`  
- b) `@param` ✅  
- c) `@see`  
- d) `@throws`

---

**20. Ouverte – Donnez un exemple de commentaire Javadoc bien écrit pour une méthode `calculateTotal()`**


