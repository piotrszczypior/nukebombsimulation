# Symulacja wybuchu bomby atomowej 💥
## 1. Dane wejściowe
* wspołrzędne miejsca, na które spadnie bomba (cały świat lub tylko europa, do zdecydowania)
* wybór pomiędzy wybuchem na ziemi lub zrzutem z samolotu
* masa bomby

## 2. Dane wyjściowe
* promień obszaru najmocniejszych zniszczeń
* promień całkowitego obszaru dotkniętego wybuchem
* promień promieniowania jonizującego
* przybliżona ilość ofiar i rannych
* inne efekty, do mocniejszego przemyślenia po wybraniu tego tematu (wielkość kuli ognia lub krateru itp)

## 3. Krótki opis
Będzie to aplikacja webowa napisana przy użyciu Springa z prostym Rest Api.
Korzystać będzie z:
* publicznego Api dostarczającego ilość ludności na zadanym obszarze
* bazy danych (raczej SQLwej) w której będą przechowywane wyniki naszych ostatnich symulacji

Wyniki będą zwracane pod danym End pointem w postaci Jsona lub jeśli starczy nam czasu to powstanie prosty front end z mapą i zaznaczonymi na niej wynikami symulacji.
