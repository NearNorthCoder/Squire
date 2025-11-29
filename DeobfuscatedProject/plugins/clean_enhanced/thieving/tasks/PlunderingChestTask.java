/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Plundering Chest", priority=10)
public class PlunderingChestTask
extends ThievingTaskBase {

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Inject
    protected PlunderingChestTask(a a2, Client client) {
        super(a2, client);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var1 = new int[6];
        i.var1[0] = (0x5C ^ 0x79 ^ (0x5E ^ 0x66)) & (60 + 6 - -31 + 123 ^ 86 + 105 - 53 + 55 ^ -1);
        i.var1[1] = 1;
        i.var1[2] = -(0xFFFFBDDD & 0x66F3) & (0xFFFFFFF7 & 0x77DF);
        i.var1[3] = 2;
        i.var1[4] = 3;
        i.var1[5] = 12 + 32 - -25 + 89 ^ 34 + 12 - 8 + 112;
    }

    private static void var12() {
        var2 = new String[var1[4]];
        i.var2[i.var1[0]] = "Grand Gold Chest";
        i.var2[i.var1[1]] = "Search";
        i.var2[i.var1[3]] = "Search";
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[0];
        while (i.var20(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var25);
    }

    static {
        i.var11();
        i.var12();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        block9: {
            block8: {
                TileObject var32;
                void var33;
                i var34;
                c c2 = c.f();
                if (i.var19((Object)c2)) {
                    return var1[0];
                }
                if (i.var4(var34.D.a((c)var33) ? 1 : 0)) {
                    return var1[0];
                }
                if (i.var21(var34.D.b((c)var33) ? 1 : 0) && i.var3(var32 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (i.var21(this.D.h.contains(tileObject.getActualId()) ? 1 : 0) && i.var21(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if null != null {
                            return ((0x6F ^ 0x50) & ~(0x24 ^ 0x1B)) != 0;
                        }
                    } else {
                        n2 = var1[0];
                    }
                    return n2 != 0;
                }))) {
                    return var1[0];
                }
                if (i.var21(var34.D.c((c)var33) ? 1 : 0)) {
                    int[] nArray = new int[var1[1]];
                    nArray[i.var1[0]] = var1[2];
                    var32 = TileObjects.getNearest((int[])nArray);
                    if (i.var3(var32)) {
                        return var1[0];
                    }
                }
                String[] stringArray = new String[var1[1]];
                stringArray[i.var1[0]] = var2[var1[0]];
                var32 = TileObjects.getNearest((String[])stringArray);
                if (!i.var3(var32)) break block8;
                String[] stringArray2 = new String[var1[1]];
                stringArray2[i.var1[0]] = var2[var1[1]];
                if (!i.var4(var32.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return var1[0];
        }
        var2_2.interact(var2[var1[3]]);
        return var1[1];
    }
}

