/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling compost bin", priority=30, blocking=true)
public class FillingCompostBinTask
extends FarmerTaskBase {
    private final  h cx;
    
    private  boolean cy;

    private static boolean llllIIIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIlIlIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public FillingCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cx = h2;
    }

    private static boolean llllIIIlIllIII(Object object) {
        return object == null;
    }

    private static void llllIIIlIlIIlI() {
        llIIIIIIllll = new String[llIIIIIlIIII[2]];
        aO.llIIIIIIllll[aO.llIIIIIlIIII[0]] = "Close";
        aO.llIIIIIIllll[aO.llIIIIIlIIII[1]] = "Close";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void var2_2;
        aO var1;
        String[] stringArray = new String[llIIIIIlIIII[1]];
        stringArray[aO.llIIIIIlIIII[0]] = llIIIIIIllll[llIIIIIlIIII[0]];
        if (aO.llllIIIlIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
            tileObject.interact(llIIIIIIllll[llIIIIIlIIII[1]]);
            return llIIIIIlIIII[1];
        }
        Item var2 = var1.bu();
        if (aO.llllIIIlIlIllI(Inventory.isFull() ? 1 : 0) && aO.llllIIIlIlIlll(var2)) {
            var1.cy = llIIIIIlIIII[1];

            }
        } else if (aO.llllIIIlIllIII(var2)) {
            var1.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        if (aO.llllIIIlIllIIl(var1.cy ? 1 : 0)) {
            return llIIIIIlIIII[0];
        }
        Item var3 = Inventory.getFirst(item2 -> {
            int n2;
            if (aO.llllIIIlIlIllI(L.bq.contains(item2.getId()) ? 1 : 0) && aO.llllIIIlIllIlI(item2.getId(), var2.getId())) {
                n2 = llIIIIIlIIII[1];

                if ((0x6A ^ 0x6E) < 0) {
                    return false;
                }
            } else {
                n2 = llIIIIIlIIII[0];
            }
            return n2 != 0;
        });
        if (aO.llllIIIlIlIlll(var3)) {
            var1.cx.c(var3);
            return llIIIIIlIIII[1];
        }
        if (!aO.llllIIIlIllIIl(Players.getLocal().isMoving() ? 1 : 0) || aO.llllIIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIIIIlIIII[1];
        }
        var2_2.useOn(tileObject);
        return llIIIIIlIIII[1];
    }

    @Override
    public boolean I(N n2) {
        if (!aO.llllIIIlIlIlII((Object)n2.aI().aZ(), (Object)n.GROWING) || aO.llllIIIlIlIlIl((Object)n2.aI().aZ(), (Object)n.HARVESTABLE)) {
            var4.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        return llIIIIIlIIII[1];
    }

    private static boolean llllIIIlIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIlIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIIlIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aO.llllIIIlIlIIll();
        aO.llllIIIlIlIIlI();
    }

    private static boolean llllIIIlIlIlll(Object object) {
        return object != null;
    }

}

