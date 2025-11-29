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
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.NHelper;
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

@TaskDesc(name="wave 15 to 30 Task", priority=10)
public class Wave15To30Task
extends Task {
    private final  n az;
    private final  f ax;
    
    private final  SquireFightCavesConfig ay;

    static {
        p.llllIllIllIIll();
        p.llllIllIllIIlI();
    }

    private static boolean llllIllIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIllIlllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        NPC var1;
        int n2 = f.Wave15To30Task();
        if (!p.llllIllIllIlII(n2, llIIIlllIIlI[0]) || p.llllIllIllIlIl(n2, llIIIlllIIlI[1])) {
            return llIIIlllIIlI[2];
        }
        SquireFightCavesPlugin.f = llIIIlllIIlI[3];
        if (p.llllIllIllIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var3;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[25]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[26])) && p.llllIllIllIlIl(var3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && p.llllIllIlllIlI(var3.isDead() ? 1 : 0)) {
                n2 = llIIIlllIIlI[3];

                if ((0x95 ^ 0xC5 ^ (0x3A ^ 0x6E)) <= 1) {
                    return ((89 + 38 - 36 + 147 ^ 122 + 175 - 295 + 188) & (71 + 101 - 84 + 39 ^ (0x78 ^ 0x57) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIlI[2];
            }
            return n2 != 0;
        });
        NPC var4 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var5;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[23]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[24])) && p.llllIllIlllIlI(var5.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];

                if (3 <= 0) {
                    return ((150 + 108 - 252 + 241 ^ 93 + 109 - 42 + 25) & (0x23 ^ 0x2E ^ (0x50 ^ 0x13) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        NPC var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[22]) && p.llllIllIlllIlI(nPC.isDead() ? 1 : 0)) {
                n2 = llIIIlllIIlI[3];

                if ((0x6A ^ 0x5C ^ (0x2D ^ 0x1F)) < 1) {
                    return ((145 + 139 - 137 + 97 ^ 38 + 131 - 103 + 97) & (0x2C ^ 0x6D ^ (0xA7 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIlI[2];
            }
            return n2 != 0;
        });
        NPC var7 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var8;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[18]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[19])) && p.llllIllIlllIlI(var8.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];

                if (((0x4A ^ 0x6C ^ (0x7E ^ 0x17)) & (0x45 ^ 9 ^ 3 ^ -1)) > (0x3B ^ 0x3E ^ 1)) {
                    return ((0x34 ^ 0x52 ^ (0x4E ^ 0x33)) & (83 + 80 - 12 + 21 ^ 178 + 111 - 222 + 116 ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        NPC var9 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var10;
            if ((!p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[20]) || p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[21])) && p.llllIllIlllIlI(var10.isDead() ? 1 : 0)) {
                bl = llIIIlllIIlI[3];

                if ((4 + 12 - -73 + 56 ^ 18 + 120 - 10 + 21) <= 0) {
                    return ((0xBF ^ 0xC7 ^ (7 ^ 0x30)) & (0x2B ^ 0x52 ^ (0xBD ^ 0x8B) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        });
        if (!(p.llllIllIllIlll(var7) && p.llllIllIllIlll(var9) && p.llllIllIlllIII(f.r(), f.u()) && p.llllIllIlllIIl(f.r()) && p.llllIllIlllIIl(f.u()) && !p.llllIllIllIlll(var1 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var11;
            if (!(p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[18]) && p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[19]) && p.llllIllIlllllI(nPC.getId(), llIIIlllIIlI[20]) && !p.llllIllIlllIII(nPC.getId(), llIIIlllIIlI[21]) || !p.llllIllIlllIlI(var11.isDead() ? 1 : 0))) {
                bl = llIIIlllIIlI[3];

                }
            } else {
                bl = llIIIlllIIlI[2];
            }
            return bl;
        })))) {
            // empty if block
        }
        n.G();
        if (p.llllIllIlllIII(f.D, llIIIlllIIlI[4]) && p.llllIllIllIlll(var9) && p.llllIllIlllIlI(var9.isDead() ? 1 : 0) && p.llllIllIlllIll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[2]];
            var9.interact(llIIIlllIIIl[llIIIlllIIlI[3]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var2) && p.llllIllIllIlIl(var2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && (!p.llllIllIlllIlI(var2.isMoving() ? 1 : 0) || p.llllIllIllllII(var2.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var2.getName())) && p.llllIllIlllIlI(var2.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[6]];
            var2.interact(llIIIlllIIIl[llIIIlllIIlI[7]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var9) && p.llllIllIllIlll(var7) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(n.c(var9.getWorldArea().toWorldPointList()) ? 1 : 0) && p.llllIllIllllIl(var9.getWorldLocation().distanceTo(n.an), llIIIlllIIlI[8]) && p.llllIllIllllIl(var9.getWorldLocation().distanceTo(n.am), llIIIlllIIlI[8]) && p.llllIllIlllIlI(var9.isMoving() ? 1 : 0) && p.llllIllIllllIl(Players.getLocal().getWorldLocation().distanceTo(var9.getWorldLocation()), llIIIlllIIlI[9])) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[5]];
            var7.interact(llIIIlllIIIl[llIIIlllIIlI[9]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var9) && p.llllIllIlllIll(var2) && p.llllIllIlllllI(f.D, llIIIlllIIlI[4]) && p.llllIllIllIlIl(var9.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[10]) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllllII(n.c(var9.getWorldArea().toWorldPointList()) ? 1 : 0) && !p.llllIllIllllII(n.F() ? 1 : 0) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var9.getName())) && p.llllIllIlllIlI(var9.isDead() ? 1 : 0)) {
            if (!p.llllIllIlllIlI(n.c(var9.getWorldArea().toWorldPointList()) ? 1 : 0) || p.llllIllIllllII(var9.isMoving() ? 1 : 0)) {
                n.e(var9);
            }
            if (p.llllIllIlllIlI(n.c(var9.getWorldArea().toWorldPointList()) ? 1 : 0) && p.llllIllIlllIlI(Players.getLocal().isMoving() ? 1 : 0) && p.llllIllIlllIlI(var9.isMoving() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[11]];
                var9.interact(llIIIlllIIIl[llIIIlllIIlI[8]]);
                return llIIIlllIIlI[2];
            }
        }
        if (p.llllIllIllIlll(var7) && p.llllIllIlllIll(var9) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(var7.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[12]];
            var7.interact(llIIIlllIIIl[llIIIlllIIlI[13]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var6) && p.llllIllIlllIll(var9) && (!p.llllIllIllIlll(Players.getLocal().getInteracting()) || p.llllIllIllIlll(Players.getLocal().getInteracting()) && p.llllIllIllIllI(Players.getLocal().getInteracting().getName(), var6.getName())) && p.llllIllIlllIlI(var6.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[14]];
            var6.interact(llIIIlllIIIl[llIIIlllIIlI[15]]);
            return llIIIlllIIlI[2];
        }
        if (p.llllIllIllIlll(var4) && p.llllIllIlllIll(var9) && p.llllIllIlllIll(Players.getLocal().getInteracting()) && p.llllIllIlllIlI(var4.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIIlllIIIl[llIIIlllIIlI[16]];
            var4.interact(llIIIlllIIIl[llIIIlllIIlI[17]]);
            return llIIIlllIIlI[2];
        }
        return llIIIlllIIlI[2];
    }

    private static boolean llllIllIlllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llllIllIllIllI(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(var12);
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
        p.llIIIlllIIIl[p.llIIIlllIIlI[2]] = "Attacking melee";
        p.llIIIlllIIIl[p.llIIIlllIIlI[3]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[6]] = "Attacking bird";
        p.llIIIlllIIIl[p.llIIIlllIIlI[7]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[5]] = "Attacking ranger";
        p.llIIIlllIIIl[p.llIIIlllIIlI[9]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[11]] = "Attacking melee";
        p.llIIIlllIIIl[p.llIIIlllIIlI[8]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[12]] = "Attack ranger";
        p.llIIIlllIIIl[p.llIIIlllIIlI[13]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[14]] = "Attacking small blob";
        p.llIIIlllIIIl[p.llIIIlllIIlI[15]] = "Attack";
        p.llIIIlllIIIl[p.llIIIlllIIlI[16]] = "Attacking big blob";
        p.llIIIlllIIIl[p.llIIIlllIIlI[17]] = "Attack";
    }

    private static boolean llllIllIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIllIllIlll(Object object) {
        return object != null;
    }

    @Inject
    public Wave15To30Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
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

