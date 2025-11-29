/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.kitten.SquireKittenConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Hunt Cat")
public class HuntCatTask
extends Task {
    private static  String[] lIIIlII;
    private static  int[] lIIIlIl;
    private final  SquireKittenConfig dM;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        az var1;
        if (az.lIIIlIlII(this.dM.huntSpice() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        if (az.lIIIlIlIl(Inventory.isFull() ? 1 : 0)) {
            return lIIIlIl[0];
        }
        TileItem var2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (az.lIIIlIlII(tileItem.getName().contains(lIIIlII[lIIIlIl[4]]) ? 1 : 0) && az.lIIIlIlIl(tileItem.getName().contains(this.dM.spiceType().ax()) ? 1 : 0)) {
                n2 = lIIIlIl[1];
                0;
                if (((60 + 41 - -4 + 38 ^ 99 + 60 - 42 + 61) & (0xCD ^ 0xA7 ^ (0x23 ^ 0x74) ^ -1)) != 0) {
                    return ((0x8F ^ 0x83 ^ (0xBA ^ 0x99)) & (166 + 11 - 130 + 128 ^ 122 + 76 - 76 + 6 ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlIl[0];
            }
            return n2 != 0;
        });
        if (az.lIIIlIllI(var2)) {
            var2.interact(lIIIlII[lIIIlIl[0]]);
            return lIIIlIl[1];
        }
        NPC var3 = NPCs.getNearest(nPC -> {
            boolean bl2;
            NPC var4;
            if ((!az.lIIIlIlII(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[2]]) ? 1 : 0) || az.lIIIlIlIl(nPC.getName().toLowerCase().contains(lIIIlII[lIIIlIl[3]]) ? 1 : 0)) && az.lIIIllIII(var4.getInteracting(), Players.getLocal())) {
                bl2 = lIIIlIl[1];
                0;
                if ((0x92 ^ 0x96) < 0) {
                    return ((0xA0 ^ 0x84) & ~(0x7F ^ 0x5B)) != 0;
                }
            } else {
                bl2 = lIIIlIl[0];
            }
            return bl2;
        });
        if (az.lIIIlIlll(var3)) {
            return lIIIlIl[0];
        }
        var2_2.interact(lIIIlII[lIIIlIl[1]]);
        return lIIIlIl[1];
    }

    private static String lIIIIlllI(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = lIIIlIl[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = lIIIlIl[0];
        while (az.lIIIllIIl(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-(0x6D ^ 0x63 ^ (0x67 ^ 0x6C)) < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIIIlIIlI() {
        lIIIlII = new String[lIIIlIl[5]];
        az.lIIIlII[az.lIIIlIl[0]] = "Take";
        az.lIIIlII[az.lIIIlIl[1]] = "Chase";
        az.lIIIlII[az.lIIIlIl[2]] = "kitten";
        az.lIIIlII[az.lIIIlIl[3]] = "cat";
        az.lIIIlII[az.lIIIlIl[4]] = "Empty";
    }

    @Inject
    public HuntCatTask(SquireKittenConfig squireKittenConfig) {
        this.dM = squireKittenConfig;
    }

    private static void lIIIlIIll() {
        lIIIlIl = new int[7];
        az.lIIIlIl[0] = (0x3E ^ 0x2F ^ (0xD8 ^ 0x92)) & (0x40 ^ 0x38 ^ (0x18 ^ 0x3B) ^ -1);
        az.lIIIlIl[1] = 1;
        az.lIIIlIl[2] = 2;
        az.lIIIlIl[3] = 3;
        az.lIIIlIl[4] = 0x5B ^ 0x17 ^ (0x43 ^ 0xB);
        az.lIIIlIl[5] = 73 + 43 - 33 + 74 ^ 75 + 144 - 145 + 78;
        az.lIIIlIl[6] = 0x22 ^ 0x2B ^ 1;
    }

    private static boolean lIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlII(int n2) {
        return n2 == 0;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlll(Object object) {
        return object == null;
    }
}

