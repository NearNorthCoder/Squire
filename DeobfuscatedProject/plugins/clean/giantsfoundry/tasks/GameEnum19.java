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

import gg.squire.giantsfoundry.tasks.GameEnum18;
import gg.squire.giantsfoundry.tasks.GameEnum12;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public final class GameEnum19
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

    private static boolean lIIIIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIlIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    public int F() {
        return this.pageVisbility;
    }

    /*
     * WARNING - void declaration
     */
    private static Map<e, Widget> a(Widget[] widgetArray) {
        Widget[] var1;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var2 = llIlIlIllIII[3];
        while (f.lIIIIIllIIlllIl(var2, var1.length)) {
            Widget var3 = var1[var2];
            e var4 = e.b(var3.getText());
            if (f.lIIIIIllIIlllII((Object)var4) && f.lIIIIIllIlIIIIl(var3.getTextColor(), llIlIlIllIII[7])) {
                void var5;
                var5.put(var4, var3);

            }
            var2 += 17;

            if ((0x83 ^ 0x87) != 3) continue;
            return null;
        }
        return linkedHashMap;
    }

        return String.valueOf(var6);
    }

    private GameEnum19(int n3, int n4, int n5, int n6) {
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
        f var7;
        int[] nArray = new int[llIlIlIllIII[2]];
        nArray[f.llIlIlIllIII[0]] = llIlIlIllIII[9];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (f.lIIIIIllIIllIll(tileObject)) {
            return;
        }
        Widget var8 = Widgets.fromId((int)var7.pageWidget);
        if (f.lIIIIIllIIllIll(var8)) {
            return;
        }
        var2_2.interact(llIlIlIlIlll[llIlIlIllIII[10]]);
        tileObject.interact(llIlIlIlIlll[llIlIlIllIII[11]]);
    }

    private static boolean lIIIIIllIIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIllIIllIll(Object object) {
        return object == null;
    }

    public int G() {
        return this.pageSelection;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void lIIIIIllIIllIIl() {
        llIlIlIlIlll = new String[llIlIlIllIII[27]];
        f.llIlIlIlIlll[f.llIlIlIllIII[0]] = "No best mould found";
        f.llIlIlIlIlll[f.llIlIlIllIII[2]] = "Mould list parent is null";
        f.llIlIlIlIlll[f.llIlIlIllIII[3]] = "Select";
        f.llIlIlIlIlll[f.llIlIlIllIII[10]] = "View";
        f.llIlIlIlIlll[f.llIlIlIllIII[11]] = "Setup";
        f.llIlIlIlIlll[f.llIlIlIllIII[12]] = "No best widget found";
        f.llIlIlIlIlll[f.llIlIlIllIII[13]] = "Select";
        f.llIlIlIlIlll[f.llIlIlIllIII[17]] = "FORTE";
        f.llIlIlIlIlll[f.llIlIlIllIII[20]] = "BLADE";
        f.llIlIlIlIlll[f.llIlIlIllIII[22]] = "TIP";
    }

    public int E() {
        return this.selectionVarbit;
    }

    private static boolean lIIIIIllIIlllII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget y() {
        e e2 = f.z();
        if (f.lIIIIIllIIllIll((Object)e2)) {
            Log.info((String)llIlIlIlIlll[llIlIlIllIII[0]]);
            return null;
        }
        Widget var9 = client.getWidget(llIlIlIllIII[1]);
        if (f.lIIIIIllIIllIll(var9)) {
            Log.info((String)llIlIlIlIlll[llIlIlIllIII[2]]);
            return null;
        }
        Widget[] var10 = var9.getDynamicChildren();
        if (f.lIIIIIllIIlllII(var10)) {
            Widget[] var11 = var10;
            int var12 = var11.length;
            int var13 = llIlIlIllIII[0];
            while (f.lIIIIIllIIlllIl(var13, var12)) {
                void var14;
                Widget var15 = var11[var13];
                String[] stringArray = new String[llIlIlIllIII[2]];
                stringArray[f.llIlIlIllIII[0]] = llIlIlIlIlll[llIlIlIllIII[3]];
                if (f.lIIIIIllIIllllI(var15.hasAction(stringArray) ? 1 : 0)) {

                    if (-1 >= 1) {
                        return null;
                    }
                } else if (f.lIIIIIllIIlllll(var15.getName().contains(var14.x()) ? 1 : 0)) {
                    return var15;
                }
                ++var13;

                if (1 >= 0) continue;
                return null;
            }
        }
        return null;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    public boolean B() {
        boolean bl;
        if (f.lIIIIIllIlIIIlI(client.getVarbitValue(llIlIlIllIII[8]), this.pageVisbility)) {
            bl = llIlIlIllIII[2];

            if ((0x29 ^ 0x42 ^ (0x59 ^ 0x36)) <= 1) {
                return false;
            }
        } else {
            bl = llIlIlIllIII[0];
        }
        return bl;
    }

    private static boolean lIIIIIllIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public void D() {
        Widget widget = f.y();
        if (!f.lIIIIIllIIlllII(widget) || f.lIIIIIllIlIIIlI(widget.getIndex(), llIlIlIllIII[4])) {
            Log.info((String)llIlIlIlIlll[llIlIlIllIII[12]]);
            return;
        }
        widget.interact(llIlIlIlIlll[llIlIlIllIII[13]]);
    }

    private static boolean lIIIIIllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static e z() {
        void var16;
        Widget widget = client.getWidget(llIlIlIllIII[1]);
        if (!f.lIIIIIllIIlllII(widget) || f.lIIIIIllIIllIll(widget.getChildren())) {
            return null;
        }
        Map<e, Widget> var17 = f.a(var16.getChildren());
        int var18 = llIlIlIllIII[4];
        Widget var19 = null;
        d var20 = d.a(client.getVarbitValue(llIlIlIllIII[5]));
        d var21 = d.a(client.getVarbitValue(llIlIlIllIII[6]));
        Iterator<Map.Entry<e, Widget>> var22 = var17.entrySet().iterator();
        while (f.lIIIIIllIIlllll(var22.hasNext() ? 1 : 0)) {
            Map.Entry<e, Widget> var23 = var22.next();
            e var24 = var23.getKey();
            int var25 = var24.a(var20, var21);
            if (f.lIIIIIllIlIIIII(var25, var18)) {
                var18 = var25;
                var19 = var23.getValue();
            }

            if (-1 < (5 ^ 0x45 ^ (0x79 ^ 0x3D))) continue;
            return null;
        }
        if (f.lIIIIIllIIlllII(var19)) {
            Log.info((String)("Best mould is " + var19.getText()));
            return e.b(var19.getText());
        }
        return null;
    }

    private static boolean lIIIIIllIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    public boolean A() {
        boolean bl;
        if (f.lIIIIIllIIlllll(client.getVarbitValue(this.selectionVarbit))) {
            bl = llIlIlIllIII[2];

            if (3 < 2) {
                return ((134 + 15 - 3 + 0 ^ 50 + 33 - -80 + 7) & (0x91 ^ 0xB2 ^ (0x1C ^ 7) ^ -1)) != 0;
            }
        } else {
            bl = llIlIlIllIII[0];
        }
        return bl;
    }

    static {
        f.lIIIIIllIIllIlI();
        f.lIIIIIllIIllIIl();
        SELECT_MOULD_TAB_SCRIPT = llIlIlIllIII[14];
        SWORD_TYPE_1_VARBIT = llIlIlIllIII[5];
        SELECT_MOULD_SCRIPT = llIlIlIllIII[15];
        SELECT_MOULD_TAB = llIlIlIllIII[16];
        SWORD_TYPE_2_VARBIT = llIlIlIllIII[6];
        MOULD_LIST_PARENT = llIlIlIllIII[1];
        DISABLED_TEXT_COLOR = llIlIlIllIII[7];
        SELECTED_MOULD_TAB = llIlIlIllIII[8];
        FORTE = new GameEnum19(llIlIlIllIII[18], llIlIlIllIII[0], llIlIlIllIII[0], llIlIlIllIII[19]);
        BLADE = new GameEnum19(llIlIlIllIII[21], llIlIlIllIII[2], llIlIlIllIII[22], llIlIlIllIII[23]);
        TIP = new GameEnum19(llIlIlIllIII[24], llIlIlIllIII[3], llIlIlIllIII[25], llIlIlIllIII[26]);
        f[] fArray = new f[llIlIlIllIII[10]];
        fArray[f.llIlIlIllIII[0]] = FORTE;
        fArray[f.llIlIlIllIII[2]] = BLADE;
        fArray[f.llIlIlIllIII[3]] = TIP;
        $VALUES = fArray;
        client = Static.getClient();
    }
}

