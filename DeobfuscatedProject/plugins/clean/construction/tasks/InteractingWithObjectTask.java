/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Interacting with object")
public class InteractingWithObjectTask
extends Task {
    
    private  int fQ;
    
    private  int fR;
    private final  SquireQuestHelper fP;

    @Inject
    public InteractingWithObjectTask(SquireQuestHelper squireQuestHelper) {
        this.fQ = lIIIIIIlI[0];
        this.fP = squireQuestHelper;
    }

    private static void lllIIIIlIl() {
        lIIIIIIIl = new String[lIIIIIIlI[1]];
        bn.lIIIIIIIl[bn.lIIIIIIlI[0]] = "ObjectStep";
        bn.lIIIIIIIl[bn.lIIIIIIlI[2]] = "Object is null, walking";
        bn.lIIIIIIIl[bn.lIIIIIIlI[4]] = "Couldn't reach object.";
        bn.lIIIIIIIl[bn.lIIIIIIlI[6]] = "Performing %s";
        bn.lIIIIIIIl[bn.lIIIIIIlI[5]] = "Performing first non null";
        bn.lIIIIIIIl[bn.lIIIIIIlI[3]] = "-";
        bn.lIIIIIIIl[bn.lIIIIIIlI[7]] = " ";
        bn.lIIIIIIIl[bn.lIIIIIIlI[8]] = " ";
    }

    private static boolean lllIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] llIIllllIIIlIIl;
        Item llIIllllIIIlIlI;
        bn llIIllllIIIlllI;
        if (bn.lllIIIIlll(Dialog.isOpen() ? 1 : 0) && bn.lllIIIlIIl(this.fP.cu() ? 1 : 0) && bn.lllIIIlIlI(this.fR, lIIIIIIlI[3])) {
            this.fR += lIIIIIIlI[2];
            return lIIIIIIlI[0];
        }
        llIIllllIIIlllI.fR = lIIIIIIlI[0];
        String llIIllllIIIllIl = llIIllllIIIlllI.fP.cz();
        if (bn.lllIIIlIIl(llIIllllIIIllIl.equals(lIIIIIIIl[lIIIIIIlI[0]]) ? 1 : 0)) {
            return lIIIIIIlI[0];
        }
        if (bn.lllIIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIIIIlI[0];
        }
        TileObject llIIllllIIIllII = llIIllllIIIlllI.fP.cx();
        if (bn.lllIIIlIll(llIIllllIIIllII)) {
            Log.info((String)lIIIIIIIl[lIIIIIIlI[2]]);
            return llIIllllIIIlllI.fP.cB();
        }
        if (bn.lllIIIIlll(bn.e(llIIllllIIIllII) ? 1 : 0) && bn.lllIIIllII(llIIllllIIIlllI.fQ, lIIIIIIlI[3])) {
            if (bn.lllIIIIlll(llIIllllIIIlllI.fP.d(llIIllllIIIllII) ? 1 : 0)) {
                return lIIIIIIlI[2];
            }
            Log.info((String)lIIIIIIIl[lIIIIIIlI[4]]);
            llIIllllIIIlllI.fQ += lIIIIIIlI[2];
            return lIIIIIIlI[2];
        }
        llIIllllIIIlllI.fQ = lIIIIIIlI[0];
        List<Integer> llIIllllIIIlIll = llIIllllIIIlllI.fP.cI();
        if (bn.lllIIIlIIl(llIIllllIIIlIll.isEmpty() ? 1 : 0) && bn.lllIIIllIl(llIIllllIIIlIlI = Inventory.getFirst(item -> llIIllllIIIlIll.contains(item.getId())))) {
            llIIllllIIIlIlI.useOn(llIIllllIIIllII);
            llIIllllIIIlllI.sleep(lIIIIIIlI[5]);
            return lIIIIIIlI[2];
        }
        llIIllllIIIlIlI = llIIllllIIIlllI.cL();
        String[] llIIllllIIIlIII = llIIllllIIIlIIl = llIIllllIIIllII.getActions();
        int llIIllllIIIIlll = llIIllllIIIlIII.length;
        int llIIllllIIIIllI = lIIIIIIlI[0];
        while (bn.lllIIIlIlI(llIIllllIIIIllI, llIIllllIIIIlll)) {
            String llIIllllIIIIlIl = llIIllllIIIlIII[llIIllllIIIIllI];
            if (bn.lllIIIlIll(llIIllllIIIIlIl)) {

                }
            } else if (bn.lllIIIIlll(llIIllllIIIlIlI.test(llIIllllIIIIlIl) ? 1 : 0)) {
                llIIllllIIIlllI.sleep(lIIIIIIlI[4]);
                Object[] objectArray = new Object[lIIIIIIlI[2]];
                objectArray[bn.lIIIIIIlI[0]] = llIIllllIIIIlIl;
                Log.info((String)lIIIIIIIl[lIIIIIIlI[6]], (Object[])objectArray);
                llIIllllIIIllII.interact(llIIllllIIIIlIl);
                return lIIIIIIlI[2];
            }
            ++llIIllllIIIIllI;

            if (-1 == -1) continue;
            return false;
        }
        Log.info((String)lIIIIIIIl[lIIIIIIlI[5]]);
        var2_2.interact(Objects::nonNull);
        return lIIIIIIlI[2];
    }

    private static boolean lllIIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIIIlIll(Object object) {
        return object == null;
    }

        return String.valueOf(llIIlllIlIlllll);
    }

    private Predicate<String> cL() {
        Object object = this.fP.cy();
        List<String> list = this.fP.cD();
        return string -> {
            void llIIlllIlllllIl;
            if (bn.lllIIIlIll(string)) {
                return lIIIIIIlI[0];
            }
            String[] llIIlllIlllllII = llIIlllIlllllIl.replaceAll(lIIIIIIIl[lIIIIIIlI[3]], lIIIIIIIl[lIIIIIIlI[7]]).split(lIIIIIIIl[lIIIIIIlI[8]]);
            int llIIlllIllllIll = llIIlllIlllllII.length;
            int llIIlllIllllIlI = lIIIIIIlI[0];
            while (bn.lllIIIlIlI(llIIlllIllllIlI, llIIlllIllllIll)) {
                List llIIlllIllllllI;
                String llIIlllIllllIIl = llIIlllIlllllII[llIIlllIllllIlI];
                if (bn.lllIIIlIIl(llIIlllIllllllI.stream().noneMatch(string2 -> string2.toLowerCase().contains(llIIlllIllllIIl.toLowerCase())) ? 1 : 0)) {
                    return lIIIIIIlI[0];
                }
                ++llIIlllIllllIlI;

                return false;
            }
            return lIIIIIIlI[2];
        };
    }

    private static boolean e(TileObject tileObject) {
        int n2;
        if (!bn.lllIIIIlll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0) || bn.lllIIIlIII(tileObject.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIIIIIIlI[1])) {
            n2 = lIIIIIIlI[2];

            if (2 == 0) {
                return ((0xB7 ^ 0xC1 ^ (6 ^ 0x64)) & (0xAA ^ 0xBF ^ 1 ^ -1)) != 0;
            }
        } else {
            n2 = lIIIIIIlI[0];
        }
        return n2 != 0;
    }

    static {
        bn.lllIIIIllI();
        bn.lllIIIIlIl();
    }

    private static boolean lllIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIl(Object object) {
        return object != null;
    }

    private static boolean lllIIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIIlIIl(int n2) {
        return n2 == 0;
    }
}

