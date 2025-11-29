/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;

@TaskDesc(name="Tethering to mast", priority=0x7FFFFFFE, blocking=true)
public class TetheringToMastTask
extends Task {
    
    private final  SquireTempoross aw;
    private final  SquireTemporossConfig ax;
    private final  a av;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        n var1;
        if (n.lIllIIlIlIIlIlI(this.av.K() ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        if (n.lIllIIlIlIIlIll(var1.av.k() ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        c var2 = var1.av.N();
        TileObject var3 = var2.W();
        if (n.lIllIIlIlIIllII(var3)) {
            return lIIlllIIlIIII[0];
        }
        NPC var4 = var1.aw.a((SceneEntity)var3);
        if (n.lIllIIlIlIIllIl(var4)) {
            return var1.aw.b((SceneEntity)var3);
        }
        var2_2.interact(lIIlllIIIllll[lIIlllIIlIIII[0]]);
        return lIIlllIIlIIII[1];
    }

    @Inject
    public TetheringToMastTask(a a2, SquireTemporossConfig squireTemporossConfig, SquireTempoross squireTempoross) {
        this.av = a2;
        this.ax = squireTemporossConfig;
        this.aw = squireTempoross;
    }

    private static void lIllIIlIlIIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[1]];
        n.lIIlllIIIllll[n.lIIlllIIlIIII[0]] = "Tether";
    }

    static {
        n.lIllIIlIlIIlIIl();
        n.lIllIIlIlIIlIII();
    }

    private static boolean lIllIIlIlIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIllII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIlIIlIlI(int n2) {
        return n2 == 0;
    }
}

