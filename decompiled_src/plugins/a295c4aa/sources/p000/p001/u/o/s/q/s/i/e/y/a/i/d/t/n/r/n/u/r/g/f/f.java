package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
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
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.f  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/f.class */
public final class f {
    public static final /* synthetic */ int MOULD_LIST_PARENT;
    private static final /* synthetic */ int SELECT_MOULD_TAB_SCRIPT;
    private final /* synthetic */ int pageVisbility;
    private final /* synthetic */ int pageSelection;
    private static final /* synthetic */ int SELECT_MOULD_SCRIPT;
    private static final /* synthetic */ int SELECT_MOULD_TAB;
    public static final /* synthetic */ f BLADE;
    private final /* synthetic */ int selectionVarbit;
    private static final /* synthetic */ int SWORD_TYPE_1_VARBIT;
    private static /* synthetic */ int[] llIlIlIllIII;
    public static final /* synthetic */ f FORTE;
    private static final /* synthetic */ f[] $VALUES;
    private static final /* synthetic */ int DISABLED_TEXT_COLOR;
    private static final /* synthetic */ int SWORD_TYPE_2_VARBIT;
    public static final /* synthetic */ f TIP;
    private static final /* synthetic */ int SELECTED_MOULD_TAB;
    private static final /* synthetic */ Client client;
    private final /* synthetic */ int pageWidget;
    private static /* synthetic */ String[] llIlIlIlIlll;

    private static boolean lIIIIIllIIlllll(int i) {
        return i != 0;
    }

    private static String lIIIIIllIIlIllI(String lllllllllllllllIlIIIIlIIlllllIll, String lllllllllllllllIlIIIIlIIlllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8)), llIlIlIllIII[20]), "DES");
            Cipher lllllllllllllllIlIIIIlIIllllllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIlIIllllllIl.init(llIlIlIllIII[3], lllllllllllllllIlIIIIlIIlllllllI);
            return new String(lllllllllllllllIlIIIIlIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIIllllllII) {
            lllllllllllllllIlIIIIlIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIlIIIIl(int i, int i2) {
        return i != i2;
    }

    public int F() {
        return this.pageVisbility;
    }

    private static Map<e, Widget> a(Widget[] widgetArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = llIlIlIllIII[3];
        while (lIIIIIllIIlllIl(i, widgetArr.length)) {
            Widget widget = widgetArr[i];
            e b = e.b(widget.getText());
            if (lIIIIIllIIlllII(b) && lIIIIIllIlIIIIl(widget.getTextColor(), llIlIlIllIII[7])) {
                linkedHashMap.put(b, widget);
                "".length();
            }
            i += 17;
            "".length();
            if ((131 ^ 135) == "   ".length()) {
                return null;
            }
        }
        return linkedHashMap;
    }

    private static String lIIIIIllIIllIII(String lllllllllllllllIlIIIIlIIllIllllI, String lllllllllllllllIlIIIIlIIllIlllIl) {
        String lllllllllllllllIlIIIIlIIllIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIlIIllIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIIIlIIllIllIll = lllllllllllllllIlIIIIlIIllIlllIl.toCharArray();
        int lllllllllllllllIlIIIIlIIllIllIlI = llIlIlIllIII[0];
        char[] charArray = lllllllllllllllIlIIIIlIIllIllllI2.toCharArray();
        int length = charArray.length;
        int i = llIlIlIllIII[0];
        while (lIIIIIllIIlllIl(i, length)) {
            lllllllllllllllIlIIIIlIIllIlllII.append((char) (charArray[i] ^ lllllllllllllllIlIIIIlIIllIllIll[lllllllllllllllIlIIIIlIIllIllIlI % lllllllllllllllIlIIIIlIIllIllIll.length]));
            "".length();
            lllllllllllllllIlIIIIlIIllIllIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIlIIllIlllII);
    }

    private f(String str, int i, int i2, int i3, int i4, int i5) {
        this.selectionVarbit = i2;
        this.pageVisbility = i3;
        this.pageSelection = i4;
        this.pageWidget = i5;
    }

    public void C() {
        int[] iArr = new int[llIlIlIllIII[2]];
        iArr[llIlIlIllIII[0]] = llIlIlIllIII[9];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIIIIllIIllIll(nearest)) {
            return;
        }
        Widget fromId = Widgets.fromId(this.pageWidget);
        if (lIIIIIllIIllIll(fromId)) {
            return;
        }
        fromId.interact(llIlIlIlIlll[llIlIlIllIII[10]]);
        nearest.interact(llIlIlIlIlll[llIlIlIllIII[11]]);
    }

    private static boolean lIIIIIllIIllllI(int i) {
        return i == 0;
    }

    private static void lIIIIIllIIllIlI() {
        llIlIlIllIII = new int[28];
        llIlIlIllIII[0] = ((((2 + 64) - (-18)) + 47) ^ (((30 + 101) - 109) + 112)) & (((10 ^ 126) ^ (51 ^ 66)) ^ (-" ".length()));
        llIlIlIllIII[1] = (-(55 ^ 114)) & (-7681) & 47062605;
        llIlIlIllIII[2] = " ".length();
        llIlIlIllIII[3] = "  ".length();
        llIlIlIllIII[4] = -" ".length();
        llIlIlIllIII[5] = (-(((22 + 106) - 108) + 113)) & (-297) & 14335;
        llIlIlIllIII[6] = (-"   ".length()) & (-16681) & 30590;
        llIlIlIllIII[7] = (-1) & 10461087;
        llIlIlIllIII[8] = (-18721) & 32629;
        llIlIlIllIII[9] = (-20737) & 65513;
        llIlIlIllIII[10] = "   ".length();
        llIlIlIllIII[11] = (84 ^ 98) ^ (30 ^ 44);
        llIlIlIllIII[12] = 96 ^ 101;
        llIlIlIllIII[13] = 124 ^ 122;
        llIlIlIllIII[14] = (-17) & 6111;
        llIlIlIllIII[15] = (-16421) & 22518;
        llIlIlIllIII[16] = (-19236) & 47074095;
        llIlIlIllIII[17] = 90 ^ 93;
        llIlIlIllIII[18] = (-((-12126) & 28671)) & (-9) & 30463;
        llIlIlIllIII[19] = (-22147) & 47077015;
        llIlIlIllIII[20] = 90 ^ 82;
        llIlIlIllIII[21] = (-((-9557) & 28125)) & (-257) & 32735;
        llIlIlIllIII[22] = (((158 + 44) - 201) + 159) ^ (((1 + 94) - 67) + 141);
        llIlIlIllIII[23] = (-6154) & 47061023;
        llIlIlIllIII[24] = (-((-12881) & 31734)) & (-1) & 32765;
        llIlIlIllIII[25] = (25 ^ 66) ^ (51 ^ 122);
        llIlIlIllIII[26] = (-9321) & 47064191;
        llIlIlIllIII[27] = (((104 + 125) - 177) + 104) ^ (((65 + 109) - 86) + 62);
    }

    private static boolean lIIIIIllIIllIll(Object obj) {
        return obj == null;
    }

    public int G() {
        return this.pageSelection;
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    private static void lIIIIIllIIllIIl() {
        llIlIlIlIlll = new String[llIlIlIllIII[27]];
        llIlIlIlIlll[llIlIlIllIII[0]] = lIIIIIllIIlIllI("F/ToLpwXPu93HqnWHKQIfSSE2q7MaIMG", "NBjOY");
        llIlIlIlIlll[llIlIlIllIII[2]] = lIIIIIllIIlIlll("DB80+O0gF/dAsK7Y5BzkJ1wu1wpv/Jz8reqUGdy8yxI=", "RJLVv");
        llIlIlIlIlll[llIlIlIllIII[3]] = lIIIIIllIIllIII("BR02HAsi", "VxZyh");
        llIlIlIlIlll[llIlIlIllIII[10]] = lIIIIIllIIlIlll("aR895/d+hUo=", "kQdtI");
        llIlIlIlIlll[llIlIlIllIII[11]] = lIIIIIllIIlIllI("MlOVporZgc4=", "InLwq");
        llIlIlIlIlll[llIlIlIllIII[12]] = lIIIIIllIIlIlll("bSfnZrr+F7O1KfA6maVZ8Bxpmc6KOVjZ", "PUDmZ");
        llIlIlIlIlll[llIlIlIllIII[13]] = lIIIIIllIIlIlll("iN2axfyJGUY=", "TviWf");
        llIlIlIlIlll[llIlIlIllIII[17]] = lIIIIIllIIlIllI("SIc/P1KiL24=", "zUzoF");
        llIlIlIlIlll[llIlIlIllIII[20]] = lIIIIIllIIlIlll("6tGcAse3ivc=", "Fhulx");
        llIlIlIlIlll[llIlIlIllIII[22]] = lIIIIIllIIlIllI("83aHgvB0KNY=", "Xkpgx");
    }

    public int E() {
        return this.selectionVarbit;
    }

    private static boolean lIIIIIllIIlllII(Object obj) {
        return obj != null;
    }

    public static Widget y() {
        e z = z();
        if (lIIIIIllIIllIll(z)) {
            Log.info(llIlIlIlIlll[llIlIlIllIII[0]]);
            return null;
        }
        Widget widget = client.getWidget(llIlIlIllIII[1]);
        if (lIIIIIllIIllIll(widget)) {
            Log.info(llIlIlIlIlll[llIlIlIllIII[2]]);
            return null;
        }
        Widget[] dynamicChildren = widget.getDynamicChildren();
        if (lIIIIIllIIlllII(dynamicChildren)) {
            int length = dynamicChildren.length;
            int i = llIlIlIllIII[0];
            while (lIIIIIllIIlllIl(i, length)) {
                Widget widget2 = dynamicChildren[i];
                String[] strArr = new String[llIlIlIllIII[2]];
                strArr[llIlIlIllIII[0]] = llIlIlIlIlll[llIlIlIllIII[3]];
                if (lIIIIIllIIllllI(widget2.hasAction(strArr) ? 1 : 0)) {
                    "".length();
                    if ((-" ".length()) >= " ".length()) {
                        return null;
                    }
                } else if (lIIIIIllIIlllll(widget2.getName().contains(z.x()) ? 1 : 0)) {
                    return widget2;
                }
                i++;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static String lIIIIIllIIlIlll(String lllllllllllllllIlIIIIlIIlllIlllI, String lllllllllllllllIlIIIIlIIlllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIllllIIII.init(llIlIlIllIII[3], lllllllllllllllIlIIIIlIIllllIIIl);
            return new String(lllllllllllllllIlIIIIlIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIIlllIllll) {
            lllllllllllllllIlIIIIlIIlllIllll.printStackTrace();
            return null;
        }
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean B() {
        if (lIIIIIllIlIIIlI(client.getVarbitValue(llIlIlIllIII[8]), this.pageVisbility)) {
            ?? r0 = llIlIlIllIII[2];
            "".length();
            return ((41 ^ 66) ^ (89 ^ 54)) <= " ".length() ? ((((31 + 102) - 92) + 93) ^ (((84 + 83) - 89) + 79)) & (((((85 + 111) - 183) + 165) ^ (((46 + 107) - 104) + 120)) ^ (-" ".length())) : r0;
        }
        return llIlIlIllIII[0];
    }

    private static boolean lIIIIIllIlIIIlI(int i, int i2) {
        return i == i2;
    }

    public void D() {
        Widget y = y();
        if (!lIIIIIllIIlllII(y) || lIIIIIllIlIIIlI(y.getIndex(), llIlIlIllIII[4])) {
            Log.info(llIlIlIlIlll[llIlIlIllIII[12]]);
        } else {
            y.interact(llIlIlIlIlll[llIlIlIllIII[13]]);
        }
    }

    private static boolean lIIIIIllIIlllIl(int i, int i2) {
        return i < i2;
    }

    public static e z() {
        Widget widget = client.getWidget(llIlIlIllIII[1]);
        if (!lIIIIIllIIlllII(widget) || lIIIIIllIIllIll(widget.getChildren())) {
            return null;
        }
        Map<e, Widget> a = a(widget.getChildren());
        int i = llIlIlIllIII[4];
        Widget widget2 = null;
        d a2 = d.a(client.getVarbitValue(llIlIlIllIII[5]));
        d a3 = d.a(client.getVarbitValue(llIlIlIllIII[6]));
        for (Map.Entry<e, Widget> entry : a.entrySet()) {
            int a4 = entry.getKey().a(a2, a3);
            if (lIIIIIllIlIIIII(a4, i)) {
                i = a4;
                widget2 = entry.getValue();
            }
            "".length();
            if ((-" ".length()) >= ((5 ^ 69) ^ (121 ^ 61))) {
                return null;
            }
        }
        if (lIIIIIllIIlllII(widget2)) {
            Log.info("Best mould is " + widget2.getText());
            return e.b(widget2.getText());
        }
        return null;
    }

    private static boolean lIIIIIllIlIIIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean A() {
        if (lIIIIIllIIlllll(client.getVarbitValue(this.selectionVarbit))) {
            ?? r0 = llIlIlIllIII[2];
            "".length();
            return "   ".length() < "  ".length() ? ((((134 + 15) - 3) + 0) ^ (((50 + 33) - (-80)) + 7)) & (((145 ^ 178) ^ (28 ^ 7)) ^ (-" ".length())) : r0;
        }
        return llIlIlIllIII[0];
    }

    static {
        lIIIIIllIIllIlI();
        lIIIIIllIIllIIl();
        SELECT_MOULD_TAB_SCRIPT = llIlIlIllIII[14];
        SWORD_TYPE_1_VARBIT = llIlIlIllIII[5];
        SELECT_MOULD_SCRIPT = llIlIlIllIII[15];
        SELECT_MOULD_TAB = llIlIlIllIII[16];
        SWORD_TYPE_2_VARBIT = llIlIlIllIII[6];
        MOULD_LIST_PARENT = llIlIlIllIII[1];
        DISABLED_TEXT_COLOR = llIlIlIllIII[7];
        SELECTED_MOULD_TAB = llIlIlIllIII[8];
        FORTE = new f(llIlIlIlIlll[llIlIlIllIII[17]], llIlIlIllIII[0], llIlIlIllIII[18], llIlIlIllIII[0], llIlIlIllIII[0], llIlIlIllIII[19]);
        BLADE = new f(llIlIlIlIlll[llIlIlIllIII[20]], llIlIlIllIII[2], llIlIlIllIII[21], llIlIlIllIII[2], llIlIlIllIII[22], llIlIlIllIII[23]);
        TIP = new f(llIlIlIlIlll[llIlIlIllIII[22]], llIlIlIllIII[3], llIlIlIllIII[24], llIlIlIllIII[3], llIlIlIllIII[25], llIlIlIllIII[26]);
        f[] fVarArr = new f[llIlIlIllIII[10]];
        fVarArr[llIlIlIllIII[0]] = FORTE;
        fVarArr[llIlIlIllIII[2]] = BLADE;
        fVarArr[llIlIlIllIII[3]] = TIP;
        $VALUES = fVarArr;
        client = Static.getClient();
    }
}
