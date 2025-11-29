/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import gg.squire.mining.tasks.GameEnum16;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Mining Daeyalt Essence")
public class MiningDaeyaltEssenceTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIIlIIlIllIllIl((Object)this.f.activity(), (Object)a.DAEYALT)) {
            return lllllIIllIII[0];
        }
        TileObject var1 = g.h();
        if (m.lIIlIIlIllIlllI(var1)) {
            return lllllIIllIII[0];
        }
        if (m.lIIlIIlIllIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            m var2;
            var2.sleep(lllllIIllIII[1]);
            return lllllIIllIII[0];
        }
        var1_1.interact(lllllIIlIlll[lllllIIllIII[0]]);
        this.sleep(lllllIIllIII[1]);
        return lllllIIllIII[2];
    }

    private static boolean lIIlIIlIllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.lIIlIIlIllIllII();
        m.lIIlIIlIllIlIll();
    }

    private static boolean lIIlIIlIllIlllI(Object object) {
        return object == null;
    }

    private static void lIIlIIlIllIlIll() {
        lllllIIlIlll = new String[lllllIIllIII[2]];
        m.lllllIIlIlll[m.lllllIIllIII[0]] = "Mine";
    }
}

