/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF)
public class HandlingBabaPrayersTask
extends ToaTaskBase {

    private static void lIllIlIlIlIIlll() {
        lIIllllllIIIl = new String[lIIllllllIIlI[0]];
        L.lIIllllllIIIl[L.lIIllllllIIlI[1]] = "Ba-Ba";
    }

    @Override
    public n J() {
        return this.aT.prayFlickBaba();
    }

    static {
        L.lIllIlIlIlIlIII();
        L.lIllIlIlIlIIlll();
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIIllllllIIlI[4]];
        nArray[L.lIIllllllIIlI[1]] = lIIllllllIIlI[5];
        nArray[L.lIIllllllIIlI[0]] = lIIllllllIIlI[6];
        nArray[L.lIIllllllIIlI[7]] = lIIllllllIIlI[2];
        return this.aS.a(nArray);
    }

    @Inject
    public HandlingBabaPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[lIIllllllIIlI[0]];
        stringArray[L.lIIllllllIIlI[1]] = lIIllllllIIIl[lIIllllllIIlI[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (L.lIllIlIlIlIlIIl(nPC) && L.lIllIlIlIlIlIlI(nPC.getId(), lIIllllllIIlI[2])) {
            return List.of(this.H());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.H());
    }

    @Override
    public boolean I() {
        return lIIllllllIIlI[0];
    }

    private static boolean lIllIlIlIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int F() {
        return lIIllllllIIlI[3];
    }

    private static boolean lIllIlIlIlIlIIl(Object object) {
        return object != null;
    }

}

