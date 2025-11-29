package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import gg.squire.mixology.overlay.MixologyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Operate levers")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.o  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/o.class */
public class o extends Task {
    private final /* synthetic */ SquireMixologyConfig Y;
    private static /* synthetic */ int[] lIIIIIIIIlIll;
    private static /* synthetic */ String[] lIIIIIIIIIllI;
    private /* synthetic */ int I = lIIIIIIIIlIll[0];
    private /* synthetic */ int J = lIIIIIIIIlIll[1];
    private /* synthetic */ int K = lIIIIIIIIlIll[2];

    private static boolean lIIlIllIIlllIIl(int i, int i2) {
        return i < i2;
    }

    @Inject
    public o(SquireMixologyConfig squireMixologyConfig) {
        this.Y = squireMixologyConfig;
    }

    private static boolean lIIlIllIIllIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllIIllllII(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIllIIllIIII() {
        lIIIIIIIIIllI = new String[lIIIIIIIIlIll[36]];
        lIIIIIIIIIllI[lIIIIIIIIlIll[3]] = lIIlIllIIIlIllI("Lw01ECQDDSZVOwMNKBI3BwZhFCQPAg==", "jcAuV");
        lIIIIIIIIIllI[lIIIIIIIIlIll[4]] = lIIlIllIIIlIlll("Y+TgFH0JFci8xOJRRA7NFg==", "lGwTp");
        lIIIIIIIIIllI[lIIIIIIIIlIll[11]] = lIIlIllIIIllIII("TNjCO/UmkLM=", "djvWl");
        lIIIIIIIIIllI[lIIIIIIIIlIll[15]] = lIIlIllIIIllIII("7piLj+0g2nt6nzYxPLKnLQ==", "PrIFk");
        lIIIIIIIIIllI[lIIIIIIIIlIll[14]] = lIIlIllIIIllIII("dKCTrtcTUmA=", "GVwpi");
        lIIIIIIIIIllI[lIIIIIIIIlIll[17]] = lIIlIllIIIlIllI("MBlQKHxCQEUofQ==", "ljztT");
        lIIIIIIIIIllI[lIIIIIIIIlIll[16]] = lIIlIllIIIllIII("ogANug5q1Go=", "jPWhC");
        lIIIIIIIIIllI[lIIIIIIIIlIll[18]] = lIIlIllIIIlIlll("IwsdYwrWzKA=", "JTMhA");
        lIIIIIIIIIllI[lIIIIIIIIlIll[19]] = lIIlIllIIIlIllI("Kz4eBDM=", "nSnpJ");
        lIIIIIIIIIllI[lIIIIIIIIlIll[20]] = lIIlIllIIIlIllI("CiEGPjY=", "OLvJO");
        lIIIIIIIIIllI[lIIIIIIIIlIll[22]] = lIIlIllIIIlIllI("PCsSBik=", "yFbrP");
        lIIIIIIIIIllI[lIIIIIIIIlIll[29]] = lIIlIllIIIllIII("0J74mH5Y7G4=", "fFHAp");
        lIIIIIIIIIllI[lIIIIIIIIlIll[30]] = lIIlIllIIIlIlll("0bXlByPR67I=", "qDpAQ");
        lIIIIIIIIIllI[lIIIIIIIIlIll[31]] = lIIlIllIIIlIllI("Bz8xJA==", "QVPHS");
        lIIIIIIIIIllI[lIIIIIIIIlIll[32]] = lIIlIllIIIlIlll("G7iQZboMuPA=", "BDMtp");
        lIIIIIIIIIllI[lIIIIIIIIlIll[33]] = lIIlIllIIIllIII("9xYAFmcI/Ac=", "LEEaE");
        lIIIIIIIIIllI[lIIIIIIIIlIll[34]] = lIIlIllIIIllIII("3HeX4yV6mJw=", "LzuVN");
        lIIIIIIIIIllI[lIIIIIIIIlIll[35]] = lIIlIllIIIlIllI("Cho1AiY3Dw==", "YnToO");
    }

    private static boolean lIIlIllIIllIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllIIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIllIIllIlII(int i) {
        return i != 0;
    }

    private static boolean lIIlIllIIllllIl(int i) {
        return i > 0;
    }

    private static boolean lIIlIllIIlllIlI(Object obj) {
        return obj == null;
    }

    private static String lIIlIllIIIlIlll(String lllllllllllllllIIlIIIIIIIIIIllll, String lllllllllllllllIIlIIIIIIIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIll[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIlIll[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIIIIlIIII) {
            lllllllllllllllIIlIIIIIIIIIlIIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIllIIllIIIl();
        lIIlIllIIllIIII();
    }

    private static boolean lIIlIllIIlllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIllIIlllIll(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIllIIIllIII(String lllllllllllllllIIlIIIIIIIIIIIIlI, String lllllllllllllllIIlIIIIIIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIIlIll[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIIIIIIIll) {
            lllllllllllllllIIlIIIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIIlIllIIIlIllI(String lllllllllllllllIIIllllllllllIIlI, String lllllllllllllllIIIllllllllllIIIl) {
        String lllllllllllllllIIIllllllllllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllllllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllllllllIIII = new StringBuilder();
        char[] lllllllllllllllIIIlllllllllIllll = lllllllllllllllIIIllllllllllIIIl.toCharArray();
        int lllllllllllllllIIIlllllllllIlllI = lIIIIIIIIlIll[3];
        char[] charArray = lllllllllllllllIIIllllllllllIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIIIlIll[3];
        while (lIIlIllIIlllIIl(i, length)) {
            char lllllllllllllllIIIllllllllllIIll = charArray[i];
            lllllllllllllllIIIllllllllllIIII.append((char) (lllllllllllllllIIIllllllllllIIll ^ lllllllllllllllIIIlllllllllIllll[lllllllllllllllIIIlllllllllIlllI % lllllllllllllllIIIlllllllllIllll.length]));
            "".length();
            lllllllllllllllIIIlllllllllIlllI++;
            i++;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIllllllllllIIII);
    }

    private static boolean lIIlIllIIllIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0729, code lost:
        if (lIIlIllIIlllIll(net.unethicalite.api.items.Inventory.getCount(r0), gg.squire.mixology.SquireMixology.u) != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x079e, code lost:
        if (lIIlIllIIlllIll(net.unethicalite.api.items.Inventory.getCount(r0), gg.squire.mixology.SquireMixology.v) != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0816, code lost:
        if (lIIlIllIIlllIll(net.unethicalite.api.items.Inventory.getCount(r0), gg.squire.mixology.SquireMixology.w) != false) goto L186;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v255, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v257, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v328, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v334, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v336, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v338, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v351, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v359, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v361, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v375, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v377, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        if (lIIlIllIIllIIlI(s.e() ? 1 : 0)) {
            return lIIIIIIIIlIll[3];
        }
        int[] iArr = new int[lIIIIIIIIlIll[4]];
        iArr[lIIIIIIIIlIll[3]] = lIIIIIIIIlIll[5];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIlIllIIllIIll(nearest) && lIIlIllIIllIlII(s.h() ? 1 : 0) && lIIlIllIIllIlIl(Players.getLocal().getWorldLocation().distanceTo(nearest.getWorldLocation()), lIIIIIIIIlIll[4])) {
            return lIIIIIIIIlIll[3];
        }
        if (lIIlIllIIllIIlI(MixologyInfoBox.D)) {
            MixologyInfoBox.D = Static.getClient().getVarpValue(lIIIIIIIIlIll[6]);
        }
        if (lIIlIllIIllIIlI(MixologyInfoBox.E)) {
            MixologyInfoBox.E = Static.getClient().getVarpValue(lIIIIIIIIlIll[7]);
        }
        if (lIIlIllIIllIIlI(MixologyInfoBox.F)) {
            MixologyInfoBox.F = Static.getClient().getVarpValue(lIIIIIIIIlIll[8]);
        }
        if (lIIlIllIIllIllI(this.Y.pluginMode(), d.MINIGAME)) {
            return lIIIIIIIIlIll[3];
        }
        if (lIIlIllIIllIlll(this.Y.potionStrategy(), f.SINGLE_ORDER) && lIIlIllIIllIlII(s.f() ? 1 : 0)) {
            return lIIIIIIIIlIll[3];
        }
        if (lIIlIllIIllIlll(this.Y.potionStrategy(), f.MULTI_ORDER) && lIIlIllIIllIlII(s.g() ? 1 : 0)) {
            return lIIIIIIIIlIll[3];
        }
        if (lIIlIllIIllIlII(this.Y.useStamina() ? 1 : 0) && lIIlIllIIllIIlI(Inventory.contains(item -> {
            return item.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[35]]);
        }) ? 1 : 0)) {
            return lIIIIIIIIlIll[3];
        }
        if (((lIIlIllIIlllIII(Vars.getBit(this.I), lIIIIIIIIlIll[9]) && lIIlIllIIlllIII(Vars.getBit(this.J), lIIIIIIIIlIll[9]) && !lIIlIllIIlllIIl(Vars.getBit(this.K), lIIIIIIIIlIll[9])) || !lIIlIllIIllIIlI(s.f() ? 1 : 0)) && !lIIlIllIIllIlII(SquireMixology.j ? 1 : 0) && !lIIlIllIIllIlII(SquireMixology.k ? 1 : 0)) {
            if (lIIlIllIIlllIlI(Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]))) {
                SquireMixology.g = lIIIIIIIIIllI[lIIIIIIIIlIll[3]];
                Movement.setDestination(new WorldPoint(lIIIIIIIIlIll[12], lIIIIIIIIlIll[13], lIIIIIIIIlIll[3]));
                return lIIIIIIIIlIll[3];
            }
            String trim = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[11]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[4]], lIIIIIIIIIllI[lIIIIIIIIlIll[11]]).trim();
            String trim2 = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[14]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[15]], lIIIIIIIIIllI[lIIIIIIIIlIll[14]]).trim();
            String trim3 = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[16]).getText().replaceAll(lIIIIIIIIIllI[lIIIIIIIIlIll[17]], lIIIIIIIIIllI[lIIIIIIIIlIll[16]]).trim();
            if (lIIlIllIIllIlll(this.Y.potionStrategy(), f.MULTI_ORDER)) {
                if (lIIlIllIIllIlII(s.b(trim, trim2, trim3) ? 1 : 0)) {
                    return lIIIIIIIIlIll[3];
                }
                if (!lIIlIllIIllIIlI(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[18]]) ? 1 : 0) || !lIIlIllIIllIIlI(SquireMixology.n.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[19]]) ? 1 : 0) || lIIlIllIIllIlII(SquireMixology.f0o.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[20]]) ? 1 : 0)) {
                    SquireMixology.m = trim;
                    SquireMixology.y.set(lIIIIIIIIlIll[3], trim);
                    "".length();
                    SquireMixology.n = trim2;
                    SquireMixology.y.set(lIIIIIIIIlIll[4], trim2);
                    "".length();
                    SquireMixology.f0o = trim3;
                    SquireMixology.y.set(lIIIIIIIIlIll[11], trim3);
                    "".length();
                }
                if (!lIIlIllIIlllIll(SquireMixology.r, lIIIIIIIIlIll[21]) || !lIIlIllIIlllIll(SquireMixology.s, lIIIIIIIIlIll[21]) || lIIlIllIIllllII(SquireMixology.t, lIIIIIIIIlIll[21])) {
                    SquireMixology.r = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[4]).getSpriteId();
                    SquireMixology.z.set(lIIIIIIIIlIll[3], Integer.valueOf(SquireMixology.r));
                    "".length();
                    SquireMixology.s = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[15]).getSpriteId();
                    SquireMixology.z.set(lIIIIIIIIlIll[4], Integer.valueOf(SquireMixology.s));
                    "".length();
                    SquireMixology.t = Widgets.get(lIIIIIIIIlIll[10], lIIIIIIIIlIll[11]).getChild(lIIIIIIIIlIll[17]).getSpriteId();
                    SquireMixology.z.set(lIIIIIIIIlIll[11], Integer.valueOf(SquireMixology.t));
                    "".length();
                }
            }
            if (lIIlIllIIllIllI(this.Y.potionStrategy(), f.MULTI_ORDER)) {
                if (lIIlIllIIllIlII(SquireMixology.m.equalsIgnoreCase(lIIIIIIIIIllI[lIIIIIIIIlIll[22]]) ? 1 : 0) && lIIlIllIIllIlll(this.Y.potionStrategy(), f.SINGLE_ORDER)) {
                    t a = s.a(trim, trim2, trim3);
                    if (lIIlIllIIllIIll(a)) {
                        SquireMixology.m = a.a();
                    }
                }
                if (lIIlIllIIllllII(SquireMixology.r, lIIIIIIIIlIll[21]) && lIIlIllIIllIIll(SquireMixology.m)) {
                    SquireMixology.r = s.b(SquireMixology.m);
                }
            }
            if (!lIIlIllIIllIIll(SquireMixology.m) || lIIlIllIIllllII(SquireMixology.r, lIIIIIIIIlIll[21])) {
                return lIIIIIIIIlIll[3];
            }
            if (!lIIlIllIIllllIl(Vars.getBit(lIIIIIIIIlIll[23])) && !lIIlIllIIllllIl(Vars.getBit(lIIIIIIIIlIll[24])) && !lIIlIllIIllllIl(Vars.getBit(lIIIIIIIIlIll[25])) && !lIIlIllIIllllIl(Vars.getBit(lIIIIIIIIlIll[26]))) {
                if (!lIIlIllIIllIIlI(Players.getLocal().isAnimating() ? 1 : 0) || lIIlIllIIllIIlI(Players.getLocal().isIdle() ? 1 : 0)) {
                    return lIIIIIIIIlIll[3];
                }
                if (lIIlIllIIlllIII(Movement.getRunEnergy(), lIIIIIIIIlIll[27]) && lIIlIllIIllIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                    return lIIIIIIIIlIll[3];
                }
                if (lIIlIllIIllIlII(this.Y.useStamina() ? 1 : 0) && lIIlIllIIlllIIl(Movement.getRunEnergy(), lIIIIIIIIlIll[28]) && lIIlIllIIllIlII(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[34]]);
                }) ? 1 : 0) && lIIlIllIIllIIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIIIIIIIIIllI[lIIIIIIIIlIll[33]]);
                    }).interact(lIIIIIIIIIllI[lIIIIIIIIlIll[29]]);
                }
                if (lIIlIllIIllIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                String[] strArr = new String[lIIIIIIIIlIll[4]];
                strArr[lIIIIIIIIlIll[3]] = lIIIIIIIIIllI[lIIIIIIIIlIll[30]];
                if (lIIlIllIIllIlII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIIIIIlIll[4]];
                    strArr2[lIIIIIIIIlIll[3]] = lIIIIIIIIIllI[lIIIIIIIIlIll[31]];
                    Inventory.getFirst(strArr2).interact(lIIIIIIIIIllI[lIIIIIIIIlIll[32]]);
                }
                if (lIIlIllIIllIlll(this.Y.potionStrategy(), f.MULTI_ORDER)) {
                    if (lIIlIllIIllllII(SquireMixology.u, lIIIIIIIIlIll[4]) && lIIlIllIIllllII(SquireMixology.v, lIIIIIIIIlIll[4]) && lIIlIllIIllllII(SquireMixology.w, lIIIIIIIIlIll[4])) {
                        if (lIIlIllIIllIlII(trim.equalsIgnoreCase(trim2) ? 1 : 0)) {
                            SquireMixology.u += lIIIIIIIIlIll[4];
                        }
                        if (lIIlIllIIllIlII(trim.equalsIgnoreCase(trim3) ? 1 : 0)) {
                            SquireMixology.u += lIIIIIIIIlIll[4];
                        }
                        if (lIIlIllIIllIlII(trim2.equalsIgnoreCase(trim3) ? 1 : 0)) {
                            SquireMixology.v += lIIIIIIIIlIll[4];
                        }
                        if (lIIlIllIIllIlII(trim2.equalsIgnoreCase(trim) ? 1 : 0)) {
                            SquireMixology.v += lIIIIIIIIlIll[4];
                        }
                        if (lIIlIllIIllIlII(trim3.equalsIgnoreCase(trim) ? 1 : 0)) {
                            SquireMixology.w += lIIIIIIIIlIll[4];
                        }
                        if (lIIlIllIIllIlII(trim3.equalsIgnoreCase(trim2) ? 1 : 0)) {
                            SquireMixology.w += lIIIIIIIIlIll[4];
                        }
                    }
                    System.out.println("POTION 1: " + SquireMixology.m + " Count: " + SquireMixology.u);
                    System.out.println("POTION 2: " + SquireMixology.n + " Count: " + SquireMixology.v);
                    System.out.println("POTION 3: " + SquireMixology.f0o + " Count: " + SquireMixology.w);
                    int[] iArr2 = new int[lIIIIIIIIlIll[4]];
                    iArr2[lIIIIIIIIlIll[3]] = s.e(trim);
                    if (lIIlIllIIllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIIIIIIlIll[4]];
                        iArr3[lIIIIIIIIlIll[3]] = s.e(trim);
                        if (lIIlIllIIllIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIIIIIIlIll[4]];
                            iArr4[lIIIIIIIIlIll[3]] = s.e(trim);
                        }
                        int[] iArr5 = new int[lIIIIIIIIlIll[4]];
                        iArr5[lIIIIIIIIlIll[3]] = s.e(trim2);
                        if (lIIlIllIIllIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIIIIIlIll[4]];
                            iArr6[lIIIIIIIIlIll[3]] = s.e(trim2);
                            if (lIIlIllIIllIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIIIIIIIIlIll[4]];
                                iArr7[lIIIIIIIIlIll[3]] = s.e(trim2);
                            }
                            int[] iArr8 = new int[lIIIIIIIIlIll[4]];
                            iArr8[lIIIIIIIIlIll[3]] = s.e(trim3);
                            if (lIIlIllIIllIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIIIIIIIIlIll[4]];
                                iArr9[lIIIIIIIIlIll[3]] = s.e(trim3);
                                if (lIIlIllIIllIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[lIIIIIIIIlIll[4]];
                                    iArr10[lIIIIIIIIlIll[3]] = s.e(trim3);
                                }
                            }
                            SquireMixology.p = SquireMixology.f0o;
                            s.c(SquireMixology.f0o);
                            "".length();
                            SquireMixology.A = lIIIIIIIIlIll[3];
                            return lIIIIIIIIlIll[3];
                        }
                        SquireMixology.p = SquireMixology.n;
                        s.c(SquireMixology.n);
                        "".length();
                        SquireMixology.A = lIIIIIIIIlIll[3];
                        return lIIIIIIIIlIll[3];
                    }
                    SquireMixology.p = SquireMixology.m;
                    s.c(SquireMixology.m);
                    "".length();
                    SquireMixology.A = lIIIIIIIIlIll[3];
                    return lIIIIIIIIlIll[3];
                }
                if (lIIlIllIIllIllI(this.Y.potionStrategy(), f.MULTI_ORDER)) {
                    s.c(SquireMixology.m);
                    "".length();
                }
                return lIIIIIIIIlIll[3];
            }
            return lIIIIIIIIlIll[3];
        }
        return lIIIIIIIIlIll[3];
    }

    private static void lIIlIllIIllIIIl() {
        lIIIIIIIIlIll = new int[37];
        lIIIIIIIIlIll[0] = (-257) & 11687;
        lIIIIIIIIlIll[1] = (-4102) & 15533;
        lIIIIIIIIlIll[2] = (-17223) & 28655;
        lIIIIIIIIlIll[3] = ((148 ^ 154) ^ (133 ^ 169)) & (((162 ^ 172) ^ (57 ^ 21)) ^ (-" ".length()));
        lIIIIIIIIlIll[4] = " ".length();
        lIIIIIIIIlIll[5] = (-369) & 55285;
        lIIIIIIIIlIll[6] = (-27714) & 32127;
        lIIIIIIIIlIll[7] = (-18945) & 23359;
        lIIIIIIIIlIll[8] = (-((-25921) & 26604)) & (-2049) & 7147;
        lIIIIIIIIlIll[9] = 1 ^ 101;
        lIIIIIIIIlIll[10] = (-30861) & 31742;
        lIIIIIIIIlIll[11] = "  ".length();
        lIIIIIIIIlIll[12] = (-((-4569) & 13277)) & (-2057) & 12158;
        lIIIIIIIIlIll[13] = (-(((20 + 49) - 25) + 103)) & (-17154) & 26623;
        lIIIIIIIIlIll[14] = 166 ^ 162;
        lIIIIIIIIlIll[15] = "   ".length();
        lIIIIIIIIlIll[16] = (1 ^ 13) ^ (163 ^ 169);
        lIIIIIIIIlIll[17] = 114 ^ 119;
        lIIIIIIIIlIll[18] = (((84 + 99) - 163) + 154) ^ (((136 + 134) - 144) + 43);
        lIIIIIIIIlIll[19] = (((95 + 72) - 74) + 58) ^ (((125 + 17) - 6) + 23);
        lIIIIIIIIlIll[20] = 130 ^ 139;
        lIIIIIIIIlIll[21] = -" ".length();
        lIIIIIIIIlIll[22] = (117 ^ 74) ^ (27 ^ 46);
        lIIIIIIIIlIll[23] = (-897) & 12235;
        lIIIIIIIIlIll[24] = (-((-11541) & 12053)) & (-16449) & 28287;
        lIIIIIIIIlIll[25] = (-662) & 11989;
        lIIIIIIIIlIll[26] = (-4387) & 15715;
        lIIIIIIIIlIll[27] = (((47 + 75) - 28) + 35) ^ (((136 + 48) - 133) + 98);
        lIIIIIIIIlIll[28] = 232 ^ 169;
        lIIIIIIIIlIll[29] = 9 ^ 2;
        lIIIIIIIIlIll[30] = 132 ^ 136;
        lIIIIIIIIlIll[31] = 204 ^ 193;
        lIIIIIIIIlIll[32] = 131 ^ 141;
        lIIIIIIIIlIll[33] = 176 ^ 191;
        lIIIIIIIIlIll[34] = (161 ^ 158) ^ (181 ^ 154);
        lIIIIIIIIlIll[35] = (1 ^ 24) ^ (80 ^ 88);
        lIIIIIIIIlIll[36] = (192 ^ 143) ^ (68 ^ 25);
    }
}
