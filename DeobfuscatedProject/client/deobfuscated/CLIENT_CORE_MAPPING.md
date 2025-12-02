# Squire Client Core Class Mapping

## Overview

This document maps the 39 obfuscated client core files at `/client/src/c/r/m/` to their deobfuscated names and purposes.

**Package**: `c.r.m` -> `squire.launcher`

---

## Class Mapping Summary

| Original | Deobfuscated Name | Category | Purpose |
|----------|------------------|----------|---------|
| `a.java` | `AuthenticationManager` | auth | OAuth/Discord SSO, session management |
| `b.java` | `CookieJarImpl` | util | OkHttp CookieJar implementation |
| `c.java` | `LicenseValidationPanel` | ui | HWID/license key validation UI |
| `d.java` | `LicenseProgressBarUI` | ui | Progress bar UI for license panel |
| `e.java` | `WrappingLabel` | ui | Auto-wrapping JLabel component |
| `f.java` | `ColorListCellRenderer` | ui | Renders colors in combobox |
| `g.java` | `ColorComboBoxEditor` | ui | Editable combobox for colors |
| `h.java` | `ColorChooserAdapter` | ui | ActionListener for color chooser |
| `i.java` | `ColorComboDemo` | ui | Demo/test for color combobox |
| `j.java` | `ColorSelectionListener` | ui | ActionListener for color selection |
| `k.java` | `ThemeColors` | util | Color constants for UI theme |
| `l.java` | `CustomScrollBarUI` | ui | Custom scrollbar styling |
| `m.java` | `FontManager` | util | Loads custom fonts (Roboto) |
| `n.java` | `HardwareAccelerationMode` | config | Enum: OFF, DIRECTDRAW, OPENGL, METAL |
| `o.java` | `HardwareAccelSwitchMap` | config | Switch map for HW accel enum |
| `p.java` | `ImageLoader` | util | Loads images from resources |
| `q.java` | `SidebarInfoPanel` | ui | Version info, Discord/website links |
| `r.java` | `SidebarLabelHoverAdapter` | ui | Mouse hover for sidebar labels |
| `s.java` | `LinkLabelHoverAdapter` | ui | Mouse hover for clickable labels |
| `t.java` | `HwidKeyListener` | ui | Key listener for HWID text field |
| `u.java` | `ProcessLauncher` | process | Launches client with classpath/JVM args |
| `v.java` | `ClientJvmSwitchMap` | config | Switch map for client JVM args |
| `w.java` | `TrustAllCertsManager` | util | X509TrustManager that trusts all |
| `x.java` | `OSTypeSwitchMap` | config | Switch map for OS type enum |
| `y.java` | `DesktopUtil` | util | Opens URLs/files, clipboard ops |
| `z.java` | `ProfileSelectionPanel` | ui | Profile dropdown, launch selection |
| `A.java` | `ProfileProgressBarUI` | ui | Progress bar UI for profile panel |
| `B.java` | `LaunchButtonHoverAdapter` | ui | Mouse hover for launch button |
| `C.java` | `DeleteButtonHoverAdapter` | ui | Mouse hover for delete button |
| `D.java` | `RefreshButtonHoverAdapter` | ui | Mouse hover for refresh button |
| `E.java` | `ProfileWrappingLabel` | ui | Wrapping label for profile panel |
| `F.java` | `OperatingSystem` | util | Detects current OS from system props |
| `G.java` | `OSType` | config | Enum: Windows, MacOS, Linux, Other |
| `H.java` | `JvmConfigManager` | config | Manages JVM args, settings.json |
| `I.java` | `JvmConfigSwitchMap` | config | Switch map for JVM config enum |
| `J.java` | `ClassLoaderLauncher` | process | URLClassLoader setup, starts client |
| `K.java` | `ClientThread` | process | Thread that invokes main() via reflection |
| `L.java` | `LauncherFrame` | ui | Main JFrame, progress bar, status |
| `M.java` | `LauncherFrameWrapper` | ui | Wrapper/utility for launcher frame |

---

## Detailed Analysis by Category

### Authentication (`auth/`)

#### `a.java` -> `AuthenticationManager.java` (63KB)
The largest and most complex class. Handles:
- OAuth2/Discord SSO authentication flow
- Session management and token storage
- Profile creation with username/password
- 2FA (two-factor authentication) handling
- API calls to authentication server
- Cookie management for session persistence

Key methods:
- `a()` - Static initialization
- Login/register flows via HTTP POST
- Token refresh and validation

---

### UI Components (`ui/`)

#### `z.java` -> `ProfileSelectionPanel.java` (27KB)
Main panel shown at launcher start for profile selection:
- Dropdown for saved profiles from `~/.squire/profiles.txt`
- "Launch", "Delete", "Refresh" buttons
- Progress bar for download progress
- Reads/writes profiles to `.squire/` directory
- Calls `Launcher.d(profileName)` to launch

#### `q.java` -> `SidebarInfoPanel.java` (19KB)
Left sidebar showing:
- Squire logo
- Launcher version
- Clickable links to Discord, website
- HWID text field (if not saved)
- Uses `y.e()` for opening URLs

#### `c.java` -> `LicenseValidationPanel.java` (17KB)
License/HWID validation panel:
- Text field for license key input
- "Activate" button with HTTP validation
- Saves valid key to `~/.squire/hwid`
- HTTP client for API validation

#### `L.java` -> `LauncherFrame.java` (11KB)
Main JFrame window:
- Creates the overall window layout
- Manages progress bar updates
- Static methods for status updates: `a(progress, message)`
- Creates sidebar and main panels

---

### Process Management (`process/`)

#### `u.java` -> `ProcessLauncher.java` (11KB)
Launches the actual game client:
- Builds classpath from JAR files
- Gets JVM arguments from Bootstrap
- Uses `ProcessBuilder` to start Java process
- Platform-specific argument handling

#### `J.java` -> `ClassLoaderLauncher.java` (3KB)
Alternative client launch via classloader:
- Creates `URLClassLoader` with client JARs
- Starts `ClientThread` (K.java)
- Injects classloader into UIManager

#### `K.java` -> `ClientThread.java` (5KB)
Thread that runs client main():
- Loads main class via `URLClassLoader`
- Invokes `main(String[])` via reflection
- Error handling with logging

---

### Configuration (`config/`)

#### `H.java` -> `JvmConfigManager.java` (15KB)
Manages JVM arguments and settings:
- Reads/writes `.runelite/settings.json`
- Gets platform-specific JVM args (Windows, Mac, Linux)
- Gets JVM11/JVM17 arguments from Bootstrap
- Environment variable configuration

#### `n.java` -> `HardwareAccelerationMode.java` (9.5KB)
Enum for graphics acceleration:
```java
enum HardwareAccelerationMode {
    OFF,       // No hardware acceleration
    DIRECTDRAW, // Windows DirectDraw
    OPENGL,    // OpenGL (cross-platform)
    METAL      // macOS Metal
}
```
Returns appropriate JVM flags for each mode.

#### `G.java` -> `OSType.java` (3KB)
Operating system enum:
```java
enum OSType { Windows, MacOS, Linux, Other }
```

#### `F.java` -> `OperatingSystem.java` (5KB)
Utility to detect current OS:
- Parses `os.name` system property
- Returns appropriate `OSType` enum value
- Static `R()` method to get current OS

---

### Utilities (`util/`)

#### `y.java` -> `DesktopUtil.java` (9.6KB)
Desktop operations utility:
- `e(url)` - Open URL in browser
- `c(file)` - Open file with default app
- `g(url)` - Open URL via Desktop.browse()
- `f(url)` - Open via `xdg-open` on Linux
- Clipboard operations for fallback

#### `k.java` -> `ThemeColors.java` (1.5KB)
Color constants for dark theme:
```java
Color Z = new Color(r, g, b);   // Primary text
Color aa = new Color(...);      // Background
Color ab = new Color(40, 40, 40); // Dark gray
Color ac = new Color(30, 30, 30); // Darker gray
Color ad = new Color(50, 50, 50); // Medium gray
Color ae = new Color(60, 60, 60); // Light gray
Color af = new Color(...);      // Accent/error
```

#### `m.java` -> `FontManager.java` (5.5KB)
Custom font loading:
- Loads Roboto-Regular.ttf
- Loads Roboto-Bold.ttf
- `j()` - Returns regular font
- `o()` - Returns bold font

#### `p.java` -> `ImageLoader.java` (1KB)
Simple image loading:
- `a(class, path)` - Load BufferedImage from resource

#### `b.java` -> `CookieJarImpl.java` (1.6KB)
OkHttp CookieJar implementation:
- Stores cookies in HashMap
- Used for authentication session persistence

#### `w.java` -> `TrustAllCertsManager.java` (0.5KB)
**INSECURE** - Trusts all SSL certificates:
- Empty `checkClientTrusted()` / `checkServerTrusted()`
- Returns null for `getAcceptedIssuers()`

---

### UI Helper Classes

| File | Name | Purpose |
|------|------|---------|
| `A.java` | `ProfileProgressBarUI` | BasicProgressBarUI for profile panel |
| `B.java` | `LaunchButtonHoverAdapter` | MouseAdapter for launch button |
| `C.java` | `DeleteButtonHoverAdapter` | MouseAdapter for delete button |
| `D.java` | `RefreshButtonHoverAdapter` | MouseAdapter for refresh button |
| `E.java` | `ProfileWrappingLabel` | JLabel subclass for profile panel |
| `d.java` | `LicenseProgressBarUI` | BasicProgressBarUI for license panel |
| `e.java` | `WrappingLabel` | JLabel subclass with text wrapping |
| `f.java` | `ColorListCellRenderer` | ListCellRenderer for color combobox |
| `g.java` | `ColorComboBoxEditor` | ComboBoxEditor for color combobox |
| `h.java` | `ColorChooserAdapter` | ActionListener for JColorChooser |
| `i.java` | `ColorComboDemo` | Test/demo main() for color combobox |
| `j.java` | `ColorSelectionListener` | ActionListener for color selection |
| `l.java` | `CustomScrollBarUI` | BasicScrollBarUI with custom styling |
| `r.java` | `SidebarLabelHoverAdapter` | MouseAdapter for sidebar hover |
| `s.java` | `LinkLabelHoverAdapter` | MouseAdapter for link hover |
| `t.java` | `HwidKeyListener` | KeyListener for HWID text field |

### Switch Map Classes (Generated by Java compiler)

| File | Purpose |
|------|---------|
| `I.java` | Switch map for JVM config enums |
| `M.java` | Switch map for launcher frame |
| `o.java` | Switch map for HW acceleration |
| `v.java` | Switch map for client JVM args |
| `x.java` | Switch map for OS type |

---

## String Obfuscation Pattern

All classes use the same string obfuscation pattern with 3 decryption methods:

1. **XOR with key** - Base64 decode, then XOR each char with key
2. **Blowfish** - Base64 decode, MD5 hash of key, Blowfish decrypt
3. **DES** - Base64 decode, MD5 hash of key (8 bytes), DES decrypt

Example from `z.java`:
```java
private static String lllllll(String encoded, String key) {
    // XOR decryption
    decoded = Base64.decode(encoded);
    for (char c : decoded) {
        result.append((char)(c ^ key[i % key.length]));
        i++;
    }
    return result.toString();
}
```

---

## Deobfuscation Priority

### High Priority (Core functionality)
1. `a.java` -> `AuthenticationManager` - Critical for understanding auth flow
2. `L.java` -> `LauncherFrame` - Main window management
3. `u.java` -> `ProcessLauncher` - Client process launching

### Medium Priority (Important utilities)
4. `H.java` -> `JvmConfigManager` - JVM configuration
5. `y.java` -> `DesktopUtil` - Desktop operations
6. `n.java` -> `HardwareAccelerationMode` - Graphics settings

### Lower Priority (UI components)
7-39. Various UI panels and adapters

---

## Package Structure for Deobfuscated Code

```
squire.launcher/
├── auth/
│   └── AuthenticationManager.java
├── ui/
│   ├── LauncherFrame.java
│   ├── ProfileSelectionPanel.java
│   ├── SidebarInfoPanel.java
│   ├── LicenseValidationPanel.java
│   └── components/
│       ├── ProgressBarUI.java
│       ├── ScrollBarUI.java
│       └── HoverAdapters.java
├── util/
│   ├── DesktopUtil.java
│   ├── ThemeColors.java
│   ├── FontManager.java
│   ├── ImageLoader.java
│   └── CookieJarImpl.java
├── config/
│   ├── JvmConfigManager.java
│   ├── HardwareAccelerationMode.java
│   ├── OSType.java
│   └── OperatingSystem.java
└── process/
    ├── ProcessLauncher.java
    ├── ClassLoaderLauncher.java
    └── ClientThread.java
```

---

## Notes

1. **Security concern**: `w.java` (TrustAllCertsManager) trusts all SSL certificates, which is insecure.

2. **String obfuscation**: All strings are encrypted using a combination of Base64, XOR, Blowfish, and DES encryption. The decryption keys are different for each string.

3. **Code flow obfuscation**: Contains many fake control flow statements like:
   - `"".length();` - no-op
   - `if (null == null) continue;` - always true
   - `if (-" ".length() >= 0) return null;` - never executed

4. **Already deobfuscated**: 41 files in `/deobfuscated/src/squire/` covering auth, ui, util, config packages.

---

## Next Steps

1. Create clean Java files in `/client/deobfuscated/` following the package structure
2. Start with high-priority files (AuthenticationManager, LauncherFrame, ProcessLauncher)
3. Apply string decryption and rename methods/fields
4. Remove obfuscation artifacts (fake control flow)
