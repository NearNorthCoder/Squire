# S3 Bucket Enumeration Results

**Bucket**: `squire-hosting.s3.eu-west-1.amazonaws.com`
**Status**: PUBLIC LISTING ENABLED
**Enumeration Date**: 2025-11-28
**Total Files**: 53,262

## Critical Finding

The S3 bucket allows **anonymous directory listing** - a significant security misconfiguration that exposes the entire infrastructure.

## File Type Summary

| Extension | Count | Description |
|-----------|-------|-------------|
| .sha1 | 10,603 | SHA1 checksums |
| .md5 | 10,603 | MD5 checksums |
| .sha512 | 10,572 | SHA512 checksums |
| .sha256 | 10,572 | SHA256 checksums |
| .jar | 3,936 | Java archives (client/launcher) |
| .pom | 3,338 | Maven POM files |
| .module | 3,290 | Module descriptors |
| .xml | 154 | Configuration files |
| .oprs | 74 | OPRS client files |
| .hash | 74 | Custom hash files |
| .unc | 39 | Unknown compressed? |
| .json | 7 | Configuration files |

## Directory Structure

| Directory | Files | Description |
|-----------|-------|-------------|
| net/ | 51,290 | Main Maven repository (net.unethicalite) |
| com/ | 1,320 | OpenOSRS components |
| gg/ | 250 | Squire custom packages |
| buire/ | 95 | Squire loader builds |
| nightly/ | 65 | Nightly builds |
| stable/ | 60 | Stable releases |
| experimental/ | 50 | Experimental builds |
| **sessions/** | 44 | USER SESSION DATA |
| antiban/ | 35 | Antiban module |
| developer/ | 25 | Developer builds |
| developerr/ | 15 | Developer builds (typo?) |
| instances/ | 5 | Instance configs |

## HIGH PRIORITY - Potentially Sensitive Files

### 1. Bootstrap Configuration Files
These contain JVM arguments, dependency hashes, and artifact locations:

```
bootstrap-antiban.json      (35,799 bytes)
bootstrap-developer.json    (33,375 bytes)
bootstrap-developerr.json   (35,814 bytes)
bootstrap-experimental.json (35,824 bytes)
bootstrap-instances.json    (32,189 bytes)
bootstrap-nightly.json      (33,365 bytes)
bootstrap-stable.json       (33,360 bytes)
```

**Contents include**:
- JVM arguments (including `-XX:+DisableAttachMechanism`)
- Complete dependency hashes (SHA256)
- Artifact download locations
- Build commit info

### 2. Sessions Folder (CRITICAL)
Contains user session files with UUIDs - potentially sensitive user data:

```
sessions/014b6ac0-aeaf-4787-a3f9-25abfb500274.unc (8MB)
sessions/03f55afb-f579-4500-a05c-1f3759f58aa6.unc (8MB)
sessions/0429d686-361e-4c0a-a7aa-4b4a1da56cda.unc (8MB)
sessions/24/runelite-loader.jar
sessions/2a8d2171-a7f4-4266-9e1b-b509e9ccb464/runelite-loader.jar
sessions/681e6c38-4015-4955-9bba-bff3c103238c/runelite-loader.jar
...
```

Files are ~8MB each - likely contain:
- User session state
- Account tokens
- Configuration data
- Possibly game state

### 3. Maven Repository Structure
Exposes complete build infrastructure:

```
gg/squire/
├── cache/
├── deobfuscator/
├── http-api/
├── injected-client/
├── injection-annotations/
├── rs/runescape-api/
├── rs/runescape-client/
├── runelite-api/
├── runelite-client/
├── runelite-jshell/
├── runelite-mixins/
└── wiki-scraper/

net/unethicalite/
├── cache/
├── deobfuscator/
├── http-api/
├── injected-client/
├── runelite-api/
├── runelite-client/
└── (many versions)

com/openosrs/
├── injector-plugin/
└── script-assembler-plugin/
```

### 4. Loader Artifacts
Multiple versions of the runelite-loader with source POM files:

```
buire/gg/squire/runelite-loader/1.0-SNAPSHOT/
buire/gg/squire/runelite-loader/1.1-SNAPSHOT/
buire/gg/squire/runelite-loader/1.3-SNAPSHOT/
```

### 5. .oprs Files (Injected Client)
Custom client packages:

```
gg/squire/injected-client/1.5.0/injected-client-1.5.0.oprs
net/unethicalite/injected-client/1.0.14/injected-client-1.0.14.oprs
net/unethicalite/injected-client/1.0.16/injected-client-1.0.16.oprs
...
```

## Security Implications

### 1. Information Disclosure (HIGH)
- Complete build infrastructure visible
- Version history exposed
- Internal naming conventions revealed
- Development timeline traceable

### 2. Session Data Exposure (CRITICAL)
- 44 session files publicly accessible
- UUID-based naming suggests user sessions
- 8MB files could contain sensitive data
- Authentication tokens may be exposed

### 3. Supply Chain Risk (MEDIUM)
- All JAR files publicly downloadable
- Checksums available for verification
- But also enables:
  - Malware analysis
  - Reverse engineering
  - Finding vulnerable versions

### 4. Developer Build Exposure (MEDIUM)
- Developer/nightly builds accessible
- May contain debug code
- Potentially less secure than stable

## Recommendations for Report

1. **Session folder** should be investigated for sensitive data exposure
2. **Bootstrap configs** reveal infrastructure details
3. **Public listing** should be disabled
4. **Version history** enables targeted attacks on older versions

## Commands to Download Interesting Files

```bash
# Bootstrap configs
curl -O https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-developer.json
curl -O https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-antiban.json

# Sample session file (CAUTION - may contain user data)
curl -O https://squire-hosting.s3.eu-west-1.amazonaws.com/sessions/014b6ac0-aeaf-4787-a3f9-25abfb500274.unc

# Maven metadata
curl -O https://squire-hosting.s3.eu-west-1.amazonaws.com/gg/squire/runelite-client/maven-metadata.xml
```

## Full File List

See: `/tmp/s3_complete_list.txt` (53,262 entries)
