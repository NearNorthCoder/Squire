package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Eating", priority = 501)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aq  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aq.class */
public class aq extends Task {
    private static /* synthetic */ String[] lllIlllIIIIl;
    private static final /* synthetic */ Logger ej;
    private final /* synthetic */ SquireNightmarePlugin el;
    private final /* synthetic */ C0011h em;
    private static /* synthetic */ int[] lllIlllIIIlI;
    private final /* synthetic */ SquireNightmareConfig ek;

    private static boolean lIIIllIllIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIllIlIlll(Object obj) {
        return obj != null;
    }

    private static String lIIIllIllIIlllI(String lllllllllllllllIIllIIlIlIIllllIl, String lllllllllllllllIIllIIlIlIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIlIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIlIIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIlIIllllll.init(lllIlllIIIlI[3], lllllllllllllllIIllIIlIlIlIIIIII);
            return new String(lllllllllllllllIIllIIlIlIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIlIIlllllI) {
            lllllllllllllllIIllIIlIlIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIlllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIllIlIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0144, code lost:
        if (lIIIllIllIlIlII(r0.hasAction(r1) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (!lIIIllIllIlIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIIllIllIlIlIl(this.el.aq() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIIllIllIlIllI(d)) {
                return lllIlllIIIlI[0];
            }
            String[] strArr = new String[lllIlllIIIlI[1]];
            strArr[lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[0]];
            if (lIIIllIllIlIlII(d.hasAction(strArr) ? 1 : 0)) {
                int[] iArr = new int[lllIlllIIIlI[1]];
                iArr[lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                if (lIIIllIllIlIlIl(Inventory.contains(iArr) ? 1 : 0) && lIIIllIllIlIlll(this.em.aH()) && lIIIllIllIllIII(lIIIllIllIlIIll(Combat.getHealthPercent(), 100.0d))) {
                    int[] iArr2 = new int[lllIlllIIIlI[1]];
                    iArr2[lllIlllIIIlI[0]] = lllIlllIIIlI[2];
                    Item first = Inventory.getFirst(iArr2);
                    if (lIIIllIllIlIlll(first)) {
                        ej.info(lllIlllIIIIl[lllIlllIIIlI[1]]);
                        first.interact(lllIlllIIIIl[lllIlllIIIlI[3]]);
                        sleep(lllIlllIIIlI[4]);
                        return lllIlllIIIlI[1];
                    }
                }
            }
            String[] strArr2 = new String[lllIlllIIIlI[1]];
            strArr2[lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[4]];
            if (lIIIllIllIlIlIl(d.hasAction(strArr2) ? 1 : 0)) {
                return lllIlllIIIlI[0];
            }
            Item first2 = Inventory.getFirst(item -> {
                String str = lllIlllIIIIl[lllIlllIIIlI[21]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIIIllIllIlIlll(first2)) {
                if (lIIIllIllIlIlII(cD() ? 1 : 0)) {
                    String[] strArr3 = new String[lllIlllIIIlI[1]];
                    strArr3[lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[5]];
                }
                if (lIIIllIllIllIII(lIIIllIllIlIIll(Combat.getHealthPercent(), this.ek.restoreHealthPercentBetweenPhase()))) {
                    String str = lllIlllIIIIl[lllIlllIIIlI[6]];
                    Object[] objArr = new Object[lllIlllIIIlI[1]];
                    objArr[lllIlllIIIlI[0]] = Integer.valueOf(this.ek.restoreHealthPercentBetweenPhase());
                    Log.info(str, objArr);
                    first2.interact(lllIlllIIIIl[lllIlllIIIlI[7]]);
                    sleep(lllIlllIIIlI[4]);
                    return lllIlllIIIlI[1];
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIIllIllIlIlIl(npc.getName().equals(lllIlllIIIIl[lllIlllIIIlI[19]]) ? 1 : 0) && lIIIllIllIlllII(npc.getAnimation(), lllIlllIIIlI[20])) {
                        ?? r0 = lllIlllIIIlI[1];
                        "".length();
                        return "   ".length() <= 0 ? ((100 ^ 7) ^ (112 ^ 69)) & (((199 ^ 192) ^ (47 ^ 126)) ^ (-" ".length())) : r0;
                    }
                    return lllIlllIIIlI[0];
                });
                if (lIIIllIllIllIIl(d().getId(), lllIlllIIIlI[8]) && lIIIllIllIlIlll(nearest) && lIIIllIllIllIII(lIIIllIllIlIIll(Combat.getHealthPercent(), this.ek.restoreHealthPercentBetweenPhase()))) {
                    ej.info(lllIlllIIIIl[lllIlllIIIlI[9]]);
                    first2.interact(lllIlllIIIIl[lllIlllIIIlI[10]]);
                    sleep(lllIlllIIIlI[4]);
                    return lllIlllIIIlI[1];
                } else if (lIIIllIllIllIlI(Combat.getCurrentHealth(), this.ek.eatAt())) {
                    ej.info(lllIlllIIIIl[lllIlllIIIlI[11]], first2.getName(), Integer.valueOf(this.ek.eatAt()));
                    first2.interact(lllIlllIIIIl[lllIlllIIIlI[12]]);
                    sleep(lllIlllIIIlI[4]);
                    return lllIlllIIIlI[1];
                }
            }
            TileItem aH = this.em.aH();
            if (lIIIllIllIlIlll(aH) && lIIIllIllIllIll(Inventory.getFreeSlots(), lllIlllIIIlI[1])) {
                if (lIIIllIllIlIlIl(cD() ? 1 : 0)) {
                    ej.info(lllIlllIIIIl[lllIlllIIIlI[13]], aH.getName(), Integer.valueOf(aH.distanceTo(Players.getLocal())));
                    aH.interact(lllIlllIIIIl[lllIlllIIIlI[14]]);
                    sleep(lllIlllIIIlI[3]);
                    return lllIlllIIIlI[1];
                } else if (lIIIllIllIlIlII(aH.distanceTo(Players.getLocal()))) {
                    ej.info(lllIlllIIIIl[lllIlllIIIlI[15]], aH.getName());
                    aH.interact(lllIlllIIIIl[lllIlllIIIlI[16]]);
                    sleep(lllIlllIIIlI[3]);
                    return lllIlllIIIlI[1];
                }
            }
            return lllIlllIIIlI[0];
        }
        return lllIlllIIIlI[0];
    }

    private static boolean lIIIllIllIlIlII(int i) {
        return i == 0;
    }

    private static String lIIIllIllIlIIII(String lllllllllllllllIIllIIlIlIIIllIII, String lllllllllllllllIIllIIlIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIlIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), lllIlllIIIlI[10]), "DES");
            Cipher lllllllllllllllIIllIIlIlIIIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIlIIIllIlI.init(lllIlllIIIlI[3], lllllllllllllllIIllIIlIlIIIllIll);
            return new String(lllllllllllllllIIllIIlIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIlIIIllIIl) {
            lllllllllllllllIIllIIlIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aq(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        this.ek = squireNightmareConfig;
        this.el = squireNightmarePlugin;
        this.em = c0011h;
    }

    private NPC d() {
        return SquireNightmarePlugin.d();
    }

    private static boolean lIIIllIllIllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIllIllIllIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean cD() {
        if (lIIIllIllIlIllI(d())) {
            return lllIlllIIIlI[0];
        }
        NPC d = d();
        String[] strArr = new String[lllIlllIIIlI[1]];
        strArr[lllIlllIIIlI[0]] = lllIlllIIIIl[lllIlllIIIlI[17]];
        if (!lIIIllIllIlIlII(d.hasAction(strArr) ? 1 : 0) || lIIIllIllIlllII(d().getAnimation(), lllIlllIIIlI[18])) {
            ?? r0 = lllIlllIIIlI[1];
            "".length();
            return (-((72 ^ 5) ^ (197 ^ 140))) >= 0 ? ((((149 + 119) - 134) + 84) ^ (((136 + 132) - 207) + 95)) & (((((84 + 172) - 178) + 117) ^ (((77 + 99) - 152) + 109)) ^ (-" ".length())) : r0;
        }
        return lllIlllIIIlI[0];
    }

    private static boolean lIIIllIllIlIlIl(int i) {
        return i != 0;
    }

    private static void lIIIllIllIlIIIl() {
        lllIlllIIIIl = new String[lllIlllIIIlI[22]];
        lllIlllIIIIl[lllIlllIIIlI[0]] = lIIIllIllIIlllI("lsdf5v41+7E=", "UGFbZ");
        lllIlllIIIIl[lllIlllIIIlI[1]] = lIIIllIllIIllll("MDYALgoSdwAyChR3AChEEyIYK0QdMhUrEB0=", "uWtGd");
        lllIlllIIIIl[lllIlllIIIlI[3]] = lIIIllIllIIlllI("cGfAm9E3Vl8=", "zpUpI");
        lllIlllIIIIl[lllIlllIIIlI[4]] = lIIIllIllIIlllI("Fb/mR13HUqs=", "OktOl");
        lllIlllIIIIl[lllIlllIIIlI[5]] = lIIIllIllIIllll("Fg07MDk8", "WyOQZ");
        lllIlllIIIIl[lllIlllIIIlI[6]] = lIIIllIllIIllll("DikCIjgsaBAkOS9oBSI4KC1WPDNrIBc9M2ssGTw4PyEbLnprKRgvdjwtUTkzayoTJzk8aA02diM4WA==", "KHvKV");
        lllIlllIIIIl[lllIlllIIIlI[7]] = lIIIllIllIlIIII("4l2mBAINihI=", "LTEkT");
        lllIlllIIIIl[lllIlllIIIlI[9]] = lIIIllIllIIllll("ABBZHTVPGVkULxZYFBI+ClgQB3obEAscLwgQWRI0C1gOFnoIFw0SegoZDVM0AA9ZPxUj", "oxysZ");
        lllIlllIIIIl[lllIlllIIIlI[10]] = lIIIllIllIIlllI("zeKbmDdAFLE=", "WRXlA");
        lllIlllIIIIl[lllIlllIIIlI[11]] = lIIIllIllIlIIII("e8hI8UX2q699MlMdZgwQpuQ+jL76i26lRi10nbM70ncD5LjhiaM0RGMD+ICRcjYJD8GlFOXhupQ=", "RKBnq");
        lllIlllIIIIl[lllIlllIIIlI[12]] = lIIIllIllIIllll("CxE6", "NpNvv");
        lllIlllIIIIl[lllIlllIIIlI[13]] = lIIIllIllIIllll("IAIfJxA3EQI7HnIBBDodaEcQKFk/Dg94HzsAAyFZIQ4FNhxyEA51ETMRDnULPQgGdFkbE0wmWSkaSyEQPgIYdRglBhJ5WTMJD3UJPApLPApyExk0FyEOHzwWPA4FMlc=", "RgkUy");
        lllIlllIIIIl[lllIlllIIIlI[14]] = lIIIllIllIIllll("Bw46DQ==", "SoQhK");
        lllIlllIIIIl[lllIlllIIIlI[15]] = lIIIllIllIIlllI("yo6H6n04JZ8XmJEw8kMPbUmgwsHSMKxxt1vKi3MPIY25O1Gzrv/kTJMGt82Hi82lq1isAz2omjE=", "InwEZ");
        lllIlllIIIIl[lllIlllIIIlI[16]] = lIIIllIllIIllll("GgslLw==", "NjNJC");
        lllIlllIIIIl[lllIlllIIIlI[17]] = lIIIllIllIIllll("DDgXIwc6Mw==", "HQdWr");
        lllIlllIIIIl[lllIlllIIIlI[19]] = lIIIllIllIIllll("PwkDAz4bBAoNKx4=", "leffN");
        lllIlllIIIIl[lllIlllIIIlI[21]] = lIIIllIllIIllll("FiUZ", "SDmdC");
    }

    private static String lIIIllIllIIllll(String lllllllllllllllIIllIIlIlIIlIllIl, String lllllllllllllllIIllIIlIlIIlIllII) {
        String lllllllllllllllIIllIIlIlIIlIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIIlIlIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIlIlIIlIllII.toCharArray();
        int lllllllllllllllIIllIIlIlIIlIlIIl = lllIlllIIIlI[0];
        char[] charArray2 = lllllllllllllllIIllIIlIlIIlIllIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIIIlI[0];
        while (lIIIllIllIllIlI(i, length)) {
            char lllllllllllllllIIllIIlIlIIlIlllI = charArray2[i];
            lllllllllllllllIIllIIlIlIIlIlIll.append((char) (lllllllllllllllIIllIIlIlIIlIlllI ^ charArray[lllllllllllllllIIllIIlIlIIlIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIIlIlIIlIlIIl++;
            i++;
            "".length();
            if (((((40 + 46) - 79) + 130) ^ (((128 + 56) - 179) + 136)) != ((((23 + 4) - (-37)) + 108) ^ (((20 + 117) - 80) + 111))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIIlIlIll);
    }

    private static void lIIIllIllIlIIlI() {
        lllIlllIIIlI = new int[23];
        lllIlllIIIlI[0] = ((((3 + 79) - (-42)) + 16) ^ (((89 + 13) - (-54)) + 28)) & (((((96 + 55) - 125) + 148) ^ (((139 + 152) - 203) + 66)) ^ (-" ".length()));
        lllIlllIIIlI[1] = " ".length();
        lllIlllIIIlI[2] = (-((-13091) & 30515)) & (-6147) & 23935;
        lllIlllIIIlI[3] = "  ".length();
        lllIlllIIIlI[4] = "   ".length();
        lllIlllIIIlI[5] = (((64 + 9) - (-23)) + 59) ^ (((31 + 82) - 60) + 106);
        lllIlllIIIlI[6] = 57 ^ 60;
        lllIlllIIIlI[7] = (14 ^ 88) ^ (244 ^ 164);
        lllIlllIIIlI[8] = (-((-15107) & 32619)) & (-1) & 28666;
        lllIlllIIIlI[9] = 141 ^ 138;
        lllIlllIIIlI[10] = 67 ^ 75;
        lllIlllIIIlI[11] = 158 ^ 151;
        lllIlllIIIlI[12] = 150 ^ 156;
        lllIlllIIIlI[13] = 60 ^ 55;
        lllIlllIIIlI[14] = 66 ^ 78;
        lllIlllIIIlI[15] = 63 ^ 50;
        lllIlllIIIlI[16] = (111 ^ 63) ^ (234 ^ 180);
        lllIlllIIIlI[17] = 36 ^ 43;
        lllIlllIIIlI[18] = (-17441) & 26044;
        lllIlllIIIlI[19] = (((149 + 152) - 156) + 8) ^ (((125 + 127) - 187) + 72);
        lllIlllIIIlI[20] = (-((-8523) & 30031)) & (-2177) & 32255;
        lllIlllIIIlI[21] = (2 ^ 109) ^ (13 ^ 115);
        lllIlllIIIlI[22] = (219 ^ 149) ^ (108 ^ 48);
    }

    private static boolean lIIIllIllIllIII(int i) {
        return i < 0;
    }

    static {
        lIIIllIllIlIIlI();
        lIIIllIllIlIIIl();
        ej = LoggerFactory.getLogger(aq.class);
    }

    private static int lIIIllIllIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
