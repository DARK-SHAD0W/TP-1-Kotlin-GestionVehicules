package modeles

// Sous-classe camion qui herite Vehicule
class Camion(marque: String,annee: Int,couleur: String,val capaciteDeChargement: Double) : Vehicule(marque, annee, couleur) {
    // Affichage détails du camion avec sa capacité de chargement ( tonnes )
    override fun afficherDetails() {
        println("Camion : $marque ($annee) | Couleur: $couleur | Capacité: $capaciteDeChargement t")
    }

    // Klaxon d'un camion
    override fun klaxonner() {
        println("klaxon camion !!!")
    }
}
