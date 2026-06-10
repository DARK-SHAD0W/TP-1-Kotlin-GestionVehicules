package modeles

// Sous-classe moto qui herite Vehicule
class Moto(marque: String,annee: Int,couleur: String,val aSidecar: Boolean) : Vehicule(marque, annee, couleur) {
    // Affichage détails de la moto avec la présence d'un sidecar
    override fun afficherDetails() {
        println("Moto : $marque ($annee) | Couleur: $couleur | Sidecar: $aSidecar")
    }

    // Klaxon d'une moto
    override fun klaxonner() {
        println("klaxon moto !")
    }
}
