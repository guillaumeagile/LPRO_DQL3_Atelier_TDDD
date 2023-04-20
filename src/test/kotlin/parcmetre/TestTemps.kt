package parcmetre

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import parcmetre.domain.VraiTemps
import java.time.LocalDateTime

class TestTemps : StringSpec({

    ("le vrai temps doit toujours avancer").config(enabled = true) {

        VraiTemps().now() shouldNotBe VraiTemps().now()
    }
})