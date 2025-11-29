/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.skilling.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

public abstract class SkillingTaskBase
extends Task {
    protected final  SquireBankStander i;
    protected final  BankStanderConfig j;
    protected final  b k;
    protected  InventorySetup l;

    public boolean run() {
        a var1;
        if (a.lIlIllIIlIlIIl((Object)this.j.activity(), (Object)this.k)) {
            return lllIIIIllIl[0];
        }
        var1.l = var1.i.SkillingTaskBase();
        if (a.lIlIllIIlIlIlI(var1.l)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIIIllIl[0];
        }
        if (a.lIlIllIIlIlIIl((Object)var1.j.activity(), (Object)b.GLASS_MAKE)) {
            if (a.lIlIllIIlIllII(var1.g().isEmpty() ? 1 : 0)) {
                Iterator<Map.Entry<Integer, Integer>> var2 = var1.g().entrySet().iterator();
                while (a.lIlIllIIlIlIll(var2.hasNext() ? 1 : 0)) {
                    Map.Entry<Integer, Integer> var3 = var2.next();
                    int[] nArray = new int[lllIIIIllIl[1]];
                    nArray[a.lllIIIIllIl[0]] = var3.getKey();
                    if (a.lIlIllIIlIllIl(Inventory.getCount((boolean)lllIIIIllIl[1], (int[])nArray), var3.getValue())) {
                        var1.f();
                        return lllIIIIllIl[1];
                    }

                    if (-1 < 0) continue;
                    return ((0x21 ^ 0x18 ^ (0x2A ^ 0x14)) & (0x1B ^ 0x79 ^ (0x4C ^ 0x29) ^ -1)) != 0;
                }
            }
            if (a.lIlIllIIlIllIl(var1.i.e(), var1.i())) {
                return lllIIIIllIl[0];
            }
        }
        return this.h();
    }

    static {
        a.lIlIllIIlIlIII();
        a.lIlIllIIlIIlll();
    }

    public abstract int i();

    public abstract Map<Integer, Integer> g();

    private static void lIlIllIIlIIlll() {
        lllIIIIllII = new String[lllIIIIllIl[16]];
        a.lllIIIIllII[a.lllIIIIllIl[0]] = "Bank booth";
        a.lllIIIIllII[a.lllIIIIllIl[1]] = "Grand Exchange booth";
        a.lllIIIIllII[a.lllIIIIllIl[3]] = "Bank chest";
        a.lllIIIIllII[a.lllIIIIllIl[4]] = "Bank Chest-wreck";
        a.lllIIIIllII[a.lllIIIIllIl[5]] = "Bank Camel";
        a.lllIIIIllII[a.lllIIIIllIl[2]] = "Banker";
        a.lllIIIIllII[a.lllIIIIllIl[6]] = "Grand Exchange clerk";
        a.lllIIIIllII[a.lllIIIIllIl[7]] = "Emerald Benedict";
        a.lllIIIIllII[a.lllIIIIllIl[8]] = "Arnold Lydspor";
        a.lllIIIIllII[a.lllIIIIllIl[9]] = "Ashuelot Reis";
        a.lllIIIIllII[a.lllIIIIllIl[10]] = "Bank";
        a.lllIIIIllII[a.lllIIIIllIl[11]] = "Use";
        a.lllIIIIllII[a.lllIIIIllIl[12]] = "Open";
        a.lllIIIIllII[a.lllIIIIllIl[13]] = "Bank";
        a.lllIIIIllII[a.lllIIIIllIl[14]] = "Use";
        a.lllIIIIllII[a.lllIIIIllIl[15]] = "Open";
    }

    private static boolean lIlIllIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlIllII(int n2) {
        return n2 == 0;
    }

    public SkillingTaskBase(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig, b b2) {
        this.i = squireBankStander;
        this.j = bankStanderConfig;
        this.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var3_3;
        if (a.lIlIllIIlIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.openMainTab();
            return;
        }
        if (a.lIlIllIIlIlIll(Bank.isPinWindowOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[lllIIIIllIl[2]];
        stringArray[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[0]];
        stringArray[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[1]];
        stringArray[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[3]];
        stringArray[a.lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[4]];
        stringArray[a.lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[5]];
        ArrayList var4 = new ArrayList(TileObjects.getAll((String[])stringArray));
        String[] stringArray2 = new String[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[2]];
        stringArray2[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[6]];
        stringArray2[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[7]];
        stringArray2[a.lllIIIIllIl[4]] = lllIIIIllII[lllIIIIllIl[8]];
        stringArray2[a.lllIIIIllIl[5]] = lllIIIIllII[lllIIIIllIl[9]];
        var4.addAll(NPCs.getAll((String[])stringArray2));

        Player var5 = Players.getLocal();
        Interactable var6 = var4.stream().sorted(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var5))).limit(5L).filter(interactable -> {
            String[] stringArray = new String[lllIIIIllIl[4]];
            stringArray[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[13]];
            stringArray[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[14]];
            stringArray[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[15]];
            return interactable.hasAction(stringArray);
        }).filter(interactable -> Reachable.isInteractable((Locatable)((Locatable)interactable))).min(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var5))).orElse(null);
        if (a.lIlIllIIlIlIlI(var6)) {
            return;
        }
        Locatable var7 = (Locatable)var6;
        if (a.lIlIllIIlIlllI(var7.distanceTo((Locatable)var5), lllIIIIllIl[8])) {
            Movement.setDestination((WorldPoint)var7.getWorldLocation());
            return;
        }
        String[] stringArray3 = new String[lllIIIIllIl[4]];
        stringArray3[a.lllIIIIllIl[0]] = lllIIIIllII[lllIIIIllIl[10]];
        stringArray3[a.lllIIIIllIl[1]] = lllIIIIllII[lllIIIIllIl[11]];
        stringArray3[a.lllIIIIllIl[3]] = lllIIIIllII[lllIIIIllIl[12]];
        var3_3.interact(stringArray3);
    }

        return String.valueOf(var8);
    }

    public abstract boolean h();

    private static boolean lIlIllIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIlIlI(Object object) {
        return object == null;
    }

}

