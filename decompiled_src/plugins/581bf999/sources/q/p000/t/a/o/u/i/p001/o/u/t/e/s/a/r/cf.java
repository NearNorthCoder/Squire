package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Claiming Death Items", priority = 100, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cf  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cf.class */
public class cf extends ck {
    private static /* synthetic */ String[] lIlllllllIl;
    private static final /* synthetic */ int hL;
    private final /* synthetic */ C0077z hM;
    private static /* synthetic */ int[] lIlllllllll;
    private /* synthetic */ boolean hN;

    private static void lIIllIllllllll() {
        lIlllllllIl = new String[lIlllllllll[19]];
        lIlllllllIl[lIlllllllll[0]] = lIIllIllllllII("m9PX7JaGZlmjJ2Ocpalq3VFKk6bVvSoS9f0/2vCi5/145UUOqusQ4z1oiAgbW1VqH/ywB5yvaRs=", "sbrSG");
        lIlllllllIl[lIlllllllll[1]] = lIIllIllllllIl("hJX1gNo8QQJxqsFDu505FXQyjwmD4SrNs0/J36rJ2Ant7xdHAGxUHg6sHkqXOh/emg9Id6DYiF0=", "xmyBq");
        lIlllllllIl[lIlllllllll[2]] = lIIllIllllllII("BJzjFcubFm+ihrRajv+szbwDgOkFcpZcroQtPVSzNny9Op6R9IpmNUOR3FXtb5sYednppmh6KHQ=", "pSNpR");
        lIlllllllIl[lIlllllllll[4]] = lIIllIlllllllI("FDE7GDMiNjIYLic7Ixw3PC93NioqHD4XPW8WMhguJ1I0ET88Bg==", "OrWyZ");
        lIlllllllIl[lIlllllllll[6]] = lIIllIllllllII("7Ids3T2hX2c=", "ZWKqa");
        lIlllllllIl[lIlllllllll[7]] = lIIllIlllllllI("CzY6Fhg9MTMWBTg8IhIcIyh2JBQkAT8ZFnARPxIVcAE5VxcxGSUS", "PuVwq");
        lIlllllllIl[lIlllllllll[8]] = lIIllIlllllllI("OQ8WGw8H", "laztl");
        lIlllllllIl[lIlllllllll[9]] = lIIllIllllllIl("yyriw/fDvgufx8xNdURekhKHQWe1GGYIUr33iL5nd8ZM3/M43LtL1A==", "JgtzM");
        lIlllllllIl[lIlllllllll[10]] = lIIllIllllllII("OdDY5+oFdRo=", "ALPeA");
        lIlllllllIl[lIlllllllll[11]] = lIIllIlllllllI("GxkfHWMOFBg=", "OxtxN");
        lIlllllllIl[lIlllllllll[12]] = lIIllIllllllIl("iB+X22dvFti654vxHg2W4L48p3W/Ez9LN5cx2Caph/EGgJB1wmYWuDeiX9rPSCTFUmgRMyKtovA=", "GAFMN");
        lIlllllllIl[lIlllllllll[13]] = lIIllIlllllllI("ECgnF0cFJSA=", "DILrj");
        lIlllllllIl[lIlllllllll[14]] = lIIllIlllllllI("Ew4+KzgyRzo3ODJHOC0jNA8=", "WgHBV");
        lIlllllllIl[lIlllllllll[15]] = lIIllIlllllllI("PTUHRgAFMx4DAkQuHUYVESgEDxABegYOA0QOHQsEFw==", "dZrff");
        lIlllllllIl[lIlllllllll[16]] = lIIllIllllllIl("vasjnn6n00g=", "aAXno");
        lIlllllllIl[lIlllllllll[17]] = lIIllIllllllII("9lndZBBTPeTTpltn5CipDA==", "SdOve");
        lIlllllllIl[lIlllllllll[18]] = lIIllIllllllII("wCoibvwb3RU=", "hoiHU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        if (lIIlllIIIIlIIl(this.hN ? 1 : 0)) {
            return lIlllllllll[0];
        }
        if (lIIlllIIIIlIlI(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info(lIlllllllIl[lIlllllllll[0]]);
            return lIlllllllll[1];
        } else if (lIIlllIIIIlIlI(Dialog.canContinue() ? 1 : 0)) {
            this.hN = lIlllllllll[0];
            return lIlllllllll[0];
        } else if (lIIlllIIIIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(lIlllllllll[2]);
            "".length();
            return lIlllllllll[1];
        } else if (lIIlllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            int[] a = this.hM.a(this.hY.kephriMelee());
            if (lIIlllIIIIlIlI(Inventory.contains(a) ? 1 : 0)) {
                Log.info(lIlllllllIl[lIlllllllll[1]]);
                this.hM.c(a);
                "".length();
                "".length();
                if ("  ".length() >= (23 ^ 19)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                Log.info(lIlllllllIl[lIlllllllll[2]]);
                cL();
            }
            return lIlllllllll[1];
        } else {
            Widget widget = Widgets.get(lIlllllllll[3], lIlllllllll[4]);
            if (lIIlllIIIIlIIl(Widgets.isVisible(widget) ? 1 : 0)) {
                Log.info(lIlllllllIl[lIlllllllll[4]]);
                int[] iArr = new int[lIlllllllll[1]];
                iArr[lIlllllllll[0]] = lIlllllllll[5];
                TileObject nearest = TileObjects.getNearest(iArr);
                if (lIIlllIIIIlIll(nearest)) {
                    return lIlllllllll[0];
                }
                nearest.interact(lIlllllllIl[lIlllllllll[6]]);
                return lIlllllllll[1];
            }
            Widget[] children = widget.getChildren();
            if (!lIIlllIIIIllII(children) || !lIIlllIIIIlIlI(children.length) || lIIlllIIIIlIlI(a(children) ? 1 : 0)) {
                Log.info(lIlllllllIl[lIlllllllll[7]]);
                this.hN = lIlllllllll[0];
                return lIlllllllll[1];
            }
            Widget widget2 = Widgets.get(lIlllllllll[3], lIlllllllll[8]);
            if (lIIlllIIIIlIlI(Widgets.isVisible(widget2) ? 1 : 0)) {
                String[] strArr = new String[lIlllllllll[1]];
                strArr[lIlllllllll[0]] = lIlllllllIl[lIlllllllll[8]];
                if (lIIlllIIIIlIlI(widget2.hasAction(strArr) ? 1 : 0)) {
                    Log.info(lIlllllllIl[lIlllllllll[9]]);
                    widget2.interact(lIlllllllIl[lIlllllllll[10]]);
                    return lIlllllllll[1];
                }
            }
            if (lIIlllIIIIlIlI(Widgets.isVisible(widget2) ? 1 : 0)) {
                String[] strArr2 = new String[lIlllllllll[1]];
                strArr2[lIlllllllll[0]] = lIlllllllIl[lIlllllllll[11]];
                if (lIIlllIIIIlIlI(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Log.info(lIlllllllIl[lIlllllllll[12]]);
                    widget2.interact(lIlllllllIl[lIlllllllll[13]]);
                    return lIlllllllll[1];
                }
            }
            return lIlllllllll[0];
        }
    }

    private static String lIIllIlllllllI(String llllllllllllllllIlIIlIIIIlIIlIII, String llllllllllllllllIlIIlIIIIlIIIlll) {
        String llllllllllllllllIlIIlIIIIlIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIlIIIIlIIIlll.toCharArray();
        int llllllllllllllllIlIIlIIIIlIIIlII = lIlllllllll[0];
        char[] charArray2 = llllllllllllllllIlIIlIIIIlIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlllllllll[0];
        while (lIIlllIIIIllIl(i, length)) {
            char llllllllllllllllIlIIlIIIIlIIlIIl = charArray2[i];
            sb.append((char) (llllllllllllllllIlIIlIIIIlIIlIIl ^ charArray[llllllllllllllllIlIIlIIIIlIIIlII % charArray.length]));
            "".length();
            llllllllllllllllIlIIlIIIIlIIIlII++;
            i++;
            "".length();
            if ((125 ^ 121) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIllIllllllII(String llllllllllllllllIlIIlIIIIIllIIll, String llllllllllllllllIlIIlIIIIIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), lIlllllllll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllllllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIIIllIlII) {
            llllllllllllllllIlIIlIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllllllIl(String llllllllllllllllIlIIlIIIIlIllIII, String llllllllllllllllIlIIlIIIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIIlIlIlII) {
            llllllllllllllllIlIIlIIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIIlllI(int i) {
        return i > 0;
    }

    private static boolean lIIlllIIIIlIlI(int i) {
        return i != 0;
    }

    private static boolean lIIlllIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIlllIIIIIllI() {
        lIlllllllll = new int[20];
        lIlllllllll[0] = ((((189 + 13) - 127) + 169) ^ (((123 + 158) - 259) + 145)) & (((((53 + 24) - 28) + 193) ^ (((108 + 76) - 91) + 68)) ^ (-" ".length()));
        lIlllllllll[1] = " ".length();
        lIlllllllll[2] = "  ".length();
        lIlllllllll[3] = (-((-2843) & 31551)) & (-1409) & 30718;
        lIlllllllll[4] = "   ".length();
        lIlllllllll[5] = (-2050) & 48127;
        lIlllllllll[6] = 112 ^ 116;
        lIlllllllll[7] = 142 ^ 139;
        lIlllllllll[8] = 50 ^ 52;
        lIlllllllll[9] = (31 ^ 41) ^ (78 ^ 127);
        lIlllllllll[10] = (((141 + 106) - 136) + 75) ^ (((16 + 72) - (-12)) + 78);
        lIlllllllll[11] = (((75 + 25) - 99) + 144) ^ (((75 + 17) - (-23)) + 37);
        lIlllllllll[12] = 148 ^ 158;
        lIlllllllll[13] = 185 ^ 178;
        lIlllllllll[14] = 149 ^ 153;
        lIlllllllll[15] = 186 ^ 183;
        lIlllllllll[16] = 62 ^ 48;
        lIlllllllll[17] = (132 ^ 188) ^ (101 ^ 82);
        lIlllllllll[18] = (((47 + 109) - 72) + 62) ^ (((24 + 64) - 8) + 50);
        lIlllllllll[19] = 187 ^ 170;
    }

    @Inject
    protected cf(Client client, TOAConfig tOAConfig, C0077z c0077z) {
        super(client, tOAConfig);
        this.hM = c0077z;
    }

    private void cL() {
        int i;
        if (lIIlllIIIIlIIl(RunePouch.hasPouch() ? 1 : 0) || lIIlllIIIIlIIl(Inventory.contains(item -> {
            return item.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[18]]);
        }) ? 1 : 0)) {
            return;
        }
        Item first = Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().contains(lIlllllllIl[lIlllllllll[17]]);
        });
        String[] strArr = new String[lIlllllllll[1]];
        strArr[lIlllllllll[0]] = lIlllllllIl[lIlllllllll[14]];
        if (lIIlllIIIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
            i = lIlllllllll[6];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            i = lIlllllllll[4];
        }
        int i2 = i;
        int i3 = lIlllllllll[0];
        while (lIIlllIIIIllIl(i3, i2)) {
            if (!lIIlllIIIIlllI(RunePouch.RuneSlot.values()[i3].getQuantity())) {
                Item first2 = Inventory.getFirst(item3 -> {
                    return item3.getName().toLowerCase().endsWith(lIlllllllIl[lIlllllllll[16]]);
                });
                if (lIIlllIIIIlIll(first2)) {
                    return;
                }
                first2.useOn(first);
                return;
            }
            "".length();
            if ((-"   ".length()) > 0) {
                return;
            }
            i3++;
            "".length();
            if (" ".length() <= (((((210 + 44) - 176) + 172) ^ (((100 + 122) - 158) + 115)) & (((145 ^ 141) ^ (82 ^ 7)) ^ (-" ".length())))) {
                return;
            }
        }
    }

    static {
        lIIlllIIIIIllI();
        lIIllIllllllll();
        hL = lIlllllllll[5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlllIIIIlIlI(chatMessage.getMessage().contains(lIlllllllIl[lIlllllllll[15]]) ? 1 : 0)) {
            this.hN = lIlllllllll[1];
        }
    }

    private static boolean lIIlllIIIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIIIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIIIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(Widget[] widgetArr) {
        int length = widgetArr.length;
        int llllllllllllllllIlIIlIIIIllIIlIl = lIlllllllll[0];
        while (lIIlllIIIIllIl(llllllllllllllllIlIIlIIIIllIIlIl, length)) {
            if (lIIlllIIIIlIlI(Widgets.isVisible(widgetArr[llllllllllllllllIlIIlIIIIllIIlIl]) ? 1 : 0)) {
                return lIlllllllll[0];
            }
            llllllllllllllllIlIIlIIIIllIIlIl++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlllllllll[1];
    }
}
