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

@TaskDesc(name="wave 7 to 14 Task", priority=10)
public class Wave7To14Task
extends Task {
    private final  SquireFightCavesConfig aH;
    
    private final  n aI;
    private final  f aG;

    private static boolean lllllIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public Wave7To14Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aG = f2;
        this.aH = squireFightCavesConfig;
        this.aI = n2;
    }

    public boolean run() {
        int n2 = f.p();
        if (!s.lllllIIIllIIIl(n2, llIIlIIIllIl[0]) || s.lllllIIIllIIlI(n2, llIIlIIIllIl[1])) {
            return llIIlIIIllIl[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllIl[3];
        if (s.lllllIIIllIIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        n.G();
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            NPC var2;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[14]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[15])) && s.lllllIIIllIlIl(var2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && s.lllllIIIllIllI(var2.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];

                if (1 == (0x35 ^ 0x31)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC var3 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var4;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[12]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[13])) && s.lllllIIIllIllI(var4.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];

                if ((123 + 140 - 233 + 112 ^ 65 + 20 - 2 + 55) > (0x4C ^ 0x32 ^ (0xF4 ^ 0x8E))) {
                    return ((0x11 ^ 0x2C ^ (0xC9 ^ 0xC2)) & (0x4D ^ 0x1C ^ (9 ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[11]) && s.lllllIIIllIllI(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];

                if ((0xC2 ^ 0xC6) > (0x4E ^ 0x4A)) {
                    return false;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC var6 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var7;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[9]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[10])) && s.lllllIIIllIllI(var7.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];

                if (3 < 3) {
                    return false;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        if (s.lllllIIIllIlII(var1) && s.lllllIIIllIlIl(var1.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), var1.getName())) && s.lllllIIIllIllI(var1.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[2]];
            var1.interact(llIIlIIIlIll[llIIlIIIllIl[3]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var6) && s.lllllIIIllIlll(var1) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(var6.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[5]];
            var6.interact(llIIlIIIlIll[llIIlIIIllIl[6]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var5) && s.lllllIIIllIlll(var1) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), var5.getName())) && s.lllllIIIllIllI(var5.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[7]];
            var5.interact(llIIlIIIlIll[llIIlIIIllIl[8]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(var3) && s.lllllIIIllIlll(var1) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(var3.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[4]];
            var3.interact(llIIlIIIlIll[llIIlIIIllIl[0]]);
            return llIIlIIIllIl[2];
        }
        return llIIlIIIllIl[2];
    }

    private static boolean lllllIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIIlllIII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var8);
    }

    private static boolean lllllIIIllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIllIlII(Object object) {
        return object != null;
    }

    static {
        s.lllllIIIlIllll();
        s.lllllIIIlIIIlI();
    }

    private static boolean lllllIIIllIlll(Object object) {
        return object == null;
    }

    private static boolean lllllIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllIIIlIIIlI() {
        llIIlIIIlIll = new String[llIIlIIIllIl[16]];
        s.llIIlIIIlIll[s.llIIlIIIllIl[2]] = "Attacking bird";
        s.llIIlIIIlIll[s.llIIlIIIllIl[3]] = "Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[5]] = "Attack ranger";
        s.llIIlIIIlIll[s.llIIlIIIllIl[6]] = "Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[7]] = "Attacking small blob";
        s.llIIlIIIlIll[s.llIIlIIIllIl[8]] = "Attack";
        s.llIIlIIIlIll[s.llIIlIIIllIl[4]] = "Attacking big blob";
        s.llIIlIIIlIll[s.llIIlIIIllIl[0]] = "Attack";
    }

    private static boolean lllllIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllIIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

