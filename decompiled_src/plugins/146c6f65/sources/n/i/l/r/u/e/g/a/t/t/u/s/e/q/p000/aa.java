package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Starting a gauntlet", priority = 3, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.aa  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/aa.class */
public class aa extends AbstractC0013n {
    private /* synthetic */ int cl;
    private static /* synthetic */ int[] llIIllllIlII;
    private final /* synthetic */ GauntletConfig ck;
    private static /* synthetic */ String[] llIIllllIIll;

    private static String lIIIIIIIIIIlllI(String lllllllllllllllIlIIlIIIIIlIlllII, String lllllllllllllllIlIIlIIIIIlIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIIIIlIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIIIIlIllllI.init(llIIllllIlII[6], secretKeySpec);
            return new String(lllllllllllllllIlIIlIIIIIlIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIIIIlIlllIl) {
            lllllllllllllllIlIIlIIIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa(C0002c c0002c, GauntletConfig gauntletConfig) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllllIlII[0]];
        enumC0003dArr[llIIllllIlII[1]] = EnumC0003d.OUTSIDE;
        this.cl = llIIllllIlII[1];
        this.ck = gauntletConfig;
    }

    private static boolean lIIIIIIIIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIIIlIIll(int i) {
        return i > 0;
    }

    private static void lIIIIIIIIIlIIII() {
        llIIllllIlII = new int[8];
        llIIllllIlII[0] = " ".length();
        llIIllllIlII[1] = (17 ^ 86) & ((88 ^ 31) ^ (-1));
        llIIllllIlII[2] = (-19492) & 56831;
        llIIllllIlII[3] = (((73 + 69) - 110) + 152) ^ (((85 + 100) - 7) + 0);
        llIIllllIlII[4] = 191 ^ 171;
        llIIllllIlII[5] = (243 ^ 165) ^ (90 ^ 104);
        llIIllllIlII[6] = "  ".length();
        llIIllllIlII[7] = "   ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        if (lIIIIIIIIIlIIIl(Inventory.getFirst(item -> {
            return Arrays.stream(this.ba.h().alching().split(llIIllllIIll[llIIllllIlII[6]])).anyMatch(str -> {
                return str.trim().equals(String.valueOf(item.getId()));
            });
        })) && lIIIIIIIIIlIIlI(Magic.canCast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY) ? 1 : 0)) {
            return llIIllllIlII[1];
        }
        if (lIIIIIIIIIlIIlI(this.ck.waitAfterAttempt() ? 1 : 0) && lIIIIIIIIIlIIll(this.cl)) {
            this.cl -= llIIllllIlII[0];
            return llIIllllIlII[0];
        } else if (lIIIIIIIIIlIIlI(Dialog.isViewingOptions() ? 1 : 0) && lIIIIIIIIIlIIlI(Dialog.hasOption(llIIllllIIll[llIIllllIlII[1]]) ? 1 : 0)) {
            String[] strArr = new String[llIIllllIlII[0]];
            strArr[llIIllllIlII[1]] = llIIllllIIll[llIIllllIlII[0]];
            Dialog.chooseOption(strArr);
            "".length();
            return llIIllllIlII[0];
        } else if (lIIIIIIIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llIIllllIlII[0];
        } else {
            int[] iArr = new int[llIIllllIlII[0]];
            iArr[llIIllllIlII[1]] = llIIllllIlII[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIIIIIIIIlIIIl(nearest)) {
                if (lIIIIIIIIIlIIlI(this.ba.G() ? 1 : 0)) {
                    i = llIIllllIlII[0];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i = llIIllllIlII[1];
                }
                nearest.interact(i);
                sleep(llIIllllIlII[3]);
                this.cl = Rand.nextInt(llIIllllIlII[4], llIIllllIlII[5]);
                return llIIllllIlII[0];
            }
            return llIIllllIlII[1];
        }
    }

    private static String lIIIIIIIIIIllIl(String lllllllllllllllIlIIlIIIIIlllIIIl, String lllllllllllllllIlIIlIIIIIlllIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlIIlIIIIIllIlllI = lllllllllllllllIlIIlIIIIIlllIIII.toCharArray();
        int lllllllllllllllIlIIlIIIIIllIllIl = llIIllllIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllllIlII[1];
        while (lIIIIIIIIIlIlII(i, length)) {
            lllllllllllllllIlIIlIIIIIllIllll.append((char) (charArray[i] ^ lllllllllllllllIlIIlIIIIIllIlllI[lllllllllllllllIlIIlIIIIIllIllIl % lllllllllllllllIlIIlIIIIIllIlllI.length]));
            "".length();
            lllllllllllllllIlIIlIIIIIllIllIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIIIIIllIllll);
    }

    private static boolean lIIIIIIIIIlIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIIlIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIIIIIIIllll() {
        llIIllllIIll = new String[llIIllllIlII[7]];
        llIIllllIIll[llIIllllIlII[1]] = lIIIIIIIIIIllIl("CxMp", "RvZSl");
        llIIllllIIll[llIIllllIlII[0]] = lIIIIIIIIIIlllI("uMc+oOUAs6E=", "HuucA");
        llIIllllIIll[llIIllllIlII[6]] = lIIIIIIIIIIlllI("vh0q0B07UVw=", "ENBfM");
    }

    static {
        lIIIIIIIIIlIIII();
        lIIIIIIIIIIllll();
    }
}
