---
marp: true
---

# 🌐 Wooclap – Le cycle de vie d’un logiciel : la qualité du code source (20 questions)

## 🔧 1. Le mode projet : construire du logiciel

**Q1. (QCM)** Quelle est la première étape typique d’un projet logiciel ?  
- a) Rédaction des tests unitaires  
- b) Recueil des besoins  
- c) Correction de bugs  
- d) Déploiement initial  
**Réponse attendue : b)**

---

**Q2. (QCM)** Parmi les éléments suivants, lequel est essentiel pour garantir la qualité d’un logiciel dès la phase de développement ?  
- a) Ignorer les retours utilisateurs  
- b) Travailler sans documentation  
- c) Écrire du code testable  
- d) Éviter les outils de gestion de version  
**Réponse attendue : c)**

---

**Q3. (Question ouverte)** Donnez un exemple d'activité dans un projet logiciel qui relève du mode projet.

---

**Q4. (Appariement)** Associez les rôles aux responsabilités :  
- Chef de projet → Suivi du planning  
- Développeur → Écriture du code  
- Testeur → Vérification des fonctionnalités  
- UX designer → Ergonomie de l’interface

---

**Q5. (Vrai/Faux)** Un projet logiciel ne nécessite pas de documentation si le code est bien écrit.  
**Réponse attendue : Faux**

---

## 🔄 2. Le mode maintenance : faire vivre le logiciel

**Q6. (QCM)** Quel type de maintenance consiste à ajouter de nouvelles fonctionnalités ?  
- a) Corrective  
- b) Préventive  
- c) Adaptative  
- d) Évolutive  
**Réponse attendue : d)**

---

**Q7. (QCM)** Lorsqu’un bug est corrigé après la mise en production, de quel type de maintenance parle-t-on ?  
- a) Évolutive  
- b) Corrective  
- c) Préventive  
- d) Adaptative  
**Réponse attendue : b)**

---

**Q8. (Vrai/Faux)** Le code en production n’a jamais besoin d’être modifié.  
**Réponse attendue : Faux**

---

**Q9. (Question ouverte)** Quelle est la différence entre la maintenance préventive et la maintenance évolutive ?

---

**Q10. (Classement)** Classez ces types de maintenance du plus fréquent au moins fréquent :  
- Corrective  
- Évolutive  
- Préventive  
- Adaptative  
**Réponse attendue : Corrective > Évolutive > Préventive > Adaptative**

---

## ⚙️ 3. Pré-requis aux interventions

**Q11. (QCM)** Quel outil est couramment utilisé pour la gestion de version ?  
- a) Git  
- b) Excel  
- c) Word  
- d) Notepad++  
**Réponse attendue : a)**

---

**Q12. (Question ouverte)** Pourquoi est-il risqué de modifier le code source sans gestion de version ?

---

**Q13. (Vrai/Faux)** La gestion de version permet de revenir à un état antérieur du code.  
**Réponse attendue : Vrai**

---

**Q14. (Appariement)** Associez chaque terme à sa définition :  
- Commit → Enregistrement d’une modification  
- Branch → Version parallèle du code  
- Merge → Fusion de branches  
- Pull request → Demande d’intégration de modifications

---

**Q15. (QCM)** Quelle pratique garantit le bon fonctionnement des composants logiciels après une modification ?  
- a) Le refactoring silencieux  
- b) Les tests unitaires  
- c) L’ajout de fonctionnalités sans vérification  
- d) Le changement de développeur  
**Réponse attendue : b)**

---

## ✅ 4. Tests unitaires & JUnit

**Q16. (QCM)** Que vérifie un test unitaire ?  
- a) L’ergonomie de l’interface  
- b) Le fonctionnement isolé d’une fonction ou méthode  
- c) L’ensemble de l’application en production  
- d) La vitesse du réseau  
**Réponse attendue : b)**

---

**Q17. (Question ouverte)** Que permet de valider un test automatisé exécuté à chaque modification du code ?

---

**Q18. (Vrai/Faux)** Les tests unitaires permettent de limiter les effets de bord.  
**Réponse attendue : Vrai**

---

**Q19. (QCM)** Quelle bibliothèque Java est spécialisée dans les tests unitaires ?  
- a) Mockito  
- b) JUnit  
- c) Log4j  
- d) Maven  
**Réponse attendue : b)**

---

**Q20. (Question ouverte)** Citez un avantage de l’utilisation de JUnit dans un projet Java.
