---
marp: true
---

# Questionnaire Wooclap : Le Refactoring

## Q1 - QCM
**Quels sont les objectifs principaux du refactoring ?**  
- [x] Améliorer la lisibilité du code  
- [x] Réduire la complexité  
- [x] Faciliter la maintenance  
- [ ] Augmenter la vitesse d'exécution  
- [ ] Ajouter de nouvelles fonctionnalités  

---

## Q2 - Vrai/Faux  
**Le refactoring modifie le comportement observable du programme.**  
- [ ] Vrai  
- [x] Faux  

---

## Q3 - QCM  
**Quelles étapes sont essentielles lors d'un refactoring ?**  
- [x] Comprendre le code existant  
- [x] Effectuer des tests avant et après  
- [x] Refactorer par petites étapes  
- [ ] Supprimer tous les commentaires  

---

## Q4 - Réponse courte  
**Quel outil d’Eclipse permet de renommer automatiquement une classe ?**  
Réponse attendue : `Rename refactoring assistant` ou `F2`

---

## Q5 - Appariement  
**Associez les actions à leur type de refactoring :**  
- Renommer une méthode → Rename  
- Isoler un bloc de code récurrent → Extract Method  
- Déplacer une classe dans un autre package → Move  
- Créer une constante à la place d'une valeur magique → Extract Constant  

---

## Q6 - Vrai/Faux  
**Eclipse permet de détecter automatiquement les effets secondaires d’un renommage.**  
- [x] Vrai  
- [ ] Faux  

---

## Q7 - QCM  
**Pourquoi faire un *Extract Method* ?**  
- [x] Pour rendre le code plus lisible  
- [x] Pour éviter les duplications  
- [ ] Pour améliorer la performance d’exécution  

---

## Q8 - QCU  
**Quel outil Eclipse permet de refactorer sans changer la logique du programme ?**  
- [ ] Refactor → Rename  
- [ ] Refactor → Extract Method  
- [x] Tous les deux  

---

## Q9 - Réponse courte  
**Comment vérifier la non-régression après un refactoring ?**  
Réponse attendue : `Par des tests unitaires`

---

## Q10 - Vrai/Faux  
**Le renommage d'un package peut casser l'import des classes dans d'autres fichiers.**  
- [x] Vrai  
- [ ] Faux  

---

## Q11 - QCM  
**Quelles entités peut-on extraire dans Eclipse ?**  
- [x] Méthode  
- [x] Constante  
- [x] Interface  
- [ ] Annotation  

---

## Q12 - Réponse courte  
**Donnez un exemple d’utilisation utile de `StringBuffer` en refactoring Java.**  
Réponse attendue : `Pour améliorer les performances lors de la concaténation de chaînes`

---

## Q13 - QCM  
**En base de données, que peut impliquer un refactoring ?**  
- [x] Création ou suppression d’index  
- [x] Remaniement de vues  
- [x] Simplification des requêtes SQL  
- [ ] Ajout de colonnes sans justification  

---

## Q14 - Vrai/Faux  
**Utiliser `LIMIT` dans les requêtes SQL permet de limiter la charge en lecture.**  
- [x] Vrai  
- [ ] Faux  

---

## Q15 - QCM  
**Quels éléments sont concernés par le refactoring SQL ?**  
- [x] Nombre de colonnes sélectionnées  
- [x] Utilisation des index  
- [x] Clarté et performance des vues  

---

## Q16 - Appariement  
**Associez les éléments SQL à leur utilité en refactoring :**  
- `LIMIT` → Réduire le volume de résultats  
- Index → Accélérer les requêtes  
- Vue → Simplifier l’accès aux données complexes  
- Pool de connexions → Gérer efficacement les accès simultanés  

---

## Q17 - Vrai/Faux  
**Libérer les ressources (connexion, statement) est facultatif si l’on utilise du JDBC.**  
- [ ] Vrai  
- [x] Faux  

---

## Q18 - Réponse courte  
**Quel mot-clé Java peut être utilisé avec `try` pour garantir la libération des ressources ?**  
Réponse attendue : `try-with-resources`

---

## Q19 - QCM  
**Quels outils ou assistants Eclipse facilitent le refactoring ?**  
- [x] Refactor menu  
- [x] Ctrl + 1 (Quick Fix)  
- [x] Shortcut F2 / Alt+Shift+R  
- [ ] Debug perspective  

---

## Q20 - Vrai/Faux  
**Le refactoring peut être appliqué aussi bien au code source qu’à la base de données.**  
- [x] Vrai  
- [ ] Faux  
