/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
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
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Handling babboon prayers")
public class HandlingBabboonPrayersTask
extends ToaTaskBase {

    private static boolean lIllIllIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean I() {
        boolean bl;
        if (N.lIllIllIIIIlIIl((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            bl = lIlIIIIIlIIII[0];

            if (-(0xAD ^ 0xA8) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    private static void lIllIllIIIIIIlI() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIII[6]];
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[1]] = "Baboon Thrower";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[0]] = "Baboon Mage";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[2]] = "Baboon Brawler";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[3]] = "Baboon Thrall";
        N.lIlIIIIIIllll[N.lIlIIIIIlIIII[5]] = "Baboon";
    }

    @Override
    public boolean C() {
        boolean bl;
        if (N.lIllIllIIIIlIII((Object)this.aT.prayModeBaboons(), (Object)n.NONE)) {
            return lIlIIIIIlIIII[1];
        }
        if (N.lIllIllIIIIIlIl(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIllll[lIlIIIIIlIIII[5]])))) {
            bl = lIlIIIIIlIIII[0];

            if (3 != 3) {
                return false;
            }
        } else {
            bl = lIlIIIIIlIIII[1];
        }
        return bl;
    }

    @Override
    public int F() {
        return lIlIIIIIlIIII[4];
    }

    private static boolean lIllIllIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        N.lIllIllIIIIIIll();
        N.lIllIllIIIIIIlI();
    }

        return String.valueOf(var1);
    }

    @Override
    public n J() {
        return this.aT.prayModeBaboons();
    }

    @Inject
    public HandlingBabboonPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static boolean lIllIllIIIIIlIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> E() {
        Prayer var2;
        void var3;
        void var4;
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[1]];
        int n2 = NPCs.getAll((String[])stringArray).size();
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[0]];
        int n3 = NPCs.getAll((String[])stringArray2).size();
        Prayer prayer = null;
        if (N.lIllIllIIIIIlII(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;

            if (1 == 0) {
                return null;
            }
        } else if (N.lIllIllIIIIIlII((int)var4, (int)var3)) {
            var2 = Prayer.PROTECT_FROM_MISSILES;

            if (3 <= 0) {
                return null;
            }
        } else {
            String[] stringArray3 = new String[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[1]] = lIlIIIIIIllll[lIlIIIIIlIIII[2]];
            stringArray3[N.lIlIIIIIlIIII[0]] = lIlIIIIIIllll[lIlIIIIIlIIII[3]];
            NPC var5 = NPCs.getNearest((String[])stringArray3);
            if (!N.lIllIllIIIIIlIl(var5) || N.lIllIllIIIIIllI(var5.distanceTo((Locatable)Players.getLocal()), lIlIIIIIlIIII[2])) {
                if (N.lIllIllIIIIIlll((int)var3)) {
                    var2 = Prayer.PROTECT_FROM_MAGIC;

                }
            } else {
                var2 = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (N.lIllIllIIIIIlIl(var2)) {
            N var6;
            return List.of(var6.H(), var2);
        }
        return List.of(this.H());
    }

    private static boolean lIllIllIIIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIIIIlll(int n2) {
        return n2 > 0;
    }
}

