/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.NHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Enter cave Task", priority=10)
public class EnterCaveTask
extends Task {
     WorldArea R;
    private final  SquireFightCavesConfig X;
    
    private final  f W;
    
     WorldPoint Z;
    public static  long aa;
    public static  int ab;
    private final  n Y;

    private static boolean lllllIIIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIIIlllII(Object object) {
        return object != null;
    }

    private static boolean lllllIIIIllIlI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        j var1;
        if (!j.lllllIIIIllIIl(this.R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !j.lllllIIIIllIlI(this.x().needsToBank() ? 1 : 0) || j.lllllIIIIllIIl(SquireFightCavesPlugin.g ? 1 : 0) && j.lllllIIIIllIIl(this.X.stopAfterCape() ? 1 : 0)) {
            return llIIlIIIlIlI[4];
        }
        if (j.lllllIIIIllIll(j.lllllIIIIllIII(System.currentTimeMillis(), aa + 120000L)) && j.lllllIIIIllIIl(SquireFightCavesPlugin.f ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIIl[llIIlIIIlIlI[4]];
            return llIIlIIIlIlI[4];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (j.lllllIIIIllIIl(tileObject.getName().contains(llIIlIIIlIIl[llIIlIIIlIlI[9]]) ? 1 : 0)) {
                String[] stringArray = new String[llIIlIIIlIlI[7]];
                stringArray[j.llIIlIIIlIlI[4]] = llIIlIIIlIIl[llIIlIIIlIlI[10]];
                if (j.lllllIIIIllIIl(tileObject.hasAction(stringArray) ? 1 : 0) && j.lllllIIIIlllIl(tileObject.getWorldLocation().distanceTo(this.Z), llIIlIIIlIlI[11])) {
                    n2 = llIIlIIIlIlI[7];

                    if (((0xDA ^ 0x83) & ~(0x37 ^ 0x6E)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llIIlIIIlIlI[4];
            return n2 != 0;
        });
        if (j.lllllIIIIlllII(var2)) {
            SquireFightCavesPlugin.h = llIIlIIIlIIl[llIIlIIIlIlI[7]];
            var2.interact(llIIlIIIlIIl[llIIlIIIlIlI[8]]);
            n.al = null;
            SquireFightCavesPlugin.f = llIIlIIIlIlI[4];
            ab = llIIlIIIlIlI[4];
            return llIIlIIIlIlI[4];
        }
        return llIIlIIIlIlI[4];
    }

    protected BankLoadout x() {
        return (BankLoadout)this.X.bankLoadout().selected(BankLoadout.class);
    }

    private static boolean lllllIIIIllIll(int n2) {
        return n2 > 0;
    }

    private static void lllllIIIIlIllI() {
        llIIlIIIlIIl = new String[llIIlIIIlIlI[12]];
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[4]] = "Enter cave cool down";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[7]] = "Entering cave";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[8]] = "Enter";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[9]] = "Cave entrance";
        j.llIIlIIIlIIl[j.llIIlIIIlIlI[10]] = "Enter";
    }

    private static int lllllIIIIllIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    static {
        j.lllllIIIIlIlll();
        j.lllllIIIIlIllI();
        aa = System.currentTimeMillis();
    }

        return String.valueOf(var3);
    }

    @Inject
    public EnterCaveTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.R = new WorldArea(llIIlIIIlIlI[0], llIIlIIIlIlI[1], llIIlIIIlIlI[2], llIIlIIIlIlI[3], llIIlIIIlIlI[4]);
        this.Z = new WorldPoint(llIIlIIIlIlI[5], llIIlIIIlIlI[6], llIIlIIIlIlI[4]);
        this.W = f2;
        this.X = squireFightCavesConfig;
        this.Y = n2;
    }

    private static boolean lllllIIIIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

