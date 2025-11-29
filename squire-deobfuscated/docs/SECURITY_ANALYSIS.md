# Squire Launcher Security Analysis

## Executive Summary

This document contains a comprehensive security analysis of the Squire launcher (squire-launcher.jar v2.7.1) extracted from the Mac ARM client. The analysis reveals the authentication mechanism, server infrastructure, obfuscation techniques, and potential security concerns.

---

## 1. File Structure Analysis

### 1.1 Analyzed Files

| File | Size | Purpose |
|------|------|---------|
| `squire-launcher.jar` | 7.8 MB | Main launcher application |
| `jagex-detection-bypass.dll` | 684 KB | Windows DLL for bypassing game detection |
| `JNativeHook.x86_64.dll` | 82 KB | Keyboard/mouse hook library |

### 1.2 Package Structure

```
squire-launcher.jar
├── c/r/m/                      # Obfuscated Squire classes (40 files)
│   ├── a.class (32KB)          # Main auth/API handler
│   ├── L.class (11KB)          # Login UI (JFrame)
│   ├── c.class (14KB)          # Auth panel (JPanel)
│   ├── z.class (18KB)          # Unknown major component
│   └── [A-M, b-y].class        # Supporting classes
├── net/runelite/launcher/      # RuneLite integration
│   ├── Launcher.class (29KB)   # Entry point
│   ├── beans/                  # Data models
│   └── utils/
│       ├── S3Utils.class       # AWS S3/Lambda client
│       └── GitHubUtils.class   # GitHub API client
└── [third-party libraries]     # OkHttp, Gson, Kotlin, etc.
```

---

## 2. Server Infrastructure

### 2.1 AWS Lambda Endpoints (EU-West-1)

| Endpoint | Purpose |
|----------|---------|
| `https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/` | Bootstrap modes retrieval |
| `https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/` | Unknown (likely auth) |
| `https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/` | Unknown (likely license) |
| `https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/` | Unknown |

### 2.2 AWS API Gateway

| Endpoint | Headers Required |
|----------|------------------|
| `https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars` | `x-authentication-key`, `x-hardware-id: launcher_id` |

### 2.3 AWS S3 Bucket

| Endpoint | Purpose |
|----------|---------|
| `https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-%s.json` | Bootstrap configuration files |

### 2.4 GitHub Integration

| Endpoint | Purpose |
|----------|---------|
| `https://api.github.com` | GitHub API for updates |
| `https://raw.githubusercontent.com/Squire/Squire-launcher/master/build.gradle.kts` | Version checking |

---

## 3. Authentication Flow

### 3.1 Startup Sequence

```
1. Launcher.main() starts
2. Load squire.properties (askMode, bootstrapMode, disableHw)
3. Check if auth token exists (Launcher.A())
4. If no token:
   a. Call c/r/m/L.k(null) to show login UI
   b. Wait in loop until aN = true (authenticated flag)
5. Log "Authenticated"
6. Fetch bootstrap modes from Lambda (with auth header)
7. Parse and apply bootstrap configuration
8. Launch client with selected mode
```

### 3.2 Login UI (c/r/m/L)

- Extends `JFrame` with custom styling
- Uses `c/r/m/c` panel for auth controls
- Uses `c/r/m/z` for progress display
- Stores auth token to file system

### 3.3 Token Storage

```java
// Location pattern (from c/r/m/c.e())
File tokenFile = new File(System.getProperty("...") + "/.squire/...");
// Token read from file using Scanner
```

---

## 4. Obfuscation Techniques

### 4.1 String Encryption

**DES Encryption (c/r/m/L.lIlIl)**
```java
// Decryption method
SecretKeySpec key = new SecretKeySpec(
    Arrays.copyOf(MessageDigest.getInstance("MD5").digest(password.getBytes(UTF_8)), 8),
    "DES"
);
Cipher cipher = Cipher.getInstance("DES");
cipher.init(Cipher.DECRYPT_MODE, key);
return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)), UTF_8);
```

**Blowfish Encryption (c/r/m/c.lllIllI)**
```java
// Similar pattern but uses Blowfish
SecretKeySpec key = new SecretKeySpec(
    MessageDigest.getInstance("MD5").digest(password.getBytes(UTF_8)),
    "Blowfish"
);
Cipher cipher = Cipher.getInstance("Blowfish");
cipher.init(Cipher.DECRYPT_MODE, key);
return new String(cipher.doFinal(Base64.getDecoder().decode(encrypted)), UTF_8);
```

### 4.2 String Pool Obfuscation

All strings stored in encrypted arrays:
- `llllI[]` - String array in class `a`
- `llll[]` - String array in class `L`
- `lllIlI[]` - String array in class `c`

Accessed via index arrays with XOR operations:
- `lIlIIl[]` - Integer index array
- `lIlII[]` - Integer index array
- `lllIll[]` - Integer index array

### 4.3 Control Flow Obfuscation

```java
// Boolean wrapper methods for opaque predicates
private static boolean lIlIlIl(int i) {
    return i != 0;
}

private static boolean lIIllI(int i) {
    return i == 0 ? true : false;
}
```

### 4.4 Class/Method Naming

| Obfuscated | Likely Purpose |
|------------|----------------|
| `c/r/m/a` | Main API/Auth handler |
| `c/r/m/L` | Login Frame |
| `c/r/m/c` | Auth Panel |
| `c/r/m/z` | Progress/Status display |
| `c/r/m/F` | Platform detection |
| `c/r/m/G` | Platform enum (MacOS, etc.) |
| `c/r/m/k` | Color/Theme constants |
| `c/r/m/m` | Font utilities |
| `c/r/m/n` | Hardware acceleration enum |
| `c/r/m/q` | Dimension constants |

---

## 5. Jagex Detection Bypass DLL

### 5.1 Overview

The `jagex-detection-bypass.dll` is a Windows COM executable containing:

- **License verification** logic (`\license`, `activatedOnline`, `installTime`)
- **Client hooks** for memory/process manipulation
- **WinHTTP** for network communication
- **Registry access** (ADVAPI32.dll)
- **Process inspection** (PSAPI.DLL)

### 5.2 Key Strings Found

```
\license
activatedOnline true
installTime
uid version cid path
Client hook allocation failure
Client hook re-allocation failure
```

### 5.3 External Dependencies

- `ADVAPI32.dll` - Registry operations
- `SHLWAPI.dll` - Path operations
- `PSAPI.DLL` - Process information
- `WINHTTP.dll` - HTTP client

---

## 6. Security Findings

### 6.1 Weak Encryption

- **DES** (56-bit key) is deprecated and vulnerable
- **Blowfish** is better but still uses MD5 for key derivation
- **MD5** hash for key derivation is weak
- Keys derived from predictable strings

### 6.2 Exposed Infrastructure

All AWS endpoints are directly visible:
- Lambda function URLs are not behind authentication
- API Gateway key may be extractable from obfuscated strings
- S3 bucket is public-readable

### 6.3 Static Hardware ID

```java
.header("x-hardware-id", "launcher_id")
// Static string instead of actual hardware ID
```

### 6.4 Token Storage

Auth tokens stored in plaintext files on filesystem.

---

## 7. Deobfuscation Strategy

### 7.1 String Decryption

To decrypt all strings, need to:

1. **Extract encrypted string arrays** from each class
2. **Find the decryption key** (likely in static initializer or constant)
3. **Apply DES/Blowfish decryption** with MD5-derived key

### 7.2 Cipher Key Recovery

The decryption keys are likely:
- Hardcoded in class static initializers
- Derived from predictable values (class names, etc.)
- Possibly the same key across multiple classes

### 7.3 Tool Approach

```python
# Pseudocode for string decryption
def decrypt_des(encrypted_b64, key_string):
    key = md5(key_string.encode()).digest()[:8]
    cipher = DES.new(key, DES.MODE_ECB)
    return cipher.decrypt(base64.b64decode(encrypted_b64)).decode()

def decrypt_blowfish(encrypted_b64, key_string):
    key = md5(key_string.encode()).digest()
    cipher = Blowfish.new(key, Blowfish.MODE_ECB)
    return cipher.decrypt(base64.b64decode(encrypted_b64)).decode()
```

---

## 8. Potential Vulnerabilities

### 8.1 Authentication Bypass Vectors

1. **Token Forgery**: If token format is predictable
2. **Replay Attack**: Static hardware ID makes replay trivial
3. **Man-in-the-Middle**: No certificate pinning observed
4. **Local Token Manipulation**: Tokens stored in plaintext

### 8.2 Server-Side

1. **Lambda Function Abuse**: Direct URL access without auth
2. **API Gateway Key Extraction**: Key in obfuscated strings
3. **S3 Enumeration**: Bootstrap config naming pattern

### 8.3 Client-Side

1. **Memory Inspection**: DLL hooks can be analyzed
2. **Registry Monitoring**: License checks via registry
3. **Network Interception**: All endpoints are HTTPS but no pinning

---

## 9. Next Steps

### 9.1 To Complete Deobfuscation

1. Extract string arrays from bytecode
2. Identify encryption keys in static initializers
3. Build decryption tool
4. Generate human-readable source

### 9.2 To Test Auth Bypass

1. Intercept network traffic with MITM proxy
2. Analyze token format and validation
3. Test endpoint access patterns
4. Attempt token forgery

### 9.3 To Create Standalone Client

1. Remove auth checks from bytecode
2. Patch Lambda calls to skip validation
3. Replace license verification
4. Test with real game client

---

## 10. Appendix: Class Summary

| Class | Size (bytes) | Fields | Methods | Purpose |
|-------|--------------|--------|---------|---------|
| `a` | 32,382 | 7 | ~30 | Main API handler |
| `L` | 10,783 | 8 | ~15 | Login JFrame |
| `c` | 13,539 | 10 | ~20 | Auth JPanel |
| `z` | 17,839 | ? | ? | Progress display |
| `q` | 14,478 | ? | ? | Layout/dimensions |
| `H` | 9,883 | ? | ? | Unknown |
| `u` | 9,253 | ? | ? | Unknown |
| `y` | 8,776 | ? | ? | Unknown |
| `n` | 6,745 | ? | ? | HW acceleration |
| `K` | 5,021 | ? | ? | Unknown |
| `F` | 4,861 | ? | ? | Platform detection |
| `m` | 4,968 | ? | ? | Fonts |
| `i` | 4,318 | ? | ? | Unknown |
| `g` | 4,260 | ? | ? | Unknown |

---

*Analysis performed on squire-launcher.jar v2.7.1 from Mac ARM distribution*
