/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.NPCs;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Handling fires", priority=20, blocking=true)
public class HandlingFiresTask
extends TemporossTaskBase {

    static {
        i.var3();
        i.var4();
    }

    private static void var4() {
        var2 = new String[var1[5]];
        i.var2[i.var1[2]] = "dousing fire to get to proper fire!";
        i.var2[i.var1[0]] = "Douse";
    }

    private static void var3() {
        var1 = new int[6];
        i.var1[0] = 1;
        i.var1[1] = 0x70 ^ 0x53;
        i.var1[2] = (5 ^ 0x46) & ~(0x87 ^ 0xC4);
        i.var1[3] = 3;
        i.var1[4] = 0xFFFFE3C7 & 0x3DFB;
        i.var1[5] = 2;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    @Override
    public boolean ak() {
        int n2;
        if (i.var12(this.ar.E(), var1[0]) && i.var12(this.au.b(), var1[1]) && i.var13(this.ar.I() ? 1 : 0)) {
            n2 = var1[0];
            0;
            if null != null {
                return ((0x4C ^ 4 ^ (0x7B ^ 0x27)) & (0x12 ^ 0x7C ^ (0x18 ^ 0x62) ^ -1)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        i var15;
        void var16;
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), nPC -> {
            int n2;
            if (i.var17(nPC.getId(), var1[4])) {
                String[] stringArray = new String[var1[0]];
                stringArray[i.var1[2]] = var2[var1[0]];
                if (i.var13(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[0];
                    0;
                    if (((81 + 40 - 115 + 213 ^ 22 + 115 - 80 + 87) & (0x75 ^ 0x3B ^ (0x84 ^ 0x81) ^ -1)) >= 0) return n2 != 0;
                    return ((128 + 86 - 94 + 68 ^ 26 + 81 - 19 + 76) & (205 + 76 - 216 + 156 ^ 77 + 93 - 50 + 77 ^ -1)) != 0;
                }
            }
            n2 = var1[2];
            return n2 != 0;
        });
        if (i.var11(nPC2)) {
            return var1[2];
        }
        if (i.var12(var16.distanceTo(var15.ar.N().ag()), var1[3])) {
            var15.ar.a(var1[2]);
            return var1[2];
        }
        if (i.var13(var15.au.a((Locatable)var16) ? 1 : 0)) {
            System.out.println(var2[var1[2]]);
            var15.au.b((SceneEntity)var16);
            0;
            return var1[0];
        }
        this.au.b(nPC2);
        0;
        return var1[0];
    }

    @Inject
    protected HandlingFiresTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean var17(int n2, int n3) {
        return n2 == n3;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[2];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[2];
        while (i.var14(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-(9 + 131 - 74 + 79 ^ 141 + 75 - 138 + 71) <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var12(int n2, int n3) {
        return n2 > n3;
    }
}

