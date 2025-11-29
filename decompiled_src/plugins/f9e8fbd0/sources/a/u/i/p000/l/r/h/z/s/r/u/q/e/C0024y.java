package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
@TaskDesc(name = "Curing venom", priority = 100, register = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.y  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/y.class */
public class C0024y extends Task {
    private static /* synthetic */ int[] lIllIllIIIIlI;
    private final /* synthetic */ Duration T = Duration.ofSeconds(14);
    private final /* synthetic */ SquireZulrahConfig S;
    private static /* synthetic */ String[] lIllIllIIIIII;
    private /* synthetic */ Instant U;

    private static boolean llIIlIIIlIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIIlIlIIlI(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (llIIlIIIlIlIllI(varbitChanged.getVarpId(), lIllIllIIIIlI[3])) {
            this.U = Instant.now();
        }
    }

    private static String llIIlIIIlIIlIIl(String llllllllllllllIllIIIlIlllllllIlI, String llllllllllllllIllIIIlIllllllIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIIIIlI[2], llllllllllllllIllIIIlIllllllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlllllllIll) {
            llllllllllllllIllIIIlIlllllllIll.printStackTrace();
            return null;
        }
    }

    private static int llIIlIIIlIIllll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llIIlIIIlIlIlII(int i) {
        return i <= 0;
    }

    private static boolean llIIlIIIlIlIlIl(int i) {
        return i != 0;
    }

    static {
        llIIlIIIlIIlllI();
        llIIlIIIlIIlIlI();
    }

    private static String llIIlIIIlIIlIII(String llllllllllllllIllIIIllIIIIIIllll, String llllllllllllllIllIIIllIIIIIIlllI) {
        String llllllllllllllIllIIIllIIIIIIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIllIIIIIIllII = llllllllllllllIllIIIllIIIIIIlllI.toCharArray();
        int llllllllllllllIllIIIllIIIIIIlIll = lIllIllIIIIlI[0];
        char[] charArray = llllllllllllllIllIIIllIIIIIIllll2.toCharArray();
        int llllllllllllllIllIIIllIIIIIIIlII = charArray.length;
        int i = lIllIllIIIIlI[0];
        while (llIIlIIIlIlIlll(i, llllllllllllllIllIIIllIIIIIIIlII)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIIllIIIIIIllII[llllllllllllllIllIIIllIIIIIIlIll % llllllllllllllIllIIIllIIIIIIllII.length]));
            "".length();
            llllllllllllllIllIIIllIIIIIIlIll++;
            i++;
            "".length();
            if (((249 ^ 147) ^ (202 ^ 164)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0) && llIIlIIIlIlIIIl(llIIlIIIlIIllll(Duration.between(this.U, Instant.now()).toSeconds(), this.T.toSeconds()))) {
            switch (C0025z.V[this.S.cure().ordinal()]) {
                case 1:
                    Item first = Inventory.getFirst(item -> {
                        return item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[6]]);
                    });
                    if (llIIlIIIlIlIIlI(first)) {
                        return lIllIllIIIIlI[0];
                    }
                    first.interact(lIllIllIIIIII[lIllIllIIIIlI[0]]);
                    return lIllIllIIIIlI[1];
                case 2:
                    Item first2 = Inventory.getFirst(item2 -> {
                        return item2.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[5]]);
                    });
                    if (llIIlIIIlIlIIlI(first2)) {
                        return lIllIllIIIIlI[0];
                    }
                    first2.interact(lIllIllIIIIII[lIllIllIIIIlI[1]]);
                    return lIllIllIIIIlI[1];
                case 3:
                    SpellBook.Lunar.CURE_ME.cast();
                    return lIllIllIIIIlI[1];
                case 4:
                    Item first3 = Inventory.getFirst(item3 -> {
                        return item3.getName().toLowerCase().contains(lIllIllIIIIII[lIllIllIIIIlI[4]]);
                    });
                    if (llIIlIIIlIlIIlI(first3)) {
                        return lIllIllIIIIlI[0];
                    }
                    first3.interact(lIllIllIIIIII[lIllIllIIIIlI[2]]);
                    return lIllIllIIIIlI[1];
                default:
                    return lIllIllIIIIlI[0];
            }
        }
        return lIllIllIIIIlI[0];
    }

    private static boolean llIIlIIIlIlIIII(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIlIlIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean ab() {
        if (llIIlIIIlIlIlII(llIIlIIIlIlIIll(Duration.between(this.U, Instant.now()).toSeconds(), this.T.toSeconds()))) {
            return lIllIllIIIIlI[0];
        }
        if (llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0) && llIIlIIIlIlIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIIIIlI[0];
        }
        if (!llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0) || llIIlIIIlIlIlIl(Combat.isPoisoned() ? 1 : 0)) {
            ?? r0 = lIllIllIIIIlI[1];
            "".length();
            return " ".length() >= "  ".length() ? ((20 ^ 27) ^ ((93 ^ 5) & ((23 ^ 79) ^ (-1)))) & (((((90 + 35) - 3) + 25) ^ (((2 + 24) - (-109)) + 21)) ^ (-" ".length())) : r0;
        }
        return lIllIllIIIIlI[0];
    }

    @Inject
    public C0024y(SquireZulrahConfig squireZulrahConfig) {
        this.S = squireZulrahConfig;
    }

    private static boolean llIIlIIIlIlIIIl(int i) {
        return i > 0;
    }

    private static void llIIlIIIlIIlIlI() {
        lIllIllIIIIII = new String[lIllIllIIIIlI[7]];
        lIllIllIIIIII[lIllIllIIIIlI[0]] = llIIlIIIlIIlIII("EDo7LQY=", "THRCm");
        lIllIllIIIIII[lIllIllIIIIlI[1]] = llIIlIIIlIIlIII("CxgxFDE=", "OjXzZ");
        lIllIllIIIIII[lIllIllIIIIlI[2]] = llIIlIIIlIIlIII("NSg7Lwo=", "qZRAa");
        lIllIllIIIIII[lIllIllIIIIlI[4]] = llIIlIIIlIIlIII("NCszHjc6LDQYKQ==", "UEGwG");
        lIllIllIIIIII[lIllIllIIIIlI[5]] = llIIlIIIlIIlIIl("53rqonKVZ0C5KEf9dKImGQ==", "QQYwL");
        lIllIllIIIIII[lIllIllIIIIlI[6]] = llIIlIIIlIIlIII("LT0+A3QaNiQFNA==", "lSJjY");
    }

    private static void llIIlIIIlIIlllI() {
        lIllIllIIIIlI = new int[8];
        lIllIllIIIIlI[0] = (115 ^ 33) & ((50 ^ 96) ^ (-1));
        lIllIllIIIIlI[1] = " ".length();
        lIllIllIIIIlI[2] = "  ".length();
        lIllIllIIIIlI[3] = (5 ^ 96) ^ "   ".length();
        lIllIllIIIIlI[4] = "   ".length();
        lIllIllIIIIlI[5] = 180 ^ 176;
        lIllIllIIIIlI[6] = 181 ^ 176;
        lIllIllIIIIlI[7] = ((93 ^ 19) & ((84 ^ 26) ^ (-1))) ^ (199 ^ 193);
    }

    private static int llIIlIIIlIlIIll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
