/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends ToaTaskBase {

    @Inject
    public HandlingObeliskPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        return List.of(this.H());
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickObelisk();
    }

    @Override
    public boolean C() {
        return this.aS.a(nPC -> nPC.getName().equals(lIlIIIIlIIIll[lIlIIIIlIIlII[1]]));
    }

    @Override
    public int HandlingObeliskPrayersTask() {
        return lIlIIIIlIIlII[0];
    }

    static {
        F.lIllIllIlIlIIll();
        F.lIllIllIlIlIIlI();
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIlIIIll = new String[lIlIIIIlIIlII[2]];
        F.lIlIIIIlIIIll[F.lIlIIIIlIIlII[1]] = "Obelisk";
    }
}

