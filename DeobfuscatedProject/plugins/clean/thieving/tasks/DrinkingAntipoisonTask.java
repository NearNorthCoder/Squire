/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Drinking antipoison", priority=0x7FFFFFFE, blocking=true)
public class DrinkingAntipoisonTask
extends ThievingTaskBase {

    @Override
    public boolean l() {
        if (t.lIllIIIllllllIl(Inventory.contains(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[3]])) ? 1 : 0)) {
            Log.error((String)lIIllIllllIII[lIIllIllllIIl[0]]);
            this.ad.forceStop();
        }
        if (t.lIllIIIllllllIl(Combat.isPoisoned() ? 1 : 0)) {
            return lIIllIllllIIl[0];
        }
        Inventory.getFirst(item -> item.getName().contains(lIIllIllllIII[lIIllIllllIIl[2]])).interact(lIIllIllllIII[lIIllIllllIIl[1]]);
        return lIIllIllllIIl[1];
    }

    private static void lIllIIIlllllIll() {
        lIIllIllllIII = new String[lIIllIllllIIl[4]];
        t.lIIllIllllIII[t.lIIllIllllIIl[0]] = "We are out of antipoisons!!";
        t.lIIllIllllIII[t.lIIllIllllIIl[1]] = "Drink";
        t.lIIllIllllIII[t.lIIllIllllIIl[2]] = "ntipoison";
        t.lIIllIllllIII[t.lIIllIllllIIl[3]] = "ntipoison";
    }

    @Inject
    public DrinkingAntipoisonTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIIllllllIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIllIIIllllllII();
        t.lIllIIIlllllIll();
    }

}

