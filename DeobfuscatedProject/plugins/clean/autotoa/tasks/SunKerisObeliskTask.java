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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Sun Keris (OBELISK)", priority=2500, blocking=true)
public class SunKerisObeliskTask
extends AutotoaTaskBase {
    
    private static final  int fM;
    
    private static final  int fN;

    @Override
    public boolean bl() {
        int var1;
        int n2;
        bz var2;
        if (bz.lIlIlIlIIIlIll(this.cl() ? 1 : 0)) {
            this.aY.c(llIllIllIII[0]);
            return llIllIllIII[0];
        }
        if (bz.lIlIlIlIIIllII(Prayers.getPoints(), llIllIllIII[1])) {
            Item var3 = Inventory.getFirst(item -> {
                int n2;
                if (!bz.lIlIlIlIIIlIll(q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) || !bz.lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[19]]) ? 1 : 0) || !bz.lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[17]]) ? 1 : 0) || bz.lIlIlIlIIIlllI(item.getName().contains(llIllIlIlll[llIllIllIII[20]]) ? 1 : 0)) {
                    n2 = llIllIllIII[2];

                    if (2 > 2) {
                        return ((0x3D ^ 0x11 ^ (1 ^ 0x18)) & (0xEE ^ 0xC4 ^ (4 ^ 0x1B) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIllIllIII[0];
                }
                return n2 != 0;
            });
            if (bz.lIlIlIlIIIllIl(var3)) {
                return llIllIllIII[0];
            }
            var3.interact(llIllIlIlll[llIllIllIII[0]]);
            return llIllIllIII[2];
        }
        if (bz.lIlIlIlIIIlIll(var2.aZ() ? 1 : 0) && bz.lIlIlIlIIIlllI(var2.aq() ? 1 : 0) && bz.lIlIlIlIIIllll(var2.aY(), llIllIllIII[2])) {
            int[] nArray = new int[llIllIllIII[3]];
            nArray[bz.llIllIllIII[0]] = llIllIllIII[4];
            nArray[bz.llIllIllIII[2]] = llIllIllIII[5];
            Item var3 = Inventory.getFirst((int[])nArray);
            if (bz.lIlIlIlIIlIIII(var3)) {
                var3.interact(llIllIlIlll[llIllIllIII[2]]);
            }
        }
        if (bz.lIlIlIlIIIlIll(var2.ck() ? 1 : 0)) {
            return llIllIllIII[0];
        }
        if (bz.lIlIlIlIIIllll(Combat.getCurrentHealth(), var2.cj())) {
            return llIllIllIII[0];
        }
        int var3 = Vars.getVarp((int)llIllIllIII[6]);
        if (bz.lIlIlIlIIIlllI(var2.aZ() ? 1 : 0)) {
            n2 = llIllIllIII[7];

            if (((9 ^ 0x1A ^ (0x44 ^ 0xE)) & (0x24 ^ 0x35 ^ (0xFC ^ 0xB4) ^ -1)) != 0) {
                return ((104 + 62 - 73 + 107 ^ 92 + 93 - 159 + 108) & (0x27 ^ 0x60 ^ (0xCA ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            n2 = var1 = llIllIllIII[8];
        }
        if (bz.lIlIlIlIIIlllI(var2.cW.overlyDraining() ? 1 : 0)) {
            int n3;
            if (bz.lIlIlIlIIIlllI(var2.aZ() ? 1 : 0)) {
                n3 = llIllIllIII[9];

                if (((0xA9 ^ 0xB1 ^ (0x10 ^ 0x68)) & (0x1C ^ 0x3F ^ (0x17 ^ 0x54) ^ -1)) >= ((0x8E ^ 0xA6) & ~(0x6F ^ 0x47) ^ (0x71 ^ 0x75))) {
                    return false;
                }
            } else {
                n3 = var1 = llIllIllIII[10];
            }
        }
        if (bz.lIlIlIlIIIllII(var3, var1)) {
            var2.aY.c();
            return llIllIllIII[0];
        }
        var2.aY.c(llIllIllIII[2]);
        Item var4 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!bz.lIlIlIlIIlIIII(var4) || bz.lIlIlIlIIlIIIl(var4.getId(), llIllIllIII[11])) {
            int[] nArray = new int[llIllIllIII[2]];
            nArray[bz.llIllIllIII[0]] = llIllIllIII[11];
            Item var5 = Inventory.getFirst((int[])nArray);
            if (bz.lIlIlIlIIIllIl(var5)) {
                return llIllIllIII[0];
            }
            var5.interact(llIllIlIlll[llIllIllIII[3]]);
        }
        Combat.toggleSpec();
        this.aY.c(llIllIllIII[0]);
        return llIllIllIII[0];
    }

    private static boolean lIlIlIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private boolean ck() {
        int[] nArray = new int[llIllIllIII[3]];
        nArray[bz.llIllIllIII[0]] = llIllIllIII[12];
        nArray[bz.llIllIllIII[2]] = llIllIllIII[13];
        Projectile projectile2 = Projectiles.getAll((int[])nArray).stream().filter(projectile -> {
            boolean bl2;
            if (!bz.lIlIlIlIIlIIIl(projectile.getId(), llIllIllIII[12]) || bz.lIlIlIlIIlIIlI(projectile.getId(), llIllIllIII[13])) {
                bl2 = llIllIllIII[2];

                if (((0x1E ^ 0x3B) & ~(0x57 ^ 0x72)) >= 2) {
                    return false;
                }
            } else {
                bl2 = llIllIllIII[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(Projectile::getRemainingCycles)).orElse(null);
        if (bz.lIlIlIlIIlIIII(projectile2) && bz.lIlIlIlIIIllII(projectile2.getRemainingCycles(), llIllIllIII[16]) && bz.lIlIlIlIIIllll(projectile2.getRemainingCycles(), llIllIllIII[17])) {
            Object[] objectArray = new Object[llIllIllIII[3]];
            objectArray[bz.llIllIllIII[0]] = projectile2.getId();
            objectArray[bz.llIllIllIII[2]] = projectile2.getRemainingCycles();
            Log.info((String)llIllIlIlll[llIllIllIII[18]], (Object[])objectArray);
            return llIllIllIII[2];
        }
        return llIllIllIII[0];
    }

    private static boolean lIlIlIlIIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIlIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIIIlllI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    private int cj() {
        void var7;
        int[] nArray = new int[llIllIllIII[3]];
        nArray[bz.llIllIllIII[0]] = llIllIllIII[12];
        nArray[bz.llIllIllIII[2]] = llIllIllIII[13];
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (bz.lIlIlIlIIIllIl(projectile)) {
            return llIllIllIII[2];
        }
        if (bz.lIlIlIlIIlIIlI(var7.getId(), llIllIllIII[13])) {
            return llIllIllIII[14];
        }
        return llIllIllIII[15];
    }

    private static boolean lIlIlIlIIlIIII(Object object) {
        return object != null;
    }

    static {
        bz.lIlIlIlIIIlIlI();
        bz.lIlIlIlIIIlIIl();
        fM = llIllIllIII[12];
        fN = llIllIllIII[13];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean cl() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[llIllIllIII[2]];
                nArray[bz.llIllIllIII[0]] = llIllIllIII[11];
                if (!bz.lIlIlIlIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIllIllIII[2]];
                nArray2[bz.llIllIllIII[0]] = llIllIllIII[11];
                if (!bz.lIlIlIlIIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = llIllIllIII[2];

            if (-1 <= 2) return n2 != 0;
            return ((9 ^ 6) & ~(0x97 ^ 0x98) & ~((0x16 ^ 0x4D) & ~(0x5F ^ 4))) != 0;
        }
        n2 = llIllIllIII[0];
        return n2 != 0;
    }

    @Inject
    protected SunKerisObeliskTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIlIIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIlIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIlIIIlIIl() {
        llIllIlIlll = new String[llIllIllIII[21]];
        bz.llIllIlIlll[bz.llIllIllIII[0]] = "Drink";
        bz.llIllIlIlll[bz.llIllIllIII[2]] = "Drink";
        bz.llIllIlIlll[bz.llIllIllIII[3]] = "Wield";
        bz.llIllIlIlll[bz.llIllIllIII[18]] = "Should tick eat now: {} {} {}";
        bz.llIllIlIlll[bz.llIllIllIII[19]] = "restore";
        bz.llIllIlIlll[bz.llIllIllIII[17]] = "Prayer";
        bz.llIllIlIlll[bz.llIllIllIII[20]] = "Sanfew";
    }
}

