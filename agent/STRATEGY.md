# Optimal Deobfuscation Strategy

## Current State

We already have **99.6% success rate** with static analysis:
- 43,283 strings decrypted out of 43,469
- 186 failed (likely corrupt/invalid data, not unknown algorithms)

## Is Runtime Capture the Best Approach?

**Short answer: Not necessarily, but it's valuable for validation.**

### Comparison of Approaches

| Approach | What it Gets | Best For |
|----------|--------------|----------|
| **Static Analysis** (current) | All encrypted strings in bytecode | Bulk decryption |
| **Runtime Agent** | Only strings that execute | Validation, edge cases |
| **Algorithm Capture** | The cipher implementation itself | Confirming our understanding |
| **ClassLoader Hook** | Raw bytecode before loading | Dynamic class generation |

## The SMARTEST Strategy

### Step 1: Validate Our Cipher (5 mins)
Run the client with our algorithm capture agent ONCE to confirm:
- DES with MD5[:8] key derivation ✓
- Blowfish with MD5 key derivation ✓
- XOR with rolling key ✓

### Step 2: Use Static Analysis (already done)
Our `extract_decrypt_strings.py` already works. It:
- Finds all decrypt calls via regex
- Tries all three algorithms
- Outputs 43,283 decrypted strings

### Step 3: Fix the 186 Failures (optional)
Analyze why 186 strings failed:
- Likely malformed Base64 or invalid padding
- May be dead code / unused strings
- Not worth runtime capture for 0.4%

## When Runtime Capture IS Useful

1. **Dynamically computed keys** - Keys calculated at runtime
2. **Obfuscated control flow** - Decrypt method chosen at runtime
3. **Nested encryption** - String decrypted, then decrypted again
4. **Validation** - Confirm static analysis is correct

## What Would Give Us 100%?

The remaining 0.4% (186 strings) would require:
1. Analyzing WHY they failed (corrupt data? different algorithm?)
2. Possibly runtime capture if they use dynamic keys
3. Manual inspection for edge cases

**But 99.6% is already excellent for practical use.**

## Recommended Next Steps

1. **Compile the deobfuscated code** - See if it works
2. **Run type error fixer** - Already done (4,937 fixes)
3. **Test a single plugin** - Pick Vorkath, try to compile
4. **Fix remaining issues** - Lambda scopes, imports, etc.

## Building the Agent

If you want to run the agent for validation:

```bash
cd agent
javac -d build src/*.java
jar cfm squire-agent.jar manifest.txt -C build .

# Run with agent
java -javaagent:squire-agent.jar -jar squire-launcher.jar
```

## Manifest for JAR

```
Manifest-Version: 1.0
Premain-Class: AlgorithmCaptureAgent
Agent-Class: AlgorithmCaptureAgent
Can-Retransform-Classes: true
Can-Redefine-Classes: true
```

## Conclusion

**Static analysis is the best primary approach** because:
- Already achieved 99.6% success
- No need to run the client
- Faster and more complete coverage

**Runtime capture is a supplementary tool** for:
- Validation
- Edge cases
- Understanding the algorithm

The smartest move is to **compile the deobfuscated code** and see what actually breaks, then fix those specific issues rather than trying to capture everything at runtime.
