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
import gg.squire.zulrah.tasks.GameEnum9;
import gg.squire.zulrah.tasks.ZulrahManager;
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

    @Override
    public boolean ac() {
        if ((Inventory.contains(item -> IntStream.of(this.ap.O( == 0)).anyMatch(n2 -> {
            int n3;
            if ((n2 == item.getId()) && (n2 != 2)) {
                n3 = 1;
                0;
                if null != null {
                    return ((0x9D ^ 0xB1 ^ (0x18 ^ 0xD)) & (0x8A ^ 0x9F ^ (0xAA ^ 0x86) ^ -1)) != 0;
                }
            } else {
                n3 = 0;
            }
            return n3 != 0;
        })) ? 1 : 0)) {
            return 0;
        }
        this.ap.a(this.ap.O());
        0;
        return 1;
    }

    static {
        R.var2();
    }

    @Inject
    public EquippingGearDeathwalkTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, t t2) {
        super(squireZulrahConfig, squireZulrah, client, c.COLLECTING_ZULRAH);
        this.ap = t2;
    }

}

