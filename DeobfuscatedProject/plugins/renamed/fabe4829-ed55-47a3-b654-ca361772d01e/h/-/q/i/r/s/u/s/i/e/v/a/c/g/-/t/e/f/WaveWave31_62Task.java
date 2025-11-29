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
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n_Unknown;
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

/* TASK: wave Wave31_62 Task -> Wavewave31_62TaskTask */
@TaskDesc(name="wave Wave31_62 Task", priority=10)
public class WaveWave31_62Task
extends Task {
    private static /* synthetic */ int[] llIIlIIIllII;
    private final /* synthetic */ SquireFightCavesConfig aE;
    private final /* synthetic */ f aD;
    private final /* synthetic */ n aF;
    private static /* synthetic */ String[] llIIlIIIIIII;

    private static String llllIllllIllII(String var9, String var13) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var27 = var13.toCharArray();
        int var32 = llIIlIIIllII[2];
        char[] var31 = var9.toCharArray();
        int var29 = var31.length;
        int var14 = llIIlIIIllII[2];
        while (r.lllllIIIllIIII(var14, var29)) {
            char var16 = var31[var14];
            var10.append((char)(var16 ^ var27[var32 % var27.length]));
            0;
            ++var32;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lllllIIIlIlIIl(int n2) {
        return n2 > 0;
    }

    private static void lllllIIIlIIIll() {
        llIIlIIIllII = new int[35];
        r.llIIlIIIllII[0] = 0xC6 ^ 0x80 ^ (0xD ^ 0x54);
        r.llIIlIIIllII[1] = 0xA ^ 0x34;
        r.llIIlIIIllII[2] = (0xE ^ 0x4E) & ~(0x3E ^ 0x7E);
        r.llIIlIIIllII[3] = 1;
        r.llIIlIIIllII[4] = 72 + 67 - 108 + 146 ^ 75 + 94 - 85 + 56;
        r.llIIlIIIllII[5] = 0x91 ^ 0x97;
        r.llIIlIIIllII[6] = 2;
        r.llIIlIIIllII[7] = 0x4C ^ 8 ^ (0x63 ^ 0x23);
        r.llIIlIIIllII[8] = 3;
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

    private static String llllIllllIlllI(String var5, String var24) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(llIIlIIIllII[6], var2);
            return new String(var17.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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
        List var30;
        int n2 = f.p();
        if (!r.lllllIIIlIIlII(n2, llIIlIIIllII[0]) || r.lllllIIIlIIlIl(n2, llIIlIIIllII[1])) {
            return llIIlIIIllII[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllII[3];
        if (r.lllllIIIlIIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var8;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[33]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[34])) && r.lllllIIIlIllII(var8.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                0;
                if (1 < 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var4 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var18;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[31]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[32])) && r.lllllIIIlIllII(var18.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                0;
                if ((0x8F ^ 0x8B) == 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var19 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[30]) && r.lllllIIIlIllII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllII[3];
                0;
                if (2 > (0x90 ^ 0x94)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllII[2];
            }
            return n2 != 0;
        });
        NPC var6 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var20;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[28]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[29])) && r.lllllIIIlIllII(var20.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                0;
                
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var1 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var7;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27])) && r.lllllIIIlIllII(var7.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                0;
                if (((0x2D ^ 0x19) & ~(1 ^ 0x35)) != 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        NPC var11 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var25;
            if ((!r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) || r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[25])) && r.lllllIIIlIllII(var25.isDead() ? 1 : 0)) {
                bl = llIIlIIIllII[3];
                0;
                if (((0x1D ^ 0x33) & ~(0x70 ^ 0x5E)) >= 1) {
                    return false;
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        });
        if (r.lllllIIIlIIlll(var11) && r.lllllIIIlIIlll(var1) && r.lllllIIIlIlIII(f.r(), f.t()) && r.lllllIIIlIlIIl(f.r()) && r.lllllIIIlIlIIl(f.t()) && r.lllllIIIlIIlll(var30 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var26;
            if (!(r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[24]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[25]) && r.lllllIIIlIlllI(nPC.getId(), llIIlIIIllII[26]) && !r.lllllIIIlIlIII(nPC.getId(), llIIlIIIllII[27]) || !r.lllllIIIlIllII(var26.isDead() ? 1 : 0))) {
                bl = llIIlIIIllII[3];
                0;
                
                }
            } else {
                bl = llIIlIIIllII[2];
            }
            return bl;
        }))) {
            Movement.setDestination((WorldPoint)var30.getWorldLocation());
            return llIIlIIIllII[2];
        }
        n.G();
        if (r.lllllIIIlIlIII(f.p(), llIIlIIIllII[4]) && r.lllllIIIlIIlll(var1)) {
            var30 = var11.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var30) ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[2]];
                List lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
                WorldPoint lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                    int n2;
                    if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var30.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                        n2 = llIIlIIIllII[3];
                        0;
                        if (((0x82 ^ 0xAC ^ (0x33 ^ 0x25)) & (0xFA ^ 0xC0 ^ 2 ^ -1)) > 0) {
                            return ((0xB0 ^ 0xC4 ^ (0x60 ^ 0x55)) & (0x7B ^ 0x63 ^ (0x13 ^ 0x4A) ^ -1)) != 0;
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
            var1.interact(llIIlIIIIIII[llIIlIIIllII[6]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var3) && r.lllllIIIlIlIll(var3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[7]) && (!r.lllllIIIlIllII(var3.isMoving() ? 1 : 0) || r.lllllIIIlIlIlI(var3.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var3.getName())) && r.lllllIIIlIllII(var3.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[8]];
            var3.interact(llIIlIIIIIII[llIIlIIIllII[7]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var1) && r.lllllIIIlIIlll(var11) && r.lllllIIIlIIlll(var6) && r.lllllIIIlIlIll(var6.getWorldLocation().distanceTo(var1.getWorldLocation()), llIIlIIIllII[9]) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(n.c(var1.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(var1.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(var1.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(var1.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(var1.getWorldLocation()), llIIlIIIllII[5])) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[9]];
            var6.interact(llIIlIIIIIII[llIIlIIIllII[5]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var1) && r.lllllIIIlIIlll(var11) && r.lllllIIIlIllII(n.c(var1.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(var1.isMoving() ? 1 : 0) && r.lllllIIIlIIlIl(var1.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(var1.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && r.lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(var1.getWorldLocation()), llIIlIIIllII[5])) {
            if (r.lllllIIIlIllIl(Players.getLocal().getInteracting())) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[10]];
                var11.interact(llIIlIIIIIII[llIIlIIIllII[11]]);
            }
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var1) && r.lllllIIIlIlIll(var1.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[12]) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIlIlI(n.c(var1.getWorldArea().toWorldPointList()) ? 1 : 0) && !r.lllllIIIlIlIlI(n.F() ? 1 : 0) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var1.getName())) && r.lllllIIIlIllII(var1.isDead() ? 1 : 0)) {
            if (!r.lllllIIIlIllII(n.c(var1.getWorldArea().toWorldPointList()) ? 1 : 0) || r.lllllIIIlIlIlI(var1.isMoving() ? 1 : 0)) {
                n.e(var1);
                return llIIlIIIllII[2];
            }
            if (r.lllllIIIlIllII(n.c(var1.getWorldArea().toWorldPointList()) ? 1 : 0) && r.lllllIIIlIllII(Players.getLocal().isMoving() ? 1 : 0) && r.lllllIIIlIllII(var1.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[13]];
                var1.interact(llIIlIIIIIII[llIIlIIIllII[14]]);
                return llIIlIIIllII[2];
            }
        }
        if (r.lllllIIIlIIlll(var11) && r.lllllIIIlIllII(var11.isDead() ? 1 : 0) && r.lllllIIIlIlIlI(n.c(var30 = var11.getWorldArea().toWorldPointList()) ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[15]];
            lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList();
            lllllllllllllllIlIIlllllIIlllIIl2 = lllllllllllllllIlIIlllllIIlllIlI2.stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var30.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    0;
                    if ((0xA1 ^ 0xA5) < 0) {
                        return false;
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
        if (r.lllllIIIlIIlll(var6) && r.lllllIIIlIlIll(var6.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[16]) && r.lllllIIIlIllIl(var1) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var6.getName())) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var6.isDead() ? 1 : 0)) {
            var30 = var6.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var30) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var30.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    0;
                    if (2 <= 0) {
                        return false;
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
            var6.interact(llIIlIIIIIII[llIIlIIIllII[18]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var19) && (!r.lllllIIIlIIlll(Players.getLocal().getInteracting()) || r.lllllIIIlIIlll(Players.getLocal().getInteracting()) && r.lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), var19.getName())) && r.lllllIIIlIllII(var19.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[19]];
            var19.interact(llIIlIIIIIII[llIIlIIIllII[20]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var4) && r.lllllIIIlIllIl(var1) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var4.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[21]];
            var4.interact(llIIlIIIIIII[llIIlIIIllII[22]]);
            return llIIlIIIllII[2];
        }
        if (r.lllllIIIlIIlll(var11) && r.lllllIIIlIllIl(var1) && r.lllllIIIlIllIl(Players.getLocal().getInteracting()) && r.lllllIIIlIllII(var11.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIII[llIIlIIIllII[16]];
            var30 = var11.getWorldArea().toWorldPointList();
            if (r.lllllIIIlIlIlI(n.c(var30) ? 1 : 0) && r.lllllIIIlIIlll(lllllllllllllllIlIIlllllIIlllIIl2 = (WorldPoint)(lllllllllllllllIlIIlllllIIlllIlI2 = Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList()).stream().filter(worldPoint -> {
                int n2;
                if (r.lllllIIIlIlIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.lllllIIIlIllII(var30.contains(worldPoint) ? 1 : 0) && r.lllllIIIlIllII(n.a(worldPoint) ? 1 : 0)) {
                    n2 = llIIlIIIllII[3];
                    0;
                    if (((0x85 ^ 0xB8 ^ (0x27 ^ 0x4F)) & (0xC1 ^ 0xB0 ^ (0x1C ^ 0x38) ^ -1)) > 0) {
                        return ((21 + 152 - 4 + 62 ^ 125 + 28 - 9 + 36) & (0x34 ^ 0x70 ^ (0x5E ^ 0x49) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIIllII[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null))) {
                Movement.setDestination((WorldPoint)lllllllllllllllIlIIlllllIIlllIIl2);
                return llIIlIIIllII[2];
            }
            var11.interact(llIIlIIIIIII[llIIlIIIllII[23]]);
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
        r.llIIlIIIIIII[r.llIIlIIIllII[2]] = r."Dodge mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[3]] = r."Attacking melee";
        r.llIIlIIIIIII[r.llIIlIIIllII[6]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[8]] = r."Attacking bird";
        r.llIIlIIIIIII[r.llIIlIIIllII[7]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[9]] = r."Attacking ranger";
        r.llIIlIIIIIII[r.llIIlIIIllII[5]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[10]] = r."Attacking mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[11]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[13]] = r."Attacking melee";
        r.llIIlIIIIIII[r.llIIlIIIllII[14]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[15]] = r."Dodge mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[17]] = r."Attack ranger";
        r.llIIlIIIIIII[r.llIIlIIIllII[18]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[19]] = r."Attacking small blob";
        r.llIIlIIIIIII[r.llIIlIIIllII[20]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[21]] = r."Attacking big blob";
        r.llIIlIIIIIII[r.llIIlIIIllII[22]] = r."Attack";
        r.llIIlIIIIIII[r.llIIlIIIllII[16]] = r."Attacking mager";
        r.llIIlIIIIIII[r.llIIlIIIllII[23]] = r."Attack";
    }

    private static String llllIllllIllIl(String var12, String var21) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), llIIlIIIllII[11]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(llIIlIIIllII[6], var22);
            return new String(var23.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
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

