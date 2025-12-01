package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Using Bank loadout", priority = 999, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.E  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/E.class */
public class E extends F {
    private static /* synthetic */ int[] llllIIIlIllI;
    private static /* synthetic */ String[] llllIIIlIlII;
    private static final /* synthetic */ Logger cY;

    private static void lIIIllllIIIllIl() {
        llllIIIlIllI = new int[4];
        llllIIIlIllI[0] = (54 ^ 18) & ((80 ^ 116) ^ (-1));
        llllIIIlIllI[1] = " ".length();
        llllIIIlIllI[2] = (((47 + 80) - 62) + 84) ^ (((51 + 139) - 158) + 112);
        llllIIIlIllI[3] = "  ".length();
    }

    private static String lIIIllllIIIIllI(String lllllllllllllllIIlIlllllllIllIll, String lllllllllllllllIIlIlllllllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIlIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllllllIlIlll) {
            lllllllllllllllIIlIlllllllIlIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIIIlIl(String lllllllllllllllIIlIlllllllIIlIll, String lllllllllllllllIIlIlllllllIIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllllllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllllllIIlIlI.toCharArray();
        int lllllllllllllllIIlIlllllllIIIlll = llllIIIlIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIIlIllI[0];
        while (lIIIllllIIlIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlllllllIIIlll % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllllllIIIlll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public E(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static void lIIIllllIIIIlll() {
        llllIIIlIlII = new String[llllIIIlIllI[3]];
        llllIIIlIlII[llllIIIlIllI[0]] = lIIIllllIIIIlIl("FDIPOAMDHw8yBzoEOjcbJC1Udi4uGQIzDG8EAXYfJgQGMhouB040CSEbTjoHLhQBIxxvEQgiDT1QW3YaKgQcPw08Xg==", "OpnVh");
        llllIIIlIlII[llllIIIlIllI[1]] = lIIIllllIIIIllI("XTBPlehAYc6WyCCIRKqwFQ==", "wCHgo");
    }

    private static boolean lIIIllllIIIllll(int i) {
        return i == 0;
    }

    private static boolean lIIIllllIIlIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIllllIIIllIl();
        lIIIllllIIIIlll();
        cY = LoggerFactory.getLogger(E.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.F, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllllIIIlllI(this.cW.ae() ? 1 : 0) && !lIIIllllIIIlllI(this.cW.n() ? 1 : 0)) {
            if (lIIIllllIIIllll(Bank.isOpen() ? 1 : 0)) {
                return Bank.open();
            }
            Predicate<Item> predicate = item -> {
                if (lIIIllllIIIlllI(item.getName().toLowerCase().contains(llllIIIlIlII[llllIIIlIllI[1]]) ? 1 : 0) && lIIIllllIIIllll(item.isPlaceholder() ? 1 : 0)) {
                    ?? r0 = llllIIIlIllI[1];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIlIllI[0];
            };
            if (lIIIllllIIIlllI(cb() ? 1 : 0) && lIIIllllIIIlllI(Bank.contains(predicate) ? 1 : 0)) {
                return a(predicate, llllIIIlIllI[1]);
            }
            if (lIIIllllIIIllll(ce().needsToBank() ? 1 : 0)) {
                Bank.close();
                return llllIIIlIllI[1];
            } else if (lIIIllllIIIllll(BankLoadouts.withdrawWithRetries(ce(), llllIIIlIllI[2]).booleanValue() ? 1 : 0)) {
                Log.info(llllIIIlIlII[llllIIIlIllI[0]]);
                return llllIIIlIllI[0];
            } else {
                sleep(llllIIIlIllI[3]);
                return llllIIIlIllI[1];
            }
        }
        return llllIIIlIllI[0];
    }

    private static boolean lIIIllllIIIlllI(int i) {
        return i != 0;
    }
}
