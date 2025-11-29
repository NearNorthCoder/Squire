/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="wave Wave31_62 Task", priority=10)
public class r
extends Task {
    private static /* synthetic */ int[] llIIlIIIllII;
    private final /* synthetic */ SquireFightCavesConfig aE;
    private final /* synthetic */ f aD;
    private final /* synthetic */ n aF;
    private static /* synthetic */ String[] llIIlIIIIIII;

    private static String llllIllllIllII(String lllllllllllllllIlIIllllIllIlIlll, String lllllllllllllllIlIIllllIllIlIllI) {
        lllllllllllllllIlIIllllIllIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlIIllllIllIlIlII = lllllllllllllllIlIIllllIllIlIllI.toCharArray();
        int lllllllllllllllIlIIllllIllIlIIll = llIIlIIIllII[2];
        char[] lllllllllllllllIlIIllllIllIIlIll = lllllllllllllllIlIIllllIllIlIlll.toCharArray();
        int lllllllllllllllIlIIllllIllIIlIIl = lllllllllllllllIlIIllllIllIIlIll.length;
        int lllllllllllllllIlIIllllIllIIIlll = llIIlIIIllII[2];
        while (r.lllllIIIllIIII(lllllllllllllllIlIIllllIllIIIlll, lllllllllllllllIlIIllllIllIIlIIl)) {
            char lllllllllllllllIlIIllllIllIllIIl = lllllllllllllllIlIIllllIllIIlIll[lllllllllllllllIlIIllllIllIIIlll];
            lllllllllllllllIlIIllllIllIlIlIl.append((char)(lllllllllllllllIlIIllllIllIllIIl ^ lllllllllllllllIlIIllllIllIlIlII[lllllllllllllllIlIIllllIllIlIIll % lllllllllllllllIlIIllllIllIlIlII.length]));
            "".length();
            ++lllllllllllllllIlIIllllIllIlIIll;
            ++lllllllllllllllIlIIllllIllIIIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllllIllIlIlIl);
    }

    private static boolean lllllIIIlIlIIl(int n2) {
        return n2 > 0;
    }

    private static void lllllIIIlIIIll() {
        llIIlIIIllII = new int[35];
        r.llIIlIIIllII[0] = 0xC6 ^ 0x80 ^ (0xD ^ 0x54);
        r.llIIlIIIllII[1] = 0xA ^ 0x34;
        r.llIIlIIIllII[2] = (0xE ^ 0x4E) & ~(0x3E ^ 0x7E);
        r.llIIlIIIllII[3] = " ".length();
        r.llIIlIIIllII[4] = 72 + 67 - 108 + 146 ^ 75 + 94 - 85 + 56;
        r.llIIlIIIllII[5] = 0x91 ^ 0x97;
        r.llIIlIIIllII[6] = "  ".length();
        r.llIIlIIIllII[7] = 0x4C ^ 8 ^ (0x63 ^ 0x23);
        r.llIIlIIIllII[8] = "   ".length();
        r.llIIlIIIllII[9] = 0x49 ^ 0x4C;
        r.llIIlIIIllII[10] = 0x41 ^ 0x71 ^ (0x76 ^ 0x41);
        r.llIIlIIIllII[11] = 0x23 ^ 0x54 ^ 12 + 34 - 45 + 126;
        r.llIIlIIIllII[12] = 0xF ^ 0x26 ^ (0x37 ^ 0xA);
        r.llIIlIIIllII[13] = 0x82 ^ 0x8B;
        r.llIIlIIIllII[14] = 0x98 ^ 0x92;
        r.llIIlIIIllII[15] = 101 + 119 - 112 + 43 ^ 122 + 47 - 69 + 56;
        r.llIIlIIIllII[16] = 0x48 ^ 0x5A;
        r.llIIlIIIllII[17] = 0x65 ^ 0x69;
        r.llIIlIIIllII[18] = 0x5B ^ 0x56;
        r.llIIlIIIllII[19] = 0x4F ^ 0x41;
        r.llIIlIIIllII[20] = 0xBE ^ 0xB1;
        r.llIIlIIIllII[21] = 0xAB ^ 0x81 ^ (0x1C ^ 0x26);
        r.llIIlIIIllII[22] = 0x50 ^ 0x41;
        r.llIIlIIIllII[23] = 0xA1 ^ 0xB2;
        r.llIIlIIIllII[24] = -(0xFFFFFBEB & 0x779F) & (0xFFFFFFFF & 0x7FBF);
        r.llIIlIIIllII[25] = -(0xFFFFB7CB & 0x797E) & (0xFFFFFD7F & 0x3FFF);
        r.llIIlIIIllII[26] = 0xFFFF8D3F & 0x7EF3;
        r.llIIlIIIllII[27] = 0xFFFFFEF5 & 0xD3E;
        r.llIIlIIIllII[28] = 0xFFFFBE3B & 0x4DF5;
        r.llIIlIIIllII[29] = 0xFFFFBEF6 & 0x4D3B;
        r.llIIlIIIllII[30] = -(0xFFFFFBDD & 0x64E3) & (0xFFFFEEF4 & 0x7DFB);
        r.llIIlIIIllII[31] = -(0xFFFFBE83 & 0x73FE) & (0xFFFFFFEF & 0x3EBF);
        r.llIIlIIIllII[32] = 0xFFFFEC3F & 0x1FEF;
        r.llIIlIIIllII[33] = 0xFFFFAEBE & 0x5D6D;
        r.llIIlIIIllII[34] = -(0xFFFFFBB3 & 0x775D) & (0xFFFFFFFF & 0x7F3D);
    }

    private static String llllIllllIlllI(String lllllllllllllllIlIIllllIllllIllI, String lllllllllllllllIlIIllllIllllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIlllllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIlllllllI.init(llIIlIIIllII[6], lllllllllllllllIlIIlllllIIIIIIII);
            return new String(lllllllllllllllIlIIllllIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIllllllII) {
            lllllllllllllllIlIIllllIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public r(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aD = f2;
        this.aE = squireFightCavesConfig;
        this.aF = n2;
    }

    private static boolean lllllIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        WorldPoint lllllllllllllllIlIIlllllIIlllIIl2;
        List lllllllllllllllIlIIlllllIIlllIlI2;
        List lllllllllllllllIlIIlllllIIlllIll;
        int n2 = f.p();
        if (!r.lllllIIIlIIlII(n2, llIIlIIIllII[0]) || r.lllllIIIlIIlIl(n2, llIIlIIIllII[1])) {
            return llIIlIIIllII[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllII[3];
        if (r.lllllIIIlIIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC lllllllllllllllIlIIlllllIlIIIIIl = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIIllIl;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[33]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[34])) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIIIllIl.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                "".length();
                if (" ".length() < 0) {
                    return ((0x4D ^ 0x70) & ~(0x50 ^ 0x6D)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC lllllllllllllllIlIIlllllIlIIIIII = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIlIIIl;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[31]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[32])) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIIlIIIl.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                "".length();
                if ((0x8F ^ 0x8B) == 0) {
                    return ((0x3A ^ 2) & ~(0xFC ^ 0xC4)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC lllllllllllllllIlIIlllllIIllllll = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[30]) && r.lllllIIIlIllII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllII[3];
                "".length();
                if ("  ".length() > (0x90 ^ 0x94)) {
                    return ((0x72 ^ 0x12) & ~(0xFA ^ 0x9A)) != 0;
                }
            } else {
                n2 = llIIlIIIllII[2];
            }
            return n2 != 0;
        });
        NPC lllllllllllllllIlIIlllllIIlllllI = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIllIIl;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[28]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[29])) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIIllIIl.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                "".length();
                if (null != null) {
                    return ((0x79 ^ 0x2F) & ~(0xF1 ^ 0xA7)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC lllllllllllllllIlIIlllllIIllllIl = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIlllll;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27])) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIIlllll.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                "".length();
                if (((0x2D ^ 0x19) & ~(1 ^ 0x35)) != 0) {
                    return ((0x24 ^ 0x13) & ~(0xBF ^ 0x88)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC lllllllllllllllIlIIlllllIIllllII = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIlIIlII;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[25])) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlIIlII.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                "".length();
                if (((0x1D ^ 0x33) & ~(0x70 ^ 0x5E)) >= " ".length()) {
                    return ((0x32 ^ 0x60) & ~(0x3F ^ 0x6D)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllII) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIlIII(f.r(), f.t()) && r.lllllIIIlIlIIl(f.r()) && r.lllllIIIlIlIIl(f.t()) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIll = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIlIIlll;
            if (!(r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[25]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) && !r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27]) || !r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlIIlll.isDead() ? 1 : 0))) {
                bl = llIIlIIIllII[3];
                "".length();
                if (null != null) {
                    return ((0x7D ^ 0x58) & ~(0x6C ^ 0x49)) != 0;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        }))) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIll.getWorldLocation());
            return llIIlIIIllII[2];
        }
        n.G();
        if (r.lllllIIIlIlIII(f.p(), llIIlIIIllII[4]) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllIl)) {
            lllllllllllllllIlIIlllllIIlllIll = lllllllllllllllIlIIlllllIIllllII.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(lllllllllllllllIlIIlllllIIlllIll) ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[2]];
                List lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
                WorldPoint lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                    int n2;
                    if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlllIll.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                        n2 = llIIlIIIllII[3];
                        "".length();
                        if (((0x82 ^ 0xAC ^ (0x33 ^ 0x25)) & (0xFA ^ 0xC0 ^ "  ".length() ^ -" ".length())) > 0) {
                            return ((0xB0 ^ 0xC4 ^ (0x60 ^ 0x55)) & (0x7B ^ 0x63 ^ (0x13 ^ 0x4A) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = llIIlIIIllII[2];
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
                if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2)) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                    return llIIlIIIllII[2];
                }
            }
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[3]];
            lllllllllllllllIlIIlllllIIllllIl.interact(llIIlIIIIIII[llIIlIIIllII[6]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIlIIIIIl) && r.lllllIIIlIlIll(lllllllllllllllIlIIlllllIlIIIIIl.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[7]) && (!r.lllllIIIlIllII(lllllllllllllllIlIIlllllIlIIIIIl.isMoving() ? 1 : 0) || r.lllllIIIlIlIlI(lllllllllllllllIlIIlllllIlIIIIIl.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIlIIIIIl.getName())) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIlIIIIIl.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[8]];
            lllllllllllllllIlIIlllllIlIIIIIl.interact(llIIlIIIIIII[llIIlIIIllII[7]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllII) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllllI) && r.lllllIIIlIlIll(lllllllllllllllIlIIlllllIIlllllI.getWorldLocation().distanceTo(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation()), llIIlIIIllII[9]) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(n.c(lllllllllllllllIlIIlllllIIllllIl.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllIl.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation()), llIIlIIIllII[5])) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[9]];
            lllllllllllllllIlIIlllllIIlllllI.interact(llIIlIIIIIII[llIIlIIIllII[5]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllII) && r.lllllIIIlIllII(n.c(lllllllllllllllIlIIlllllIIllllIl.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllIl.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation()), llIIlIIIllII[5])) {
            if (r.lllllIIIlIllIl(Players.getLocal().getInteracting())) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[10]];
                lllllllllllllllIlIIlllllIIllllII.interact(llIIlIIIIIII[llIIlIIIllII[11]]);
            }
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIlIll(lllllllllllllllIlIIlllllIIllllIl.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[12]) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIlIlI(n.c(lllllllllllllllIlIIlllllIIllllIl.getWorldArea().toWorldPointList()) ? 1 : 0) && !r.lllllIIIlIlIlI(n.F() ? 1 : 0) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIIllllIl.getName())) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllIl.isDead() ? 1 : 0)) {
            if (!r.lllllIIIlIllII(n.c(lllllllllllllllIlIIlllllIIllllIl.getWorldArea().toWorldPointList()) ? 1 : 0) || r.lllllIIIlIlIlI(lllllllllllllllIlIIlllllIIllllIl.isMoving() ? 1 : 0)) {
                n.e(lllllllllllllllIlIIlllllIIllllIl);
                return llIIlIIIllII[2];
            }
            if (r.lllllIIIlIllII(n.c(lllllllllllllllIlIIlllllIIllllIl.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(Players.getLocal().isMoving() ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllIl.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[13]];
                lllllllllllllllIlIIlllllIIllllIl.interact(llIIlIIIIIII[llIIlIIIllII[14]]);
                return llIIlIIIllII[2];
            }
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllII) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllII.isDead() ? 1 : 0) && r.lllllIIIlIlIlI(n.c(lllllllllllllllIlIIlllllIIlllIll = lllllllllllllllIlIIlllllIIllllII.getWorldArea().toWorldPointList()) ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[15]];
            lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
            lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlllIll.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    "".length();
                    if ((0xA1 ^ 0xA5) < 0) {
                        return ((0xB8 ^ 0xA7) & ~(0x14 ^ 0xB)) != 0;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllllI) && r.lllllIIIlIlIll(lllllllllllllllIlIIlllllIIlllllI.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[16]) && r.lllllIIIlIllIl(lllllllllllllllIlIIlllllIIllllIl) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIIlllllI.getName())) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlllllI.isDead() ? 1 : 0)) {
            lllllllllllllllIlIIlllllIIlllIll = lllllllllllllllIlIIlllllIIlllllI.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(lllllllllllllllIlIIlllllIIlllIll) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlllIll.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0x5E ^ 0xD) & ~(0xD3 ^ 0x80)) != 0;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[17]];
            lllllllllllllllIlIIlllllIIlllllI.interact(llIIlIIIIIII[llIIlIIIllII[18]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllll) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIIllllll.getName())) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllll.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[19]];
            lllllllllllllllIlIIlllllIIllllll.interact(llIIlIIIIIII[llIIlIIIllII[20]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIlIIIIII) && r.lllllIIIlIllIl(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIlIIIIII.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[21]];
            lllllllllllllllIlIIlllllIlIIIIII.interact(llIIlIIIIIII[llIIlIIIllII[22]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIllllII) && r.lllllIIIlIllIl(lllllllllllllllIlIIlllllIIllllIl) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIllllII.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[16]];
            lllllllllllllllIlIIlllllIIlllIll = lllllllllllllllIlIIlllllIIllllII.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(lllllllllllllllIlIIlllllIIlllIll) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(lllllllllllllllIlIIlllllIIlllIll.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    "".length();
                    if (((0x85 ^ 0xB8 ^ (0x27 ^ 0x4F)) & (0xC1 ^ 0xB0 ^ (0x1C ^ 0x38) ^ -" ".length())) > 0) {
                        return ((21 + 152 - 4 + 62 ^ 125 + 28 - 9 + 36) & (0x34 ^ 0x70 ^ (0x5E ^ 0x49) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
            lllllllllllllllIlIIlllllIIllllII.interact(llIIlIIIIIII[llIIlIIIllII[23]]);
            return llIIlIIIllII[2];
        }
        return llIIlIIIllII[2];
    }

    private static boolean lllllIIIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIlIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIIlIllIl(Object object) {
        return object == null;
    }

    private static boolean lllllIIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lllllIIIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llllIllllIllll() {
        llIIlIIIIIII = new String[llIIlIIIllII[12]];
        r.llIIlIIIIIII[r.llIIlIIIllII[2]] = r.llllIllllIllII("KT0HCiFNPwIKIR8=", "mRcmD");
        r.llIIlIIIIIII[r.llIIlIIIllII[3]] = r.llllIllllIllIl("WiA8Pd1u2kpKsSZhdB/hXg==", "KqmoB");
        r.llIIlIIIIIII[r.llIIlIIIllII[6]] = r.llllIllllIlllI("wLtJGq4L46o=", "UqYSv");
        r.llIIlIIIIIII[r.llIIlIIIllII[8]] = r.llllIllllIllIl("bofY13PbUwXUsbC3hKoV+Q==", "lxZSf");
        r.llIIlIIIIIII[r.llIIlIIIllII[7]] = r.llllIllllIlllI("YdPDsfYODmI=", "KgvmO");
        r.llIIlIIIIIII[r.llIIlIIIllII[9]] = r.llllIllllIllIl("he3coVtvowsTO86/w2miNaXYAoa1dMO2", "eadtt");
        r.llIIlIIIIIII[r.llIIlIIIllII[5]] = r.llllIllllIllIl("iMaIE4HrzJE=", "dBqBW");
        r.llIIlIIIIIII[r.llIIlIIIllII[10]] = r.llllIllllIllIl("KLAJXol8ijyc/jlfAehP/A==", "IymkZ");
        r.llIIlIIIIIII[r.llIIlIIIllII[11]] = r.llllIllllIllIl("52l/k7hB60E=", "ZLEvm");
        r.llIIlIIIIIII[r.llIIlIIIllII[13]] = r.llllIllllIlllI("xaHXEUZ6JsFLSsm30V7gZQ==", "ibmWf");
        r.llIIlIIIIIII[r.llIIlIIIllII[14]] = r.llllIllllIlllI("F/LcD2kR4M8=", "qcWun");
        r.llIIlIIIIIII[r.llIIlIIIllII[15]] = r.llllIllllIllIl("UzdpAQUyauftw5ZzvUd46w==", "VmuEJ");
        r.llIIlIIIIIII[r.llIIlIIIllII[17]] = r.llllIllllIlllI("eG3nJhTOicEyFMJbCmSWjw==", "QcFLx");
        r.llIIlIIIIIII[r.llIIlIIIllII[18]] = r.llllIllllIlllI("00m4/ZO02Og=", "OGbqH");
        r.llIIlIIIIIII[r.llIIlIIIllII[19]] = r.llllIllllIlllI("aWdVp04PEZgozKAPVNiSKnbioh2ILIUZ", "DOZnF");
        r.llIIlIIIIIII[r.llIIlIIIllII[20]] = r.llllIllllIlllI("0EXjmJhTmUY=", "ejRGF");
        r.llIIlIIIIIII[r.llIIlIIIllII[21]] = r.llllIllllIllII("BAwlBysuET8BaCcRNkYqKRcz", "ExQfH");
        r.llIIlIIIIIII[r.llIIlIIIllII[22]] = r.llllIllllIllIl("hbLArfmjJEE=", "FGAwT");
        r.llIIlIIIIIII[r.llIIlIIIllII[16]] = r.llllIllllIllII("MiE8OBIYPCY+UR40LzwD", "sUHYq");
        r.llIIlIIIIIII[r.llIIlIIIllII[23]] = r.llllIllllIlllI("3J0VTiHg0lE=", "lCBGj");
    }

    private static String llllIllllIllIl(String lllllllllllllllIlIIllllIlIlIlllI, String lllllllllllllllIlIIllllIlIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIIllII[11]), "DES");
            Cipher lllllllllllllllIlIIllllIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIlIllIllI.init(llIIlIIIllII[6], lllllllllllllllIlIIllllIlIlllIII);
            return new String(lllllllllllllllIlIIllllIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIlIllIlII) {
            lllllllllllllllIlIIllllIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        r.lllllIIIlIIIll();
        r.llllIllllIllll();
    }
}

