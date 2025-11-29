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
import net.unethicalite.client.Static;

@TaskDesc(name="wave 1 to 6 Task", priority=10)
public class Wave1To6Task
extends Task {

    private final  f aA;
    private final  SquireFightCavesConfig aB;
    private final  n aC;

    static {
        q.lllllIIIIIIIll();
        q.lllllIIIIIIIlI();
    }

    private static boolean lllllIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public Wave1To6Task(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aA = f2;
        this.aB = squireFightCavesConfig;
        this.aC = n2;
    }

    private static void lllllIIIIIIIlI() {
        llIIlIIIIIll = new String[llIIlIIIIlII[0]];
        q.llIIlIIIIIll[q.llIIlIIIIlII[1]] = "Attacking bird";
        q.llIIlIIIIIll[q.llIIlIIIIlII[2]] = "Attack";
        q.llIIlIIIIIll[q.llIIlIIIIlII[3]] = "Attacking small blob";
        q.llIIlIIIIIll[q.llIIlIIIIlII[4]] = "Attack";
        q.llIIlIIIIIll[q.llIIlIIIIlII[5]] = "Attacking big blob";
        q.llIIlIIIIIll[q.llIIlIIIIlII[6]] = "Attack";
    }

        return String.valueOf(var1);
    }

    private static boolean lllllIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lllllIIIIIIllI(Object object) {
        return object != null;
    }

    public boolean run() {
        int n2 = f.p();
        if (!q.lllllIIIIIIlII(n2, llIIlIIIIlII[0]) || q.lllllIIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llIIlIIIIlII[1];
        }
        SquireFightCavesPlugin.f = llIIlIIIIlII[2];
        NPC var2 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var3;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[10]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[11])) && q.lllllIIIIIIlIl(var3.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];

                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC var4 = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC var5;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[8]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[9])) && q.lllllIIIIIIlIl(var5.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];

                if (((0xF9 ^ 0xB4) & ~(0x2C ^ 0x61)) != 0) {
                    return false;
                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[7]) && q.lllllIIIIIIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIIlII[2];

                if (2 == (0x42 ^ 0x4E ^ (0x59 ^ 0x51))) {
                    return ((87 + 132 - 160 + 187 ^ 65 + 84 - 110 + 124) & (0x8E ^ 0xC7 ^ (0x30 ^ 0x2C) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIIIlII[1];
            }
            return n2 != 0;
        });
        if (q.lllllIIIIIIllI(var2) && (!q.lllllIIIIIIllI(Players.getLocal().getInteracting()) || q.lllllIIIIIIllI(Players.getLocal().getInteracting()) && q.lllllIIIIIIlll(Players.getLocal().getInteracting().getName(), var2.getName())) && q.lllllIIIIIIlIl(var2.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[1]];
            var2.interact(llIIlIIIIIll[llIIlIIIIlII[2]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(var6) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(var6.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[3]];
            var6.interact(llIIlIIIIIll[llIIlIIIIlII[4]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(var4) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(var4.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[5]];
            var4.interact(llIIlIIIIIll[llIIlIIIIlII[6]]);
            return llIIlIIIIlII[1];
        }
        return llIIlIIIIlII[1];
    }

    private static boolean lllllIIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }
}

