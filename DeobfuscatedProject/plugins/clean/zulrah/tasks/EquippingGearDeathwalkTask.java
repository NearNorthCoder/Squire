/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum40;
import gg.squire.zulrah.tasks.THelper;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping gear (deathwalk)", priority=0x7FFFFFFF, blocking=true)
public class EquippingGearDeathwalkTask
extends ZulrahTaskBase {
    
    private final  t ap;

    private static boolean llIIlIlIIIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIlIIIllIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        if (R.llIIlIlIIIllIlI(Inventory.contains(item -> IntStream.of(this.ap.O()).anyMatch(n2 -> {
            int n3;
            if (R.llIIlIlIIIllIll(n2, item.getId()) && R.llIIlIlIIIlllII(n2, lIlllIIIIIlII[2])) {
                n3 = lIlllIIIIIlII[1];

                }
            } else {
                n3 = lIlllIIIIIlII[0];
            }
            return n3 != 0;
        })) ? 1 : 0)) {
            return lIlllIIIIIlII[0];
        }
        this.ap.a(this.ap.O());

        return lIlllIIIIIlII[1];
    }

    static {
        R.llIIlIlIIIllIIl();
    }

    @Inject
    public EquippingGearDeathwalkTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, t t2) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
        this.ap = t2;
    }

    private static boolean llIIlIlIIIllIll(int n2, int n3) {
        return n2 == n3;
    }
}

