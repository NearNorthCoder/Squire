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
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.d;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.e;
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

public final class f
extends Enum<f> {
    public static final /* synthetic */ int MOULD_LIST_PARENT;
    private static final /* synthetic */ int SELECT_MOULD_TAB_SCRIPT;
    private final /* synthetic */ int pageVisbility;
    private final /* synthetic */ int pageSelection;
    private static final /* synthetic */ int SELECT_MOULD_SCRIPT;
    private static final /* synthetic */ int SELECT_MOULD_TAB;
    public static final /* synthetic */ /* enum */ f BLADE;
    private final /* synthetic */ int selectionVarbit;
    private static final /* synthetic */ int SWORD_TYPE_1_VARBIT;
    private static /* synthetic */ int[] llIlIlIllIII;
    public static final /* synthetic */ /* enum */ f FORTE;
    private static final /* synthetic */ f[] $VALUES;
    private static final /* synthetic */ int DISABLED_TEXT_COLOR;
    private static final /* synthetic */ int SWORD_TYPE_2_VARBIT;
    public static final /* synthetic */ /* enum */ f TIP;
    private static final /* synthetic */ int SELECTED_MOULD_TAB;
    private static final /* synthetic */ Client client;
    private final /* synthetic */ int pageWidget;
    private static /* synthetic */ String[] llIlIlIlIlll;

    private static boolean lIIIIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIllIIlIllI(String var10, String var29) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), llIlIlIllIII[20]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIlIlIllIII[3], var8);
            return new String(var4.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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
        Widget[] var26;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var6 = llIlIlIllIII[3];
        while (f.lIIIIIllIIlllIl(var6, var26.length)) {
            Widget var24 = var26[var6];
            e var43 = e.b(var24.getText());
            if (f.lIIIIIllIIlllII((Object)var43) && f.lIIIIIllIlIIIIl(var24.getTextColor(), llIlIlIllIII[7])) {
                void var32;
                var32.put(var43, var24);
                0;
            }
            var6 += 17;
            0;
            if ((0x83 ^ 0x87) != 3) continue;
            return null;
        }
        return linkedHashMap;
    }

    private static String lIIIIIllIIllIII(String var7, String var11) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var40 = new StringBuilder();
        char[] var2 = var11.toCharArray();
        int var27 = llIlIlIllIII[0];
        char[] var31 = var7.toCharArray();
        int var9 = var31.length;
        int var33 = llIlIlIllIII[0];
        while (f.lIIIIIllIIlllIl(var33, var9)) {
            char var21 = var31[var33];
            var40.append((char)(var21 ^ var2[var27 % var2.length]));
            0;
            ++var27;
            ++var33;
            0;
            if (((0x25 ^ 0x68) & ~(0xC2 ^ 0x8F)) == 0) continue;
            return null;
        }
        return String.valueOf(var40);
    }

    private f(int n3, int n4, int n5, int n6) {
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
        f var3;
        int[] nArray = new int[llIlIlIllIII[2]];
        nArray[f.llIlIlIllIII[0]] = llIlIlIllIII[9];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (f.lIIIIIllIIllIll(tileObject)) {
            return;
        }
        Widget var17 = Widgets.fromId((int)var3.pageWidget);
        if (f.lIIIIIllIIllIll(var17)) {
            return;
        }
        var2_2.interact(llIlIlIlIlll[llIlIlIllIII[10]]);
        tileObject.interact(llIlIlIlIlll[llIlIlIllIII[11]]);
    }

    private static boolean lIIIIIllIIllllI(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIllIIllIlI() {
        llIlIlIllIII = new int[28];
        f.llIlIlIllIII[0] = (2 + 64 - -18 + 47 ^ 30 + 101 - 109 + 112) & (0xA ^ 0x7E ^ (0x33 ^ 0x42) ^ -1);
        f.llIlIlIllIII[1] = -(0x37 ^ 0x72) & (0xFFFFE1FF & 0x2CE1E4D);
        f.llIlIlIllIII[2] = 1;
        f.llIlIlIllIII[3] = 2;
        f.llIlIlIllIII[4] = -1;
        f.llIlIlIllIII[5] = -(22 + 106 - 108 + 113) & (0xFFFFFED7 & 0x37FF);
        f.llIlIlIllIII[6] = -3 & (0xFFFFBED7 & 0x777E);
        f.llIlIlIllIII[7] = 0xFFFFFFFF & 0x9F9F9F;
        f.llIlIlIllIII[8] = 0xFFFFB6DF & 0x7F75;
        f.llIlIlIllIII[9] = 0xFFFFAEFF & 0xFFE9;
        f.llIlIlIllIII[10] = 3;
        f.llIlIlIllIII[11] = 0x54 ^ 0x62 ^ (0x1E ^ 0x2C);
        f.llIlIlIllIII[12] = 0x60 ^ 0x65;
        f.llIlIlIllIII[13] = 0x7C ^ 0x7A;
        f.llIlIlIllIII[14] = 0xFFFFFFEF & 0x17DF;
        f.llIlIlIllIII[15] = 0xFFFFBFDB & 0x57F6;
        f.llIlIlIllIII[16] = 0xFFFFB4DC & 0x2CE4B2F;
        f.llIlIlIllIII[17] = 0x5A ^ 0x5D;
        f.llIlIlIllIII[18] = -(0xFFFFD0A2 & 0x6FFF) & (0xFFFFFFF7 & 0x76FF);
        f.llIlIlIllIII[19] = 0xFFFFA97D & 0x2CE5697;
        f.llIlIlIllIII[20] = 0x5A ^ 0x52;
        f.llIlIlIllIII[21] = -(0xFFFFDAAB & 0x6DDD) & (0xFFFFFEFF & 0x7FDF);
        f.llIlIlIllIII[22] = 158 + 44 - 201 + 159 ^ 1 + 94 - 67 + 141;
        f.llIlIlIllIII[23] = 0xFFFFE7F6 & 0x2CE181F;
        f.llIlIlIllIII[24] = -(0xFFFFCDAF & 0x7BF6) & (0xFFFFFFFF & 0x7FFD);
        f.llIlIlIllIII[25] = 0x19 ^ 0x42 ^ (0x33 ^ 0x7A);
        f.llIlIlIllIII[26] = 0xFFFFDB97 & 0x2CE247F;
        f.llIlIlIllIII[27] = 104 + 125 - 177 + 104 ^ 65 + 109 - 86 + 62;
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
        f.llIlIlIlIlll[f.llIlIlIllIII[0]] = f."No best mould found";
        f.llIlIlIlIlll[f.llIlIlIllIII[2]] = f."Mould list parent is null";
        f.llIlIlIlIlll[f.llIlIlIllIII[3]] = f."Select";
        f.llIlIlIlIlll[f.llIlIlIllIII[10]] = f."View";
        f.llIlIlIlIlll[f.llIlIlIllIII[11]] = f."Setup";
        f.llIlIlIlIlll[f.llIlIlIllIII[12]] = f."No best widget found";
        f.llIlIlIlIlll[f.llIlIlIllIII[13]] = f."Select";
        f.llIlIlIlIlll[f.llIlIlIllIII[17]] = f."FORTE";
        f.llIlIlIlIlll[f.llIlIlIllIII[20]] = f."BLADE";
        f.llIlIlIlIlll[f.llIlIlIllIII[22]] = f."TIP";
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
        Widget var19 = client.getWidget(llIlIlIllIII[1]);
        if (f.lIIIIIllIIllIll(var19)) {
            Log.info((String)llIlIlIlIlll[llIlIlIllIII[2]]);
            return null;
        }
        Widget[] var34 = var19.getDynamicChildren();
        if (f.lIIIIIllIIlllII(var34)) {
            Widget[] var12 = var34;
            int var41 = var12.length;
            int var39 = llIlIlIllIII[0];
            while (f.lIIIIIllIIlllIl(var39, var41)) {
                void var1;
                Widget var22 = var12[var39];
                String[] stringArray = new String[llIlIlIllIII[2]];
                stringArray[f.llIlIlIllIII[0]] = llIlIlIlIlll[llIlIlIllIII[3]];
                if (f.lIIIIIllIIllllI(var22.hasAction(stringArray) ? 1 : 0)) {
                    0;
                    if (-1 >= 1) {
                        return null;
                    }
                } else if (f.lIIIIIllIIlllll(var22.getName().contains(var1.x()) ? 1 : 0)) {
                    return var22;
                }
                ++var39;
                0;
                if (1 >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static String lIIIIIllIIlIlll(String var38, String var23) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var42 = Cipher.getInstance("Blowfish");
            var42.init(llIlIlIllIII[3], var18);
            return new String(var42.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public boolean B() {
        boolean bl;
        if (f.lIIIIIllIlIIIlI(client.getVarbitValue(llIlIlIllIII[8]), this.pageVisbility)) {
            bl = llIlIlIllIII[2];
            0;
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
        Map<e, Widget> var13 = f.a(var16.getChildren());
        int var36 = llIlIlIllIII[4];
        Widget var35 = null;
        d var30 = d.a(client.getVarbitValue(llIlIlIllIII[5]));
        d var37 = d.a(client.getVarbitValue(llIlIlIllIII[6]));
        Iterator<Map.Entry<e, Widget>> var25 = var13.entrySet().iterator();
        while (f.lIIIIIllIIlllll(var25.hasNext() ? 1 : 0)) {
            Map.Entry<e, Widget> var14 = var25.next();
            e var28 = var14.getKey();
            int var15 = var28.a(var30, var37);
            if (f.lIIIIIllIlIIIII(var15, var36)) {
                var36 = var15;
                var35 = var14.getValue();
            }
            0;
            if (-1 < (5 ^ 0x45 ^ (0x79 ^ 0x3D))) continue;
            return null;
        }
        if (f.lIIIIIllIIlllII(var35)) {
            Log.info((String)("Best mould is " + var35.getText()));
            return e.b(var35.getText());
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
            0;
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
        FORTE = new f(llIlIlIllIII[18], llIlIlIllIII[0], llIlIlIllIII[0], llIlIlIllIII[19]);
        BLADE = new f(llIlIlIllIII[21], llIlIlIllIII[2], llIlIlIllIII[22], llIlIlIllIII[23]);
        TIP = new f(llIlIlIllIII[24], llIlIlIllIII[3], llIlIlIllIII[25], llIlIlIllIII[26]);
        f[] fArray = new f[llIlIlIllIII[10]];
        fArray[f.llIlIlIllIII[0]] = FORTE;
        fArray[f.llIlIlIllIII[2]] = BLADE;
        fArray[f.llIlIlIllIII[3]] = TIP;
        $VALUES = fArray;
        client = Static.getClient();
    }
}

