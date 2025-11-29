# Squire Deobfuscation Report

## Overview

This report documents the complete deobfuscation of the Squire launcher, a third-party RuneLite-based game client for RuneScape/OSRS.

## Obfuscation Techniques Used

### 1. String Encryption
Three encryption algorithms used, with **unique 5-character keys per string**:

| Method Pattern | Algorithm | Key Derivation |
|----------------|-----------|----------------|
| `lIlIl`, `lllIlI`, `llllIII` | DES (ECB) | MD5(key)[:8] |
| `lIllI`, `lIIlIlI`, `lllIllI` | Blowfish (ECB) | MD5(key) full |
| `lIlII`, `lIIlIII`, `lllIlll` | XOR | Key chars cycling |

**Important**: The suspected keys ("squire", "launcher", "auth", "1up", "2.7.1") are NOT used. Each encrypted string has its own unique random key.

### 2. Control Flow Obfuscation
- `"".length()` = 0
- `" ".length()` = 1
- `"  ".length()` = 2
- Dead code blocks with always-false conditions
- Complex XOR expressions that evaluate to constants

### 3. Name Obfuscation
- Single-letter class names (a-z, A-Z)
- Obfuscated method names using `l` and `I` characters
- Obfuscated field names using similar patterns

---

## Class Mappings

| Original | Deobfuscated | Purpose |
|----------|--------------|---------|
| `c.r.m.a` | `squire.auth.SquireAuthHandler` | Main OAuth/authentication handler |
| `c.r.m.L` | `squire.ui.LoginFrame` | Main launcher window |
| `c.r.m.c` | `squire.ui.AuthPanel` | Authentication panel |
| `c.r.m.z` | `squire.ui.ProgressPanel` | Progress/account selection panel |
| `c.r.m.F` | `squire.util.PlatformDetector` | OS detection utility |
| `c.r.m.G` | `squire.util.Platform` | Platform enum |
| `c.r.m.k` | `squire.ui.ThemeColors` | Color constants |
| `c.r.m.m` | `squire.ui.FontManager` | Font loading |
| `c.r.m.p` | `squire.util.ImageLoader` | Image loading utility |
| `c.r.m.q` | `squire.ui.LogoSidePanel` | Logo sidebar |
| `c.r.m.H` | `squire.auth.OAuthHandler` | OAuth flow handler |
| `c.r.m.b` | `squire.auth.AccountData` | Account data structure |
| `c.r.m.A` | `squire.ui.ProgressBarUI` | Custom progress bar UI |
| `c.r.m.l` | `squire.ui.ScrollBarUI` | Custom scrollbar UI |

---

## Decrypted Sensitive Strings

### OAuth Configuration
```
Client ID: 1fddee4e-b100-4f4e-b2b0-097f9088f9d2
Auth Client ID: com_jagex_auth_desktop_launcher
Scope: openid offline
Response Type: id_token code
Nonce: YWI0MTUzZWYtODQ2My00NWRhLTkyZDktNWI3MmIxNDA1Mzgz
State: UcAIZJhXDNKF
```

### API Endpoints
```
OAuth Token:     https://account.jagex.com/oauth2/token
OAuth Auth:      https://account.jagex.com/oauth2/auth
OAuth Redirect:  https://secure.runescape.com/m=weblogin/launcher-redirect
Game Session:    https://auth.runescape.com/game-session/v1/sessions
Game Accounts:   https://auth.runescape.com/game-session/v1/accounts
User Display:    https://api.jagex.com/v1/users/%s/displayName
Login Jagex:     https://account.jagex.com/api/auth/login/jagex
Consent:         https://account.jagex.com/api/auth/consent
Select MFA:      https://account.jagex.com/login/api/auth/login/%s/selectMfa
TOTP Code:       https://account.jagex.com/login/api/auth/login/%s/totpCode
Email Code:      https://account.jagex.com/login/api/auth/login/%s/emailCode
```

### HTTP Headers
```
User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8
Accept-Encoding: gzip, deflate, br
```

### Local Storage
```
Directory: ~/.squire/
Data File: launcher.dat
Format: ::<accountId>:<displayName>:<sessionId>
```

### JSON Payloads
```json
ID Token:     {"idToken":"%s"}
Consent:      {"consentChallenge":"%s"}
Select TOTP:  {"id":"%s", "type":"TOTP"}
TOTP Code:    {"totp":"%s"}
Email Code:   {"code":"%s"}
Login:        {"email":"%s", "password":"%s", "loginChallenge":"%s"}
```

### UI Messages
```
Window Title: Squire
Dialog Title: Squire Jagex Acc Importer
Invalid Auth: Invalid authentication code
Invalid Creds: Invalid user/pass combination
Enter 2FA: Please enter the code from your 2FA authenticator
Enter Email: Please enter the code sent to your e-mail
Enter Password: Please enter your password!
Import Success: Successfully imported %d characters, have a total of %d characters now!
```

---

## File Structure

```
DeobfuscatedProject/
├── client/
│   └── src/
│       └── c/r/m/           # Original decompiled (obfuscated)
├── deobfuscated/
│   └── src/
│       └── squire/
│           ├── auth/        # Authentication classes
│           │   ├── SquireAuthHandler.java
│           │   ├── SquireAuthHandler_CLEAN.java (fully documented)
│           │   ├── AccountData.java
│           │   ├── OAuthHandler.java
│           │   └── ...
│           ├── ui/          # User interface classes
│           │   ├── LoginFrame.java
│           │   ├── LoginFrame_CLEAN.java (fully documented)
│           │   ├── AuthPanel.java
│           │   ├── ProgressPanel.java
│           │   └── ...
│           ├── util/        # Utility classes
│           │   ├── PlatformDetector.java
│           │   ├── Platform.java
│           │   └── ...
│           └── config/      # Configuration classes
│               └── ConfigManager.java
├── scripts/
│   ├── decrypt_strings.py   # String decryption utility
│   └── deobfuscate.py       # Full deobfuscation script
└── tools/
    └── cfr.jar              # CFR decompiler
```

---

## Tools Created

### 1. decrypt_strings.py
Decrypts individual strings:
```python
python3 decrypt_strings.py
# Tests known encrypted strings

python3 decrypt_strings.py <file.java>
# Extracts and decrypts all strings from a file
```

### 2. deobfuscate.py
Full deobfuscation pipeline:
```python
python3 deobfuscate.py
# Processes all c/r/m classes
# Outputs to deobfuscated/src/squire/
```

---

## Authentication Flow Summary

1. **User clicks "Authenticate"** → Opens OAuth authorization URL
2. **OAuth redirect** → Captures authorization code
3. **Exchange code** → POST to `/oauth2/token` → Get access_token + id_token
4. **Create session** → POST to `/game-session/v1/sessions` → Get sessionId
5. **Get accounts** → GET `/game-session/v1/accounts` → List linked characters
6. **Save data** → Write to `~/.squire/launcher.dat`
7. **Launch game** → Use sessionId to authenticate with game servers

### MFA Handling
- Detects `SELECT_MFA` state
- Supports TOTP (authenticator app) and email codes
- Prompts user via JOptionPane dialogs

---

## Summary

- **39 classes** decompiled and deobfuscated
- **140+ encrypted strings** decrypted
- **3 encryption algorithms** identified (DES, Blowfish, XOR)
- **Complete OAuth2 flow** documented
- **All API endpoints** extracted
- **Clean source files** generated

The deobfuscation reveals this is a launcher for accessing RuneScape/OSRS accounts via Jagex's OAuth2 authentication system, with support for multiple accounts and 2FA.
