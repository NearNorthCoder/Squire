package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing runes", priority = 2, blocking = true, register = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.t  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/t.class */
public class t extends h {
    private static /* synthetic */ String[] llIIlllIlllI;
    private static /* synthetic */ int[] llIIllllIIIl;

    static {
        lllllllIllllll();
        lllllllIlllIlI();
    }

    private static String lllllllIlllIII(String lllllllllllllllIlIIlIllIlllllIII, String lllllllllllllllIlIIlIllIllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllIIIl[3], lllllllllllllllIlIIlIllIlllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIlllllIIl) {
            lllllllllllllllIlIIlIllIlllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIIIll(int i, int i2) {
        return i > i2;
    }

    private static void lllllllIllllll() {
        llIIllllIIIl = new int[8];
        llIIllllIIIl[0] = 152 ^ 156;
        llIIllllIIIl[1] = ((112 ^ 119) ^ (140 ^ 161)) & (((228 ^ 131) ^ (66 ^ 15)) ^ (-" ".length()));
        llIIllllIIIl[2] = " ".length();
        llIIllllIIIl[3] = "  ".length();
        llIIllllIIIl[4] = "   ".length();
        llIIllllIIIl[5] = (-14) & 43709;
        llIIllllIIIl[6] = 92 ^ 89;
        llIIllllIIIl[7] = (214 ^ 141) ^ (65 ^ 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllllIIIl[0]];
        enumC0002cArr[llIIllllIIIl[1]] = EnumC0002c.COUNTDOWN;
        enumC0002cArr[llIIllllIIIl[2]] = EnumC0002c.ACTIVATING;
        enumC0002cArr[llIIllllIIIl[3]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIllllIIIl[4]] = EnumC0002c.FINISHING;
    }

    private static boolean llllllllIIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIIllllIIIl[2];
    }

    private static String lllllllIlllIIl(String lllllllllllllllIlIIlIlllIIIIIlIl, String lllllllllllllllIlIIlIlllIIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIIIIlII.getBytes(StandardCharsets.UTF_8)), llIIllllIIIl[7]), "DES");
            Cipher lllllllllllllllIlIIlIlllIIIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIIIIIlll.init(llIIllllIIIl[3], secretKeySpec);
            return new String(lllllllllllllllIlIIlIlllIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIIIIIllI) {
            lllllllllllllllIlIIlIlllIIIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!llllllllIIIIII(this.aW.depositRunes() ? 1 : 0) && !llllllllIIIIII(Inventory.contains(item -> {
            if (llllllllIIIIIl(item.isStackable() ? 1 : 0) && llllllllIIIIIl(item.getName().contains(llIIlllIlllI[llIIllllIIIl[2]]) ? 1 : 0)) {
                ?? r0 = llIIllllIIIl[2];
                "".length();
                return ((76 ^ 2) & ((35 ^ 109) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllllIIIl[1];
        }) ? 1 : 0) && !llllllllIIIIIl(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            int[] iArr = new int[llIIllllIIIl[2]];
            iArr[llIIllllIIIl[1]] = llIIllllIIIl[5];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (!llllllllIIIIlI(nearest) || llllllllIIIIll(nearest.distanceTo(Players.getLocal()), llIIllllIIIl[6])) {
                return llIIllllIIIl[1];
            }
            if (llllllllIIIIII(b((GameObject) nearest) ? 1 : 0)) {
                nearest.interact(llIIlllIlllI[llIIllllIIIl[1]]);
            }
            return llIIllllIIIl[2];
        }
        return llIIllllIIIl[1];
    }

    private static void lllllllIlllIlI() {
        llIIlllIlllI = new String[llIIllllIIIl[3]];
        llIIlllIlllI[llIIllllIIIl[1]] = lllllllIlllIII("KatWhUG9OZ6sYD1paHLwaA==", "CGriz");
        llIIlllIlllI[llIIllllIIIl[2]] = lllllllIlllIIl("zuXuCL0/Kh4=", "cmXRW");
    }

    private static boolean llllllllIIIIII(int i) {
        return i == 0;
    }

    private static boolean llllllllIIIIlI(Object obj) {
        return obj != null;
    }
}
