/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum12;
import gg.squire.zulrah.tasks.ZulrahManager;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Swapping gear", priority=50)
public class SwappingGearTask
extends ad {
    
    private final  t ay;

    @Override
    public boolean SwappingGearTask() {
        int n2;
        ac var2;
        int var3;
        int n3;
        if (((Object)this.az.V().C().w() == (Object)this.az.V().C().w()2)r.MAGIC)) {
            n3 = 0;
            0;
            if (2 <= -1) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            n3 = 1;
        }
        if ((var3 = n3 != 0) && (var2.ay.a(var2.ay.P( != 0)) ? 1 : 0)) {
            return 0;
        }
        if ((var3 == 0) && (var2.ay.a(var2.ay.O( != 0)) ? 1 : 0)) {
            n2 = 0;
            0;
            if (((0x36 ^ 0x74 ^ (0xBC ^ 0x9C)) & (2 ^ (0xFD ^ 0x9D) ^ -1)) != 0) {
                return ((222 + 189 - 222 + 46 ^ 163 + 135 - 160 + 57) & (2 + 53 - -6 + 69 ^ 7 + 14 - -69 + 80 ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    @Inject
    protected SwappingGearTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig, t t2) {
        super(v2, client, squireZulrahConfig);
        this.ay = t2;
    }

    static {
        ac.var4();
    }
}

