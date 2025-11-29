/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aS;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

@TaskDesc(name="Handling babboon prayers", priority=0x7FFFFFFF, register=true)
public class aR
extends W {
    private static final /* synthetic */ int em;
    private final /* synthetic */ Map<Integer, List<aS>> en;
    private static final /* synthetic */ int el;
    private static /* synthetic */ int[] llIlIlllllI;
    private static /* synthetic */ String[] llIlIllllIl;
    private static final /* synthetic */ int ek;

    private static boolean lIlIlIIIIlllII(Object object) {
        return object == null;
    }

    @Override
    public boolean aL() {
        boolean bl2;
        if (aR.lIlIlIIIIlIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().contains(llIlIllllIl[llIlIlllllI[8]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];
                "".length();
                if ((0x56 ^ 0x52) < 0) {
                    return ((0x6B ^ 8) & ~(0x59 ^ 0x3A)) != 0;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }))) {
            bl2 = llIlIlllllI[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0xB6 ^ 0x9E) & ~(0x1A ^ 0x32)) != 0;
            }
        } else {
            bl2 = llIlIlllllI[3];
        }
        return bl2;
    }

    @Inject
    public aR(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.en = new HashMap<Integer, List<aS>>();
    }

    /*
     * WARNING - void declaration
     */
    private Prayer m(int n2) {
        void llllllllllllllllIIllIIIIlIIIlIII;
        Collection collection = this.en.get(n2);
        if (!aR.lIlIlIIIIlIlll(collection) || aR.lIlIlIIIIllIlI(collection.isEmpty() ? 1 : 0)) {
            return null;
        }
        Prayer llllllllllllllllIIllIIIIlIIIIlll = null;
        int llllllllllllllllIIllIIIIlIIIIllI = llIlIlllllI[3];
        int llllllllllllllllIIllIIIIlIIIIlIl = llIlIlllllI[3];
        int llllllllllllllllIIllIIIIlIIIIlII = llIlIlllllI[3];
        Iterator llllllllllllllllIIllIIIIlIIIIIll = llllllllllllllllIIllIIIIlIIIlIII.iterator();
        while (aR.lIlIlIIIIllIlI(llllllllllllllllIIllIIIIlIIIIIll.hasNext() ? 1 : 0)) {
            aS llllllllllllllllIIllIIIIlIIIIIlI = (aS)llllllllllllllllIIllIIIIlIIIIIll.next();
            if (!aR.lIlIlIIIIlIlll(llllllllllllllllIIllIIIIlIIIIIlI.bH())) continue;
            if (aR.lIlIlIIIIllIlI(llllllllllllllllIIllIIIIlIIIIIlI.bH().isDead() ? 1 : 0)) {
                "".length();
                if (null == null) continue;
                return null;
            }
            if (aR.lIlIlIIIIllIll(llllllllllllllllIIllIIIIlIIIIIlI.bI(), Prayer.PROTECT_FROM_MELEE) && aR.lIlIlIIIIlllII(llllllllllllllllIIllIIIIlIIIIlll)) {
                ++llllllllllllllllIIllIIIIlIIIIlII;
                llllllllllllllllIIllIIIIlIIIIlll = Prayer.PROTECT_FROM_MELEE;
            }
            if (aR.lIlIlIIIIllIll(llllllllllllllllIIllIIIIlIIIIIlI.bI(), Prayer.PROTECT_FROM_MAGIC) && (!aR.lIlIlIIIIlllIl(llllllllllllllllIIllIIIIlIIIIlll, Prayer.PROTECT_FROM_MELEE) || aR.lIlIlIIIIlllII(llllllllllllllllIIllIIIIlIIIIlll))) {
                llllllllllllllllIIllIIIIlIIIIllI += 2;
                llllllllllllllllIIllIIIIlIIIIlll = Prayer.PROTECT_FROM_MAGIC;
            }
            if (aR.lIlIlIIIIllIll(llllllllllllllllIIllIIIIlIIIIIlI.bI(), Prayer.PROTECT_FROM_MISSILES)) {
                llllllllllllllllIIllIIIIlIIIIlIl += 2;
                llllllllllllllllIIllIIIIlIIIIlll = Prayer.PROTECT_FROM_MISSILES;
            }
            "".length();
            if ((44 + 7 - -7 + 108 ^ 47 + 89 - -13 + 14) > 0) continue;
            return null;
        }
        if (aR.lIlIlIIIIllIII(llllllllllllllllIIllIIIIlIIIIllI, llllllllllllllllIIllIIIIlIIIIlIl) && aR.lIlIlIIIIllIII(llllllllllllllllIIllIIIIlIIIIllI, llllllllllllllllIIllIIIIlIIIIlII)) {
            return Prayer.PROTECT_FROM_MAGIC;
        }
        if (aR.lIlIlIIIIllIII(llllllllllllllllIIllIIIIlIIIIlII, llllllllllllllllIIllIIIIlIIIIlIl)) {
            return Prayer.PROTECT_FROM_MELEE;
        }
        return Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean lIlIlIIIIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIIIIllIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int aO() {
        return llIlIlllllI[2];
    }

    private static boolean lIlIlIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlIIIIlIIll(String llllllllllllllllIIllIIIIIlIIIllI, String llllllllllllllllIIllIIIIIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIIIIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIIIIlIIlIII.init(llIlIlllllI[0], llllllllllllllllIIllIIIIIlIIlIIl);
            return new String(llllllllllllllllIIllIIIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIIlIIIlll) {
            llllllllllllllllIIllIIIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        aR llllllllllllllllIIllIIIIlIIllIII;
        NPC llllllllllllllllIIllIIIIlIIlIlII;
        Prayer llllllllllllllllIIllIIIIlIIlIlIl;
        void llllllllllllllllIIllIIIIlIIlIllI;
        void llllllllllllllllIIllIIIIlIIlIlll;
        int n2 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[12]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];
                "".length();
                if (-" ".length() >= (0x91 ^ 0x95)) {
                    return ((0x52 ^ 0x75) & ~(0xB7 ^ 0x90)) != 0;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }).size();
        int n3 = NPCs.getAll(nPC -> {
            int n2;
            if (aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[11]]) ? 1 : 0) && aR.lIlIlIIIIlllll(nPC.isDead() ? 1 : 0)) {
                n2 = llIlIlllllI[1];
                "".length();
                if ("   ".length() < 0) {
                    return ((0xDE ^ 0x84) & ~(0x63 ^ 0x39)) != 0;
                }
            } else {
                n2 = llIlIlllllI[3];
            }
            return n2 != 0;
        }).size();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        if (aR.lIlIlIIIIlIllI(n3, n2)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (null != null) {
                return null;
            }
        } else if (aR.lIlIlIIIIlIllI((int)llllllllllllllllIIllIIIIlIIlIlll, (int)llllllllllllllllIIllIIIIlIIlIllI)) {
            llllllllllllllllIIllIIIIlIIlIlIl = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        } else {
            llllllllllllllllIIllIIIIlIIlIlII = NPCs.getNearest(nPC -> {
                boolean bl2;
                NPC llllllllllllllllIIllIIIIIllIlIlI;
                if ((!aR.lIlIlIIIIlllll(nPC.getName().equals(llIlIllllIl[llIlIlllllI[9]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(nPC.getName().equals(llIlIllllIl[llIlIlllllI[10]]) ? 1 : 0)) && aR.lIlIlIIIIlllll(llllllllllllllllIIllIIIIIllIlIlI.isDead() ? 1 : 0)) {
                    bl2 = llIlIlllllI[1];
                    "".length();
                    if ((0x44 ^ 0x18 ^ (0xC1 ^ 0x99)) <= "  ".length()) {
                        return ((0xDE ^ 0x9D ^ (0x5A ^ 0x2A)) & (55 + 25 - 66 + 227 ^ 80 + 39 - -19 + 56 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIlIlllllI[3];
                }
                return bl2;
            });
            if (!aR.lIlIlIIIIlIlll(llllllllllllllllIIllIIIIlIIlIlII) || aR.lIlIlIIIIllIII(llllllllllllllllIIllIIIIlIIlIlII.distanceTo((Locatable)Players.getLocal()), llIlIlllllI[0])) {
                if (aR.lIlIlIIIIllIIl((int)llllllllllllllllIIllIIIIlIIlIllI)) {
                    llllllllllllllllIIllIIIIlIIlIlIl = Prayer.PROTECT_FROM_MAGIC;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            } else {
                llllllllllllllllIIllIIIIlIIlIlIl = Prayer.PROTECT_FROM_MELEE;
            }
        }
        if (aR.lIlIlIIIIlIlll(llllllllllllllllIIllIIIIlIIlIlII = llllllllllllllllIIllIIIIlIIllIII.m(Static.getClient().getTickCount() + llIlIlllllI[1]))) {
            llllllllllllllllIIllIIIIlIIlIlIl = llllllllllllllllIIllIIIIlIIlIlII;
        }
        if (aR.lIlIlIIIIlIlll(llllllllllllllllIIllIIIIlIIlIlIl)) {
            return List.of(llllllllllllllllIIllIIIIlIIllIII.aQ(), llllllllllllllllIIllIIIIlIIlIlIl);
        }
        return List.of(this.aQ());
    }

    private static boolean lIlIlIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIIIIlIIIl(String llllllllllllllllIIllIIIIIlIllIll, String llllllllllllllllIIllIIIIIlIlIlIl) {
        llllllllllllllllIIllIIIIIlIllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIIIlIllIIl = new StringBuilder();
        char[] llllllllllllllllIIllIIIIIlIllIII = llllllllllllllllIIllIIIIIlIlIlIl.toCharArray();
        int llllllllllllllllIIllIIIIIlIlIlll = llIlIlllllI[3];
        char[] llllllllllllllllIIllIIIIIlIlIIIl = llllllllllllllllIIllIIIIIlIllIll.toCharArray();
        int llllllllllllllllIIllIIIIIlIlIIII = llllllllllllllllIIllIIIIIlIlIIIl.length;
        int llllllllllllllllIIllIIIIIlIIllll = llIlIlllllI[3];
        while (aR.lIlIlIIIlIIIII(llllllllllllllllIIllIIIIIlIIllll, llllllllllllllllIIllIIIIIlIlIIII)) {
            char llllllllllllllllIIllIIIIIlIlllII = llllllllllllllllIIllIIIIIlIlIIIl[llllllllllllllllIIllIIIIIlIIllll];
            llllllllllllllllIIllIIIIIlIllIIl.append((char)(llllllllllllllllIIllIIIIIlIlllII ^ llllllllllllllllIIllIIIIIlIllIII[llllllllllllllllIIllIIIIIlIlIlll % llllllllllllllllIIllIIIIIlIllIII.length]));
            "".length();
            ++llllllllllllllllIIllIIIIIlIlIlll;
            ++llllllllllllllllIIllIIIIIlIIllll;
            "".length();
            if ((0x14 ^ 0x10) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIIIIlIllIIl);
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIlIlIIIIlIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return llIlIlllllI[1];
    }

    /*
     * WARNING - void declaration
     */
    private void a(Actor actor, Prayer prayer) {
        int n2 = Static.getClient().getTickCount() + llIlIlllllI[8];
        aS aS2 = new aS(actor, prayer);
        if (aR.lIlIlIIIIlllll(this.en.containsKey(n2) ? 1 : 0)) {
            ArrayList<aS> arrayList = new ArrayList<aS>();
            arrayList.add(aS2);
            "".length();
            this.en.put(n2, arrayList);
            "".length();
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        } else {
            void llllllllllllllllIIllIIIIIllIllll;
            void llllllllllllllllIIllIIIIIlllIIII;
            aR llllllllllllllllIIllIIIIIlllIIll;
            List<aS> llllllllllllllllIIllIIIIIllIlllI = llllllllllllllllIIllIIIIIlllIIll.en.get((int)llllllllllllllllIIllIIIIIlllIIII);
            llllllllllllllllIIllIIIIIllIlllI.add((aS)llllllllllllllllIIllIIIIIllIllll);
            "".length();
            llllllllllllllllIIllIIIIIlllIIll.en.put((int)llllllllllllllllIIllIIIIIlllIIII, llllllllllllllllIIllIIIIIllIlllI);
            "".length();
        }
    }

    private static void lIlIlIIIIlIlII() {
        llIlIllllIl = new String[llIlIlllllI[15]];
        aR.llIlIllllIl[aR.llIlIlllllI[3]] = aR.lIlIlIIIIlIIIl("MDABGAsccS4WAxc=", "rQcwd");
        aR.llIlIllllIl[aR.llIlIlllllI[1]] = aR.lIlIlIIIIlIIIl("IQsIOSUNSj4+OAwdDyQ=", "cjjVJ");
        aR.llIlIllllIl[aR.llIlIlllllI[0]] = aR.lIlIlIIIIlIIIl("ABUnAAwsVAcdAjUYIB0=", "BtEoc");
        aR.llIlIllllIl[aR.llIlIlllllI[7]] = aR.lIlIlIIIIlIIlI("Qu9RZ4filMU8F0x4347QNQ==", "LdflL");
        aR.llIlIllllIl[aR.llIlIlllllI[8]] = aR.lIlIlIIIIlIIIl("FQ0RHQ05", "Wlsrb");
        aR.llIlIllllIl[aR.llIlIlllllI[9]] = aR.lIlIlIIIIlIIll("3gl2wRlC5+Sk6U33VOynVg==", "IkAYg");
        aR.llIlIllllIl[aR.llIlIlllllI[10]] = aR.lIlIlIIIIlIIIl("IAsXJycMSiEgOgMGGQ==", "bjuHH");
        aR.llIlIllllIl[aR.llIlIlllllI[11]] = aR.lIlIlIIIIlIIlI("+OASkhbXjgXxW2+/v98YXA==", "ECnvB");
        aR.llIlIllllIl[aR.llIlIlllllI[12]] = aR.lIlIlIIIIlIIll("2lqRTC6/i96pmOR6PCqbZA==", "pQoqU");
    }

    private static boolean lIlIlIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIIIIlIIlI(String llllllllllllllllIIllIIIIIIlllIIl, String llllllllllllllllIIllIIIIIIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIIllIllI.getBytes(StandardCharsets.UTF_8)), llIlIlllllI[12]), "DES");
            Cipher llllllllllllllllIIllIIIIIIlllIll = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIIIIlllIll.init(llIlIlllllI[0], llllllllllllllllIIllIIIIIIllllII);
            return new String(llllllllllllllllIIllIIIIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIIIlllIlI) {
            llllllllllllllllIIllIIIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    static {
        aR.lIlIlIIIIlIlIl();
        aR.lIlIlIIIIlIlII();
        ek = llIlIlllllI[13];
        em = llIlIlllllI[6];
        el = llIlIlllllI[14];
    }

    private static boolean lIlIlIIIIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIllIll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlIIIIlIlIl() {
        llIlIlllllI = new int[16];
        aR.llIlIlllllI[0] = "  ".length();
        aR.llIlIlllllI[1] = " ".length();
        aR.llIlIlllllI[2] = -(0x35 ^ 0x10) & (0xFFFFFB77 & 0x3FFE);
        aR.llIlIlllllI[3] = (0xFA ^ 0xC2 ^ (5 ^ 0x1D)) & (22 + 74 - -34 + 51 ^ 3 + 5 - -77 + 64 ^ -" ".length());
        aR.llIlIlllllI[4] = 0xFFFFEEBE & 0x3753;
        aR.llIlIlllllI[5] = 0xFFFFE759 & 0x3EB7;
        aR.llIlIlllllI[6] = 0xFFFFBF6E & 0x669F;
        aR.llIlIlllllI[7] = "   ".length();
        aR.llIlIlllllI[8] = 0x47 ^ 0x43;
        aR.llIlIlllllI[9] = 124 + 156 - 183 + 94 ^ 28 + 33 - -4 + 121;
        aR.llIlIlllllI[10] = 0x81 ^ 0x87;
        aR.llIlIlllllI[11] = 0x1D ^ 0x1A;
        aR.llIlIlllllI[12] = 0 ^ 8;
        aR.llIlIlllllI[13] = 0xFFFFCDCA & 0x3AF7;
        aR.llIlIlllllI[14] = -(0xFFFFB3FD & 0x6D2B) & (0xFFFFB9EF & 0x6FFF);
        aR.llIlIlllllI[15] = 0xE8 ^ 0x83 ^ (0x72 ^ 0x10);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        aR llllllllllllllllIIllIIIIIlllllIl;
        void llllllllllllllllIIllIIIIIllllIll;
        Actor actor = animationChanged.getActor();
        if (aR.lIlIlIIIIllIlI(actor instanceof Player)) {
            return;
        }
        NPC llllllllllllllllIIllIIIIIllllIlI = (NPC)llllllllllllllllIIllIIIIIllllIll;
        if (aR.lIlIlIIIIllllI(llllllllllllllllIIllIIIIIllllIlI.getAnimation(), llIlIlllllI[4]) && aR.lIlIlIIIIllIlI(llllllllllllllllIIllIIIIIllllIlI.getName().equals(llIlIllllIl[llIlIlllllI[3]]) ? 1 : 0)) {
            llllllllllllllllIIllIIIIIlllllIl.a((Actor)llllllllllllllllIIllIIIIIllllIlI, Prayer.PROTECT_FROM_MAGIC);
        }
        if (aR.lIlIlIIIIllllI(llllllllllllllllIIllIIIIIllllIlI.getAnimation(), llIlIlllllI[5]) && aR.lIlIlIIIIllIlI(llllllllllllllllIIllIIIIIllllIlI.getName().equals(llIlIllllIl[llIlIlllllI[1]]) ? 1 : 0)) {
            llllllllllllllllIIllIIIIIlllllIl.a((Actor)llllllllllllllllIIllIIIIIllllIlI, Prayer.PROTECT_FROM_MISSILES);
        }
        if (aR.lIlIlIIIIllllI(llllllllllllllllIIllIIIIIllllIlI.getAnimation(), llIlIlllllI[6]) && (!aR.lIlIlIIIIlllll(llllllllllllllllIIllIIIIIllllIlI.getName().equals(llIlIllllIl[llIlIlllllI[0]]) ? 1 : 0) || aR.lIlIlIIIIllIlI(llllllllllllllllIIllIIIIIllllIlI.getName().equals(llIlIllllIl[llIlIlllllI[7]]) ? 1 : 0))) {
            llllllllllllllllIIllIIIIIlllllIl.a((Actor)llllllllllllllllIIllIIIIIllllIlI, Prayer.PROTECT_FROM_MELEE);
        }
    }
}

