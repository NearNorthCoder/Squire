package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling babboon prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aR  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aR.class */
public class aR extends W {
    private static final /* synthetic */ int em;
    private final /* synthetic */ Map<Integer, List<aS>> en;
    private static final /* synthetic */ int el;
    private static /* synthetic */ int[] llIlIlllllI;
    private static /* synthetic */ String[] llIlIllllIl;
    private static final /* synthetic */ int ek;

    private static boolean lIlIlIIIIlllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        if (lIlIlIIIIlIlll(NPCs.getNearest(npc -> {
            if (lIlIlIIIIllIlI(npc.getName().contains(llIlIllllIl[llIlIlllllI[8]]) ? 1 : 0) && lIlIlIIIIlllll(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIlIlllllI[1];
                "".length();
                return (86 ^ 82) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlllllI[3];
        }))) {
            ?? r0 = llIlIlllllI[1];
            "".length();
            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlllllI[3];
    }

    @Inject
    public aR(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.en = new HashMap();
    }

    private Prayer m(int i) {
        List<aS> list = this.en.get(Integer.valueOf(i));
        if (!lIlIlIIIIlIlll(list) || lIlIlIIIIllIlI(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        Prayer prayer = null;
        int i2 = llIlIlllllI[3];
        int i3 = llIlIlllllI[3];
        int i4 = llIlIlllllI[3];
        for (aS aSVar : list) {
            if (lIlIlIIIIlIlll(aSVar.bH())) {
                if (lIlIlIIIIllIlI(aSVar.bH().isDead() ? 1 : 0)) {
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    if (lIlIlIIIIllIll(aSVar.bI(), Prayer.PROTECT_FROM_MELEE) && lIlIlIIIIlllII(prayer)) {
                        i4++;
                        prayer = Prayer.PROTECT_FROM_MELEE;
                    }
                    if (lIlIlIIIIllIll(aSVar.bI(), Prayer.PROTECT_FROM_MAGIC) && (!lIlIlIIIIlllIl(prayer, Prayer.PROTECT_FROM_MELEE) || lIlIlIIIIlllII(prayer))) {
                        i2 += 2;
                        prayer = Prayer.PROTECT_FROM_MAGIC;
                    }
                    if (lIlIlIIIIllIll(aSVar.bI(), Prayer.PROTECT_FROM_MISSILES)) {
                        i3 += 2;
                        prayer = Prayer.PROTECT_FROM_MISSILES;
                    }
                    "".length();
                    if (((((44 + 7) - (-7)) + 108) ^ (((47 + 89) - (-13)) + 14)) <= 0) {
                        return null;
                    }
                }
            }
        }
        return (lIlIlIIIIllIII(i2, i3) && lIlIlIIIIllIII(i2, i4)) ? Prayer.PROTECT_FROM_MAGIC : lIlIlIIIIllIII(i4, i3) ? Prayer.PROTECT_FROM_MELEE : Prayer.PROTECT_FROM_MISSILES;
    }

    private static boolean lIlIlIIIIlllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlIIIIllIIl(int i) {
        return i > 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return llIlIlllllI[2];
    }

    private static boolean lIlIlIIIIllIII(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlIIIIlIIll(String llllllllllllllllIIllIIIIIlIIIllI, String llllllllllllllllIIllIIIIIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlllllI[0], llllllllllllllllIIllIIIIIlIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIIlIIIlll) {
            llllllllllllllllIIllIIIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        int size = NPCs.getAll(npc -> {
            if (lIlIlIIIIllIlI(npc.getName().equals(llIlIllllIl[llIlIlllllI[12]]) ? 1 : 0) && lIlIlIIIIlllll(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIlIlllllI[1];
                "".length();
                return (-" ".length()) >= (145 ^ 149) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlllllI[3];
        }).size();
        int size2 = NPCs.getAll(npc2 -> {
            if (lIlIlIIIIllIlI(npc2.getName().equals(llIlIllllIl[llIlIlllllI[11]]) ? 1 : 0) && lIlIlIIIIlllll(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIlIlllllI[1];
                "".length();
                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlllllI[3];
        }).size();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        if (lIlIlIIIIlIllI(size2, size)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (0 != 0) {
                return null;
            }
        } else if (lIlIlIIIIlIllI(size, size2)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        } else {
            NPC nearest = NPCs.getNearest(npc3 -> {
                if ((!lIlIlIIIIlllll(npc3.getName().equals(llIlIllllIl[llIlIlllllI[9]]) ? 1 : 0) || lIlIlIIIIllIlI(npc3.getName().equals(llIlIllllIl[llIlIlllllI[10]]) ? 1 : 0)) && lIlIlIIIIlllll(npc3.isDead() ? 1 : 0)) {
                    ?? r0 = llIlIlllllI[1];
                    "".length();
                    return ((68 ^ 24) ^ (193 ^ 153)) <= "  ".length() ? ((222 ^ 157) ^ (90 ^ 42)) & (((((55 + 25) - 66) + 227) ^ (((80 + 39) - (-19)) + 56)) ^ (-" ".length())) : r0;
                }
                return llIlIlllllI[3];
            });
            if (lIlIlIIIIlIlll(nearest) && !lIlIlIIIIllIII(nearest.distanceTo(Players.getLocal()), llIlIlllllI[0])) {
                prayer = Prayer.PROTECT_FROM_MELEE;
            } else if (lIlIlIIIIllIIl(size2)) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        Prayer m = m(Static.getClient().getTickCount() + llIlIlllllI[1]);
        if (lIlIlIIIIlIlll(m)) {
            prayer = m;
        }
        return lIlIlIIIIlIlll(prayer) ? List.of(aQ(), prayer) : List.of(aQ());
    }

    private static boolean lIlIlIIIIllllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIIIIlIIIl(String llllllllllllllllIIllIIIIIlIlIllI, String llllllllllllllllIIllIIIIIlIllIlI) {
        String llllllllllllllllIIllIIIIIlIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIIIlIllIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIllIIIIIlIllIlI.toCharArray();
        int llllllllllllllllIIllIIIIIlIlIlll = llIlIlllllI[3];
        char[] charArray2 = llllllllllllllllIIllIIIIIlIlIllI2.toCharArray();
        int length = charArray2.length;
        int i = llIlIlllllI[3];
        while (lIlIlIIIlIIIII(i, length)) {
            llllllllllllllllIIllIIIIIlIllIIl.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIllIIIIIlIlIlll % charArray.length]));
            "".length();
            llllllllllllllllIIllIIIIIlIlIlll++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIllIIIIIlIllIIl);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    private static boolean lIlIlIIIIlIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return llIlIlllllI[1];
    }

    private void a(Actor actor, Prayer prayer) {
        int tickCount = Static.getClient().getTickCount() + llIlIlllllI[8];
        aS aSVar = new aS(actor, prayer);
        if (!lIlIlIIIIlllll(this.en.containsKey(Integer.valueOf(tickCount)) ? 1 : 0)) {
            List<aS> list = this.en.get(Integer.valueOf(tickCount));
            list.add(aSVar);
            "".length();
            this.en.put(Integer.valueOf(tickCount), list);
            "".length();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aSVar);
        "".length();
        this.en.put(Integer.valueOf(tickCount), arrayList);
        "".length();
        "".length();
        if ("   ".length() < " ".length()) {
        }
    }

    private static void lIlIlIIIIlIlII() {
        llIlIllllIl = new String[llIlIlllllI[15]];
        llIlIllllIl[llIlIlllllI[3]] = lIlIlIIIIlIIIl("MDABGAsccS4WAxc=", "rQcwd");
        llIlIllllIl[llIlIlllllI[1]] = lIlIlIIIIlIIIl("IQsIOSUNSj4+OAwdDyQ=", "cjjVJ");
        llIlIllllIl[llIlIlllllI[0]] = lIlIlIIIIlIIIl("ABUnAAwsVAcdAjUYIB0=", "BtEoc");
        llIlIllllIl[llIlIlllllI[7]] = lIlIlIIIIlIIlI("Qu9RZ4filMU8F0x4347QNQ==", "LdflL");
        llIlIllllIl[llIlIlllllI[8]] = lIlIlIIIIlIIIl("FQ0RHQ05", "Wlsrb");
        llIlIllllIl[llIlIlllllI[9]] = lIlIlIIIIlIIll("3gl2wRlC5+Sk6U33VOynVg==", "IkAYg");
        llIlIllllIl[llIlIlllllI[10]] = lIlIlIIIIlIIIl("IAsXJycMSiEgOgMGGQ==", "bjuHH");
        llIlIllllIl[llIlIlllllI[11]] = lIlIlIIIIlIIlI("+OASkhbXjgXxW2+/v98YXA==", "ECnvB");
        llIlIllllIl[llIlIlllllI[12]] = lIlIlIIIIlIIll("2lqRTC6/i96pmOR6PCqbZA==", "pQoqU");
    }

    private static boolean lIlIlIIIIlIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIIIIllIlI(int i) {
        return i != 0;
    }

    private static String lIlIlIIIIlIIlI(String llllllllllllllllIIllIIIIIIlllIIl, String llllllllllllllllIIllIIIIIIlllIII) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), llIlIlllllI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlllllI[0], llllllllllllllllIIllIIIIIIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIIIlllIlI) {
            llllllllllllllllIIllIIIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIIIIlIlIl();
        lIlIlIIIIlIlII();
        ek = llIlIlllllI[13];
        em = llIlIlllllI[6];
        el = llIlIlllllI[14];
    }

    private static boolean lIlIlIIIIlllll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIIIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIlIIIIlIlIl() {
        llIlIlllllI = new int[16];
        llIlIlllllI[0] = "  ".length();
        llIlIlllllI[1] = " ".length();
        llIlIlllllI[2] = (-(53 ^ 16)) & (-1161) & 16382;
        llIlIlllllI[3] = ((250 ^ 194) ^ (5 ^ 29)) & (((((22 + 74) - (-34)) + 51) ^ (((3 + 5) - (-77)) + 64)) ^ (-" ".length()));
        llIlIlllllI[4] = (-4418) & 14163;
        llIlIlllllI[5] = (-6311) & 16055;
        llIlIlllllI[6] = (-16530) & 26271;
        llIlIlllllI[7] = "   ".length();
        llIlIlllllI[8] = 71 ^ 67;
        llIlIlllllI[9] = (((124 + 156) - 183) + 94) ^ (((28 + 33) - (-4)) + 121);
        llIlIlllllI[10] = 129 ^ 135;
        llIlIlllllI[11] = 29 ^ 26;
        llIlIlllllI[12] = 0 ^ 8;
        llIlIlllllI[13] = (-12854) & 15095;
        llIlIlllllI[14] = (-((-19459) & 27947)) & (-17937) & 28671;
        llIlIlllllI[15] = (232 ^ 131) ^ (114 ^ 16);
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIlIlIIIIllIlI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        NPC npc = actor;
        if (lIlIlIIIIllllI(npc.getAnimation(), llIlIlllllI[4]) && lIlIlIIIIllIlI(npc.getName().equals(llIlIllllIl[llIlIlllllI[3]]) ? 1 : 0)) {
            a((Actor) npc, Prayer.PROTECT_FROM_MAGIC);
        }
        if (lIlIlIIIIllllI(npc.getAnimation(), llIlIlllllI[5]) && lIlIlIIIIllIlI(npc.getName().equals(llIlIllllIl[llIlIlllllI[1]]) ? 1 : 0)) {
            a((Actor) npc, Prayer.PROTECT_FROM_MISSILES);
        }
        if (lIlIlIIIIllllI(npc.getAnimation(), llIlIlllllI[6])) {
            if (!lIlIlIIIIlllll(npc.getName().equals(llIlIllllIl[llIlIlllllI[0]]) ? 1 : 0) || lIlIlIIIIllIlI(npc.getName().equals(llIlIllllIl[llIlIlllllI[7]]) ? 1 : 0)) {
                a((Actor) npc, Prayer.PROTECT_FROM_MELEE);
            }
        }
    }
}
