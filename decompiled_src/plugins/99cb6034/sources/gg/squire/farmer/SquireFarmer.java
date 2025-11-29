package gg.squire.farmer;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.farmer.overlay.StateOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.RuneScapeProfileChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Game;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.A;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.B;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0000a;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0025ay;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0030e;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0031f;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.C0035j;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0040o;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.EnumC0041p;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aA;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aB;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aC;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aD;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aE;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aF;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aH;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aI;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aJ;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aK;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aL;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aM;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aO;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aP;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aQ;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aR;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aT;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aU;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aV;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aW;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.aY;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.ba;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.bb;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.bc;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.bd;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.be;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.bf;
import p000.m.e.a.u.s.r.r.q.i.r.e.f.bg;
@PluginDescriptor(name = "Squire Farmer", description = "Automatically does farm runs", enabledByDefault = false)
@SquireUtil
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:gg/squire/farmer/SquireFarmer.class */
public class SquireFarmer extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus a;
    private /* synthetic */ boolean k = lIlllIlIIIII[0];
    private /* synthetic */ EnumC0040o o;
    @Inject
    private /* synthetic */ C0025ay e;
    @Inject
    private /* synthetic */ StateOverlayPanel g;
    @Inject
    private /* synthetic */ SquireFarmerConfig h;
    @Inject
    private /* synthetic */ C0035j c;
    private static /* synthetic */ String[] lIlllIIlllll;
    @Inject
    private /* synthetic */ Client j;
    @Inject
    private /* synthetic */ ConfigManager i;
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ C0030e f;
    private static /* synthetic */ int[] lIlllIlIIIII;
    private /* synthetic */ WorldPoint l;
    @Inject
    private /* synthetic */ C0031f b;
    private /* synthetic */ boolean m;
    private /* synthetic */ int n;

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlllIlIIIII[2]];
        clsArr[lIlllIlIIIII[1]] = bb.class;
        clsArr[lIlllIlIIIII[0]] = be.class;
        clsArr[lIlllIlIIIII[3]] = bd.class;
        clsArr[lIlllIlIIIII[4]] = ba.class;
        clsArr[lIlllIlIIIII[5]] = aU.class;
        clsArr[lIlllIlIIIII[6]] = aY.class;
        clsArr[lIlllIlIIIII[7]] = aW.class;
        clsArr[lIlllIlIIIII[8]] = bc.class;
        clsArr[lIlllIlIIIII[9]] = aT.class;
        clsArr[lIlllIlIIIII[10]] = aV.class;
        clsArr[lIlllIlIIIII[11]] = aO.class;
        clsArr[lIlllIlIIIII[12]] = aL.class;
        clsArr[lIlllIlIIIII[13]] = aM.class;
        clsArr[lIlllIlIIIII[14]] = aP.class;
        clsArr[lIlllIlIIIII[15]] = aQ.class;
        clsArr[lIlllIlIIIII[16]] = aR.class;
        clsArr[lIlllIlIIIII[17]] = bf.class;
        clsArr[lIlllIlIIIII[18]] = bg.class;
        clsArr[lIlllIlIIIII[19]] = aD.class;
        clsArr[lIlllIlIIIII[20]] = aC.class;
        clsArr[lIlllIlIIIII[21]] = aH.class;
        clsArr[lIlllIlIIIII[22]] = aJ.class;
        clsArr[lIlllIlIIIII[23]] = aK.class;
        clsArr[lIlllIlIIIII[24]] = aI.class;
        clsArr[lIlllIlIIIII[25]] = aE.class;
        clsArr[lIlllIlIIIII[26]] = aF.class;
        clsArr[lIlllIlIIIII[27]] = aA.class;
        clsArr[lIlllIlIIIII[28]] = aB.class;
        return clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    protected void onStop() {
        this.a.unregister(this.b);
        this.a.unregister(this.e);
        this.a.unregister(this.f);
        this.a.unregister(this.c);
        this.d.remove(this.g);
        "".length();
        this.d.remove(this.e);
        "".length();
        this.l = null;
        this.m = lIlllIlIIIII[1];
        this.b.b(this.a);
    }

    public boolean d() {
        return this.k;
    }

    private static boolean lllIllIIIIIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIllIIIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean c() {
        EnumC0040o[] values = EnumC0040o.values();
        int length = values.length;
        int lllllllllllllllIlIllIllIIllIlIII = lIlllIlIIIII[1];
        while (lllIllIIIIlIII(lllllllllllllllIlIllIllIIllIlIII, length)) {
            EnumC0040o enumC0040o = values[lllllllllllllllIlIllIllIIllIlIII];
            if (lllIllIIIIIllI(c(enumC0040o) ? 1 : 0)) {
                "".length();
                if (" ".length() == 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lllIllIIIIIllI(a(enumC0040o) ? 1 : 0)) {
                return lIlllIlIIIII[0];
            }
            lllllllllllllllIlIllIllIIllIlIII++;
            "".length();
            if (((((72 + 147) - 158) + 130) ^ (((79 + 134) - 167) + 141)) <= " ".length()) {
                return ((((61 + 16) - 53) + 136) ^ (((76 + 95) - 82) + 79)) & (((131 ^ 152) ^ (81 ^ 66)) ^ (-" ".length()));
            }
        }
        return lIlllIlIIIII[1];
    }

    private static boolean lllIllIIIIIllI(int i) {
        return i != 0;
    }

    public EnumC0040o a() {
        if (lllIllIIIIIlII(this.o)) {
            if (lllIllIIIIIllI(b(this.o) ? 1 : 0)) {
                this.o = null;
            }
            return this.o;
        }
        EnumC0040o b = b();
        this.o = b;
        return b;
    }

    public void a(boolean z) {
        this.k = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean c(EnumC0040o enumC0040o) {
        switch (C0000a.p[enumC0040o.ordinal()]) {
            case 2:
                if (lllIllIIIIIlIl(this.h.birdhouses_enabled() ? 1 : 0)) {
                    ?? r0 = lIlllIlIIIII[0];
                    "".length();
                    return 0 != 0 ? ((191 ^ 131) ^ (89 ^ 97)) & (((95 ^ 8) ^ (82 ^ 1)) ^ (-" ".length())) : r0;
                }
                return lIlllIlIIIII[1];
            case 1:
                EnumC0041p[] values = EnumC0041p.values();
                int length = values.length;
                int i = lIlllIlIIIII[1];
                while (lllIllIIIIlIII(i, length)) {
                    if (lllIllIIIIIllI(((Boolean) this.i.getConfiguration(lIlllIIlllll[lIlllIlIIIII[4]], values[i].name().toLowerCase() + ".enabled", Boolean.TYPE)).booleanValue() ? 1 : 0)) {
                        return lIlllIlIIIII[1];
                    }
                    i++;
                    "".length();
                    if ((-" ".length()) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                "".length();
                if (("   ".length() & ("   ".length() ^ (-" ".length()))) < 0) {
                    return ((32 ^ 50) ^ (205 ^ 147)) & (((114 ^ 94) ^ (35 ^ 67)) ^ (-" ".length()));
                }
                break;
        }
        return lIlllIlIIIII[0];
    }

    private static String lllIlIllllllll(String lllllllllllllllIlIllIllIIlIIIlll, String lllllllllllllllIlIllIllIIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIlllIlIIIII[9]), "DES");
            Cipher lllllllllllllllIlIllIllIIlIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllIIlIIlIIl.init(lIlllIlIIIII[3], lllllllllllllllIlIllIllIIlIIlIlI);
            return new String(lllllllllllllllIlIllIllIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIllIIlIIlIII) {
            lllllllllllllllIlIllIllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetClosed widgetClosed) {
        if (lllIllIIIIIlll(widgetClosed.getModalMode(), lIlllIlIIIII[0])) {
            this.n = this.j.getTickCount();
        }
    }

    private static void lllIllIIIIIIIl() {
        lIlllIIlllll = new String[lIlllIlIIIII[5]];
        lIlllIIlllll[lIlllIlIIIII[1]] = lllIlIllllllll("TSfNJrPr8Daey7x8kxoFJA==", "ROuWf");
        lIlllIIlllll[lIlllIlIIIII[0]] = lllIlIllllllll("ig75Wj5gKPo=", "jQKDS");
        lIlllIIlllll[lIlllIlIIIII[3]] = lllIllIIIIIIII("EBo5KzQ/", "SrPXQ");
        lIlllIIlllll[lIlllIlIIIII[4]] = lllIlIllllllll("XuvAmMs99xTf27x0WWvF9A==", "TTTvo");
    }

    private static boolean lllIllIIIIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lllIllIIIIIIlI();
        lllIllIIIIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private EnumC0040o b() {
        EnumC0040o[] values = EnumC0040o.values();
        int length = values.length;
        int i = lIlllIlIIIII[1];
        while (lllIllIIIIlIII(i, length)) {
            EnumC0040o enumC0040o = values[i];
            if (lllIllIIIIIlIl(b(enumC0040o) ? 1 : 0)) {
                if (!lllIllIIIIIllI(c(enumC0040o) ? 1 : 0)) {
                    return enumC0040o;
                }
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
            i++;
            "".length();
            if ("   ".length() <= ((9 ^ 35) & ((88 ^ 114) ^ (-1)))) {
                return null;
            }
        }
        a((boolean) lIlllIlIIIII[0]);
        return null;
    }

    private static String lllIllIIIIIIII(String lllllllllllllllIlIllIllIIIllIlll, String lllllllllllllllIlIllIllIIIllIllI) {
        String lllllllllllllllIlIllIllIIIllIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllIIIllIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIllIIIllIllI.toCharArray();
        int lllllllllllllllIlIllIllIIIllIIll = lIlllIlIIIII[1];
        char[] charArray2 = lllllllllllllllIlIllIllIIIllIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIlIIIII[1];
        while (lllIllIIIIlIII(i, length)) {
            char lllllllllllllllIlIllIllIIIlIlIlI = charArray2[i];
            lllllllllllllllIlIllIllIIIllIlIl.append((char) (lllllllllllllllIlIllIllIIIlIlIlI ^ charArray[lllllllllllllllIlIllIllIIIllIIll % charArray.length]));
            "".length();
            lllllllllllllllIlIllIllIIIllIIll++;
            i++;
            "".length();
            if ("   ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIllIIIllIlIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a(EnumC0040o enumC0040o) {
        if (lllIllIIIIlIIl(enumC0040o)) {
            return lIlllIlIIIII[1];
        }
        switch (C0000a.p[enumC0040o.ordinal()]) {
            case 1:
                if (lllIllIIIIlIlI(this.b.a(A.HERB), B.COMPLETED)) {
                    ?? r0 = lIlllIlIIIII[0];
                    "".length();
                    return ((69 ^ 16) & ((193 ^ 148) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlIIIII[1];
            case 2:
                this.c.P();
                "".length();
                if (lllIllIIIIlIlI(this.c.p(), B.COMPLETED)) {
                    ?? r02 = lIlllIlIIIII[0];
                    "".length();
                    return ((185 ^ 175) & ((61 ^ 43) ^ (-1))) >= (99 ^ 103) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
                return lIlllIlIIIII[1];
            default:
                return lIlllIlIIIII[1];
        }
    }

    private static boolean lllIllIIIIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
        if (lllIllIIIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(EnumC0040o enumC0040o) {
        switch (C0000a.p[enumC0040o.ordinal()]) {
            case 1:
                if (lllIllIIIIlIIl(this.b.x())) {
                    ?? r0 = lIlllIlIIIII[0];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlIIIII[1];
            case 2:
                if (lllIllIIIIlIIl(this.c.O())) {
                    if (lllIllIIIIIIll(Game.getState(), GameState.LOGIN_SCREEN)) {
                        String[] strArr = new String[lIlllIlIIIII[4]];
                        strArr[lIlllIlIIIII[1]] = lIlllIIlllll[lIlllIlIIIII[1]];
                        strArr[lIlllIlIIIII[0]] = lIlllIIlllll[lIlllIlIIIII[0]];
                        strArr[lIlllIlIIIII[3]] = lIlllIIlllll[lIlllIlIIIII[3]];
                        break;
                    }
                    ?? r02 = lIlllIlIIIII[0];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((102 ^ 116) ^ "   ".length()) & (((132 ^ 174) ^ (5 ^ 62)) ^ (-" ".length())) : r02;
                }
                return lIlllIlIIIII[1];
            default:
                return lIlllIlIIIII[0];
        }
    }

    private static void lllIllIIIIIIlI() {
        lIlllIlIIIII = new int[29];
        lIlllIlIIIII[0] = " ".length();
        lIlllIlIIIII[1] = (246 ^ 161) & ((225 ^ 182) ^ (-1));
        lIlllIlIIIII[2] = (153 ^ 185) ^ (148 ^ 168);
        lIlllIlIIIII[3] = "  ".length();
        lIlllIlIIIII[4] = "   ".length();
        lIlllIlIIIII[5] = 92 ^ 88;
        lIlllIlIIIII[6] = (167 ^ 198) ^ (194 ^ 166);
        lIlllIlIIIII[7] = (((113 + 144) - 141) + 47) ^ (((48 + 10) - 11) + 118);
        lIlllIlIIIII[8] = 145 ^ 150;
        lIlllIlIIIII[9] = (((97 + 115) - 139) + 93) ^ (((27 + 57) - (-82)) + 8);
        lIlllIlIIIII[10] = 201 ^ 192;
        lIlllIlIIIII[11] = (176 ^ 143) ^ (88 ^ 109);
        lIlllIlIIIII[12] = (((43 + 50) - 12) + 57) ^ (((103 + 1) - 45) + 70);
        lIlllIlIIIII[13] = (((10 + 117) - (-23)) + 26) ^ (((157 + 109) - 264) + 186);
        lIlllIlIIIII[14] = 129 ^ 140;
        lIlllIlIIIII[15] = 28 ^ 18;
        lIlllIlIIIII[16] = 166 ^ 169;
        lIlllIlIIIII[17] = 31 ^ 15;
        lIlllIlIIIII[18] = (75 ^ 28) ^ (36 ^ 98);
        lIlllIlIIIII[19] = 134 ^ 148;
        lIlllIlIIIII[20] = 181 ^ 166;
        lIlllIlIIIII[21] = 191 ^ 171;
        lIlllIlIIIII[22] = (((118 + 66) - 114) + 86) ^ (((3 + 81) - (-6)) + 47);
        lIlllIlIIIII[23] = (((2 + 171) - 32) + 34) ^ (((36 + 128) - 118) + 139);
        lIlllIlIIIII[24] = (((105 + 12) - (-23)) + 2) ^ (((66 + 20) - 38) + 105);
        lIlllIlIIIII[25] = 177 ^ 169;
        lIlllIlIIIII[26] = 60 ^ 37;
        lIlllIlIIIII[27] = 19 ^ 9;
        lIlllIlIIIII[28] = 93 ^ 70;
    }

    private static boolean lllIllIIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lllIllIIIIlIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lllIllIIIIIIll(this.j.getGameState(), GameState.LOGGED_IN)) {
            this.l = null;
            return;
        }
        Widget widget = this.j.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);
        if (lllIllIIIIIlII(widget) && lllIllIIIIIlIl(widget.isHidden() ? 1 : 0)) {
            this.m = lIlllIlIIIII[0];
        } else if (lllIllIIIIIllI(this.m ? 1 : 0)) {
            this.m = lIlllIlIIIII[1];
        } else {
            WorldPoint worldPoint = this.l;
            this.l = this.j.getLocalPlayer().getWorldLocation();
            if (!lllIllIIIIIlII(worldPoint) || lllIllIIIIIlll(worldPoint.getRegionID(), this.l.getRegionID())) {
                return;
            }
            boolean a = this.c.a(worldPoint);
            boolean a2 = this.b.a(worldPoint, this.j.getTickCount() - this.n);
            boolean a3 = this.f.a(worldPoint);
            if (!lllIllIIIIIlIl(a ? 1 : 0) || !lllIllIIIIIlIl(a2 ? 1 : 0) || lllIllIIIIIllI(a3 ? 1 : 0)) {
            }
        }
    }

    private static boolean lllIllIIIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    protected void onStart() {
        this.c.M();
        this.a.register(this.b);
        this.a.register(this.e);
        this.a.register(this.c);
        this.b.a(this.a);
        this.d.add(this.e);
        "".length();
        this.d.add(this.g);
        "".length();
        this.b.D();
        this.k = lIlllIlIIIII[0];
    }

    @Subscribe
    public void a(RuneScapeProfileChanged runeScapeProfileChanged) {
        this.b.D();
        this.c.M();
        this.f.l();
    }

    @Provides
    SquireFarmerConfig a(ConfigManager configManager) {
        return (SquireFarmerConfig) configManager.getConfig(SquireFarmerConfig.class);
    }
}
