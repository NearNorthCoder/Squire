/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum29;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving memory puzzle", priority=200, blocking=true)
public class SolvingMemoryPuzzleTask
extends AutotoaTaskBase {

    private final  m dm;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        aw var1;
        NPC nPC2 = this.J();
        if (aw.lIlIIIlllllIIl(nPC2)) {
            return llIIllllllI[0];
        }
        Queue<n> var2 = var1.dm.G();
        if (aw.lIlIIIlllllIlI(var2.isEmpty() ? 1 : 0)) {
            return llIIllllllI[0];
        }
        n var3 = var2.peek();
        WorldPoint var4 = var3.a(var1.cu);
        if (aw.lIlIIIlllllIll(var4)) {
            return llIIllllllI[0];
        }
        WorldPoint var5 = Players.getLocal().getWorldLocation();
        if (aw.lIlIIIllllllII(var4.distanceTo(var5), llIIllllllI[1]) && aw.lIlIIIlllllIlI(NPCs.getAll(nPC -> {
            int n2;
            if (aw.lIlIIIlllllIIl(nPC.getName()) && aw.lIlIIIlllllIlI(nPC.getName().toLowerCase().contains(llIIlllllIl[llIIllllllI[1]]) ? 1 : 0) && aw.lIlIIIlllllIlI(nPC.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                n2 = llIIllllllI[1];

                if (3 <= 2) {
                    return ((0x74 ^ 0x42 ^ (0x75 ^ 0x1D)) & (106 + 183 - 91 + 11 ^ 9 + 54 - -55 + 25 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllllllI[0];
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            return llIIllllllI[1];
        }
        if (aw.lIlIIIllllllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        try {
            var1.g(var4);
            return llIIllllllI[1];
        }
        catch (NullPointerException nullPointerException) {
            void var4_4;
            Log.info((String)llIIlllllIl[llIIllllllI[0]]);
            nullPointerException.printStackTrace();
            Movement.setDestination((WorldPoint)var4_4);
            return llIIllllllI[1];
        }
    }

    @Inject
    protected SolvingMemoryPuzzleTask(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dm = m2;
    }

    private static boolean lIlIIIllllllII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIIIllllllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public void r() {
        this.dm.G().clear();
    }

    private static boolean lIlIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIllllIlll() {
        llIIlllllIl = new String[llIIllllllI[2]];
        aw.llIIlllllIl[aw.llIIllllllI[0]] = "Encountered NPE walking to quadrant order puzzle solution";
        aw.llIIlllllIl[aw.llIIllllllI[1]] = "orb";
    }

    private static boolean lIlIIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlllllIIl(Object object) {
        return object != null;
    }

    static {
        aw.lIlIIIlllllIII();
        aw.lIlIIIllllIlll();
    }

    private static boolean lIlIIIlllllIll(Object object) {
        return object == null;
    }
}

