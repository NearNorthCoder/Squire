/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Grab fungus", blocking=true, priority=1)
public class bR
extends Task {
    private /* synthetic */ int gR;
    private static /* synthetic */ int[] lllIIllI;
    private final /* synthetic */ SecondariesPlugin gQ;
    private static /* synthetic */ String[] lllIIlII;

    private static boolean llIIlIllll(int n2) {
        return n2 != 0;
    }

    private static void llIIlIllII() {
        lllIIlII = new String[lllIIllI[1]];
        bR.lllIIlII[bR.lllIIllI[0]] = bR."Pick";
    }

    private static boolean llIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        void llIlIIlllIlllll;
        bR llIlIIllllIIIII;
        WorldPoint worldPoint = this.gQ.cT();
        if (bR.llIIlIlllI(worldPoint)) {
            return lllIIllI[0];
        }
        if (bR.llIIlIllll(Inventory.isFull() ? 1 : 0)) {
            return lllIIllI[0];
        }
        int llIlIIlllIllllI = Static.getClient().getTickCount();
        if (bR.llIIllIIII(llIlIIlllIllllI - llIlIIllllIIIII.gR, lllIIllI[1])) {
            return lllIIllI[1];
        }
        int[] nArray = new int[lllIIllI[1]];
        nArray[bR.lllIIllI[0]] = lllIIllI[2];
        TileObject llIlIIlllIlllIl = TileObjects.getFirstSurrounding((WorldPoint)llIlIIlllIlllll, (int)lllIIllI[1], (int[])nArray);
        if (bR.llIIlIlllI(llIlIIlllIlllIl)) {
            return lllIIllI[0];
        }
        var3_3.interact(lllIIlII[lllIIllI[0]]);
        this.gR = var2_2;
        return lllIIllI[1];
    }

    private static String llIIlIIllI(String llIlIIlllIlIIll, String llIlIIlllIlIIlI) {
        try {
            SecretKeySpec llIlIIlllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), lllIIllI[3]), "DES");
            Cipher llIlIIlllIlIlll = Cipher.getInstance("DES");
            llIlIIlllIlIlll.init(lllIIllI[4], llIlIIlllIllIII);
            return new String(llIlIIlllIlIlll.doFinal(Base64.getDecoder().decode(llIlIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlllIlIllI) {
            llIlIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public bR(SecondariesPlugin secondariesPlugin) {
        this.gQ = secondariesPlugin;
    }

    static {
        bR.llIIlIllIl();
        bR.llIIlIllII();
    }

    private static void llIIlIllIl() {
        lllIIllI = new int[5];
        bR.lllIIllI[0] = (0x37 ^ 0x73) & ~(0x25 ^ 0x61);
        bR.lllIIllI[1] = 1;
        bR.lllIIllI[2] = 0xFFFFBDBD & 0x4FF7;
        bR.lllIIllI[3] = 0x89 ^ 0x81;
        bR.lllIIllI[4] = 2;
    }
}

