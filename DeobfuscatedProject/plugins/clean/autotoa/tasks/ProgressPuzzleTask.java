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
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Progress Puzzle")
public class ProgressPuzzleTask
extends AutotoaTaskBase {

    private static boolean lIlIIlllIIIlll(Object object) {
        return object != null;
    }

    @Inject
    protected ProgressPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

    private static void lIlIIlllIIIIIl() {
        llIlIlIlIlI = new String[llIlIlIlIll[4]];
        bt.llIlIlIlIlI[bt.llIlIlIlIll[1]] = "Barrier";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[0]] = "Crawl-through";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[3]] = "Platform";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[2]] = "Jump-to";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[5]] = "Quick-pass";
        bt.llIlIlIlIlI[bt.llIlIlIlIll[6]] = "Passage";
    }

    private static boolean lIlIIlllIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var1;
        bt var2;
        String[] stringArray = new String[llIlIlIlIll[0]];
        stringArray[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[1]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        if (bt.lIlIIlllIIIIll(tileObject2)) {
            return llIlIlIlIll[1];
        }
        int var3 = var2.cu.getLocalPlayer().getWorldX();
        if (bt.lIlIIlllIIIlII(var1.getWorldX(), var3)) {
            if (bt.lIlIIlllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                return llIlIlIlIll[1];
            }
            if (bt.lIlIIlllIIIllI(var3, var2.fh.Z())) {
                return llIlIlIlIll[1];
            }
            TileObject var4 = TileObjects.getNearest(tileObject -> tileObject.getName().equals(llIlIlIlIlI[llIlIlIlIll[6]]));
            if (bt.lIlIIlllIIIlll(var4) && bt.lIlIIlllIIlIII(Math.abs(var4.getWorldX() - var2.fh.Z()), llIlIlIlIll[2])) {
                var4.interact(llIlIlIlIlI[llIlIlIlIll[0]]);
                return llIlIlIlIll[0];
            }
            String[] stringArray2 = new String[llIlIlIlIll[0]];
            stringArray2[bt.llIlIlIlIll[1]] = llIlIlIlIlI[llIlIlIlIll[3]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray2);
            if (bt.lIlIIlllIIIlll(var5) && bt.lIlIIlllIIIlII(var5.getWorldX(), var2.fh.Z()) && bt.lIlIIlllIIlIII(Math.abs(var5.getWorldX() - var2.fh.Z()), llIlIlIlIll[4])) {
                var5.interact(llIlIlIlIlI[llIlIlIlIll[2]]);
                return llIlIlIlIll[0];
            }
            return llIlIlIlIll[1];
        }
        tileObject2.interact(llIlIlIlIlI[llIlIlIlIll[5]]);
        return llIlIlIlIll[0];
    }

    private static boolean lIlIIlllIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIIIIll(Object object) {
        return object == null;
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIIlllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        bt.lIlIIlllIIIIlI();
        bt.lIlIIlllIIIIIl();
    }

    @Override
    public int bZ() {
        return this.fh.Z() + llIlIlIlIll[0];
    }
}

