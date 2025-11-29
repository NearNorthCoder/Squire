/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum12;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Sun Keris (OBELISK)", priority=2500, blocking=true)
public class SunKerisObeliskTask
extends AutotoaManager {
    
    private static final  int fM;
    
    private static final  int fN;

    @Override
    public boolean bl() {
        int var3;
        int n2;
        bz var4;
        if (bz.var5(this.cl() ? 1 : 0)) {
            this.aY.c(var1[0]);
            return var1[0];
        }
        if (bz.var6(Prayers.getPoints(), var1[1])) {
            Item var7 = Inventory.getFirst(item -> {
                int n2;
                if (!bz.var5(q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !bz.var5(item.getName().contains(var2[var1[19]]) ? 1 : 0) || !bz.var5(item.getName().contains(var2[var1[17]]) ? 1 : 0) || bz.var8(item.getName().contains(var2[var1[20]]) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if (2 > 2) {
                        return ((0x3D ^ 0x11 ^ (1 ^ 0x18)) & (0xEE ^ 0xC4 ^ (4 ^ 0x1B) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
            if (bz.var9(var7)) {
                return var1[0];
            }
            var7.interact(var2[var1[0]]);
            return var1[2];
        }
        if (bz.var5(var4.aZ() ? 1 : 0) && bz.var8(var4.aq() ? 1 : 0) && bz.var10(var4.aY(), var1[2])) {
            int[] nArray = new int[var1[3]];
            nArray[bz.var1[0]] = var1[4];
            nArray[bz.var1[2]] = var1[5];
            Item var7 = Inventory.getFirst((int[])nArray);
            if (bz.var11(var7)) {
                var7.interact(var2[var1[2]]);
            }
        }
        if (bz.var5(var4.ck() ? 1 : 0)) {
            return var1[0];
        }
        if (bz.var10(Combat.getCurrentHealth(), var4.cj())) {
            return var1[0];
        }
        int var7 = Vars.getVarp((int)var1[6]);
        if (bz.var8(var4.aZ() ? 1 : 0)) {
            n2 = var1[7];
            0;
            if (((9 ^ 0x1A ^ (0x44 ^ 0xE)) & (0x24 ^ 0x35 ^ (0xFC ^ 0xB4) ^ -1)) != 0) {
                return ((104 + 62 - 73 + 107 ^ 92 + 93 - 159 + 108) & (0x27 ^ 0x60 ^ (0xCA ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            n2 = var3 = var1[8];
        }
        if (bz.var8(var4.cW.overlyDraining() ? 1 : 0)) {
            int n3;
            if (bz.var8(var4.aZ() ? 1 : 0)) {
                n3 = var1[9];
                0;
                if (((0xA9 ^ 0xB1 ^ (0x10 ^ 0x68)) & (0x1C ^ 0x3F ^ (0x17 ^ 0x54) ^ -1)) >= ((0x8E ^ 0xA6) & ~(0x6F ^ 0x47) ^ (0x71 ^ 0x75))) {
                    return ((8 + 154 - -10 + 23 ^ 60 + 25 - -13 + 50) & (37 + 177 - 171 + 208 ^ 5 + 112 - 93 + 148 ^ -1)) != 0;
                }
            } else {
                n3 = var3 = var1[10];
            }
        }
        if (bz.var6(var7, var3)) {
            var4.aY.c();
            return var1[0];
        }
        var4.aY.c(var1[2]);
        Item var12 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!bz.var11(var12) || bz.var13(var12.getId(), var1[11])) {
            int[] nArray = new int[var1[2]];
            nArray[bz.var1[0]] = var1[11];
            Item var14 = Inventory.getFirst((int[])nArray);
            if (bz.var9(var14)) {
                return var1[0];
            }
            var14.interact(var2[var1[3]]);
        }
        Combat.toggleSpec();
        this.aY.c(var1[0]);
        return var1[0];
    }

    private static void var15() {
        var1 = new int[22];
        bz.var1[0] = (0x60 ^ 0x3C) & ~(0x4B ^ 0x17);
        bz.var1[1] = 0x68 ^ 0x5B;
        bz.var1[2] = 1;
        bz.var1[3] = 2;
        bz.var1[4] = -(0xFFFFD5BB & 0x3F77) & (0xFFFFFFFF & Short.MAX_VALUE);
        bz.var1[5] = -(0xE6 ^ 0xC7) & (0xFFFFFEEB & 0x6BFF);
        bz.var1[6] = 0xFFFFB3EE & 0x4D3D;
        bz.var1[7] = 0xFFFFA377 & 0x5DFF;
        bz.var1[8] = -(0xFFFFA76A & 0x5997) & (0xFFFFC7EF & 0x3BFF);
        bz.var1[9] = 0xFFFFC1F5 & 0x3FFE;
        bz.var1[10] = 0xFFFF87FD & 0x7BEA;
        bz.var1[11] = 0xFFFFFF9F & 0x6AFB;
        bz.var1[12] = -(0xFFFF974B & 0x7FF6) & (0xFFFFBFFF & 0x5FFF);
        bz.var1[13] = -(0xFFFFCE63 & 0x779F) & (0xFFFFCEBF & Short.MAX_VALUE);
        bz.var1[14] = 0x2D ^ 0x33;
        bz.var1[15] = 0x7E ^ 0x59 ^ (0xAB ^ 0xA1);
        bz.var1[16] = 0xC2 ^ 0x84;
        bz.var1[17] = 0xD ^ 8;
        bz.var1[18] = 3;
        bz.var1[19] = 0x78 ^ 0x7C;
        bz.var1[20] = 0xAB ^ 0xAD;
        bz.var1[21] = 0xBE ^ 0xB9;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private boolean ck() {
        int[] nArray = new int[var1[3]];
        nArray[bz.var1[0]] = var1[12];
        nArray[bz.var1[2]] = var1[13];
        Projectile projectile2 = Projectiles.getAll((int[])nArray).stream().filter(projectile -> {
            boolean bl2;
            if (!bz.var13(projectile.getId(), var1[12]) || bz.var16(projectile.getId(), var1[13])) {
                bl2 = var1[2];
                0;
                if (((0x1E ^ 0x3B) & ~(0x57 ^ 0x72)) >= 2) {
                    return ((0x2F ^ 0x29) & ~(0xA8 ^ 0xAE)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(Projectile::getRemainingCycles)).orElse(null);
        if (bz.var11(projectile2) && bz.var6(projectile2.getRemainingCycles(), var1[16]) && bz.var10(projectile2.getRemainingCycles(), var1[17])) {
            Object[] objectArray = new Object[var1[3]];
            objectArray[bz.var1[0]] = projectile2.getId();
            objectArray[bz.var1[2]] = projectile2.getRemainingCycles();
            Log.info((String)var2[var1[18]], (Object[])objectArray);
            return var1[2];
        }
        return var1[0];
    }

    private static boolean var13(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (bz.var6(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    /*
     * WARNING - void declaration
     */
    private int cj() {
        void var27;
        int[] nArray = new int[var1[3]];
        nArray[bz.var1[0]] = var1[12];
        nArray[bz.var1[2]] = var1[13];
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (bz.var9(projectile)) {
            return var1[2];
        }
        if (bz.var16(var27.getId(), var1[13])) {
            return var1[14];
        }
        return var1[15];
    }

    private static boolean var11(Object object) {
        return object != null;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    static {
        bz.var15();
        bz.var34();
        fM = var1[12];
        fN = var1[13];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean cl() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[var1[2]];
                nArray[bz.var1[0]] = var1[11];
                if (!bz.var5(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[2]];
                nArray2[bz.var1[0]] = var1[11];
                if (!bz.var8(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = var1[2];
            0;
            if (-1 <= 2) return n2 != 0;
            return ((9 ^ 6) & ~(0x97 ^ 0x98) & ~((0x16 ^ 0x4D) & ~(0x5F ^ 4))) != 0;
        }
        n2 = var1[0];
        return n2 != 0;
    }

    @Inject
    protected SunKerisObeliskTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static void var34() {
        var2 = new String[var1[21]];
        bz.var2[bz.var1[0]] = "Drink";
        bz.var2[bz.var1[2]] = "Drink";
        bz.var2[bz.var1[3]] = "Wield";
        bz.var2[bz.var1[18]] = "Should tick eat now: {} {} {}";
        bz.var2[bz.var1[19]] = "restore";
        bz.var2[bz.var1[17]] = "Prayer";
        bz.var2[bz.var1[20]] = "Sanfew";
    }
}

