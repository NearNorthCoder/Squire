/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Prep Getting Tools", priority=21003, blocking=true)
public class PrepGettingToolsTask
extends CoxTaskBase {
    
    private final  int eh = 7603;
    
    private final  int eg = 29742;

    private static boolean llIlllllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIlllll(int n2) {
        return n2 == 0;
    }

    private static void llIlllllIllIlI() {
        lIlIlIllllII = new String[lIlIlIllllIl[14]];
        bb.lIlIlIllllII[bb.lIlIlIllllIl[2]] = "CANT FIND TOOLS!!!";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[3]] = "TAKING SEED DIBBLER";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[8]] = "Take Seed Dibber";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[10]] = "TAKING RAKE, NO SEEDS!";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[11]] = "Take Rake";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[12]] = "TAKING SPADE";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[13]] = "Take Spade";
    }

    @Inject
    protected PrepGettingToolsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.eg = lIlIlIllllIl[0];
        this.eh = lIlIlIllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        if (bb.llIlllllIlllII(this.cq(), this.el)) {
            return lIlIlIllllIl[2];
        }
        int[] nArray = new int[lIlIlIllllIl[3]];
        nArray[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (bb.llIlllllIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIllllIl[3]];
            nArray2[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[5];
            if (bb.llIlllllIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return lIlIlIllllIl[2];
            }
        }
        int[] nArray3 = new int[lIlIlIllllIl[3]];
        nArray3[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[6];
        TileObject var1 = TileObjects.getNearest((int[])nArray3);
        if (bb.llIlllllIllllI(var1)) {
            bb var2;
            System.out.println(lIlIlIllllII[lIlIlIllllIl[2]]);
            Movement.setDestination((WorldPoint)var2.ak.bq.dx(lIlIlIllllIl[7]).dy(lIlIlIllllIl[7]));
            return lIlIlIllllIl[3];
        }
        int[] nArray4 = new int[lIlIlIllllIl[3]];
        nArray4[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (bb.llIlllllIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[3]]);
            var1.interact(lIlIlIllllII[lIlIlIllllIl[8]]);
            return lIlIlIllllIl[3];
        }
        int[] nArray5 = new int[lIlIlIllllIl[3]];
        nArray5[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[9];
        if (bb.llIlllllIlllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[10]]);
            var1.interact(lIlIlIllllII[lIlIlIllllIl[11]]);
            return lIlIlIllllIl[3];
        }
        System.out.println(lIlIlIllllII[lIlIlIllllIl[12]]);
        var1_1.interact(lIlIlIllllII[lIlIlIllllIl[13]]);
        return lIlIlIllllIl[3];
    }

        return String.valueOf(var3);
    }

    private static boolean llIlllllIllllI(Object object) {
        return object == null;
    }

    private static boolean llIllllllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllllIlllIl(int n2) {
        return n2 != 0;
    }

    static {
        bb.llIlllllIllIll();
        bb.llIlllllIllIlI();
    }
}

