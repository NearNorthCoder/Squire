/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Getting killcount", priority=5)
public class GettingKillcountTask
extends Task {
    
    private final  Client aE;
    private final  e aD;
    
    private static final  WorldPoint aC;

    private static boolean lIlIllIlIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIlIIIlII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIIlIl(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    static {
        A.lIlIllIlIIIIIl();
        A.lIlIllIIllllII();
        aC = new WorldPoint(lllIIIIlIlI[14], lllIIIIlIlI[15], lllIIIIlIlI[1]);
    }

    private static boolean lIlIllIlIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public GettingKillcountTask(e e2) {
        this.aD = e2;
        this.aE = Static.getClient();
    }

    private int R() {
        A var2;
        if (A.lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[3]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[4];
        }
        if (A.lIlIllIlIIIllI(var2.aE.getVarbitValue(lllIIIIlIlI[5]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[6];
        }
        if (A.lIlIllIlIIIllI(var2.aE.getVarbitValue(lllIIIIlIlI[7]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[8];
        }
        if (A.lIlIllIlIIIllI(var2.aE.getVarbitValue(lllIIIIlIlI[9]), lllIIIIlIlI[1])) {
            return lllIIIIlIlI[10];
        }
        return lllIIIIlIlI[11];
    }

    private static boolean lIlIllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIIllllII() {
        lllIIIIIllI = new String[lllIIIIlIlI[1]];
        A.lllIIIIIllI[A.lllIIIIlIlI[0]] = "Attack";
        A.lllIIIIIllI[A.lllIIIIlIlI[2]] = "Goblin";
    }

    private static boolean lIlIllIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A var3;
        if (A.lIlIllIlIIIIlI(this.aD.t() ? 1 : 0)) {
            return lllIIIIlIlI[0];
        }
        if (A.lIlIllIlIIIIll(var3.aD.x(), var3.R())) {
            return lllIIIIlIlI[0];
        }
        Player var4 = Players.getLocal();
        if (A.lIlIllIlIIIlII(var4.getInteracting())) {
            return lllIIIIlIlI[0];
        }
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (A.lIlIllIlIIIlll(nPC.isDead() ? 1 : 0) && A.lIlIllIlIIIIlI(nPC.getName().equals(lllIIIIIllI[lllIIIIlIlI[2]]) ? 1 : 0) && A.lIlIllIlIIlIII(nPC.distanceTo((Locatable)var4), lllIIIIlIlI[12]) && A.lIlIllIlIIlIII(nPC.distanceTo(aC), lllIIIIlIlI[13])) {
                n2 = lllIIIIlIlI[2];

                if (2 == ((0x22 ^ 0x28 ^ (5 ^ 0x2B)) & (0xB6 ^ 0xAF ^ (0x2C ^ 0x11) ^ -1))) {
                    return ((0xB5 ^ 0xBA ^ (0x97 ^ 0xC6)) & (0x63 ^ 0x25 ^ (0xAF ^ 0xB7) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIIlIlI[0];
            }
            return n2 != 0;
        });
        if (A.lIlIllIlIIIlIl(var5)) {
            return lllIIIIlIlI[0];
        }
        var2_2.interact(lllIIIIIllI[lllIIIIlIlI[0]]);
        this.sleep(lllIIIIlIlI[1]);
        return lllIIIIlIlI[2];
    }

}

