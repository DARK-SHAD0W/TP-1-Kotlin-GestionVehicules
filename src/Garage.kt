import modeles.*

// Classe Garage qui gere une colection de vehicules
class Garage {
    private val vehicules = mutableListOf<Vehicule>()

    // Ajoute un vehicule a la liste du garage
    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
    }

    // Affiche les détails de tous les vehicules du garage
    fun afficherGarage() {
        for (vehicule in vehicules) {
            val type = when (vehicule) {
                is Voiture -> "Voiture"
                is Camion  -> "Camion"
                is Moto    -> "Moto"
                else       -> "Inconnu"
            }
            println("--- $type ---")
            vehicule.afficherDetails()
        }
    }
}
