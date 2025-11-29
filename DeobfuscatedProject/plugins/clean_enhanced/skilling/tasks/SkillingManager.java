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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import gg.squire.skilling.tasks.GameEnum4;
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

public abstract class SkillingManager
extends Task {
    protected final  SquireBankStander i;
    protected final  BankStanderConfig j;
    protected final  b k;
    protected  InventorySetup l;

    public boolean run() {
        a var3;
        if (a.var4((Object)this.j.activity(), (Object)this.k)) {
            return var1[0];
        }
        var3.l = var3.i.SkillingManager();
        if (a.var5(var3.l)) {
            return var1[0];
        }
        if (a.var6(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (a.var7(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (a.var4((Object)var3.j.activity(), (Object)b.GLASS_MAKE)) {
            if (a.var7(var3.g().isEmpty() ? 1 : 0)) {
                Iterator<Map.Entry<Integer, Integer>> var8 = var3.g().entrySet().iterator();
                while (a.var6(var8.hasNext() ? 1 : 0)) {
                    Map.Entry<Integer, Integer> var9 = var8.next();
                    int[] nArray = new int[var1[1]];
                    nArray[a.var1[0]] = var9.getKey();
                    if (a.var10(Inventory.getCount((boolean)var1[1], (int[])nArray), var9.getValue())) {
                        var3.f();
                        return var1[1];
                    }
                    0;
                    if (-1 < 0) continue;
                    return ((0x21 ^ 0x18 ^ (0x2A ^ 0x14)) & (0x1B ^ 0x79 ^ (0x4C ^ 0x29) ^ -1)) != 0;
                }
            }
            if (a.var10(var3.i.e(), var3.i())) {
                return var1[0];
            }
        }
        return this.h();
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        a.var17();
        a.var18();
    }

    public abstract int i();

    public abstract Map<Integer, Integer> g();

    private static void var18() {
        var2 = new String[var1[16]];
        a.var2[a.var1[0]] = "Bank booth";
        a.var2[a.var1[1]] = "Grand Exchange booth";
        a.var2[a.var1[3]] = "Bank chest";
        a.var2[a.var1[4]] = "Bank Chest-wreck";
        a.var2[a.var1[5]] = "Bank Camel";
        a.var2[a.var1[2]] = "Banker";
        a.var2[a.var1[6]] = "Grand Exchange clerk";
        a.var2[a.var1[7]] = "Emerald Benedict";
        a.var2[a.var1[8]] = "Arnold Lydspor";
        a.var2[a.var1[9]] = "Ashuelot Reis";
        a.var2[a.var1[10]] = "Bank";
        a.var2[a.var1[11]] = "Use";
        a.var2[a.var1[12]] = "Open";
        a.var2[a.var1[13]] = "Bank";
        a.var2[a.var1[14]] = "Use";
        a.var2[a.var1[15]] = "Open";
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    public SkillingManager(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig, b b2) {
        this.i = squireBankStander;
        this.j = bankStanderConfig;
        this.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var3_3;
        if (a.var6(Bank.isOpen() ? 1 : 0)) {
            Bank.openMainTab();
            return;
        }
        if (a.var6(Bank.isPinWindowOpen() ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[var1[2]];
        stringArray[a.var1[0]] = var2[var1[0]];
        stringArray[a.var1[1]] = var2[var1[1]];
        stringArray[a.var1[3]] = var2[var1[3]];
        stringArray[a.var1[4]] = var2[var1[4]];
        stringArray[a.var1[5]] = var2[var1[5]];
        ArrayList var19 = new ArrayList(TileObjects.getAll((String[])stringArray));
        String[] stringArray2 = new String[var1[2]];
        stringArray2[a.var1[0]] = var2[var1[2]];
        stringArray2[a.var1[1]] = var2[var1[6]];
        stringArray2[a.var1[3]] = var2[var1[7]];
        stringArray2[a.var1[4]] = var2[var1[8]];
        stringArray2[a.var1[5]] = var2[var1[9]];
        var19.addAll(NPCs.getAll((String[])stringArray2));
        0;
        Player var20 = Players.getLocal();
        Interactable var21 = var19.stream().sorted(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var20))).limit(5L).filter(interactable -> {
            String[] stringArray = new String[var1[4]];
            stringArray[a.var1[0]] = var2[var1[13]];
            stringArray[a.var1[1]] = var2[var1[14]];
            stringArray[a.var1[3]] = var2[var1[15]];
            return interactable.hasAction(stringArray);
        }).filter(interactable -> Reachable.isInteractable((Locatable)((Locatable)interactable))).min(Comparator.comparingInt(interactable -> ((Locatable)interactable).distanceTo((Locatable)var20))).orElse(null);
        if (a.var5(var21)) {
            return;
        }
        Locatable var22 = (Locatable)var21;
        if (a.var23(var22.distanceTo((Locatable)var20), var1[8])) {
            Movement.setDestination((WorldPoint)var22.getWorldLocation());
            return;
        }
        String[] stringArray3 = new String[var1[4]];
        stringArray3[a.var1[0]] = var2[var1[10]];
        stringArray3[a.var1[1]] = var2[var1[11]];
        stringArray3[a.var1[3]] = var2[var1[12]];
        var3_3.interact(stringArray3);
    }

    private static void var17() {
        var1 = new int[17];
        a.var1[0] = (0xE8 ^ 0x8E ^ (0xBB ^ 0xBC)) & (114 + 89 - -5 + 38 ^ 58 + 121 - 36 + 8 ^ -1);
        a.var1[1] = 1;
        a.var1[2] = 0x12 ^ 4 ^ (0x3A ^ 0x29);
        a.var1[3] = 2;
        a.var1[4] = 3;
        a.var1[5] = 3 + 15 - -69 + 76 ^ 133 + 20 - 32 + 46;
        a.var1[6] = 0x76 ^ 0x4A ^ (0x2A ^ 0x10);
        a.var1[7] = 0x29 ^ 0x2E;
        a.var1[8] = 0x10 ^ 0x63 ^ (0x63 ^ 0x18);
        a.var1[9] = 0x33 ^ 0x3A;
        a.var1[10] = 0x1D ^ 0x17;
        a.var1[11] = 21 + 72 - -83 + 8 ^ 170 + 70 - 200 + 139;
        a.var1[12] = 0x85 ^ 0x89;
        a.var1[13] = 13 + 108 - 31 + 116 ^ 34 + 79 - -52 + 30;
        a.var1[14] = 0xCA ^ 0xC4;
        a.var1[15] = 0x6A ^ 0x65;
        a.var1[16] = 0x7F ^ 0x6F;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[0];
        while (a.var10(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    public abstract boolean h();

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }
}

