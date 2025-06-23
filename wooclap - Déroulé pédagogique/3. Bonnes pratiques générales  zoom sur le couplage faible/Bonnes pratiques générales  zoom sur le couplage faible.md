---
marp: true
---

# Wooclap – Bonnes pratiques générales : Zoom sur le couplage faible

## 1. QCM
**Qu’est-ce que le couplage faible ?**  
- [ ] Une forte dépendance entre modules  
- [x] Une structure favorisant l’indépendance des composants  
- [ ] L’absence de toute communication entre modules  
- [ ] Une méthode de test automatisé  

---

## 2. Vrai/Faux  
**Une architecture en couches bien définie favorise un couplage faible.**  
✅ Vrai  

---

## 3. Appariement  
**Associez les couches du modèle MVC à leur responsabilité principale :**  
- Modèle → Gestion des données  
- Vue → Affichage des données  
- Contrôleur → Logique de navigation et coordination  

---

## 4. Texte à trous  
**Le _couplage faible_ permet d’augmenter la _maintenabilité_ et la _réutilisabilité_ du code.**

---

## 5. QCM  
**Quelle structure ci-dessous représente le modèle MVC ?**  
- [ ] Service → Client → Données  
- [ ] Vue → Modèle → Contrôleur  
- [ ] Modèle → Vue → Contrôleur  
- [x] Contrôleur → Vue → Modèle  

---

## 6. Vrai/Faux  
**Un DAO fortement couplé à une base de données spécifique est un exemple de bonne pratique.**  
❌ Faux  

---

## 7. QCM  
**Quel est le principal rôle d’un DAO (Data Access Object) ?**  
- [ ] Afficher les données  
- [x] Accéder aux bases de données via une interface  
- [ ] Contrôler la logique métier  
- [ ] Organiser les vues graphiques  

---

## 8. Classement  
**Classez les bonnes pratiques de découpage (du plus indépendant au plus dépendant) :**  
1. Interface  
2. Service  
3. DAO  
4. Base de données  

---

## 9. QCM  
**Pourquoi utilise-t-on des interfaces Java dans une couche DAO ?**  
- [ ] Pour accélérer l'exécution  
- [x] Pour réduire le couplage et faciliter les tests  
- [ ] Pour éviter la compilation  
- [ ] Pour le fun  

---

## 10. Vrai/Faux  
**L’utilisation d’interfaces permet d’implémenter différentes versions d’un DAO sans modifier le reste du code.**  
✅ Vrai  

---

## 11. QCM  
**Le modèle MVC est une architecture :**  
- [ ] Monolithique  
- [x] Multi-couches  
- [ ] Couplée  
- [ ] Obsolète  

---

## 12. Glisser-déposer  
**Faites correspondre chaque type de couplage à sa définition :**  
- Couplage fort → Modules étroitement liés  
- Couplage faible → Modules autonomes et interchangeables  

---

## 13. Vrai/Faux  
**Le couplage fort facilite l’évolution du code dans le temps.**  
❌ Faux  

---

## 14. QCM  
**Casser une chaîne d’héritage trop profonde peut se faire via :**  
- [x] Le remplacement par une composition  
- [ ] L’extension de toutes les classes  
- [ ] Le recours au code spaghetti  
- [ ] La duplication systématique  

---

## 15. QCM  
**Quelle solution permet de réduire la dépendance entre les composants ?**  
- [ ] Appels directs aux bases de données  
- [x] Utilisation de patrons comme "Strategy" ou "Observer"  
- [ ] Héritage profond  
- [ ] Réplication des classes  

---

## 16. Vrai/Faux  
**L’héritage profond favorise le couplage faible.**  
❌ Faux  

---

## 17. Classement  
**Classez les actions pour réduire le couplage (du plus efficace au moins efficace) :**  
1. Utiliser des interfaces  
2. Appliquer l’injection de dépendances  
3. Centraliser les appels dans un gestionnaire  
4. Coupler fortement toutes les classes  

---

## 18. QCM  
**Quel design pattern aide le plus à casser le couplage entre composants ?**  
- [ ] Singleton  
- [x] Observer  
- [ ] Builder  
- [ ] Facade  

---

## 19. QCM  
**Quel est un indicateur d’un mauvais découpage en couches ?**  
- [x] La vue appelle directement la base de données  
- [ ] Le contrôleur délègue au service  
- [ ] Le modèle contient la logique métier  
- [ ] Les DAO sont testables indépendamment  

---

## 20. Texte libre  
**Citez une technique ou un outil permettant de détecter un couplage fort dans une base de code Java.**  
💬 (Exemples de réponses : SonarQube, dépendances cycliques, diagrammes UML, etc.)

---
