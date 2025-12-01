# Squire Cipher Capture Agent

A Java agent that intercepts ALL decryption operations at runtime to build a complete cipher mapping.

## What It Does

This agent hooks into the JVM and captures:

1. **Cipher.init()** - Captures algorithm and key material
2. **Cipher.doFinal()** - Captures encrypted input → decrypted output
3. **MessageDigest.digest()** - Captures key derivation (MD5)
4. **Base64.Decoder.decode()** - Captures Base64 decoding

This gives us the **exact** cipher mapping that Squire uses at runtime.

## Building

### With Gradle (recommended)
```bash
./build.sh
```

### Manual Build
```bash
# Download ByteBuddy
mkdir -p lib
curl -L -o lib/byte-buddy-1.14.11.jar \
    https://repo1.maven.org/maven2/net/bytebuddy/byte-buddy/1.14.11/byte-buddy-1.14.11.jar

# Compile
javac -d build -cp lib/byte-buddy-1.14.11.jar src/main/java/com/squire/agent/*.java

# Package
jar cfm squire-cipher-agent.jar MANIFEST.MF -C build .
```

## Usage

Run Squire with the agent attached:

```bash
java -javaagent:squire-cipher-agent.jar -jar squire-launcher.jar
```

The agent will:
1. Print decryption operations as they happen
2. Save complete cipher mapping on exit

## Output

Output is saved to `~/.squire/captured/`:

| File | Description |
|------|-------------|
| `runtime_cipher.json` | Simple encrypted→decrypted mapping |
| `captures_detailed.json` | Full details (algorithm, key, caller) |
| `cipher_operations.log` | All crypto operations logged |

### Example Output

```
╔════════════════════════════════════════════════════════════╗
║           SQUIRE CIPHER CAPTURE AGENT v1.0                 ║
╚════════════════════════════════════════════════════════════╝

[+] Hooked: javax.crypto.Cipher (init, doFinal)
[+] Hooked: java.util.Base64.Decoder (decode)
[+] Hooked: java.security.MessageDigest (digest)
[*] Hooks installed. Capturing decryption operations...

[CIPHER] MD5.digest("1up1v") -> 8f3a...
[CIPHER] init(DECRYPT, Blowfish, key=8f3a...)
[DECRYPT #1] hHfQHUMT9Ec= -> "Open"
[DECRYPT #2] DR8NNAU= -> "Door"
...
```

## How It Works

The agent uses [ByteBuddy](https://bytebuddy.net/) for bytecode manipulation:

```java
// Hook Cipher.doFinal() to capture input/output
new AgentBuilder.Default()
    .type(ElementMatchers.named("javax.crypto.Cipher"))
    .transform((builder, ...) -> builder
        .visit(Advice.to(CipherDoFinalAdvice.class)
            .on(ElementMatchers.named("doFinal"))))
    .installOn(inst);
```

When Squire's code calls `cipher.doFinal(encrypted)`, our advice intercepts:
- The encrypted input bytes
- The decrypted output bytes
- The algorithm and key used

## Comparison with Static Analysis

| Approach | Coverage | Accuracy |
|----------|----------|----------|
| Static Analysis | 100% of bytecode | 99.6% |
| Runtime Agent | Only executed code | 100% |

**Recommendation**: Use both:
1. Static analysis for bulk decryption
2. Runtime agent to validate and catch edge cases

## Files

```
agent/
├── README.md                  # This file
├── build.gradle               # Gradle build script
├── build.sh                   # Shell build script
├── STRATEGY.md                # Deobfuscation strategy doc
└── src/main/java/com/squire/agent/
    └── SquireCipherAgent.java # Main agent code
```

## Requirements

- Java 11+
- ByteBuddy 1.14.11 (downloaded automatically)
- Original Squire launcher JAR

## Troubleshooting

### "Agent JAR not found"
Make sure you built the agent first with `./build.sh`

### "Module X not accessible"
For Java 16+, you may need to add:
```bash
java --add-opens java.base/java.security=ALL-UNNAMED \
     --add-opens java.base/javax.crypto=ALL-UNNAMED \
     -javaagent:squire-cipher-agent.jar \
     -jar squire-launcher.jar
```

### "No captures recorded"
The agent only captures DECRYPT mode operations. If Squire uses a different decryption approach (like custom XOR), you may need to add additional hooks.
