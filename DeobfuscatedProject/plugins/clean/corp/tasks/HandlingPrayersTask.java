/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class HandlingPrayersTask
extends Task {

    static {
        c.lllIIIlllIIlll();
        c.lllIIIlllIIllI();
    }

    private static void lllIIIlllIIllI() {
        lIllIIIIIllI = new String[lIllIIIIIlll[0]];
        c.lIllIIIIIllI[c.lIllIIIIIlll[1]] = "Corporeal Beast";
    }

    private static boolean lllIIIlllIlIII(Object object) {
        return object == null;
    }

    public boolean run() {
        String[] stringArray = new String[lIllIIIIIlll[0]];
        stringArray[c.lIllIIIIIlll[1]] = lIllIIIIIllI[lIllIIIIIlll[1]];
        if (c.lllIIIlllIlIII(NPCs.getNearest((String[])stringArray))) {
            Prayers.disableAll();
            return lIllIIIIIlll[1];
        }
        ArrayList<Prayer> var1 = new ArrayList<Prayer>(List.of(Prayer.PROTECT_FROM_MAGIC));
        var1.addAll(Prayers.getMeleePrayer());

        if (c.lllIIIlllIlIIl(Prayers.flick(var1) ? 1 : 0)) {
            c var2;
            var2.sleep(lIllIIIIIlll[0]);
        }
        return lIllIIIIIlll[0];
    }

    private static boolean lllIIIlllIlIIl(int n2) {
        return n2 != 0;
    }

}

