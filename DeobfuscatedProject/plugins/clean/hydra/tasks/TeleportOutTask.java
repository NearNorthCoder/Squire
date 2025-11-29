/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Teleport out", priority=250, blocking=true)
public class TeleportOutTask
extends Task {
    private final  SquireAlchemicalHydraConfig bg;
    
    private final  SquireAlchemicalHydraPlugin bf;
    
    private final  a be;

    private static void lIIlIIIIlllIlll() {
        llllIlIlIIII = new String[llllIlIlIlII[13]];
        C.llllIlIlIIII[C.llllIlIlIlII[0]] = "Take";
        C.llllIlIlIIII[C.llllIlIlIlII[1]] = "Cannot find tp item";
        C.llllIlIlIIII[C.llllIlIlIlII[2]] = "Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[3]] = "Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[4]] = "Break";
        C.llllIlIlIIII[C.llllIlIlIlII[5]] = "Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[6]] = "Teleport";
        C.llllIlIlIIII[C.llllIlIlIlII[7]] = "Break";
        C.llllIlIlIIII[C.llllIlIlIlII[8]] = "Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[9]] = "Teleport";
        C.llllIlIlIIII[C.llllIlIlIlII[10]] = "Drink";
        C.llllIlIlIIII[C.llllIlIlIlII[11]] = "anti";
        C.llllIlIlIIII[C.llllIlIlIlII[12]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        int var1;
        int n2;
        int var2;
        int n3;
        C var3;
        if (C.lIIlIIIIllllIIl(this.be.g() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIlI(var3.be.k())) {
            return llllIlIlIlII[0];
        }
        NPC var4 = var3.be.k().K();
        if (!C.lIIlIIIIllllIll(var4) || C.lIIlIIIIlllllII(var4.isDead() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(Inventory.contains(item -> {
            String[] stringArray = new String[llllIlIlIlII[1]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0) && C.lIIlIIIIlllllIl(Combat.getMissingHealth(), var3.bg.eatAt())) {
            n3 = llllIlIlIlII[1];

            if (1 <= 0) {
                return false;
            }
        } else {
            n3 = var2 = llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(Inventory.contains(item -> {
            int n2;
            String[] stringArray = new String[llllIlIlIlII[1]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[10]];
            if (C.lIIlIIIIlllllII(item.hasAction(stringArray) ? 1 : 0) && C.lIIlIIIIlllllII(item.getName().toLowerCase().contains(llllIlIlIIII[llllIlIlIlII[11]]) ? 1 : 0)) {
                n2 = llllIlIlIlII[1];

                }
            } else {
                n2 = llllIlIlIlII[0];
            }
            return n2 != 0;
        }) ? 1 : 0) && C.lIIlIIIIlllllII(Combat.isPoisoned() ? 1 : 0)) {
            n2 = llllIlIlIlII[1];

            if (((0xBD ^ 0xB6) & ~(0x2B ^ 0x20)) < -1) {
                return false;
            }
        } else {
            n2 = var1 = llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(var2) && C.lIIlIIIIllllIIl(var1) && C.lIIlIIIIllllIIl(var3.bf.c() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        List var5 = TileItems.getAll();
        if (C.lIIlIIIIllllIIl(var5.isEmpty() ? 1 : 0) && C.lIIlIIIIllllIIl(Inventory.isFull() ? 1 : 0)) {
            ((TileItem)var5.iterator().next()).interact(llllIlIlIIII[llllIlIlIlII[0]]);
            return llllIlIlIlII[1];
        }
        Item var6 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIlIlII[3]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[7]];
            stringArray[C.llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[8]];
            stringArray[C.llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[9]];
            return item.hasAction(stringArray);
        });
        if (C.lIIlIIIIllllIlI(var6)) {
            Log.info((String)llllIlIlIIII[llllIlIlIlII[1]]);
            Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
            return llllIlIlIlII[1];
        }
        String[] stringArray = new String[llllIlIlIlII[1]];
        stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[2]];
        if (C.lIIlIIIIlllllII(var6.hasAction(stringArray) ? 1 : 0)) {
            var6.interact(llllIlIlIIII[llllIlIlIlII[3]]);
            return llllIlIlIlII[1];
        }
        String[] stringArray2 = new String[llllIlIlIlII[3]];
        stringArray2[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[4]];
        stringArray2[C.llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[5]];
        stringArray2[C.llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[6]];
        var5_5.interact(stringArray2);
        return llllIlIlIlII[1];
    }

    private static boolean lIIlIIIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIlllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIlllllII(int n2) {
        return n2 != 0;
    }

    static {
        C.lIIlIIIIllllIII();
        C.lIIlIIIIlllIlll();
    }

    @Inject
    public TeleportOutTask(a a2, SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.be = a2;
        this.bf = squireAlchemicalHydraPlugin;
        this.bg = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIllllIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var7);
    }

    private static boolean lIIlIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIllllIlI(Object object) {
        return object == null;
    }
}

