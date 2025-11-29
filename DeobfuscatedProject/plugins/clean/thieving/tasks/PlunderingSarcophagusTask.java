/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Plundering Sarcophagus", priority=1)
public class PlunderingSarcophagusTask
extends ThievingTaskBase {

    private static boolean lIIlIlIIIlIIIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIIlIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean PlunderingSarcophagusTask() {
        void var2_2;
        block7: {
            block6: {
                void var2;
                j var3;
                c c2 = c.f();
                if (j.lIIlIlIIIlIIIIl((Object)c2)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIlI(var3.D.c((GameEnum) ar2) ? 1 : 0)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIll(Players.getLocal().getAnimation(), llllllIIlllI[1])) {
                    return llllllIIlllI[0];
                }
                int[] nArray = new int[llllllIIlllI[2]];
                nArray[j.llllllIIlllI[0]] = llllllIIlllI[3];
                TileObject var4 = TileObjects.getNearest((int[])nArray);
                if (!j.lIIlIlIIIlIIlII(var4)) break block6;
                String[] stringArray = new String[llllllIIlllI[2]];
                stringArray[j.llllllIIlllI[0]] = llllllIIllIl[llllllIIlllI[0]];
                if (!j.lIIlIlIIIlIIIlI(var4.hasAction(stringArray) ? 1 : 0)) break block7;
            }
            return llllllIIlllI[0];
        }
        var2_2.interact(llllllIIllIl[llllllIIlllI[2]]);
        return llllllIIlllI[2];
    }

    @Inject
    protected PlunderingSarcophagusTask(a a2, Client client) {
        super(a2, client);
    }

    private static boolean lIIlIlIIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIllIl = new String[llllllIIlllI[4]];
        j.llllllIIllIl[j.llllllIIlllI[0]] = "Open";
        j.llllllIIllIl[j.llllllIIlllI[2]] = "Open";
    }

    private static boolean lIIlIlIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIIlIlIIIlIIIII();
        j.lIIlIlIIIIlllll();
    }
}

