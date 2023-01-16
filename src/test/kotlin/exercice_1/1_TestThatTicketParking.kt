package exercice_1

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDateTime

class `1_Test` : StringSpec({


    "1er car?".config(enabled = true) {
        // Arrange

        //Act

        // Assert
        LocalDateTime.MAX shouldBe LocalDateTime.MIN
    }


})