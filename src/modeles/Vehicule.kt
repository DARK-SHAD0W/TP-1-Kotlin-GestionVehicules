package modeles

// Classe de base qui sera heriitée par les autres vehicules :
abstract class Vehicule(val marque: String,val annee: Int,val couleur: String) {
    abstract fun afficherDetails()
    abstract fun klaxonner()
}
