<h1>String API</h1>
<p>REST API zwracające statystyki o dostarczonym ciągu znaków.</p>
<h3>API zwraca następujące informacje o ciągu znaków:</h3>
<ul>
    <li>Długość ciągu</li>
    <li>Ilość liter</li>
    <li>Ilość dużych liter</li>
    <li>Ilość małych liter</li>
    <li>Ilość dużych liter</li>
    <li>Ilość cyfr</li>
    <li>Ilość znaków specjalnych (np. *,!,% etc.)</li>
</ul>
<hr>
<br>
<h3>Endpoint</h3>
<em>POST /api</em>
<h5>Endpoint przyjmuje obiekt JSON o następujących parametrach</h5>
<table>
    <thead>
    <tr>
        <td>Atrybut</td>
        <td>Opis</td>
        <td>Wymagane</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>content</td>
        <td>Ciąg znakó przekazywany do API w celu wyliczenia statystyk</td>
        <td>TAK</td>
    </tr>
    </tbody>
</table>
<h5>Endpoint przyjmuje obiekt JSON o następujących parametrach</h5>
<table>
    <thead>
    <tr>
    <td>Atrybut</td>
    <td>Opis</td>
    <td>Typ</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>content</td>
        <td>Ciąg znakó przekazywany do API w celu wyliczenia statystyk</td>
        <td>string</td>
    </tr>
    <tr>
        <td>length</td>
        <td>Długość ciągu</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>numberOfLetters</td>
        <td>Ilość liter</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>numberOfCapitalLetters</td>
        <td>Ilość dużych liter</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>numberOfLowerCaseLetters</td>
        <td>Ilość małych liter</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>numberOfDigits</td>
        <td>Ilość cyfr</td>
        <td>Long</td>
    </tr>
    <tr>
        <td>numberOfSpecialCharacters</td>
        <td>Ilość znaków specjalnych (np. *,!,% etc.)</td>
        <td>Long</td>
    </tr>
    </tbody>
</table>
<hr>
<br>
<h3>Przykład wykorzystania API</h3>
<h5>Przykładowe rządanie wysłane do api</h5>
<p>Pod endpoint POST /api wysyłamy następujący obiekt JSON.</p>
<pre>
    {
        "content": "AABBbbaaa123123...."
    }
</pre>
<br>
<p>Jako wynik powinnismy otrzymac następującą odpowiedź</p>
<pre>
    {
        "content": "AABBbbaaa123123....",
        "length": 19,
        "numberOfLetters": 9,
        "numberOfCapitalLetters": 4,
        "numberOfLowerCaseLetters": 5,
        "numberOfDigits": 6,
        "numberOfSpecialCharacters": 4
    }
</pre>
<hr>
<br>
<h5>Przykładowe rządanie wysłane do api</h5>
<p>Do uruchomienia projektu jest wymagana instalacja OpenJDK 15 oraz Maven</p>
W celu uruchomienia projektu należy wejść do folderu zawierającego plik <strong>pom.xml</strong> a następnie w terminalu wpisać komendę <strong>mvn spring-boot:run</strong>
