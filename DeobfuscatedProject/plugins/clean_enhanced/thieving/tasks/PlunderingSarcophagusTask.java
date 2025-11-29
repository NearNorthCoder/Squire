/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Plundering Sarcophagus", priority=1)
public class PlunderingSarcophagusTask
extends ThievingTaskBase {

    private static void var3() {
        var2 = new int[5];
        j.var2[0] = (0xE5 ^ 0xA8) & ~(0xC2 ^ 0x8F);
        j.var2[1] = 0xFFFFDFFF & 0x30F8;
        j.var2[2] = 1;
        j.var2[3] = 0xFFFFDFC7 & 0x733F;
        j.var2[4] = 2;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (j.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean PlunderingSarcophagusTask() {
        void var2_2;
        block7: {
            block6: {
                void var17;
                j var18;
                c c2 = c.f();
                if (j.var4((Object)c2)) {
                    return var2[0];
                }
                if (j.var19(var18.D.c((c)var17) ? 1 : 0)) {
                    return var2[0];
                }
                if (j.var20(Players.getLocal().getAnimation(), var2[1])) {
                    return var2[0];
                }
                int[] nArray = new int[var2[2]];
                nArray[j.var2[0]] = var2[3];
                TileObject var21 = TileObjects.getNearest((int[])nArray);
                if (!j.var16(var21)) break block6;
                String[] stringArray = new String[var2[2]];
                stringArray[j.var2[0]] = var1[var2[0]];
                if (!j.var19(var21.hasAction(stringArray) ? 1 : 0)) break block7;
            }
            return var2[0];
        }
        var2_2.interact(var1[var2[2]]);
        return var2[2];
    }

    @Inject
    protected PlunderingSarcophagusTask(a a2, Client client) {
        super(a2, client);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static void var28() {
        var1 = new String[var2[4]];
        j.var1[j.var2[0]] = "Open";
        j.var1[j.var2[2]] = "Open";
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.var3();
        j.var28();
    }
}

