package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Claiming death items", priority = 125, register = true, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/b.class */
public class C0001b extends Task {
    private final /* synthetic */ SquireVorkathPlugin x;
    private static /* synthetic */ int[] lIlIlIlIlIllI;
    private static final /* synthetic */ int u;
    private final /* synthetic */ SquireVorkathConfig y;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int t;
    private static /* synthetic */ String[] lIlIlIlIlIIll;
    private static final /* synthetic */ int v;

    private static String lIllllllIIIIIII(String llllllllllllllIllIlIlIlIlIIlllIl, String llllllllllllllIllIlIlIlIlIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIlIlIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIlIlIIlllll.init(lIlIlIlIlIllI[2], secretKeySpec);
            return new String(llllllllllllllIllIlIlIlIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlIlIIllllI) {
            llllllllllllllIllIlIlIlIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIlIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllllllIIlIIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllllIIllIII(int i2) {
        return i2 > 0;
    }

    @Inject
    public C0001b(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig) {
        this.x = squireVorkathPlugin;
        this.y = squireVorkathConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllllllIIlIlII(chatMessage.getMessage().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[14]]) ? 1 : 0)) {
            this.x.b(lIlIlIlIlIllI[1]);
        }
    }

    private static String lIllllllIIIIIlI(String llllllllllllllIllIlIlIlIlIIIllIl, String llllllllllllllIllIlIlIlIlIIIllII) {
        String llllllllllllllIllIlIlIlIlIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIlIlIlIIIlIlI = llllllllllllllIllIlIlIlIlIIIllII.toCharArray();
        int llllllllllllllIllIlIlIlIlIIIlIIl = lIlIlIlIlIllI[0];
        char[] charArray = llllllllllllllIllIlIlIlIlIIIllIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIlIlIllI[0];
        while (lIllllllIIlIlll(i2, length)) {
            char llllllllllllllIllIlIlIlIlIIIlllI = charArray[i2];
            sb.append((char) (llllllllllllllIllIlIlIlIlIIIlllI ^ llllllllllllllIllIlIlIlIlIIIlIlI[llllllllllllllIllIlIlIlIlIIIlIIl % llllllllllllllIllIlIlIlIlIIIlIlI.length]));
            "".length();
            llllllllllllllIllIlIlIlIlIIIlIIl++;
            i2++;
            "".length();
            if (((17 ^ 15) ^ (93 ^ 70)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllllllIIlIlIl(Object obj) {
        return obj == null;
    }

    private void h() {
        int i2;
        if (lIllllllIIlIIll(RunePouch.hasPouch() ? 1 : 0) || lIllllllIIlIIll(Inventory.contains(item -> {
            return item.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[17]]);
        }) ? 1 : 0)) {
            return;
        }
        Item first = Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIlIlIlIIll[lIlIlIlIlIllI[16]]);
        });
        String[] strArr = new String[lIlIlIlIlIllI[1]];
        strArr[lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[13]];
        if (lIllllllIIlIlII(Inventory.contains(strArr) ? 1 : 0)) {
            i2 = lIlIlIlIlIllI[5];
            "".length();
            if ((((((47 + 131) - 89) + 54) ^ (((155 + 91) - 157) + 78)) & (((104 ^ 78) ^ (142 ^ 128)) ^ (-" ".length()))) != 0) {
                return;
            }
        } else {
            i2 = lIlIlIlIlIllI[4];
        }
        int i3 = i2;
        int i4 = lIlIlIlIlIllI[0];
        while (lIllllllIIlIlll(i4, i3)) {
            if (!lIllllllIIllIII(RunePouch.RuneSlot.values()[i4].getQuantity())) {
                Item first2 = Inventory.getFirst(item3 -> {
                    return item3.getName().toLowerCase().endsWith(lIlIlIlIlIIll[lIlIlIlIlIllI[15]]);
                });
                if (lIllllllIIlIlIl(first2)) {
                    return;
                }
                first2.useOn(first);
                return;
            }
            "".length();
            if (0 != 0) {
                return;
            }
            i4++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return;
            }
        }
    }

    private static void lIllllllIIlIIlI() {
        lIlIlIlIlIllI = new int[22];
        lIlIlIlIlIllI[0] = ((76 ^ 123) ^ "  ".length()) & (((204 ^ 153) ^ (68 ^ 36)) ^ (-" ".length()));
        lIlIlIlIlIllI[1] = " ".length();
        lIlIlIlIlIllI[2] = "  ".length();
        lIlIlIlIlIllI[3] = (-((-5146) & 32159)) & (-4129) & 31743;
        lIlIlIlIlIllI[4] = "   ".length();
        lIlIlIlIlIllI[5] = 60 ^ 56;
        lIlIlIlIlIllI[6] = 191 ^ 186;
        lIlIlIlIlIllI[7] = (28 ^ 65) ^ (34 ^ 121);
        lIlIlIlIlIllI[8] = 58 ^ 61;
        lIlIlIlIlIllI[9] = 97 ^ 105;
        lIlIlIlIlIllI[10] = 104 ^ 97;
        lIlIlIlIlIllI[11] = 76 ^ 70;
        lIlIlIlIlIllI[12] = (((90 + 156) - 144) + 89) ^ (((131 + 18) - 56) + 87);
        lIlIlIlIlIllI[13] = 205 ^ 193;
        lIlIlIlIlIllI[14] = (181 ^ 140) ^ (139 ^ 191);
        lIlIlIlIlIllI[15] = (((33 + 102) - 100) + 104) ^ (((102 + 55) - 59) + 35);
        lIlIlIlIlIllI[16] = 205 ^ 194;
        lIlIlIlIlIllI[17] = 13 ^ 29;
        lIlIlIlIlIllI[18] = (212 ^ 156) ^ (53 ^ 108);
        lIlIlIlIlIllI[19] = (((35 + 184) - 125) + 115) ^ (((81 + 168) - 89) + 35);
        lIlIlIlIlIllI[20] = (-17409) & 63486;
        lIlIlIlIlIllI[21] = 175 ^ 188;
    }

    private static void lIllllllIIIIlll() {
        lIlIlIlIlIIll = new String[lIlIlIlIlIllI[21]];
        lIlIlIlIlIIll[lIlIlIlIlIllI[0]] = lIllllllIIIIIII("dxbpRv6oeTMsh7Qt6FVgjD4ZP1xMClFWIqu9HjHYRVw=", "pklFt");
        lIlIlIlIlIIll[lIlIlIlIlIllI[1]] = lIllllllIIIIIIl("blLdDQFRM0+f2DNsFlWJXk5GEoBzhsulnQ2Usw/QQKw=", "XzIwY");
        lIlIlIlIlIIll[lIlIlIlIlIllI[2]] = lIllllllIIIIIlI("MBAsHyADQiEZbgILORpuFhc7E24UDSAVJkQEOgRuFxI0FSs=", "dbUvN");
        lIlIlIlIlIIll[lIlIlIlIlIllI[4]] = lIllllllIIIIIlI("CRYCACooAUcKJicSD043KRQBBys=", "FfgnC");
        lIlIlIlIlIIll[lIlIlIlIlIllI[5]] = lIllllllIIIIIIl("ng+uVT6kLEc=", "KrzOE");
        lIlIlIlIlIIll[lIlIlIlIlIllI[6]] = lIllllllIIIIIII("y6h7l1hD4B+8IV6O0rYJidyDcBNRZ4af", "DnggO");
        lIlIlIlIlIIll[lIlIlIlIlIllI[7]] = lIllllllIIIIIlI("JjwULS0Y", "sRxBN");
        lIlIlIlIlIIll[lIlIlIlIlIllI[8]] = lIllllllIIIIIlI("MCI7DhsOJTkGWAEpNhUQRS8/BAsR", "eLWax");
        lIlIlIlIlIIll[lIlIlIlIlIllI[9]] = lIllllllIIIIIIl("DPgD0Reezyc=", "YRxZs");
        lIlIlIlIlIIll[lIlIlIlIlIllI[10]] = lIllllllIIIIIIl("GrJHKkKV3BCXiUkB1YAFNw==", "jvDJc");
        lIlIlIlIlIIll[lIlIlIlIlIllI[11]] = lIllllllIIIIIlI("BCwILgM3bQIrAXAkFyIAI20FNQI9bQciDCQlQyQFNT4X", "PMcGm");
        lIlIlIlIlIIll[lIlIlIlIlIllI[12]] = lIllllllIIIIIII("AnT7y+lUOeeImvxIh5dFiQ==", "xBOaS");
        lIlIlIlIlIIll[lIlIlIlIlIllI[13]] = lIllllllIIIIIII("8ikKvCY5A8SjW+8ZrWKHNcfL3itrgLPh", "CPjjS");
        lIlIlIlIlIIll[lIlIlIlIlIllI[14]] = lIllllllIIIIIIl("DxuDJnIJyZ7PdcK6W2kXHtmCJTL1WngvmdCUOxxUOFhAb9O4akHEs61WV8CDrJ2U", "PrlYa");
        lIlIlIlIlIIll[lIlIlIlIlIllI[15]] = lIllllllIIIIIII("uQfnAdl5uhE=", "mQpSJ");
        lIlIlIlIlIIll[lIlIlIlIlIllI[16]] = lIllllllIIIIIIl("AOm9GIfZ5DFO1TimsCAD0w==", "hRhaD");
        lIlIlIlIlIIll[lIlIlIlIlIllI[17]] = lIllllllIIIIIII("haQyDVIh/dU=", "NqBea");
        lIlIlIlIlIIll[lIlIlIlIlIllI[18]] = lIllllllIIIIIlI("ChohIRYqAQ==", "IuMMs");
        lIlIlIlIlIIll[lIlIlIlIlIllI[19]] = lIllllllIIIIIIl("jnIvsCdqo04=", "zPQBE");
    }

    private static String lIllllllIIIIIIl(String llllllllllllllIllIlIlIlIIllllIII, String llllllllllllllIllIlIlIlIIlllIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIlllIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIllI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIlIllI[2], llllllllllllllIllIlIlIlIIllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlIIllllIIl) {
            llllllllllllllIllIlIlIlIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIlIlII(int i2) {
        return i2 != 0;
    }

    private static boolean lIllllllIIlIlll(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIllllllIIlIIlI();
        lIllllllIIIIlll();
        w = lIlIlIlIlIllI[20];
        v = lIlIlIlIlIllI[7];
        u = lIlIlIlIlIllI[4];
        t = lIlIlIlIlIllI[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v61, types: [boolean] */
    public boolean run() {
        if (lIllllllIIlIIll(this.x.f() ? 1 : 0)) {
            return lIlIlIlIlIllI[0];
        }
        if (lIllllllIIlIlII(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[0]]);
            return lIlIlIlIlIllI[1];
        } else if (lIllllllIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            this.x.b(lIlIlIlIlIllI[0]);
            return lIlIlIlIlIllI[0];
        } else if (lIllllllIIlIlII(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(lIlIlIlIlIllI[2]);
            "".length();
            return lIlIlIlIlIllI[1];
        } else if (lIllllllIIlIlII(Inventory.isFull() ? 1 : 0)) {
            int[] ids = ((BankLoadout) this.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup().getIds();
            if (lIllllllIIlIlII(Inventory.contains(ids) ? 1 : 0)) {
                Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[1]]);
                Gear.swapTo(ids);
                "".length();
                "".length();
                if (0 != 0) {
                    return ((((2 + 74) - (-52)) + 13) ^ (((74 + 16) - 32) + 92)) & (((((133 + 94) - 151) + 65) ^ (((131 + 133) - 174) + 60)) ^ (-" ".length()));
                }
            } else {
                Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[2]]);
                h();
            }
            return lIlIlIlIlIllI[1];
        } else {
            Widget widget = Widgets.get(lIlIlIlIlIllI[3], lIlIlIlIlIllI[4]);
            if (lIllllllIIlIIll(Widgets.isVisible(widget) ? 1 : 0)) {
                Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[4]]);
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lIlIlIlIlIllI[1]];
                    strArr[lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[18]];
                    if (lIllllllIIlIlII(npc.hasAction(strArr) ? 1 : 0) && lIllllllIIlIlII(npc.getName().equals(lIlIlIlIlIIll[lIlIlIlIlIllI[19]]) ? 1 : 0)) {
                        ?? r0 = lIlIlIlIlIllI[1];
                        "".length();
                        return ("  ".length() ^ (153 ^ 159)) < 0 ? ((((210 + 242) - 447) + 246) ^ (((146 + 130) - 189) + 94)) & (((((126 + 80) - 175) + 187) ^ (((75 + 142) - 88) + 19)) ^ (-" ".length())) : r0;
                    }
                    return lIlIlIlIlIllI[0];
                });
                if (lIllllllIIlIlIl(nearest)) {
                    return lIlIlIlIlIllI[0];
                }
                nearest.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[5]]);
                return lIlIlIlIlIllI[1];
            }
            Widget[] children = widget.getChildren();
            if (!lIllllllIIlIllI(children) || !lIllllllIIlIlII(children.length) || lIllllllIIlIlII(a(children) ? 1 : 0)) {
                Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[6]]);
                this.x.b(lIlIlIlIlIllI[0]);
                return lIlIlIlIlIllI[1];
            }
            Widget widget2 = Widgets.get(lIlIlIlIlIllI[3], lIlIlIlIlIllI[7]);
            if (lIllllllIIlIlII(Widgets.isVisible(widget2) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIlIlIllI[1]];
                strArr[lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[7]];
                if (lIllllllIIlIlII(widget2.hasAction(strArr) ? 1 : 0)) {
                    Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[8]]);
                    widget2.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[9]]);
                    return lIlIlIlIlIllI[1];
                }
            }
            if (lIllllllIIlIlII(Widgets.isVisible(widget2) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIlIlIlIllI[1]];
                strArr2[lIlIlIlIlIllI[0]] = lIlIlIlIlIIll[lIlIlIlIlIllI[10]];
                if (lIllllllIIlIlII(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Log.info(lIlIlIlIlIIll[lIlIlIlIlIllI[11]]);
                    widget2.interact(lIlIlIlIlIIll[lIlIlIlIlIllI[12]]);
                    return lIlIlIlIlIllI[1];
                }
            }
            return lIlIlIlIlIllI[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(Widget[] widgetArr) {
        int length = widgetArr.length;
        int i2 = lIlIlIlIlIllI[0];
        while (lIllllllIIlIlll(i2, length)) {
            if (lIllllllIIlIlII(Widgets.isVisible(widgetArr[i2]) ? 1 : 0)) {
                return lIlIlIlIlIllI[0];
            }
            i2++;
            "".length();
            if (((19 ^ 112) ^ (71 ^ 32)) < 0) {
                return ((((50 + 132) - 166) + 125) ^ (((24 + 113) - 16) + 62)) & (((147 ^ 149) ^ (37 ^ 25)) ^ (-" ".length()));
            }
        }
        return lIlIlIlIlIllI[1];
    }
}
