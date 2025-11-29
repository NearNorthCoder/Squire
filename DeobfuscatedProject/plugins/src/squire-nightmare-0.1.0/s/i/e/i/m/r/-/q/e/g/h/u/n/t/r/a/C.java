/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

public abstract class C
extends Task {
    protected /* synthetic */ NPC cS;
    private static final /* synthetic */ Logger cH;
    protected final /* synthetic */ int[] cN;
    protected final /* synthetic */ j cJ;
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

    private static boolean lIIlIIIIlllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIIIlllIlll(Object object) {
        return object != null;
    }

    private static String lIIlIIIIllIllII(String lllllllllllllllIIlIllIIllllllIll, String lllllllllllllllIIlIllIIllllllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIllllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIllllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIlllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIlllllllIl.init(llllIlIlIIll[5], lllllllllllllllIIlIllIIllllllllI);
            return new String(lllllllllllllllIIlIllIIlllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlllllllII) {
            lllllllllllllllIIlIllIIlllllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIll() {
        llllIlIlIIll = new int[8];
        C.llllIlIlIIll[0] = (64 + 175 - 82 + 78 ^ 139 + 119 - 197 + 101) & (0x22 ^ 0xE ^ (0x39 ^ 0x5C) ^ -" ".length());
        C.llllIlIlIIll[1] = "   ".length();
        C.llllIlIlIIll[2] = 0x5B ^ 0x53 ^ (0x76 ^ 0x7A);
        C.llllIlIlIIll[3] = " ".length();
        C.llllIlIlIIll[4] = 0x31 ^ 0x55;
        C.llllIlIlIIll[5] = "  ".length();
        C.llllIlIlIIll[6] = -(0xFFFFFECF & 0x5576) & (0xFFFFFFDF & 0x7FF7);
        C.llllIlIlIIll[7] = 0xBD ^ 0xB5;
    }

    protected boolean bZ() {
        return this.cO;
    }

    private static String lIIlIIIIllIlllI(String lllllllllllllllIIlIllIIlllIlIlII, String lllllllllllllllIIlIllIIlllIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[7]), "DES");
            Cipher lllllllllllllllIIlIllIIlllIllIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIlllIllIII.init(llllIlIlIIll[5], lllllllllllllllIIlIllIIlllIllIIl);
            return new String(lllllllllllllllIIlIllIIlllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIlllIlIlll) {
            lllllllllllllllIIlIllIIlllIlIlll.printStackTrace();
            return null;
        }
    }

    protected C(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.cJ = j2;
        this.cL = client;
        this.cK = squireNightmareConfig;
        this.cM = squireNightmarePlugin;
        this.cN = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void lIIlIIIIlllIIII() {
        llllIlIlIIlI = new String[llllIlIlIIll[1]];
        C.llllIlIlIIlI[C.llllIlIlIIll[0]] = C.lIIlIIIIllIllII("ez9mPgDvARTPHOhQw2V+sg==", "fJthU");
        C.llllIlIlIIlI[C.llllIlIlIIll[3]] = C.lIIlIIIIllIlllI("T6L8tooOtuc=", "kdPYM");
        C.llllIlIlIIlI[C.llllIlIlIIll[5]] = C.lIIlIIIIllIllll("FRs8LjcMDis=", "ezNOD");
    }

    public boolean run() {
        int n2;
        int n3;
        int n4;
        C lllllllllllllllIIlIllIlIIIIlIIll;
        int n5;
        if (C.lIIlIIIIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        if (C.lIIlIIIIlllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlIIll[1])) {
            return llllIlIlIIll[0];
        }
        if (C.lIIlIIIIlllIlII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (C.lIIlIIIIlllIllI(NPCs.getAll(nPC -> SquireNightmarePlugin.r.contains(nPC.getId())).size(), llllIlIlIIll[2])) {
            n5 = llllIlIlIIll[3];
            "".length();
            if ((0x6B ^ 0x6E) == 0) {
                return ((0x6F ^ 0x73) & ~(0x44 ^ 0x58)) != 0;
            }
        } else {
            lllllllllllllllIIlIllIlIIIIlIIll.cO = llllIlIlIIll[0];
            n5 = lllllllllllllllIIlIllIlIIIIlIIll.cO ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[5]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return ((0x4D ^ 0x72) & ~(0x23 ^ 0x1C)) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n4 = llllIlIlIIll[3];
            "".length();
            if ("  ".length() <= 0) {
                return ((112 + 155 - 171 + 86 ^ 97 + 63 - 33 + 62) & (0x6E ^ 0xC ^ (0x33 ^ 0x5A) ^ -" ".length())) != 0;
            }
        } else {
            lllllllllllllllIIlIllIlIIIIlIIll.cP = llllIlIlIIll[0];
            n4 = lllllllllllllllIIlIllIlIIIIlIIll.cP ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                "".length();
                if (((0x58 ^ 7 ^ (0xD8 ^ 0xB1)) & (0x4E ^ 0x1F ^ (0x21 ^ 0x46) ^ -" ".length())) > (0x1C ^ 0x7A ^ (0x49 ^ 0x2B))) {
                    return ((0xFC ^ 0xAA ^ (0x54 ^ 0x16)) & (50 + 134 - 52 + 42 ^ 10 + 170 - 131 + 137 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n3 = llllIlIlIIll[3];
            "".length();
            if ("  ".length() < 0) {
                return ((0xC4 ^ 0xB7 ^ (0x3F ^ 5)) & (193 + 93 - 180 + 99 ^ 76 + 0 - 36 + 92 ^ -" ".length())) != 0;
            }
        } else {
            lllllllllllllllIIlIllIlIIIIlIIll.cQ = llllIlIlIIll[0];
            n3 = lllllllllllllllIIlIllIlIIIIlIIll.cQ ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[0]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                "".length();
                if (" ".length() > (0xB8 ^ 0xBC)) {
                    return ((0x64 ^ 0x46) & ~(0xBE ^ 0x9C)) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n2 = llllIlIlIIll[3];
            "".length();
            if (null != null) {
                return ((0xCA ^ 0x9C ^ (0x4C ^ 0x42)) & (0x13 ^ 0x6E ^ (0x44 ^ 0x61) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llllIlIlIIll[0];
        }
        lllllllllllllllIIlIllIlIIIIlIIll.cR = n2;
        this.cS = SquireNightmarePlugin.d();
        this.cT = e.aw();
        return this.bY();
    }

    public abstract boolean bY();

    /*
     * WARNING - void declaration
     */
    protected List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void lllllllllllllllIIlIllIlIIIIIlIlI;
        void lllllllllllllllIIlIllIlIIIIIllIl;
        WorldPoint lllllllllllllllIIlIllIlIIIIIlIll;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llllIlIlIIll[0];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);
        "".length();
        while (C.lIIlIIIIlllIlII((lllllllllllllllIIlIllIlIIIIIlIll = lllllllllllllllIIlIllIlIIIIIlIll.dx((int)Math.signum(lllllllllllllllIIlIllIlIIIIIllIl.getX() - lllllllllllllllIIlIllIlIIIIIlIll.getX())).dy((int)Math.signum(lllllllllllllllIIlIllIlIIIIIllIl.getY() - lllllllllllllllIIlIllIlIIIIIlIll.getY()))).equals((Object)lllllllllllllllIIlIllIlIIIIIllIl) ? 1 : 0) && C.lIIlIIIIllllIII((int)(++lllllllllllllllIIlIllIlIIIIIlIlI), llllIlIlIIll[4])) {
            void lllllllllllllllIIlIllIlIIIIIlIIl;
            lllllllllllllllIIlIllIlIIIIIlIIl.add(lllllllllllllllIIlIllIlIIIIIlIll);
            "".length();
            "".length();
            if (null == null) continue;
            return null;
        }
        linkedList.add(worldPoint);
        "".length();
        Collections.reverse(linkedList);
        return linkedList;
    }

    static {
        C.lIIlIIIIlllIIll();
        C.lIIlIIIIlllIIII();
        cI = llllIlIlIIll[6];
        cH = LoggerFactory.getLogger(C.class);
    }

    private static boolean lIIlIIIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIlllIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIIIIllIllll(String lllllllllllllllIIlIllIIllllIIllI, String lllllllllllllllIIlIllIIllllIlIlI) {
        lllllllllllllllIIlIllIIllllIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIllllIlIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllIIllllIlIII = lllllllllllllllIIlIllIIllllIlIlI.toCharArray();
        int lllllllllllllllIIlIllIIllllIIlll = llllIlIlIIll[0];
        char[] lllllllllllllllIIlIllIIllllIIIIl = lllllllllllllllIIlIllIIllllIIllI.toCharArray();
        int lllllllllllllllIIlIllIIllllIIIII = lllllllllllllllIIlIllIIllllIIIIl.length;
        int lllllllllllllllIIlIllIIlllIlllll = llllIlIlIIll[0];
        while (C.lIIlIIIIllllIII(lllllllllllllllIIlIllIIlllIlllll, lllllllllllllllIIlIllIIllllIIIII)) {
            char lllllllllllllllIIlIllIIllllIllII = lllllllllllllllIIlIllIIllllIIIIl[lllllllllllllllIIlIllIIlllIlllll];
            lllllllllllllllIIlIllIIllllIlIIl.append((char)(lllllllllllllllIIlIllIIllllIllII ^ lllllllllllllllIIlIllIIllllIlIII[lllllllllllllllIIlIllIIllllIIlll % lllllllllllllllIIlIllIIllllIlIII.length]));
            "".length();
            ++lllllllllllllllIIlIllIIllllIIlll;
            ++lllllllllllllllIIlIllIIlllIlllll;
            "".length();
            if (((0xEA ^ 0x97 ^ (0x41 ^ 0x31)) & (0xFC ^ 0xB2 ^ (0xFC ^ 0xBF) ^ -" ".length())) <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIllllIlIIl);
    }

    private static boolean lIIlIIIIllllIIl(int n2) {
        return n2 != 0;
    }
}

