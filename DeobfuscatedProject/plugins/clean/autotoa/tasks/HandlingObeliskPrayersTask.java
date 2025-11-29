/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Obelisk Prayers", priority=0x7FFFFFFF)
public class HandlingObeliskPrayersTask
extends AutotoaTaskBase {

    @Override
    public boolean aL() {
        return this.cm.a(nPC -> nPC.getName().equals(llIlIlIIlll[llIlIlIlIII[1]]));
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Override
    public List<Prayer> aN() {
        return List.of(this.aQ());
    }

    static {
        aD.lIlIIllIlllIIl();
        aD.lIlIIllIlllIII();
    }

    private static void lIlIIllIlllIII() {
        llIlIlIIlll = new String[llIlIlIlIII[2]];
        aD.llIlIlIIlll[aD.llIlIlIlIII[1]] = "Obelisk";
    }

    @Override
    public int aO() {
        return llIlIlIlIII[0];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Inject
    public HandlingObeliskPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

}

