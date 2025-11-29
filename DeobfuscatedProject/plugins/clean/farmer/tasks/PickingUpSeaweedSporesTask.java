/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum62;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Picking up seaweed spores", priority=0x7FFFFFFF, blocking=true)
public class PickingUpSeaweedSporesTask
extends Task {
    
    private final  SquireFarmerConfig cT;

    private static void lllIllllllIlIl() {
        lIlllllIllIl = new String[lIlllllIlllI[1]];
        bg.lIlllllIllIl[bg.lIlllllIlllI[0]] = "Take";
    }

    private static boolean lllIllllllIlll(int n2) {
        return n2 == 0;
    }

    static {
        bg.lllIllllllIllI();
        bg.lllIllllllIlIl();
    }

    private static boolean lllIlllllllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public PickingUpSeaweedSporesTask(SquireFarmerConfig squireFarmerConfig) {
        this.cT = squireFarmerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bg.lllIllllllIlll(this.cT.fossil_island_underwaterSpores() ? 1 : 0)) {
            return lIlllllIlllI[0];
        }
        int[] nArray = new int[lIlllllIlllI[1]];
        nArray[bg.lIlllllIlllI[0]] = lIlllllIlllI[2];
        TileItem var1 = TileItems.getNearest((int[])nArray);
        if (!bg.lllIlllllllIII(var1) || bg.lllIlllllllIIl(var1.getWorldLocation().getRegionID(), p.FOSSIL_ISLAND_UNDERWATER.X())) {
            return lIlllllIlllI[0];
        }
        var1_1.interact(lIlllllIllIl[lIlllllIlllI[0]]);
        return lIlllllIlllI[1];
    }

    private static boolean lllIlllllllIII(Object object) {
        return object != null;
    }
}

