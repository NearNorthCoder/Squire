/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Teleporting out", priority=20, blocking=true)
public class TeleportingOutTask
extends Task {
    
    private final  a cP;

    private static void lIlIlIlllll() {
        llIIIlIll = new String[llIIIllII[10]];
        ak.llIIIlIll[ak.llIIIllII[1]] = "teleport";
        ak.llIIIlIll[ak.llIIIllII[0]] = "Prayer";
        ak.llIIIlIll[ak.llIIIllII[8]] = "Super rest";
        ak.llIIIlIll[ak.llIIIllII[9]] = "Eat";
    }

    private static boolean lIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ak.lIlIllIIIII();
        ak.lIlIlIlllll();
    }

    private static boolean lIlIllIIIlI(Object object) {
        return object == null;
    }

    private boolean U() {
        Spell spell = Arrays.stream(SpellBook.Standard.values()).filter(standard -> {
            int n2;
            if (ak.lIlIllIIlII(standard.canCast() ? 1 : 0) && ak.lIlIllIIlII(standard.toString().toLowerCase().contains(llIIIlIll[llIIIllII[1]]) ? 1 : 0)) {
                n2 = llIIIllII[0];

                }
            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }).findFirst().orElse(null);
        if (ak.lIlIllIIIlI(spell)) {
            return llIIIllII[1];
        }
        Magic.cast((Spell)spell);
        return llIIIllII[0];
    }

    private static boolean lIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        ak lIllIllIlllllll;
        void lIllIllIllllllI;
        int[] nArray = new int[llIIIllII[0]];
        nArray[ak.llIIIllII[1]] = llIIIllII[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIllII[3], llIIIllII[4], llIIIllII[5], llIIIllII[6], llIIIllII[1]);
        if (ak.lIlIllIIIIl(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIllII[1];
        }
        if (ak.lIlIllIIIlI(lIllIllIllllllI)) {
            return llIIIllII[1];
        }
        if (ak.lIlIllIIIll(Combat.getCurrentHealth(), llIIIllII[7]) && ak.lIlIllIIIIl(Inventory.contains(item -> item.hasAction(llIIIlIll[llIIIllII[9]]::equals)) ? 1 : 0)) {
            return lIllIllIlllllll.U();
        }
        if (ak.lIlIllIIIIl(Prayers.getPoints()) && ak.lIlIllIIIIl(Inventory.contains(item -> {
            int n2;
            if (!ak.lIlIllIIIIl(item.getName().startsWith(llIIIlIll[llIIIllII[0]]) ? 1 : 0) || ak.lIlIllIIlII(item.getName().startsWith(llIIIlIll[llIIIllII[8]]) ? 1 : 0)) {
                n2 = llIIIllII[0];

            } else {
                n2 = llIIIllII[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIllIllIlllllll.U();
        }
        return llIIIllII[1];
    }

    @Inject
    private TeleportingOutTask(a a2) {
        this.cP = a2;
    }

    private static boolean lIlIllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(lIllIllIllIlIlI);
    }

}

