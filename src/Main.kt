import modeles.*
// fontion main
fun main() {
    val garage = Garage()

    // Creation des vehicules
    val v1 = Voiture("Mercedes", 2022, "noir", 4)
    val v2 = Voiture("Mercedes", 2020, "blanc", 2)
    val c1 = Camion("Volvo", 2021, "gris", 20.0)
    val m1 = Moto("BMW", 2023, "bleu", false)
    val m2 = Moto("BMW", 2019, "rouge", true)

    // Ajout des vehicules au garage
    garage.ajouterVehicule(v1)
    garage.ajouterVehicule(v2)
    garage.ajouterVehicule(c1)
    garage.ajouterVehicule(m1)
    garage.ajouterVehicule(m2)

    // Affichage du contenu du garage
    println(" \nContenu du garage: \n" )
    garage.afficherGarage()

    // Test des klaxons pour chaque vehicule
    println("\nTest des klaxons : \n")
    listOf(v1, v2, c1, m1, m2).forEach { it.klaxonner() }
}
