package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/C.class */
public abstract class C extends Task {
    protected /* synthetic */ NPC cS;
    private static final /* synthetic */ Logger cH;
    protected final /* synthetic */ int[] cN = SquireNightmarePlugin.q.stream().mapToInt((v0) -> {
        return v0.intValue();
    }).toArray();
    protected final /* synthetic */ C0013j cJ;
    protected /* synthetic */ WorldArea cT;
    protected final /* synthetic */ SquireNightmarePlugin cM;
    private static /* synthetic */ String[] llllIlIlIIlI;
    protected final /* synthetic */ SquireNightmareConfig cK;
    protected /* synthetic */ boolean cR;
    protected static final /* synthetic */ int cI;
    protected /* synthetic */ boolean cO;
    protected /* synthetic */ boolean cQ;
    protected final /* synthetic */ Client cL;
    protected /* synthetic */ boolean cP;
    private static /* synthetic */ int[] llllIlIlIIll;

    private static boolean lIIlIIIIlllIlIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIIIIlllIlll(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIIllIllII(String lllllllllllllllIIlIllIIllllllIll, String lllllllllllllllIIlIllIIllllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIllllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIlllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIlllllllIl.init(llllIlIlIIll[5], lllllllllllllllIIlIllIIllllllllI);
            return new String(lllllllllllllllIIlIllIIlllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlllllllII) {
            lllllllllllllllIIlIllIIlllllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIll() {
        llllIlIlIIll = new int[8];
        llllIlIlIIll[0] = ((((64 + 175) - 82) + 78) ^ (((139 + 119) - 197) + 101)) & (((34 ^ 14) ^ (57 ^ 92)) ^ (-" ".length()));
        llllIlIlIIll[1] = "   ".length();
        llllIlIlIIll[2] = (91 ^ 83) ^ (118 ^ 122);
        llllIlIlIIll[3] = " ".length();
        llllIlIlIIll[4] = 49 ^ 85;
        llllIlIlIIll[5] = "  ".length();
        llllIlIlIIll[6] = (-((-305) & 21878)) & (-33) & 32759;
        llllIlIlIIll[7] = 189 ^ 181;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean bZ() {
        return this.cO;
    }

    private static String lIIlIIIIllIlllI(String lllllllllllllllIIlIllIIlllIlIllI, String lllllllllllllllIIlIllIIlllIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[7]), "DES");
            Cipher lllllllllllllllIIlIllIIlllIllIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlllIllIII.init(llllIlIlIIll[5], secretKeySpec);
            return new String(lllllllllllllllIIlIllIIlllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlllIlIlll) {
            lllllllllllllllIIlIllIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.cJ = c0013j;
        this.cL = client;
        this.cK = squireNightmareConfig;
        this.cM = squireNightmarePlugin;
    }

    private static void lIIlIIIIlllIIII() {
        llllIlIlIIlI = new String[llllIlIlIIll[1]];
        llllIlIlIIlI[llllIlIlIIll[0]] = lIIlIIIIllIllII("ez9mPgDvARTPHOhQw2V+sg==", "fJthU");
        llllIlIlIIlI[llllIlIlIIll[3]] = lIIlIIIIllIlllI("T6L8tooOtuc=", "kdPYM");
        llllIlIlIIlI[llllIlIlIIll[5]] = lIIlIIIIllIllll("FRs8LjcMDis=", "ezNOD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!lIIlIIIIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIlIIIIlllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlIIll[1])) {
            if (lIIlIIIIlllIlII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (lIIlIIIIlllIllI(NPCs.getAll(npc -> {
                return SquireNightmarePlugin.r.contains(Integer.valueOf(npc.getId()));
            }).size(), llllIlIlIIll[2])) {
                int i = llllIlIlIIll[3];
                "".length();
                z = i;
                if (!(true ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                z = llllIlIlIIll[0];
            }
            this.cO = z;
            if (lIIlIIIIlllIlll(NPCs.getNearest(npc2 -> {
                if (lIIlIIIIllllIIl(npc2.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[5]]) ? 1 : 0) && lIIlIIIIlllIlII(npc2.isDead() ? 1 : 0)) {
                    ?? r0 = llllIlIlIIll[3];
                    "".length();
                    return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIlIlIIll[0];
            }))) {
                int i2 = llllIlIlIIll[3];
                "".length();
                z2 = i2;
                if ("  ".length() <= 0) {
                    return ((((112 + 155) - 171) + 86) ^ (((97 + 63) - 33) + 62)) & (((110 ^ 12) ^ (51 ^ 90)) ^ (-" ".length()));
                }
            } else {
                z2 = llllIlIlIIll[0];
            }
            this.cP = z2;
            if (lIIlIIIIlllIlll(NPCs.getNearest(npc3 -> {
                if (lIIlIIIIllllIIl(npc3.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0) && lIIlIIIIlllIlII(npc3.isDead() ? 1 : 0)) {
                    ?? r0 = llllIlIlIIll[3];
                    "".length();
                    return (((88 ^ 7) ^ (216 ^ 177)) & (((78 ^ 31) ^ (33 ^ 70)) ^ (-" ".length()))) > ((28 ^ 122) ^ (73 ^ 43)) ? ((252 ^ 170) ^ (84 ^ 22)) & (((((50 + 134) - 52) + 42) ^ (((10 + 170) - 131) + 137)) ^ (-" ".length())) : r0;
                }
                return llllIlIlIIll[0];
            }))) {
                int i3 = llllIlIlIIll[3];
                "".length();
                z3 = i3;
                if ("  ".length() < 0) {
                    return ((196 ^ 183) ^ (63 ^ 5)) & (((((193 + 93) - 180) + 99) ^ (((76 + 0) - 36) + 92)) ^ (-" ".length()));
                }
            } else {
                z3 = llllIlIlIIll[0];
            }
            this.cQ = z3;
            if (lIIlIIIIlllIlll(NPCs.getNearest(npc4 -> {
                if (lIIlIIIIllllIIl(npc4.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[0]]) ? 1 : 0) && lIIlIIIIlllIlII(npc4.isDead() ? 1 : 0)) {
                    ?? r0 = llllIlIlIIll[3];
                    "".length();
                    return " ".length() > (184 ^ 188) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIlIlIIll[0];
            }))) {
                int i4 = llllIlIlIIll[3];
                "".length();
                z4 = i4;
                if (0 != 0) {
                    return ((202 ^ 156) ^ (76 ^ 66)) & (((19 ^ 110) ^ (68 ^ 97)) ^ (-" ".length()));
                }
            } else {
                z4 = llllIlIlIIll[0];
            }
            this.cR = z4;
            this.cS = SquireNightmarePlugin.d();
            this.cT = C0008e.aw();
            return bY();
        }
        return llllIlIlIIll[0];
    }

    public abstract boolean bY();

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        WorldPoint worldPoint3 = worldPoint2;
        int i = llllIlIlIIll[0];
        LinkedList linkedList = new LinkedList();
        linkedList.add(worldPoint2);
        "".length();
        do {
            WorldPoint dy = worldPoint3.dx((int) Math.signum(worldPoint.getX() - worldPoint3.getX())).dy((int) Math.signum(worldPoint.getY() - worldPoint3.getY()));
            worldPoint3 = dy;
            if (lIIlIIIIlllIlII(dy.equals(worldPoint) ? 1 : 0)) {
                int i2 = i;
                i++;
                if (lIIlIIIIllllIII(i2, llllIlIlIIll[4])) {
                    linkedList.add(worldPoint3);
                    "".length();
                    "".length();
                }
            }
            linkedList.add(worldPoint);
            "".length();
            Collections.reverse(linkedList);
            return linkedList;
        } while (0 == 0);
        return null;
    }

    static {
        lIIlIIIIlllIIll();
        lIIlIIIIlllIIII();
        cI = llllIlIlIIll[6];
        cH = LoggerFactory.getLogger(C.class);
    }

    private static boolean lIIlIIIIllllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIlllIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIlllIllI(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIIIIllIllll(String lllllllllllllllIIlIllIIllllIlIll, String lllllllllllllllIIlIllIIllllIlIlI) {
        String lllllllllllllllIIlIllIIllllIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIllllIlIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIllllIlIlI.toCharArray();
        int lllllllllllllllIIlIllIIllllIIlll = llllIlIlIIll[0];
        char[] charArray2 = lllllllllllllllIIlIllIIllllIlIll2.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIIll[0];
        while (lIIlIIIIllllIII(i, length)) {
            lllllllllllllllIIlIllIIllllIlIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllIIllllIIlll % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIllllIIlll++;
            i++;
            "".length();
            if ((((234 ^ 151) ^ (65 ^ 49)) & (((252 ^ 178) ^ (252 ^ 191)) ^ (-" ".length()))) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIllllIlIIl);
    }

    private static boolean lIIlIIIIllllIIl(int i) {
        return i != 0;
    }
}
