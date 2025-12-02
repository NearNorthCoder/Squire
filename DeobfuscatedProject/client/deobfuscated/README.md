# Squire Launcher - Deobfuscated

A deobfuscated version of the Squire OSRS botting client launcher. This project contains the launcher component that handles authentication, profile management, and client launching.

## Project Structure

```
src/main/java/
├── squire/launcher/
│   ├── SquireLauncher.java      # Main entry point
│   ├── auth/
│   │   └── AuthenticationManager.java  # OAuth2/Discord SSO
│   ├── config/
│   │   ├── HardwareAccelerationMode.java  # GPU acceleration modes
│   │   ├── JvmConfigManager.java   # JVM argument management
│   │   ├── OperatingSystem.java    # OS detection
│   │   └── OSType.java             # OS type enum
│   ├── process/
│   │   ├── ClassLoaderLauncher.java  # URLClassLoader-based launch
│   │   ├── ClientThread.java         # Client thread via reflection
│   │   └── ProcessLauncher.java      # Process-based launch
│   ├── ui/
│   │   ├── LauncherFrame.java        # Main JFrame window
│   │   ├── LicenseValidationPanel.java  # HWID/license UI
│   │   ├── ProfileSelectionPanel.java   # Profile selection UI
│   │   ├── SidebarInfoPanel.java        # Sidebar with links
│   │   └── components/
│   │       ├── ButtonHoverAdapter.java
│   │       ├── ClickableLabelAdapter.java
│   │       ├── ColorChooserAdapter.java
│   │       ├── ColorComboBoxEditor.java
│   │       ├── ColorComboDemo.java
│   │       ├── ColorListCellRenderer.java
│   │       ├── ColorSelectionListener.java
│   │       ├── CustomScrollBarUI.java
│   │       ├── HwidKeyListener.java
│   │       ├── ProfileWrappingLabel.java
│   │       ├── ProgressBarUI.java
│   │       └── WrappingLabel.java
│   └── util/
│       ├── CookieJarImpl.java      # OkHttp cookie management
│       ├── DesktopUtil.java        # URL/file opening
│       ├── FontManager.java        # Custom font loading
│       ├── ImageLoader.java        # Image resource loading
│       ├── ThemeColors.java        # UI color constants
│       └── TrustAllCertsManager.java  # Insecure SSL manager
└── net/runelite/launcher/
    ├── Launcher.java               # RuneLite launcher stub
    └── beans/
        └── Bootstrap.java          # Bootstrap config stub
```

## Building

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Compile

```bash
cd /path/to/DeobfuscatedProject/client/deobfuscated
mvn clean compile
```

### Package (Fat JAR)

```bash
mvn clean package
```

This creates `target/squire-launcher-1.0.0-SNAPSHOT.jar` with all dependencies included.

### Run

```bash
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar
```

Or with options:

```bash
# Launch with specific profile
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar --profile "MyProfile"

# Force first-launch mode (license validation)
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar --first-launch
```

## Dependencies

- **OkHttp 4.12.0** - HTTP client for API calls
- **Gson 2.10.1** - JSON parsing
- **SLF4J 2.0.9** - Logging facade
- **Logback 1.4.11** - Logging implementation
- **Guava 32.1.3** - Utility methods
- **JSR-305** - Nullability annotations

## Configuration

The launcher stores its configuration in `~/.squire/`:

- `hwid` - Hardware ID for license validation
- `profiles.txt` - Saved RuneScape account profiles

## Original Class Mapping

| Original | Deobfuscated | Purpose |
|----------|--------------|---------|
| `a.java` | `AuthenticationManager` | OAuth/Discord SSO |
| `b.java` | `CookieJarImpl` | Cookie management |
| `c.java` | `LicenseValidationPanel` | License UI |
| `F.java` | `OperatingSystem` | OS detection |
| `G.java` | `OSType` | OS type enum |
| `H.java` | `JvmConfigManager` | JVM configuration |
| `J.java` | `ClassLoaderLauncher` | ClassLoader launch |
| `K.java` | `ClientThread` | Client thread |
| `L.java` | `LauncherFrame` | Main window |
| `k.java` | `ThemeColors` | Color constants |
| `m.java` | `FontManager` | Font loading |
| `n.java` | `HardwareAccelerationMode` | GPU modes |
| `p.java` | `ImageLoader` | Image loading |
| `q.java` | `SidebarInfoPanel` | Sidebar panel |
| `u.java` | `ProcessLauncher` | Process launch |
| `w.java` | `TrustAllCertsManager` | SSL manager |
| `y.java` | `DesktopUtil` | Desktop operations |
| `z.java` | `ProfileSelectionPanel` | Profile UI |

## Security Notes

**WARNING**: This code includes `TrustAllCertsManager` which disables SSL certificate validation. This is a security risk and should be replaced with proper certificate validation in production.

## License

This is a deobfuscated/reverse-engineered project for educational and research purposes.
