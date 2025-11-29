package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Teleporting out", priority = 2147483646, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/n.class */
public class C0065n extends Task {
    private final /* synthetic */ SquireCerberusConfig as;
    private static /* synthetic */ String[] llIlIIllI;
    private static /* synthetic */ int[] llIlIIlll;
    private final /* synthetic */ C0000a ar;

    private static boolean lIlllIIlllI(Object obj) {
        return obj != null;
    }

    private static void lIlllIIllII() {
        llIlIIllI = new String[llIlIIlll[4]];
        llIlIIllI[llIlIIlll[0]] = lIlllIIlIIl("icySCSfqgjDykrXewk65Rg==", "ibVdG");
        llIlIIllI[llIlIIlll[1]] = lIlllIIlIlI("Pzg4Ixwd", "oJYZy");
        llIlIIllI[llIlIIlll[2]] = lIlllIIlIll("Hdev9/eVx4wcfnOWCleghg==", "GWjyt");
        llIlIIllI[llIlIIlll[3]] = lIlllIIlIlI("JCgs", "aIXye");
    }

    static {
        lIlllIIllIl();
        lIlllIIllII();
    }

    private static boolean lIlllIIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIlllIIlllI(this.ar.k()) && !lIlllIIllll(this.ar.k().y())) {
            return (lIlllIlIIII(Combat.getCurrentHealth(), this.as.forceTeleportAtHp()) && lIlllIlIIIl(Inventory.contains(item -> {
                String str = llIlIIllI[llIlIIlll[3]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            }) ? 1 : 0)) ? U() : (lIlllIlIIIl(Prayers.getPoints()) && lIlllIlIIIl(Inventory.contains(item2 -> {
                if (!lIlllIlIIIl(item2.getName().startsWith(llIlIIllI[llIlIIlll[1]]) ? 1 : 0) || lIlllIlIIlI(item2.getName().startsWith(llIlIIllI[llIlIIlll[2]]) ? 1 : 0)) {
                    ?? r0 = llIlIIlll[1];
                    "".length();
                    return (((((107 + 57) - 131) + 110) ^ (((131 + 95) - 221) + 158)) & (((((80 + 138) - 94) + 55) ^ (((28 + 106) - (-20)) + 5)) ^ (-" ".length()))) != 0 ? ((97 ^ 41) ^ (56 ^ 64)) & (((232 ^ 196) ^ (93 ^ 65)) ^ (-" ".length())) : r0;
                }
                return llIlIIlll[0];
            }) ? 1 : 0)) ? U() : llIlIIlll[0];
        }
        this.ar.a();
        return llIlIIlll[0];
    }

    private static boolean lIlllIlIIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    private boolean U() {
        Spell spell = (Spell) Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            if (lIlllIlIIlI(standard.canCast() ? 1 : 0) && lIlllIlIIlI(standard.toString().toLowerCase().contains(llIlIIllI[llIlIIlll[0]]) ? 1 : 0)) {
                ?? r0 = llIlIIlll[1];
                "".length();
                return (((83 ^ 30) ^ (70 ^ 14)) & (((((123 + 54) - 110) + 106) ^ (((164 + 99) - 112) + 17)) ^ (-" ".length()))) != 0 ? ((6 ^ 118) ^ (90 ^ 125)) & (((((56 + 183) - 173) + 165) ^ (((110 + 19) - (-4)) + 43)) ^ (-" ".length())) : r0;
            }
            return llIlIIlll[0];
        }).findFirst().orElse(null);
        if (!lIlllIIllll(spell)) {
            Magic.cast(spell);
            return llIlIIlll[1];
        } else if (lIlllIlIIlI(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            return llIlIIlll[1];
        } else {
            return llIlIIlll[0];
        }
    }

    private static String lIlllIIlIIl(String lIllIIIIIIlIlII, String lIllIIIIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIIIlIlIl) {
            lIllIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIlllIIllIl() {
        llIlIIlll = new int[6];
        llIlIIlll[0] = (215 ^ 132) & ((26 ^ 73) ^ (-1));
        llIlIIlll[1] = " ".length();
        llIlIIlll[2] = "  ".length();
        llIlIIlll[3] = "   ".length();
        llIlIIlll[4] = (134 ^ 166) ^ (87 ^ 115);
        llIlIIlll[5] = (((50 + 84) - (-11)) + 10) ^ (((124 + 45) - 136) + 114);
    }

    private static boolean lIlllIlIIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlllIlIIIl(int i2) {
        return i2 == 0;
    }

    private static String lIlllIIlIll(String lIllIIIIIIIIlll, String lIllIIIIIIIIllI) {
        try {
            SecretKeySpec lIllIIIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIlIIlll[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIlll[2], lIllIIIIIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIIIIlIII) {
            lIllIIIIIIIlIII.printStackTrace();
            return null;
        }
    }

    @Inject
    private C0065n(SquireCerberusConfig squireCerberusConfig, C0000a c0000a) {
        this.as = squireCerberusConfig;
        this.ar = c0000a;
    }

    private static String lIlllIIlIlI(String lIllIIIIIlIIlII, String lIllIIIIIlIlIII) {
        String lIllIIIIIlIIlII2 = new String(Base64.getDecoder().decode(lIllIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIIIlIIlll = new StringBuilder();
        char[] charArray = lIllIIIIIlIlIII.toCharArray();
        int lIllIIIIIlIIlIl = llIlIIlll[0];
        char[] charArray2 = lIllIIIIIlIIlII2.toCharArray();
        int lIllIIIIIIllllI = charArray2.length;
        int i2 = llIlIIlll[0];
        while (lIlllIlIIll(i2, lIllIIIIIIllllI)) {
            char lIllIIIIIIlllII = charArray2[i2];
            lIllIIIIIlIIlll.append((char) (lIllIIIIIIlllII ^ charArray[lIllIIIIIlIIlIl % charArray.length]));
            "".length();
            lIllIIIIIlIIlIl++;
            i2++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lIllIIIIIlIIlll);
    }
}
