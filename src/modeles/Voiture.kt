package modeles

// Sous-classe voiture qui herite Vehicule
class Voiture(marque: String,annee: Int,couleur: String,val nombreDePortes: Int) : Vehicule(marque, annee, couleur) {
    // Affichage détails de la voiture avec son nombre de portes
    override fun afficherDetails() {
        println("Voiture : $marque ($annee) | Couleur: $couleur | Portes: $nombreDePortes")
    }

    // Klaxon d'une voiture
    override fun klaxonner() {
        println("klaxon voiture !!")
    }
}
