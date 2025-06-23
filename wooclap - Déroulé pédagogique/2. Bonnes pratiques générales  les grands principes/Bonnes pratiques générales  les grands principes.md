---
marp: true
---

# 📚 Wooclap – Bonnes pratiques générales (SOLID, Patterns, Singleton)

## 🧱 Section 1 : Principes SOLID

### Q1. (QCU)  
**Quel est le but principal du principe de Responsabilité unique (SRP) ?**  
- A. Réduire le nombre de classes  
- B. Limiter les bugs  
- ✅ C. Séparer les responsabilités pour faciliter la maintenance  
- D. Utiliser un seul langage  

---

### Q2. (Vrai/Faux)  
**Le principe Ouvert/Fermé (OCP) stipule qu'une classe doit être fermée à l’extension mais ouverte à la modification.**  
- ❌ Faux  
- ✅ Vrai (*Correction : ouverte à l’extension, fermée à la modification*)

---

### Q3. (QCU)  
**Quel principe SOLID favorise la création d’interfaces spécifiques plutôt qu’une interface générale trop vaste ?**  
- A. SRP  
- ✅ B. ISP  
- C. LSP  
- D. OCP  

---

### Q4. (QCU)  
**Le principe de substitution de Liskov (LSP) implique que :**  
- ✅ A. Une classe mère peut être remplacée par une classe fille sans impact  
- B. Toute classe doit hériter d’une autre  
- C. Le polymorphisme est interdit  
- D. Les sous-classes doivent avoir moins de méthodes que leurs parents  

---

### Q5. (QCM)  
**Quels principes SOLID sont directement liés à l’architecture orientée interface ?**  
- ✅ ISP  
- ✅ DIP  
- ❌ SRP  
- ❌ LSP  

---

### Q6. (Classement)  
**Classez les lettres du mot SOLID avec leur signification :**  
1. S – Single Responsibility  
2. O – Open/Closed  
3. L – Liskov Substitution  
4. I – Interface Segregation  
5. D – Dependency Inversion  

---

### Q7. (Vrai/Faux)  
**Le principe DIP implique que les modules de haut niveau doivent dépendre des modules de bas niveau.**  
- ❌ Faux  
- ✅ Vrai (*Correction : ils doivent dépendre d’abstractions*)  

---

### Q8. (QCU)  
**Quel principe vise à éviter les dépendances fortes entre modules ?**  
- A. LSP  
- B. SRP  
- ✅ C. DIP  
- D. ISP  

---

## 🧩 Section 2 : Familles de Design Patterns

### Q9. (Glisser-déposer)  
**Associez chaque pattern à sa famille :**  
- Singleton → Créationnel  
- Observateur → Comportemental  
- Adaptateur → Structurel  
- Fabrique → Créationnel  

---

### Q10. (QCU)  
**Quel pattern permet de fournir une interface différente à un objet existant ?**  
- A. Observateur  
- B. Fabrique  
- ✅ C. Adaptateur  
- D. Stratégie  

---

### Q11. (QCU)  
**Dans quelle catégorie trouve-t-on le pattern Stratégie ?**  
- A. Structurel  
- B. Créationnel  
- ✅ C. Comportemental  
- D. Décoratif  

---

### Q12. (Vrai/Faux)  
**Les patterns structurels sont conçus pour simplifier la création d’objets.**  
- ❌ Faux  
- ✅ Vrai (*Correction : ce sont les patterns créationnels qui simplifient la création d’objets*)  

---

### Q13. (QCU)  
**Parmi les choix suivants, lequel est un pattern de création ?**  
- A. Proxy  
- ✅ B. Builder  
- C. State  
- D. Command  

---

### Q14. (QCM)  
**Quels patterns sont comportementaux ?**  
- ✅ Observateur  
- ✅ Stratégie  
- ❌ Singleton  
- ❌ Adaptateur  

---

## 🧊 Section 3 : Le pattern Singleton

### Q15. (QCU)  
**Le pattern Singleton garantit :**  
- ✅ A. Une instance unique d’une classe  
- B. Une meilleure lisibilité du code  
- C. L’utilisation de plusieurs interfaces  
- D. Une modularité accrue  

---

### Q16. (QCU)  
**Quel est le principal risque d’utilisation excessive du Singleton ?**  
- A. Fuite mémoire  
- ✅ B. Couplage fort entre classes  
- C. Surcharge CPU  
- D. Multiplication d’instances  

---

### Q17. (QCM)  
**Quels éléments font généralement partie d’un Singleton ?**  
- ✅ Instance privée statique  
- ✅ Méthode d’accès globale  
- ❌ Constructeur public  
- ❌ Multiples threads concurrents sans verrou  

---

### Q18. (Vrai/Faux)  
**Le Singleton est utile quand plusieurs instances d’une classe sont nécessaires.**  
- ✅ Faux  
- ❌ Vrai  

---

### Q19. (Glisser-déposer)  
**Placez dans l’ordre les étapes pour implémenter un Singleton en Java :**  
1. Déclarer une instance privée statique  
2. Rendre le constructeur privé  
3. Créer une méthode d’accès publique statique  
4. Retourner l’instance unique  

---

### Q20. (QCU)  
**Le Singleton est souvent utilisé pour :**  
- A. Lancer plusieurs connexions réseau  
- ✅ B. Gérer un seul journal de logs  
- C. Créer des instances multiples de DAO  
- D. Réinitialiser une base de données