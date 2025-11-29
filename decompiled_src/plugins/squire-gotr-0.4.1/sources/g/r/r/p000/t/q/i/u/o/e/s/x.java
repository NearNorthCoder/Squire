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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Leaving remains portal", priority = 5, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.x  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/x.class */
public class x extends h {
    private static /* synthetic */ String[] llIIllIlllIl;
    private static /* synthetic */ int[] llIIllIllllI;

    private static void llllllIlllIlII() {
        llIIllIllllI = new int[5];
        llIIllIllllI[0] = "   ".length();
        llIIllIllllI[1] = (150 ^ 155) & ((51 ^ 62) ^ (-1));
        llIIllIllllI[2] = " ".length();
        llIIllIllllI[3] = "  ".length();
        llIIllIllllI[4] = 139 ^ 131;
    }

    static {
        llllllIlllIlII();
        llllllIlllIIll();
    }

    private static boolean llllllIlllIlIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIllIllllI[0]];
        enumC0002cArr[llIIllIllllI[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIllIllllI[2]] = EnumC0002c.FINISHING;
        enumC0002cArr[llIIllIllllI[3]] = EnumC0002c.ACTIVATING;
    }

    private static void llllllIlllIIll() {
        llIIllIlllIl = new String[llIIllIllllI[0]];
        llIIllIlllIl[llIIllIllllI[1]] = llllllIlllIIIl("9J2R11gtamQ=", "kcoMo");
        llIIllIlllIl[llIIllIllllI[2]] = llllllIlllIIIl("CySY7zeNX3s=", "fbYcC");
        llIIllIlllIl[llIIllIllllI[3]] = llllllIlllIIlI("AYim1p/Zz+c=", "jnVdG");
    }

    private static String llllllIlllIIIl(String lllllllllllllllIlIIllIIIlIlIlIll, String lllllllllllllllIlIIllIIIlIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), llIIllIllllI[4]), "DES");
            Cipher lllllllllllllllIlIIllIIIlIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIlIlIllIl.init(llIIllIllllI[3], secretKeySpec);
            return new String(lllllllllllllllIlIIllIIIlIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIlIlIllII) {
            lllllllllllllllIlIIllIIIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static String llllllIlllIIlI(String lllllllllllllllIlIIllIIIlIIllllI, String lllllllllllllllIlIIllIIIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIllllI[3], lllllllllllllllIlIIllIIIlIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIlIIlllll) {
            lllllllllllllllIlIIllIIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllllIlllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (!llllllIlllIlIl(this.aV.g() ? 1 : 0) || llllllIlllIllI(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            return llIIllIllllI[1];
        }
        if (llllllIlllIllI(Inventory.isFull() ? 1 : 0) && llllllIlllIlll(this.aV.m(), EnumC0002c.ACTIVATING)) {
            return llIIllIllllI[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llllllIlllIlIl(tileObject.getName().equals(llIIllIlllIl[llIIllIllllI[2]]) ? 1 : 0)) {
                String str = llIIllIlllIl[llIIllIllllI[3]];
                if (llllllIlllIlIl(tileObject.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = llIIllIllllI[2];
                    "".length();
                    return 0 != 0 ? ((((138 + 178) - 130) + 8) ^ (((45 + 124) - 109) + 81)) & (((((128 + 223) - 345) + 228) ^ (((51 + 66) - (-44)) + 4)) ^ (-" ".length())) : r0;
                }
            }
            return llIIllIllllI[1];
        });
        if (llllllIllllIII(nearest)) {
            return llIIllIllllI[1];
        }
        nearest.interact(llIIllIlllIl[llIIllIllllI[1]]);
        return llIIllIllllI[2];
    }

    private static boolean llllllIllllIII(Object obj) {
        return obj == null;
    }
}
