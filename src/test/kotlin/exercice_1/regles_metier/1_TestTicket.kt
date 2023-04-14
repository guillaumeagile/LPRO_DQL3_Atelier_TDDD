package exercice_1.regles_metier

import FausseHorloge
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

import java.time.LocalDateTime
import java.time.LocalTime

class `1_TestTicket` : StringSpec({

    "Quand  je prends un ticket, alors il est daté correctement ".config(enabled = true) {
        // Arrange / Given
        val leMaintenant = LocalDateTime.of(
            LocalDate.of(2023,4, 14 ),
            LocalTime.of(11,0,0)
        )
        val horloge = FausseHorloge(leMaintenant)
         //Act / When
        val ticket = Ticket(horloge, 30)
        // Assert / Then
        ticket.heureDebutStationnement shouldBe leMaintenant

    }

    "heure de fin de stationnement" {
        // Arrange / Given
        val leMaintenant = LocalDateTime.of(
            LocalDate.of(2023,4, 1 ),
            LocalTime.of(11,0,0)
        )
        val horloge = FausseHorloge(leMaintenant)
        //Act / When
        val ticket = Ticket(horloge, 30)
        // Assert / Then
        ticket.heureFinStationnement shouldBe LocalDateTime.of(
            LocalDate.of(2023,4, 1 ),
            LocalTime.of(11,30,0)
        )
    }
})