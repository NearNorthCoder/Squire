# Squire Access Points & Server Infrastructure Summary

## Executive Summary

Comprehensive analysis of the Squire OSRS automation client reveals extensive AWS infrastructure, GitHub integrations, and community access points. This document consolidates all discovered endpoints, repositories, and access vectors.

---

## 1. AWS Infrastructure (EU-West-1)

### 1.1 Lambda Function URLs (Direct Access)

| Endpoint | Purpose | Auth Required |
|----------|---------|---------------|
| `https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/` | Bootstrap modes retrieval | Likely |
| `https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/` | Authentication endpoint | Yes |
| `https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/` | License validation | Yes |
| `https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/` | Unknown | Unknown |

### 1.2 API Gateway

| Endpoint | Headers Required |
|----------|------------------|
| `https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars` | `x-authentication-key`, `x-hardware-id: launcher_id` |

**Critical Finding:** Hardware ID is static string "launcher_id" - not actual hardware fingerprint.

### 1.3 S3 Bucket

| Bucket | Pattern | Status |
|--------|---------|--------|
| `https://squire-hosting.s3.eu-west-1.amazonaws.com/` | `bootstrap-{code}.json` | Potentially public |

**Known Config Names:**
- `bootstrap-stable.json`
- `bootstrap-beta.json`
- `bootstrap-experimental.json`

**Enumeration Candidates:**
- `bootstrap-dev.json`
- `bootstrap-test.json`
- `bootstrap-release.json`
- `bootstrap-internal.json`

---

## 2. GitHub Repositories & Access

### 2.1 Public Repositories

| Repository | URL | Status | Content |
|------------|-----|--------|---------|
| **Blogans/free-squire-plugins** | https://github.com/Blogans/free-squire-plugins | Public | Squire Kotlin plugins (2 stars, 6 forks) |
| **DasilvaB/unethicalite-plugins-blogans** | https://github.com/DasilvaB/unethicalite-plugins-blogans | Public | Fork of above |
| **R3G3XR/RLaunch** | https://github.com/R3G3XR/RLaunch | Public | Multi-client launcher (supports Squire) |

### 2.2 Private/Non-existent Repositories (Referenced in Code)

| Repository | Status |
|------------|--------|
| `github.com/sqire/Squire-hosting` | NOT FOUND (private/deleted) |
| `github.com/Squire/Squire-launcher` | NOT FOUND (private/deleted) |

### 2.3 Organizations

| Organization | URL | Status |
|--------------|-----|--------|
| squire-plugins | https://github.com/squire-plugins | Private/inactive |

### 2.4 GitHub Version Check URL

```
https://raw.githubusercontent.com/Squire/Squire-launcher/master/build.gradle.kts
```

---

## 3. Community & Social Access

### 3.1 Official Squire

| Resource | URL | Access |
|----------|-----|--------|
| **Website** | https://squireplugins.com/ | Public |
| **Store** | https://squire.sellpass.io/ | Public |
| **FAQ** | https://squire.sellpass.io/faq | Public |
| **Reviews** | https://squire.sellpass.io/reviews | Public |
| **Discord** | Ticket required after purchase | Private |

### 3.2 1UP Plugins (Related)

| Resource | URL | Access |
|----------|-----|--------|
| **Discord** | https://discord.gg/MwtFk2zbdB | Public invite |
| **Website** | https://www.1upplugins.net/ | Public |
| **Patreon** | https://www.patreon.com/1UpPlugins | Public |

### 3.3 Forums

| Forum | URL | Content |
|-------|-----|---------|
| **Sythe.org** | https://sythe.org/threads/squire-fully-automated-osrs-client-private-and-slotted-full-gauntlet-shamans-gwd-more/ | 157+ page thread |
| **Developer Profile** | https://www.sythe.org/members/squire.334342/ | "Squire" (formerly "Chad0ck") |

---

## 4. Developer Information

| Identifier | Value |
|------------|-------|
| Discord Username | ChadGPT |
| Forum Username | Squire (formerly "Chad0ck") |
| Sythe Member Since | March 22, 2012 |
| Real Identity | Unknown/Pseudonymous |

---

## 5. Related Ecosystem Repositories

### Unethicalite (Compatible)
- https://github.com/jbx5/unethicalite
- https://github.com/The-Profaned/unethicalite_plugins
- https://github.com/yuri-moens/chaos-plugins
- https://github.com/zmike808/unethicalite-autologin

### OpenOSRS
- https://github.com/open-osrs/plugins
- https://github.com/open-osrs/plugin-hosting

### RuneLite (Base)
- https://github.com/runelite/runelite
- https://github.com/runelite/launcher
- https://github.com/runelite/plugin-hub

---

## 6. Security Vulnerabilities

### 6.1 Critical Issues

| Issue | Severity | Description |
|-------|----------|-------------|
| Static Hardware ID | HIGH | `x-hardware-id: launcher_id` is hardcoded |
| Weak Encryption | MEDIUM | DES/Blowfish with MD5 key derivation |
| Public S3 Bucket | MEDIUM | Bootstrap configs potentially enumerable |
| No Certificate Pinning | MEDIUM | MITM attacks possible |
| Client-side Auth | HIGH | Auth flag can be patched in bytecode |

### 6.2 Authentication Bypass Vectors

1. **VECTOR-01:** Bytecode patch of `Launcher.aN` flag
2. **VECTOR-02:** Token file injection (`~/.squire/`)
3. **VECTOR-03:** MITM response modification
4. **VECTOR-04:** Lambda endpoint direct access
5. **VECTOR-05:** Hardware ID spoofing (trivial - static)
6. **VECTOR-06:** S3 bootstrap enumeration

---

## 7. Local File Paths

### Token Storage
```
~/.squire/[encrypted_filename]
```

### Logs
```
~/.squire/logs/launcher.log
~/.squire/logs/launcher_YYYY-MM-dd.i.log
```

### Configuration
```
squire.properties
launcher.properties (version: 2.7.1)
```

---

## 8. Testing Scripts

### S3 Enumeration
```python
import requests

codes = ["stable", "beta", "experimental", "dev", "test", "release", "internal", "prod"]
for code in codes:
    url = f"https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-{code}.json"
    r = requests.get(url)
    print(f"{code}: {r.status_code}")
    if r.status_code == 200:
        print(r.json())
```

### Lambda Endpoint Testing
```python
import requests

endpoints = [
    "https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/",
    "https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/",
    "https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/",
    "https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/"
]

for url in endpoints:
    # No auth
    r = requests.get(url)
    print(f"No auth: {url} -> {r.status_code}")

    # With fake auth
    r = requests.get(url, headers={"auth": "test", "x-hardware-id": "launcher_id"})
    print(f"Fake auth: {url} -> {r.status_code}")
```

---

## 9. Quick Reference

### All External URLs Found

**Infrastructure:**
```
https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/
https://6kvxsi2v4a3jozbz3qlc56uuxa0ecqrh.lambda-url.eu-west-1.on.aws/
https://6zyqmauzakrgs4jprwsf6tqotm0zyepn.lambda-url.eu-west-1.on.aws/
https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/
https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars
https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-%s.json
```

**GitHub:**
```
https://api.github.com
https://raw.githubusercontent.com/Squire/Squire-launcher/master/build.gradle.kts
https://github.com/Blogans/free-squire-plugins
https://github.com/R3G3XR/RLaunch
```

**Community:**
```
https://squireplugins.com/
https://squire.sellpass.io/
https://discord.gg/MwtFk2zbdB (1UP Plugins)
https://www.1upplugins.net/
https://www.patreon.com/1UpPlugins
```

---

## 10. Recommendations for Further Research

1. **Test S3 bucket enumeration** from unrestricted network
2. **Test Lambda endpoints** with various auth headers
3. **Decrypt obfuscated strings** using `decrypt_strings.py` with key candidates
4. **Monitor Sythe.org thread** for updates and leaks
5. **Join 1UP Plugins Discord** for potential cross-contamination info
6. **Check Wayback Machine** periodically for archived content
7. **Analyze DLL** (`jagex-detection-bypass.dll`) for additional endpoints

---

*Generated: Security analysis of Squire Launcher v2.7.1*
*Sources: Static analysis of squire-launcher.jar, web reconnaissance, community research*
