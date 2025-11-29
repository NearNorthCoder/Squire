/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.client.Static;

/* TASK: wave 15 to 30 Task -> Wave15To30TaskTask */
@TaskDesc(name="wave 15 to 30 Task", priority=10)
public class p
extends Task {
    private final /* synthetic */ n az;
    private final /* synthetic */ f ax;
    private static /* synthetic */ int[] llIIIlllIIlI;
    private final /* synthetic */ SquireFightCavesConfig ay;
    private static /* synthetic */ String[] llIIIlllIIIl;

    static {
        p.llllIllIllIIll();
        p.llllIllIllIIlI();
    }

    private static String llllIllIllIIII(String var26, String var1) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(llIIIlllIIlI[6], var22);
            return new String(var25.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIllIlllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        NPC var7;
        int n2 = f.p();
        if (!p.llllIllIllIlII(n2, llIIIlllIIlI[0]) || p.llllIllIllIlIl(n2, llIIIlllIIlI[1])) {
            return llIIIlllIIlI[2];
        }
        SquireFightCavesPlugin.f = llIIIlllIIlI[3];
        if (p.llllIllIllIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var17 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var30;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[25]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[26])) && p.llllIllIllIlIl(var30.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && p.llllIllIlllIlI(var30.isDead() ? 1 : 0)) {
                n2 = llIIIlllIIlI[3];
                0;
                if ((0x95 ^ 0xC5 ^ (0x3A ^ 0x6E)) <= 1) {
                    return ((89 + 38 - 36 + 147 ^ 122 + 175 - 295 + 188) & (71 + 101 - 84 + 39 ^ (0x78 ^ 0x57) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIlI[2];
            }
            return n2 != 0;
        });
        NPC var18 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var14;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[23]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[24])) && p.llllIllIlllIlI(var14.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];
                0;
                if (3 <= 0) {
                    return ((150 + 108 - 252 + 241 ^ 93 + 109 - 42 + 25) & (0x23 ^ 0x2E ^ (0x50 ^ 0x13) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        NPC var23 = NPCs.getNearest(nPC -> {
            int n2;
            if (p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[22]) && p.llllIllIlllIlI(nPC.isDead() ? 1 : 0)) {
                n2 = llIIIlllIIlI[3];
                0;
                if ((0x6A ^ 0x5C ^ (0x2D ^ 0x1F)) < 1) {
                    return ((145 + 139 - 137 + 97 ^ 38 + 131 - 103 + 97) & (0x2C ^ 0x6D ^ (0xA7 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIlI[2];
            }
            return n2 != 0;
        });
        NPC var8 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var19;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[18]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[19])) && p.llllIllIlllIlI(var19.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];
                0;
                if (((0x4A ^ 0x6C ^ (0x7E ^ 0x17)) & (0x45 ^ 9 ^ 3 ^ -1)) > (0x3B ^ 0x3E ^ 1)) {
                    return ((0x34 ^ 0x52 ^ (0x4E ^ 0x33)) & (83 + 80 - 12 + 21 ^ 178 + 111 - 222 + 116 ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        NPC var29 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var9;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[20]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[21])) && p.llllIllIlllIlI(var9.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];
                0;
                if ((4 + 12 - -73 + 56 ^ 18 + 120 - 10 + 21) <= 0) {
                    return ((0xBF ^ 0xC7 ^ (7 ^ 0x30)) & (0x2B ^ 0x52 ^ (0xBD ^ 0x8B) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        if (!(p.llllIllIllIlll(var8) && p.llllIllIllIlll(var29) && p.llllIllIlllIII(f.r(), f.u()) && p.llllIllIlllIIl(f.r()) && p.llllIllIlllIIl(f.u()) && !p.llllIllIllIlll(var7 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var4;
            if (!(p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[18]) && p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[19]) && p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[20]) && !p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[21]) || !p.llllIllIlllIlI(var4.isDead() ? 1 : 0))) {
                bl = llIIIlllIIlI[3];
                0;
                
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        })))) {
            // empty if block
        }
        n.G();
        if (p.llllIllIlllIII(f.D, llIIIlllIIlI[4]) && p.llllIllIllIlll(var29) && p.llllIllIlllIlI(var29.isDead() ? 1 : 0) && p.llllIllIlllIll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[2]];
            var29.interact(llIIIlllIIIl[llIIIlllIIlI[3]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var17) && p.llllIllIllIlIl(var17.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && (!p.llllIllIlllIlI(var17.isMoving() ? 1 : 0) || p.llllIllIllllII(var17.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var17.getName())) && p.llllIllIlllIlI(var17.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[6]];
            var17.interact(llIIIlllIIIl[llIIIlllIIlI[7]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var29) && p.llllIllIllIlll(var8) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(n.c(var29.getWorldArea().toWorldPointList()) ? 1 : 0) && p.llllIllIllllIl(var29.getWorldLocation().distanceTo(n.an), llIIIlllIIlI[8]) && p.llllIllIllllIl(var29.getWorldLocation().distanceTo(n.am), llIIIlllIIlI[8]) && p.llllIllIlllIlI(var29.isMoving() ? 1 : 0) && p.llllIllIllllIl(Players.getLocal().getWorldLocation().distanceTo(var29.getWorldLocation()), llIIIlllIIlI[9])) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[5]];
            var8.interact(llIIIlllIIIl[llIIIlllIIlI[9]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var29) && p.llllIllIlllIll(var17) && p.llllIllIlllllI(f.D, llIIIlllIIlI[4]) && p.llllIllIllIlIl(var29.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[10]) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllllII(n.c(var29.getWorldArea().toWorldPointList()) ? 1 : 0) && !p.llllIllIllllII(n.F() ? 1 : 0) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var29.getName())) && p.llllIllIlllIlI(var29.isDead() ? 1 : 0)) {
            if (!p.llllIllIlllIlI(n.c(var29.getWorldArea().toWorldPointList()) ? 1 : 0) || p.llllIllIllllII(var29.isMoving() ? 1 : 0)) {
                n.e(var29);
            }
            if (p.llllIllIlllIlI(n.c(var29.getWorldArea().toWorldPointList()) ? 1 : 0) && p.llllIllIlllIlI(Players.getLocal().isMoving() ? 1 : 0) && p.llllIllIlllIlI(var29.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[11]];
                var29.interact(llIIIlllIIIl[llIIIlllIIlI[8]]);
                return llIIIlllIIlI[2];
            }
        }
        if (p.llllIllIllIlll(var8) && p.llllIllIlllIll(var29) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(var8.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[12]];
            var8.interact(llIIIlllIIIl[llIIIlllIIlI[13]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var23) && p.llllIllIlllIll(var29) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var23.getName())) && p.llllIllIlllIlI(var23.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[14]];
            var23.interact(llIIIlllIIIl[llIIIlllIIlI[15]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var18) && p.llllIllIlllIll(var29) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(var18.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[16]];
            var18.interact(llIIIlllIIIl[llIIIlllIIlI[17]]);
            return llIIIlllIIlI[2];
        }
        return llIIIlllIIlI[2];
    }

    private static boolean llllIllIlllIIl(int n2) {
        return n2 > 0;
    }

    private static void llllIllIllIIll() {
        llIIIlllIIlI = new int[27];
        p.llIIIlllIIlI[0] = 0xA0 ^ 0xBF;
        p.llIIIlllIIlI[1] = 0x43 ^ 0x4D;
        p.llIIIlllIIlI[2] = (0x57 ^ 0x68 ^ (0x26 ^ 0x5E)) & (93 + 66 - -48 + 26 ^ 26 + 166 - 145 + 127 ^ -1);
        p.llIIIlllIIlI[3] = 1;
        p.llIIIlllIIlI[4] = 6 + 33 - -87 + 44 ^ 160 + 43 - 182 + 159;
        p.llIIIlllIIlI[5] = 0x5F ^ 0x72 ^ (0x8B ^ 0xA2);
        p.llIIIlllIIlI[6] = 2;
        p.llIIIlllIIlI[7] = 3;
        p.llIIIlllIIlI[8] = 42 + 107 - 124 + 172 ^ 84 + 60 - -13 + 37;
        p.llIIIlllIIlI[9] = 11 + 89 - 20 + 56 ^ 105 + 126 - 110 + 20;
        p.llIIIlllIIlI[10] = 0xAD ^ 0xB9;
        p.llIIIlllIIlI[11] = 0x74 ^ 0x16 ^ (0x27 ^ 0x43);
        p.llIIIlllIIlI[12] = 0x29 ^ 0x21;
        p.llIIIlllIIlI[13] = 0xA ^ 3;
        p.llIIIlllIIlI[14] = 139 + 8 - 36 + 73 ^ 6 + 10 - -148 + 14;
        p.llIIIlllIIlI[15] = 0x86 ^ 0x8D;
        p.llIIIlllIIlI[16] = 0x52 ^ 0x5E;
        p.llIIIlllIIlI[17] = 0 ^ 0x13 ^ (0x3A ^ 0x24);
        p.llIIIlllIIlI[18] = -(0xFFFFADCB & 0x53BF) & (0xFFFFAFFB & 0x5DBF);
        p.llIIIlllIIlI[19] = -(0xFFFFF7C7 & 0x1B7E) & (0xFFFFDF77 & 0x3FFF);
        p.llIIIlllIIlI[20] = -(0xFFFFFF89 & 0x3FF) & (0xFFFFAFFB & 0x5FBF);
        p.llIIIlllIIlI[21] = -(0xFFFFE6D7 & 0x396C) & (0xFFFFEE7F & 0x3DF7);
        p.llIIIlllIIlI[22] = -(0xFFFFF7DF & 0x786B) & (0xFFFFFEFA & 0x7D7F);
        p.llIIIlllIIlI[23] = -(0xFFFFFEED & 0x71D3) & (0xFFFFFCFF & 0x7FEE);
        p.llIIIlllIIlI[24] = -(0xFFFFAFC9 & 0x7237) & (0xFFFFEE2F & 0x3FFF);
        p.llIIIlllIIlI[25] = 0xFFFFBCEC & 0x4F3F;
        p.llIIIlllIIlI[26] = 0xFFFF8DFF & 0x7E2D;
    }

    private static boolean llllIllIllIllI(Object object, Object object2) {
        return object != object2;
    }

    private static String llllIllIlIllll(String var15, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIIlllIIlI[12]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llIIIlllIIlI[6], var5);
            return new String(var12.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String llllIllIllIIIl(String var10, String var2) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var21 = var2.toCharArray();
        int var27 = llIIIlllIIlI[2];
        char[] var20 = var10.toCharArray();
        int var24 = var20.length;
        int var16 = llIIIlllIIlI[2];
        while (p.llllIllIllIlII(var16, var24)) {
            char var11 = var20[var16];
            var3.append((char)(var11 ^ var21[var27 % var21.length]));
            0;
            ++var27;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean llllIllIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIllIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIllIllIIlI() {
        llIIIlllIIIl = new String[llIIIlllIIlI[1]];
        p.llIIIlllIIIl[p.llIIIlllIIlI[2]] = p."Attacking melee";
        p.llIIIlllIIIl[p.llIIIlllIIlI[3]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[6]] = p."Attacking bird";
        p.llIIIlllIIIl[p.llIIIlllIIlI[7]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[5]] = p."Attacking ranger";
        p.llIIIlllIIIl[p.llIIIlllIIlI[9]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[11]] = p."Attacking melee";
        p.llIIIlllIIIl[p.llIIIlllIIlI[8]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[12]] = p."Attack ranger";
        p.llIIIlllIIIl[p.llIIIlllIIlI[13]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[14]] = p."Attacking small blob";
        p.llIIIlllIIIl[p.llIIIlllIIlI[15]] = p."Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[16]] = p."Attacking big blob";
        p.llIIIlllIIIl[p.llIIIlllIIlI[17]] = p."Attack";
    }

    private static boolean llllIllIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIllIllIlll(Object object) {
        return object != null;
    }

    @Inject
    public p(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ax = f2;
        this.ay = squireFightCavesConfig;
        this.az = n2;
    }

    private static boolean llllIllIlllIll(Object object) {
        return object == null;
    }

    private static boolean llllIllIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

