/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Plucking bird", priority=25)
public class PluckingBirdTask
extends Task {
    private static  int[] lIlIlIlll;
    private static  String[] lIlIIlIII;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bc.var1(nPC.getName().equalsIgnoreCase(lIlIIlIII[lIlIlIlll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlll[2]];
                stringArray[bc.lIlIlIlll[0]] = lIlIIlIII[lIlIlIlll[1]];
                if (bc.var1(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlll[2];
                    0;
                    if null == null return n2 != 0;
                    return ((0x16 ^ 0x29 ^ (0x86 ^ 0xA7)) & (23 + 26 - 47 + 162 ^ 138 + 54 - 37 + 31 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIlll[0];
            return n2 != 0;
        });
        if (bc.var3(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIlIlll[0];
        }
        if (bc.var4(var2)) {
            return lIlIlIlll[0];
        }
        nPC2.interact(lIlIIlIII[lIlIlIlll[0]]);
        this.sleep(lIlIlIlll[1]);
        return lIlIlIlll[2];
    }

    private static void var5() {
        lIlIIlIII = new String[lIlIlIlll[3]];
        bc.lIlIIlIII[bc.lIlIlIlll[0]] = "Pluck";
        bc.lIlIIlIII[bc.lIlIlIlll[2]] = "chompy bird";
        bc.lIlIIlIII[bc.lIlIlIlll[1]] = "Pluck";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void var12() {
        lIlIlIlll = new int[5];
        bc.lIlIlIlll[0] = (3 ^ 0x2C) & ~(0x38 ^ 0x17);
        bc.lIlIlIlll[1] = 2;
        bc.lIlIlIlll[2] = 1;
        bc.lIlIlIlll[3] = 3;
        bc.lIlIlIlll[4] = 0x11 ^ 0x73 ^ (0xF5 ^ 0x9F);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bc.var12();
        bc.var5();
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = lIlIlIlll[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = lIlIlIlll[0];
        while (bc.var13(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (2 < (47 + 43 - -19 + 78 ^ 77 + 138 - 177 + 153)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

