# calculator-java-assignment-SQI-Tarik-Sahinovic
simple calculator written in Java; supports addition, subtraction, multiplication and division

IT Akademija
Smjer: Software Testing and QA
Predmet: Software Quality Introduction
Zadatak: Prvi Assignment
Student: Tarik Šahinović

***************************************************
Računanje traženih metrika:
***************************************************

******LOC******
-U zadatku se traži metrika broja linija koda za kompletan projekat, tj. za sve fajlove zbirno i ona iznosi 235. Calculator.java ima 188 linija koda, Start.java 26
i LICENSE ima 21 liniju koda što daje rezultat od 235 linija koda ukupno. 

******CIKLOMATSKA SLOŽENOST******
-Zadatak traži ciklomatsku složenost za fajlove Calculator.java, te Start.java. 
-Kada je riječ o fajlu Calculator.java on u sebi sadrži nekoliko metoda:
1. Metoda Operations - funkcija Operations - ciklomatska složenost 1,
2. Metoda Operations - funkcija toString - ciklomatska složenost 1,
3. Metoda Run - ciklomatska složenost 1,
4. Metoda evaluateExpression - ciklomatska složenost 12,
5. Metoda Calculate - ciklomatska složenost 12.

-Kada je riječ o fajlu Start.java on ima jednu metodu - main čija ciklomatska složenost iznosi 3. 

******KOGNITIVNA SLOŽENOST******
Kognitivna složenost za fajl Calculator.java iznosi 12, dok za fajl Start.java iznosi 3.

*****************************************************
Pregled i statička analiza
*****************************************************

-Neformalnim pregledom i statičkom analizom koju sam sproveo uz pomoć Sonarlint alata dobili smo sljedeće rezultate:
Calculator.java - linija koda broj 4 - Major Code Smell (Klasa koja se nalazi na ovoj liniji koda ne bi trebala bili instancirana kao "public").

Calculator.java - linija koda broj 18 - Major Code Smell (Metode i nazivi polja ne bi trebali biti isti niti se razlikovati samo po velikim slovima. U ovom slučaju se krije i jedan Minor Code Smell (Nazivi metoda trebaju se pridržavati konvencije za nazivlje.)

Calculator.java - linija koda broj 1 - Minor Code Smell (Podrazumijevani nepomenuti paket ne bi trebao biti korišten. Premjestite ovu datoteku u nazvani paket.)

Calculator.java - linija koda broj 24 - Minor Code Smell(Nazivi metoda trebaju se pridržavati konvencije za nazivlje. Preimenujte naziv ovog metoda da odgovara regularnom izrazu.)

Calculator.java - linija koda broj 70 - Minor Code Smell(Lokalne varijable ne bi trebale biti deklarisane i odmah vraćene. Odmah vratite ovaj izraz umjesto što ga dodjeljujete privremenoj varijabli "textResult").

Calculator.java - linija koda broj 74 - Minor Code Smell(Nazivi metoda trebaju se pridržavati konvencije za nazivlje. Preimenujte naziv ovog metoda da odgovara regularnom izrazu.)

Calculator.java - linija koda broj 183 - Minor Code Smell(Naredbe za preskakanje ne bi trebale biti suvišne. Uklonite ovaj suvišni skok.)

Start.java - linija koda broj 8 - Major Code Smell (Standardni izlazi se ne bi trebali direktno koristiti za logiranje bilo čega. Zamijenite ovu upotrebu System.out ili System.err loggerom.)

Start.java - linija koda broj 19 - Major Code Smell (Standardni izlazi se ne bi trebali direktno koristiti za logiranje bilo čega. Zamijenite ovu upotrebu System.out ili System.err loggerom.)

Start.java - linija koda broj 1 - Minor Code Smell (Podrazumijevani nepomenuti paket ne bi trebao biti korišten. Premjestite ovu datoteku u nazvani paket.)

Start.java - linija koda broj 6 - Minor Code Smell (Nazivi lokalnih varijabli i parametara metoda trebaju se pridržavati konvencije za nazivlje. Preimenujte ovu lokalnu varijablu da odgovara regularnom izrazu.)

