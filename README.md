# SlowAreaTp

Ein Minecraft-Plugin, das Spielern ermöglicht, sich in einer bestimmten Zone langsam zu teleportieren.

## Funktionen

- **Langsames Teleportieren**: Spieler werden in einer vorgegebenen Zone langsam teleportiert, anstatt sofort.
- **Konfigurierbare Zonen**: Zonen können über eine Konfigurationsdatei oder Befehle erstellt und angepasst werden.
- **Einfache Integration**: Das Plugin ist leicht in bestehende Server zu integrieren.

## Installation

1. Lade die neueste Version von `SlowAreaTp.jar` von der [Releases-Seite](https://github.com/Kiritosky/SlowAreaTp/releases) herunter.
2. Kopiere die Datei `SlowAreaTp.jar` in den `plugins`-Ordner deines Minecraft-Servers.
3. Starte den Server neu, damit das Plugin geladen wird.

## Befehle

- `/gebiete`: Öffnet das gebiete Gui.

## Permissions

- `gebiete.open`: Erlaubt es Spielern, das gebiete GUI zu öffnen.

## Konfiguration

Die Konfigurationsdatei (`config.yml`) wird beim ersten Start des Plugins erstellt. Du kannst darin folgende Einstellungen vornehmen:

```yaml
# Beispielkonfiguration
gebiete:
  gebiet1:                              #gebietnummer
    slot: 0                             #Slot im Gui
    item: DIAMOND_SWORD                 #Item, das im GUI angezeigt wird
    name: "&bTest"                      #Name des Items im GUI
    lore:                               #Itembeschreibung
      - "&7Testtest"
      - "&7Klicke zum Teleportieren"
    x: -19                              #X-Koordinate des Teleportziels
    y: 50                               #Y-Koordinate des Teleportziels
    z: 31                               #Z-Koordinate des Teleportziels
    world: world                        #Welt, in der sich das Teleportziel befindet

```