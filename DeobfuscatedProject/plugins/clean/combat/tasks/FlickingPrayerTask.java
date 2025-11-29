/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.combat.tasks.GameEnum5;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Flicking Prayer", priority=15)
public class FlickingPrayerTask
extends Task {

    private final  SquireBlueDragonKiller D;
    private final  SquireBlueDragonKillerConfig E;

    private static boolean llIlIIIIllllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIIlllIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIIlllIIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIIlllIlI(Object object) {
        return object != null;
    }

    public boolean run() {
        List list;
        List var1;
        i var2;
        block14: {
            block13: {
                if (i.llIlIIIIlllIIl(this.E.flickPrayer() ? 1 : 0)) {
                    return lIIlllIlIllI[0];
                }
                if (i.llIlIIIIlllIIl(Prayers.getPoints())) {
                    return lIIlllIlIllI[0];
                }
                Actor var3 = Players.getLocal().getInteracting();
                if (!i.llIlIIIIlllIlI(var3)) break block13;
                String[] stringArray = new String[lIIlllIlIllI[1]];
                stringArray[i.lIIlllIlIllI[0]] = lIIlllIlIlIl[lIIlllIlIllI[0]];
                if (!i.llIlIIIIlllIIl(var3.hasAction(stringArray) ? 1 : 0)) break block14;
            }
            if (i.llIlIIIIlllIll(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIIlllIlIllI[1];
            }
            return lIIlllIlIllI[0];
        }
        if (i.llIlIIIIllllII((Object)var2.E.attackStyle(), (Object)c.MELEE)) {
            var1 = Prayers.getMeleePrayer();

            if (1 < 0) {
                return false;
            }
        } else if (i.llIlIIIIllllII((Object)var2.E.attackStyle(), (Object)c.RANGE)) {
            var1 = Prayers.getRangePrayers();

            if (3 == 0) {
                return ((0x8D ^ 0xBD ^ (0x19 ^ 0x71)) & (211 + 157 - 292 + 161 ^ 86 + 157 - 66 + 4 ^ -1)) != 0;
            }
        } else {
            list = Prayers.getMagePrayers();
        }
        return Prayers.flick((List)list);
    }

    static {
        i.llIlIIIIlllIII();
        i.llIlIIIIllIlll();
    }

    @Inject
    public FlickingPrayerTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.D = squireBlueDragonKiller;
        this.E = squireBlueDragonKillerConfig;
    }

    private static void llIlIIIIllIlll() {
        lIIlllIlIlIl = new String[lIIlllIlIllI[1]];
        i.lIIlllIlIlIl[i.lIIlllIlIllI[0]] = "Attack";
    }
}

