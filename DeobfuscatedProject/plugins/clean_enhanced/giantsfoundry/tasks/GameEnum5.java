/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum4;
import gg.squire.giantsfoundry.tasks.GameEnum3;
import gg.squire.client.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public final class GameEnum5
extends Enum<f> {
    public static final  int MOULD_LIST_PARENT;
    private static final  int SELECT_MOULD_TAB_SCRIPT;
    private final  int pageVisbility;
    private final  int pageSelection;
    private static final  int SELECT_MOULD_SCRIPT;
    private static final  int SELECT_MOULD_TAB;
    public static final  /* enum */ f BLADE;
    private final  int selectionVarbit;
    private static final  int SWORD_TYPE_1_VARBIT;
    
    public static final  /* enum */ f FORTE;
    private static final  f[] $VALUES;
    private static final  int DISABLED_TEXT_COLOR;
    private static final  int SWORD_TYPE_2_VARBIT;
    public static final  /* enum */ f TIP;
    private static final  int SELECTED_MOULD_TAB;
    private static final  Client client;
    private final  int pageWidget;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 != n3;
    }

    public int F() {
        return this.pageVisbility;
    }

    /*
     * WARNING - void declaration
     */
    private static Map<e, Widget> a(Widget[] widgetArray) {
        Widget[] var11;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var12 = var1[3];
        while (f.var13(var12, var11.length)) {
            Widget var14 = var11[var12];
            e var15 = e.b(var14.getText());
            if (f.var16((Object)var15) && f.var10(var14.getTextColor(), var1[7])) {
                void var17;
                var17.put(var15, var14);
                0;
            }
            var12 += 17;
            0;
            if ((0x83 ^ 0x87) != 3) continue;
            return null;
        }
        return linkedHashMap;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (f.var13(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (((0x25 ^ 0x68) & ~(0xC2 ^ 0x8F)) == 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private GameEnum5(int n3, int n4, int n5, int n6) {
        this.selectionVarbit = n3;
        this.pageVisbility = n4;
        this.pageSelection = n5;
        this.pageWidget = n6;
    }

    /*
     * WARNING - void declaration
     */
    public void C() {
        void var2_2;
        f var28;
        int[] nArray = new int[var1[2]];
        nArray[f.var1[0]] = var1[9];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (f.var29(tileObject)) {
            return;
        }
        Widget var30 = Widgets.fromId((int)var28.pageWidget);
        if (f.var29(var30)) {
            return;
        }
        var2_2.interact(var2[var1[10]]);
        tileObject.interact(var2[var1[11]]);
    }

    private static boolean var31(int n2) {
        return n2 == 0;
    }

    private static void var32() {
        var1 = new int[28];
        f.var1[0] = (2 + 64 - -18 + 47 ^ 30 + 101 - 109 + 112) & (0xA ^ 0x7E ^ (0x33 ^ 0x42) ^ -1);
        f.var1[1] = -(0x37 ^ 0x72) & (0xFFFFE1FF & 0x2CE1E4D);
        f.var1[2] = 1;
        f.var1[3] = 2;
        f.var1[4] = -1;
        f.var1[5] = -(22 + 106 - 108 + 113) & (0xFFFFFED7 & 0x37FF);
        f.var1[6] = -3 & (0xFFFFBED7 & 0x777E);
        f.var1[7] = 0xFFFFFFFF & 0x9F9F9F;
        f.var1[8] = 0xFFFFB6DF & 0x7F75;
        f.var1[9] = 0xFFFFAEFF & 0xFFE9;
        f.var1[10] = 3;
        f.var1[11] = 0x54 ^ 0x62 ^ (0x1E ^ 0x2C);
        f.var1[12] = 0x60 ^ 0x65;
        f.var1[13] = 0x7C ^ 0x7A;
        f.var1[14] = 0xFFFFFFEF & 0x17DF;
        f.var1[15] = 0xFFFFBFDB & 0x57F6;
        f.var1[16] = 0xFFFFB4DC & 0x2CE4B2F;
        f.var1[17] = 0x5A ^ 0x5D;
        f.var1[18] = -(0xFFFFD0A2 & 0x6FFF) & (0xFFFFFFF7 & 0x76FF);
        f.var1[19] = 0xFFFFA97D & 0x2CE5697;
        f.var1[20] = 0x5A ^ 0x52;
        f.var1[21] = -(0xFFFFDAAB & 0x6DDD) & (0xFFFFFEFF & 0x7FDF);
        f.var1[22] = 158 + 44 - 201 + 159 ^ 1 + 94 - 67 + 141;
        f.var1[23] = 0xFFFFE7F6 & 0x2CE181F;
        f.var1[24] = -(0xFFFFCDAF & 0x7BF6) & (0xFFFFFFFF & 0x7FFD);
        f.var1[25] = 0x19 ^ 0x42 ^ (0x33 ^ 0x7A);
        f.var1[26] = 0xFFFFDB97 & 0x2CE247F;
        f.var1[27] = 104 + 125 - 177 + 104 ^ 65 + 109 - 86 + 62;
    }

    private static boolean var29(Object object) {
        return object == null;
    }

    public int G() {
        return this.pageSelection;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void var33() {
        var2 = new String[var1[27]];
        f.var2[f.var1[0]] = "No best mould found";
        f.var2[f.var1[2]] = "Mould list parent is null";
        f.var2[f.var1[3]] = "Select";
        f.var2[f.var1[10]] = "View";
        f.var2[f.var1[11]] = "Setup";
        f.var2[f.var1[12]] = "No best widget found";
        f.var2[f.var1[13]] = "Select";
        f.var2[f.var1[17]] = "FORTE";
        f.var2[f.var1[20]] = "BLADE";
        f.var2[f.var1[22]] = "TIP";
    }

    public int E() {
        return this.selectionVarbit;
    }

    private static boolean var16(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget y() {
        e e2 = f.z();
        if (f.var29((Object)e2)) {
            Log.info((String)var2[var1[0]]);
            return null;
        }
        Widget var34 = client.getWidget(var1[1]);
        if (f.var29(var34)) {
            Log.info((String)var2[var1[2]]);
            return null;
        }
        Widget[] var35 = var34.getDynamicChildren();
        if (f.var16(var35)) {
            Widget[] var36 = var35;
            int var37 = var36.length;
            int var38 = var1[0];
            while (f.var13(var38, var37)) {
                void var39;
                Widget var40 = var36[var38];
                String[] stringArray = new String[var1[2]];
                stringArray[f.var1[0]] = var2[var1[3]];
                if (f.var31(var40.hasAction(stringArray) ? 1 : 0)) {
                    0;
                    if (-1 >= 1) {
                        return null;
                    }
                } else if (f.var3(var40.getName().contains(var39.x()) ? 1 : 0)) {
                    return var40;
                }
                ++var38;
                0;
                
                return null;
            }
        }
        return null;
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public boolean B() {
        boolean bl;
        if (f.var47(client.getVarbitValue(var1[8]), this.pageVisbility)) {
            bl = var1[2];
            0;
            if ((0x29 ^ 0x42 ^ (0x59 ^ 0x36)) <= 1) {
                return ((31 + 102 - 92 + 93 ^ 84 + 83 - 89 + 79) & (85 + 111 - 183 + 165 ^ 46 + 107 - 104 + 120 ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static boolean var47(int n2, int n3) {
        return n2 == n3;
    }

    public void D() {
        Widget widget = f.y();
        if (!f.var16(widget) || f.var47(widget.getIndex(), var1[4])) {
            Log.info((String)var2[var1[12]]);
            return;
        }
        widget.interact(var2[var1[13]]);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static e z() {
        void var48;
        Widget widget = client.getWidget(var1[1]);
        if (!f.var16(widget) || f.var29(widget.getChildren())) {
            return null;
        }
        Map<e, Widget> var49 = f.a(var48.getChildren());
        int var50 = var1[4];
        Widget var51 = null;
        d var52 = d.a(client.getVarbitValue(var1[5]));
        d var53 = d.a(client.getVarbitValue(var1[6]));
        Iterator<Map.Entry<e, Widget>> var54 = var49.entrySet().iterator();
        while (f.var3(var54.hasNext() ? 1 : 0)) {
            Map.Entry<e, Widget> var55 = var54.next();
            e var56 = var55.getKey();
            int var57 = var56.a(var52, var53);
            if (f.var58(var57, var50)) {
                var50 = var57;
                var51 = var55.getValue();
            }
            0;
            if (-1 < (5 ^ 0x45 ^ (0x79 ^ 0x3D))) continue;
            return null;
        }
        if (f.var16(var51)) {
            Log.info((String)("Best mould is " + var51.getText()));
            return e.b(var51.getText());
        }
        return null;
    }

    private static boolean var58(int n2, int n3) {
        return n2 > n3;
    }

    public boolean A() {
        boolean bl;
        if (f.var3(client.getVarbitValue(this.selectionVarbit))) {
            bl = var1[2];
            0;
            if (3 < 2) {
                return ((134 + 15 - 3 + 0 ^ 50 + 33 - -80 + 7) & (0x91 ^ 0xB2 ^ (0x1C ^ 7) ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    static {
        f.var32();
        f.var33();
        SELECT_MOULD_TAB_SCRIPT = var1[14];
        SWORD_TYPE_1_VARBIT = var1[5];
        SELECT_MOULD_SCRIPT = var1[15];
        SELECT_MOULD_TAB = var1[16];
        SWORD_TYPE_2_VARBIT = var1[6];
        MOULD_LIST_PARENT = var1[1];
        DISABLED_TEXT_COLOR = var1[7];
        SELECTED_MOULD_TAB = var1[8];
        FORTE = new GameEnum5(var1[18], var1[0], var1[0], var1[19]);
        BLADE = new GameEnum5(var1[21], var1[2], var1[22], var1[23]);
        TIP = new GameEnum5(var1[24], var1[3], var1[25], var1[26]);
        f[] fArray = new f[var1[10]];
        fArray[f.var1[0]] = FORTE;
        fArray[f.var1[2]] = BLADE;
        fArray[f.var1[3]] = TIP;
        $VALUES = fArray;
        client = Static.getClient();
    }
}

