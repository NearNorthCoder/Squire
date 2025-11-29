/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Handling Kephri Prayers")
public class HandlingKephriPrayersTask
extends ToaTaskBase {

    @Override
    public n J() {
        return this.aT.prayerModeKephri();
    }

    @Override
    public boolean I() {
        return lIlIIIIIllllI[0];
    }

    private static boolean lIllIllIlIIIllI(Object object) {
        return object != null;
    }

    @Override
    public int F() {
        return lIlIIIIIllllI[4];
    }

    private static boolean lIllIllIlIIlIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIlIIIIIllllI[2]];
        nArray[P.lIlIIIIIllllI[1]] = lIlIIIIIllllI[5];
        nArray[P.lIlIIIIIllllI[0]] = lIlIIIIIllllI[6];
        nArray[P.lIlIIIIIllllI[3]] = lIlIIIIIllllI[7];
        return this.aS.a(nArray);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[lIlIIIIIllllI[0]];
        stringArray[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (P.lIllIllIlIIIllI(nPC) && P.lIllIllIlIIIlll(nPC.distanceTo((Locatable)Players.getLocal()), lIlIIIIIllllI[2]) && P.lIllIllIlIIlIII(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return List.of(this.H(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIlIIIIIllllI[3]];
        stringArray2[P.lIlIIIIIllllI[1]] = lIlIIIIIlllIl[lIlIIIIIllllI[0]];
        stringArray2[P.lIlIIIIIllllI[0]] = lIlIIIIIlllIl[lIlIIIIIllllI[3]];
        NPC var1 = NPCs.getNearest((String[])stringArray2);
        if (P.lIllIllIlIIIllI(var1)) {
            P var2;
            return List.of(var2.H(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.H());
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIllIlIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIllIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public HandlingKephriPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static void lIllIllIlIIIlII() {
        lIlIIIIIlllIl = new String[lIlIIIIIllllI[2]];
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[1]] = "Soldier Scarab";
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[0]] = "Spitting Scarab";
        P.lIlIIIIIlllIl[P.lIlIIIIIllllI[3]] = "Agile Scarab";
    }

    static {
        P.lIllIllIlIIIlIl();
        P.lIllIllIlIIIlII();
    }
}

