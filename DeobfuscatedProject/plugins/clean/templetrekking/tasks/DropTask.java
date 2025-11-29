/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drop task")
public class DropTask
extends Task {
    
    private final  TempleTrekkingPlugin H;

    private static void lIllIIIIIIllllI() {
        lIIllIIllllII = new String[lIIllIIlllllI[1]];
        m.lIIllIIllllII[m.lIIllIIlllllI[0]] = "Logs";
    }

    private static boolean lIllIIIIIlIIIII(int n2) {
        return n2 == 0;
    }

    static {
        m.lIllIIIIIIlllll();
        m.lIllIIIIIIllllI();
    }

    @Inject
    public DropTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        this.H = templeTrekkingPlugin;
    }

    public boolean run() {
        if (m.lIllIIIIIlIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIIllIIlllllI[0];
        }
        String[] stringArray = new String[lIIllIIlllllI[1]];
        stringArray[m.lIIllIIlllllI[0]] = lIIllIIllllII[lIIllIIlllllI[0]];
        return Inventory.dropAll((String[])stringArray);
    }
}

