/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Boarding ship", priority=10, blocking=true)
public class BoardingShipTask
extends TemporossTaskBase {

    @Inject
    protected BoardingShipTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        v.lIllIIlIIIllIIl();
        v.lIllIIlIIIllIII();
    }

    private static boolean lIllIIlIIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        v var1;
        void var2;
        Player player = Players.getLocal();
        if (v.lIllIIlIIIllIll(player)) {
            return lIIlllIIIIlIl[0];
        }
        if (v.lIllIIlIIIlllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        int[] nArray = new int[lIIlllIIIIlIl[3]];
        nArray[v.lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[4];
        TileObject var3 = TileObjects.getFirstAt((int)lIIlllIIIIlIl[1], (int)lIIlllIIIIlIl[2], (int)lIIlllIIIIlIl[0], (int[])nArray);
        if (v.lIllIIlIIIllIll(var3)) {
            return lIIlllIIIIlIl[0];
        }
        if (!v.lIllIIlIIIlllIl(var2.getWorldLocation().getX(), var3.getWorldLocation().getX()) || v.lIllIIlIIIlllII(var2.isMoving() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        if (v.lIllIIlIIIlllII(var1.az.solo() ? 1 : 0)) {
            var3.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
            return lIIlllIIIIlIl[3];
        }
        var2_2.interact(lIIlllIIIIlII[lIIlllIIIIlIl[3]]);
        return lIIlllIIIIlIl[3];
    }

    private static void lIllIIlIIIllIII() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[5]];
        v.lIIlllIIIIlII[v.lIIlllIIIIlIl[0]] = "Solo-start";
        v.lIIlllIIIIlII[v.lIIlllIIIIlIl[3]] = "Quick-climb";
    }

}

