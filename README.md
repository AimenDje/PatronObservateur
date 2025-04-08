# ✈️ Aéroport - Gestion des Écrans d’Affichage
Ce projet simule un système de gestion d’écrans d’affichage pour un aéroport, basé sur le patron de conception Observateur. 
L’objectif est d’implémenter une version simplifiée des écrans informatifs affichant les départs de vols selon différents niveaux : l’aéroport complet, les terminaux et les portes d’embarquement.

# 🧠 Concepts principaux

Patron de conception Observateur : utilisé pour notifier automatiquement les écrans d’un changement dans la liste des vols.

Encapsulation & abstraction : à travers les classes comme Flight, Gate, Terminal, et Airport.

Programmation orientée objet en Java : relations d’héritage, polymorphisme, encapsulation, surcharge de méthodes.

<h2>📁 Structure du projet</h2>

<pre style="background-color: #f6f8fa; padding: 16px; border-radius: 8px; font-family: 'Courier New', monospace;">
/src
│
├── observer/
│   ├── Observer.java         # Classe abstraite pour les observateurs
│   └── Subject.java          # Classe abstraite pour les sujets observés
│
├── screens/
│   ├── AirportScreen.java    # Écran global affichant tous les vols
│   ├── TerminalScreen.java   # Écran pour chaque terminal
│   └── GateScreen.java       # Écran pour chaque porte
│
├── airport/
│   ├── Flight.java           # Représente un vol
│   ├── Gate.java             # Représente une porte d’embarquement
│   ├── Terminal.java         # Représente un terminal
│   └── Airport.java          # Représente l’aéroport au complet
│
└── ConsoleApp.java           # Application principale (simulation console)
</pre>

# ✨ Fonctionnalités

➕ Ajout de vols avec compagnie, numéro, destination, heure, porte, et statut.

✈️ Retard d’un vol (modifie le statut en "DELAYED").

🔁 Changement de porte d’un vol (mise à jour dynamique de l'affichage).

📣 Annonce de l’embarquement ("BOARDING").

❌ Annulation de vol.

🗑️ Suppression de vol.

Chaque opération notifie automatiquement tous les écrans affectés grâce au patron Observateur.

# 📷 Exemple d’affichage console

AIRPORT (1)
AC168 Amsterdam 1528 C-2 ON TIME
WS123 Rome 1345 B-1 BOARDING

TERMINAL B (2)
WS123 Rome 1345 B-1 BOARDING

GATE C-2
AC168 Amsterdam 1528 C-2 ON TIME

## 📌 Informations supplémentaires 

- Chaque classe observatrice implémente sa propre logique dans la méthode update().

- La méthode toString() de Flight suit le format : AC168 Amsterdam 1528 C-2 ON TIME.

- La classe ConsoleApp est le centre de coordination du système.

- Les terminaux disponibles sont A, B et C — avec respectivement 3, 7, et 5 portes.

- Les statuts de vol possibles : "ON TIME", "BOARDING", "DELAYED", "CANCELLED".

# 🛠️ Instructions de compilation et d'exécution
Compiler :
- javac -d bin src/**/*.java

Exécuter :
- java -cp bin ConsoleApp

