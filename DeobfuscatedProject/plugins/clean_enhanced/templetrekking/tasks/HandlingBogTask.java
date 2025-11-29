/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingManager;
import gg.squire.templetrekking.tasks.UHelper;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling bog")
public class HandlingBogTask
extends TempletrekkingTaskBase {

    private  List<TileObject> ad;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[14];
        t.var1[0] = 1;
        t.var1[1] = (0x8D ^ 0xB8) & ~(0x2A ^ 0x1F);
        t.var1[2] = 0x1E ^ 1 ^ (0x6F ^ 0x77);
        t.var1[3] = 2;
        t.var1[4] = 0x9A ^ 0x9F;
        t.var1[5] = 3;
        t.var1[6] = 0xA1 ^ 0xA5;
        t.var1[7] = 98 + 76 - 40 + 1 ^ 101 + 109 - 134 + 105;
        t.var1[8] = 0x82 ^ 0x9F ^ (0x88 ^ 0x9F);
        t.var1[9] = 0xFFFFB75F & 0x7EAE;
        t.var1[10] = 0x72 ^ 0x74;
        t.var1[11] = 0x85 ^ 0x83 ^ (5 ^ 0xA);
        t.var1[12] = 0x76 ^ 0x5E;
        t.var1[13] = 0x43 ^ 0x50 ^ (0x61 ^ 0x7A);
    }

    private static void var10() {
        var2 = new String[var1[13]];
        t.var2[t.var1[1]] = "Hey...that's great...you did a great job...I'll follow you.";
        t.var2[t.var1[0]] = "Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        t.var2[t.var1[3]] = "That's amazing! I'll have to do the same.";
        t.var2[t.var1[5]] = "Continue-trek";
        t.var2[t.var1[6]] = "Stand-on";
        t.var2[t.var1[4]] = "Adding solved bog path";
        t.var2[t.var1[10]] = "Bog";
        t.var2[t.var1[2]] = "Stand-on";
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var13(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] a(List<TileObject> list) {
        void var14;
        void var15;
        int[][] nArray = new int[var1[8]][var1[8]];
        int var16 = var1[1];
        while (t.var17(var16, var15.size())) {
            TileObject var18 = (TileObject)var15.get(var16);
            if (t.var19(var18) && t.var20(var18.getId(), var1[9])) {
                var14[var16 / t.var1[8] + t.var1[0]][var16 % t.var1[8]] = var1[0];
            }
            ++var16;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        var16 = var1[1];
        while (t.var17(var16, ((void)var14[var1[1]]).length)) {
            var14[t.var1[1]][var16] = var1[0];
            var14[t.var1[10]][var16] = var1[0];
            ++var16;
            0;
            
            return null;
        }
        var16 = var1[1];
        while (t.var17(var16, var1[5])) {
            var14[t.var1[2] + var16][t.var1[11]] = var1[0];
            ++var16;
            0;
            if (2 > 0) continue;
            return null;
        }
        return nArray;
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public TileObject b(List<TileObject> list) {
        void var22;
        int var23 = var1[1];
        while (t.var17(var23, var22.size())) {
            TileObject var24 = (TileObject)var22.get(var23);
            if (t.var19(var24) && t.var12(var24.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && t.var17(var23 + var1[0], var22.size())) {
                return (TileObject)var22.get(var23 + var1[0]);
            }
            ++var23;
            0;
            if null == null continue;
            return null;
        }
        return list.get(var1[1]);
    }

    private static boolean var25(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var26(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean z() {
        Object var27;
        t var28;
        String string;
        if (t.var12(Dialog.isOpen() ? 1 : 0) && t.var29((string = Dialog.getText()).length()) && (!t.var30(string.contains(var2[var1[1]]) ? 1 : 0) || !t.var30(string.contains(var2[var1[0]]) ? 1 : 0) || t.var12(string.contains(var2[var1[3]]) ? 1 : 0))) {
            return var1[1];
        }
        Player var31 = Players.getLocal();
        if (t.var11(var31)) {
            return var1[1];
        }
        TileObject var32 = var28.A();
        if (t.var11(var32)) {
            return var1[1];
        }
        if (t.var26(var31.distanceTo((Locatable)var32), var1[4])) {
            var28.ad.clear();
            var32.interact(var2[var1[5]]);
            return var1[0];
        }
        if (t.var30(var28.ad.isEmpty() ? 1 : 0) && t.var19(var27 = var28.b(var28.ad))) {
            var27.interact(var2[var1[6]]);
            return var1[0];
        }
        if (t.var12(var28.ad.isEmpty() ? 1 : 0)) {
            var27 = TileObjects.getAll(tileObject -> {
                int n2;
                if (t.var12(tileObject.getName().equals(var2[var1[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[0]];
                    stringArray[t.var1[1]] = var2[var1[2]];
                    if (t.var12(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var1[0];
                        0;
                        if ((0x53 ^ 0x21 ^ (0xF5 ^ 0x83)) > 0) return n2 != 0;
                        return ((0x2A ^ 0x46 ^ (0x4E ^ 0x12)) & (84 + 7 - 37 + 73 ^ (0x1F ^ 0x50) ^ -1)) != 0;
                    }
                }
                n2 = var1[1];
                return n2 != 0;
            });
            var27.sort(new UHelper(var28));
            if (t.var25(var27.size(), var1[7])) {
                int[][] var33 = var28.a((List<TileObject>)var27);
                int[][] var34 = a.b(var33);
                var28.ad = var28.a(var34, (List<TileObject>)var27);
                if (t.var21(var32.getWorldY(), Players.getLocal().getWorldY())) {
                    Collections.reverse(var28.ad);
                }
            }
        }
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    public List<TileObject> a(int[][] nArray, List<TileObject> list) {
        void var5_6;
        int var35;
        void var36;
        int var37;
        void var38;
        ArrayList arrayList = new ArrayList();
        int n2 = var1[1];
        int llllllllllllllIllllIIIIIllIIIIlI22 = var1[1];
        while (t.var17(llllllllllllllIllllIIIIIllIIIIlI22, ((void)var38[var1[1]]).length)) {
            if (t.var20((int)var38[var1[1]][llllllllllllllIllllIIIIIllIIIIlI22], var1[0])) {
                var37 = llllllllllllllIllllIIIIIllIIIIlI22;
                var36.add(var37);
                0;
                0;
                if (3 >= ((0x35 ^ 0x50 ^ (0x76 ^ 0x17)) & (0x5A ^ 0x5F ^ 1 ^ -1))) break;
                return null;
            }
            ++llllllllllllllIllllIIIIIllIIIIlI22;
            0;
            if (((0x58 ^ 0x44) & ~(0x46 ^ 0x5A)) == 0) continue;
            return null;
        }
        while (t.var17(var37, var1[12])) {
            llllllllllllllIllllIIIIIllIIIIlI22 = var37 / var1[8];
            var35 = var37 % var1[8];
            if (t.var17(llllllllllllllIllllIIIIIllIIIIlI22 + var1[0], var1[4]) && t.var20((int)var38[llllllllllllllIllllIIIIIllIIIIlI22 + var1[0]][var35], var1[0]) && t.var30(var36.contains((llllllllllllllIllllIIIIIllIIIIlI22 + var1[0]) * var1[8] + var35) ? 1 : 0)) {
                var37 = (llllllllllllllIllllIIIIIllIIIIlI22 + var1[0]) * var1[8] + var35;
                var36.add(var37);
                0;
                0;
                if null != null {
                    return null;
                }
            } else if (t.var13(llllllllllllllIllllIIIIIllIIIIlI22 - var1[0]) && t.var20((int)var38[llllllllllllllIllllIIIIIllIIIIlI22 - var1[0]][var35], var1[0]) && t.var30(var36.contains((llllllllllllllIllllIIIIIllIIIIlI22 - var1[0]) * var1[8] + var35) ? 1 : 0)) {
                var37 = (llllllllllllllIllllIIIIIllIIIIlI22 - var1[0]) * var1[8] + var35;
                var36.add(var37);
                0;
                0;
                if null != null {
                    return null;
                }
            } else if (t.var13(var35 - var1[0]) && t.var20((int)var38[llllllllllllllIllllIIIIIllIIIIlI22][var35 - var1[0]], var1[0]) && t.var30(var36.contains(llllllllllllllIllllIIIIIllIIIIlI22 * var1[8] + var35 - var1[0]) ? 1 : 0)) {
                var37 = llllllllllllllIllllIIIIIllIIIIlI22 * var1[8] + var35 - var1[0];
                var36.add(var37);
                0;
                0;
                if (2 <= 0) {
                    return null;
                }
            } else if (t.var17(var35 + var1[0], var1[8]) && t.var20((int)var38[llllllllllllllIllllIIIIIllIIIIlI22][var35 + var1[0]], var1[0]) && t.var30(var36.contains(llllllllllllllIllllIIIIIllIIIIlI22 * var1[8] + var35 + var1[0]) ? 1 : 0)) {
                var37 = llllllllllllllIllllIIIIIllIIIIlI22 * var1[8] + var35 + var1[0];
                var36.add(var37);
                0;
            }
            0;
            if (2 > 0) continue;
            return null;
        }
        ArrayList<TileObject> llllllllllllllIllllIIIIIllIIIIlI22 = new ArrayList<TileObject>();
        var35 = var1[1];
        while (t.var17(var35, var36.size())) {
            void var39;
            llllllllllllllIllllIIIIIllIIIIlI22.add((TileObject)var39.get((Integer)var36.get(var35)));
            0;
            ++var35;
            0;
            if (1 != 0) continue;
            return null;
        }
        System.out.println(var2[var1[4]]);
        return var5_6;
    }

    private static boolean var30(int n2) {
        return n2 == 0;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected HandlingBogTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[var1[0]];
        nArray[t.var1[1]] = var1[2];
        super(templeTrekkingPlugin, nArray);
        this.ad = new ArrayDeque();
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }

    static {
        t.var9();
        t.var10();
    }

    private static boolean var29(int n2) {
        return n2 > 0;
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }

    private static boolean var19(Object object) {
        return object != null;
    }
}

