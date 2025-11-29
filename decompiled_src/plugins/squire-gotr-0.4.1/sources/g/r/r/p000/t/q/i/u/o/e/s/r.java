package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Leaving the altar", blocking = true, priority = 5)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.r  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/r.class */
public class r extends h {
    private static /* synthetic */ int[] llIlIIIIIlII;
    private static /* synthetic */ String[] llIlIIIIIIlI;

    private static boolean lIIIIIIIIIlIIII(Object obj) {
        return obj != null;
    }

    private static String lIIIIIIIIIIIlll(String lllllllllllllllIlIIlIlIlIlIlIIIl, String lllllllllllllllIlIIlIlIlIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIlIlIIll.init(llIlIIIIIlII[3], lllllllllllllllIlIIlIlIlIlIlIlII);
            return new String(lllllllllllllllIlIIlIlIlIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIlIlIlIIlI) {
            lllllllllllllllIlIIlIlIlIlIlIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIlIIIIIlII[0]];
        enumC0002cArr[llIlIIIIIlII[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIlIIIIIlII[2]] = EnumC0002c.FINISHING;
        enumC0002cArr[llIlIIIIIlII[3]] = EnumC0002c.OUTSIDE;
    }

    private static boolean lIIIIIIIIIIlIll(int i) {
        return i <= 0;
    }

    private static void lIIIIIIIIIIlIlI() {
        llIlIIIIIlII = new int[5];
        llIlIIIIIlII[0] = "   ".length();
        llIlIIIIIlII[1] = ((65 ^ 114) ^ (210 ^ 181)) & (((((223 + 82) - 197) + 121) ^ (((14 + 2) - (-109)) + 52)) ^ (-" ".length()));
        llIlIIIIIlII[2] = " ".length();
        llIlIIIIIlII[3] = "  ".length();
        llIlIIIIIlII[4] = (-5889) & 32767;
    }

    private static boolean lIIIIIIIIIIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        int i;
        int[] iArr = new int[llIlIIIIIlII[2]];
        iArr[llIlIIIIIlII[1]] = llIlIIIIIlII[4];
        if (!lIIIIIIIIIIlIll(Inventory.getCount(iArr)) || lIIIIIIIIIIllII(this.aV.S(), Static.getClient().getTickCount())) {
            i = llIlIIIIIlII[2];
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIlIIIIIlII[1];
        }
        if (!lIIIIIIIIIIllIl(i) || lIIIIIIIIIIlllI(this.aV.g() ? 1 : 0)) {
            return llIlIIIIIlII[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIIIIIIIIIlllI(tileObject.getName().contains(llIlIIIIIIlI[llIlIIIIIlII[2]]) ? 1 : 0) && lIIIIIIIIIIlllI(tileObject.hasAction(str -> {
                if (lIIIIIIIIIlIIII(str) && lIIIIIIIIIIlllI(str.equals(llIlIIIIIIlI[llIlIIIIIlII[3]]) ? 1 : 0)) {
                    ?? r0 = llIlIIIIIlII[2];
                    "".length();
                    return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIIIIIlII[1];
            }) ? 1 : 0)) {
                ?? r0 = llIlIIIIIlII[2];
                "".length();
                return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIIIlII[1];
        });
        if (lIIIIIIIIIIllll(nearest)) {
            return llIlIIIIIlII[1];
        }
        nearest.interact(llIlIIIIIIlI[llIlIIIIIlII[1]]);
        b(llIlIIIIIlII[2], () -> {
            return Players.getLocal().isMoving();
        });
        return llIlIIIIIlII[2];
    }

    static {
        lIIIIIIIIIIlIlI();
        lIIIIIIIIIIlIIl();
    }

    private static String lIIIIIIIIIIIllI(String lllllllllllllllIlIIlIlIlIlIIIIIl, String lllllllllllllllIlIIlIlIlIlIIIIII) {
        String lllllllllllllllIlIIlIlIlIlIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIlIIllllll = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIlIIlllllI = lllllllllllllllIlIIlIlIlIlIIIIII.toCharArray();
        int lllllllllllllllIlIIlIlIlIIllllIl = llIlIIIIIlII[1];
        char[] charArray = lllllllllllllllIlIIlIlIlIlIIIIIl2.toCharArray();
        int length = charArray.length;
        int i = llIlIIIIIlII[1];
        while (lIIIIIIIIIlIIIl(i, length)) {
            lllllllllllllllIlIIlIlIlIIllllll.append((char) (charArray[i] ^ lllllllllllllllIlIIlIlIlIIlllllI[lllllllllllllllIlIIlIlIlIIllllIl % lllllllllllllllIlIIlIlIlIIlllllI.length]));
            "".length();
            lllllllllllllllIlIIlIlIlIIllllIl++;
            i++;
            "".length();
            if ((((((62 + 128) - 171) + 130) ^ (((64 + 40) - (-10)) + 66)) & (((251 ^ 140) ^ (59 ^ 109)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlIlIIllllll);
    }

    private static boolean lIIIIIIIIIIlllI(int i) {
        return i != 0;
    }

    private static void lIIIIIIIIIIlIIl() {
        llIlIIIIIIlI = new String[llIlIIIIIlII[0]];
        llIlIIIIIIlI[llIlIIIIIlII[1]] = lIIIIIIIIIIIllI("PAMS", "ipweo");
        llIlIIIIIIlI[llIlIIIIIlII[2]] = lIIIIIIIIIIIlll("qr49seXsJH4=", "wGooU");
        llIlIIIIIIlI[llIlIIIIIlII[3]] = lIIIIIIIIIIIllI("Lxof", "zizjO");
    }

    private static boolean lIIIIIIIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIIIIIIllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIIIIIIIllll(Object obj) {
        return obj == null;
    }
}
