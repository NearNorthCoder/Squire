/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching loot")
public class AlchingLootTask
extends Task {

    private final  LooterConfig ey;

    private static void lIIIIlIlIlI() {
        lIIlIllll = new String[lIIllIIII[2]];
        aJ.lIIlIllll[aJ.lIIllIIII[0]] = ",";
    }

    private static boolean lIIIIlIllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public AlchingLootTask(LooterConfig looterConfig) {
        this.ey = looterConfig;
    }

    private static boolean lIIIIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item = Inventory.getFirst((int[])this.ck());
        if (aJ.lIIIIlIllII(item)) {
            return lIIllIIII[0];
        }
        SpellBook.Standard llIIIllIlIlllIl = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (aJ.lIIIIlIllIl(llIIIllIlIlllIl.canCast() ? 1 : 0)) {
            return lIIllIIII[0];
        }
        Magic.cast((Spell)var2_2, (Item)item);
        this.sleep(lIIllIIII[1]);
        return lIIllIIII[2];
    }

    private static boolean lIIIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ck() {
        void var2_2;
        aJ llIIIllIlIllIII;
        if (aJ.lIIIIlIlllI(this.ey.alch().isEmpty() ? 1 : 0)) {
            return new int[lIIllIIII[0]];
        }
        String[] llIIIllIlIlIlll = llIIIllIlIllIII.ey.alch().split(lIIlIllll[lIIllIIII[0]]);
        int[] llIIIllIlIlIllI = new int[llIIIllIlIlIlll.length];
        int llIIIllIlIlIlIl = lIIllIIII[0];
        while (aJ.lIIIIlIllll(llIIIllIlIlIlIl, llIIIllIlIlIlll.length)) {
            llIIIllIlIlIllI[llIIIllIlIlIlIl] = Integer.parseInt(llIIIllIlIlIlll[llIIIllIlIlIlIl].trim());
            ++llIIIllIlIlIlIl;

            if (((0xF ^ 0x63 ^ (0x2D ^ 0x1E)) & (0xF ^ 0x55 ^ (0xB1 ^ 0xB4) ^ -1)) == 0) continue;
            return null;
        }
        return var2_2;
    }

    private static boolean lIIIIlIllII(Object object) {
        return object == null;
    }

    static {
        aJ.lIIIIlIlIll();
        aJ.lIIIIlIlIlI();
    }

}

