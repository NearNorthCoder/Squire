/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Curing Poison/Venom")
public class CuringPoisonvenomTask
extends AutotoaManager {

    private final  SquireAutoTOA cP;
    private final  C cQ;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        al.var9();
        al.var10();
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[8];
        al.var2[0] = (0xB5 ^ 0xC3 ^ (0x61 ^ 7)) & (65 + 128 - 90 + 51 ^ 131 + 95 - 168 + 80 ^ -1);
        al.var2[1] = 1;
        al.var2[2] = 2;
        al.var2[3] = 3;
        al.var2[4] = 0x5C ^ 0x58;
        al.var2[5] = 109 + 33 - 9 + 58 ^ 15 + 39 - -7 + 125;
        al.var2[6] = 0x1C ^ 0x70 ^ (0x74 ^ 0x1E);
        al.var2[7] = 0x9B ^ 0x8B ^ (0x33 ^ 0x2B);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (!al.var19(this.cP.e() ? 1 : 0) || al.var19(this.bc() ? 1 : 0)) {
            return var2[0];
        }
        if (al.var19(Combat.isPoisoned() ? 1 : 0) && al.var19(Combat.isVenomed() ? 1 : 0)) {
            return var2[0];
        }
        if (al.var11(TileObjects.getAll(tileObject -> {
            int n2;
            if (!al.var19(tileObject.getName().toLowerCase().contains(var1[var2[4]]) ? 1 : 0) || al.var11(tileObject.getName().toLowerCase().contains(var1[var2[5]]) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if ((0xBA ^ 0xBE) <= 0) {
                    return ((0x93 ^ 0x98) & ~(0x5B ^ 0x50)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).stream().anyMatch(tileObject -> tileObject.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return var2[0];
        }
        Item var20 = Inventory.getFirst(item -> {
            boolean bl2;
            if (!al.var19(item.getName().contains(var1[var2[1]]) ? 1 : 0) || !al.var19(item.getName().contains(var1[var2[2]]) ? 1 : 0) || al.var11(item.getName().contains(var1[var2[3]]) ? 1 : 0)) {
                bl2 = var2[1];
                0;
                if (-(59 + 141 - 99 + 60 ^ 1 + 33 - 28 + 158) >= 0) {
                    return ((0x41 ^ 0x14 ^ (0xBC ^ 0xC5)) & (75 + 38 - 59 + 85 ^ 62 + 72 - 9 + 42 ^ -1)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        });
        if (al.var12(var20)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[0];
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static void var10() {
        var1 = new String[var2[6]];
        al.var1[al.var2[0]] = "Drink";
        al.var1[al.var2[1]] = "Anti";
        al.var1[al.var2[2]] = "dote";
        al.var1[al.var2[3]] = "venom";
        al.var1[al.var2[4]] = "venom";
        al.var1[al.var2[5]] = "poison";
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (al.var21(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (2 != ((0x4F ^ 0x11) & ~(0xF5 ^ 0xAB))) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    @Inject
    protected CuringPoisonvenomTask(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cP = squireAutoTOA;
        this.cQ = c2;
    }
}

