# Jagex Login Crash Fix - Instructions for Windows Testing

## Summary of Findings

The Jagex account login crashes were caused by **missing JX_* environment variables**.

### Root Cause
1. The OSRS game client reads these environment variables for Jagex authentication:
   - `JX_ACCESS_TOKEN` - Must be a JWT (starts with "eyJ")
   - `JX_SESSION_ID` - 22-character game session ID
   - `JX_CHARACTER_ID` - Account ID
   - `JX_DISPLAY_NAME` - Player display name
   - `JX_REFRESH_TOKEN` - For token refresh

2. The launcher was only passing `--account=displayName` but NOT setting the JX_* env vars

3. The CEFAccountImporter was only saving 5 fields to launcher.dat, throwing away the JWT (accessToken)

### Fix Applied
- `SquireLauncher.java` now reads launcher.dat and passes account data to LocalClientLauncher
- `CEFAccountImporter.java` now saves 7-part format including the JWT
- `LocalClientLauncher.java` sets JX_* environment variables when launching

---

## Steps to Test the Fix

### Step 1: Pull the Latest Changes

```bash
cd C:\path\to\Squire
git fetch origin claude/fix-jagex-login-crashes-01TUdLGmbvSVGecRcu68fqFZ
git checkout claude/fix-jagex-login-crashes-01TUdLGmbvSVGecRcu68fqFZ
git pull
```

### Step 2: Delete Old launcher.dat (Required)

The old launcher.dat has 5-part format which is missing the JWT. Delete it:

```powershell
Remove-Item "$env:USERPROFILE\.squire\launcher.dat" -ErrorAction SilentlyContinue
```

Or manually delete: `C:\Users\<YourUsername>\.squire\launcher.dat`

### Step 3: Compile the Project

```bash
cd DeobfuscatedProject/client/deobfuscated
mvn clean package -DskipTests
```

Or if using Gradle:
```bash
./gradlew build
```

### Step 4: Re-Import Jagex Accounts

Run the launcher with import flag to save accounts with the new 7-part format:

```bash
java -jar target/squire-launcher.jar --import-accounts
```

This will:
1. Open the OAuth browser window
2. Log in with your Jagex account
3. Save the account with sessionId + accessToken (JWT) + refreshToken

### Step 5: List Imported Accounts (Optional)

Verify accounts were imported correctly:

```bash
java -jar target/squire-launcher.jar --list-accounts
```

### Step 6: Launch with Jagex Account

```bash
java -jar target/squire-launcher.jar --account "YourDisplayName"
```

Or use the account selector:

```bash
java -jar target/squire-launcher.jar --jagexlauncher
```

---

## What to Look For

### Success Indicators
- Logs should show: "Found account data in launcher.dat"
- Logs should show: "sessionId: XX chars, accessToken: XXX chars"
- Logs should show: "JX_SESSION_ID", "JX_ACCESS_TOKEN" being set
- Client should launch without crashing
- Clicking login should work normally

### If Still Crashing
Check the log file at `~/.squire/logs/client/` for:
1. Is `JX_ACCESS_TOKEN` set and starting with "eyJ"?
2. Is `JX_SESSION_ID` 22 characters?
3. Any error messages about authentication?

---

## Files Changed

1. `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/SquireLauncher.java`
   - Lines 222-264: Now calls lookupJagexAccount() and passes data to launcher

2. `DeobfuscatedProject/client/deobfuscated/src/main/java/squire/launcher/auth/CEFAccountImporter.java`
   - Lines 359-393: Now saves 7-part format with JWT

---

## launcher.dat Format

### Old Format (5 parts) - BROKEN
```
::sessionId:accountId:displayName
```

### New Format (7 parts) - FIXED
```
::sessionId:accessToken:refreshToken:accountId:displayName
```

The `accessToken` is the JWT required for `JX_ACCESS_TOKEN`.
