/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum49;
import gg.squire.zulrah.tasks.THelper;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Swapping gear", priority=50)
public class SwappingGearTask
extends ZulrahTaskBase {
    
    private final  t ay;

    private static boolean llIIlIlIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean SwappingGearTask() {
        int n2;
        ac var1;
        int var2;
        int n3;
        if (ac.llIIlIlIIIlIllI((Object)this.az.V().C().w(), (Object)r.MAGIC)) {
            n3 = lIlllIIIIIIlI[0];

            if (2 <= -1) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            n3 = lIlllIIIIIIlI[1];
        }
        if (ac.llIIlIlIIIlIlll(var2 = n3) && ac.llIIlIlIIIlIlll(var1.ay.a(var1.ay.P()) ? 1 : 0)) {
            return lIlllIIIIIIlI[0];
        }
        if (ac.llIIlIlIIIllIII(var2) && ac.llIIlIlIIIlIlll(var1.ay.a(var1.ay.O()) ? 1 : 0)) {
            n2 = lIlllIIIIIIlI[0];

            if (((0x36 ^ 0x74 ^ (0xBC ^ 0x9C)) & (2 ^ (0xFD ^ 0x9D) ^ -1)) != 0) {
                return false;
            }
        } else {
            n2 = lIlllIIIIIIlI[1];
        }
        return n2 != 0;
    }

    @Inject
    protected SwappingGearTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig, t t2) {
        super(v2, client, squireZulrahConfig);
        this.ay = t2;
    }

    private static boolean llIIlIlIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    static {
        ac.llIIlIlIIIlIlIl();
    }
}

