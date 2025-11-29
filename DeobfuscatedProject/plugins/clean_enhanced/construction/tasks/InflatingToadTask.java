/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Inflating Toad", priority=2)
public class InflatingToadTask
extends Task {
    private static  String[] lllIll;
    private static  int[] lllllI;

    private static String lllIlllI(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var5 = 0;
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = 0;
        while (var8 < var7) {
            char var9 = var6[var8];
            var3.append((char)(var9 ^ var4[var5 % var4.length]));
            0;
            ++var5;
            ++var8;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var3);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ct() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[1];
                nArray[0] = 4;
                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[1];
                nArray2[0] = 5;
                if (!(Inventory.contains((int[] == 0)nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[1];
                nArray3[0] = 6;
                if (!(Inventory.contains((int[] != 0)nArray3) ? 1 : 0)) break block3;
            }
            n2 = 1;
            0;
            if (2 != 3) return n2 != 0;
            return ((0x7E ^ 0x23) & ~(0x13 ^ 0x4E)) != 0;
        }
        n2 = 0;
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            return 0;
        }
        if (!(Players.getLocal( == 0).isAnimating() ? 1 : 0) || (Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        NPC var15 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(lllIll[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = lllIll[3];
                if ((nPC.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((2 ^ 0x62 ^ 3) & (4 ^ 0x3D ^ (0xE2 ^ 0xB8) ^ -1)) >= ((65 + 145 - 90 + 97 ^ 74 + 52 - 3 + 14) & (105 + 193 - 70 + 20 ^ 139 + 2 - 32 + 59 ^ -1))) return n2 != 0;
                    return ((0xE6 ^ 0xB2 ^ (0xB3 ^ 0xBE)) & (0xCA ^ 0x98 ^ (0x2E ^ 0x25) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var15 == null {
            return 0;
        }
        var1_1.interact(lllIll[0]);
        this.sleep(3);
        return 1;
    }
}

