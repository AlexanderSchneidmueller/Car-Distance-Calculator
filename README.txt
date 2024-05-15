Elektroauto-Reichweitenrechner

Dieses Programm ist ein Elektroauto-Reichweitenrechner, der es dem Benutzer ermöglicht, die verbleibende Reichweite seines Elektrofahrzeugs basierend auf dem Energieverbrauch, der Fahrweise und den aktuellen Wetterbedingungen zu berechnen.

Funktionsweise:

    1. Benutzeroberfläche erstellen: Das Programm erstellt eine grafische Benutzeroberfläche (GUI) mithilfe von Swing-Komponenten, darunter Labels, Textfelder, Dropdown-Listen und einen Berechnungsbutton.
    2. Eingabe von Verbrauch und Kapazität: Der Benutzer gibt den Energieverbrauch seines Elektroautos pro 100 km und die aktuelle Kapazität des Akkus ein.
    3. Auswahl von Fahrweise und Wetterbedingungen: Der Benutzer wählt die gewünschte Fahrweise (Sportlich, Normal, Ökonomisch) und die aktuellen Wetterbedingungen (Sonnig, Regen, Schnee) aus Dropdown-Listen aus.
    4. Berechnung der verbleibenden Reichweite: Nachdem der Benutzer alle erforderlichen Informationen eingegeben hat, berechnet das Programm die verbleibende Reichweite des Elektroautos unter Berücksichtigung der ausgewählten Fahrweise und Wetterbedingungen.
    5. Anzeige des Ergebnisses: Das Programm zeigt die berechnete verbleibende Reichweite in einem Dialogfenster an und bietet dem Benutzer die Möglichkeit, eine neue Berechnung durchzuführen oder das Programm zu beenden.

Funktionsweise der Berechnung:

    • Die Berechnung der verbleibenden Reichweite basiert auf dem Energieverbrauch des Fahrzeugs pro 100 km und der aktuellen Kapazität des Akkus.
    • Die Fahrweise und die Wetterbedingungen beeinflussen den Energieverbrauch des Fahrzeugs. Je nach ausgewählter Fahrweise und Wetterbedingungen wird der Energieverbrauch angepasst, um eine genauere Berechnung der verbleibenden Reichweite zu ermöglichen.
    • Es werden drei Fahrmodi unterstützt: Sportlich, Normal und Ökonomisch. Die Fahrweise "Sportlich" erhöht den Energieverbrauch um 20%, während "Ökonomisch" ihn um 20% verringert. "Normal" hat keinen Einfluss.
    • Es werden drei Arten von Wetterbedingungen berücksichtigt: Sonnig, Regen und Schnee. Regen erhöht den Energieverbrauch um 10%, Schnee um 30%, während Sonnenschein ihn um 10% reduziert.

Fehlerbehandlung:

    • Das Programm überprüft die vom Benutzer eingegebenen Werte auf Gültigkeit und zeigt entsprechende Fehlermeldungen an, wenn ungültige Eingaben erkannt werden.
    • Eine spezielle Fehlermeldung wird angezeigt, wenn der Benutzer ein ungültiges Zahlenformat eingibt, z. B. ein Komma anstelle eines Punktes.

Dieses Programm bietet eine einfache und benutzerfreundliche Möglichkeit für Elektroautobesitzer, die verbleibende Reichweite ihres Fahrzeugs unter Berücksichtigung verschiedener Faktoren zu berechnen.

Programmausführung:
Um die `.jar`-Datei des Programms in Windows auszuführen, folgen Sie diesen Schritten:

    1. Navigieren Sie zum Ordner, der die `.jar`-Datei enthält.
    2. Klicken Sie im Ordnerbereich mit der rechten Maustaste, während Sie die Shift-Taste gedrückt halten.
    3. Wählen Sie die Option "Powershell-Fenster hier öffnen".

Nachdem sich das Powershell-Fenster geöffnet hat, geben Sie den folgenden Befehl ein, um das Programm auszuführen:
    • "java -jar Probeaufgabe_Alexander_Schneidmüller.jar"
Stellen Sie sicher, dass Sie Java auf Ihrem System installiert haben, damit Sie das Programm ausführen können. 
Diese Methode ermöglicht es Ihnen, das Programm auch ohne Verwendung einer integrierten Entwicklungsumgebung (IDE) auszuführen.

Dieses Programm läuft auf Java JDK 22!

Dies ist ein Programm von Alexander Schneidmüller.

