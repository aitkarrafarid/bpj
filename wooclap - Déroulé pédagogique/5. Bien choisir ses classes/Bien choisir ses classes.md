---
marp: true
---

# 🧠 Wooclap – Bien choisir ses classes en Java (20 questions)

## 1. Principes généraux

**Q1 – Vrai/Faux**  
> Une classe Java doit généralement avoir une seule responsabilité.  
✅ **Réponse** : Vrai

---


**Q2 – QCM**  
> Quelles sont de bonnes pratiques pour concevoir une classe ?  
- [ ] Multiplier les responsabilités  
- [x] Masquer les détails d'implémentation  
- [x] Favoriser l'encapsulation  
- [x] Utiliser des noms explicites  
- [ ] Coupler fortement les classes

---


**Q3 – Appariement**  
Associez chaque concept à sa définition :  
- **Encapsulation** → Masquer l’état interne d’un objet  
- **Abstraction** → Exposer uniquement les comportements utiles  
- **Cohésion** → Unité fonctionnelle claire dans la classe  
- **Couplage** → Niveau de dépendance entre les classes

---

## 2. Les énumérations Java

**Q4 – QCM**  
> À quoi servent les énumérations (`enum`) en Java ?  
- [x] Représenter un ensemble fini de constantes  
- [x] Améliorer la lisibilité du code  
- [ ] Générer des exceptions  
- [ ] Remplacer les interfaces

---


**Q5 – Vrai/Faux**  
> Une énumération peut contenir des méthodes et des champs en Java.  
✅ **Réponse** : Vrai

---


**Q6 – Réponse ouverte**  
> Donnez un exemple simple d’énumération Java représentant les jours de la semaine.

---

## 3. Zoom sur la classe `String`

**Q7 – QCM**  
> Quelle(s) affirmation(s) est(sont) vraie(s) à propos de la classe `String` en Java ?  
- [x] Elle est immuable  
- [x] Elle est optimisée via le pool de chaînes  
- [ ] Elle hérite directement de `Object` sans redéfinir `equals()`  
- [ ] Elle se compare avec `==`

---


**Q8 – Vrai/Faux**  
> Utiliser `==` pour comparer deux objets `String` est recommandé.  
❌ **Réponse** : Faux

---


**Q9 – Ordonnancement**  
> Classez ces opérations sur `String` du plus sûr au plus risqué :  
1. `equals()`  
2. `equalsIgnoreCase()`  
3. `==`

---

## 4. Le choix des collections : `ArrayList`, `HashSet`, `HashMap`

**Q10 – QCM**  
> Quels sont les avantages de `ArrayList` ?  
- [x] Accès rapide par index  
- [ ] Pas de doublons  
- [ ] Clés/valeurs associées  
- [x] Ordre d’insertion conservé

---

**Q11 – QCM**  
> Quelles interfaces communes sont implémentées par `ArrayList`, `HashSet` et `HashMap` ?  
- [x] Serializable  
- [x] Cloneable  
- [ ] Runnable  
- [ ] Comparable

---

**Q12 – Appariement**  
Associez la structure à son usage :  
- **ArrayList** → Liste ordonnée avec doublons  
- **HashSet** → Ensemble non ordonné sans doublons  
- **HashMap** → Association clé/valeur sans doublons sur les clés

---

**Q13 – Réponse ouverte**  
> Dans quel cas préféreriez-vous un `HashSet` à un `ArrayList` ? Expliquez.

---

## 5. Redéfinir `equals()` et `hashCode()`

**Q14 – QCM**  
> Pourquoi faut-il redéfinir à la fois `equals()` et `hashCode()` ?  
- [x] Pour garantir un comportement cohérent dans les collections  
- [x] Pour que deux objets égaux aient le même code de hachage  
- [ ] Pour trier automatiquement les objets  
- [ ] Pour améliorer les performances réseau

---

**Q15 – Vrai/Faux**  
> Si `equals()` est redéfini sans `hashCode()`, cela peut provoquer des comportements anormaux dans les `HashSet`.  
✅ **Réponse** : Vrai

---

**Q16 – Réponse ouverte**  
> Que garantit le contrat entre `equals()` et `hashCode()` ?

---

**Q17 – QCM**  
> Dans quel cas `hashCode()` est-il principalement utilisé ?  
- [ ] Lors de l’affichage d’un objet  
- [x] Lors du stockage dans des structures de hachage comme `HashMap`  
- [ ] Lors de la sérialisation  
- [ ] Pour le tri naturel

---

**Q18 – Appariement**  
Associez le code à son effet :  
- **equals()** → Comparaison de contenu  
- **==** → Comparaison de références  
- **hashCode()** → Calcul d’empreinte pour les tables de hachage

---

## 6. Synthèse / Révision

**Q19 – Vrai/Faux**  
> Une classe peut redéfinir `toString()`, `equals()` et `hashCode()` pour contrôler son affichage, sa comparaison et son usage en collection.  
✅ **Réponse** : Vrai

---

**Q20 – Réponse ouverte**  
> Quels sont, selon vous, les deux critères les plus importants pour bien choisir une classe ou une collection en Java ? Pourquoi ?
