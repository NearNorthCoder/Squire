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

@TaskDesc(name="Looting box trap", priority=1)
public class LootingBoxTrapTask
extends HunterTaskBase {

    private static void lIIIlllIlIIllIl() {
        llllIIIIIllI = new String[llllIIIIIlll[1]];
        m.llllIIIIIllI[m.llllIIIIIlll[2]] = "Take";
    }

    static {
        m.lIIIlllIlIIlllI();
        m.lIIIlllIlIIllIl();
    }

    private static boolean lIIIlllIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

    @Override
    public boolean x() {
        int[] nArray = new int[llllIIIIIlll[1]];
        nArray[m.llllIIIIIlll[2]] = llllIIIIIlll[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)llllIIIIIlll[0], (int[])nArray);
        if (!m.lIIIlllIlIIllll(list) || m.lIIIlllIlIlIIII(list.isEmpty() ? 1 : 0)) {
            return llllIIIIIlll[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(llllIIIIIllI[llllIIIIIlll[2]]));
        return llllIIIIIlll[1];
    }

    private static boolean lIIIlllIlIIllll(Object object) {
        return object != null;
    }
}

