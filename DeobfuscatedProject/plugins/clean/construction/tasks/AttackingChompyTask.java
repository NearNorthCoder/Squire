/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Attacking Chompy", priority=100, blocking=true)
public class AttackingChompyTask
extends Task {

    private static void llIIIllIll() {
        llIlllll = new String[lllIIIIl[5]];
        aZ.llIlllll[aZ.lllIIIIl[1]] = "Attack";
        aZ.llIlllll[aZ.lllIIIIl[3]] = "Chompy bird";
        aZ.llIlllll[aZ.lllIIIIl[2]] = "Attack";
        aZ.llIlllll[aZ.lllIIIIl[4]] = "Pluck";
    }

    private static boolean llIIlIIIII(int n2) {
        return n2 != 0;
    }

    static {
        aZ.llIIIlllII();
        aZ.llIIIllIll();
    }

    private static boolean llIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIlIlIIIlIlIIl;
        NPC nPC2 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (aZ.llIIlIIIII(nPC.getName().equals(llIlllll[lllIIIIl[3]]) ? 1 : 0) && aZ.llIIlIIIIl(nPC.isDead() ? 1 : 0)) {
                String[] stringArray = new String[lllIIIIl[3]];
                stringArray[aZ.lllIIIIl[1]] = llIlllll[lllIIIIl[2]];
                if (aZ.llIIlIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIIl[3]];
                    stringArray2[aZ.lllIIIIl[1]] = llIlllll[lllIIIIl[4]];
                    if (aZ.llIIlIIIIl(nPC.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lllIIIIl[3];

                        if (null == null) return n2 != 0;
                        return ((0x85 ^ 0x93 ^ (0x5F ^ 0x19)) & (0x59 ^ 0x3F ^ (0x7C ^ 0x4A) ^ -1)) != 0;
                    }
                }
            }
            n2 = lllIIIIl[1];
            return n2 != 0;
        });
        if (aZ.llIIIlllIl(Players.getLocal().getAnimation(), lllIIIIl[0])) {
            return lllIIIIl[1];
        }
        if (aZ.llIIIllllI(Players.getLocal().getInteracting())) {
            return lllIIIIl[1];
        }
        if (aZ.llIIIlllll(llIlIlIIIlIlIIl)) {
            return lllIIIIl[1];
        }
        nPC2.interact(llIlllll[lllIIIIl[1]]);
        this.sleep(lllIIIIl[2]);
        return lllIIIIl[3];
    }

    private static boolean llIIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlllll(Object object) {
        return object == null;
    }

    private static boolean llIIIllllI(Object object) {
        return object != null;
    }
}

