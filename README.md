# Atelier TDD / DDD/ Archi Hexagonale / Doublures de Tests

## Pitch 

Vous vous posez des questions sur les doublures de tests ou ce qui est généralement et abusivement dénommé “mocks”.
Venez dans cet atelier apprendre la terminologie précise et ce qu’ils sont : des bouchons, doublures, dummy, stubs, fake, spy et mock. Vous apprendrez également quand et pourquoi les utiliser.
Vous pourrez, par exemple, comparer en situation réaliste, l’usage d’un fake versus un spy. Sur du code qui ressemble vraiment à celui que vous poussez en production. Et même découvrir les coulisses d’un stub ou spy en développant par vous même des doublures de tests au plus près de vos besoins. Sans passer par l’artillerie lourde! 

## Bénéfices attendus

- Comprendre les tests unitaires et le besoin de doublures; clarifier ce que l’on appel doublure de tests.
- Appréhender quand ces doublures de tests sont légitimes dans leurs usages.
- Démystifier ce qu’est un spy, un fake, un mock.
- En produisant (en TDD, toujours) un code emprunt de situations réelles : dialogue avec une base de données, un service web, une librairie générant des uuid… comme exemple couramment rencontrés.
- Apprendre en s’amusant, en collaborant afin de produire, tous ensemble, le code mettant en oeuvre ces doublures de tests (Session Mob Programming). 



## début de conclusion... 

- écouter les tests, si ces derniers sont compliqué ou difficile à écrire, ou sont fragile alors il y a certainement un 
problème de design. Trop de resposabilités ? Trop de dépendances ? Par exemple Ticket et horodatage = trop de responsabilités ce n'est pas à lui de déterminer l'origine du temps, 
c'est fonction impure elle dépend de l'état du système et de plus elle possède une dépendance extern, ici l'horloge du système.

## Slides

https://docs.google.com/presentation/d/1PRbO7dpnD6TJSdLp22inb7wcklTqH7ofq-I_45NfKEw/edit?usp=sharing

à voir aussi:
 -  sur le méfait des Exceptions (slide 42): https://docs.google.com/presentation/d/1v3VvMxCDpodgHMsJ7e4Y4RfNgPXydekCrlvBWzMaZYE/edit?usp=sharing 
 - sur la simplicité: https://docs.google.com/presentation/d/1frHw8sepfemOPxlSMMRPbaa5xYRxT9hx1vI0iMKdmGQ/edit?usp=sharing
 - de la simplicité également: https://docs.google.com/presentation/d/1SfXevZFgLOmP2T2pp4ZfWILMt9QPEyQOZov7P-fvAbg/edit?usp=share_link

## Repository de code supplémentaire:

 - exemple en Kotlin de tests partagés entre le Fake et le composant de prod (non fake): https://github.com/guillaumeagile/atelierDoublures/blob/main/src/test/kotlin/exercice_1/invariantBehaviors/AnyHorlogeShouldBehave.kt
 - même idée mais en C# : https://github.com/guillaumeagile/TestDoublesForBehaviorVerification_Net6


## Ressources externes

 - https://www.infoq.com/presentations/The-Limited-Red-Society/
 - https://understandlegacycode.com/blog/if-you-mock-are-you-even-testing/?
 - https://ted.dev/articles/2023/04/02/i-m-done-with-unit-and-integration-tests/
 - 
 
### utile pour Kotling
 - https://kotlintesting.com/kotest-parameterized/
 - https://kotest.io/docs/framework/testing-styles.html
