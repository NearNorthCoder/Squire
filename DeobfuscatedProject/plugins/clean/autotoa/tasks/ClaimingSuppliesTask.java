/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Claiming supplies", priority=50, blocking=true)
public class ClaimingSuppliesTask
extends AutotoaTaskBase {
    @Inject
    protected  TOAConfig d;
    private  boolean hJ;
    private final  C hI;
    private static final  int hF;
    
    @Inject
    protected  z cV;
    private final  B hH;
    
    private static final  int[] hG;

    private static boolean lIlIlIIllIlllI(Object object) {
        return object == null;
    }

    private static void lIlIlIIllIlIll() {
        llIllIlIIIl = new String[llIllIlIIlI[9]];
        cb.llIllIlIIIl[cb.llIllIlIIlI[0]] = "Helpful Spirit";
        cb.llIllIlIIIl[cb.llIllIlIIlI[1]] = "Eat";
        cb.llIllIlIIIl[cb.llIllIlIIlI[3]] = "Choose";
        cb.llIllIlIIIl[cb.llIllIlIIlI[4]] = "Claim";
        cb.llIllIlIIIl[cb.llIllIlIIlI[5]] = "Eat";
    }

    static {
        cb.lIlIlIIllIllII();
        cb.lIlIlIIllIlIll();
        hF = llIllIlIIlI[2];
        int[] nArray = new int[llIllIlIIlI[4]];
        nArray[cb.llIllIlIIlI[0]] = llIllIlIIlI[6];
        nArray[cb.llIllIlIIlI[1]] = llIllIlIIlI[7];
        nArray[cb.llIllIlIIlI[3]] = llIllIlIIlI[8];
        hG = nArray;
    }

    private static boolean lIlIlIIllIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        Widget var1;
        int llllllllllllllllIIlIllIllIllIIIl2;
        int n2;
        cb var2;
        if (cb.lIlIlIIllIllIl(this.bb() ? 1 : 0)) {
            this.hJ = llIllIlIIlI[0];
            return llIllIlIIlI[0];
        }
        String[] stringArray = new String[llIllIlIIlI[1]];
        stringArray[cb.llIllIlIIlI[0]] = llIllIlIIIl[llIllIlIIlI[0]];
        NPC var3 = NPCs.getNearest((String[])stringArray);
        if (cb.lIlIlIIllIlllI(var3)) {
            return llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(var2.hJ ? 1 : 0)) {
            return llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(Inventory.isFull() ? 1 : 0)) {
            if (cb.lIlIlIIllIllll(var2.cV.c(var2.cV.a(var2.d.meleeGearAkkha())) ? 1 : 0)) {
                return llIllIlIIlI[1];
            }
            Item llllllllllllllllIIlIllIllIllIIIl2 = Inventory.getFirst(item -> item.hasAction(llIllIlIIIl[llIllIlIIlI[5]]::equals));
            if (cb.lIlIlIIlllIIII(llllllllllllllllIIlIllIllIllIIIl2)) {
                llllllllllllllllIIlIllIllIllIIIl2.interact(llIllIlIIIl[llIllIlIIlI[1]]);
                return llIllIlIIlI[1];
            }
            var2.bh();
            return llIllIlIIlI[1];
        }
        if (!cb.lIlIlIIllIllIl(var2.hI.av().containsKey((Object)e.LIQUID_ADRENALINE) ? 1 : 0) || cb.lIlIlIIllIllll(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            n2 = llIllIlIIlI[1];

            if (3 == -1) {
                return false;
            }
        } else {
            n2 = llllllllllllllllIIlIllIllIllIIIl2 = llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(var2.d.dehydration() ? 1 : 0)) {
            llllllllllllllllIIlIllIllIllIIIl2 = llIllIlIIlI[0];
        }
        if (cb.lIlIlIIllIllll(Widgets.isVisible((Widget)(var1 = Widgets.get((int)llIllIlIIlI[2], (int)hG[llIllIlIIlI[0]]))) ? 1 : 0)) {
            int n3;
            if (cb.lIlIlIIllIllll(llllllllllllllllIIlIllIllIllIIIl2)) {
                n3 = hG[llIllIlIIlI[0]];

                if (3 > (56 + 70 - 73 + 140 ^ 105 + 17 - -60 + 15)) {
                    return ((0xFF ^ 0x9F ^ (0x6F ^ 0x30)) & (64 + 89 - 128 + 128 ^ 6 + 157 - 162 + 165 ^ -1)) != 0;
                }
            } else {
                n3 = hG[llIllIlIIlI[3]];
            }
            int var4 = n3;
            Widgets.get((int)llIllIlIIlI[2], (int)var4).interact(llIllIlIIIl[llIllIlIIlI[3]]);
            var2.hI.a(Widgets.get((int)llIllIlIIlI[2], (int)(var4 - llIllIlIIlI[3])));
            var2.hJ = llIllIlIIlI[1];
            return llIllIlIIlI[1];
        }
        var1_1.interact(llIllIlIIIl[llIllIlIIlI[4]]);
        return llIllIlIIlI[1];
    }

        return String.valueOf(var5);
    }

    private static boolean lIlIlIIllIllll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected ClaimingSuppliesTask(Client client, B b2, C c2) {
        super(client);
        this.hJ = llIllIlIIlI[0];
        this.hH = b2;
        this.hI = c2;
    }

    private static boolean lIlIlIIlllIIII(Object object) {
        return object != null;
    }
}

