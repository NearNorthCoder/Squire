# Squire Jagex Account Integration

## Overview

This document explains how Squire handles Jagex accounts for OSRS authentication. The flow involves:
1. Account import via OAuth2
2. Account storage in `launcher.dat`
3. Account selection in the launcher UI
4. Account info passed to client via `--account` argument

## Account Storage

### File Location
```
~/.squire/launcher.dat
```

### Format
```
::sessionId:accountId:displayName
```

Example:
```
::abc123-session-id:jagex-account-id-123:CoolPlayer99
::def456-session-id:jagex-account-id-456:AnotherPlayer
```

## Account Import Flow

### 1. OAuth2 Authentication

**File:** `net/runelite/launcher/AccountImporter.java`

The import process uses a CEF (Chromium Embedded Framework) browser window:

```java
String url = "https://account.jagex.com/oauth2/auth?" +
    "auth_method=&login_type=&flow=launcher" +
    "&response_type=code" +
    "&client_id=com_jagex_auth_desktop_launcher" +
    "&redirect_uri=https://secure.runescape.com/m=weblogin/launcher-redirect" +
    "&prompt=login" +
    "&scope=openid+offline+gamesso.token.create+user.profile.read+user.entitlement.read+user.game.read+user.sku.read" +
    "&state=XDsvlMYKfQsZ";
```

### 2. Token Exchange

After user authenticates in browser:

```java
// Exchange authorization code for tokens
FormBody formBody = new FormBody.Builder()
    .add("grant_type", "authorization_code")
    .add("client_id", "com_jagex_auth_desktop_launcher")
    .add("code", code)
    .add("redirect_uri", "https://secure.runescape.com/m=weblogin/launcher-redirect")
    .build();

Request request = new Request.Builder()
    .url("https://account.jagex.com/oauth2/token")
    .post(formBody)
    .build();
```

### 3. Get Real ID Token (Consent Flow)

```java
// Build consent URL
String url = "https://account.jagex.com/oauth2/auth?" +
    "id_token_hint=" + hint +
    "&nonce=" + NONCE +
    "&prompt=consent" +
    "&redirect_uri=http://localhost" +
    "&response_type=id_token code" +
    "&state=" + STATE +
    "&client_id=1fddee4e-b100-4f4e-b2b0-097f9088f9d2" +
    "&scope=openid offline";
```

### 4. Create Game Session

```java
// POST to https://auth.runescape.com/game-session/v1/sessions
String payload = "{\"idToken\":\"" + realIdToken + "\"}";
Request request = new Request.Builder()
    .url("https://auth.runescape.com/game-session/v1/sessions")
    .post(RequestBody.create(MediaType.parse("application/json"), payload))
    .build();

// Response contains: { "sessionId": "..." }
```

### 5. Get Linked Accounts

```java
// GET https://auth.runescape.com/game-session/v1/accounts
Request request = new Request.Builder()
    .url("https://auth.runescape.com/game-session/v1/accounts")
    .header("Authorization", "Bearer " + sessionId)
    .build();

// Response: [{ "accountId": "...", "displayName": "..." }, ...]
```

### 6. Save to launcher.dat

```java
fileWriter.write(String.format("::%s:%s:%s\n", sessionId, accountId, displayName));
```

## Account Selection UI

**File:** `net/runelite/launcher/MessagePanel.java`

When `--jagexlauncher` is passed to the launcher:

1. MessagePanel shows account selection UI
2. Reads display names from `launcher.dat`
3. User selects account from dropdown
4. On "Launch" button click:
   ```java
   Launcher.setJagexAccount(selectedDisplayName);
   ```

## Launcher Integration

**File:** `net/runelite/launcher/Launcher.java`

### Jagex Launcher Mode Detection

```java
parser.accepts("jagexlauncher", "Use this to select jagex launcher account");
// ...
boolean jagexLauncherMode = options.has("jagexlauncher");
// ...
if (jagexLauncherMode) {
    SquireSplashScreen.init("Selecting account");
    while (jagexAccount == null) {
        Thread.sleep(1000L);  // Wait for user selection
    }
}
```

### Passing Account to Client

```java
Collection<String> clientArgs = Launcher.getClientArgs(options);
if (jagexAccount != null) {
    clientArgs.add("--account=" + jagexAccount);
}
```

## Client-Side Account Handling

### RuneLite Main Class

**File:** `net/runelite/client/RuneLite.java` (in runelite-client JAR)

```java
// Parse --account argument
ArgumentAcceptingOptionSpec accInfo = parser.accepts("account")
    .withRequiredArg()
    .ofType(String.class);

if (options.has("account")) {
    String string = options.valueOf(accInfo);
    if (!string.contains(":")) {
        // Jagex account identifier (display name)
        RuneLiteAPI.setJagexAccountIdentifier(string);
    } else {
        // Legacy format: username:password[:auth]
        String[] details = string.split(":");
        GameAccount gameAccount = new GameAccount(details[0], details[1]);
        if (details.length >= 3) {
            gameAccount.setAuth(details[2]);
        }
        Game.setGameAccount(gameAccount);
    }
}
```

### RuneLiteAPI Storage

**File:** `net/runelite/http/api/RuneLiteAPI.java` (in http-api JAR)

```java
private static String jagexAccountIdentifier;

public static String getJagexAccountIdentifier() {
    return jagexAccountIdentifier;
}

public static void setJagexAccountIdentifier(String jagexAccountIdentifier) {
    RuneLiteAPI.jagexAccountIdentifier = jagexAccountIdentifier;
}
```

### Game API Storage

**File:** `net/unethicalite/api/game/Game.java`

```java
private static String jagexAccount = null;

public static String getJagexAccount() {
    return jagexAccount;
}

public static void setJagexAccount(String jagexAccount) {
    Game.jagexAccount = jagexAccount;
}
```

## API Endpoints Summary

| Endpoint | Purpose |
|----------|---------|
| `https://account.jagex.com/oauth2/auth` | OAuth2 authorization |
| `https://account.jagex.com/oauth2/token` | Token exchange |
| `https://account.jagex.com/api/auth/consent` | Consent challenge |
| `https://account.jagex.com/api/auth/login/jagex` | Email/password login |
| `https://account.jagex.com/login/api/auth/login/{flowId}/selectMfa` | Select MFA method |
| `https://account.jagex.com/login/api/auth/login/{flowId}/totpCode` | Submit TOTP code |
| `https://account.jagex.com/login/api/auth/login/{flowId}/emailCode` | Submit email code |
| `https://auth.runescape.com/game-session/v1/sessions` | Create game session |
| `https://auth.runescape.com/game-session/v1/accounts` | Get linked accounts |
| `https://api.jagex.com/v1/users/{userId}/displayName` | Get display name |

## OAuth2 Client IDs

| Client ID | Usage |
|-----------|-------|
| `com_jagex_auth_desktop_launcher` | Initial launcher OAuth |
| `1fddee4e-b100-4f4e-b2b0-097f9088f9d2` | Consent/ID token flow |

## Data Flow Diagram

```
┌─────────────────┐      ┌─────────────────┐      ┌─────────────────┐
│  AccountImporter│      │    Launcher     │      │  RuneLite Client│
└────────┬────────┘      └────────┬────────┘      └────────┬────────┘
         │                        │                        │
         │ 1. OAuth2 login        │                        │
         │ ─────────────────────► │                        │
         │                        │                        │
         │ 2. Get id_token        │                        │
         │ ◄───────────────────── │                        │
         │                        │                        │
         │ 3. Create session      │                        │
         │ ─────────────────────► │                        │
         │                        │                        │
         │ 4. Get accounts        │                        │
         │ ─────────────────────► │                        │
         │                        │                        │
         │ 5. Save launcher.dat   │                        │
         │ ─────────────────────► │                        │
         │                        │                        │
         │                        │ 6. User selects account│
         │                        │ ◄──────────────────────│
         │                        │                        │
         │                        │ 7. --account=DisplayName
         │                        │ ────────────────────────►
         │                        │                        │
         │                        │                        │ 8. Store in
         │                        │                        │    RuneLiteAPI
```

## Files Reference

| File | Location | Purpose |
|------|----------|---------|
| `AccountImporter.java` | `net/runelite/launcher/` | OAuth2 import flow |
| `MessagePanel.java` | `net/runelite/launcher/` | Account selection UI |
| `Launcher.java` | `net/runelite/launcher/` | Main launcher, passes `--account` |
| `launcher.dat` | `~/.squire/` | Account storage |
| `RuneLiteAPI.java` | `net/runelite/http/api/` | Client-side account storage |
| `Game.java` | `net/unethicalite/api/game/` | Unethicalite account API |
