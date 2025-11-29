/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.EnterCaveTask;
import gg.squire.minigames.tasks.NHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Bank Task", priority=10)
public class BankTask
extends Task {
    private final  f T;
     WorldArea R;
    
    private final  n V;
    
     WorldPoint S;
    private final  SquireFightCavesConfig U;

    @Inject
    public BankTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(llIIIlllllII[0], llIIIlllllII[1], llIIIlllllII[2], llIIIlllllII[3], llIIIlllllII[4]);
        this.S = new WorldPoint(llIIIlllllII[5], llIIIlllllII[6], llIIIlllllII[4]);
        this.T = f2;
        this.U = squireFightCavesConfig;
        this.V = n2;
    }

    private static boolean llllIlllIllIII(Object object) {
        return object != null;
    }

    protected BankLoadout x() {
        return (BankLoadout)this.U.bankLoadout().selected(BankLoadout.class);
    }

        return String.valueOf(var1);
    }

    private static boolean llllIlllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        h.llllIlllIlIIlI();
        h.llllIlllIIllIl();
    }

    private static boolean llllIlllIllIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        h var2;
        WorldPoint var3;
        if (!h.llllIlllIlIIll(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !h.llllIlllIlIIll(this.x().needsToBank() ? 1 : 0) || h.llllIlllIlIIll(SquireFightCavesPlugin.g ? 1 : 0) && h.llllIlllIlIIll(this.U.stopAfterCape() ? 1 : 0)) {
            return llIIIlllllII[4];
        }
        if (h.llllIlllIlIIll(SquireFightCavesPlugin.f ? 1 : 0) && h.llllIlllIlIlII(j.ab, llIIIlllllII[7])) {
            j.aa = System.currentTimeMillis();
            j.ab += llIIIlllllII[7];
        }
        if (h.llllIlllIlIlIl((var3 = Players.getLocal().getWorldLocation()).distanceTo(var2.S), llIIIlllllII[8])) {
            SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[4]];
            Movement.walkTo((WorldPoint)var2.S);

            return llIIIlllllII[4];
        }
        if (h.llllIlllIlIllI(var3.distanceTo(var2.S), llIIIlllllII[8])) {
            if (h.llllIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIIIlllllII[7]];
                nArray[h.llIIIlllllII[4]] = llIIIlllllII[9];
                NPC var4 = NPCs.getNearest((int[])nArray);
                if (h.llllIlllIllIII(var4)) {
                    SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[7]];
                    var4.interact(llIIIlllIlll[llIIIlllllII[10]]);
                    return llIIIlllllII[4];
                }
            }
            if (h.llllIlllIllIIl(var2.x())) {
                Log.error((String)llIIIlllIlll[llIIIlllllII[11]]);
                return llIIIlllllII[4];
            }
            if (h.llllIlllIlIlll(var2.x().needsToBank() ? 1 : 0)) {
                SquireFightCavesPlugin.h = llIIIlllIlll[llIIIlllllII[12]];
                Bank.close();
                var2.sleep(llIIIlllllII[11]);
                return llIIIlllllII[4];
            }
            if (h.llllIlllIlIlll(BankLoadouts.withdrawWithRetries((BankLoadout)var2.x(), (int)llIIIlllllII[13]).booleanValue() ? 1 : 0)) {
                Log.info((String)llIIIlllIlll[llIIIlllllII[13]]);
                return llIIIlllllII[4];
            }
        }
        return llIIIlllllII[4];
    }

    private static boolean llllIlllIlIlll(int n2) {
        return n2 == 0;
    }

    private static void llllIlllIIllIl() {
        llIIIlllIlll = new String[llIIIlllllII[14]];
        h.llIIIlllIlll[h.llIIIlllllII[4]] = "Nav to tzhar bank";
        h.llIIIlllIlll[h.llIIIlllllII[7]] = "Opening bank";
        h.llIIIlllIlll[h.llIIIlllllII[10]] = "Bank";
        h.llIIIlllIlll[h.llIIIlllllII[11]] = "No bank loadout selected";
        h.llIIIlllIlll[h.llIIIlllllII[12]] = "Closing bank";
        h.llIIIlllIlll[h.llIIIlllllII[13]] = "Banking failed 5 times in a row, stopping";
    }

    private static boolean llllIlllIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlllIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

}

