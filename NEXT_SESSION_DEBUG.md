# Debug Session: Client Crash at doLoggedOutCycle

## Project Context

**Squire** is a deobfuscated RuneLite-based OSRS client. We're fixing crashes when logging in with Jagex accounts.

**Repository:** https://github.com/NearNorthCoder/Squire
**Branch:** `claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn`

## What Was Already Done

1. **Decompiled Squire's working code** from `squire-with-logging.jar`
2. **Found that Squire uses 5-part launcher.dat format:** `::sessionId:accountId:displayName`
3. **Fixed our code to match:** CEFAccountImporter and SquireLauncher now use 5-part format
4. **Removed JX_* environment variables** from launcher (Squire doesn't set them)
5. **Launch now just passes** `--account=displayName` to client

## The Current Problem

The client STILL crashes when clicking to log in:

```
Crash location: client.doLoggedOutCycle(Client.java:363)
The game client calls System.exit(0) when you click to log in
```

**Key error from logs:**
```
JX_ACCESS_TOKEN does not look like a JWT!
```

## The Mystery

We REMOVED the JX_* environment variable setting from our launcher, but:
1. The client (`squire-with-logging.jar`) still checks for JX_ACCESS_TOKEN
2. It expects a JWT (starts with "eyJ")
3. When it's missing or wrong format, it crashes

## Files to Investigate

### In Repository
- `DeobfuscatedProject/client/deobfuscated/lib/squire-with-logging.jar` - The client JAR
- `~/.squire/repository2/runelite-client-1.1.12-SNAPSHOT.jar` - Runtime client
- `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/debug/SquireClientWrapper.java` - Our wrapper that logs JX_* vars

### Decompiled Files (from previous session)
- `/tmp/squire_decompiled/net/runelite/launcher/Launcher.java`
- `/tmp/squire_decompiled/net/runelite/launcher/AccountImporter.java`
- `/tmp/squire_decompiled/net/runelite/launcher/MessagePanel.java`

## Key Questions to Answer

1. **Where does the client read JX_ACCESS_TOKEN?**
   - Decompile `runelite-client-1.1.12-SNAPSHOT.jar`
   - Search for `JX_ACCESS_TOKEN`, `System.getenv`, `doLoggedOutCycle`

2. **What does `client.doLoggedOutCycle()` do at line 363?**
   - Find the Client class in the decompiled JAR
   - Look for what triggers `System.exit(0)`

3. **How does the REAL Squire launcher set up auth?**
   - The decompiled Launcher.java shows `--account=displayName` is passed
   - But WHERE does the client get the sessionId from launcher.dat?

4. **Is there client-side code that reads launcher.dat?**
   - Search the client JAR for "launcher.dat" or ".squire"

## Decompile Commands

```bash
# Decompile the client JAR
java -jar DeobfuscatedProject/tools/cfr.jar ~/.squire/repository2/runelite-client-1.1.12-SNAPSHOT.jar --outputdir /tmp/client_decompiled

# Or specific classes
java -jar DeobfuscatedProject/tools/cfr.jar ~/.squire/repository2/runelite-client-1.1.12-SNAPSHOT.jar --outputdir /tmp/client_decompiled net.runelite.client.RuneLite

# Search for JX_ references
grep -r "JX_" /tmp/client_decompiled --include="*.java"

# Search for doLoggedOutCycle
grep -r "doLoggedOutCycle\|System\.exit" /tmp/client_decompiled --include="*.java"

# Search for launcher.dat reading
grep -r "launcher\.dat\|\.squire" /tmp/client_decompiled --include="*.java"
```

## Hypothesis

The client has TWO authentication paths:

1. **Real Jagex Launcher path:** JX_* env vars are set → client uses them directly
2. **Squire launcher path:** `--account=displayName` → client reads launcher.dat

Our code removed the env vars but the client might still be checking them and failing. We need to find:
- Where the client checks for JX_* vars
- What the fallback is when they're missing
- How to make the `--account` path work

## launcher.dat Format (Current)

```
::sessionId:accountId:displayName
```

Where:
- `sessionId` = 22-character game session from auth.runescape.com
- `accountId` = Jagex account ID
- `displayName` = Character display name

## Task

1. Decompile the client JAR
2. Find where `doLoggedOutCycle` is and what causes `System.exit(0)`
3. Find where JX_ACCESS_TOKEN is checked
4. Understand how Squire's client handles `--account` flag
5. Fix the authentication flow so it doesn't crash

## Important Context

- The OAuth import (CEFAccountImporter) WORKS - accounts are saved correctly
- The launcher passes `--account=DisplayName` correctly
- The crash happens INSIDE the game client when clicking login
- The session might be valid but the client doesn't know how to use it

## SquireClientWrapper Validation (for reference)

The wrapper logs these checks:
```java
// JX_SESSION_ID should be 22 chars, NOT start with "eyJ"
// JX_ACCESS_TOKEN should be a JWT (MUST start with "eyJ")
// But we're not setting these anymore - so why is client checking them?
```
