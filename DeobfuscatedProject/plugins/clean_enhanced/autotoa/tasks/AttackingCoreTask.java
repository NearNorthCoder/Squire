/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking core", priority=50, blocking=true, register=true)
public class AttackingCoreTask
extends AutotoaManager {
    private  int fV;
    private static final  int fS;
    private  boolean fW;
    private static final  int fT;
    private static final  int fP;
    private  int fU;

    private static final  int fO;
    private static final  int fR;
    private static final  int fQ;

    private static void var3() {
        var2 = new String[var1[22]];
        bA.var2[bA.var1[0]] = "Wield";
        bA.var2[bA.var1[6]] = "Drink";
        bA.var2[bA.var1[4]] = "Attack";
        bA.var2[bA.var1[16]] = "Core projectile spawned";
        bA.var2[bA.var1[17]] = "Core";
        bA.var2[bA.var1[19]] = "Warden";
        bA.var2[bA.var1[20]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_6;
        bA var4;
        void var5;
        NPC nPC = this.co();
        if (bA.var6(nPC)) {
            return var1[0];
        }
        if (!bA.var7(var5.getAnimation(), var1[1]) || bA.var8(var5.getAnimation(), var1[2])) {
            var4.fU = var1[3];
            return var1[0];
        }
        int[] nArray = new int[var1[4]];
        nArray[bA.var1[0]] = var1[5];
        nArray[bA.var1[6]] = var1[7];
        Item var9 = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[var1[4]];
        nArray2[bA.var1[0]] = var1[5];
        nArray2[bA.var1[6]] = var1[7];
        int n2 = Equipment.contains((int[])nArray2);
        if ((!bA.var6(var9) || bA.var10(n2)) && bA.var11(var4.cu.getTickCount() - var4.fU, var1[8] + (var4.fV - var1[6]) * var1[9])) {
            if (bA.var12(n2)) {
                var9.interact(var2[var1[0]]);
                0;
                if (1 < 1) {
                    return ((0x72 ^ 0x67) & ~(0x78 ^ 0x6D)) != 0;
                }
            }
        } else {
            boolean bl2;
            if (bA.var12(var4.cW.overlyDraining() ? 1 : 0)) {
                bl2 = var1[6];
                0;
                if null != null {
                    return ((102 + 150 - 150 + 58 ^ 81 + 130 - 144 + 71) & (0x6C ^ 0x1A ^ (0x4C ^ 0x10) ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            boolean var13 = var4.e(bl2);
        }
        if (bA.var12(var4.aZ() ? 1 : 0) && bA.var11(var4.aY(), var1[10]) && bA.var12(var4.cW.overlyDraining() ? 1 : 0)) {
            int[] nArray3 = new int[var1[4]];
            nArray3[bA.var1[0]] = var1[11];
            nArray3[bA.var1[6]] = var1[12];
            Item var13 = Inventory.getFirst((int[])nArray3);
            if (bA.var14(var13)) {
                var13.interact(var2[var1[6]]);
            }
        }
        int[] nArray4 = new int[var1[6]];
        nArray4[bA.var1[0]] = var1[13];
        NPC var13 = NPCs.getNearest((int[])nArray4);
        if (bA.var6(var13)) {
            return var1[6];
        }
        this.aY.a(var1[14]);
        var4_6.interact(var2[var1[4]]);
        return var1[6];
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static void var15() {
        var1 = new int[23];
        bA.var1[0] = (0x4D ^ 0x1E) & ~(0xCA ^ 0x99) & ~((0xBE ^ 0x9D) & ~(0xAC ^ 0x8F));
        bA.var1[1] = -(0xFFFFDA3D & 0x67F7) & (0xFFFFE7FF & 0x7FFC);
        bA.var1[2] = -(0xFFFFBF2D & 0x5AD3) & (0xFFFFBFBF & 0x7FFE);
        bA.var1[3] = -1;
        bA.var1[4] = 2;
        bA.var1[5] = -(0xFFFFF90F & 0x56F2) & (0xFFFFFE1F & 0x7FFD);
        bA.var1[6] = 1;
        bA.var1[7] = 0xFFFFEFFB & 0x5F96;
        bA.var1[8] = 0x2F ^ 0x7E ^ (0xC3 ^ 0x81);
        bA.var1[9] = 137 + 24 - 33 + 58 ^ 173 + 126 - 251 + 130;
        bA.var1[10] = -(0xFFFFDE8E & 0x39F3) & (0xFFFF9FFB & 0x7BD7);
        bA.var1[11] = -(0xFFFF8353 & 0x7DBF) & (0xFFFFEFFF & 0x7BDF);
        bA.var1[12] = 0xFFFFEFEB & 0x7ADF;
        bA.var1[13] = -(0xFFFFEB65 & 0x569F) & (0xFFFFFFFF & 0x6FFF);
        bA.var1[14] = 0xB6 ^ 0xB9;
        bA.var1[15] = 0xFFFFBDC7 & 0x4AF8;
        bA.var1[16] = 3;
        bA.var1[17] = 0x29 ^ 0x58 ^ (0 ^ 0x75);
        bA.var1[18] = 0x8F ^ 0xA6 ^ (0x60 ^ 0x43);
        bA.var1[19] = 40 + 156 - 137 + 117 ^ 73 + 11 - 6 + 103;
        bA.var1[20] = 83 + 10 - 25 + 128 ^ 48 + 19 - -111 + 16;
        bA.var1[21] = 0xFFFFEDC7 & 0x37FE;
        bA.var1[22] = 0xA7 ^ 0xA0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 != n3;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[0];
        while (bA.var31(var30, var29)) {
            char var32 = var28[var30];
            var25.append((char)(var32 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((0xC ^ 9) != 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.specialCore();
    }

    @Inject
    protected AttackingCoreTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.normalCore();
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        if (bA.var8(projectile.getId(), var1[15])) {
            Log.info((String)var2[var1[16]]);
            this.fV += var1[6];
            this.fU = this.cu.getTickCount();
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public void r() {
        this.fU = var1[0];
        this.fW = var1[0];
        this.fV = var1[0];
    }

    private static boolean var31(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Override
    public boolean bk() {
        boolean bl2;
        String[] stringArray = new String[var1[6]];
        stringArray[bA.var1[0]] = var2[var1[17]];
        if (!bA.var6(NPCs.getNearest((String[])stringArray)) || !bA.var14(NPCs.getNearest(nPC -> {
            int n2;
            if (bA.var10(nPC.getName().contains(var2[var1[19]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[6]];
                stringArray[bA.var1[0]] = var2[var1[20]];
                if (bA.var10(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[6];
                    0;
                    if (((0x9D ^ 0x86) & ~(0x1D ^ 6)) >= 0) return n2 != 0;
                    return ((0x8D ^ 0xAA) & ~(0x59 ^ 0x7E)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        })) || bA.var31(this.cu.getTickCount() - this.fU, var1[18])) {
            bl2 = var1[6];
            0;
            if (((184 + 110 - 191 + 85 ^ 49 + 68 - 91 + 158) & (0x36 ^ 0x10 ^ (0x62 ^ 0x40) ^ -1)) != 0) {
                return ((0x5E ^ 0x56 ^ (0x5E ^ 0x47)) & (0x68 ^ 0x40 ^ (0xAA ^ 0x93) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[0];
        }
        return bl2;
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    static {
        bA.var15();
        bA.var3();
        fO = var1[13];
        fT = var1[10];
        fR = var1[1];
        fS = var1[2];
        fQ = var1[21];
        fP = var1[15];
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }
}

