/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.UnmodifiableIterator
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.au;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.av;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Avoiding Nightmares Charge", priority=2147483546, blocking=true)
public class at
extends A {
    private static final /* synthetic */ Logger eq;
    private static /* synthetic */ String[] llllIllIIlIl;
    private static /* synthetic */ int[] llllIllIlIlI;

    private static String lIIlIIIlIlllIIl(String lllllllllllllllIIlIlIlllIIllIlIl, String lllllllllllllllIIlIlIlllIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIIllIlII.getBytes(StandardCharsets.UTF_8)), llllIllIlIlI[23]), "DES");
            Cipher lllllllllllllllIIlIlIlllIIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlllIIllIlll.init(llllIllIlIlI[19], lllllllllllllllIIlIlIlllIIlllIII);
            return new String(lllllllllllllllIIlIlIlllIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllIIllIllI) {
            lllllllllllllllIIlIlIlllIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIIIlIllIlll(String lllllllllllllllIIlIlIlllIlIllIlI, String lllllllllllllllIIlIlIlllIlIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlllIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlllIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlllIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlllIlIlllII.init(llllIllIlIlI[19], lllllllllllllllIIlIlIlllIlIlllIl);
            return new String(lllllllllllllllIIlIlIlllIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlllIlIllIll) {
            lllllllllllllllIIlIlIlllIlIllIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cF() {
        void var4_4;
        at lllllllllllllllIIlIlIlllIllllIll;
        if (at.lIIlIIIllIIllIl(this.cM.aj())) {
            return null;
        }
        WorldArea lllllllllllllllIIlIlIlllIllllIlI = lllllllllllllllIIlIlIlllIllllIll.aj();
        int lllllllllllllllIIlIlIlllIllllIIl = lllllllllllllllIIlIlIlllIllllIlI.getWidth();
        int lllllllllllllllIIlIlIlllIllllIII = lllllllllllllllIIlIlIlllIllllIlI.getHeight();
        WorldArea lllllllllllllllIIlIlIlllIlllIlll = null;
        eq.debug(llllIllIIlIl[llllIllIlIlI[17]], (Object)lllllllllllllllIIlIlIlllIllllIIl, (Object)lllllllllllllllIIlIlIlllIllllIII);
        av lllllllllllllllIIlIlIlllIlllIllI = lllllllllllllllIIlIlIlllIllllIll.cE();
        if (at.lIIlIIIllIIllIl((Object)lllllllllllllllIIlIlIlllIlllIllI)) {
            return null;
        }
        switch (au.er[lllllllllllllllIIlIlIlllIlllIllI.ordinal()]) {
            case 1: {
                int lllllllllllllllIIlIlIlllIlllIlIl = -(lllllllllllllllIIlIlIlllIllllIlI.getHeight() - llllIllIlIlI[17]);
                lllllllllllllllIIlIlIlllIlllIlll = lllllllllllllllIIlIlIlllIllllIll.cS.getWorldArea().dy(lllllllllllllllIIlIlIlllIlllIlIl);
                "".length();
                if ("   ".length() != " ".length()) break;
                return null;
            }
            case 2: {
                int lllllllllllllllIIlIlIlllIlllIlII = lllllllllllllllIIlIlIlllIllllIlI.getHeight() - llllIllIlIlI[17];
                lllllllllllllllIIlIlIlllIlllIlll = lllllllllllllllIIlIlIlllIllllIll.cS.getWorldArea().dy(lllllllllllllllIIlIlIlllIlllIlII);
                "".length();
                if (" ".length() < "   ".length()) break;
                return null;
            }
            case 3: {
                int lllllllllllllllIIlIlIlllIlllIIll = -(lllllllllllllllIIlIlIlllIllllIlI.getWidth() - llllIllIlIlI[17]);
                lllllllllllllllIIlIlIlllIlllIlll = lllllllllllllllIIlIlIlllIllllIll.cS.getWorldArea().dx(lllllllllllllllIIlIlIlllIlllIIll);
                "".length();
                if (-" ".length() <= 0) break;
                return null;
            }
            case 4: {
                int lllllllllllllllIIlIlIlllIlllIIlI = lllllllllllllllIIlIlIlllIllllIlI.getWidth() - llllIllIlIlI[17];
                lllllllllllllllIIlIlIlllIlllIlll = lllllllllllllllIIlIlIlllIllllIll.cS.getWorldArea().dx(lllllllllllllllIIlIlIlllIlllIIlI);
            }
        }
        this.cM.aj = var4_4;
        return var4_4.getMeleeTiles(this.cL).stream().filter(worldPoint -> {
            boolean bl;
            if (at.lIIlIIIllIIllII(this.cM.aj().contains(worldPoint) ? 1 : 0)) {
                bl = llllIllIlIlI[16];
                "".length();
                if (null != null) {
                    return ((0x79 ^ 0x23) & ~(0xDE ^ 0x84)) != 0;
                }
            } else {
                bl = llllIllIlIlI[4];
            }
            return bl;
        }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void lllllllllllllllIIlIlIllllIIlIIII;
        void lllllllllllllllIIlIlIllllIIIlllI;
        ImmutableSet immutableSet = ImmutableSet.of((Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[1], llllIllIlIlI[9])), (Object)WorldPoint.fromLocalInstance((Client)this.cL, (LocalPoint)new LocalPoint(llllIllIlIlI[2], llllIllIlIlI[9])));
        int n2 = llllIllIlIlI[15];
        NPC nPC = SquireNightmarePlugin.d();
        int n3 = nPC.getAnimation();
        RectangularArea rectangularArea = e.ay();
        if (at.lIIlIIIllIIlIll(rectangularArea)) {
            this.cM.k(llllIllIlIlI[4]);
            this.cM.aj = null;
            this.cM.b((WorldArea)null);
            return llllIllIlIlI[4];
        }
        if (at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIIIlllI, (int)lllllllllllllllIIlIlIllllIIlIIII)) {
            void lllllllllllllllIIlIlIllllIIlIIIl;
            void lllllllllllllllIIlIlIllllIIIllll;
            WorldArea[] worldAreaArray = new WorldArea[llllIllIlIlI[16]];
            worldAreaArray[at.llllIllIlIlI[4]] = lllllllllllllllIIlIlIllllIIIllll.getWorldArea();
            if (at.lIIlIIIllIIllII(SquireNightmarePlugin.e().isInArea(worldAreaArray) ? 1 : 0) && at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIlIIIl.contains((Object)SquireNightmarePlugin.e()) ? 1 : 0) && at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIlIIIl.contains((Object)lllllllllllllllIIlIlIllllIIIllll.getWorldArea().getCenter()) ? 1 : 0) && at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIlIIIl.contains((Object)lllllllllllllllIIlIlIllllIIIllll.getWorldLocation()) ? 1 : 0)) {
                at lllllllllllllllIIlIlIllllIIlIIlI;
                WorldPoint lllllllllllllllIIlIlIllllIIIlIll;
                UnmodifiableIterator lllllllllllllllIIlIlIllllIIIllII = lllllllllllllllIIlIlIllllIIlIIIl.iterator();
                while (at.lIIlIIIllIIlIlI(lllllllllllllllIIlIlIllllIIIllII.hasNext() ? 1 : 0)) {
                    lllllllllllllllIIlIlIllllIIIlIll = (WorldPoint)lllllllllllllllIIlIlIllllIIIllII.next();
                    WorldArea[] worldAreaArray2 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray2[at.llllIllIlIlI[4]] = lllllllllllllllIIlIlIllllIIIllll.getWorldArea();
                    if (at.lIIlIIIllIIlIlI(lllllllllllllllIIlIlIllllIIIlIll.isInArea(worldAreaArray2) ? 1 : 0)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[4]]);
                        lllllllllllllllIIlIlIllllIIlIIlI.cM.k(llllIllIlIlI[4]);
                        return llllIllIlIlI[4];
                    }
                    "".length();
                    if (-"   ".length() <= 0) continue;
                    return ((0x32 ^ 0x6A ^ (0x2D ^ 0x3D)) & (0x51 ^ 0x69 ^ (0x3C ^ 0x4C) ^ -" ".length())) != 0;
                }
                lllllllllllllllIIlIlIllllIIIllII = lllllllllllllllIIlIlIllllIIlIIlI.aj();
                if (at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIlIIlI.cM.at())) {
                    lllllllllllllllIIlIlIllllIIlIIlI.cM.k(llllIllIlIlI[17]);
                }
                lllllllllllllllIIlIlIllllIIIlIll = e.aw();
                lllllllllllllllIIlIlIllllIIlIIlI.cM.b((WorldArea)lllllllllllllllIIlIlIllllIIIllII);
                int[] lllllllllllllllIIlIlIllllIIIlIlI = SquireNightmarePlugin.r.stream().mapToInt(Integer::intValue).toArray();
                NPC lllllllllllllllIIlIlIllllIIIlIIl = NPCs.getNearest((int[])lllllllllllllllIIlIlIllllIIIlIlI);
                if (at.lIIlIIIllIIlIll(lllllllllllllllIIlIlIllllIIIlIIl)) {
                    WorldArea[] worldAreaArray3 = new WorldArea[llllIllIlIlI[16]];
                    worldAreaArray3[at.llllIllIlIlI[4]] = lllllllllllllllIIlIlIllllIIIllII;
                    if (at.lIIlIIIllIIlIlI(Players.getLocal().getWorldLocation().isInArea(worldAreaArray3) ? 1 : 0)) {
                        WorldPoint lllllllllllllllIIlIlIllllIIIlIII = lllllllllllllllIIlIlIllllIIIlIll.toWorldPointList().parallelStream().filter(arg_0 -> at.c((WorldArea)lllllllllllllllIIlIlIllllIIIllII, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        return lllllllllllllllIIlIlIllllIIlIIlI.j(lllllllllllllllIIlIlIllllIIIlIII);
                    }
                    WorldPoint lllllllllllllllIIlIlIllllIIIlIII = lllllllllllllllIIlIlIllllIIlIIlI.cF();
                    if (at.lIIlIIIllIIllIl(lllllllllllllllIIlIlIllllIIIlIII)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[16]]);
                        return llllIllIlIlI[4];
                    }
                    lllllllllllllllIIlIlIllllIIlIIlI.j(lllllllllllllllIIlIlIllllIIIlIII);
                    "".length();
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return ((0xE4 ^ 0xA6) & ~(0x7F ^ 0x3D)) != 0;
                    }
                } else {
                    WorldPoint lllllllllllllllIIlIlIllllIIIlIII = null;
                    Player lllllllllllllllIIlIlIllllIIIIlll = Players.getLocal();
                    if (at.lIIlIIIllIIllIl(lllllllllllllllIIlIlIllllIIIIlll)) {
                        return llllIllIlIlI[4];
                    }
                    if (at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIIllII.contains(lllllllllllllllIIlIlIllllIIIIlll.getWorldLocation()) ? 1 : 0) && at.lIIlIIIllIIllII(lllllllllllllllIIlIlIllllIIIIlll.isMoving() ? 1 : 0)) {
                        return llllIllIlIlI[4];
                    }
                    lllllllllllllllIIlIlIllllIIIlIII = lllllllllllllllIIlIlIllllIIIlIll.toWorldPointList().stream().filter(arg_0 -> at.b((WorldArea)lllllllllllllllIIlIlIllllIIIllII, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                    if (at.lIIlIIIllIIllIl(lllllllllllllllIIlIlIllllIIIlIII)) {
                        WorldArea lllllllllllllllIIlIlIllllIIIIllI = SquireNightmarePlugin.e().toWorldArea(llllIllIlIlI[18], llllIllIlIlI[18]);
                        lllllllllllllllIIlIlIllllIIIlIII = lllllllllllllllIIlIlIllllIIIIllI.toWorldPointList().stream().filter(arg_0 -> at.a((WorldArea)lllllllllllllllIIlIlIllllIIIllII, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(Players.getLocal().getWorldLocation()))).orElse(null);
                        eq.debug(llllIllIIlIl[llllIllIlIlI[19]], (Object)lllllllllllllllIIlIlIllllIIIlIII);
                    }
                    if (at.lIIlIIIllIIllIl(lllllllllllllllIIlIlIllllIIIlIII)) {
                        eq.debug(llllIllIIlIl[llllIllIlIlI[20]]);
                        return llllIllIlIlI[4];
                    }
                    eq.debug(llllIllIIlIl[llllIllIlIlI[21]], (Object)lllllllllllllllIIlIlIllllIIIlIII, (Object)Players.getLocal().getWorldLocation());
                    return lllllllllllllllIIlIlIllllIIlIIlI.j(lllllllllllllllIIlIlIllllIIIlIII);
                }
            }
        }
        return llllIllIlIlI[4];
    }

    private static /* synthetic */ boolean c(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            "".length();
            if (null != null) {
                return ((0xF ^ 0x6D ^ (0x6A ^ 0x34)) & (133 + 73 - 198 + 175 ^ 50 + 7 - -3 + 79 ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static boolean lIIlIIIllIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIllIIIlll() {
        llllIllIlIlI = new int[24];
        at.llllIllIlIlI[0] = 0xFFFFA745 & 0x5FBA;
        at.llllIllIlIlI[1] = 0xFFFFFE7B & 0x19C4;
        at.llllIllIlIlI[2] = 0xFFFFFFF9 & 0x1C46;
        at.llllIllIlIlI[3] = 0xFFFFCA3B & 0x3DC4;
        at.llllIllIlIlI[4] = (0xCD ^ 0x8A) & ~(0x3A ^ 0x7D);
        at.llllIllIlIlI[5] = 0xFFFFF5D8 & 0x1EE7;
        at.llllIllIlIlI[6] = 0xFFFFFFC9 & 0x18F6;
        at.llllIllIlIlI[7] = 0xFFFFA769 & 0x5996;
        at.llllIllIlIlI[8] = 0x24 ^ 0x64;
        at.llllIllIlIlI[9] = 0xFFFFBFD3 & 0x5BEC;
        at.llllIllIlIlI[10] = -(0xFFFFA3BF & 0x7C6B) & (0xFFFFFFEA & 0x3FFF);
        at.llllIllIlIlI[11] = 0xFFFFFFF9 & 0x1F46;
        at.llllIllIlIlI[12] = 0xFFFFAF7A & 0x73C5;
        at.llllIllIlIlI[13] = -(0xFFFF9976 & 0x7EBF) & (0xFFFFFFFF & 0x3BF5);
        at.llllIllIlIlI[14] = -(0xFFFFE9A9 & 0x7E5F) & (0xFFFFFFEF & 0x7FD8);
        at.llllIllIlIlI[15] = -(0xFFFFBE57 & 0x47EB) & (0xFFFFAFFF & 0x77E3);
        at.llllIllIlIlI[16] = " ".length();
        at.llllIllIlIlI[17] = 0xC5 ^ 0xC0;
        at.llllIllIlIlI[18] = 0x28 ^ 0x25;
        at.llllIllIlIlI[19] = "  ".length();
        at.llllIllIlIlI[20] = "   ".length();
        at.llllIllIlIlI[21] = 0x1B ^ 0x4A ^ (0x62 ^ 0x37);
        at.llllIllIlIlI[22] = 0 ^ 0x35 ^ (0x82 ^ 0xB1);
        at.llllIllIlIlI[23] = 0xBA ^ 0xA5 ^ (0x57 ^ 0x40);
    }

    @Inject
    public at(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    static {
        at.lIIlIIIllIIIlll();
        at.lIIlIIIlIlllIll();
        eq = LoggerFactory.getLogger(at.class);
    }

    private static boolean lIIlIIIllIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIllIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIlIIIlIlllIII(String lllllllllllllllIIlIlIlllIlIIlIlI, String lllllllllllllllIIlIlIlllIlIIlIIl) {
        lllllllllllllllIIlIlIlllIlIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlllIlIIlIII = new StringBuilder();
        char[] lllllllllllllllIIlIlIlllIlIIIlll = lllllllllllllllIIlIlIlllIlIIlIIl.toCharArray();
        int lllllllllllllllIIlIlIlllIlIIIllI = llllIllIlIlI[4];
        char[] lllllllllllllllIIlIlIlllIlIIIIII = lllllllllllllllIIlIlIlllIlIIlIlI.toCharArray();
        int lllllllllllllllIIlIlIlllIIllllll = lllllllllllllllIIlIlIlllIlIIIIII.length;
        int lllllllllllllllIIlIlIlllIIlllllI = llllIllIlIlI[4];
        while (at.lIIlIIIllIIlllI(lllllllllllllllIIlIlIlllIIlllllI, lllllllllllllllIIlIlIlllIIllllll)) {
            char lllllllllllllllIIlIlIlllIlIIlIll = lllllllllllllllIIlIlIlllIlIIIIII[lllllllllllllllIIlIlIlllIIlllllI];
            lllllllllllllllIIlIlIlllIlIIlIII.append((char)(lllllllllllllllIIlIlIlllIlIIlIll ^ lllllllllllllllIIlIlIlllIlIIIlll[lllllllllllllllIIlIlIlllIlIIIllI % lllllllllllllllIIlIlIlllIlIIIlll.length]));
            "".length();
            ++lllllllllllllllIIlIlIlllIlIIIllI;
            ++lllllllllllllllIIlIlIlllIIlllllI;
            "".length();
            if ((0x23 ^ 0x27) == (0x1A ^ 0x1E)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIlllIlIIlIII);
    }

    /*
     * WARNING - void declaration
     */
    public av cE() {
        void lllllllllllllllIIlIlIllllIlIIIIl;
        void lllllllllllllllIIlIlIllllIlIIIlI;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            int lllllllllllllllIIlIlIllllIlIIIII = llllIllIlIlI[3];
        }
        if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIlI, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIIIlI, llllIllIlIlI[6])) {
            return av.WEST;
        }
        if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIlI, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIIIlI, llllIllIlIlI[10])) {
            return av.EAST;
        }
        if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[13])) {
            return av.NORTH;
        }
        if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIIIIl, llllIllIlIlI[2])) {
            return av.SOUTH;
        }
        return null;
    }

    private static boolean lIIlIIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private WorldArea aj() {
        return new WorldArea(at.y(llllIllIlIlI[16]), at.y(llllIllIlIlI[4]));
    }

    private static /* synthetic */ boolean b(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            "".length();
            if ((0x98 ^ 0x9C ^ (0x68 ^ 0x78) & ~(0x2F ^ 0x3F)) < "  ".length()) {
                return ((0x74 ^ 0x4A ^ (0xB ^ 0x2F)) & (44 + 175 - 143 + 113 ^ 85 + 99 - 112 + 95 ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, WorldPoint worldPoint) {
        boolean bl;
        if (at.lIIlIIIllIIllII(worldArea.contains(worldPoint) ? 1 : 0)) {
            bl = llllIllIlIlI[16];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((0x4C ^ 0x66) & ~(0x2F ^ 5)) != 0;
            }
        } else {
            bl = llllIllIlIlI[4];
        }
        return bl;
    }

    public static WorldPoint a(LocalPoint localPoint) {
        WorldPoint worldPoint2 = WorldPoint.fromLocalInstance((Client)Static.getClient(), (LocalPoint)localPoint);
        WorldPoint worldPoint3 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)worldPoint2).stream().filter(Objects::nonNull).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(Players.getLocal().getWorldLocation()))).orElse(null);
        return worldPoint3;
    }

    private static void lIIlIIIlIlllIll() {
        llllIllIIlIl = new String[llllIllIlIlI[22]];
        at.llllIllIIlIl[at.llllIllIlIlI[4]] = at.lIIlIIIlIllIlll("4BOh9HZKDvF0+WbBZjQ2E7Gqkhz+HBBQspwY5W5rlXKExD8t5/e1qGgW2hiAvNw7Fa0PGLHJP66fCm1urTyQRZh/rNeL6FcYloilLEN9H6M=", "RvYNF");
        at.llllIllIIlIl[at.llllIllIlIlI[16]] = at.lIIlIIIlIlllIII("KCMaCB4XIQQGBRQHMUc4AxYFChYfQg8PFgEFCRcYGgwYRx4AQgISGx8=", "sblgw");
        at.llllIllIIlIl[at.llllIllIlIlI[19]] = at.lIIlIIIlIlllIII("DwIuFRowADAbATMmBVoANSU9CQcELDEUB3QqK1odIS80VlMgMSETHTNjKx8QOy08WgcmOmJaCCk=", "TCXzs");
        at.llllIllIIlIl[at.llllIllIlIlI[20]] = at.lIIlIIIlIlllIIl("1Sh04Miv/DIsxaOndFiTyddrWIz983OgtBwewONIQHRU30ITVvAqxTAOsxYECNrl6GHgxvzZpqjmKD0rO0Ls8Q==", "NuUgP");
        at.llllIllIIlIl[at.llllIllIlIlI[21]] = at.lIIlIIIlIllIlll("g+OyR3d2xe1lLOaUWbu7VZSwuL07C/buzqhK9FKcMR+c1zbSXY03Ft0+fin1gD+AmIWQAvkxhZqgtQV3U9RDUiIi+jlZ8luR", "dsdwn");
        at.llllIllIIlIl[at.llllIllIlIlI[17]] = at.lIIlIIIlIllIlll("TpM0QiRxzsfowdL0+NQAx2QCcr4/QaFbdnsMqJCMD9CrON2sROOZDg==", "vDiCh");
    }

    /*
     * WARNING - void declaration
     */
    public static WorldPoint y(boolean bl) {
        void var7_7;
        boolean lllllllllllllllIIlIlIllllIllIIll;
        void lllllllllllllllIIlIlIllllIlIllll;
        void lllllllllllllllIIlIlIllllIllIIII;
        int lllllllllllllllIIlIlIllllIlIlllI;
        NPC nPC = SquireNightmarePlugin.d();
        LocalPoint localPoint = nPC.getLocalLocation();
        int n2 = localPoint.getX();
        int n3 = localPoint.getY();
        int n4 = llllIllIlIlI[0];
        if (!at.lIIlIIIllIIlIII(n2, llllIllIlIlI[1]) || at.lIIlIIIllIIlIIl(n2, llllIllIlIlI[2])) {
            lllllllllllllllIIlIlIllllIlIlllI = llllIllIlIlI[3];
        }
        LocalPoint lllllllllllllllIIlIlIllllIlIllIl = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint lllllllllllllllIIlIlIllllIlIllII = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint lllllllllllllllIIlIlIllllIlIlIll = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        LocalPoint lllllllllllllllIIlIlIllllIlIlIlI = new LocalPoint(llllIllIlIlI[4], llllIllIlIlI[4]);
        if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIllIIII, llllIllIlIlI[5]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIllIIII, llllIllIlIlI[6])) {
            lllllllllllllllIIlIlIllllIlIllII = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + lllllllllllllllIIlIlIllllIlIlllI + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIllIl = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIll = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIlI = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + lllllllllllllllIIlIlIllllIlIlllI + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
            "".length();
            if ((0xA2 ^ 0xAA ^ (0x51 ^ 0x5D)) <= "   ".length()) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIllIIII, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIllIIII, llllIllIlIlI[10])) {
            lllllllllllllllIIlIlIllllIlIllII = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIllIl = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - lllllllllllllllIIlIlIllllIlIlllI - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIll = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - lllllllllllllllIIlIlIllllIlIlllI - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIlI = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[11]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[10]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[12]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[13])) {
            lllllllllllllllIIlIlIllllIlIllII = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIllIl = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIll = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - lllllllllllllllIIlIlIllllIlIlllI - llllIllIlIlI[7] - llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIlI = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - lllllllllllllllIIlIlIllllIlIlllI - llllIllIlIlI[7] - llllIllIlIlI[8]));
            "".length();
            if (((0x29 ^ 0x2C) & ~(0x9D ^ 0x98)) != ((0x37 ^ 4) & ~(1 ^ 0x32))) {
                return null;
            }
        } else if (!at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[14]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[1]) || !at.lIIlIIIllIIlIII((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[9]) || at.lIIlIIIllIIlIIl((int)lllllllllllllllIIlIlIllllIlIllll, llllIllIlIlI[2])) {
            lllllllllllllllIIlIlIllllIlIllII = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + lllllllllllllllIIlIlIllllIlIlllI + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIllIl = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll + lllllllllllllllIIlIlIllllIlIlllI + llllIllIlIlI[7] + llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIll = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII - llllIllIlIlI[7] - llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
            lllllllllllllllIIlIlIllllIlIlIlI = new LocalPoint((int)(lllllllllllllllIIlIlIllllIllIIII + llllIllIlIlI[7] + llllIllIlIlI[8]), (int)(lllllllllllllllIIlIlIllllIlIllll - llllIllIlIlI[7] - llllIllIlIlI[8]));
        }
        if (at.lIIlIIIllIIlIlI(lllllllllllllllIIlIlIllllIllIIll ? 1 : 0)) {
            return at.a(lllllllllllllllIIlIlIllllIlIlIll);
        }
        return at.a((LocalPoint)var7_7);
    }
}

