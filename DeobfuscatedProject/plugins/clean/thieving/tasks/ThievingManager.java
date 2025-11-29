/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.LuringNewTargetTask;

class ThievingManager
implements Runnable {
    
    final  o X;
    
    final  TileObject W;

    private static boolean lIllIIllIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    ThievingManager(o o2, TileObject tileObject) {
        this.X = o2;
        this.W = tileObject;
    }

    static {
        p.lIllIIllIIIIlII();
        p.lIllIIllIIIIIll();
    }

    private static void lIllIIllIIIIIll() {
        lIIlllIIlIIll = new String[lIIlllIIlIlII[2]];
        p.lIIlllIIlIIll[p.lIIlllIIlIlII[0]] = "Open";
        p.lIIlllIIlIIll[p.lIIlllIIlIlII[1]] = "Open";
    }

    private static boolean lIllIIllIIIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public void run() {
        if (p.lIllIIllIIIIlIl(this.W.hasAction(lIIlllIIlIIll[lIIlllIIlIlII[0]]::equals) ? 1 : 0)) {
            this.W.interact(lIIlllIIlIIll[lIIlllIIlIlII[1]]);
            return;
        }
        Movement.walkTo((WorldPoint)this.W.getWorldLocation().dy(lIIlllIIlIlII[1]));

    }

        return String.valueOf(var1);
    }

}

