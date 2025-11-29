/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Overload", priority=20, blocking=true)
public class DrinkOverloadTask
extends Task {

    private final  Client N;
    private final  SquireNightmareZone L;
    private final  SquireNightmareZoneConfig M;

    private static void lIIllllIlIlllll() {
        lIIIlIIIlllll = new String[lIIIlIIlIIIII[5]];
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[0]] = "Under 51 hp, not overloading";
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[3]] = "Drink";
        f.lIIIlIIIlllll[f.lIIIlIIlIIIII[4]] = "Overload (";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var1;
        if (f.lIIllllIllIIIIl(this.M.overload())) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIIl(var1.N.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIIII[0];
        }
        int var2 = Static.getClient().getVarbitValue(lIIIlIIlIIIII[1]);
        if (f.lIIllllIllIIIlI(var2)) {
            return lIIIlIIlIIIII[0];
        }
        if (f.lIIllllIllIIIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIlIIlIIIII[2])) {
            Log.error((String)lIIIlIIIlllll[lIIIlIIlIIIII[0]]);
            return lIIIlIIlIIIII[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlllll[lIIIlIIlIIIII[4]]));
        if (f.lIIllllIllIIlII(var3)) {
            return lIIIlIIlIIIII[0];
        }
        var2_2.interact(lIIIlIIIlllll[lIIIlIIlIIIII[3]]);
        return lIIIlIIlIIIII[3];
    }

    private static boolean lIIllllIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllllIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIllIIIlI(int n2) {
        return n2 > 0;
    }

    @Inject
    public DrinkOverloadTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.L = squireNightmareZone;
        this.M = squireNightmareZoneConfig;
        this.N = client;
    }

    static {
        f.lIIllllIllIIIII();
        f.lIIllllIlIlllll();
    }

    private static boolean lIIllllIllIIlII(Object object) {
        return object == null;
    }

}

