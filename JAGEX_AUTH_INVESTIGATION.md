# Jagex Authentication Investigation - Phase 2

## Problem Statement
The game client still crashes at `client.doLoggedOutCycle(Client.java:363)` even though:
- JWT is correctly formatted (1357 chars, starts with `eyJ`)
- JWT is not expired (crash 2 min after token issue, token valid for ~1 hour)
- All 5 JX_* environment variables are being set correctly

## Previous Session Findings

### Root Architecture
Squire is a deobfuscated RuneLite-based OSRS client with this flow:
```
SquireLauncher.java → LocalClientLauncher.java → RuneLite Client → Injected Game Client
```

### What We Fixed (Commit def67643)
1. **SquireLauncher.java** - Now calls `lookupJagexAccount()` and passes `JagexAccountData` to launcher
2. **CEFAccountImporter.java** - Now saves 7-part format with JWT:
   ```
   ::sessionId:accessToken:refreshToken:accountId:displayName
   ```
3. **LocalClientLauncher.java** - Sets JX_* env vars when launching subprocess

### Environment Variables Being Set
```java
env.put("JX_SESSION_ID", sessionId);       // 22-char game session
env.put("JX_CHARACTER_ID", accountId);     // Account ID
env.put("JX_DISPLAY_NAME", displayName);   // Display name
env.put("JX_ACCESS_TOKEN", accessToken);   // JWT (1357 chars, starts with eyJ)
env.put("JX_REFRESH_TOKEN", refreshToken); // Refresh token
```

## Hypothesis: Why JWT Is Being Rejected

The JWT passes format validation but may be failing for other reasons:

1. **Token audience/issuer mismatch** - JWT may need specific claims the official launcher sets
2. **Missing HTTP auth headers** - Client may make API calls needing Bearer token
3. **Hooks callback not implemented** - `Hooks.java:launchAccount()` is empty
4. **RSClient field injection timing** - Jagex fields may need to be set AFTER client init
5. **Token refresh mechanism** - May need periodic refresh or initial validation call
6. **Missing client fingerprint** - May need HWID or other device binding

## Files To Investigate

### Primary Files (Modified)
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/SquireLauncher.java`
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/CEFAccountImporter.java`
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/local/LocalClientLauncher.java`

### Decompiled Client Files (Critical)
These are in `/tmp/` from previous session - **MUST RE-DECOMPILE**:
```bash
# Decompile the RuneLite client JAR
java -jar cfr.jar DeobfuscatedProject/repository2/runelite-client-1.1.12-SNAPSHOT.jar --outputdir /tmp/client_decompiled

# Decompile runescape-api (has RSClient interface)
java -jar cfr.jar DeobfuscatedProject/repository2/runescape-api-1.1.12-SNAPSHOT.jar --outputdir /tmp/runescape_api_decompiled
```

Key decompiled files:
- `/tmp/client_decompiled/net/runelite/client/callback/Hooks.java` - Has empty `launchAccount()` callback
- `/tmp/runescape_api_decompiled/net/runelite/rs/api/RSClient.java` - Shows Jagex session fields with @Import annotations

### Original Squire Launcher (Untouched Reference)
Compare our changes against:
- `DeobfuscatedProject/client/deobfuscated/launcher/auth/AuthenticationManager.java`
- `DeobfuscatedProject/client/deobfuscated/launcher/process/ProcessLauncher.java`
- `DeobfuscatedProject/client/deobfuscated/launcher/process/ClassLoaderLauncher.java`

### Account Import/Auth Files
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/BrowserAccountImporter.java`
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/JagexCredentialDecryptor.java`
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/AuthenticationManager.java`
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/debug/JagexAuthLogger.java`

### Injected Game Client
The actual OSRS client code is in:
```
DeobfuscatedProject/repository2/injected-client.oprs  (ZIP file containing client.class)
```
Extract and search for JX_* string references:
```bash
unzip -d /tmp/injected injected-client.oprs
strings /tmp/injected/client.class | grep -i "JX_\|jwt\|token"
```

Previous session found these strings in client.class:
- JX_ACCESS_TOKEN
- JX_SESSION_ID
- JX_CHARACTER_ID
- JX_DISPLAY_NAME
- JX_REFRESH_TOKEN

## Investigation Steps

### Step 1: Analyze JWT Structure
Decode the JWT payload and check:
```bash
echo "JWT_TOKEN_HERE" | cut -d. -f2 | base64 -d 2>/dev/null
```
Look for:
- `aud` (audience) - What service expects this token?
- `iss` (issuer) - Should be Jagex auth server
- `sub` (subject) - User ID
- `scope` - What permissions?
- Custom claims for OSRS

### Step 2: Check RSClient Field Injection
In `/tmp/runescape_api_decompiled/net/runelite/rs/api/RSClient.java`:
```java
@Import(value="jagexSessionId")
public void setJagexSessionId(String var1);

@Import(value="jagexDisplayName")
public void setJagexDisplayName(String var1);

@Import(value="jagexCharacterId")
public void setCharacterId(String var1);
```

These are SETTER methods. The game client reads env vars, but does RuneLite also need to call these setters?

### Step 3: Trace doLoggedOutCycle Crash
The crash happens at `client.doLoggedOutCycle(Client.java:363)`. This is in the obfuscated game client.
- Why line 363? What check fails there?
- The "JX_ACCESS_TOKEN does not look like a JWT" message is a validation, but we pass it
- There may be a SECOND validation happening server-side

### Step 4: Check Hooks.launchAccount()
In `/tmp/client_decompiled/net/runelite/client/callback/Hooks.java`:
```java
public static void launchAccount() {
    // EMPTY - This is suspicious!
}
```
This may be a callback the game client expects to call. Should it:
- Trigger token refresh?
- Make an API call?
- Set RSClient fields?

### Step 5: Compare With Official RuneLite
The official RuneLite launcher handles Jagex accounts. Check:
- https://github.com/runelite/launcher - How does it pass credentials?
- https://github.com/runelite/runelite - How does client receive them?

### Step 6: Network Analysis
The client may be making HTTP calls that need auth headers:
- Check if there's an HTTP client that needs Bearer token
- Look for API endpoints in decompiled code
- Search for "Authorization" or "Bearer" strings

## Key Questions to Answer

1. **Is the JWT being validated locally or remotely?**
   - If local: What validation is failing at line 363?
   - If remote: What API endpoint is being called?

2. **Are we missing additional data the game client needs?**
   - Device fingerprint / HWID?
   - Session cookie?
   - Nonce or timestamp?

3. **Is there timing issue?**
   - Does token need to be set AFTER client initialization?
   - Does `launchAccount()` callback need to do something?

4. **What does the original Squire launcher do differently?**
   - Compare `launcher/process/ProcessLauncher.java` with our `local/LocalClientLauncher.java`

## Compile & Test Commands

```bash
cd /home/user/Squire/DeobfuscatedProject/client/deobfuscated

# Build
mvn clean package -DskipTests

# Delete old launcher.dat to force fresh import
rm ~/.squire/launcher.dat

# Import accounts
java -jar target/squire-launcher.jar --import-accounts

# Launch with account
java -jar target/squire-launcher.jar --account "YourDisplayName"
```

## Log Output to Check
When running, verify these log lines appear:
```
JAGEX ACCOUNT LOGIN: YourDisplayName
Found account data in launcher.dat:
  displayName:   YourDisplayName
  accountId:     12345
  sessionId:     22 chars
  accessToken:   1357 chars   <-- MUST be ~1300+ chars, starts with eyJ
  refreshToken:  XXX chars
SETTING JAGEX ENVIRONMENT VARIABLES
JX_SESSION_ID:    xxxx... (length: 22 chars)
JX_ACCESS_TOKEN:  eyJ... (length: 1357 chars)  <-- CRITICAL
```

## Branch Info
```
Repository: NearNorthCoder/Squire
Branch: main (fixes merged)
Latest commits:
- ac06c949 Merge PR #55 (fixes)
- d3f54cd9 Add instructions for testing
- def67643 Fix Jagex account login crashes by passing JX_* environment variables
```

## Summary
The JWT format is correct and not expired, but authentication still fails. The next investigation should focus on:
1. What exactly fails at `doLoggedOutCycle:363`
2. Whether `Hooks.launchAccount()` needs implementation
3. Whether there's a server-side validation/API call we're missing
4. Comparing with original Squire and official RuneLite flows
