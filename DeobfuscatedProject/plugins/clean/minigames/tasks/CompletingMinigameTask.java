/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.minigames.tasks.GameEnum;

@TaskDesc(name="Completing Minigame")
public class CompletingMinigameTask
extends Task {
    
    private static final  WorldPoint v;
    private static final  int w;
    private final  SquireSorceressGardenConfig x;

    private static boolean lIlIlllllIIlIlI(int n) {
        return n != 0;
    }

    private void B() {
        Movement.walkTo((WorldPoint)v);

    }

    @Inject
    public CompletingMinigameTask(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.x = squireSorceressGardenConfig;
    }

    private static boolean lIlIlllllIIlllI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private void C() {
        void var1_2;
        e var1;
        if (e.lIlIlllllIIlIlI(this.x.pickHerbs() ? 1 : 0)) {
            void var2;
            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.lIlIlllllIIlIlI(tileObject.getName().equals(lIIllIIlIIIll[lIIllIIlIIlII[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIlIIlII[1]];
                    stringArray[e.lIIllIIlIIlII[0]] = lIIllIIlIIIll[lIIllIIlIIlII[5]];
                    if (e.lIlIlllllIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIllIIlIIlII[1];

                        if (((0x19 ^ 0x5C) & ~(0x62 ^ 0x27)) >= -1) return n != 0;
                        return false;
                    }
                }
                n = lIIllIIlIIlII[0];
                return n != 0;
            });
            if (e.lIlIlllllIIllll(tileObject2)) {
                return;
            }
            var2.interact(lIIllIIlIIIll[lIIllIIlIIlII[0]]);
            return;
        }
        TileObject var2 = var1.A();
        if (e.lIlIlllllIIllll(var2)) {
            return;
        }
        var1_2.interact(lIIllIIlIIIll[lIIllIIlIIlII[1]]);
    }

    private static boolean lIlIlllllIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllllIIllII(Object object) {
        return object != null;
    }

    private void y() {
        if (!e.lIlIlllllIIlIll(Movement.isRunEnabled() ? 1 : 0) || e.lIlIlllllIIllIl(Movement.getRunEnergy(), lIIllIIlIIlII[2])) {
            return;
        }
        Movement.toggleRun();
    }

        return String.valueOf(var3);
    }

    private boolean z() {
        boolean bl;
        if (!e.lIlIlllllIIlIll(Inventory.isFull() ? 1 : 0) || !e.lIlIlllllIIlIll(Bank.isOpen() ? 1 : 0) || !e.lIlIlllllIIlIlI(Movement.shouldWalk() ? 1 : 0) || e.lIlIlllllIIlllI((Object)this.x.botActivity(), (Object)a.MINIGAME)) {
            bl = lIIllIIlIIlII[1];

            if (((0x66 ^ 0x73) & ~(0xE ^ 0x1B)) != 0) {
                return false;
            }
        } else {
            bl = lIIllIIlIIlII[0];
        }
        return bl;
    }

    static {
        e.lIlIlllllIIlIIl();
        e.lIlIlllllIIlIII();
        w = lIIllIIlIIlII[3];
        v = new WorldPoint(lIIllIIlIIlII[6], lIIllIIlIIlII[7], lIIllIIlIIlII[0]);
    }

    private static boolean lIlIlllllIIllIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lIlIlllllIIlIll(int n) {
        return n == 0;
    }

    private TileObject A() {
        int[] nArray = new int[lIIllIIlIIlII[1]];
        nArray[e.lIIllIIlIIlII[0]] = lIIllIIlIIlII[3];
        return TileObjects.getNearest((int[])nArray);
    }

    private boolean a(TileObject tileObject) {
        return Reachable.isInteractable((Locatable)tileObject);
    }

    private static void lIlIlllllIIlIII() {
        lIIllIIlIIIll = new String[lIIllIIlIIlII[8]];
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[0]] = "Pick";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[1]] = "Pick-Fruit";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[4]] = "Herbs";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[5]] = "Pick";
    }

    public boolean run() {
        e var4;
        if (e.lIlIlllllIIlIlI(this.z() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        var4.y();
        TileObject var5 = var4.A();
        if (e.lIlIlllllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        if (!e.lIlIlllllIIllII(var5) || e.lIlIlllllIIlIll(var4.a(var5) ? 1 : 0)) {
            return Movement.walkTo((WorldPoint)v);
        }
        this.C();
        return lIIllIIlIIlII[1];
    }
}

