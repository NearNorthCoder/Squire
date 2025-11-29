# Squire Local Launcher

Run Squire plugins locally without authentication.

## Overview

This package provides tools to:
1. **Bypass Squire authentication** - Skip login requirements
2. **Load plugins locally** - Use downloaded plugins without server auth
3. **Build a standalone JAR** - Package everything for easy execution

## Requirements

- **Java JDK 11+** (for compilation)
- **Python 3.6+** (for build scripts)
- **Original Squire JAR** (in `dist/` directory)

## Quick Start

### Build Everything

```bash
# Linux/Mac
cd local_launcher
chmod +x build.sh
./build.sh

# Windows
cd local_launcher
build.bat
```

### Run Squire Locally

```bash
cd dist
java -jar squire-local.jar --plugins-dir ../local_launcher/local_plugins
```

## Manual Build Steps

### 1. Prepare Local Plugins

Copy plugin JARs from downloads and rename them:

```bash
python3 prepare_local_plugins.py --source ../downloads --output local_plugins
```

This creates:
- `local_plugins/squire-vorkath.jar`
- `local_plugins/squire-zulrah.jar`
- etc.

### 2. Build Local Launcher

Compile the auth bypass launcher and package with Squire:

```bash
python3 build_local_launcher.py --input ../dist/squire-with-logging.jar --output ../dist/squire-local.jar
```

This:
- Compiles `LocalLauncher.java`
- Extracts the original Squire JAR
- Patches the manifest to use `LocalLauncher`
- Creates `squire-local.jar`

## How It Works

### Authentication Bypass

The `LocalLauncher` class uses Java reflection to:
1. Set `Launcher.aN = true` (the auth flag)
2. Set a fake auth token
3. Skip the login dialog entirely

```java
// From LocalLauncher.java
Field authField = Launcher.class.getDeclaredField("aN");
authField.setAccessible(true);
authField.setBoolean(null, true);
```

### Local Plugin Loading

Plugins are loaded from the `--plugins-dir` directory:
1. Scans for all `.jar` files
2. Adds them to the classpath
3. Client loads them via plugin system

## File Structure

```
local_launcher/
├── build.sh                 # Linux/Mac build script
├── build.bat                # Windows build script
├── build_local_launcher.py  # Main build script
├── prepare_local_plugins.py # Plugin preparation script
├── README.md                # This file
├── src/
│   └── net/runelite/launcher/
│       └── LocalLauncher.java  # Auth bypass launcher
├── build/                   # Build output (generated)
└── local_plugins/           # Prepared plugins (generated)
```

## Available Plugins

After preparation, all 68 Squire plugins will be available:

### Bosses (12)
- Vorkath, Zulrah, Hydra, Corporeal Beast
- Bandos, Saradomin, Zammy
- Duke Sucellus, Vardorvis, Whisperer
- Scurrius, Shamans

### Raids (3)
- Chambers of Xeric, Auto TOA, TOA

### Minigames (11)
- Barrows, Fight Caves, Hallowed Sepulchre
- Gauntlet, Giants Foundry, Mixology
- Moons of Peril, Nightmare Zone, Pest Control
- Sorceress Garden, Wintertodt

### Skilling (10)
- Agility, Blast Furnace, Farmer, Herblore
- Hunter, Miner, Tithe Farm, Woodcutter
- Aerial Fisher, Herbiboar

### More
- See `docs/PLUGIN_MAPPING.md` for full list

## Troubleshooting

### "Launcher class not found"
Make sure you're running from a directory that contains the Squire JAR.

### "Authentication failed"
The auth bypass might have changed field names. Check:
```bash
# List all fields in Launcher class
javap -private net.runelite.launcher.Launcher
```

### "Plugins not loading"
1. Check plugins exist in `local_plugins/`
2. Verify plugins are valid JAR files
3. Check console for classloader errors

## Security Notes

This tool is for **educational and research purposes only**.

- Does not modify game server communication
- Does not bypass any server-side validation
- Plugins still need valid game sessions to function

## License

This analysis tool is provided for security research purposes.
