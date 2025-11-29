/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends Task {

    private final  a aP;

    private static boolean llIIllIlllI(Object object) {
        return object != null;
    }

    private static void llIIllIlIlI() {
        lllIllllI = new String[lllIlllll[1]];
        z.lllIllllI[z.lllIlllll[0]] = "Attack";
    }

    @Inject
    public UsingThrallTask(a a2) {
        this.aP = a2;
    }

    public boolean run() {
        z lIlIlIIIIlIIIlI;
        if (z.llIIllIllII(Thralls.canUse() ? 1 : 0)) {
            return lllIlllll[0];
        }
        if (z.llIIllIllIl(lIlIlIIIIlIIIlI.aP.k())) {
            return lllIlllll[0];
        }
        NPC lIlIlIIIIlIIIIl = lIlIlIIIIlIIIlI.aP.k().y();
        if (z.llIIllIlllI(lIlIlIIIIlIIIIl)) {
            String[] stringArray = new String[lllIlllll[1]];
            stringArray[z.lllIlllll[0]] = lllIllllI[lllIlllll[0]];
            if (z.llIIllIllII(lIlIlIIIIlIIIIl.hasAction(stringArray) ? 1 : 0)) {
                return lllIlllll[0];
            }
        }
        return Thralls.useBestThrall();
    }

    static {
        z.llIIllIlIll();
        z.llIIllIlIlI();
    }

    private static boolean llIIllIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIllIllII(int n2) {
        return n2 == 0;
    }
}

