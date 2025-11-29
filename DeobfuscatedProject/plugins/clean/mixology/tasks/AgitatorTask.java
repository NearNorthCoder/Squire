/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Agitator task")
public class AgitatorTask
extends Task {
    
    private final  SquireMixologyConfig R;
    
    final  int Q = 5674;

    private static boolean lIIlIlIlIlIIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public AgitatorTask(SquireMixologyConfig squireMixologyConfig) {
        this.Q = lllllllIlIll[0];
        this.R = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIlIlIlIlIIIIl();
        j.lIIlIlIlIIlllll();
    }

    private static boolean lIIlIlIlIlIIIll(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j var1;
        if (j.lIIlIlIlIlIIIlI(s.e() ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIll((Object)var1.R.pluginMode(), (Object)d.MINIGAME)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIlI(s.a(lllllllIlIll[2], lllllllIlIll[3], lllllllIlIll[4]) ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIlI(Players.getLocal().isIdle() ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIlII((Object)var1.R.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (j.lIIlIlIlIlIIIlI(s.g() ? 1 : 0) && j.lIIlIlIlIlIIlIl(Vars.getBit((int)lllllllIlIll[3]), lllllllIlIll[5])) {
                return lllllllIlIll[1];
            }
            s.AgitatorTask();
            if (j.lIIlIlIlIlIIllI(SquireMixology.x, lllllllIlIll[0])) {
                return lllllllIlIll[1];
            }
        }
        if (j.lIIlIlIlIlIIIll((Object)var1.R.potionStrategy(), (Object)f.MULTI_ORDER) && j.lIIlIlIlIlIIllI(SquireMixology.r, lllllllIlIll[0])) {
            return lllllllIlIll[1];
        }
        SquireMixology.g = lllllllIlIlI[lllllllIlIll[1]];
        int[] nArray = new int[lllllllIlIll[5]];
        nArray[j.lllllllIlIll[1]] = lllllllIlIll[4];
        TileObjects.getNearest((int[])nArray).interact(lllllllIlIll[1]);
        return lllllllIlIll[1];
    }

    private static void lIIlIlIlIIlllll() {
        lllllllIlIlI = new String[lllllllIlIll[5]];
        j.lllllllIlIlI[j.lllllllIlIll[1]] = "Homogenising";
    }

    private static boolean lIIlIlIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIlIIlII(Object object, Object object2) {
        return object == object2;
    }

}

