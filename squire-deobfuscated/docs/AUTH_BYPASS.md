# Squire Authentication Bypass Analysis

## Executive Summary

Based on reverse engineering of `squire-launcher.jar` v2.7.1, several potential authentication bypass vectors have been identified. This document outlines each vector, its feasibility, and proof-of-concept approaches.

---

## 1. Authentication Architecture

### 1.1 Token-Based Auth Flow

```
[Launcher Start]
      │
      ▼
[Check Launcher.A() for token]
      │
      ├─ Token exists → [Validate with server]
      │                        │
      │                        ├─ Valid → [Continue launch]
      │                        │
      │                        └─ Invalid → [Show login]
      │
      └─ No token → [Show login UI (c/r/m/L)]
                           │
                           ▼
                    [User authenticates]
                           │
                           ▼
                    [Store token to file]
                           │
                           ▼
                    [Set Launcher.aN = true]
```

### 1.2 Key Components

| Component | Purpose | Bypass Relevance |
|-----------|---------|------------------|
| `Launcher.A()` | Get stored auth token | Token forgery target |
| `Launcher.aN` | Auth success flag | Direct patch target |
| `c/r/m/L.k()` | Show login dialog | UI bypass point |
| `S3Utils.getBootstrapModes()` | Fetch config with auth | Header manipulation |

---

## 2. Bypass Vector Analysis

### 2.1 VECTOR-01: Patch Authentication Flag

**Type:** Bytecode Modification
**Difficulty:** Easy
**Risk:** Low (client-side only)

**Analysis:**
The authentication check in `Launcher.main()` relies on the `aN` boolean flag:

```java
// Pseudo-code from bytecode
if (Launcher.A() == null || Launcher.A().isEmpty()) {
    c.r.m.L.k(null);  // Show login
    while (!Launcher.aN) {  // Wait for auth
        Thread.sleep(1000);
    }
}
log.info("Authenticated");
```

**Bypass Approach:**
1. Modify `Launcher.class` bytecode
2. Set `aN = true` at class initialization
3. Remove/NOP the auth check loop

**Implementation:**
```
// Original bytecode at Launcher.main()
getstatic     #318     // Field aN:Z
ifeq          497      // If false, wait

// Patched bytecode
iconst_1
putstatic     #318     // Set aN = true
goto          508      // Skip to "Authenticated"
```

---

### 2.2 VECTOR-02: Token File Injection

**Type:** Filesystem Manipulation
**Difficulty:** Easy
**Risk:** Medium (requires valid token format)

**Analysis:**
Token is stored in a file read by `c/r/m/c.e()`:

```java
// From c/r/m/c.e() bytecode
File tokenFile = new File(A, llllI[lIlII[20]]);  // Encrypted filename
Scanner scanner = new Scanner(tokenFile);
String token = scanner.nextLine();
```

**Bypass Approach:**
1. Locate token file directory
2. Analyze valid token format
3. Create token file with forged/leaked token

**Implementation:**
```bash
# Find token storage location
find ~/.squire -name "*.token" -o -name "*auth*"

# If token format is discovered, inject
echo "forged_token_here" > ~/.squire/auth_token
```

---

### 2.3 VECTOR-03: Network Request Interception

**Type:** MITM Attack
**Difficulty:** Medium
**Risk:** Low

**Analysis:**
Auth header sent to Lambda endpoints:

```java
// From S3Utils.getBootstrapModes()
Request request = new Request.Builder()
    .url("https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/")
    .header("auth", Launcher.A())  // Auth token here
    .build();
```

**Bypass Approach:**
1. Set up MITM proxy (mitmproxy, Burp)
2. Intercept auth requests
3. Modify responses to indicate successful auth

**Implementation:**
```python
# mitmproxy script
def response(flow):
    if "lambda-url.eu-west-1.on.aws" in flow.request.url:
        # Return valid bootstrap modes without auth
        flow.response.text = '[{"label":"experimental","code":"exp123"}]'
        flow.response.status_code = 200
```

---

### 2.4 VECTOR-04: Lambda Endpoint Direct Access

**Type:** API Exploitation
**Difficulty:** Medium
**Risk:** Medium (depends on server validation)

**Analysis:**
Multiple Lambda endpoints discovered:

```
https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/
https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/
https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/
https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/
```

**Bypass Approach:**
1. Test endpoints without auth headers
2. Test with empty/fake auth headers
3. Analyze response patterns for enumeration

**Testing Script:**
```python
import requests

endpoints = [
    "https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/",
    # ... other endpoints
]

for url in endpoints:
    # No auth
    r1 = requests.get(url)
    print(f"No auth: {r1.status_code}")

    # Fake auth
    r2 = requests.get(url, headers={"auth": "test"})
    print(f"Fake auth: {r2.status_code}")

    # Empty auth
    r3 = requests.get(url, headers={"auth": ""})
    print(f"Empty auth: {r3.status_code}")
```

---

### 2.5 VECTOR-05: Hardware ID Spoofing

**Type:** Identity Spoofing
**Difficulty:** Easy
**Risk:** Low

**Analysis:**
The API Gateway uses a static hardware ID:

```java
// From S3Utils.getBootstrapMode()
.header("x-hardware-id", "launcher_id")  // STATIC STRING!
```

This is NOT actually hardware-bound - it's a hardcoded string.

**Bypass Approach:**
If license is tied to hardware ID, spoofing is trivial since the ID is static.

---

### 2.6 VECTOR-06: Bootstrap Config Direct Download

**Type:** Resource Bypass
**Difficulty:** Easy
**Risk:** Low

**Analysis:**
Bootstrap configs stored on public S3:

```
https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-{code}.json
```

**Bypass Approach:**
1. Enumerate possible codes
2. Download bootstrap configs directly
3. Use configs offline

**Implementation:**
```python
import requests

codes = ["exp", "beta", "stable", "dev", "test", "123", "abc"]
for code in codes:
    url = f"https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-{code}.json"
    r = requests.get(url)
    if r.status_code == 200:
        print(f"Found: {url}")
        print(r.json())
```

---

### 2.7 VECTOR-07: GitHub Repo Access

**Type:** Source Code Access
**Difficulty:** Unknown
**Risk:** High (if successful)

**Analysis:**
References found to private repos:
- `sqire/Squire-hosting` (in GitHubUtils)
- `Squire/Squire-launcher` (in raw.githubusercontent URL)

**Bypass Approach:**
1. Search for leaked tokens/credentials
2. Check if repos were ever public (Wayback Machine)
3. Look for forks or mirrors

**Investigation:**
```bash
# Check Wayback Machine
curl "https://web.archive.org/cdx/search/cdx?url=github.com/sqire/*&output=json"
curl "https://web.archive.org/cdx/search/cdx?url=github.com/Squire/Squire-*&output=json"
```

---

## 3. Proof of Concept: Auth Flag Patch

### 3.1 Tools Required
- Java Development Kit (JDK)
- ASM library or Recaf (bytecode editor)

### 3.2 Procedure

1. **Extract Launcher.class**
```bash
cd squire_analysis/extracted
mkdir patched
cp net/runelite/launcher/Launcher.class patched/
```

2. **Edit with Recaf**
- Open Recaf
- Load `Launcher.class`
- Find `aN` field initialization
- Add `putstatic aN true` instruction

3. **Repackage JAR**
```bash
# Replace modified class
cd extracted
jar uf ../squire-launcher-patched.jar net/runelite/launcher/Launcher.class
```

4. **Test**
```bash
java -jar squire-launcher-patched.jar --debug
```

---

## 4. Risk Assessment

| Vector | Feasibility | Impact | Detection Risk |
|--------|-------------|--------|----------------|
| VECTOR-01: Flag Patch | High | Full bypass | Low |
| VECTOR-02: Token Injection | Medium | Full bypass | Low |
| VECTOR-03: MITM | Medium | Full bypass | Medium |
| VECTOR-04: Lambda Access | Low-Medium | Partial | High |
| VECTOR-05: HWID Spoof | N/A | None (static) | N/A |
| VECTOR-06: S3 Enumeration | High | Config access | Low |
| VECTOR-07: Git Access | Low | Source code | N/A |

---

## 5. Recommendations for Squire

### 5.1 Server-Side Improvements
1. Implement proper token validation per request
2. Use actual hardware fingerprinting
3. Add request signing/HMAC
4. Implement rate limiting on Lambda endpoints
5. Make S3 bootstrap configs private

### 5.2 Client-Side Improvements
1. Code signing verification
2. Anti-tamper checks
3. Certificate pinning
4. Obfuscate more critical strings
5. Use stronger encryption (AES-GCM instead of DES)

---

## 6. Conclusion

The Squire authentication system has several weaknesses:

1. **Client-side validation** - Auth flag can be patched
2. **Weak encryption** - DES and Blowfish with MD5 key derivation
3. **Static hardware ID** - No real hardware binding
4. **Public S3 bucket** - Bootstrap configs potentially enumerable
5. **Exposed Lambda URLs** - Direct access may be possible

The most practical bypass is **VECTOR-01: Auth Flag Patch**, which requires only bytecode modification and no server interaction.

---

*This analysis is for authorized security research purposes only.*
