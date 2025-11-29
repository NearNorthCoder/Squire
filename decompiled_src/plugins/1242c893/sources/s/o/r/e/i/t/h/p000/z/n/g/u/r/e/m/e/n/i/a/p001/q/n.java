package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Buy Herb Boxes", priority = 150, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.n  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/n.class */
public class n extends Task {
    private final /* synthetic */ Client an;
    private static /* synthetic */ String[] lIIIlIIlIlIII;
    private final /* synthetic */ SquireNightmareZoneConfig am;
    private static /* synthetic */ int[] lIIIlIIllIllI;
    private final /* synthetic */ SquireNightmareZone al;

    private static void lIIlllllIlIIllI() {
        lIIIlIIllIllI = new int[13];
        lIIIlIIllIllI[0] = (60 ^ 119) & ((52 ^ 127) ^ (-1));
        lIIIlIIllIllI[1] = " ".length();
        lIIIlIIllIllI[2] = (((12 + 107) - 5) + 28) ^ (((65 + 67) - 39) + 46);
        lIIIlIIllIllI[3] = (-20613) & 24573;
        lIIIlIIllIllI[4] = (79 ^ 74) ^ (0 ^ 10);
        lIIIlIIllIllI[5] = (-20674) & 30173;
        lIIIlIIllIllI[6] = (((147 ^ 159) + (((107 + 29) - 79) + 70)) - (223 ^ 197)) + (33 ^ 124);
        lIIIlIIllIllI[7] = "  ".length();
        lIIIlIIllIllI[8] = "   ".length();
        lIIIlIIllIllI[9] = 190 ^ 186;
        lIIIlIIllIllI[10] = (16 ^ 64) ^ (79 ^ 25);
        lIIIlIIllIllI[11] = 98 ^ 101;
        lIIIlIIllIllI[12] = (((120 + 97) - 113) + 45) ^ (((106 + 63) - 92) + 80);
    }

    private static boolean lIIlllllIlIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        if (!lIIlllllIlIIlll(this.am.herbBox() ? 1 : 0) && !lIIlllllIlIlIII(this.an.isInInstancedRegion() ? 1 : 0)) {
            String[] strArr = new String[lIIIlIIllIllI[1]];
            strArr[lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[0]];
            List all = Inventory.getAll(strArr);
            if (lIIlllllIlIlIIl(Inventory.getFreeSlots(), lIIIlIIllIllI[2]) && lIIlllllIlIIlll(all.size())) {
                return lIIIlIIllIllI[0];
            }
            if (lIIlllllIlIlIlI(all.size())) {
                Predicate predicate = item -> {
                    return item.getName().startsWith(lIIIlIIlIlIII[lIIIlIIllIllI[10]]);
                };
                String[] strArr2 = new String[lIIIlIIllIllI[1]];
                strArr2[lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[1]];
                Inventory.doActions(predicate, strArr2);
                return lIIIlIIllIllI[1];
            }
            int varbitValue = Static.getClient().getVarbitValue(lIIIlIIllIllI[3]);
            if (!lIIlllllIlIlIll(varbitValue, lIIIlIIllIllI[4]) && !lIIlllllIlIlIIl(Vars.getVarp(b.y), lIIIlIIllIllI[5] * (lIIIlIIllIllI[4] - varbitValue))) {
                int varbitValue2 = Static.getClient().getVarbitValue(b.f0s);
                int varbitValue3 = Static.getClient().getVarbitValue(b.t);
                if (!lIIlllllIlIlIll(varbitValue2 + this.al.a(), this.am.overload()) || lIIlllllIlIlIIl(varbitValue3 + this.al.b(), this.am.absorption())) {
                    return lIIIlIIllIllI[0];
                }
                Widget widget = Widgets.get(lIIIlIIllIllI[6], lIIIlIIllIllI[1], lIIIlIIllIllI[1]);
                if (lIIlllllIlIllII(widget) && !lIIlllllIlIIlll(widget.isVisible() ? 1 : 0)) {
                    Widget widget2 = Widgets.get(lIIIlIIllIllI[6], b.o, b.r);
                    if (lIIlllllIlIllIl(widget2)) {
                        return lIIIlIIllIllI[0];
                    }
                    widget2.interact(lIIIlIIlIlIII[lIIIlIIllIllI[2]]);
                    return lIIIlIIllIllI[1];
                }
                System.out.println(lIIIlIIlIlIII[lIIIlIIllIllI[7]]);
                String[] strArr3 = new String[lIIIlIIllIllI[1]];
                strArr3[lIIIlIIllIllI[0]] = lIIIlIIlIlIII[lIIIlIIllIllI[8]];
                TileObject nearest = TileObjects.getNearest(strArr3);
                if (lIIlllllIlIllIl(nearest)) {
                    return lIIIlIIllIllI[0];
                }
                nearest.interact(lIIIlIIlIlIII[lIIIlIIllIllI[9]]);
                return lIIIlIIllIllI[1];
            }
            return lIIIlIIllIllI[0];
        }
        return lIIIlIIllIllI[0];
    }

    private static boolean lIIlllllIlIlIII(int i) {
        return i != 0;
    }

    private static boolean lIIlllllIlIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllIlIlIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIllllIlllllll(String lllllllllllllllIIIIllllIlIllIlll, String lllllllllllllllIIIIllllIlIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIllllIlIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIllllIlIlllIIl.init(lIIIlIIllIllI[7], secretKeySpec);
            return new String(lllllllllllllllIIIIllllIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIlIlllIII) {
            lllllllllllllllIIIIllllIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlIlIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlllllIlIIllI();
        lIIlllllIIIIIII();
    }

    private static void lIIlllllIIIIIII() {
        lIIIlIIlIlIII = new String[lIIIlIIllIllI[11]];
        lIIIlIIlIlIII[lIIIlIIllIllI[0]] = lIIllllIlllllIl("OggDAUcQAgk=", "rmqcg");
        lIIIlIIlIlIII[lIIIlIIllIllI[1]] = lIIllllIlllllIl("Mzg5LmoQNTs=", "qYWEG");
        lIIIlIIlIlIII[lIIIlIIllIllI[7]] = lIIllllIlllllIl("JyoCETYEYw8Fcx42Cho=", "pCfvS");
        lIIIlIIlIlIII[lIIIlIIllIllI[8]] = lIIllllIllllllI("nkjAqGNRAKaLzE+oqLZVew==", "THYjG");
        lIIIlIIlIlIII[lIIIlIIllIllI[9]] = lIIllllIlllllll("lnp2OLs8yL8=", "gKmFZ");
        lIIIlIIlIlIII[lIIIlIIllIllI[2]] = lIIllllIllllllI("CR2oTORknA0=", "jwLEL");
        lIIIlIIlIlIII[lIIIlIIllIllI[10]] = lIIllllIllllllI("cpQVh25HvmaqaXjF3WErpA==", "vosQf");
    }

    private static String lIIllllIllllllI(String lllllllllllllllIIIIllllIlIIlIIlI, String lllllllllllllllIIIIllllIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIllI[12]), "DES");
            Cipher lllllllllllllllIIIIllllIlIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIllllIlIIlIlII.init(lIIIlIIllIllI[7], secretKeySpec);
            return new String(lllllllllllllllIIIIllllIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIlIIlIIll) {
            lllllllllllllllIIIIllllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.al = squireNightmareZone;
        this.am = squireNightmareZoneConfig;
        this.an = client;
    }

    private static boolean lIIlllllIlIIlll(int i) {
        return i == 0;
    }

    private static String lIIllllIlllllIl(String lllllllllllllllIIIIllllIlIlIIlll, String lllllllllllllllIIIIllllIlIlIIllI) {
        String lllllllllllllllIIIIllllIlIlIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIllllIlIlIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIllllIlIlIIllI.toCharArray();
        int lllllllllllllllIIIIllllIlIlIIIll = lIIIlIIllIllI[0];
        char[] charArray2 = lllllllllllllllIIIIllllIlIlIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIllIllI[0];
        while (lIIlllllIlIlIIl(i, length)) {
            lllllllllllllllIIIIllllIlIlIIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIllllIlIlIIIll % charArray.length]));
            "".length();
            lllllllllllllllIIIIllllIlIlIIIll++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIllllIlIlIIlIl);
    }

    private static boolean lIIlllllIlIlIlI(int i) {
        return i > 0;
    }
}
