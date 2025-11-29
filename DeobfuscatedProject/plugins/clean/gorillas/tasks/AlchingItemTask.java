/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching item", priority=100)
public class AlchingItemTask
extends Task {

    private static final  List<String> ai;

    private static boolean lllllIIllllIll(int n2) {
        return n2 == 0;
    }

    static {
        v.lllllIIllllIIl();
        v.lllllIIllllIII();
        String[] stringArray = new String[llIIlIIllIIl[2]];
        stringArray[v.llIIlIIllIIl[0]] = llIIlIIllIII[llIIlIIllIIl[0]];
        stringArray[v.llIIlIIllIIl[1]] = llIIlIIllIII[llIIlIIllIIl[1]];
        stringArray[v.llIIlIIllIIl[3]] = llIIlIIllIII[llIIlIIllIIl[3]];
        stringArray[v.llIIlIIllIIl[4]] = llIIlIIllIII[llIIlIIllIIl[4]];
        stringArray[v.llIIlIIllIIl[5]] = llIIlIIllIII[llIIlIIllIIl[5]];
        stringArray[v.llIIlIIllIIl[6]] = llIIlIIllIII[llIIlIIllIIl[6]];
        stringArray[v.llIIlIIllIIl[7]] = llIIlIIllIII[llIIlIIllIIl[7]];
        stringArray[v.llIIlIIllIIl[8]] = llIIlIIllIII[llIIlIIllIIl[8]];
        stringArray[v.llIIlIIllIIl[9]] = llIIlIIllIII[llIIlIIllIIl[9]];
        stringArray[v.llIIlIIllIIl[10]] = llIIlIIllIII[llIIlIIllIIl[10]];
        stringArray[v.llIIlIIllIIl[11]] = llIIlIIllIII[llIIlIIllIIl[11]];
        stringArray[v.llIIlIIllIIl[12]] = llIIlIIllIII[llIIlIIllIIl[12]];
        stringArray[v.llIIlIIllIIl[13]] = llIIlIIllIII[llIIlIIllIIl[13]];
        ai = List.of(stringArray);
    }

    private static void lllllIIllllIII() {
        llIIlIIllIII = new String[llIIlIIllIIl[2]];
        v.llIIlIIllIII[v.llIIlIIllIIl[0]] = "Rune platebody";
        v.llIIlIIllIII[v.llIIlIIllIIl[1]] = "Rune 2h sword";
        v.llIIlIIllIII[v.llIIlIIllIIl[3]] = "Rune longsword";
        v.llIIlIIllIII[v.llIIlIIllIIl[4]] = "Rune pickaxe";
        v.llIIlIIllIII[v.llIIlIIllIIl[5]] = "Rune kiteshield";
        v.llIIlIIllIII[v.llIIlIIllIIl[6]] = "Rune med helm";
        v.llIIlIIllIII[v.llIIlIIllIIl[7]] = "Rune platelegs";
        v.llIIlIIllIII[v.llIIlIIllIIl[8]] = "Rune chainbody";
        v.llIIlIIllIII[v.llIIlIIllIIl[9]] = "Rune warhammer";
        v.llIIlIIllIII[v.llIIlIIllIIl[10]] = "Rune plateskirt";
        v.llIIlIIllIII[v.llIIlIIllIIl[11]] = "Rune battleaxe";
        v.llIIlIIllIII[v.llIIlIIllIIl[12]] = "Rune sq shield";
        v.llIIlIIllIII[v.llIIlIIllIIl[13]] = "Dragon scimitar";
    }

    private static boolean lllllIIllllIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item2 = Inventory.getFirst(item -> ai.contains(item.getName()));
        if (v.lllllIIllllIlI(item2)) {
            return llIIlIIllIIl[0];
        }
        SpellBook.Standard var1 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (v.lllllIIllllIll(var1.canCast() ? 1 : 0)) {
            return llIIlIIllIIl[0];
        }
        Magic.cast((Spell)var2_2);
        item2.interact(llIIlIIllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), item2.getSlot(), WidgetInfo.INVENTORY.getId());
        return llIIlIIllIIl[1];
    }

    private static boolean lllllIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }
}

