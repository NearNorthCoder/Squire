package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Avoiding Nightmares Charge", priority = 2147483546, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.at  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/at.class */
public class at extends A {
    private static final /* synthetic */ Logger eq;
    private static /* synthetic */ String[] llllIllIIlIl;
    private static /* synthetic */ int[] llllIllIlIlI;

    private static String lIIlIIIlIlllIIl(String lllllllllllllllIIlIlIlllIIllIlIl, String lllllllllllllllIIlIlIlllIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIllIIlI.getBytes(StandardCharsets.UTF_8)), llllIllIlIlI[23]), "DES");
            Cipher lllllllllllllllIIlIlIlllIIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlllIIllIlll.init(llllIllIlIlI[19], secretKeySpec);
            return new String(lllllllllllllllIIlIlIlllIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllIIllIllI) {
            lllllllllllllllIIlIlIlllIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIllIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIIIlIllIlll(String lllllllllllllllIIlIlIlllIlIllIlI, String lllllllllllllllIIlIlIlllIlIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlllIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlllIlIlllII.init(llllIllIlIlI[19], secretKeySpec);
            return new String(lllllllllllllllIIlIlIlllIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlllIlIllIll) {
            lllllllllllllllIIlIlIlllIlIllIll.printStackTrace();
            return null;
        }
    }

    private WorldPoint cF() {
        if (lIIlIIIllIIllIl(this.cM.aj())) {
            return null;
        }
        WorldArea aj = aj();
        WorldArea worldArea = null;
        eq.debug(llllIllIIlIl[llllIllIlIlI[17]], Integer.valueOf(aj.getWidth()), Integer.valueOf(aj.getHeight()));
        av cE = cE();
        if (lIIlIIIllIIllIl(cE)) {
            return null;
        }
        switch (au.er[cE.ordinal()]) {
            case 1:
                worldArea = this.cS.getWorldArea().dy(-(aj.getHeight() - llllIllIlIlI[17]));
                "".length();
                if ("   ".length() == " ".length()) {
                    return null;
                }
                break;
            case 2:
                worldArea = this.cS.getWorldArea().dy(aj.getHeight() - llllIllIlIlI[17]);
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
                break;
            case 3:
                worldArea = this.cS.getWorldArea().dx(-(aj.getWidth() - llllIllIlIlI[17]));
                "".length();
                if ((-" ".length()) > 0) {
                    return null;
                }
                break;
            case 4:
                worldArea = this.cS.getWorldArea().dx(aj.getWidth() - llllIllIlIlI[17]);
                break;
        }
        this.cM.aj = worldArea;
        return (WorldPoint) worldArea.getMeleeTiles(this.cL).stream().filter(worldPoint -> {
            if (lIIlIIIllIIllII(this.cM.aj().contains(worldPoint) ? 1 : 0)) {
                ?? r0 = llllIllIlIlI[16];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIllIlIlI[4];
        }).min(Comparator.comparingDouble(worldPoint2 -> {
            return worldPoint2.distanceToHypotenuse(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        ImmutableSet of = ImmutableSet.of(WorldPoint.fromLocalInstance(this.cL, new LocalPoint(llllIllIlIlI[1], llllIllIlIlI[9])), WorldPoint.fromLocalInstance(this.cL, new LocalPoint(llllIllIlIlI[2], llllIllIlIlI[9])));
        int i = llllIllIlIlI[15];
        NPC d = SquireNightmarePlugin.d();
        int animation = d.getAnimation();
        if (lIIlIIIllIIlIll(C0008e.ay())) {
            this.cM.k(llllIllIlIlI[4]);
            this.cM.aj = null;
            this.cM.b((WorldArea) null);
            return llllIllIlIlI[4];
        }
        if (lIIlIIIllIIlIIl(animation, i)) {
            WorldPoint e = SquireNightmarePlugin.e();
            WorldArea[] worldAreaArr = new WorldArea[llllIllIlIlI[16]];
            worldAreaArr[llllIllIlIlI[4]] = d.getWorldArea();
            if (lIIlIIIllIIllII(e.isInArea(worldAreaArr) ? 1 : 0) && lIIlIIIllIIllII(of.contains(SquireNightmarePlugin.e()) ? 1 : 0) && lIIlIIIllIIllII(of.contains(d.getWorldArea().getCenter()) ? 1 : 0) && lIIlIIIllIIllII(of.contains(d.getWorldLocation()) ? 1 : 0)) {
                UnmodifiableIterator it = of.iterator();
                while (lIIlIIIllIIlIlI(it.hasNext() ? 1 : 0)) {
                    WorldArea[] worldAreaArr2 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArr2[llllIllIlIlI[4]] = d.getWorldArea();
                    if (lIIlIIIllIIlIlI(((WorldPoint) it.next()).isInArea(worldAreaArr2) ? 1 : 0)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[4]]);
                        this.cM.k(llllIllIlIlI[4]);
                        return llllIllIlIlI[4];
                    }
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return ((50 ^ 106) ^ (45 ^ 61)) & (((81 ^ 105) ^ (60 ^ 76)) ^ (-" ".length()));
                    }
                }
                WorldArea aj = aj();
                if (lIIlIIIllIIllII(this.cM.at())) {
                    this.cM.k(llllIllIlIlI[17]);
                }
                WorldArea aw = C0008e.aw();
                this.cM.b(aj);
                if (!lIIlIIIllIIlIll(NPCs.getNearest(SquireNightmarePlugin.r.stream().mapToInt((v0) -> {
                    return v0.intValue();
                }).toArray()))) {
                    Player local = Players.getLocal();
                    if (lIIlIIIllIIllIl(local)) {
                        return llllIllIlIlI[4];
                    }
                    if (lIIlIIIllIIllII(aj.contains(local.getWorldLocation()) ? 1 : 0) && lIIlIIIllIIllII(local.isMoving() ? 1 : 0)) {
                        return llllIllIlIlI[4];
                    }
                    WorldPoint worldPoint = (WorldPoint) aw.toWorldPointList().stream().filter(worldPoint2 -> {
                        if (lIIlIIIllIIllII(aj.contains(worldPoint2) ? 1 : 0)) {
                            ?? r0 = llllIllIlIlI[16];
                            "".length();
                            return ((152 ^ 156) ^ ((104 ^ 120) & ((47 ^ 63) ^ (-1)))) < "  ".length() ? ((116 ^ 74) ^ (11 ^ 47)) & (((((44 + 175) - 143) + 113) ^ (((85 + 99) - 112) + 95)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIlIlI[4];
                    }).min(Comparator.comparingDouble(worldPoint3 -> {
                        return worldPoint3.distanceToHypotenuse(Players.getLocal().getWorldLocation());
                    })).orElse(null);
                    if (lIIlIIIllIIllIl(worldPoint)) {
                        worldPoint = (WorldPoint) SquireNightmarePlugin.e().toWorldArea(llllIllIlIlI[18], llllIllIlIlI[18]).toWorldPointList().stream().filter(worldPoint4 -> {
                            if (lIIlIIIllIIllII(aj.contains(worldPoint4) ? 1 : 0)) {
                                ?? r0 = llllIllIlIlI[16];
                                "".length();
                                return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllIllIlIlI[4];
                        }).min(Comparator.comparingDouble(worldPoint5 -> {
                            return worldPoint5.distanceToHypotenuse(Players.getLocal().getWorldLocation());
                        })).orElse(null);
                        eq.debug(llllIllIIlIl[llllIllIlIlI[19]], worldPoint);
                    }
                    if (lIIlIIIllIIllIl(worldPoint)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[20]]);
                        return llllIllIlIlI[4];
                    }
                    eq.debug(llllIllIIlIl[llllIllIlIlI[21]], worldPoint, Players.getLocal().getWorldLocation());
                    return j(worldPoint);
                }
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                WorldArea[] worldAreaArr3 = new WorldArea[llllIllIlIlI[16]];
                worldAreaArr3[llllIllIlIlI[4]] = aj;
                if (lIIlIIIllIIlIlI(worldLocation.isInArea(worldAreaArr3) ? 1 : 0)) {
                    return j((WorldPoint) aw.toWorldPointList().parallelStream().filter(worldPoint6 -> {
                        if (lIIlIIIllIIllII(aj.contains(worldPoint6) ? 1 : 0)) {
                            ?? r0 = llllIllIlIlI[16];
                            "".length();
                            return 0 != 0 ? ((15 ^ 109) ^ (106 ^ 52)) & (((((133 + 73) - 198) + 175) ^ (((50 + 7) - (-3)) + 79)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIlIlI[4];
                    }).min(Comparator.comparingDouble(worldPoint7 -> {
                        return worldPoint7.distanceToHypotenuse(Players.getLocal().getWorldLocation());
                    })).orElse(null));
                }
                WorldPoint cF = cF();
                if (lIIlIIIllIIllIl(cF)) {
                    eq.debug(llllIllIIlIl[llllIllIlIlI[16]]);
                    return llllIllIlIlI[4];
                }
                j(cF);
                "".length();
                "".length();
                if ("   ".length() <= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llllIllIlIlI[4];
    }

    private static boolean lIIlIIIllIIllII(int i) {
        return i == 0;
    }

    private static void lIIlIIIllIIIlll() {
        llllIllIlIlI = new int[24];
        llllIllIlIlI[0] = (-22715) & 24506;
        llllIllIlIlI[1] = (-389) & 6596;
        llllIllIlIlI[2] = (-7) & 7238;
        llllIllIlIlI[3] = (-13765) & 15812;
        llllIllIlIlI[4] = (205 ^ 138) & ((58 ^ 125) ^ (-1));
        llllIllIlIlI[5] = (-2600) & 7911;
        llllIllIlIlI[6] = (-55) & 6390;
        llllIllIlIlI[7] = (-22679) & 22934;
        llllIllIlIlI[8] = 36 ^ 100;
        llllIllIlIlI[9] = (-16429) & 23532;
        llllIllIlIlI[10] = (-((-23617) & 31851)) & (-22) & 16383;
        llllIllIlIlI[11] = (-7) & 8006;
        llllIllIlIlI[12] = (-20614) & 29637;
        llllIllIlIlI[13] = (-((-26250) & 32447)) & (-1) & 15349;
        llllIllIlIlI[14] = (-((-5719) & 32351)) & (-17) & 32728;
        llllIllIlIlI[15] = (-((-16809) & 18411)) & (-20481) & 30691;
        llllIllIlIlI[16] = " ".length();
        llllIllIlIlI[17] = 197 ^ 192;
        llllIllIlIlI[18] = 40 ^ 37;
        llllIllIlIlI[19] = "  ".length();
        llllIllIlIlI[20] = "   ".length();
        llllIllIlIlI[21] = (27 ^ 74) ^ (98 ^ 55);
        llllIllIlIlI[22] = (0 ^ 53) ^ (130 ^ 177);
        llllIllIlIlI[23] = (186 ^ 165) ^ (87 ^ 64);
    }

    @Inject
    public at(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0008e);
    }

    static {
        lIIlIIIllIIIlll();
        lIIlIIIlIlllIll();
        eq = LoggerFactory.getLogger(at.class);
    }

    private static boolean lIIlIIIllIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIllIIlIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIllIIlIII(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIIIlIlllIII(String lllllllllllllllIIlIlIlllIlIIlIlI, String lllllllllllllllIIlIlIlllIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIlIlllIlIIIlll = lllllllllllllllIIlIlIlllIlIIlIIl.toCharArray();
        int lllllllllllllllIIlIlIlllIlIIIllI = llllIllIlIlI[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIllIlIlI[4];
        while (lIIlIIIllIIlllI(i, length)) {
            char lllllllllllllllIIlIlIlllIlIIlIll = charArray[i];
            sb.append((char) (lllllllllllllllIIlIlIlllIlIIlIll ^ lllllllllllllllIIlIlIlllIlIIIlll[lllllllllllllllIIlIlIlllIlIIIllI % lllllllllllllllIIlIlIlllIlIIIlll.length]));
            "".length();
            lllllllllllllllIIlIlIlllIlIIIllI++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public av cE() {
        LocalPoint localLocation = SquireNightmarePlugin.d().getLocalLocation();
        int x = localLocation.getX();
        int y = localLocation.getY();
        int i = llllIllIlIlI[0];
        if (!lIIlIIIllIIlIII(x, llllIllIlIlI[1]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[2])) {
            int i2 = llllIllIlIlI[3];
        }
        if (!lIIlIIIllIIlIII(x, llllIllIlIlI[5]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[6])) {
            return av.WEST;
        }
        if (!lIIlIIIllIIlIII(x, llllIllIlIlI[9]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[10])) {
            return av.EAST;
        }
        if (lIIlIIIllIIlIII(y, llllIllIlIlI[11]) && lIIlIIIllIIlIII(y, llllIllIlIlI[10]) && lIIlIIIllIIlIII(y, llllIllIlIlI[12]) && !lIIlIIIllIIlIIl(y, llllIllIlIlI[13])) {
            if (lIIlIIIllIIlIII(y, llllIllIlIlI[14]) && lIIlIIIllIIlIII(y, llllIllIlIlI[1]) && lIIlIIIllIIlIII(y, llllIllIlIlI[9]) && !lIIlIIIllIIlIIl(y, llllIllIlIlI[2])) {
                return null;
            }
            return av.SOUTH;
        }
        return av.NORTH;
    }

    private static boolean lIIlIIIllIIlllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    private WorldArea aj() {
        return new WorldArea(y(llllIllIlIlI[16]), y(llllIllIlIlI[4]));
    }

    public static WorldPoint a(LocalPoint localPoint) {
        return (WorldPoint) WorldPoint.toLocalInstance(Static.getClient(), WorldPoint.fromLocalInstance(Static.getClient(), localPoint)).stream().filter((v0) -> {
            return Objects.nonNull(v0);
        }).min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo2D(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }

    private static void lIIlIIIlIlllIll() {
        llllIllIIlIl = new String[llllIllIlIlI[22]];
        llllIllIIlIl[llllIllIlIlI[4]] = lIIlIIIlIllIlll("4BOh9HZKDvF0+WbBZjQ2E7Gqkhz+HBBQspwY5W5rlXKExD8t5/e1qGgW2hiAvNw7Fa0PGLHJP66fCm1urTyQRZh/rNeL6FcYloilLEN9H6M=", "RvYNF");
        llllIllIIlIl[llllIllIlIlI[16]] = lIIlIIIlIlllIII("KCMaCB4XIQQGBRQHMUc4AxYFChYfQg8PFgEFCRcYGgwYRx4AQgISGx8=", "sblgw");
        llllIllIIlIl[llllIllIlIlI[19]] = lIIlIIIlIlllIII("DwIuFRowADAbATMmBVoANSU9CQcELDEUB3QqK1odIS80VlMgMSETHTNjKx8QOy08WgcmOmJaCCk=", "TCXzs");
        llllIllIIlIl[llllIllIlIlI[20]] = lIIlIIIlIlllIIl("1Sh04Miv/DIsxaOndFiTyddrWIz983OgtBwewONIQHRU30ITVvAqxTAOsxYECNrl6GHgxvzZpqjmKD0rO0Ls8Q==", "NuUgP");
        llllIllIIlIl[llllIllIlIlI[21]] = lIIlIIIlIllIlll("g+OyR3d2xe1lLOaUWbu7VZSwuL07C/buzqhK9FKcMR+c1zbSXY03Ft0+fin1gD+AmIWQAvkxhZqgtQV3U9RDUiIi+jlZ8luR", "dsdwn");
        llllIllIIlIl[llllIllIlIlI[17]] = lIIlIIIlIllIlll("TpM0QiRxzsfowdL0+NQAx2QCcr4/QaFbdnsMqJCMD9CrON2sROOZDg==", "vDiCh");
    }

    public static WorldPoint y(boolean z) {
        LocalPoint localLocation = SquireNightmarePlugin.d().getLocalLocation();
        int x = localLocation.getX();
        int y = localLocation.getY();
        int i = llllIllIlIlI[0];
        if (!lIIlIIIllIIlIII(x, llllIllIlIlI[1]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[2])) {
            i = llllIllIlIlI[3];
        }
        new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint localPoint = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint localPoint2 = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        if (!lIIlIIIllIIlIII(x, llllIllIlIlI[5]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[6])) {
            localPoint = new LocalPoint(x + i + llllIllIlIlI[7] + llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            localPoint2 = new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            new LocalPoint(x + i + llllIllIlIlI[7] + llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            "".length();
            if (((162 ^ 170) ^ (81 ^ 93)) <= "   ".length()) {
                return null;
            }
        } else if (!lIIlIIIllIIlIII(x, llllIllIlIlI[9]) || lIIlIIIllIIlIIl(x, llllIllIlIlI[10])) {
            localPoint = new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            new LocalPoint(((x - i) - llllIllIlIlI[7]) - llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            localPoint2 = new LocalPoint(((x - i) - llllIllIlIlI[7]) - llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        } else if (!lIIlIIIllIIlIII(y, llllIllIlIlI[11]) || !lIIlIIIllIIlIII(y, llllIllIlIlI[10]) || !lIIlIIIllIIlIII(y, llllIllIlIlI[12]) || lIIlIIIllIIlIIl(y, llllIllIlIlI[13])) {
            localPoint = new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], y + llllIllIlIlI[7] + llllIllIlIlI[8]);
            localPoint2 = new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], ((y - i) - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], ((y - i) - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        } else if (!lIIlIIIllIIlIII(y, llllIllIlIlI[14]) || !lIIlIIIllIIlIII(y, llllIllIlIlI[1]) || !lIIlIIIllIIlIII(y, llllIllIlIlI[9]) || lIIlIIIllIIlIIl(y, llllIllIlIlI[2])) {
            localPoint = new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], y + i + llllIllIlIlI[7] + llllIllIlIlI[8]);
            new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], y + i + llllIllIlIlI[7] + llllIllIlIlI[8]);
            localPoint2 = new LocalPoint((x - llllIllIlIlI[7]) - llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
            new LocalPoint(x + llllIllIlIlI[7] + llllIllIlIlI[8], (y - llllIllIlIlI[7]) - llllIllIlIlI[8]);
        }
        return lIIlIIIllIIlIlI(z ? 1 : 0) ? a(localPoint2) : a(localPoint);
    }
}
