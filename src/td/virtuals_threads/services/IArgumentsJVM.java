package td.decoupage.virtuals_threads.services;

// Type de thread	Taille stack (par défaut)	Contrôle via -Xss	Mémoire réservée	Croissance dynamique
// Thread classique	~1 Mo (ou plus selon -Xss)	✅ Oui	Allouée dès le début	❌ Non (taille fixe)
// Virtual thread	Quelques Ko (dynamique)	❌ Non	Faible au départ	✅ Oui
public interface IArgumentsJVM {
    long getXssJvmArgs();
}