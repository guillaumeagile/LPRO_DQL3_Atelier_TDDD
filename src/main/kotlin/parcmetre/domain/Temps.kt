package parcmetre.domain

import java.time.LocalDateTime

interface Temps {
    fun now(): LocalDateTime
}