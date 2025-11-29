/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing Guardian Stone", priority=3, blocking=true)
public class DepositingGuardianStoneTask
extends RunecraftingTaskBase {

    @Override
    protected boolean aj() {
        return llIIlllIIIII[2];
    }

        return String.valueOf(var1);
    }

    private static boolean llllllIlllllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if (s.llllllIlllllIl(this.aV.g() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (s.llllllIllllllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        int[] nArray = new int[llIIlllIIIII[0]];
        nArray[s.llIIlllIIIII[1]] = llIIlllIIIII[3];
        nArray[s.llIIlllIIIII[2]] = llIIlllIIIII[4];
        if (s.llllllIlllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        int[] nArray2 = new int[llIIlllIIIII[2]];
        nArray2[s.llIIlllIIIII[1]] = llIIlllIIIII[5];
        NPC var2 = NPCs.getNearest((int[])nArray2);
        if (!s.llllllIlllllll(var2) || s.llllllIlllllIl(var2.hasAction(string -> {
            int n2;
            if (s.llllllIlllllll(string) && s.llllllIllllllI(string.equals(llIIllIlllll[llIIlllIIIII[2]]) ? 1 : 0)) {
                n2 = llIIlllIIIII[2];

                if (3 < 1) {
                    return false;
                }
            } else {
                n2 = llIIlllIIIII[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (s.llllllIllllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIlllIIIII[2];
        }
        var1_1.interact(llIIllIlllll[llIIlllIIIII[1]]);
        return llIIlllIIIII[2];
    }

    private static boolean llllllIlllllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public DepositingGuardianStoneTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIIII[0]];
        cArray[s.llIIlllIIIII[1]] = c.ACTIVE;
        cArray[s.llIIlllIIIII[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllIllllIll() {
        llIIllIlllll = new String[llIIlllIIIII[0]];
        s.llIIllIlllll[s.llIIlllIIIII[1]] = "Power-up";
        s.llIIllIlllll[s.llIIlllIIIII[2]] = "Power-up";
    }

    private static boolean llllllIllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.llllllIlllllII();
        s.llllllIllllIll();
    }
}

