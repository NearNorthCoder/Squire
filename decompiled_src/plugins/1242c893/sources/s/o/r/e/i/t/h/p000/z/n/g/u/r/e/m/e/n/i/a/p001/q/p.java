package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Enter Dream", priority = 1, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.p  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/p.class */
public class p extends Task {
    private final /* synthetic */ SquireNightmareZone ar;
    private final /* synthetic */ SquireNightmareZoneConfig as;
    private static /* synthetic */ String[] lIIIlIIIIllll;
    private static /* synthetic */ int[] lIIIlIIIlIIII;
    private final /* synthetic */ Client at;

    private static void lIIllllIIlIllIl() {
        lIIIlIIIIllll = new String[lIIIlIIIlIIII[8]];
        lIIIlIIIIllll[lIIIlIIIlIIII[0]] = lIIllllIIlIlIlI("jw8S9g6xFwfsBUZ/wxtL3UP4k7DQNrLQDl/50nZD2mdxi0lnFMMrXQ==", "XzDBX");
        lIIIlIIIIllll[lIIIlIIIlIIII[2]] = lIIllllIIlIlIll("CykEMgInKRd3FDwiETpR", "NGpWp");
        lIIIlIIIIllll[lIIIlIIIlIIII[5]] = lIIllllIIlIlIlI("U9h3S/5aJTM=", "uNhVQ");
        lIIIlIIIIllll[lIIIlIIIlIIII[6]] = lIIllllIIlIllII("oDbxV1GwZYs=", "cMDrn");
        lIIIlIIIIllll[lIIIlIIIlIIII[7]] = lIIllllIIlIlIlI("Ungby1FSeMg=", "yFAdL");
    }

    private static boolean lIIllllIIllIIII(int i) {
        return i == 0;
    }

    private static boolean lIIllllIIlIllll(int i) {
        return i != 0;
    }

    private static String lIIllllIIlIlIlI(String lllllllllllllllIIIlIIIIllIlIIllI, String lllllllllllllllIIIlIIIIllIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIIlIIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIllIlIIlll) {
            lllllllllllllllIIIlIIIIllIlIIlll.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ar = squireNightmareZone;
        this.as = squireNightmareZoneConfig;
        this.at = client;
    }

    private static boolean lIIllllIIllIIlI(Object obj) {
        return obj != null;
    }

    private static void lIIllllIIlIlllI() {
        lIIIlIIIlIIII = new int[10];
        lIIIlIIIlIIII[0] = (135 ^ 169) & ((159 ^ 177) ^ (-1));
        lIIIlIIIlIIII[1] = 181 ^ 175;
        lIIIlIIIlIIII[2] = " ".length();
        lIIIlIIIlIIII[3] = (41 ^ 64) ^ (121 ^ 14);
        lIIIlIIIlIIII[4] = -" ".length();
        lIIIlIIIlIIII[5] = "  ".length();
        lIIIlIIIlIIII[6] = "   ".length();
        lIIIlIIIlIIII[7] = (((131 + 19) - 128) + 114) ^ (((39 + 26) - (-31)) + 44);
        lIIIlIIIlIIII[8] = (((57 + 95) - 100) + 131) ^ (((100 + 176) - 176) + 78);
        lIIIlIIIlIIII[9] = (106 ^ 10) ^ (221 ^ 181);
    }

    private static String lIIllllIIlIllII(String lllllllllllllllIIIlIIIIllIIllIIl, String lllllllllllllllIIIlIIIIllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIIlIIII[5], lllllllllllllllIIIlIIIIllIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIllIIllIlI) {
            lllllllllllllllIIIlIIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIllllIIlIlIll(String lllllllllllllllIIIlIIIIllIIIlIIl, String lllllllllllllllIIIlIIIIllIIIlIII) {
        String lllllllllllllllIIIlIIIIllIIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIllIIIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIIlIIIIllIIIlIII.toCharArray();
        int lllllllllllllllIIIlIIIIllIIIIlIl = lIIIlIIIlIIII[0];
        char[] charArray2 = lllllllllllllllIIIlIIIIllIIIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIIlIIII[0];
        while (lIIllllIIllIIIl(i, length)) {
            char lllllllllllllllIIIlIIIIllIIIlIlI = charArray2[i];
            lllllllllllllllIIIlIIIIllIIIIlll.append((char) (lllllllllllllllIIIlIIIIllIIIlIlI ^ charArray[lllllllllllllllIIIlIIIIllIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIlIIIIllIIIIlIl++;
            i++;
            "".length();
            if ((38 ^ 34) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIlIIIIllIIIIlll);
    }

    private static boolean lIIllllIIllIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    public boolean run() {
        if (!lIIllllIIlIllll(this.at.isInInstancedRegion() ? 1 : 0) && !lIIllllIIllIIII(Static.getClient().getVarbitValue(b.u)) && !lIIllllIIllIIIl(this.ar.b(), this.as.absorption()) && !lIIllllIIllIIIl(this.ar.a(), this.as.overload())) {
            if (lIIllllIIllIIIl(Static.getClient().getVarbitValue(b.x), lIIIlIIIlIIII[1])) {
                Log.error(lIIIlIIIIllll[lIIIlIIIlIIII[0]]);
                Squire.stop();
                return lIIIlIIIlIIII[2];
            } else if (lIIllllIIllIIII(Movement.shouldWalk() ? 1 : 0)) {
                return lIIIlIIIlIIII[0];
            } else {
                Widget widget = Widgets.get(b.v, b.w);
                if (lIIllllIIllIIlI(widget) && lIIllllIIlIllll(widget.isVisible() ? 1 : 0)) {
                    widget.interact(lIIIlIIIlIIII[0], lIIIlIIIlIIII[3], lIIIlIIIlIIII[4], widget.getId());
                    System.out.println(lIIIlIIIIllll[lIIIlIIIlIIII[2]]);
                    return lIIIlIIIlIIII[2];
                }
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIllllIIlIllll(tileObject.getName().contains(lIIIlIIIIllll[lIIIlIIIlIIII[6]]) ? 1 : 0)) {
                        String[] strArr = new String[lIIIlIIIlIIII[2]];
                        strArr[lIIIlIIIlIIII[0]] = lIIIlIIIIllll[lIIIlIIIlIIII[7]];
                        if (lIIllllIIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIIIlIIIlIIII[2];
                            "".length();
                            return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIIlIIIlIIII[0];
                });
                if (lIIllllIIllIIll(nearest)) {
                    return lIIIlIIIlIIII[0];
                }
                nearest.interact(lIIIlIIIIllll[lIIIlIIIlIIII[5]]);
                return lIIIlIIIlIIII[2];
            }
        }
        return lIIIlIIIlIIII[0];
    }

    static {
        lIIllllIIlIlllI();
        lIIllllIIlIllIl();
    }
}
