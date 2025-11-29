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
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Looting bird snare", priority=1)
public class LootingBirdSnareTask
extends HunterTaskBase {

    private static boolean lIIIllIllIIIIII(Object object) {
        return object != null;
    }

    static {
        D.lIIIllIlIllllll();
        D.lIIIllIlIlllllI();
    }

    private static void lIIIllIlIlllllI() {
        lllIllIllIlI = new String[lllIllIllIll[1]];
        D.lllIllIllIlI[D.lllIllIllIll[2]] = "Take";
    }

    @Override
    public boolean x() {
        int[] nArray = new int[lllIllIllIll[1]];
        nArray[D.lllIllIllIll[2]] = lllIllIllIll[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lllIllIllIll[0], (int[])nArray);
        if (!D.lIIIllIllIIIIII(list) || D.lIIIllIllIIIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        if (D.lIIIllIllIIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(lllIllIllIlI[lllIllIllIll[2]]));
        return lllIllIllIll[1];
    }

    private static boolean lIIIllIllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingBirdSnareTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }
}

