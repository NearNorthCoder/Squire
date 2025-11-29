/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Getting Killcount", priority=5)
public class GettingKillcountTask
extends Task {
    
    private static final  WorldPoint aI;
    
    private final  Client aK;
    private final  l aJ;

    private static boolean llIIIlIllIlIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        E var1;
        if (E.llIIIlIllIIllII(this.aJ.B() ? 1 : 0)) {
            return lIllIIlIIIIIl[0];
        }
        if (E.llIIIlIllIIllIl(var1.aJ.F(), var1.R())) {
            return lIllIIlIIIIIl[0];
        }
        Player var2 = Players.getLocal();
        if (E.llIIIlIllIIlllI(var2.getInteracting())) {
            return lIllIIlIIIIIl[0];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            if (E.llIIIlIllIlIIlI(nPC.isDead() ? 1 : 0) && E.llIIIlIllIIllII(nPC.getName().equals(lIllIIlIIIIII[lIllIIlIIIIIl[3]]) ? 1 : 0) && E.llIIIlIllIlIIII(nPC.distanceTo(aI), lIllIIlIIIIIl[14])) {
                n2 = lIllIIlIIIIIl[3];

                if (-(0x27 ^ 0x23) > 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlIIIIIl[0];
            }
            return n2 != 0;
        });
        if (E.llIIIlIllIIllll(var3)) {
            if (E.llIIIlIllIlIIII(Players.getLocal().distanceTo(aI), lIllIIlIIIIIl[1])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (E.llIIIlIllIIllII(world.isMembers() ? 1 : 0) && E.llIIIlIllIIllII(world.isNormal() ? 1 : 0)) {
                        n2 = lIllIIlIIIIIl[3];

                        if ((2 & ~2) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lIllIIlIIIIIl[0];
                    }
                    return n2 != 0;
                }));
                var1.sleep(lIllIIlIIIIIl[2]);
                return lIllIIlIIIIIl[3];
            }
            return lIllIIlIIIIIl[0];
        }
        var2_2.interact(lIllIIlIIIIII[lIllIIlIIIIIl[0]]);
        this.sleep(lIllIIlIIIIIl[4]);
        return lIllIIlIIIIIl[3];
    }

    private static boolean llIIIlIllIIlllI(Object object) {
        return object != null;
    }

    static {
        E.llIIIlIllIIlIll();
        E.llIIIlIllIIlIlI();
        aI = new WorldPoint(lIllIIlIIIIIl[15], lIllIIlIIIIIl[16], lIllIIlIIIIIl[4]);
    }

    private static boolean llIIIlIllIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GettingKillcountTask(l l2) {
        this.aJ = l2;
        this.aK = Static.getClient();
    }

    private static boolean llIIIlIllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIlIllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIllIIllll(Object object) {
        return object == null;
    }

    private int R() {
        E var4;
        if (E.llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[5]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[6];
        }
        if (E.llIIIlIllIlIIIl(var4.aK.getVarbitValue(lIllIIlIIIIIl[7]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[8];
        }
        if (E.llIIIlIllIlIIIl(var4.aK.getVarbitValue(lIllIIlIIIIIl[9]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[10];
        }
        if (E.llIIIlIllIlIIIl(var4.aK.getVarbitValue(lIllIIlIIIIIl[11]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[12];
        }
        return lIllIIlIIIIIl[13];
    }

    private static boolean llIIIlIllIIllII(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIllIIlIlI() {
        lIllIIlIIIIII = new String[lIllIIlIIIIIl[4]];
        E.lIllIIlIIIIII[E.lIllIIlIIIIIl[0]] = "Attack";
        E.lIllIIlIIIIII[E.lIllIIlIIIIIl[3]] = "Imp";
    }

        return String.valueOf(var5);
    }
}

