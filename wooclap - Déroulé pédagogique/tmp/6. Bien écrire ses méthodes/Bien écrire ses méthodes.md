---
marp: true
---

# Wooclap – Bien écrire ses méthodes (avec réponses)

## 📘 Partie 1 : Passage par valeur en Java

**Q1**. En Java, le passage des arguments aux méthodes se fait :  
- a) Par référence  
- ✅ b) Par valeur  
- c) Par copie de l’objet  
- d) Par adresse  

---

**Q2**. Que signifie concrètement le "passage par valeur" pour un objet en Java ?  
- a) La méthode peut modifier la référence de l'objet  
- b) La méthode peut modifier l’objet pointé  
- ✅ c) La méthode reçoit une copie de la référence  
- d) L’objet est dupliqué à chaque appel  

---

**Q3**. Quelle est la conséquence d’un passage par valeur sur un type primitif ?  
- a) La valeur peut être modifiée dans la méthode  
- ✅ b) La valeur d’origine reste inchangée  
- c) Le type devient un objet  
- d) L’appelant reçoit un objet  

---

**Q4**. Lequel des éléments suivants est modifiable dans une méthode ?  
- a) La référence d’un objet  
- ✅ b) Le contenu d’un objet  
- c) Le type d’un objet  
- d) L’adresse mémoire d’un objet  

---

**Q5**. Quelle bonne pratique permet d’éviter des effets de bord lors du passage d’objets ?  
- a) Utiliser des variables statiques  
- ✅ b) Cloner les objets transmis  
- c) Utiliser `final` systématiquement  
- d) Caster les objets  

---

## 🧮 Partie 2 : Complexité cyclomatique

**Q6**. La complexité cyclomatique mesure :  
- a) Le nombre de lignes d’un programme  
- ✅ b) Le nombre de chemins indépendants dans un code  
- c) Le nombre d’objets instanciés  
- d) Le degré de réutilisabilité  

---

**Q7**. Une complexité cyclomatique élevée indique :  
- a) Un code plus performant  
- b) Un code facile à maintenir  
- ✅ c) Un code difficile à tester  
- d) Un code bien structuré  

---

**Q8**. Quelle structure augmente la complexité cyclomatique ?  
- a) Un appel de méthode  
- ✅ b) Une boucle `for`  
- c) Une déclaration de variable  
- d) Un commentaire  

---

**Q9**. Quelle valeur de complexité cyclomatique est généralement acceptable ?  
- ✅ a) ≤ 5  
- b) Entre 10 et 15  
- c) ≥ 20  
- d) 0  

---

**Q10**. Que permet de faire la mesure de complexité cyclomatique ?  
- a) Détecter les failles de sécurité  
- ✅ b) Prévoir le coût de test unitaire  
- c) Optimiser la mémoire  
- d) Réduire le temps d’exécution  

---

## 🚨 Partie 3 : Gestion des erreurs et exceptions personnalisées

**Q11**. Quelle est une bonne pratique en matière de gestion des exceptions ?  
- a) Masquer les erreurs à l’utilisateur  
- b) Utiliser `try-catch` autour de tout le code  
- c) Ne jamais attraper d'exception  
- ✅ d) Spécifier clairement les exceptions attendues  

---

**Q12**. Quand faut-il créer une exception personnalisée ?  
- ✅ a) Lorsqu’aucune exception standard ne décrit l’erreur  
- b) Pour chaque méthode  
- c) Pour remplacer `NullPointerException`  
- d) Pour réduire la taille du code  

---

**Q13**. Que doit contenir une bonne classe d’exception personnalisée ?  
- a) Un code de statut HTTP  
- ✅ b) Un champ `serialVersionUID` et un message  
- c) Une interface graphique  
- d) Une boucle de traitement  

---

**Q14**. Quelle est la meilleure façon de propager une exception ?  
- a) Utiliser `System.exit()`  
- b) Lancer une nouvelle exception sans enchaînement  
- ✅ c) Logger et relancer avec `throw`  
- d) Masquer l’erreur dans un `catch` vide  

---

**Q15**. Quelle exception est la plus adaptée pour signaler une ressource manquante ?  
- a) `NullPointerException`  
- b) `IndexOutOfBoundsException`  
- c) `IllegalArgumentException`  
- ✅ d) `FileNotFoundException`  

---

## ✍️ Partie 4 : Bonnes pratiques de conception de méthode

**Q16**. Quelle est la taille idéale d’une méthode ?  
- a) 1 ligne  
- ✅ b) ≤ 20 lignes  
- c) 50 à 100 lignes  
- d) > 200 lignes  

---

**Q17**. Une méthode devrait :  
- a) Réaliser plusieurs tâches complexes  
- b) Avoir plusieurs points d'entrée  
- ✅ c) Réaliser une seule tâche  
- d) Modifier des variables globales  

---

**Q18**. Que signifie le principe "clean code" pour une méthode ?  
- a) Code commenté en détail  
- b) Noms courts pour les méthodes  
- ✅ c) Structure lisible et cohérente  
- d) Exécution rapide  

---

**Q19**. Que faut-il éviter dans une méthode bien écrite ?  
- a) L’injection de dépendances  
- b) Le traitement d’erreur localisé  
- ✅ c) Les effets de bord  
- d) La réutilisation de code  

---

**Q20**. Quelle pratique améliore la lisibilité des méthodes ?  
- ✅ a) Noms explicites pour les méthodes et paramètres  
- b) Abréviations dans les noms  
- c) Utilisation massive de `return`  
- d) L’absence de commentaires  
