package gg.squire.basics.questing;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.questing.overlay.QuestInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0035bh;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0036bi;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0037bj;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0038bk;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0039bl;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0040bm;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0041bn;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0043bp;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0044bq;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0045br;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0046bs;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0047bt;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0048bu;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0049bv;
import java.awt.Component;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
@PluginDescriptor(name = "Squire Quest QOL", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/questing/SquireQuestHelper.class */
public class SquireQuestHelper extends SquirePlugin {
    @Inject
    public /* synthetic */ SquireQuestHelperConfig fA;
    @Inject
    private /* synthetic */ OverlayManager bq;
    @Inject
    private /* synthetic */ PluginManager fC;
    @Inject
    private /* synthetic */ KeyManager bY;
    @Inject
    private /* synthetic */ QuestInfoBox fD;
    @Inject
    private /* synthetic */ EventBus K;
    private static /* synthetic */ int[] llIIlIIl;
    private static /* synthetic */ String[] llIIIllI;
    public /* synthetic */ boolean fu = llIIlIIl[0];
    private final /* synthetic */ KeyListener fB = new C0035bh(this);

    private static void lIllIIlIll() {
        llIIlIIl = new int[39];
        llIIlIIl[0] = " ".length();
        llIIlIIl[1] = (30 ^ 51) & ((10 ^ 39) ^ (-1));
        llIIlIIl[2] = 141 ^ 128;
        llIIlIIl[3] = "  ".length();
        llIIlIIl[4] = "   ".length();
        llIIlIIl[5] = 184 ^ 188;
        llIIlIIl[6] = (((42 + 9) - (-81)) + 24) ^ (((26 + 97) - 1) + 31);
        llIIlIIl[7] = (244 ^ 135) ^ (217 ^ 172);
        llIIlIIl[8] = (((105 + 14) - 114) + 129) ^ (((124 + 91) - 206) + 120);
        llIIlIIl[9] = (((91 + 47) - (-5)) + 10) ^ (((17 + 38) - (-16)) + 74);
        llIIlIIl[10] = (((40 + 6) - 10) + 132) ^ (((23 + 52) - (-49)) + 37);
        llIIlIIl[11] = (174 ^ 184) ^ (63 ^ 35);
        llIIlIIl[12] = (89 ^ 40) ^ (122 ^ 0);
        llIIlIIl[13] = 121 ^ 117;
        llIIlIIl[14] = 64 ^ 78;
        llIIlIIl[15] = 60 ^ 51;
        llIIlIIl[16] = (((128 + 66) - 84) + 44) ^ (((65 + 38) - (-29)) + 6);
        llIIlIIl[17] = 24 ^ 9;
        llIIlIIl[18] = 6 ^ 20;
        llIIlIIl[19] = 130 ^ 145;
        llIIlIIl[20] = (19 ^ 111) ^ (125 ^ 21);
        llIIlIIl[21] = 88 ^ 77;
        llIIlIIl[22] = -" ".length();
        llIIlIIl[23] = (((17 + 47) - (-28)) + 45) ^ (((140 + 144) - 267) + 142);
        llIIlIIl[24] = (183 ^ 136) ^ (179 ^ 155);
        llIIlIIl[25] = (73 ^ 27) ^ (3 ^ 73);
        llIIlIIl[26] = (113 ^ 110) ^ (98 ^ 100);
        llIIlIIl[27] = 36 ^ 62;
        llIIlIIl[28] = (13 ^ 33) ^ (96 ^ 87);
        llIIlIIl[29] = "   ".length() ^ (181 ^ 170);
        llIIlIIl[30] = "   ".length() ^ (216 ^ 198);
        llIIlIIl[31] = (108 ^ 36) ^ (149 ^ 195);
        llIIlIIl[32] = 103 ^ 120;
        llIIlIIl[33] = (((48 + 67) - (-9)) + 60) ^ (((120 + 61) - 57) + 28);
        llIIlIIl[34] = 163 ^ 130;
        llIIlIIl[35] = (((5 + 127) - 72) + 86) ^ (((18 + 15) - (-27)) + 116);
        llIIlIIl[36] = 52 ^ 80;
        llIIlIIl[37] = 111 ^ 76;
        llIIlIIl[38] = (67 ^ 117) ^ (76 ^ 94);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) llIIlIIl[1]);
        this.bq.remove(this.fD);
        "".length();
        this.K.unregister(this.fD);
        this.bY.unregisterKeyListener(this.fB);
        this.fu = llIIlIIl[1];
    }

    public List<Integer> cF() {
        return (List) cG().stream().filter(obj -> {
            try {
                Field declaredField = obj.getClass().getDeclaredField(llIIIllI[llIIlIIl[34]]);
                declaredField.setAccessible(llIIlIIl[0]);
                return ((Boolean) declaredField.get(obj)).booleanValue();
            } catch (IllegalAccessException | NoSuchFieldException e) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    private static boolean lIllIIllll(Object obj) {
        return obj != null;
    }

    static {
        lIllIIlIll();
        lIllIIIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public NPC cK() {
        Object cy = cy();
        try {
            Field declaredField = cy.getClass().getDeclaredField(llIIIllI[llIIlIIl[25]]);
            declaredField.setAccessible(llIIlIIl[0]);
            int i2 = declaredField.getInt(cy);
            Field declaredField2 = cy.getClass().getDeclaredField(llIIIllI[llIIlIIl[26]]);
            declaredField2.setAccessible(llIIlIIl[0]);
            List list = (List) declaredField2.get(cy);
            return lIllIIllIl(list.isEmpty() ? 1 : 0) ? NPCs.getNearest(npc -> {
                if (!lIllIlIlIl(npc.getId(), i2) || lIllIlIlll(npc.getTransformedId(), i2)) {
                    ?? r0 = llIIlIIl[0];
                    "".length();
                    return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIl[1];
            }) : NPCs.getNearest(npc2 -> {
                if (lIllIlIlIl(npc2.getId(), i2) && lIllIlIIII(list.contains(Integer.valueOf(npc2.getId())) ? 1 : 0) && !lIllIlIlll(npc2.getTransformedId(), i2)) {
                    return llIIlIIl[1];
                }
                ?? r0 = llIIlIIl[0];
                "".length();
                return "   ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIlll(int i2, int i3) {
        return i2 == i3;
    }

    public int cJ() {
        return A(llIIlIIl[1]);
    }

    @Provides
    SquireQuestHelperConfig t(ConfigManager configManager) {
        return (SquireQuestHelperConfig) configManager.getConfig(SquireQuestHelperConfig.class);
    }

    private static void lIllIIIIII() {
        llIIIllI = new String[llIIlIIl[38]];
        llIIIllI[llIIlIIl[1]] = lIlIllIllI("YWbCS1LkIm89j3K24O9O2g==", "drdCs");
        llIIIllI[llIIlIIl[0]] = lIlIllIllI("WYe+pzI8YslrzZc1yr5Gfg==", "lfufF");
        llIIIllI[llIIlIIl[3]] = lIlIllIlll("hNmtNOl4PjhIF43gfdCa1PTPgYKgv7boDkizrW3crfXKgmeYCqBu/eqpwnhSu/vW5dUw4kBxyyo0rBv+VFmINg==", "JSpHN");
        llIIIllI[llIIlIIl[4]] = lIlIllIlll("+Ttb+RzhEocFwjSse387cw==", "bEMRW");
        llIIIllI[llIIlIIl[5]] = lIlIllIlll("OocRPGWmCME=", "EqEIy");
        llIIIllI[llIIlIIl[6]] = lIlIllIllI("+P0YmHnDXFHuvbPmdl59sQ==", "KisnG");
        llIIIllI[llIIlIIl[7]] = lIlIlllIII("CCMEMikDIxMVKQsXBQQ/Gw==", "oFpaL");
        llIIIllI[llIIlIIl[8]] = lIlIllIlll("TRxKCYoKA0mcvpN6A17L+w==", "XhBvx");
        llIIIllI[llIIlIIl[9]] = lIlIllIlll("VP9yZj22jszCqWEGj8ir5g==", "xkfwS");
        llIIIllI[llIIlIIl[10]] = lIlIllIlll("5tbnNYq1ieBqkpDZFjUhgw==", "vIdzH");
        llIIIllI[llIIlIIl[11]] = lIlIllIlll("UVLW2G1hB2e8K2Y8MHsoFg==", "PMHEI");
        llIIIllI[llIIlIIl[12]] = lIlIlllIII("CRwWNQkaEBQRORocEg==", "nybtj");
        llIIIllI[llIIlIIl[13]] = lIlIllIllI("pv1hosjybRA=", "Exvat");
        llIIIllI[llIIlIIl[2]] = lIlIllIlll("oAC2u1wVfFw=", "bdxTb");
        llIIIllI[llIIlIIl[14]] = lIlIllIllI("pkmn9BukhbCOpT5F9Vij3A==", "ZYKkd");
        llIIIllI[llIIlIIl[15]] = lIlIllIlll("4nzFvztxhhIKuqSi1cEoNGn5+MPFjuIsmJrpifo9hqE=", "fKkHq");
        llIIIllI[llIIlIIl[16]] = lIlIlllIII("KDwYHiAFdBlSNAonBVIzAicFUjMOMUFSMBkqBBwjSycCUisbNgNSIAQ8HwFlSg==", "kSmrD");
        llIIIllI[llIIlIIl[17]] = lIlIllIllI("vkRLlz8tzZ8=", "QVguw");
        llIIIllI[llIIlIIl[18]] = lIlIllIllI("eAg5OY+2okObEIAjp12HoA==", "uNnXI");
        llIIIllI[llIIlIIl[19]] = lIlIlllIII("BTgYNjQ/NhoKPxs5Hg==", "rWjZP");
        llIIIllI[llIIlIIl[20]] = lIlIlllIII("DB0WPw==", "xxnKJ");
        llIIIllI[llIIlIIl[21]] = lIlIllIllI("iNzT5VaJZe1vdisa0IgHpA==", "fRROI");
        llIIIllI[llIIlIIl[23]] = lIlIllIllI("5FBooz9rPSSIWok0+/GOvw==", "XWjSQ");
        llIIIllI[llIIlIIl[24]] = lIlIllIlll("0oGSt+W8R0g=", "lAlty");
        llIIIllI[llIIlIIl[25]] = lIlIllIlll("Fg51Z/J/o7k=", "lNiTm");
        llIIIllI[llIIlIIl[26]] = lIlIllIllI("3jM1uRG9cdWFumKYFbsIvQ==", "CDKlK");
        llIIIllI[llIIlIIl[27]] = lIlIllIllI("1HNzfUC5317fQEOn5FuMElDWDE8axp4nRtgZbTjngFA=", "uSfpt");
        llIIIllI[llIIlIIl[28]] = lIlIlllIII("Lx00CC0=", "LuQkF");
        llIIIllI[llIIlIIl[29]] = lIlIllIllI("q+dVSzrz1hBj3ir179ZHUg==", "ITwAK");
        llIIIllI[llIIlIIl[30]] = lIlIllIlll("Fm41Z1VIdde9Pfghda2+JCP+HF49CkU/", "JpGgi");
        llIIIllI[llIIlIIl[31]] = lIlIllIllI("iDxiWs7cYW1gJWX5zxrLZoBvIKswl7BU", "iutEw");
        llIIIllI[llIIlIIl[32]] = lIlIlllIII("CCQtKjoEIT0uGgQ9LSkcEg==", "aPHGh");
        llIIIllI[llIIlIIl[33]] = lIlIllIlll("x9HcELDP8fZhjyyy/GDBdg==", "FekGV");
        llIIIllI[llIIlIIl[34]] = lIlIlllIII("ExM+ICc=", "vbKIW");
        llIIIllI[llIIlIIl[35]] = lIlIllIllI("VOuxHcsz98U=", "Fgtzt");
        llIIIllI[llIIlIIl[37]] = lIlIllIllI("AQWC10YFjl/tQGHbt8S3/kOEsut+wv9a", "ANqAy");
    }

    private static boolean lIllIlIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private static Stream<Integer> b(Object obj) {
        try {
            Method method = obj.getClass().getMethod(llIIIllI[llIIlIIl[1]], new Class[llIIlIIl[1]]);
            method.setAccessible(llIIlIIl[0]);
            return ((List) method.invoke(obj, new Object[llIIlIIl[1]])).stream();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public List<Object> cE() {
        try {
            Object cy = cy();
            Method method = cy.getClass().getMethod(llIIIllI[llIIlIIl[21]], new Class[llIIlIIl[1]]);
            method.setAccessible(llIIlIIl[0]);
            return (List) method.invoke(cy, new Object[llIIlIIl[1]]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(String... strArr) {
        int length = strArr.length;
        int i2 = llIIlIIl[1];
        while (lIllIlIIlI(i2, length)) {
            String llIllIIIlIIIlIl = strArr[i2];
            if (lIllIIllIl(cD().stream().anyMatch(str -> {
                return str.toLowerCase().contains(llIllIIIlIIIlIl.toLowerCase());
            }) ? 1 : 0)) {
                return llIIlIIl[0];
            }
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return ((3 ^ 69) ^ (195 ^ 171)) & (((118 ^ 115) ^ (173 ^ 134)) ^ (-" ".length()));
            }
        }
        return llIIlIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) llIIlIIl[0]);
        this.bq.add(this.fD);
        "".length();
        this.K.register(this.fD);
        this.bY.registerKeyListener(this.fB);
        this.fu = llIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean cB() {
        WorldPoint cA = cA();
        if (lIllIIlllI(cA)) {
            return llIIlIIl[1];
        }
        if (!lIllIIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0) || !lIllIlIIII(House.isInside() ? 1 : 0)) {
            if (lIllIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(cA);
                "".length();
            }
            return llIIlIIl[0];
        }
        WorldPoint worldPoint = (WorldPoint) WorldPoint.toLocalInstance(Static.getClient(), cA).stream().min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal().getWorldLocation());
        })).orElse(null);
        if (lIllIIlllI(worldPoint)) {
            if (lIllIIlllI(cC())) {
                return llIIlIIl[1];
            }
            worldPoint = (WorldPoint) WorldPoint.toLocalInstance(Static.getClient(), cC()).stream().filter((v0) -> {
                return Objects.nonNull(v0);
            }).findFirst().orElse(null);
            if (lIllIIlllI(worldPoint)) {
                return llIIlIIl[1];
            }
        }
        Movement.walkTo(worldPoint, (boolean) llIIlIIl[1]);
        "".length();
        return llIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public TileObject cx() {
        Object cy = cy();
        try {
            Field declaredField = cy.getClass().getDeclaredField(llIIIllI[llIIlIIl[6]]);
            declaredField.setAccessible(llIIlIIl[0]);
            int i2 = declaredField.getInt(cy);
            Collection localInstance = WorldPoint.toLocalInstance(Static.getClient(), cA());
            return (TileObject) TileObjects.getAll(tileObject -> {
                if (lIllIlIlll(tileObject.getId(), i2)) {
                    ?? r0 = llIIlIIl[0];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIl[1];
            }).stream().filter(tileObject2 -> {
                if (lIllIlIIIl(((Integer) localInstance.stream().map(worldPoint -> {
                    return Integer.valueOf(worldPoint.distanceTo2D(tileObject2.getWorldLocation()));
                }).min(Comparator.comparingInt(num -> {
                    return num.intValue();
                })).orElse(Integer.valueOf(llIIlIIl[36]))).intValue(), llIIlIIl[6])) {
                    ?? r0 = llIIlIIl[0];
                    "".length();
                    return (-" ".length()) > (-" ".length()) ? ((84 ^ 108) ^ (76 ^ 100)) & (((31 ^ 74) ^ (29 ^ 88)) ^ (-" ".length())) : r0;
                }
                return llIIlIIl[1];
            }).findFirst().orElse(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Integer> cH() {
        return (List) cE().stream().filter(obj -> {
            return obj.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[29]]);
        }).filter(obj2 -> {
            try {
                Class<?> cls = obj2.getClass();
                String str = llIIIllI[llIIlIIl[28]];
                Class<?>[] clsArr = new Class[llIIlIIl[0]];
                clsArr[llIIlIIl[1]] = Client.class;
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(llIIlIIl[0]);
                Object[] objArr = new Object[llIIlIIl[0]];
                objArr[llIIlIIl[1]] = Static.getClient();
                if (lIllIlIIII(((Boolean) declaredMethod.invoke(obj2, objArr)).booleanValue() ? 1 : 0)) {
                    ?? r0 = llIIlIIl[0];
                    "".length();
                    return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIl[1];
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    public String cz() {
        if (lIllIlIIII(this.fu ? 1 : 0)) {
            return llIIIllI[llIIlIIl[13]];
        }
        Object cy = cy();
        return lIllIIlllI(cy) ? llIIIllI[llIIlIIl[2]] : cy.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean d(TileObject tileObject) {
        if (lIllIIllIl(Movement.walkTo(tileObject) ? 1 : 0)) {
            Log.info(llIIIllI[llIIlIIl[15]]);
            return llIIlIIl[0];
        }
        Log.info(llIIIllI[llIIlIIl[16]]);
        if (lIllIlIIIl(Players.getLocal().getWorldLocation().distanceTo2D(tileObject.getWorldLocation()), llIIlIIl[3])) {
            TileObject nearest = TileObjects.getNearest(tileObject.getWorldLocation(), tileObject2 -> {
                if (lIllIllIlI(tileObject2, tileObject)) {
                    String[] strArr = new String[llIIlIIl[0]];
                    strArr[llIIlIIl[1]] = llIIIllI[llIIlIIl[35]];
                    if (lIllIIllIl(tileObject2.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = llIIlIIl[0];
                        "".length();
                        return (((240 ^ 193) ^ (84 ^ 114)) & (((((40 + 71) - 67) + 137) ^ (((48 + 149) - 92) + 57)) ^ (-" ".length()))) < 0 ? ((241 ^ 167) ^ (93 ^ 67)) & (((((102 + 57) - 106) + 90) ^ (((17 + 95) - (-18)) + 69)) ^ (-" ".length())) : r0;
                    }
                }
                return llIIlIIl[1];
            });
            if (lIllIIllll(nearest)) {
                nearest.interact(llIIIllI[llIIlIIl[17]]);
                Log.info(llIIIllI[llIIlIIl[18]]);
                return llIIlIIl[0];
            }
        }
        return llIIlIIl[1];
    }

    public Object cy() {
        Plugin cv = cv();
        try {
            Object invoke = cv.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[7]], new Class[llIIlIIl[1]]).invoke(cv, new Object[llIIlIIl[1]]);
            Object invoke2 = invoke.getClass().getMethod(llIIIllI[llIIlIIl[8]], new Class[llIIlIIl[1]]).invoke(invoke, new Object[llIIlIIl[1]]);
            return (lIllIIllll(invoke2) && lIllIIllIl(invoke2.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[9]]) ? 1 : 0)) ? invoke2.getClass().getSuperclass().getMethod(llIIIllI[llIIlIIl[10]], new Class[llIIlIIl[1]]).invoke(invoke2, new Object[llIIlIIl[1]]) : (lIllIIllll(invoke2) && lIllIIllIl(invoke2.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[11]]) ? 1 : 0)) ? invoke2.getClass().getMethod(llIIIllI[llIIlIIl[12]], new Class[llIIlIIl[1]]).invoke(invoke2, new Object[llIIlIIl[1]]) : invoke2;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }

    private static boolean lIllIlIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIllIIllIl(int i2) {
        return i2 != 0;
    }

    private static String lIlIllIlll(String llIllIIIIIIlIII, String llIllIIIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIIIIIIllII = Cipher.getInstance("Blowfish");
            llIllIIIIIIllII.init(llIIlIIl[3], secretKeySpec);
            return new String(llIllIIIIIIllII.doFinal(Base64.getDecoder().decode(llIllIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIIIIIlIll) {
            llIllIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public Object cw() {
        Plugin cv = cv();
        try {
            Field declaredField = cv.getClass().getDeclaredField(llIIIllI[llIIlIIl[4]]);
            declaredField.setAccessible(llIIlIIl[0]);
            Object obj = declaredField.get(cv);
            if (lIllIIlllI(obj)) {
                String str = llIIIllI[llIIlIIl[5]];
                "".length();
                if ("   ".length() <= (-" ".length())) {
                    return null;
                }
                return str;
            }
            return obj.getClass().getSimpleName();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIlIIl[2]];
        clsArr[llIIlIIl[1]] = C0044bq.class;
        clsArr[llIIlIIl[0]] = C0045br.class;
        clsArr[llIIlIIl[3]] = C0047bt.class;
        clsArr[llIIlIIl[4]] = C0041bn.class;
        clsArr[llIIlIIl[5]] = C0038bk.class;
        clsArr[llIIlIIl[6]] = C0049bv.class;
        clsArr[llIIlIIl[7]] = C0048bu.class;
        clsArr[llIIlIIl[8]] = C0040bm.class;
        clsArr[llIIlIIl[9]] = C0036bi.class;
        clsArr[llIIlIIl[10]] = C0037bj.class;
        clsArr[llIIlIIl[11]] = C0046bs.class;
        clsArr[llIIlIIl[12]] = C0039bl.class;
        clsArr[llIIlIIl[13]] = C0043bp.class;
        return clsArr;
    }

    private static boolean lIllIlIlIl(int i2, int i3) {
        return i2 != i3;
    }

    private static String lIlIllIllI(String llIllIIIIIlIlll, String llIllIIIIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIlIIl[9]), "DES");
            Cipher llIllIIIIIllIIl = Cipher.getInstance("DES");
            llIllIIIIIllIIl.init(llIIlIIl[3], secretKeySpec);
            return new String(llIllIIIIIllIIl.doFinal(Base64.getDecoder().decode(llIllIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIIIIllIII) {
            llIllIIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private List<Object> f(List<Object> list) {
        List<Object> list2 = (List) list.stream().filter(obj -> {
            return obj.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[33]]);
        }).flatMap(obj2 -> {
            if (lIllIIllIl(obj2.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[31]]) ? 1 : 0)) {
                try {
                    Field declaredField = obj2.getClass().getDeclaredField(llIIIllI[llIIlIIl[32]]);
                    declaredField.setAccessible(llIIlIIl[0]);
                    return ((List) declaredField.get(obj2)).stream();
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    return Stream.empty();
                }
            }
            return Stream.of(obj2);
        }).collect(Collectors.toList());
        return lIllIIllIl(list2.stream().anyMatch(obj3 -> {
            return obj3.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[30]]);
        }) ? 1 : 0) ? f(list2) : list2;
    }

    private static boolean lIllIlIIII(int i2) {
        return i2 == 0;
    }

    private static String lIlIlllIII(String llIlIlllllllIlI, String llIlIlllllllIIl) {
        String llIlIlllllllIlI2 = new String(Base64.getDecoder().decode(llIlIlllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlllllllIII = new StringBuilder();
        char[] llIlIllllllIlll = llIlIlllllllIIl.toCharArray();
        int llIlIllllllIllI = llIIlIIl[1];
        char[] charArray = llIlIlllllllIlI2.toCharArray();
        int llIlIlllllIllll = charArray.length;
        int i2 = llIIlIIl[1];
        while (lIllIlIIlI(i2, llIlIlllllIllll)) {
            llIlIlllllllIII.append((char) (charArray[i2] ^ llIlIllllllIlll[llIlIllllllIllI % llIlIllllllIlll.length]));
            "".length();
            llIlIllllllIllI++;
            i2++;
            "".length();
            if ("  ".length() >= ((((16 + 102) - 66) + 114) ^ (((50 + 99) - 113) + 126))) {
                return null;
            }
        }
        return String.valueOf(llIlIlllllllIII);
    }

    public boolean cu() {
        return Dialog.getName().contains(llIIIllI[llIIlIIl[0]]);
    }

    public Plugin cv() {
        Optional findFirst = this.fC.getPlugins().stream().filter(plugin -> {
            return plugin.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[37]]);
        }).findFirst();
        if (lIllIIllIl(findFirst.isEmpty() ? 1 : 0)) {
            JOptionPane.showMessageDialog((Component) null, llIIIllI[llIIlIIl[3]]);
            forceStop();
            return null;
        }
        return (Plugin) findFirst.get();
    }

    public List<Integer> cI() {
        return (List) cG().stream().filter(obj -> {
            try {
                Class<?> cls = obj.getClass();
                String str = llIIIllI[llIIlIIl[27]];
                Class<?>[] clsArr = new Class[llIIlIIl[0]];
                clsArr[llIIlIIl[1]] = Client.class;
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(llIIlIIl[0]);
                Object[] objArr = new Object[llIIlIIl[0]];
                objArr[llIIlIIl[1]] = Static.getClient();
                return ((Boolean) declaredMethod.invoke(obj, objArr)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    public boolean isEnabled() {
        return this.fu;
    }

    public List<Object> cG() {
        return f(cE());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public WorldPoint cA() {
        Object cy = cy();
        try {
            Field declaredField = cy.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[14]]);
            declaredField.setAccessible(llIIlIIl[0]);
            return (WorldPoint) declaredField.get(cy);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public List<String> cD() {
        try {
            Object cy = cy();
            Field declaredField = cy.getClass().getSuperclass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[20]]);
            declaredField.setAccessible(llIIlIIl[0]);
            return (List) declaredField.get(cy);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    private WorldPoint cC() {
        Object cy = cy();
        try {
            Field declaredField = cy.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[19]]);
            declaredField.setAccessible(llIIlIIl[0]);
            return (WorldPoint) declaredField.get(cy);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public int A(int i2) {
        List<Object> cE = cE();
        if (lIllIlIIIl(cE.size(), i2)) {
            return llIIlIIl[22];
        }
        Object obj = cE.get(i2);
        if (lIllIlIIII(obj.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[23]]) ? 1 : 0)) {
            return llIIlIIl[22];
        }
        try {
            Method method = obj.getClass().getMethod(llIIIllI[llIIlIIl[24]], new Class[llIIlIIl[1]]);
            method.setAccessible(llIIlIIl[0]);
            return ((Integer) method.invoke(obj, new Object[llIIlIIl[1]])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return llIIlIIl[22];
        }
    }
}
