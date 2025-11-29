/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Plucking bird", priority=25)
public class PluckingBirdTask
extends Task {

    private static boolean lIIllIIIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lIllllllIIIlllI;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bc.lIIllIIIlII(nPC.getName().equalsIgnoreCase(lIlIIlIII[lIlIlIlll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlll[2]];
                stringArray[bc.lIlIlIlll[0]] = lIlIIlIII[lIlIlIlll[1]];
                if (bc.lIIllIIIlII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlll[2];

                    if (null == null) return n2 != 0;
                    return ((0x16 ^ 0x29 ^ (0x86 ^ 0xA7)) & (23 + 26 - 47 + 162 ^ 138 + 54 - 37 + 31 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIlll[0];
            return n2 != 0;
        });
        if (bc.lIIllIIIIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIlIlll[0];
        }
        if (bc.lIIllIIIIll(lIllllllIIIlllI)) {
            return lIlIlIlll[0];
        }
        nPC2.interact(lIlIIlIII[lIlIlIlll[0]]);
        this.sleep(lIlIlIlll[1]);
        return lIlIlIlll[2];
    }

    private static void lIIllIIIIII() {
        lIlIIlIII = new String[lIlIlIlll[3]];
        bc.lIlIIlIII[bc.lIlIlIlll[0]] = "Pluck";
        bc.lIlIIlIII[bc.lIlIlIlll[2]] = "chompy bird";
        bc.lIlIIlIII[bc.lIlIlIlll[1]] = "Pluck";
    }

    private static boolean lIIllIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bc.lIIllIIIIIl();
        bc.lIIllIIIIII();
    }

    private static boolean lIIllIIIIll(Object object) {
        return object == null;
    }

        return String.valueOf(lIlllllIlllIIlI);
    }

}

