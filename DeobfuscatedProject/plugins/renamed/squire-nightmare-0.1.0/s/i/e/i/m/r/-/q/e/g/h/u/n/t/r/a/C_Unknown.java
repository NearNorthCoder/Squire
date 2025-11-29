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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

public abstract class C_Unknown
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

    private static String lIIlIIIIllIllII(String var21, String var7) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llllIlIlIIll[5], var22);
            return new String(var17.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIlllIIll() {
        llllIlIlIIll = new int[8];
        C.llllIlIlIIll[0] = (64 + 175 - 82 + 78 ^ 139 + 119 - 197 + 101) & (0x22 ^ 0xE ^ (0x39 ^ 0x5C) ^ -1);
        C.llllIlIlIIll[1] = 3;
        C.llllIlIlIIll[2] = 0x5B ^ 0x53 ^ (0x76 ^ 0x7A);
        C.llllIlIlIIll[3] = 1;
        C.llllIlIlIIll[4] = 0x31 ^ 0x55;
        C.llllIlIlIIll[5] = 2;
        C.llllIlIlIIll[6] = -(0xFFFFFECF & 0x5576) & (0xFFFFFFDF & 0x7FF7);
        C.llllIlIlIIll[7] = 0xBD ^ 0xB5;
    }

    protected boolean bZ() {
        return this.cO;
    }

    private static String lIIlIIIIllIlllI(String var18, String var1) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llllIlIlIIll[7]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llllIlIlIIll[5], var16);
            return new String(var19.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        C.llllIlIlIIlI[C.llllIlIlIIll[0]] = C."sleepwalker";
        C.llllIlIlIIlI[C.llllIlIlIIll[3]] = C."husk";
        C.llllIlIlIIlI[C.llllIlIlIIll[5]] = C."parasite";
    }

    public boolean run() {
        int n2;
        int n3;
        int n4;
        C var2;
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
            0;
            if ((0x6B ^ 0x6E) == 0) {
                return false;
            }
        } else {
            var2.cO = llllIlIlIIll[0];
            n5 = var2.cO ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[5]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                0;
                if (2 > 3) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n4 = llllIlIlIIll[3];
            0;
            if (2 <= 0) {
                return ((112 + 155 - 171 + 86 ^ 97 + 63 - 33 + 62) & (0x6E ^ 0xC ^ (0x33 ^ 0x5A) ^ -1)) != 0;
            }
        } else {
            var2.cP = llllIlIlIIll[0];
            n4 = var2.cP ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                0;
                if (((0x58 ^ 7 ^ (0xD8 ^ 0xB1)) & (0x4E ^ 0x1F ^ (0x21 ^ 0x46) ^ -1)) > (0x1C ^ 0x7A ^ (0x49 ^ 0x2B))) {
                    return ((0xFC ^ 0xAA ^ (0x54 ^ 0x16)) & (50 + 134 - 52 + 42 ^ 10 + 170 - 131 + 137 ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n3 = llllIlIlIIll[3];
            0;
            if (2 < 0) {
                return ((0xC4 ^ 0xB7 ^ (0x3F ^ 5)) & (193 + 93 - 180 + 99 ^ 76 + 0 - 36 + 92 ^ -1)) != 0;
            }
        } else {
            var2.cQ = llllIlIlIIll[0];
            n3 = var2.cQ ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[0]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];
                0;
                if (1 > (0xB8 ^ 0xBC)) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n2 = llllIlIlIIll[3];
            0;
            
            }
        } else {
            n2 = llllIlIlIIll[0];
        }
        var2.cR = n2;
        this.cS = SquireNightmarePlugin.d();
        this.cT = e.aw();
        return this.bY();
    }

    public abstract boolean bY();

    /*
     * WARNING - void declaration
     */
    protected List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var24;
        void var3;
        WorldPoint var11;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llllIlIlIIll[0];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);
        0;
        while (C.lIIlIIIIlllIlII((var11 = var11.dx((int)Math.signum(var3.getX() - var11.getX())).dy((int)Math.signum(var3.getY() - var11.getY()))).equals((Object)var3) ? 1 : 0) && C.lIIlIIIIllllIII((int)(++var24), llllIlIlIIll[4])) {
            void var4;
            var4.add(var11);
            0;
            0;
            
            return null;
        }
        linkedList.add(worldPoint);
        0;
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

    private static String lIIlIIIIllIllll(String var10, String var23) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var20 = var23.toCharArray();
        int var6 = llllIlIlIIll[0];
        char[] var5 = var10.toCharArray();
        int var15 = var5.length;
        int var14 = llllIlIlIIll[0];
        while (C.lIIlIIIIllllIII(var14, var15)) {
            char var13 = var5[var14];
            var9.append((char)(var13 ^ var20[var6 % var20.length]));
            0;
            ++var6;
            ++var14;
            0;
            if (((0xEA ^ 0x97 ^ (0x41 ^ 0x31)) & (0xFC ^ 0xB2 ^ (0xFC ^ 0xBF) ^ -1)) <= 3) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlIIIIllllIIl(int n2) {
        return n2 != 0;
    }
}

