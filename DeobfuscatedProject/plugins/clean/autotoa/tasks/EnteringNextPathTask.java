/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum104;

@TaskDesc(name="Entering next path", priority=20, blocking=true)
public class EnteringNextPathTask
extends AutotoaTaskBase {
    private final  TOAConfig ce;
    private final  B cd;
    
    private static final  int cc;

    private static boolean lIIlIlllIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var1;
        U var2;
        if (U.lIIlIlllIllIlI(this.j(lIllIlIllll[0]) ? 1 : 0)) {
            return lIllIlIllll[1];
        }
        TileObject tileObject = new l[lIllIlIllll[2]];
        tileObject[U.lIllIlIllll[1]] = var2.ce.firstRoom();
        tileObject[U.lIllIlIllll[3]] = var2.ce.secondRoom();
        tileObject[U.lIllIlIllll[4]] = var2.ce.thirdRoom();
        tileObject[U.lIllIlIllll[5]] = var2.ce.fourthRoom();
        TileObject var3 = var1 = tileObject;
        int var4 = ((l[])var3).length;
        int var5 = lIllIlIllll[1];
        while (U.lIIlIlllIllIll(var5, var4)) {
            l var6 = var3[var5];
            int[] nArray = new int[lIllIlIllll[3]];
            nArray[U.lIllIlIllll[1]] = var6.F();
            TileObject var7 = TileObjects.getNearest((int[])nArray);
            if (U.lIIlIlllIlllII(var7)) {
                var2.cd.a(var6);

                }
            } else {
                var7.interact(lIllIlIlllI[lIllIlIllll[1]]);
                return lIllIlIllll[3];
            }
            ++var5;

            if (2 > 0) continue;
            return ((0x5B ^ 0x12 ^ (0xF ^ 0x72)) & (0x9F ^ 0xC5 ^ (0xA ^ 0x64) ^ -1)) != 0;
        }
        String[] stringArray = new String[lIllIlIllll[3]];
        stringArray[U.lIllIlIllll[1]] = lIllIlIlllI[lIllIlIllll[3]];
        var3 = TileObjects.getNearest((String[])stringArray);
        if (U.lIIlIlllIlllIl(var3)) {
            var3.interact(lIllIlIlllI[lIllIlIllll[4]]);
            return lIllIlIllll[3];
        }
        return lIllIlIllll[1];
    }

    private static void lIIlIlllIllIII() {
        lIllIlIlllI = new String[lIllIlIllll[5]];
        U.lIllIlIlllI[U.lIllIlIllll[1]] = "Quick-Enter";
        U.lIllIlIlllI[U.lIllIlIllll[3]] = "Entry";
        U.lIllIlIlllI[U.lIllIlIllll[4]] = "Quick-Enter";
    }

    private static boolean lIIlIlllIlllII(Object object) {
        return object == null;
    }

    static {
        U.lIIlIlllIllIIl();
        U.lIIlIlllIllIII();
        cc = lIllIlIllll[0];
    }

    @Inject
    protected EnteringNextPathTask(Client client, B b2, TOAConfig tOAConfig) {
        super(client);
        this.cd = b2;
        this.ce = tOAConfig;
    }

    private static boolean lIIlIlllIllIlI(int n2) {
        return n2 == 0;
    }
}

