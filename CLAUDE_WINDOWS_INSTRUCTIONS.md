# Jagex Account Login Fix - Instructions for Claude Windows

## Summary of What Was Found

After decompiling Squire's actual working code from `squire-with-logging.jar`, I discovered the **exact difference** between the working Squire implementation and our broken implementation.

### The Root Cause

| Aspect | Squire (WORKING) | Our Code (WAS BROKEN) |
|--------|------------------|----------------------|
| **launcher.dat format** | `::sessionId:accountId:displayName` (5 parts) | `::sessionId:accessToken:refreshToken:accountId:displayName` (7 parts) |
| **How launch works** | Just passes `--account=displayName` to client | Set JX_* environment variables + passed --account |
| **Token handling** | None - client reads launcher.dat directly | Refreshed tokens and created NEW sessions every launch |
| **Result** | Works for months without re-login | Crashed when entering game |

### Why It Was Crashing

The Squire client (in `squire-with-logging.jar`) is designed to read `launcher.dat` directly and handle authentication internally. When we ALSO set JX_SESSION_ID, JX_ACCESS_TOKEN, etc. as environment variables, the client got **conflicting data** and failed during game authentication.

## Files Changed

Pull these files from branch `claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn`:

1. **`DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/CEFAccountImporter.java`**
   - Changed `saveAccount()` to use 5-part format: `::sessionId:accountId:displayName`

2. **`DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/SquireLauncher.java`**
   - Removed all token refresh/session creation on launch
   - Now just passes `--account=displayName` to client
   - Calls `LocalClientLauncher.launch(repoDir, clientArgs)` without JagexAccountData
   - Updated `saveAccountToFile()` to use 5-part format

## Git Commands to Update Local Project

```cmd
cd C:\path\to\Squire

:: Fetch the branch
git fetch origin claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn

:: Option A: Merge into current branch
git merge origin/claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn

:: Option B: Or checkout the branch directly
git checkout claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn
```

## CRITICAL: Delete Old launcher.dat

The old `launcher.dat` has 7-part format entries that will cause issues. Delete it before testing:

```cmd
del %USERPROFILE%\.squire\launcher.dat
```

## Build Instructions

```cmd
cd DeobfuscatedProject\client\deobfuscated
mvn clean package -DskipTests
```

This creates: `target/squire-launcher-1.0.0-SNAPSHOT.jar`

## Test Instructions

### Step 1: Import Accounts Fresh (One-Time)

```cmd
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar --import-accounts
```

- CEF browser window opens
- Log in to Jagex account
- Click Allow on consent page
- Accounts saved to `~/.squire/launcher.dat` in 5-part format

### Step 2: Verify launcher.dat Format

```cmd
type %USERPROFILE%\.squire\launcher.dat
```

Each line should look like:
```
::ABC123sessionid456:accountId123:YourDisplayName
```

**NOT** like this (old broken format):
```
::sessionId:accessToken:refreshToken:accountId:displayName
```

### Step 3: Launch with Account Selector

```cmd
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar --jagexlauncher
```

### Step 4: Or Launch with Specific Account

```cmd
java -jar target/squire-launcher-1.0.0-SNAPSHOT.jar --account "YourDisplayName"
```

## Expected Behavior

1. **Import**: Creates `launcher.dat` with 5-part format entries
2. **Launch**: Just passes `--account=YourName` to client (check logs - NO JX_* env vars)
3. **Client**: Reads `launcher.dat` directly, authenticates internally
4. **Game**: Should load without crashes!

## How to Verify the Fix is Working

Check the launcher logs - you should see:

```
=======================================================
JAGEX ACCOUNT LOGIN: YourDisplayName
=======================================================
Using Squire's original approach:
  - Passing --account=YourDisplayName to client
  - Client reads launcher.dat directly
  - No JX_* environment variables (client handles auth)
=======================================================
```

You should **NOT** see any of this anymore:
- "ATTEMPTING TOKEN REFRESH..."
- "CREATING GAME SESSION FROM ID TOKEN..."
- "JX_SESSION_ID:", "JX_ACCESS_TOKEN:", etc.

## Branch & Commit Info

- **Branch:** `claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn`
- **Commit:** `36905f86` - Match Squire's original Jagex account flow exactly
- **GitHub:** https://github.com/NearNorthCoder/Squire/tree/claude/fix-jagex-login-crashes-01RDtcuVsqeokbee75aWTsjn

## If It Still Doesn't Work

1. Make sure you deleted the old `launcher.dat`
2. Re-import accounts with `--import-accounts`
3. Check the launcher.dat format (should be 5 parts)
4. Check logs for any JX_* environment variable mentions (there should be none)
5. The crash might be unrelated to auth - check client logs at `~/.squire/logs/`
