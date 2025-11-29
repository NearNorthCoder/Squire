/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Looting items from a failed trap", priority=50, blocking=true)
public class LootingItemsFromAFailedTrapTask
extends HunterTaskBase {

    @Override
    public boolean x() {
        int[] nArray = new int[lllIlllIIllI[1]];
        nArray[q.lllIlllIIllI[2]] = lllIlllIIllI[3];
        nArray[q.lllIlllIIllI[4]] = lllIlllIIllI[5];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lllIlllIIllI[0], (int[])nArray);
        if (!q.lIIIllIllIllllI(list) || q.lIIIllIlllIIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIlllIIllI[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(lllIlllIIIlI[lllIlllIIllI[2]]));
        return lllIlllIIllI[4];
    }

    private static void lIIIllIllIllIlI() {
        lllIlllIIIlI = new String[lllIlllIIllI[4]];
        q.lllIlllIIIlI[q.lllIlllIIllI[2]] = "Take";
    }

    private static boolean lIIIllIlllIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingItemsFromAFailedTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

    static {
        q.lIIIllIllIlllIl();
        q.lIIIllIllIllIlI();
    }

    private static boolean lIIIllIllIllllI(Object object) {
        return object != null;
    }

}

