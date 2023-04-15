---
published: false                        # Optional. Set to true to publish the workshop (default: false)
type: workshop                          # Required.
title: TDDD, Mob testing in an Hexagon             # Required. Full title of the workshop
short_title: TDDD hands on     # Optional. Short title displayed in the header
description: This is a workshop for...  # Required.
level: intermediate                         # Required. Can be 'beginner', 'intermediate' or 'advanced'
authors:                                # Required. You can add as many authors as needed      
  - Guillaume SAINT ETIENNE
  - Anthnoy CASSAIGNE
contacts:                               # Required. Must match the number of authors
  - guillaume.saintetienne@gmail.com / https://twitter.com/guillaume_agile
  - anthony.cassaigne@gmail.com  / https://twitter.com/acassaigne
duration_minutes: 180                    # Required. Estimated duration in minutes
tags: dotnet, csharp, kotlin          # Required. Tags for filtering and searching
#banner_url: assets/banner.jpg           # Optional. Should be a 1280x640px image
#video_url: https://youtube.com/link     # Optional. Link to a video of the workshop
#audience: students, pro devs, tech lead                      # Optional. Audience of the workshop (students, pro devs, etc.)
#wt_id: <cxa_tracking_id>                # Optional. Set advocacy tracking code for supported links
#oc_id: <marketing_tracking_id>          # Optional. Set marketing tracking code for supported links
#navigation_levels: 2                    # Optional. Number of levels displayed in the side menu (default: 2)
#sections_title:                         # Optional. Override titles for each section to be displayed in the side bar
#   - Section 1 title
#   - Section 2 title
---

# TDDD, Mob testing in an Hexagon 

"Vous vous posez des questions sur les doublures de tests ou ce qui est généralement et abusivement dénommé “mocks”.
Venez dans cet atelier apprendre la terminologie précise et ce qu’ils sont : des bouchons, doublures, dummy, stubs, fake, spy et mock. Vous apprendrez également quand et pourquoi les utiliser.

Vous pourrez, par exemple, comparer en situation réaliste, l’usage d’un fake versus un spy. Sur du code qui ressemble vraiment à celui que vous poussez en production. Et même découvrir les coulisses d’un stub ou spy en développant par vous même des doublures de tests au plus près de vos besoins. Sans passer par l’artillerie lourde! "


---

## Bénéfices attendus
 - Comprendre les tests unitaires et le besoin de doublures dans un début d’architecture hexagonale; clarifier ce que l’on appele doublure de tests.
 - Introduire pas à pas les bases du DDD et de l'architecture Hexagonale
 - Envisager un cas métier réaliste (et utile???)
 - Appréhender quand ces doublures de tests sont légitimes dans leurs usages.
 - Démystifier ce qu’est un spy, un fake, un mock.
 - En produisant (en TDD, toujours) un code emprunt de situations réelles : dialogue avec une base de données, un service web, une imprimante…
 - Apprendre en s’amusant, en collaborant afin de produire, tous ensemble, le code mettant en œuvre ces doublures de tests (Session Mob Programming). 

