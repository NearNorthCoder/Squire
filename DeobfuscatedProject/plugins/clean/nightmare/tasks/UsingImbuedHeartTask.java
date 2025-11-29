/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Using imbued heart", priority=6)
public class UsingImbuedHeartTask
extends NightmareTaskBase {

    private static boolean lIIlIIIIIIlIlll(int n2) {
        return n2 != 0;
    }

    static {
        as.lIIlIIIIIIlIllI();
        as.lIIlIIIIIIlIlIl();
    }

    private static void lIIlIIIIIIlIlIl() {
        llllIIllllII = new String[llllIIllllIl[3]];
        as.llllIIllllII[as.llllIIllllIl[0]] = "Invigorate";
    }

    @Inject
    protected UsingImbuedHeartTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (as.lIIlIIIIIIlIlll(this.bZ() ? 1 : 0) && as.lIIlIIIIIIllIII(Magic.canCast((Spell)necromancy) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        int[] nArray = new int[llllIIllllIl[1]];
        nArray[as.llllIIllllIl[0]] = llllIIllllIl[2];
        nArray[as.llllIIllllIl[3]] = llllIIllllIl[4];
        Item var1 = Inventory.getFirst((int[])nArray);
        if (as.lIIlIIIIIIllIIl(var1)) {
            return llllIIllllIl[0];
        }
        int var2 = Vars.getBit((int)llllIIllllIl[5]);
        if (as.lIIlIIIIIIllIlI(var2)) {
            return llllIIllllIl[0];
        }
        var2_2.interact(llllIIllllII[llllIIllllIl[0]]);
        return llllIIllllIl[3];
    }

    private static boolean lIIlIIIIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIIIllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIIllIIl(Object object) {
        return object == null;
    }
}

