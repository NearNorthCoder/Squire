/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.PluginManager
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.questing;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.questing.SquireQuestHelperConfig;
import gg.squire.basics.questing.overlay.QuestInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bh;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bi;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bj;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bk;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bl;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bm;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bn;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bp;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bq;
import i.i.b.s.c.q.r.s.s.-.u.a.e.br;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bs;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bt;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bu;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bv;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Quest QOL", enabledByDefault=false)
@SquireUtil
public class SquireQuestHelper
extends SquirePlugin {
    @Inject
    public /* synthetic */ SquireQuestHelperConfig fA;
    @Inject
    private /* synthetic */ OverlayManager bq;
    @Inject
    private /* synthetic */ PluginManager fC;
    private final /* synthetic */ KeyListener fB;
    @Inject
    private /* synthetic */ KeyManager bY;
    public /* synthetic */ boolean fu;
    @Inject
    private /* synthetic */ QuestInfoBox fD;
    @Inject
    private /* synthetic */ EventBus K;
    private static /* synthetic */ int[] llIIlIIl;
    private static /* synthetic */ String[] llIIIllI;

    private static void lIllIIlIll() {
        llIIlIIl = new int[39];
        SquireQuestHelper.llIIlIIl[0] = " ".length();
        SquireQuestHelper.llIIlIIl[1] = (0x1E ^ 0x33) & ~(0xA ^ 0x27);
        SquireQuestHelper.llIIlIIl[2] = 0x8D ^ 0x80;
        SquireQuestHelper.llIIlIIl[3] = "  ".length();
        SquireQuestHelper.llIIlIIl[4] = "   ".length();
        SquireQuestHelper.llIIlIIl[5] = 0xB8 ^ 0xBC;
        SquireQuestHelper.llIIlIIl[6] = 42 + 9 - -81 + 24 ^ 26 + 97 - 1 + 31;
        SquireQuestHelper.llIIlIIl[7] = 0xF4 ^ 0x87 ^ (0xD9 ^ 0xAC);
        SquireQuestHelper.llIIlIIl[8] = 105 + 14 - 114 + 129 ^ 124 + 91 - 206 + 120;
        SquireQuestHelper.llIIlIIl[9] = 91 + 47 - -5 + 10 ^ 17 + 38 - -16 + 74;
        SquireQuestHelper.llIIlIIl[10] = 40 + 6 - 10 + 132 ^ 23 + 52 - -49 + 37;
        SquireQuestHelper.llIIlIIl[11] = 0xAE ^ 0xB8 ^ (0x3F ^ 0x23);
        SquireQuestHelper.llIIlIIl[12] = 0x59 ^ 0x28 ^ (0x7A ^ 0);
        SquireQuestHelper.llIIlIIl[13] = 0x79 ^ 0x75;
        SquireQuestHelper.llIIlIIl[14] = 0x40 ^ 0x4E;
        SquireQuestHelper.llIIlIIl[15] = 0x3C ^ 0x33;
        SquireQuestHelper.llIIlIIl[16] = 128 + 66 - 84 + 44 ^ 65 + 38 - -29 + 6;
        SquireQuestHelper.llIIlIIl[17] = 0x18 ^ 9;
        SquireQuestHelper.llIIlIIl[18] = 6 ^ 0x14;
        SquireQuestHelper.llIIlIIl[19] = 0x82 ^ 0x91;
        SquireQuestHelper.llIIlIIl[20] = 0x13 ^ 0x6F ^ (0x7D ^ 0x15);
        SquireQuestHelper.llIIlIIl[21] = 0x58 ^ 0x4D;
        SquireQuestHelper.llIIlIIl[22] = -" ".length();
        SquireQuestHelper.llIIlIIl[23] = 17 + 47 - -28 + 45 ^ 140 + 144 - 267 + 142;
        SquireQuestHelper.llIIlIIl[24] = 0xB7 ^ 0x88 ^ (0xB3 ^ 0x9B);
        SquireQuestHelper.llIIlIIl[25] = 0x49 ^ 0x1B ^ (3 ^ 0x49);
        SquireQuestHelper.llIIlIIl[26] = 0x71 ^ 0x6E ^ (0x62 ^ 0x64);
        SquireQuestHelper.llIIlIIl[27] = 0x24 ^ 0x3E;
        SquireQuestHelper.llIIlIIl[28] = 0xD ^ 0x21 ^ (0x60 ^ 0x57);
        SquireQuestHelper.llIIlIIl[29] = "   ".length() ^ (0xB5 ^ 0xAA);
        SquireQuestHelper.llIIlIIl[30] = "   ".length() ^ (0xD8 ^ 0xC6);
        SquireQuestHelper.llIIlIIl[31] = 0x6C ^ 0x24 ^ (0x95 ^ 0xC3);
        SquireQuestHelper.llIIlIIl[32] = 0x67 ^ 0x78;
        SquireQuestHelper.llIIlIIl[33] = 48 + 67 - -9 + 60 ^ 120 + 61 - 57 + 28;
        SquireQuestHelper.llIIlIIl[34] = 0xA3 ^ 0x82;
        SquireQuestHelper.llIIlIIl[35] = 5 + 127 - 72 + 86 ^ 18 + 15 - -27 + 116;
        SquireQuestHelper.llIIlIIl[36] = 0x34 ^ 0x50;
        SquireQuestHelper.llIIlIIl[37] = 0x6F ^ 0x4C;
        SquireQuestHelper.llIIlIIl[38] = 0x43 ^ 0x75 ^ (0x4C ^ 0x5E);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIIlIIl[1]);
        this.bq.remove((Overlay)this.fD);
        "".length();
        this.K.unregister((Object)this.fD);
        this.bY.unregisterKeyListener(this.fB);
        this.fu = llIIlIIl[1];
    }

    public List<Integer> cF() {
        return this.cG().stream().filter(llIllIIIIlIllII -> {
            try {
                Field llIllIIIIlIlIll = llIllIIIIlIllII.getClass().getDeclaredField(llIIIllI[llIIlIIl[34]]);
                llIllIIIIlIlIll.setAccessible(llIIlIIl[0]);
                return (Boolean)llIllIIIIlIlIll.get(llIllIIIIlIllII);
            }
            catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    private static boolean lIllIIllll(Object object) {
        return object != null;
    }

    static {
        SquireQuestHelper.lIllIIlIll();
        SquireQuestHelper.lIllIIIIII();
    }

    public NPC cK() {
        Object llIllIIIlIlIlIl = this.cy();
        try {
            Field llIllIIIlIlIlII = llIllIIIlIlIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[25]]);
            llIllIIIlIlIlII.setAccessible(llIIlIIl[0]);
            int llIllIIIlIlIIll = llIllIIIlIlIlII.getInt(llIllIIIlIlIlIl);
            Field llIllIIIlIlIIlI = llIllIIIlIlIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[26]]);
            llIllIIIlIlIIlI.setAccessible(llIIlIIl[0]);
            List llIllIIIlIlIIIl = (List)llIllIIIlIlIIlI.get(llIllIIIlIlIlIl);
            if (SquireQuestHelper.lIllIIllIl(llIllIIIlIlIIIl.isEmpty() ? 1 : 0)) {
                return NPCs.getNearest(nPC -> {
                    boolean bl2;
                    if (!SquireQuestHelper.lIllIlIlIl(nPC.getId(), llIllIIIlIlIIll) || SquireQuestHelper.lIllIlIlll(nPC.getTransformedId(), llIllIIIlIlIIll)) {
                        bl2 = llIIlIIl[0];
                        "".length();
                        if (-" ".length() > "  ".length()) {
                            return ((0x24 ^ 3) & ~(0x41 ^ 0x66)) != 0;
                        }
                    } else {
                        bl2 = llIIlIIl[1];
                    }
                    return bl2;
                });
            }
            return NPCs.getNearest(nPC -> {
                int n3;
                if (!SquireQuestHelper.lIllIlIlIl(nPC.getId(), llIllIIIlIlIIll) || !SquireQuestHelper.lIllIlIIII(llIllIIIlIlIIIl.contains(nPC.getId()) ? 1 : 0) || SquireQuestHelper.lIllIlIlll(nPC.getTransformedId(), llIllIIIlIlIIll)) {
                    n3 = llIIlIIl[0];
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return ((0x30 ^ 0x16) & ~(0x74 ^ 0x52)) != 0;
                    }
                } else {
                    n3 = llIIlIIl[1];
                }
                return n3 != 0;
            });
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllI(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(String string, String string2) {
        return string2.toLowerCase().contains(string.toLowerCase());
    }

    private static boolean lIllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    public int cJ() {
        return this.A(llIIlIIl[1]);
    }

    @Provides
    SquireQuestHelperConfig t(ConfigManager configManager) {
        return (SquireQuestHelperConfig)configManager.getConfig(SquireQuestHelperConfig.class);
    }

    private static void lIllIIIIII() {
        llIIIllI = new String[llIIlIIl[38]];
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[1]] = SquireQuestHelper.lIlIllIllI("YWbCS1LkIm89j3K24O9O2g==", "drdCs");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[0]] = SquireQuestHelper.lIlIllIllI("WYe+pzI8YslrzZc1yr5Gfg==", "lfufF");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[3]] = SquireQuestHelper.lIlIllIlll("hNmtNOl4PjhIF43gfdCa1PTPgYKgv7boDkizrW3crfXKgmeYCqBu/eqpwnhSu/vW5dUw4kBxyyo0rBv+VFmINg==", "JSpHN");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[4]] = SquireQuestHelper.lIlIllIlll("+Ttb+RzhEocFwjSse387cw==", "bEMRW");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[5]] = SquireQuestHelper.lIlIllIlll("OocRPGWmCME=", "EqEIy");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[6]] = SquireQuestHelper.lIlIllIllI("+P0YmHnDXFHuvbPmdl59sQ==", "KisnG");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[7]] = SquireQuestHelper.lIlIlllIII("CCMEMikDIxMVKQsXBQQ/Gw==", "oFpaL");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[8]] = SquireQuestHelper.lIlIllIlll("TRxKCYoKA0mcvpN6A17L+w==", "XhBvx");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[9]] = SquireQuestHelper.lIlIllIlll("VP9yZj22jszCqWEGj8ir5g==", "xkfwS");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[10]] = SquireQuestHelper.lIlIllIlll("5tbnNYq1ieBqkpDZFjUhgw==", "vIdzH");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[11]] = SquireQuestHelper.lIlIllIlll("UVLW2G1hB2e8K2Y8MHsoFg==", "PMHEI");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[12]] = SquireQuestHelper.lIlIlllIII("CRwWNQkaEBQRORocEg==", "nybtj");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[13]] = SquireQuestHelper.lIlIllIllI("pv1hosjybRA=", "Exvat");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[2]] = SquireQuestHelper.lIlIllIlll("oAC2u1wVfFw=", "bdxTb");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[14]] = SquireQuestHelper.lIlIllIllI("pkmn9BukhbCOpT5F9Vij3A==", "ZYKkd");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[15]] = SquireQuestHelper.lIlIllIlll("4nzFvztxhhIKuqSi1cEoNGn5+MPFjuIsmJrpifo9hqE=", "fKkHq");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[16]] = SquireQuestHelper.lIlIlllIII("KDwYHiAFdBlSNAonBVIzAicFUjMOMUFSMBkqBBwjSycCUisbNgNSIAQ8HwFlSg==", "kSmrD");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[17]] = SquireQuestHelper.lIlIllIllI("vkRLlz8tzZ8=", "QVguw");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[18]] = SquireQuestHelper.lIlIllIllI("eAg5OY+2okObEIAjp12HoA==", "uNnXI");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[19]] = SquireQuestHelper.lIlIlllIII("BTgYNjQ/NhoKPxs5Hg==", "rWjZP");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[20]] = SquireQuestHelper.lIlIlllIII("DB0WPw==", "xxnKJ");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[21]] = SquireQuestHelper.lIlIllIllI("iNzT5VaJZe1vdisa0IgHpA==", "fRROI");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[23]] = SquireQuestHelper.lIlIllIllI("5FBooz9rPSSIWok0+/GOvw==", "XWjSQ");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[24]] = SquireQuestHelper.lIlIllIlll("0oGSt+W8R0g=", "lAlty");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[25]] = SquireQuestHelper.lIlIllIlll("Fg51Z/J/o7k=", "lNiTm");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[26]] = SquireQuestHelper.lIlIllIllI("3jM1uRG9cdWFumKYFbsIvQ==", "CDKlK");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[27]] = SquireQuestHelper.lIlIllIllI("1HNzfUC5317fQEOn5FuMElDWDE8axp4nRtgZbTjngFA=", "uSfpt");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[28]] = SquireQuestHelper.lIlIlllIII("Lx00CC0=", "LuQkF");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[29]] = SquireQuestHelper.lIlIllIllI("q+dVSzrz1hBj3ir179ZHUg==", "ITwAK");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[30]] = SquireQuestHelper.lIlIllIlll("Fm41Z1VIdde9Pfghda2+JCP+HF49CkU/", "JpGgi");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[31]] = SquireQuestHelper.lIlIllIllI("iDxiWs7cYW1gJWX5zxrLZoBvIKswl7BU", "iutEw");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[32]] = SquireQuestHelper.lIlIlllIII("CCQtKjoEIT0uGgQ9LSkcEg==", "aPHGh");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[33]] = SquireQuestHelper.lIlIllIlll("x9HcELDP8fZhjyyy/GDBdg==", "FekGV");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[34]] = SquireQuestHelper.lIlIlllIII("ExM+ICc=", "vbKIW");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[35]] = SquireQuestHelper.lIlIllIllI("VOuxHcsz98U=", "Fgtzt");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[37]] = SquireQuestHelper.lIlIllIllI("AQWC10YFjl/tQGHbt8S3/kOEsut+wv9a", "ANqAy");
    }

    private static boolean lIllIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static Stream<Integer> b(Object llIllIIllIIIIII) {
        try {
            Method llIllIIlIllllll = llIllIIllIIIIII.getClass().getMethod(llIIIllI[llIIlIIl[1]], new Class[llIIlIIl[1]]);
            llIllIIlIllllll.setAccessible(llIIlIIl[0]);
            return ((List)llIllIIlIllllll.invoke(llIllIIllIIIIII, new Object[llIIlIIl[1]])).stream();
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return Stream.empty();
        }
    }

    public List<Object> cE() {
        try {
            SquireQuestHelper llIllIIIllIllll;
            Object llIllIIIllIlllI = llIllIIIllIllll.cy();
            Method llIllIIIllIllIl = llIllIIIllIlllI.getClass().getMethod(llIIIllI[llIIlIIl[21]], new Class[llIIlIIl[1]]);
            llIllIIIllIllIl.setAccessible(llIIlIIl[0]);
            return (List)llIllIIIllIllIl.invoke(llIllIIIllIlllI, new Object[llIIlIIl[1]]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(String ... stringArray) {
        void llIllIIIlIIIlll;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        int llIllIIIlIIIllI = llIIlIIl[1];
        while (SquireQuestHelper.lIllIlIIlI(llIllIIIlIIIllI, (int)llIllIIIlIIIlll)) {
            SquireQuestHelper llIllIIIlIIlIlI;
            void llIllIIIlIIlIII;
            void llIllIIIlIIIlIl = llIllIIIlIIlIII[llIllIIIlIIIllI];
            if (SquireQuestHelper.lIllIIllIl(llIllIIIlIIlIlI.cD().stream().anyMatch(arg_0 -> SquireQuestHelper.a((String)llIllIIIlIIIlIl, arg_0)) ? 1 : 0)) {
                return llIIlIIl[0];
            }
            ++llIllIIIlIIIllI;
            "".length();
            if ("   ".length() >= 0) continue;
            return ((3 ^ 0x45 ^ (0xC3 ^ 0xAB)) & (0x76 ^ 0x73 ^ (0xAD ^ 0x86) ^ -" ".length())) != 0;
        }
        return llIIlIIl[1];
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIIlIIl[0]);
        this.bq.add((Overlay)this.fD);
        "".length();
        this.K.register((Object)this.fD);
        this.bY.registerKeyListener(this.fB);
        this.fu = llIIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cB() {
        void llIllIIlIIIlIII;
        WorldPoint worldPoint2 = this.cA();
        if (SquireQuestHelper.lIllIIlllI(worldPoint2)) {
            return llIIlIIl[1];
        }
        if (SquireQuestHelper.lIllIIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && SquireQuestHelper.lIllIlIIII(House.isInside() ? 1 : 0)) {
            Collection llIllIIlIIIIlll = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIIIlIII);
            WorldPoint llIllIIlIIIIllI = llIllIIlIIIIlll.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIllI)) {
                SquireQuestHelper llIllIIlIIIlIIl;
                WorldPoint llIllIIlIIIIlIl = llIllIIlIIIlIIl.cC();
                if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIlIl)) {
                    return llIIlIIl[1];
                }
                llIllIIlIIIIllI = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIIIlIIl.cC()).stream().filter(Objects::nonNull).findFirst().orElse(null);
                if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIllI)) {
                    return llIIlIIl[1];
                }
            }
            Movement.walkTo((WorldPoint)llIllIIlIIIIllI, (boolean)llIIlIIl[1]);
            "".length();
            return llIIlIIl[0];
        }
        if (SquireQuestHelper.lIllIIllIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llIllIIlIIIlIII);
            "".length();
        }
        return llIIlIIl[0];
    }

    public TileObject cx() {
        Object llIllIIlIlIlIll = this.cy();
        try {
            SquireQuestHelper llIllIIlIlIllII;
            Field llIllIIlIlIlIlI = llIllIIlIlIlIll.getClass().getDeclaredField(llIIIllI[llIIlIIl[6]]);
            llIllIIlIlIlIlI.setAccessible(llIIlIIl[0]);
            int llIllIIlIlIlIIl = llIllIIlIlIlIlI.getInt(llIllIIlIlIlIll);
            WorldPoint llIllIIlIlIlIII = llIllIIlIlIllII.cA();
            Collection llIllIIlIlIIlll = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIlIlIII);
            return TileObjects.getAll(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.lIllIlIlll(tileObject.getId(), llIllIIlIlIlIIl)) {
                    bl2 = llIIlIIl[0];
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0x51 ^ 0x64) & ~(0x23 ^ 0x16)) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }).stream().filter(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.lIllIlIIIl(llIllIIlIlIIlll.stream().map(worldPoint -> worldPoint.distanceTo2D(tileObject.getWorldLocation())).min(Comparator.comparingInt(n2 -> n2)).orElse(llIIlIIl[36]), llIIlIIl[6])) {
                    bl2 = llIIlIIl[0];
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return ((0x54 ^ 0x6C ^ (0x4C ^ 0x64)) & (0x1F ^ 0x4A ^ (0x1D ^ 0x58) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }).findFirst().orElse(null);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    public List<Integer> cH() {
        return this.cE().stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[29]])).filter(llIllIIIIllIlII -> {
            try {
                boolean bl2;
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method llIllIIIIllIIll = llIllIIIIllIlII.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[28]], classArray);
                llIllIIIIllIIll.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                if (SquireQuestHelper.lIllIlIIII(((Boolean)llIllIIIIllIIll.invoke(llIllIIIIllIlII, objectArray)).booleanValue() ? 1 : 0)) {
                    bl2 = llIIlIIl[0];
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0x50 ^ 0x70) & ~(0x19 ^ 0x39)) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    /*
     * WARNING - void declaration
     */
    public String cz() {
        void var1_1;
        SquireQuestHelper llIllIIlIIlIllI;
        if (SquireQuestHelper.lIllIlIIII(this.fu ? 1 : 0)) {
            return llIIIllI[llIIlIIl[13]];
        }
        Object llIllIIlIIlIlIl = llIllIIlIIlIllI.cy();
        if (SquireQuestHelper.lIllIIlllI(llIllIIlIIlIlIl)) {
            return llIIIllI[llIIlIIl[2]];
        }
        return var1_1.getClass().getSimpleName();
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(TileObject tileObject) {
        TileObject llIllIIIlllllll;
        void llIllIIlIIIIIIl;
        if (SquireQuestHelper.lIllIIllIl(Movement.walkTo((Locatable)tileObject) ? 1 : 0)) {
            Log.info((String)llIIIllI[llIIlIIl[15]]);
            return llIIlIIl[0];
        }
        Log.info((String)llIIIllI[llIIlIIl[16]]);
        WorldPoint llIllIIlIIIIIII = Players.getLocal().getWorldLocation();
        if (SquireQuestHelper.lIllIlIIIl(llIllIIlIIIIIII.distanceTo2D(llIllIIlIIIIIIl.getWorldLocation()), llIIlIIl[3]) && SquireQuestHelper.lIllIIllll(llIllIIIlllllll = TileObjects.getNearest((WorldPoint)llIllIIlIIIIIIl.getWorldLocation(), arg_0 -> SquireQuestHelper.a((TileObject)llIllIIlIIIIIIl, arg_0)))) {
            llIllIIIlllllll.interact(llIIIllI[llIIlIIl[17]]);
            Log.info((String)llIIIllI[llIIlIIl[18]]);
            return llIIlIIl[0];
        }
        return llIIlIIl[1];
    }

    public Object cy() {
        Plugin llIllIIlIIllllI = this.cv();
        try {
            Method llIllIIlIIlllIl = llIllIIlIIllllI.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[7]], new Class[llIIlIIl[1]]);
            Object llIllIIlIIlllII = llIllIIlIIlllIl.invoke((Object)llIllIIlIIllllI, new Object[llIIlIIl[1]]);
            Method llIllIIlIIllIll = llIllIIlIIlllII.getClass().getMethod(llIIIllI[llIIlIIl[8]], new Class[llIIlIIl[1]]);
            Object llIllIIlIIllIlI = llIllIIlIIllIll.invoke(llIllIIlIIlllII, new Object[llIIlIIl[1]]);
            if (SquireQuestHelper.lIllIIllll(llIllIIlIIllIlI) && SquireQuestHelper.lIllIIllIl(llIllIIlIIllIlI.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[9]]) ? 1 : 0)) {
                Method llIllIIlIIllIIl = llIllIIlIIllIlI.getClass().getSuperclass().getMethod(llIIIllI[llIIlIIl[10]], new Class[llIIlIIl[1]]);
                return llIllIIlIIllIIl.invoke(llIllIIlIIllIlI, new Object[llIIlIIl[1]]);
            }
            if (SquireQuestHelper.lIllIIllll(llIllIIlIIllIlI) && SquireQuestHelper.lIllIIllIl(llIllIIlIIllIlI.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[11]]) ? 1 : 0)) {
                Method llIllIIlIIllIIl = llIllIIlIIllIlI.getClass().getMethod(llIIIllI[llIIlIIl[12]], new Class[llIIlIIl[1]]);
                return llIllIIlIIllIIl.invoke(llIllIIlIIllIlI, new Object[llIIlIIl[1]]);
            }
            return llIllIIlIIllIlI;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    private static boolean lIllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean a(TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (SquireQuestHelper.lIllIllIlI(tileObject2, tileObject)) {
            String[] stringArray = new String[llIIlIIl[0]];
            stringArray[SquireQuestHelper.llIIlIIl[1]] = llIIIllI[llIIlIIl[35]];
            if (SquireQuestHelper.lIllIIllIl(tileObject2.hasAction(stringArray) ? 1 : 0)) {
                n2 = llIIlIIl[0];
                "".length();
                if (((0xF0 ^ 0xC1 ^ (0x54 ^ 0x72)) & (40 + 71 - 67 + 137 ^ 48 + 149 - 92 + 57 ^ -" ".length())) >= 0) return n2 != 0;
                return ((0xF1 ^ 0xA7 ^ (0x5D ^ 0x43)) & (102 + 57 - 106 + 90 ^ 17 + 95 - -18 + 69 ^ -" ".length())) != 0;
            }
        }
        n2 = llIIlIIl[1];
        return n2 != 0;
    }

    private static boolean lIllIIllIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIllIlll(String llIllIIIIIIlIlI, String llIllIIIIIIlIIl) {
        try {
            SecretKeySpec llIllIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIIIIIIllII = Cipher.getInstance("Blowfish");
            llIllIIIIIIllII.init(llIIlIIl[3], llIllIIIIIIllIl);
            return new String(llIllIIIIIIllII.doFinal(Base64.getDecoder().decode(llIllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIIIIIlIll) {
            llIllIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    public Object cw() {
        Plugin llIllIIlIllIlIl = this.cv();
        try {
            String string;
            Field llIllIIlIllIlII = llIllIIlIllIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[4]]);
            llIllIIlIllIlII.setAccessible(llIIlIIl[0]);
            Object llIllIIlIllIIll = llIllIIlIllIlII.get(llIllIIlIllIlIl);
            if (SquireQuestHelper.lIllIIlllI(llIllIIlIllIIll)) {
                string = llIIIllI[llIIlIIl[5]];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return null;
                }
            } else {
                string = llIllIIlIllIIll.getClass().getSimpleName();
            }
            return string;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIIl[2]];
        classArray[SquireQuestHelper.llIIlIIl[1]] = bq.class;
        classArray[SquireQuestHelper.llIIlIIl[0]] = br.class;
        classArray[SquireQuestHelper.llIIlIIl[3]] = bt.class;
        classArray[SquireQuestHelper.llIIlIIl[4]] = bn.class;
        classArray[SquireQuestHelper.llIIlIIl[5]] = bk.class;
        classArray[SquireQuestHelper.llIIlIIl[6]] = bv.class;
        classArray[SquireQuestHelper.llIIlIIl[7]] = bu.class;
        classArray[SquireQuestHelper.llIIlIIl[8]] = bm.class;
        classArray[SquireQuestHelper.llIIlIIl[9]] = bi.class;
        classArray[SquireQuestHelper.llIIlIIl[10]] = bj.class;
        classArray[SquireQuestHelper.llIIlIIl[11]] = bs.class;
        classArray[SquireQuestHelper.llIIlIIl[12]] = bl.class;
        classArray[SquireQuestHelper.llIIlIIl[13]] = bp.class;
        return classArray;
    }

    private static boolean lIllIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIllIllI(String llIllIIIIIlIlIl, String llIllIIIIIlIllI) {
        try {
            SecretKeySpec llIllIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIlIIl[9]), "DES");
            Cipher llIllIIIIIllIIl = Cipher.getInstance("DES");
            llIllIIIIIllIIl.init(llIIlIIl[3], llIllIIIIIllIlI);
            return new String(llIllIIIIIllIIl.doFinal(Base64.getDecoder().decode(llIllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIIIIllIII) {
            llIllIIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlI(Object object, Object object2) {
        return object != object2;
    }

    public SquireQuestHelper() {
        this.fu = llIIlIIl[0];
        this.fB = new bh(this);
    }

    private List<Object> f(List<Object> list) {
        List<Object> list2 = list.stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[33]])).flatMap(object -> {
            if (SquireQuestHelper.lIllIIllIl(object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[31]]) ? 1 : 0)) {
                try {
                    Object llIllIIIIllIIII;
                    Field llIllIIIIlIllll = llIllIIIIllIIII.getClass().getDeclaredField(llIIIllI[llIIlIIl[32]]);
                    llIllIIIIlIllll.setAccessible(llIIlIIl[0]);
                    return ((List)llIllIIIIlIllll.get(llIllIIIIllIIII)).stream();
                }
                catch (IllegalAccessException | NoSuchFieldException llIllIIIIlIllll) {
                    return Stream.empty();
                }
            }
            return Stream.of(object);
        }).collect(Collectors.toList());
        if (SquireQuestHelper.lIllIIllIl(list2.stream().anyMatch(object -> object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[30]])) ? 1 : 0)) {
            return this.f(list2);
        }
        return list2;
    }

    private static boolean lIllIlIIII(int n2) {
        return n2 == 0;
    }

    private static String lIlIlllIII(String llIlIllllllIlIl, String llIlIlllllllIIl) {
        llIlIllllllIlIl = new String(Base64.getDecoder().decode(llIlIllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlllllllIII = new StringBuilder();
        char[] llIlIllllllIlll = llIlIlllllllIIl.toCharArray();
        int llIlIllllllIllI = llIIlIIl[1];
        char[] llIlIllllllIIII = llIlIllllllIlIl.toCharArray();
        int llIlIlllllIllll = llIlIllllllIIII.length;
        int llIlIlllllIlllI = llIIlIIl[1];
        while (SquireQuestHelper.lIllIlIIlI(llIlIlllllIlllI, llIlIlllllIllll)) {
            char llIlIlllllllIll = llIlIllllllIIII[llIlIlllllIlllI];
            llIlIlllllllIII.append((char)(llIlIlllllllIll ^ llIlIllllllIlll[llIlIllllllIllI % llIlIllllllIlll.length]));
            "".length();
            ++llIlIllllllIllI;
            ++llIlIlllllIlllI;
            "".length();
            if ("  ".length() < (16 + 102 - 66 + 114 ^ 50 + 99 - 113 + 126)) continue;
            return null;
        }
        return String.valueOf(llIlIlllllllIII);
    }

    public boolean cu() {
        return Dialog.getName().contains(llIIIllI[llIIlIIl[0]]);
    }

    public Plugin cv() {
        Optional<Plugin> optional = this.fC.getPlugins().stream().filter(plugin -> plugin.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[37]])).findFirst();
        if (SquireQuestHelper.lIllIIllIl(optional.isEmpty() ? 1 : 0)) {
            JOptionPane.showMessageDialog(null, llIIIllI[llIIlIIl[3]]);
            this.forceStop();
            return null;
        }
        return optional.get();
    }

    public List<Integer> cI() {
        List<Object> list = this.cG();
        return list.stream().filter(llIllIIIIlllIII -> {
            try {
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method llIllIIIIllIlll = llIllIIIIlllIII.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[27]], classArray);
                llIllIIIIllIlll.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                return (Boolean)llIllIIIIllIlll.invoke(llIllIIIIlllIII, objectArray);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    public boolean isEnabled() {
        return this.fu;
    }

    public List<Object> cG() {
        List<Object> list = this.cE();
        return this.f(list);
    }

    public WorldPoint cA() {
        Object llIllIIlIIlIIII = this.cy();
        try {
            Field llIllIIlIIIllll = llIllIIlIIlIIII.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[14]]);
            llIllIIlIIIllll.setAccessible(llIIlIIl[0]);
            return (WorldPoint)llIllIIlIIIllll.get(llIllIIlIIlIIII);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    public List<String> cD() {
        try {
            SquireQuestHelper llIllIIIlllIlIl;
            Object llIllIIIlllIlII = llIllIIIlllIlIl.cy();
            Field llIllIIIlllIIll = llIllIIIlllIlII.getClass().getSuperclass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[20]]);
            llIllIIIlllIIll.setAccessible(llIIlIIl[0]);
            return (List)llIllIIIlllIIll.get(llIllIIIlllIlII);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    private WorldPoint cC() {
        Object llIllIIIllllIlI = this.cy();
        try {
            Field llIllIIIllllIIl = llIllIIIllllIlI.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[19]]);
            llIllIIIllllIIl.setAccessible(llIIlIIl[0]);
            return (WorldPoint)llIllIIIllllIIl.get(llIllIIIllllIlI);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int A(int n2) {
        void llIllIIIllIIIII;
        void llIllIIIlIlllll;
        List<Object> list = this.cE();
        if (SquireQuestHelper.lIllIlIIIl(list.size(), n2)) {
            return llIIlIIl[22];
        }
        Object llIllIIIlIllllI = llIllIIIlIlllll.get((int)llIllIIIllIIIII);
        if (SquireQuestHelper.lIllIlIIII(llIllIIIlIllllI.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[23]]) ? 1 : 0)) {
            return llIIlIIl[22];
        }
        try {
            Method llIllIIIlIlllIl = llIllIIIlIllllI.getClass().getMethod(llIIIllI[llIIlIIl[24]], new Class[llIIlIIl[1]]);
            llIllIIIlIlllIl.setAccessible(llIIlIIl[0]);
            return (Integer)llIllIIIlIlllIl.invoke(llIllIIIlIllllI, new Object[llIIlIIl[1]]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return llIIlIIl[22];
        }
    }
}

