---
marp: true
---

# Wooclap – Outils pour la qualimétrie logicielle

## 🔍 Partie 1 : Revue de code et méthodes de mesure

**Q1 (QCM)**  
La revue de code permet principalement de :  
- [ ] Identifier les bugs  
- [ ] Améliorer la lisibilité du code  
- [ ] Réduire la dette technique  
- [x] Toutes les réponses précédentes  

---

**Q2 (Vrai/Faux)**  
La revue de code est un outil automatisé de mesure de qualité logicielle.  
- [ ] Vrai  
- [x] Faux  

---

**Q3 (Ouverte)**  
Citez deux bénéfices concrets d'une revue de code régulière dans une équipe de développement.

---

## 🛠 Partie 2 : Outils d’analyse statique

**Q4 (QCM)**  
Un outil d’analyse statique :  
- [ ] Analyse l’exécution du programme en temps réel  
- [ ] Se base sur les tests unitaires  
- [x] Analyse le code sans l'exécuter  
- [ ] Est utilisé uniquement pour les langages interprétés  

---

**Q5 (Vrai/Faux)**  
L’analyse statique permet d’identifier les erreurs potentielles avant même de lancer l’application.  
- [x] Vrai  
- [ ] Faux  

---

**Q6 (Ouverte)**  
Donnez un exemple de règle que pourrait vérifier un outil d’analyse statique.

---

## 🔧 Partie 3 : PMD dans Eclipse

**Q7 (QCM)**  
Pour installer PMD dans Eclipse, il faut :  
- [ ] Passer par la ligne de commande uniquement  
- [x] Installer un plugin via le marketplace Eclipse  
- [ ] Modifier les fichiers `pom.xml` d’un projet Maven  

---

**Q8 (QCM)**  
PMD permet notamment :  
- [ ] De corriger automatiquement le code  
- [x] D’identifier les mauvaises pratiques et les redondances  
- [ ] D’exécuter les tests unitaires  

---

**Q9 (Vrai/Faux)**  
PMD génère des rapports XML ou HTML après l’analyse du code.  
- [x] Vrai  
- [ ] Faux  

---

**Q10 (Ouverte)**  
Lors d'une analyse avec PMD, vous obtenez plusieurs erreurs de type "UnusedLocalVariable" : que signifie ce message ?

---

## 📏 Partie 4 : Checkstyle dans Eclipse

**Q11 (QCM)**  
Checkstyle est principalement utilisé pour :  
- [x] Appliquer des règles de style et de formatage  
- [ ] Tester les performances du code  
- [ ] Déployer le code sur un serveur  

---

**Q12 (QCM)**  
Une règle typique de Checkstyle est :  
- [ ] Aucune méthode ne doit dépasser 10 lignes  
- [x] Chaque classe doit commencer par un commentaire de licence  
- [ ] Toutes les classes doivent s'exécuter en moins de 100ms  

---

**Q13 (Vrai/Faux)**  
Checkstyle permet de définir des règles personnalisées via un fichier XML de configuration.  
- [x] Vrai  
- [ ] Faux  

---

**Q14 (Ouverte)**  
Comment interpréter un avertissement Checkstyle indiquant : "Missing a Javadoc comment"?

---

## 📊 Partie 5 : Centralisation avec Sonar

**Q15 (QCM)**  
La plateforme Sonar permet :  
- [x] De centraliser les métriques de qualité du code  
- [x] D’avoir une vision globale de la dette technique  
- [ ] De compiler automatiquement le projet  

---

**Q16 (QCM)**  
Les types d’analyses dans Sonar incluent :  
- [x] Complexité cyclomatique  
- [x] Duplication de code  
- [ ] Durée d’exécution des tests manuels  

---

**Q17 (Vrai/Faux)**  
Sonar ne permet d’analyser que du code Java.  
- [ ] Vrai  
- [x] Faux  

---

**Q18 (Vrai/Faux)**  
Sonar peut être intégré dans une chaîne d’intégration continue (CI/CD).  
- [x] Vrai  
- [ ] Faux  

---

**Q19 (Ouverte)**  
Quel est l’intérêt de visualiser les évolutions des indicateurs Sonar au fil du temps ?

---

**Q20 (Ouverte)**  
Donnez un exemple concret d’action corrective possible après l’analyse d’un projet via Sonar.


