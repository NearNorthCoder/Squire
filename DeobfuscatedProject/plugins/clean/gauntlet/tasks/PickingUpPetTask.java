/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.gauntlet.tasks.GauntletManager;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Picking up pet", priority=250, blocking=true)
public class PickingUpPetTask
extends Task {
    private final  c bw;

    private static boolean llllllIIlllIII(int n2) {
        return n2 != 0;
    }

    static {
        q.llllllIIllIlll();
        q.llllllIIllIllI();
    }

    private static boolean llllllIIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (q.llllllIIlllIII(this.bw.A() ? 1 : 0)) {
            return llIIllIIIlIl[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (q.llllllIIlllIII(Players.getLocal().equals(nPC.getInteracting()) ? 1 : 0) && q.llllllIIlllIII(nPC.hasAction(llIIllIIIlII[llIIllIIIlIl[1]]::equals) ? 1 : 0)) {
                n2 = llIIllIIIlIl[1];

                if (((115 + 126 - 192 + 123 ^ 79 + 77 - 60 + 58) & (0xF0 ^ 0xA6 ^ (0xD6 ^ 0xB6) ^ -1)) > 0) {
                    return ((0x7F ^ 0x4F ^ (0xA8 ^ 0xC2)) & (0x86 ^ 0xB0 ^ (0x66 ^ 0xA) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIlIl[0];
            }
            return n2 != 0;
        });
        if (q.llllllIIlllIIl(var1)) {
            return llIIllIIIlIl[0];
        }
        var1_1.interact(llIIllIIIlII[llIIllIIIlIl[0]]);
        return llIIllIIIlIl[1];
    }

    @Inject
    public PickingUpPetTask(c c2) {
        this.bw = c2;
    }

    private static void llllllIIllIllI() {
        llIIllIIIlII = new String[llIIllIIIlIl[2]];
        q.llIIllIIIlII[q.llIIllIIIlIl[0]] = "Pick-up";
        q.llIIllIIIlII[q.llIIllIIIlIl[1]] = "Pick-up";
    }
}

