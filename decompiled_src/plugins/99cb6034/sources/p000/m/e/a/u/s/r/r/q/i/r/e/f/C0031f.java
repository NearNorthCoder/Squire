package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.WidgetNode;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/f.class */
public class C0031f {
    private static final /* synthetic */ Pattern X;
    private static final /* synthetic */ Logger T;
    private /* synthetic */ N ai;
    private /* synthetic */ Collection<C0042q> al;
    private static final /* synthetic */ Pattern W;
    private final /* synthetic */ C0043r Z;
    private final /* synthetic */ SquireFarmerConfig ab;
    private /* synthetic */ C0042q aj;
    private final /* synthetic */ Client aa;
    private final /* synthetic */ C0027b ae;
    private static final /* synthetic */ Pattern U;
    private /* synthetic */ boolean ak;
    private final /* synthetic */ C0034i af;
    private static /* synthetic */ int[] llIIIlIlIllI;
    private final /* synthetic */ ConfigManager ac;
    private static final /* synthetic */ Pattern V;
    private static /* synthetic */ String[] llIIIlIIIlII;
    private final /* synthetic */ SquireFarmer ad;
    private final /* synthetic */ Map<EnumC0041p, C0049x> Y = new HashMap();
    private final /* synthetic */ Map<A, B> ag = new EnumMap(A.class);
    private final /* synthetic */ Map<A, Long> ah = new EnumMap(A.class);

    private static int llllIlIlIIlllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public WorldPoint u() {
        C0042q x = x();
        if (llllIlIIlllllI(x)) {
            return null;
        }
        EnumC0041p b = EnumC0041p.b(x.X());
        if (llllIlIIlllllI(b)) {
            return null;
        }
        return b.Y();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (llllIlIlIIIIll(configChanged.getGroup().equals(llIIIlIIIlII[llIIIlIlIllI[0]]) ? 1 : 0)) {
            return;
        }
        w();
    }

    public C0042q y() {
        long epochSecond = Instant.now().getEpochSecond();
        if (llllIlIIllllll(this.ai) && llllIlIlIIIIll(e(this.ai) ? 1 : 0) && llllIlIlIIIIII(this.ai.aM().a(this.aa) ? 1 : 0)) {
            return this.ai.aM();
        }
        EnumC0041p[] W2 = EnumC0041p.W();
        int length = W2.length;
        int i = llIIIlIlIllI[1];
        while (llllIlIlIIIIIl(i, length)) {
            EnumC0041p enumC0041p = W2[i];
            if (llllIlIlIIIIll(b(enumC0041p) ? 1 : 0)) {
                "".length();
                if ((-(145 ^ 148)) >= 0) {
                    return null;
                }
            } else {
                C0049x a = a(enumC0041p);
                C0042q c0042q = this.Z.af().get(enumC0041p);
                N[] ae = c0042q.ae();
                int length2 = ae.length;
                int i2 = llIIIlIlIllI[1];
                while (llllIlIlIIIIIl(i2, length2)) {
                    N n = ae[i2];
                    if (llllIlIlIIIIll(i(n) ? 1 : 0)) {
                        "".length();
                        if (!(true ^ true)) {
                            return null;
                        }
                    } else if (llllIlIlIIIIII(n.aL().aT() ? 1 : 0)) {
                        if (llllIlIIlllllI(a.C(n)) && llllIlIlIIIIII(d(n) ? 1 : 0)) {
                            "".length();
                            if ("  ".length() < 0) {
                                return null;
                            }
                        } else {
                            C0013am j = j(n);
                            if (!llllIlIIllllll(j) || llllIlIlIIIlIl(llllIlIlIIIlII(j.ba(), epochSecond))) {
                                return c0042q;
                            }
                        }
                    }
                    i2++;
                    "".length();
                    if ("  ".length() > ((131 ^ 145) ^ (125 ^ 107))) {
                        return null;
                    }
                }
            }
            i++;
            "".length();
            if ((36 ^ 33) <= 0) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean b(WorldPoint worldPoint) {
        if (llllIlIIlllllI(this.aj)) {
            return llIIIlIlIllI[0];
        }
        EnumC0041p b = EnumC0041p.b(this.aj.X());
        if (!llllIlIIlllllI(b) && !llllIlIlIIIIlI(b.Y().distanceTo(worldPoint), b.Z())) {
            if (llllIlIIllllIl(b, EnumC0041p.GRAPE_VINE_KOUREND)) {
                return llIIIlIlIllI[0];
            }
            NPC nearest = NPCs.getNearest(npc -> {
                return npc.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[39]]);
            });
            return llllIlIIlllllI(nearest) ? llIIIlIlIllI[1] : Reachable.isInteractable(nearest);
        }
        return llIIIlIlIllI[1];
    }

    public long c(A a) {
        Long l = this.ah.get(a);
        if (llllIlIIlllllI(l)) {
            "".length();
            return "  ".length() == 0 ? 0L : -1L;
        }
        return l.longValue();
    }

    private static boolean llllIlIlIIIllI(int i) {
        return i > 0;
    }

    private static int llllIlIlIIllIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllIlIlIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    private boolean i(N n) {
        if (llllIlIIllllIl(n.aL(), P.GRAPES)) {
            return llIIIlIlIllI[0];
        }
        EnumC0022av C = b(n.aM()).C(n);
        if (llllIlIIlllllI(C)) {
            return llIIIlIlIllI[1];
        }
        if (llllIlIIllllIl(C, EnumC0022av.DEFAULT)) {
            C = a(n.aL());
        }
        if (llllIlIlIIIlll(C, EnumC0022av.DEFAULT) && llllIlIIllllll(C)) {
            ?? r0 = llIIIlIlIllI[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlIlIllI[1];
    }

    private static int llllIlIlIIlIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllIlIIllllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean t() {
        if (llllIlIIllllIl(this.ad.a(), EnumC0040o.HERBS)) {
            ?? r0 = llIIIlIlIllI[0];
            "".length();
            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIlIlIllI[1];
    }

    public long a(int i, int i2) {
        return a(i, i2, Instant.now().getEpochSecond(), this.ac.getRSProfileKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    public boolean a(WorldPoint worldPoint, int i) {
        int lllllllllllllllIlIlIIllIllIllIll = llIIIlIlIllI[1];
        for (WidgetNode widgetNode : this.aa.getComponentTable()) {
            if (llllIlIlIIlIIl(widgetNode.getModalMode(), llIIIlIlIllI[0])) {
                return llIIIlIlIllI[1];
            }
            "".length();
            if (" ".length() >= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        String num = Integer.toString(this.aa.getVarbitValue(llIIIlIlIllI[3]));
        if (llllIlIlIIIIll(num.equals(this.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[4]], llIIIlIIIlII[llIIIlIlIllI[5]])) ? 1 : 0)) {
            this.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[6]], llIIIlIIIlII[llIIIlIlIllI[7]], num);
            lllllllllllllllIlIlIIllIllIllIll = llIIIlIlIllI[0];
        }
        Collection<C0042q> d = this.Z.d(worldPoint);
        if (llllIlIlIIIIll(d.equals(this.al) ? 1 : 0)) {
            this.ak = llIIIlIlIllI[0];
            T.debug(llIIIlIIIlII[llIIIlIlIllI[8]], d, Integer.valueOf(this.aa.getTickCount()));
        }
        for (C0042q c0042q : d) {
            long epochSecond = Instant.now().getEpochSecond();
            N[] ae = c0042q.ae();
            int length = ae.length;
            int i2 = llIIIlIlIllI[1];
            while (llllIlIlIIIIIl(i2, length)) {
                N n = ae[i2];
                int aO = n.aO();
                String aJ = n.aJ();
                String num2 = Integer.toString(this.aa.getVarbitValue(aO));
                String rSProfileConfiguration = this.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[9]], aJ);
                C0014an f = n.aL().f(this.aa.getVarbitValue(aO));
                if (llllIlIIlllllI(f)) {
                    "".length();
                    if (" ".length() < 0) {
                        return ((4 ^ 79) ^ (63 ^ 72)) & (((124 ^ 21) ^ (87 ^ 2)) ^ (-" ".length()));
                    }
                } else {
                    if (llllIlIIllllll(rSProfileConfiguration)) {
                        String[] split = rSProfileConfiguration.split(llIIIlIIIlII[llIIIlIlIllI[10]]);
                        if (llllIlIlIIlIlI(split.length, llIIIlIlIllI[4])) {
                            if (llllIlIlIIIIII(split[llIIIlIlIllI[1]].equals(num2) ? 1 : 0)) {
                                long lllllllllllllllIlIlIIllIllIIllII = 0;
                                try {
                                    lllllllllllllllIlIlIIllIllIIllII = Long.parseLong(split[llIIIlIlIllI[0]]);
                                    "".length();
                                    if ("  ".length() != "  ".length()) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                } catch (NumberFormatException e) {
                                }
                                if (llllIlIlIIIllI(llllIlIlIIlIII(lllllllllllllllIlIlIIllIllIIllII + 300, epochSecond)) && llllIlIlIIIllI(llllIlIlIIlIII(epochSecond + 30, lllllllllllllllIlIlIIllIllIIllII))) {
                                    "".length();
                                    if (0 != 0) {
                                        return (true ^ true) & ((true ^ true) ^ true);
                                    }
                                } else {
                                    "".length();
                                    if (" ".length() < 0) {
                                        return ((((86 + 28) - (-35)) + 14) ^ (((145 + 147) - 268) + 169)) & (((181 ^ 174) ^ (244 ^ 141)) ^ (-" ".length()));
                                    }
                                }
                            } else if (llllIlIlIIIIll(this.ak ? 1 : 0) && llllIlIlIIIIlI(i, llIIIlIlIllI[0])) {
                                C0014an f2 = n.aL().f(Integer.parseInt(split[llIIIlIlIllI[1]]));
                                if (llllIlIIlllllI(f2)) {
                                    "".length();
                                    if ((((((30 + 16) - (-7)) + 76) ^ (((74 + 128) - 191) + 136)) & (((((122 + 16) - 122) + 155) ^ (((60 + 162) - 217) + 180)) ^ (-" ".length()))) != 0) {
                                        return ((142 ^ 172) ^ (170 ^ 185)) & (((((159 + 84) - 83) + 20) ^ (((55 + 113) - 155) + 120)) ^ (-" ".length()));
                                    }
                                } else {
                                    int lllllllllllllllIlIlIIllIllIIlIll = f2.bd();
                                    if (llllIlIlIIIIII(a(f2, f) ? 1 : 0)) {
                                        Integer num3 = (Integer) this.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[11]], llIIIlIIIlII[llIIIlIlIllI[12]], Integer.TYPE);
                                        Integer num4 = (Integer) this.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[13]], llIIIlIIIlII[llIIIlIlIllI[14]], Integer.TYPE);
                                        int abs = (int) Math.abs(((Instant.now().getEpochSecond() / 60) % lllllllllllllllIlIlIIllIllIIlIll) - lllllllllllllllIlIlIIllIllIIlIll);
                                        T.debug(llIIIlIIIlII[llIIIlIlIllI[15]], Integer.valueOf(abs), Integer.valueOf(lllllllllllllllIlIlIIllIllIIlIll));
                                        if (llllIlIIllllll(num4) && llllIlIlIIIIII(num4.intValue()) && llllIlIlIIlIIl(abs, num4.intValue() % lllllllllllllllIlIlIIllIllIIlIll)) {
                                            WorldPoint worldLocation = this.aa.getLocalPlayer().getWorldLocation();
                                            Logger logger = T;
                                            String str = llIIIlIIIlII[llIIIlIlIllI[16]];
                                            Object[] objArr = new Object[llIIIlIlIllI[6]];
                                            objArr[llIIIlIlIllI[1]] = Integer.valueOf(abs);
                                            objArr[llIIIlIlIllI[0]] = num4;
                                            objArr[llIIIlIlIllI[4]] = Integer.valueOf(num4.intValue() % lllllllllllllllIlIlIIllIllIIlIll);
                                            objArr[llIIIlIlIllI[5]] = worldLocation;
                                            logger.error(str, objArr);
                                        }
                                        if (!llllIlIIllllll(num3) || llllIlIlIIllII(lllllllllllllllIlIlIIllIllIIlIll, num3.intValue())) {
                                            T.debug(llIIIlIIIlII[llIIIlIlIllI[17]], Integer.valueOf(lllllllllllllllIlIlIIllIllIIlIll));
                                            this.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[18]], llIIIlIIIlII[llIIIlIlIllI[19]], Integer.valueOf(lllllllllllllllIlIlIIllIllIIlIll));
                                            this.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[20]], llIIIlIIIlII[llIIIlIlIllI[21]], Integer.valueOf(abs));
                                        }
                                    }
                                    "".length();
                                    if ((-" ".length()) >= 0) {
                                        return ((((14 + 155) - 167) + 213) ^ (((33 + 49) - 77) + 192)) & (((29 ^ 20) ^ (1 ^ 26)) ^ (-" ".length()));
                                    }
                                }
                            } else {
                                T.debug(llIIIlIIIlII[llIIIlIlIllI[22]], Boolean.valueOf(this.ak), Integer.valueOf(i));
                            }
                        }
                    }
                    if (!llllIlIlIIIlll(f.aZ(), EnumC0039n.DEAD) || llllIlIIllllIl(f.aZ(), EnumC0039n.HARVESTABLE)) {
                        this.ae.a(n, (H) null);
                        this.af.a(n, llIIIlIlIllI[1]);
                    }
                    String lllllllllllllllIlIlIIllIllIIllIl = num2 + ":" + epochSecond;
                    this.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[23]], aJ, lllllllllllllllIlIlIIllIllIIllIl);
                    lllllllllllllllIlIlIIllIllIllIll = llIIIlIlIllI[0];
                }
                i2++;
                "".length();
                if ((-"   ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            "".length();
            if ("  ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        this.ak = llIIIlIlIllI[1];
        this.al = d;
        if (llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIllIll)) {
            E();
        }
        return lllllllllllllllIlIlIIllIllIllIll;
    }

    @Nullable
    public C0013am a(N n, String str) {
        long epochSecond = Instant.now().getEpochSecond();
        boolean equals = Integer.toString(EnumC0038m.ON.ordinal()).equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[27]], str, llIIIlIIIlII[llIIIlIlIllI[28]]));
        boolean equals2 = Boolean.TRUE.equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[29]], str, llIIIlIIIlII[llIIIlIlIllI[30]], Boolean.class));
        String configuration = this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[31]], str, n.aJ());
        if (llllIlIIlllllI(configuration)) {
            return null;
        }
        long j = 0;
        int i = llIIIlIlIllI[1];
        String[] split = configuration.split(llIIIlIIIlII[llIIIlIlIllI[32]]);
        if (llllIlIlIIlIlI(split.length, llIIIlIlIllI[4])) {
            try {
                i = Integer.parseInt(split[llIIIlIlIllI[1]]);
                j = Long.parseLong(split[llIIIlIlIllI[0]]);
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            } catch (NumberFormatException e) {
            }
        }
        if (llllIlIlIIIlIl(llllIlIlIIllIl(j, 0L))) {
            return null;
        }
        C0014an f = n.aL().f(i);
        if (llllIlIIlllllI(f)) {
            return null;
        }
        int bb = f.bb();
        int lllllllllllllllIlIlIIllIlIIlllII = f.bc();
        int bd = f.bd();
        int lllllllllllllllIlIlIIllIlIlIIlII = equals ? 1 : 0;
        if (llllIlIlIIIIII(lllllllllllllllIlIlIIllIlIlIIlII) && llllIlIIllllIl(f.aY(), EnumC0021au.WEEDS)) {
            bb = llIIIlIlIllI[1];
            lllllllllllllllIlIlIIllIlIIlllII = llIIIlIlIllI[0];
            bd = llIIIlIlIllI[1];
        }
        if (llllIlIlIIIIII(equals2 ? 1 : 0)) {
            bd /= llIIIlIlIllI[7];
        }
        long j2 = 0;
        if (llllIlIlIIIllI(bd)) {
            long a = a(bd, llIIIlIlIllI[1], epochSecond, str);
            long a2 = a(bd, llIIIlIlIllI[1], j, str);
            int lllllllllllllllIlIlIIllIlIIlIlll = ((int) (a - a2)) / (bd * llIIIlIlIllI[33]);
            j2 = a(bd, (lllllllllllllllIlIlIIllIlIIlllII - llIIIlIlIllI[0]) - bb, a2, str);
            bb += lllllllllllllllIlIlIIllIlIIlIlll;
            if (llllIlIlIIllII(bb, lllllllllllllllIlIlIIllIlIIlllII)) {
                bb = lllllllllllllllIlIlIIllIlIIlllII - llIIIlIlIllI[0];
            }
        }
        return new C0013am(f.aY(), f.aZ(), j2, bb, lllllllllllllllIlIlIIllIlIIlllII);
    }

    private static boolean llllIlIlIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIlIIlllllI(Object obj) {
        return obj == null;
    }

    public B a(A a) {
        E();
        return b(a);
    }

    private static String llllIIllllllll(String lllllllllllllllIlIlIIlIllIIIlIIl, String lllllllllllllllIlIlIIlIllIIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIllIIIIlIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIllIIIIlII = lllllllllllllllIlIlIIlIllIIIIlll.toCharArray();
        int lllllllllllllllIlIlIIlIllIIIIIll = llIIIlIlIllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIlIlIIlIlIlllIlll = llIIIlIlIllI[1];
        while (llllIlIlIIIIIl(lllllllllllllllIlIlIIlIlIlllIlll, length)) {
            char lllllllllllllllIlIlIIlIllIIIlIll = charArray[lllllllllllllllIlIlIIlIlIlllIlll];
            lllllllllllllllIlIlIIlIllIIIIlIl.append((char) (lllllllllllllllIlIlIIlIllIIIlIll ^ lllllllllllllllIlIlIIlIllIIIIlII[lllllllllllllllIlIlIIlIllIIIIIll % lllllllllllllllIlIlIIlIllIIIIlII.length]));
            "".length();
            lllllllllllllllIlIlIIlIllIIIIIll++;
            lllllllllllllllIlIlIIlIlIlllIlll++;
            "".length();
            if ((-(82 ^ 87)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIlIllIIIIlIl);
    }

    private static void llllIlIIllllII() {
        llIIIlIlIllI = new int[52];
        llIIIlIlIllI[0] = " ".length();
        llIIIlIlIllI[1] = (33 ^ 98) & ((54 ^ 117) ^ (-1));
        llIIIlIlIllI[2] = (-18707) & 32127;
        llIIIlIlIllI[3] = (-19017) & 24573;
        llIIIlIlIllI[4] = "  ".length();
        llIIIlIlIllI[5] = "   ".length();
        llIIIlIlIllI[6] = 1 ^ 5;
        llIIIlIlIllI[7] = 31 ^ 26;
        llIIIlIlIllI[8] = 177 ^ 183;
        llIIIlIlIllI[9] = 142 ^ 137;
        llIIIlIlIllI[10] = (((25 + 11) - (-94)) + 1) ^ (((129 + 57) - 102) + 55);
        llIIIlIlIllI[11] = 144 ^ 153;
        llIIIlIlIllI[12] = 3 ^ 9;
        llIIIlIlIllI[13] = 38 ^ 45;
        llIIIlIlIllI[14] = (248 ^ 148) ^ (229 ^ 133);
        llIIIlIlIllI[15] = (((121 + 112) - 109) + 17) ^ (((105 + 101) - 126) + 48);
        llIIIlIlIllI[16] = (8 ^ 42) ^ (183 ^ 155);
        llIIIlIlIllI[17] = (62 ^ 28) ^ (42 ^ 7);
        llIIIlIlIllI[18] = (134 ^ 157) ^ (129 ^ 138);
        llIIIlIlIllI[19] = (((40 + 48) - 84) + 158) ^ (((151 + 75) - 211) + 164);
        llIIIlIlIllI[20] = (74 ^ 105) ^ (123 ^ 74);
        llIIIlIlIllI[21] = 97 ^ 114;
        llIIIlIlIllI[22] = 51 ^ 39;
        llIIIlIlIllI[23] = 104 ^ 125;
        llIIIlIlIllI[24] = (85 ^ 62) ^ (24 ^ 101);
        llIIIlIlIllI[25] = (132 ^ 191) ^ (11 ^ 39);
        llIIIlIlIllI[26] = 11 ^ 19;
        llIIIlIlIllI[27] = (((56 + 48) - 102) + 170) ^ (((148 + 168) - 271) + 136);
        llIIIlIlIllI[28] = (((36 + 54) - 83) + 172) ^ (((95 + 102) - 88) + 60);
        llIIIlIlIllI[29] = 26 ^ 1;
        llIIIlIlIllI[30] = (215 ^ 193) ^ (6 ^ 12);
        llIIIlIlIllI[31] = (82 ^ 51) ^ (230 ^ 154);
        llIIIlIlIllI[32] = 40 ^ 54;
        llIIIlIlIllI[33] = (169 ^ 150) ^ "   ".length();
        llIIIlIlIllI[34] = (((39 + 18) - (-39)) + 37) ^ (((28 + 111) - 82) + 97);
        llIIIlIlIllI[35] = (105 ^ 18) ^ (16 ^ 75);
        llIIIlIlIllI[36] = 107 ^ 74;
        llIIIlIlIllI[37] = (186 ^ 142) ^ (42 ^ 60);
        llIIIlIlIllI[38] = 63 ^ 23;
        llIIIlIlIllI[39] = (84 ^ 28) ^ (59 ^ 80);
        llIIIlIlIllI[40] = 22 ^ 50;
        llIIIlIlIllI[41] = (248 ^ 133) ^ (126 ^ 38);
        llIIIlIlIllI[42] = 115 ^ 85;
        llIIIlIlIllI[43] = 224 ^ 199;
        llIIIlIlIllI[44] = 177 ^ 152;
        llIIIlIlIllI[45] = 94 ^ 116;
        llIIIlIlIllI[46] = (((54 + 108) - 102) + 77) ^ (((7 + 102) - 68) + 121);
        llIIIlIlIllI[47] = 145 ^ 189;
        llIIIlIlIllI[48] = (40 ^ 74) ^ (242 ^ 189);
        llIIIlIlIllI[49] = (13 ^ 64) ^ (62 ^ 93);
        llIIIlIlIllI[50] = (130 ^ 163) ^ (183 ^ 185);
        llIIIlIlIllI[51] = (47 ^ 86) ^ (31 ^ 86);
    }

    private static boolean llllIlIlIIlIlI(int i, int i2) {
        return i == i2;
    }

    private K C() {
        if (llllIlIlIIIIII(this.ab.bottomless() ? 1 : 0)) {
            return K.BOTTOMLESS_BUCKET;
        }
        switch (C0032g.am[this.ab.compostType().ordinal()]) {
            case 1:
                return K.SUPER_COMPOST;
            case 2:
                return K.ULTRA_COMPOST;
            default:
                return K.COMPOST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    public boolean c(C0042q c0042q) {
        EnumC0041p b = EnumC0041p.b(c0042q.X());
        if (llllIlIIlllllI(b)) {
            return llIIIlIlIllI[0];
        }
        if (llllIlIlIIIIlI(this.aa.getLocalPlayer().distanceTo(b.Y()), b.Z())) {
            return llIIIlIlIllI[1];
        }
        C0049x a = a(b);
        N[] ae = c0042q.ae();
        int lllllllllllllllIlIlIIlllIllIllll = ae.length;
        int i = llIIIlIlIllI[1];
        while (llllIlIlIIIIIl(i, lllllllllllllllIlIlIIlllIllIllll)) {
            N n = ae[i];
            if (llllIlIlIIIIll(i(n) ? 1 : 0)) {
                "".length();
                if ((25 ^ 29) < (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (llllIlIlIIIIII(a.E(n) ? 1 : 0) && llllIlIlIIIIll(e(n) ? 1 : 0)) {
                if (!llllIlIIlllllI(a.C(n)) || !llllIlIlIIIIII(d(n) ? 1 : 0)) {
                    return llIIIlIlIllI[1];
                }
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            i++;
            "".length();
            if ((((((58 + 86) - 74) + 60) ^ (((136 + 29) - 116) + 118)) & (((((24 + 72) - 11) + 96) ^ (((45 + 101) - 101) + 99)) ^ (-" ".length()))) == ((90 ^ 22) ^ (136 ^ 192))) {
                return ((245 ^ 173) ^ (15 ^ 28)) & (((142 ^ 191) ^ (245 ^ 143)) ^ (-" ".length()));
            }
        }
        return llIIIlIlIllI[0];
    }

    private static String llllIIllllllIl(String lllllllllllllllIlIlIIlIlIllIlllI, String lllllllllllllllIlIlIIlIlIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIllIllIl.getBytes(StandardCharsets.UTF_8)), llIIIlIlIllI[10]), "DES");
            Cipher lllllllllllllllIlIlIIlIlIlllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIlIlllIIII.init(llIIIlIlIllI[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIIlIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIlIllIllll) {
            lllllllllllllllIlIlIIlIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static int llllIlIlIIIlII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllIlIlIIlIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean f(N n) {
        if (llllIlIIllllll(this.ae.b(n))) {
            ?? r0 = llIIIlIlIllI[0];
            "".length();
            return ((138 ^ 129) ^ (178 ^ 189)) <= 0 ? ((253 ^ 164) ^ (58 ^ 60)) & (((((171 + 24) - 41) + 38) ^ (((125 + 0) - 118) + 152)) ^ (-" ".length())) : r0;
        }
        return llIIIlIlIllI[1];
    }

    private static boolean llllIlIIllllll(Object obj) {
        return obj != null;
    }

    private void w() {
        this.Y.clear();
        EnumC0041p[] values = EnumC0041p.values();
        int length = values.length;
        int i = llIIIlIlIllI[1];
        while (llllIlIlIIIIIl(i, length)) {
            EnumC0041p enumC0041p = values[i];
            this.Y.put(enumC0041p, C0049x.a(this.ac, enumC0041p));
            "".length();
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return;
            }
        }
    }

    static {
        llllIlIIllllII();
        llllIlIIlllIII();
        T = LoggerFactory.getLogger(C0031f.class);
        U = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[47]]);
        V = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[48]]);
        W = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[49]]);
        X = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[50]]);
    }

    public void a(EventBus eventBus) {
        eventBus.register(this.ae);
        eventBus.register(this.af);
        this.ai = null;
        w();
    }

    public B b(A a) {
        B b = this.ag.get(a);
        if (llllIlIIlllllI(b)) {
            B b2 = B.UNKNOWN;
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
                return null;
            }
            return b2;
        }
        return b;
    }

    private static boolean llllIlIlIIIIII(int i) {
        return i != 0;
    }

    private static void llllIlIIlllIII() {
        llIIIlIIIlII = new String[llIIIlIlIllI[51]];
        llIIIlIIIlII[llIIIlIlIllI[1]] = llllIIllllllIl("2RvZnvVYxlQ=", "eWjod");
        llIIIlIIIlII[llIIIlIlIllI[0]] = llllIIllllllIl("/mLr+eQtfIW11ACZftmnew==", "JztGx");
        llIIIlIIIlII[llIIIlIlIllI[4]] = llllIIlllllllI("Gyq0V4uJBAaeB5od+fZ4xQ==", "hZMYi");
        llIIIlIIIlII[llIIIlIlIllI[5]] = llllIIllllllIl("RUqALWQ4TCClMnztSfcC6w==", "mFaej");
        llIIIlIIIlII[llIIIlIlIllI[6]] = llllIIllllllll("IgsFJDIkAwsqLzgF", "VbhAF");
        llIIIlIIIlII[llIIIlIlIllI[7]] = llllIIllllllIl("LJXIhOPhTYIUxRGTjpODSA==", "ofvKo");
        llIIIlIIIlII[llIIIlIlIllI[8]] = llllIIllllllIl("vUJJMcdedEI3uCH+tob9lZI6A0/OxizhbCPogdfAeSieuC9JPofOaw==", "QsCHn");
        llIIIlIIIlII[llIIIlIlIllI[9]] = llllIIllllllll("PioKMCA4IgQ+PSQk", "JCgUT");
        llIIIlIIIlII[llIIIlIlIllI[10]] = llllIIllllllIl("GMo7n4M5UsY=", "bPBWW");
        llIIIlIIIlII[llIIIlIlIllI[11]] = llllIIllllllll("NyI1HD0xKjsSIC0s", "CKXyI");
        llIIIlIIIlII[llIIIlIlIllI[12]] = llllIIllllllIl("DTZhkRa22nGs3MOL2WDhK+6p8rb2HSah", "VIgZd");
        llIIIlIIIlII[llIIIlIlIllI[13]] = llllIIlllllllI("P+jaN/ZM3do8vXiMpYRBPQ==", "UHbYr");
        llIIIlIIIlII[llIIIlIlIllI[14]] = llllIIlllllllI("JfJ0LTXzoKtRO3kXKvdRkA==", "cMkSl");
        llIIIlIIIlII[llIIIlIlIllI[15]] = llllIIllllllll("ARcnLzg4EDBqKyBVMTIrLQF0LTghAiAiajocNyFkbjoyLDkrAXQjOXRVLzdqKAc7J2ovVS83aiMcOj8+K1UgIykl", "NuTJJ");
        llIIIlIIIlII[llIIIlIlIllI[16]] = llllIIllllllll("FSMEBQMuZQcEFDU3Q1YpODYHBBA/IUIYAy1lDRAAKSAWVgk8ZRkLSno1EBMQMyoXBUY1JxETFCwgBlYJPCMRExJ6MgMFRiE4Ql4dJ2xCJgo7PAcERhYqAUwdJw==", "ZEbvf");
        llIIIlIIIlII[llIIIlIlIllI[17]] = llllIIllllllll("EyInNgd1LHI0DDsqNypDMj89Lxc9bSYxAD5tKSVPdT4zLgo7KnI2BiJtPT4FJigm", "UMRXc");
        llIIIlIIIlII[llIIIlIlIllI[18]] = llllIIlllllllI("8cLrhOakn5mqEuvMA/CYog==", "gqydR");
        llIIIlIIIlII[llIIIlIlIllI[19]] = llllIIllllllIl("i4PDL27GGjHywD1iWl8s8QFTnJMhGAJF", "jAKTl");
        llIIIlIIIlII[llIIIlIlIllI[20]] = llllIIllllllIl("56CqL3lbeH/JDSTMqDV9Sw==", "HqPOP");
        llIIIlIIIlII[llIIIlIlIllI[21]] = llllIIlllllllI("vjGVXhsNXOzhvL3abzoANA==", "yjTyD");
        llIIIlIIIlII[llIIIlIlIllI[22]] = llllIIlllllllI("8aUCTt3lgbCeIiBbAyMoTMXfsOrfhhW0FPgRmMFTDdbrHlEeswM2GntdPITALVHZy/V+GIMt/6tHYg37EN0Xh+7iWGCa4dHiLGweCx88uix7zT5zskeuRw==", "wqTYH");
        llIIIlIIIlII[llIIIlIlIllI[23]] = llllIIllllllll("BDwJFB4CNAcaAx4y", "pUdqj");
        llIIIlIIIlII[llIIIlIlIllI[24]] = llllIIllllllIl("5iG2rX4/BZ/azvafA2wH8CImfn+ScRtXLytd4MmhRkGyI4QDhKYaXZhYS7rASbrK", "NBauZ");
        llIIIlIIIlII[llIIIlIlIllI[25]] = llllIIlllllllI("apIm7IlzE6fbegA3z170FaPL4tPzuTBl0H0cX7Lqf9k=", "cSHhG");
        llIIIlIIIlII[llIIIlIlIllI[26]] = llllIIlllllllI("dqaQMSJfmd26vkASDbGJhlNjh5Qzbk3L", "jZRdk");
        llIIIlIIIlII[llIIIlIlIllI[27]] = llllIIllllllll("DSUfBhwLLREIARcr", "yLrch");
        llIIIlIIIlII[llIIIlIlIllI[28]] = llllIIllllllll("EBM5Bi0UAyk=", "qfMiZ");
        llIIIlIIIlII[llIIIlIlIllI[29]] = llllIIlllllllI("CISAXS3ExvpQ6x358OKdmQ==", "qfOWZ");
        llIIIlIIIlII[llIIIlIlIllI[30]] = llllIIlllllllI("pTyltQxvRLpLtqXajD5Nsg==", "FgtCd");
        llIIIlIIIlII[llIIIlIlIllI[31]] = llllIIlllllllI("5T2988+VzAHm4/lEsZKKAg==", "jZTqO");
        llIIIlIIIlII[llIIIlIlIllI[32]] = llllIIllllllIl("U6kmXH9FtRk=", "mjblX");
        llIIIlIIIlII[llIIIlIlIllI[34]] = llllIIlllllllI("ObuBf3DIZSEeEHZe/3r8qA==", "plaYR");
        llIIIlIIIlII[llIIIlIlIllI[35]] = llllIIllllllll("KTUWPxAmNw8dIiknASYUPTEHOzcmOwo=", "OTdRD");
        llIIIlIIIlII[llIIIlIlIllI[36]] = llllIIlllllllI("Ht17W0oknnkW274GkRke4A==", "LqtND");
        llIIIlIIIlII[llIIIlIlIllI[37]] = llllIIlllllllI("t9QP2KSGuE3J+q3WEMCbWQ==", "MDRUB");
        llIIIlIIIlII[llIIIlIlIllI[39]] = llllIIlllllllI("qooLchB1k0nxJ36ITlJfNQ==", "DmvvK");
        llIIIlIIIlII[llIIIlIlIllI[40]] = llllIIllllllIl("iMtG1opVRSA=", "dZOeD");
        llIIIlIIIlII[llIIIlIlIllI[41]] = llllIIllllllIl("rcl09zcLqUc=", "BAevH");
        llIIIlIIIlII[llIIIlIlIllI[42]] = llllIIllllllIl("auy2LQk0xaY=", "AoqUT");
        llIIIlIIIlII[llIIIlIlIllI[43]] = llllIIlllllllI("MitJzbc77pk=", "VkgPN");
        llIIIlIIIlII[llIIIlIlIllI[38]] = llllIIllllllll("HQQFNT4=", "NkpAV");
        llIIIlIIIlII[llIIIlIlIllI[44]] = llllIIllllllll("Pws4JCc=", "qdJPO");
        llIIIlIIIlII[llIIIlIlIllI[45]] = llllIIllllllIl("xaTH0Et+a/c=", "OJAjR");
        llIIIlIIIlII[llIIIlIlIllI[46]] = llllIIllllllll("OAwEIBw=", "kcqTt");
        llIIIlIIIlII[llIIIlIlIllI[47]] = llllIIllllllIl("JQJAwFAWaH8875AksC2aEQBpdB+hDYNRbidf3oaaT4kE3osD+cxtpiWN1cwNHXzF1O2QD31LwcwwOwhdHRgJkg==", "mrqHc");
        llIIIlIIIlII[llIIIlIlIllI[48]] = llllIIllllllIl("HV+WzxM5bPtXsH/9LLJ5BIzYB7aLwq1DBlNZMgKii5u1tu++HMRyDE3KpnU35OGbmMhQJTr/LdddWtSc2G0d5IBeTv1XHn7e", "bQIPH");
        llIIIlIIIlII[llIIIlIlIllI[49]] = llllIIllllllll("FQQgI0pvR2k4CzJMKDwYJA0tKUojCSw+SmkYOzULNQktLAwkHj05BigfLDRDYRsgJAJhRHZsCS4BOT8ZNTgwIA9/GSUkGCAQOiUaJB41eQkuATk/GTVEdmpKbEw9OA9hHzk1Bi1MKjEEZhhpPQsqCWk5HmENJylKLAM7NUonCTskAy0JYG82bw==", "AlIPj");
        llIIIlIIIlII[llIIIlIlIllI[50]] = llllIIllllllll("PC47CkQBNXIYCldmfFI4RmYGEQFINT0QCEguMwpECiM3F0QcNDcYEA0icg4NHC5yUVtUJT0UFAc1Ji0dGCNsDAgcNDMFFx02NwsYQSU9FBQHNSYlSkZs", "hFRyd");
    }

    public C0049x b(C0042q c0042q) {
        return this.Y.get(EnumC0041p.b(c0042q.X()));
    }

    private static boolean llllIlIlIIIIll(int i) {
        return i == 0;
    }

    public C0042q x() {
        if (!llllIlIIllllll(this.aj) || llllIlIlIIIIII(c(this.aj) ? 1 : 0)) {
            this.aj = y();
        }
        return this.aj;
    }

    public Map<K, Integer> A() {
        HashMap hashMap = new HashMap(B());
        ArrayList<Item> arrayList = new ArrayList();
        arrayList.addAll(Inventory.getAll());
        "".length();
        arrayList.addAll(Equipment.getAll());
        "".length();
        for (Item item : arrayList) {
            if (llllIlIIlllllI(item)) {
                "".length();
                if ((-" ".length()) >= "  ".length()) {
                    return null;
                }
            } else {
                K d = K.d(item);
                if (llllIlIIlllllI(d)) {
                    "".length();
                    if ((-" ".length()) == " ".length()) {
                        return null;
                    }
                } else {
                    if (llllIlIlIIIIII(hashMap.containsKey(d) ? 1 : 0)) {
                        hashMap.put(d, Integer.valueOf(((Integer) hashMap.get(d)).intValue() - item.getQuantity()));
                        "".length();
                    }
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (llllIlIlIIIllI(((Integer) entry.getValue()).intValue())) {
                hashMap2.put((K) entry.getKey(), (Integer) entry.getValue());
                "".length();
            }
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return hashMap2;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        H a = C0027b.a(chatMessage.getMessage());
        if (llllIlIIlllllI(a)) {
            return;
        }
        this.ae.a(this.ai, a);
    }

    private static int llllIlIlIlIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public void D() {
        this.ag.clear();
        this.ah.clear();
        this.al = null;
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean d(N n) {
        C0014an aI = n.aI();
        if (llllIlIlIIIIll(n.aL().aR() ? 1 : 0) && llllIlIIllllIl(aI.aY(), EnumC0021au.WEEDS) && llllIlIlIIIIll(aI.bb())) {
            ?? r0 = llIIIlIlIllI[0];
            "".length();
            return (((86 ^ 98) ^ (71 ^ 91)) & (((51 ^ 31) ^ (69 ^ 65)) ^ (-" ".length()))) >= "   ".length() ? ((130 ^ 181) ^ (236 ^ 186)) & (((40 ^ 69) ^ (20 ^ 24)) ^ (-" ".length())) : r0;
        }
        return llIIIlIlIllI[1];
    }

    private EnumC0022av a(P p) {
        switch (C0032g.an[p.ordinal()]) {
            case 1:
                return this.ab.defaultAllotment().bf();
            case 2:
                return this.ab.defaultHerb().bf();
            case 3:
                return this.ab.defaultFlower().bf();
            case 4:
                return this.ab.defaultBush().bf();
            default:
                return EnumC0022av.DEFAULT;
        }
    }

    @Inject
    private C0031f(C0043r c0043r, Client client, SquireFarmerConfig squireFarmerConfig, ConfigManager configManager, SquireFarmer squireFarmer, C0027b c0027b, C0034i c0034i) {
        this.Z = c0043r;
        this.aa = client;
        this.ab = squireFarmerConfig;
        this.ac = configManager;
        this.ad = squireFarmer;
        this.ae = c0027b;
        this.af = c0034i;
    }

    public Map<Integer, Integer> F() {
        HashMap hashMap = new HashMap();
        long epochSecond = Instant.now().getEpochSecond();
        EnumC0041p[] W2 = EnumC0041p.W();
        int length = W2.length;
        int lllllllllllllllIlIlIIllIIlIIIIII = llIIIlIlIllI[1];
        while (llllIlIlIIIIIl(lllllllllllllllIlIlIIllIIlIIIIII, length)) {
            EnumC0041p enumC0041p = W2[lllllllllllllllIlIlIIllIIlIIIIII];
            if (llllIlIlIIIIll(b(enumC0041p) ? 1 : 0)) {
                "".length();
                if ((-((((35 + 139) - 160) + 131) ^ (((18 + 139) - 71) + 63))) > 0) {
                    return null;
                }
            } else {
                C0049x a = a(enumC0041p);
                N[] ae = this.Z.af().get(enumC0041p).ae();
                int length2 = ae.length;
                int lllllllllllllllIlIlIIllIIIlllIlI = llIIIlIlIllI[1];
                while (llllIlIlIIIIIl(lllllllllllllllIlIlIIllIIIlllIlI, length2)) {
                    N n = ae[lllllllllllllllIlIlIIllIIIlllIlI];
                    if (llllIlIlIIIIll(i(n) ? 1 : 0)) {
                        "".length();
                        if ((((131 ^ 188) ^ (110 ^ 21)) & (((((97 + 63) - 77) + 142) ^ (((10 + 43) - 16) + 128)) ^ (-" ".length()))) <= (-" ".length())) {
                            return null;
                        }
                    } else {
                        C0013am j = j(n);
                        if (llllIlIIllllll(j) && llllIlIlIIIllI(llllIlIlIlIIII(j.ba(), epochSecond))) {
                            "".length();
                            if ("  ".length() < 0) {
                                return null;
                            }
                        } else {
                            EnumC0022av C = a.C(n);
                            if (llllIlIIlllllI(C)) {
                                "".length();
                                if (" ".length() <= 0) {
                                    return null;
                                }
                            } else {
                                if (llllIlIIllllIl(C, EnumC0022av.DEFAULT)) {
                                    C = a(n.aL());
                                    if (llllIlIIlllllI(C)) {
                                        "".length();
                                        if (0 != 0) {
                                            return null;
                                        }
                                    }
                                }
                                hashMap.put(Integer.valueOf(C.aA()), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(C.aA()), Integer.valueOf(llIIIlIlIllI[1]))).intValue() + C.bl()));
                                "".length();
                            }
                        }
                    }
                    lllllllllllllllIlIlIIllIIIlllIlI++;
                    "".length();
                    if (" ".length() < (((158 ^ 181) ^ (16 ^ 122)) & (((49 ^ 52) ^ (199 ^ 131)) ^ (-" ".length())))) {
                        return null;
                    }
                }
            }
            lllllllllllllllIlIlIIllIIlIIIIII++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        for (Item item : Inventory.getAll()) {
            if (llllIlIlIIIIII(hashMap.containsKey(Integer.valueOf(item.getId())) ? 1 : 0)) {
                int lllllllllllllllIlIlIIllIIlIIIIII2 = ((Integer) hashMap.get(Integer.valueOf(item.getId()))).intValue() - item.getQuantity();
                if (llllIlIlIIIlIl(lllllllllllllllIlIlIIllIIlIIIIII2)) {
                    hashMap.remove(Integer.valueOf(item.getId()));
                    "".length();
                    "".length();
                    if (((90 ^ 13) & ((220 ^ 139) ^ (-1))) >= "  ".length()) {
                        return null;
                    }
                } else {
                    hashMap.put(Integer.valueOf(item.getId()), Integer.valueOf(lllllllllllllllIlIlIIllIIlIIIIII2));
                    "".length();
                }
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return hashMap;
    }

    public C0013am j(N n) {
        return a(n, this.ac.getRSProfileKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    private boolean e(N n) {
        C0049x b = b(n.aM());
        if (llllIlIIlllllI(b)) {
            return llIIIlIlIllI[0];
        }
        C0014an aI = n.aI();
        if (llllIlIlIIIIll(n.aL().aR() ? 1 : 0) && llllIlIlIIIIII(b.E(n) ? 1 : 0) && !llllIlIlIIIIll(b.F(n) ? 1 : 0)) {
            if (llllIlIIllllIl(n.aL(), P.BUSH) && llllIlIlIIIIll(aI.bb()) && llllIlIlIIIlll(aI.aY(), EnumC0021au.WEEDS)) {
                return llIIIlIlIllI[0];
            }
            if (!llllIlIIllllIl(aI.aZ(), EnumC0039n.GROWING) || ((llllIlIlIIIlll(aI.aY(), EnumC0021au.GRAPE) && !llllIlIlIIIIII(f(n) ? 1 : 0)) || !llllIlIlIIIlll(aI.aY(), EnumC0021au.WEEDS))) {
                return llIIIlIlIllI[1];
            }
            ?? r0 = llIIIlIlIllI[0];
            "".length();
            return " ".length() <= (((37 ^ 28) ^ (214 ^ 188)) & (((156 ^ 166) ^ (1 ^ 104)) ^ (-" ".length()))) ? ((((90 + 88) - 153) + 129) ^ (((23 + 81) - 21) + 75)) & (((241 ^ 151) ^ (110 ^ 12)) ^ (-" ".length())) : r0;
        }
        return llIIIlIlIllI[0];
    }

    private static boolean llllIlIlIIIlIl(int i) {
        return i <= 0;
    }

    public void b(EventBus eventBus) {
        eventBus.unregister(this.ae);
        eventBus.unregister(this.af);
        this.ai = null;
        w();
    }

    private static boolean llllIlIlIIllll(int i) {
        return i < 0;
    }

    public N v() {
        if (!llllIlIIllllll(this.ai) || !llllIlIlIIIIII(this.ai.aM().a(this.aa) ? 1 : 0) || llllIlIlIIIIII(e(this.ai) ? 1 : 0)) {
            this.ai = z();
        }
        return this.ai;
    }

    public boolean b(EnumC0041p enumC0041p) {
        return a(enumC0041p).aj();
    }

    private N z() {
        C0042q x = x();
        if (llllIlIIlllllI(x)) {
            return null;
        }
        return (N) Arrays.stream(x.ae()).filter(n -> {
            if (llllIlIlIIIIll(e(n) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (157 ^ 153) <= "   ".length() ? "   ".length() & ("   ".length() ^ (-1)) : r0;
            }
            return llIIIlIlIllI[1];
        }).filter(this::i).filter(n2 -> {
            if (!llllIlIIlllllI(h(n2)) || llllIlIlIIIIll(d(n2) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (((((91 + 200) - 245) + 162) ^ (((119 + 30) - 25) + 35)) & (((7 ^ 99) ^ (12 ^ 39)) ^ (-" ".length()))) != 0 ? ((186 ^ 134) ^ (109 ^ 96)) & (((199 ^ 174) ^ (220 ^ 132)) ^ (-" ".length())) : r0;
            }
            return llIIIlIlIllI[1];
        }).findFirst().orElse(null);
    }

    private Map<K, Integer> B() {
        HashMap hashMap = new HashMap();
        C0042q x = x();
        if (llllIlIIlllllI(x)) {
            return hashMap;
        }
        if (llllIlIlIIIIII(Arrays.stream(x.ae()).filter(n -> {
            if (llllIlIIllllll(h(n))) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return "  ".length() < 0 ? ((240 ^ 152) ^ (236 ^ 163)) & ((((112 ^ 32) & ((118 ^ 38) ^ (-1))) ^ (68 ^ 99)) ^ (-" ".length())) : r0;
            }
            return llIIIlIlIllI[1];
        }).anyMatch(n2 -> {
            if (llllIlIIllllIl(n2.aI().aY(), EnumC0021au.WEEDS) && llllIlIlIIIllI(n2.aI().bb())) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.put(K.RAKE, Integer.valueOf(llIIIlIlIllI[0]));
            "".length();
        }
        hashMap.put(K.SEED_DIBBER, Integer.valueOf(llIIIlIlIllI[0]));
        "".length();
        hashMap.put(K.SECATEURS, Integer.valueOf(llIIIlIlIllI[0]));
        "".length();
        hashMap.put(K.SPADE, Integer.valueOf(llIIIlIlIllI[0]));
        "".length();
        List list = (List) Arrays.stream(x.ae()).filter(n3 -> {
            if (llllIlIlIIIIll(n3.aL().aR() ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }).filter(n4 -> {
            if (llllIlIlIIIIll(f(n4) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }).filter(this::i).collect(Collectors.toList());
        int count = (int) Arrays.stream(x.ae()).filter(n5 -> {
            if (llllIlIlIIIIll(n5.aL().aR() ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (-"  ".length()) > 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
            }
            return llIIIlIlIllI[1];
        }).count();
        int lllllllllllllllIlIlIIlllIIlIllll = Arrays.stream(x.ae()).anyMatch(n6 -> {
            if (llllIlIIllllIl(n6.aI().aZ(), EnumC0039n.DISEASED)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return ((26 ^ 72) & ((6 ^ 84) ^ (-1))) > (158 ^ 154) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0;
        if (llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIlIllll)) {
            hashMap.put(K.PLANT_CURE, Integer.valueOf(llIIIlIlIllI[0]));
            "".length();
        }
        C0049x b = b(x);
        if (llllIlIIllllIl(this.ab.compostTypeFlowers(), H.LUNAR_SPELL)) {
            return hashMap;
        }
        if (llllIlIlIIIlll(b.an(), EnumC0018ar.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n7 -> {
            if (llllIlIlIIIIII(i(n7) ? 1 : 0) && llllIlIIllllIl(n7.aL(), P.FLOWER)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return " ".length() <= 0 ? ((234 ^ 186) ^ (56 ^ 110)) & (((((82 + 113) - 49) + 14) ^ (((12 + 94) - 10) + 70)) ^ (-" ".length())) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(this.ab.compostTypeFlowers().aC(), k, num -> {
                int intValue;
                if (llllIlIIlllllI(num)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if ((((28 ^ 89) ^ (44 ^ 115)) & (((79 ^ 41) ^ (104 ^ 20)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                } else {
                    intValue = num.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        H compostType = this.ab.compostType();
        if (llllIlIIllllIl(compostType, H.LUNAR_SPELL)) {
            return hashMap;
        }
        if (llllIlIlIIIlll(b.am(), EnumC0016ap.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n8 -> {
            if (llllIlIlIIIIII(i(n8) ? 1 : 0) && llllIlIIllllIl(n8.aL(), P.ALLOTMENT) && llllIlIlIIIIII(n8.ac().contains(llIIIlIIIlII[llIIIlIlIllI[46]]) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(compostType.aC(), k2, num2 -> {
                int intValue;
                if (llllIlIIlllllI(num2)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if (((((63 + 43) - (-12)) + 39) ^ (((152 + 33) - 127) + 95)) < "   ".length()) {
                        return null;
                    }
                } else {
                    intValue = num2.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        if (llllIlIlIIIlll(b.al(), EnumC0016ap.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n9 -> {
            if (llllIlIlIIIIII(i(n9) ? 1 : 0) && llllIlIIllllIl(n9.aL(), P.ALLOTMENT) && llllIlIlIIIIII(n9.ac().contains(llIIIlIIIlII[llIIIlIlIllI[45]]) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (-" ".length()) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(compostType.aC(), k3, num3 -> {
                int intValue;
                if (llllIlIIlllllI(num3)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if ("   ".length() == ((126 ^ 77) ^ (93 ^ 106))) {
                        return null;
                    }
                } else {
                    intValue = num3.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        if (llllIlIlIIIlll(b.ak(), EnumC0020at.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n10 -> {
            if (llllIlIlIIIIII(i(n10) ? 1 : 0) && llllIlIIllllIl(n10.aL(), P.HERB)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (((31 ^ 92) ^ (129 ^ 140)) & (((226 ^ 166) ^ (124 ^ 118)) ^ (-" ".length()))) != 0 ? ((141 ^ 146) ^ (40 ^ 63)) & (((((124 + 145) - 91) + 8) ^ (((17 + 143) - 67) + 85)) ^ (-" ".length())) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(compostType.aC(), k4, num4 -> {
                int intValue;
                if (llllIlIIlllllI(num4)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    intValue = num4.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        if (llllIlIlIIIlll(b.aq(), EnumC0024ax.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n11 -> {
            if (llllIlIlIIIIII(i(n11) ? 1 : 0) && llllIlIIllllIl(n11.aL(), P.SEAWEED) && llllIlIlIIIIII(n11.ac().contains(llIIIlIIIlII[llIIIlIlIllI[44]]) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return ((47 ^ 116) ^ (155 ^ 196)) <= 0 ? ((((35 + 127) - 93) + 84) ^ (((155 + 96) - 150) + 83)) & (((214 ^ 137) ^ (39 ^ 89)) ^ (-" ".length())) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(compostType.aC(), k5, num5 -> {
                int intValue;
                if (llllIlIIlllllI(num5)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if ((-" ".length()) >= "   ".length()) {
                        return null;
                    }
                } else {
                    intValue = num5.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        if (llllIlIlIIIlll(b.aq(), EnumC0024ax.NOTHING) && llllIlIlIIIIII(list.stream().anyMatch(n12 -> {
            if (llllIlIlIIIIII(i(n12) ? 1 : 0) && llllIlIIllllIl(n12.aL(), P.SEAWEED) && llllIlIlIIIIII(n12.ac().contains(llIIIlIIIlII[llIIIlIlIllI[38]]) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        }) ? 1 : 0)) {
            hashMap.compute(compostType.aC(), k6, num6 -> {
                int intValue;
                if (llllIlIIlllllI(num6)) {
                    intValue = llIIIlIlIllI[0];
                    "".length();
                    if (" ".length() > (178 ^ 182)) {
                        return null;
                    }
                } else {
                    intValue = num6.intValue() + llIIIlIlIllI[0];
                }
                return Integer.valueOf(intValue);
            });
            "".length();
        }
        if (llllIlIlIIIIII(this.ab.bottomless() ? 1 : 0)) {
            hashMap.put(K.BOTTOMLESS_BUCKET, Integer.valueOf(llIIIlIlIllI[0]));
            "".length();
            hashMap.remove(compostType.aC());
            "".length();
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    private boolean a(C0014an c0014an, C0014an c0014an2) {
        int bd = c0014an.bd();
        EnumC0039n aZ = c0014an.aZ();
        EnumC0039n aZ2 = c0014an2.aZ();
        EnumC0021au aY = c0014an.aY();
        if (llllIlIlIIIlll(aY, EnumC0021au.WEEDS) && llllIlIlIIIlll(c0014an2.aY(), EnumC0021au.WEEDS) && llllIlIIllllIl(c0014an2.aY(), aY) && !llllIlIlIIIlIl(bd)) {
            if (llllIlIIllllIl(aZ, EnumC0039n.GROWING)) {
                if ((llllIlIIllllIl(aZ2, EnumC0039n.GROWING) && !llllIlIlIIlIIl(c0014an2.bb() - c0014an.bb(), llIIIlIlIllI[0])) || llllIlIIllllIl(aZ2, EnumC0039n.DISEASED)) {
                    T.debug(llIIIlIIIlII[llIIIlIlIllI[24]]);
                    return llIIIlIlIllI[0];
                } else if (llllIlIIllllIl(aZ2, EnumC0039n.HARVESTABLE) && llllIlIlIIIIll(aY.bh().aX() ? 1 : 0)) {
                    T.debug(llIIIlIIIlII[llIIIlIlIllI[25]]);
                    return llIIIlIlIllI[0];
                }
            }
            if (llllIlIIllllIl(aZ, EnumC0039n.DISEASED) && llllIlIIllllIl(aZ2, EnumC0039n.DEAD)) {
                T.debug(llIIIlIIIlII[llIIIlIlIllI[26]]);
                return llIIIlIlIllI[0];
            }
            return llIIIlIlIllI[1];
        }
        return llIIIlIlIllI[1];
    }

    public long a(int lllllllllllllllIlIlIIllIlIIIlIlI, int i, long j, String str) {
        Integer num = (Integer) this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[34]], str, llIIIlIIIlII[llIIIlIlIllI[35]], Integer.TYPE);
        Integer num2 = (Integer) this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[36]], str, llIIIlIIIlII[llIIIlIlIllI[37]], Integer.TYPE);
        long j2 = 0;
        if (llllIlIIllllll(num) && llllIlIIllllll(num2) && (!llllIlIlIIIIIl(num.intValue(), lllllllllllllllIlIlIIllIlIIIlIlI) || llllIlIlIIllII(num.intValue(), llIIIlIlIllI[38]))) {
            j2 = (num2.intValue() % lllllllllllllllIlIlIIllIlIIIlIlI) * 60;
        }
        long j3 = j + j2;
        return ((j3 - (j3 % (lllllllllllllllIlIlIIllIlIIIlIlI * 60))) + ((i * lllllllllllllllIlIlIIllIlIIIlIlI) * 60)) - j2;
    }

    public Item h(N n) {
        if (llllIlIIllllIl(n.aL(), P.GRAPES)) {
            int[] iArr = new int[llIIIlIlIllI[0]];
            iArr[llIIIlIlIllI[1]] = EnumC0022av.GRAPES.aA();
            return Inventory.getFirst(iArr);
        }
        EnumC0022av C = b(n.aM()).C(n);
        if (llllIlIIlllllI(C)) {
            return null;
        }
        if (llllIlIIllllIl(C, EnumC0022av.DEFAULT)) {
            C = a(n.aL());
        }
        if (!llllIlIlIIIlll(C, EnumC0022av.DEFAULT) || llllIlIIlllllI(C)) {
            return null;
        }
        int[] iArr2 = new int[llIIIlIlIllI[0]];
        iArr2[llIIIlIlIllI[1]] = C.aA();
        Item first = Inventory.getFirst(iArr2);
        if (!llllIlIIllllll(first) || llllIlIlIIIIIl(first.getQuantity(), C.bl())) {
            return null;
        }
        return first;
    }

    private static boolean llllIlIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    public C0049x a(EnumC0041p enumC0041p) {
        return this.Y.get(enumC0041p);
    }

    private static boolean llllIlIlIIllII(int i, int i2) {
        return i >= i2;
    }

    private void E() {
        B b;
        long j;
        for (Map.Entry<A, Set<N>> entry : this.Z.ah().entrySet()) {
            long j2 = 0;
            int i = llIIIlIlIllI[0];
            int i2 = llIIIlIlIllI[0];
            for (N n : entry.getValue()) {
                C0013am j3 = j(n);
                if (llllIlIIllllll(j3)) {
                    if (llllIlIlIIllll(j3.aY().au())) {
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return;
                        }
                    } else {
                        i = llIIIlIlIllI[1];
                        if (llllIlIlIIIlll(j3.aY(), EnumC0021au.WEEDS) && llllIlIlIIIlll(j3.aY(), EnumC0021au.SCARECROW)) {
                            i2 = llIIIlIlIllI[1];
                            j2 = Math.max(j2, j3.ba());
                        }
                        "".length();
                        if (" ".length() > " ".length()) {
                            return;
                        }
                    }
                }
            }
            if (llllIlIlIIIIII(i)) {
                b = B.UNKNOWN;
                j = -1;
                "".length();
                if ((((207 ^ 180) ^ (59 ^ 108)) & (((((113 + 131) - 102) + 47) ^ (((94 + 67) - 142) + 126)) ^ (-" ".length()))) != (((181 ^ 163) ^ (131 ^ 178)) & (((1 ^ 41) ^ (12 ^ 3)) ^ (-" ".length())))) {
                    return;
                }
            } else if (llllIlIlIIIIII(i2)) {
                b = B.EMPTY;
                j = -1;
                "".length();
                if (" ".length() >= (161 ^ 165)) {
                    return;
                }
            } else if (llllIlIlIIIlIl(llllIlIlIIlllI(j2, Instant.now().getEpochSecond()))) {
                b = B.COMPLETED;
                j = 0;
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                b = B.IN_PROGRESS;
                j = j2;
            }
            this.ag.put(entry.getKey(), b);
            "".length();
            this.ah.put(entry.getKey(), Long.valueOf(j));
            "".length();
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return;
            }
        }
    }

    public Item g(N n) {
        H compostType;
        Item first;
        if (llllIlIIllllIl(n.aL(), P.GRAPES)) {
            int[] iArr = new int[llIIIlIlIllI[0]];
            iArr[llIIIlIlIllI[1]] = llIIIlIlIllI[2];
            return Inventory.getFirst(iArr);
        }
        if (llllIlIIllllIl(n.aL(), P.FLOWER)) {
            compostType = this.ab.compostTypeFlowers();
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        } else {
            compostType = this.ab.compostType();
        }
        H h = compostType;
        if (llllIlIIllllIl(this.ab.compostTypeFlowers(), this.ab.compostType())) {
            first = Inventory.getFirst(item -> {
                if (llllIlIlIIIIII(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[42]]) ? 1 : 0) && llllIlIlIIIIll(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[43]]) ? 1 : 0)) {
                    ?? r0 = llIIIlIlIllI[0];
                    "".length();
                    return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIlIlIllI[1];
            });
            "".length();
            if ((-" ".length()) >= (((((146 + 98) - 151) + 58) ^ (((143 + 25) - 68) + 93)) & (((((139 + 199) - 264) + 129) ^ (((65 + 111) - 47) + 28)) ^ (-" ".length())))) {
                return null;
            }
        } else {
            int[] iArr2 = new int[llIIIlIlIllI[0]];
            iArr2[llIIIlIlIllI[1]] = h.aB();
            first = Inventory.getFirst(iArr2);
        }
        return (!llllIlIIlllllI(first) || (llllIlIlIIIlll(this.ab.compostTypeFlowers(), this.ab.compostType()) && !llllIlIlIIIlll(n.aL(), P.FLOWER))) ? first : Inventory.getFirst(item2 -> {
            if (llllIlIlIIIIII(item2.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[40]]) ? 1 : 0) && llllIlIlIIIIll(item2.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[41]]) ? 1 : 0)) {
                ?? r0 = llIIIlIlIllI[0];
                "".length();
                return (0 ^ 4) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIllI[1];
        });
    }

    private static String llllIIlllllllI(String lllllllllllllllIlIlIIlIllIlIIIll, String lllllllllllllllIlIlIIlIllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIllIlIIlIl.init(llIIIlIlIllI[4], secretKeySpec);
            return new String(lllllllllllllllIlIlIIlIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIlIllIlIIlII) {
            lllllllllllllllIlIlIIlIllIlIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean b(String str) {
        if (llllIlIlIIIIll(str.contains(llIIIlIIIlII[llIIIlIlIllI[1]]) ? 1 : 0)) {
            return llIIIlIlIllI[1];
        }
        if (llllIlIlIIIIll(U.matcher(str).matches() ? 1 : 0) && llllIlIlIIIIll(V.matcher(str).find() ? 1 : 0) && llllIlIlIIIIll(W.matcher(str).matches() ? 1 : 0) && !llllIlIlIIIIII(X.matcher(str).matches() ? 1 : 0)) {
            return llIIIlIlIllI[1];
        }
        ?? r0 = llIIIlIlIllI[0];
        "".length();
        return (-" ".length()) > " ".length() ? ((61 ^ 28) ^ (163 ^ 198)) & (((179 ^ 158) ^ (90 ^ 51)) ^ (-" ".length())) : r0;
    }
}
