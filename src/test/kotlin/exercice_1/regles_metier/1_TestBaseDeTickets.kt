package exercice_1.regles_metier

import FausseHorloge
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldHaveSize
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class `1_TestAvecEnregistrementDeTickets` : StringSpec({

    "le parcMetre doit garder le tickets".config(enabled = true) {
        // Arrange / Given
        val leMaintenant = LocalDateTime.of(
            LocalDate.of(2023,4, 1 ),
            LocalTime.of(11,0,0)
        )
        val horloge = FausseHorloge(leMaintenant)
        val ticket = Ticket(horloge, 30)
        val ticket2 = Ticket(horloge, 2)
        val fausseBase = FausseBase()
        val parcMetre = ParcMetre(fausseBase)
        parcMetre.creer(ticket2)

        //Act / When
        val tousLesTickets = parcMetre.retrouverTous()

        // Assert / Then
        tousLesTickets shouldHaveSize 1
         tousLesTickets shouldContain ticket2
    }

    "le parcMetre doit garder tous les tickets".config(enabled = true) {
        // Arrange / Given
        val leMaintenant = LocalDateTime.of(
            LocalDate.of(2023,4, 1 ),
            LocalTime.of(11,0,0)
        )
        val horloge = FausseHorloge(leMaintenant)
        val ticket = Ticket(horloge, 30)
        val ticket2 = Ticket(horloge, 2)
        val fausseBase = FausseBase()
        val parcMetre = ParcMetre(fausseBase)
        parcMetre.creer(ticket2)
        parcMetre.creer(ticket)

        //Act / When
        val tousLesTickets = parcMetre.retrouverTous()

        // Assert / Then
        tousLesTickets shouldHaveSize 2
        tousLesTickets shouldContain ticket
        tousLesTickets shouldContain ticket2
    }
})