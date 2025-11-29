package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
@Singleton
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.a  reason: invalid package and case insensitive filesystem */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/a.class */
public class C0000a {
    private static /* synthetic */ int[] llllIIlIlIII;
    private /* synthetic */ int r;
    private static /* synthetic */ String[] llllIIlIIlll;
    private static final /* synthetic */ int[] k;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String i;
    private /* synthetic */ int q;
    private /* synthetic */ int p;
    private final /* synthetic */ Client n;
    private final /* synthetic */ Map<LocalPoint, Projectile> l = new HashMap();
    private final /* synthetic */ Set<LocalPoint> m = new HashSet();
    private /* synthetic */ h o = null;
    private /* synthetic */ int s = llllIIlIlIII[0];

    public void b(int i2) {
        this.p = i2;
    }

    private static boolean lIIIlllllIlllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIllllllIIIll(int i2, int i3) {
        return i2 < i3;
    }

    private void a(int i2) {
        if (!lIIIllllllIIIIl(i2, this.o.L().W())) {
            this.o.s();
            return;
        }
        this.o.D();
        "".length();
        if ((-(47 ^ 43)) >= 0) {
        }
    }

    public Map<LocalPoint, Projectile> i() {
        return this.l;
    }

    public int n() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean g() {
        if (lIIIlllllIllIlI(this.n.isInInstancedRegion() ? 1 : 0) && lIIIlllllIllIlI(Arrays.equals(this.n.getMapRegions(), k) ? 1 : 0)) {
            ?? r0 = llllIIlIlIII[1];
            "".length();
            return "  ".length() <= 0 ? ((77 ^ 74) ^ (30 ^ 74)) & (((1 ^ 55) ^ (28 ^ 121)) ^ (-" ".length())) : r0;
        }
        return llllIIlIlIII[0];
    }

    public int m() {
        return this.q;
    }

    private static boolean lIIIlllllIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int o() {
        return this.s;
    }

    public void d(int i2) {
        this.r = i2;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0000a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        if (lIIIlllllIlllll(r0.equals(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
        if (lIIIlllllIlllll(r0.equals(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
        if (lIIIlllllIlllll(r0.equals(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (lIIIlllllIlllll(r0.equals(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllllIllllI(obj, this)) {
            return llllIIlIlIII[1];
        }
        if (lIIIlllllIlllll(obj instanceof C0000a ? 1 : 0)) {
            return llllIIlIlIII[0];
        }
        C0000a c0000a = (C0000a) obj;
        if (!lIIIlllllIlllll(c0000a.a(this) ? 1 : 0) && !lIIIllllllIIIIl(l(), c0000a.l()) && !lIIIllllllIIIIl(m(), c0000a.m()) && !lIIIllllllIIIIl(n(), c0000a.n()) && !lIIIllllllIIIIl(o(), c0000a.o())) {
            Map<LocalPoint, Projectile> i2 = i();
            Map<LocalPoint, Projectile> i3 = c0000a.i();
            if (lIIIllllllIIIlI(i2)) {
                if (lIIIlllllIllIll(i3)) {
                    "".length();
                    if (0 != 0) {
                        return "  ".length() & ("  ".length() ^ (-" ".length()));
                    }
                    return llllIIlIlIII[0];
                }
                Set<LocalPoint> f = f();
                Set<LocalPoint> f2 = c0000a.f();
                if (lIIIllllllIIIlI(f)) {
                    if (lIIIlllllIllIll(f2)) {
                        "".length();
                        if ("   ".length() < 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return llllIIlIlIII[0];
                    }
                    Client j2 = j();
                    Client j3 = c0000a.j();
                    if (lIIIllllllIIIlI(j2)) {
                        if (lIIIlllllIllIll(j3)) {
                            "".length();
                            if ((-"   ".length()) >= 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                            return llllIIlIlIII[0];
                        }
                        h k2 = k();
                        h k3 = c0000a.k();
                        if (lIIIllllllIIIlI(k2)) {
                            if (lIIIlllllIllIll(k3)) {
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return (true ^ true) & ((true ^ true) ^ true);
                                }
                                return llllIIlIlIII[0];
                            }
                            return llllIIlIlIII[1];
                        }
                    }
                }
            }
        }
        return llllIIlIlIII[0];
    }

    public void e(int i2) {
        this.s = i2;
    }

    public void c(int i2) {
        this.q = i2;
    }

    @Subscribe
    public void a(NpcChanged npcChanged) {
        NPC npc = npcChanged.getNpc();
        if (!lIIIlllllIllIll(this.o) || lIIIlllllIlllII(npc, this.o.K())) {
            return;
        }
        this.o.S();
        switch (npc.getId()) {
            case 8619:
                this.o.a(k.LIGHTNING);
                "".length();
                if (("   ".length() & ("   ".length() ^ (-1))) != 0) {
                    return;
                }
                return;
            case 8620:
                this.o.a(k.FLAME);
                "".length();
                if ((61 ^ 57) <= " ".length()) {
                    return;
                }
                return;
            case 8621:
                this.o.a(k.ENRAGED);
                return;
            default:
                return;
        }
    }

    public void a(h hVar) {
        this.o = hVar;
    }

    public Set<LocalPoint> f() {
        if (lIIIllllllIIIII(this.n.getTickCount() - this.q, llllIIlIlIII[6])) {
            this.m.clear();
        }
        return this.m;
    }

    private static void lIIIlllllIllIII() {
        llllIIlIIlll = new String[llllIIlIlIII[15]];
        llllIIlIIlll[llllIIlIlIII[0]] = lIIIlllllIlIlIl("MSAyMD0dJTI5NFAEKDwqEQ==", "pLQXX");
        llllIIlIIlll[llllIIlIlIII[1]] = lIIIlllllIlIllI("kyGLrN+f12E=", "cmAWO");
        llllIIlIIlll[llllIIlIlIII[4]] = lIIIlllllIlIllI("Vvxorj6dYWLYj9eRmQKw/BCJMiDshxAjGTXBOpB8S0jIFOEjDHes1pPDqg+yY3br9UWU8U/dKThX5APREyaksA==", "RaizR");
        llllIIlIIlll[llllIIlIlIII[5]] = lIIIlllllIlIllI("C88S/ixwZp5p6ArATqGTMbuAbIqupjiGFBECvf7knGRmD6pxWcWFcR3AxtnCqN2I", "lZYhg");
        llllIIlIIlll[llllIIlIlIII[9]] = lIIIlllllIlIlll("ULc2K0JnHOjsvh0Ml6HzF6Dvnm2vLEpc7K34adrHnz8dcH99ZcqEtDiE8jpThhBftyc0eL/cVnh96ej1/3thWg==", "PQicc");
        llllIIlIIlll[llllIIlIlIII[10]] = lIIIlllllIlIllI("y+IzjMc8iE5B3nIR1kKw43uoHnWehCR+gSQ5JBy1erzIWl1YC2dEiaQdcBguCi/W", "azCkO");
    }

    private static boolean lIIIlllllIlllll(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIllllllIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIIIlllllIllIIl();
        lIIIlllllIllIII();
        i = llllIIlIIlll[llllIIlIlIII[9]];
        j = llllIIlIIlll[llllIIlIlIII[10]];
        int[] iArr = new int[llllIIlIlIII[9]];
        iArr[llllIIlIlIII[0]] = llllIIlIlIII[11];
        iArr[llllIIlIlIII[1]] = llllIIlIlIII[12];
        iArr[llllIIlIlIII[4]] = llllIIlIlIII[13];
        iArr[llllIIlIlIII[5]] = llllIIlIlIII[14];
        k = iArr;
    }

    public String toString() {
        return "HydraHandler(poisonProjectiles=" + String.valueOf(i()) + ", poisonTiles=" + String.valueOf(f()) + ", client=" + String.valueOf(j()) + ", hydra=" + String.valueOf(k()) + ", lastAttackTick=" + l() + ", poisonTick=" + m() + ", deathTick=" + n() + ", kills=" + o() + ")";
    }

    public h k() {
        return this.o;
    }

    private static boolean lIIIlllllIllIlI(int i2) {
        return i2 != 0;
    }

    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIIIlllllIllIlI(h.a((Actor) npc) ? 1 : 0)) {
            this.o = new h(npc);
        }
    }

    private static boolean lIIIlllllIllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllllllIIIIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIlllllIlllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void h() {
        this.s = llllIIlIlIII[0];
        this.o = new h(NPCs.getNearest((v0) -> {
            return h.a(v0);
        }));
    }

    private static void lIIIlllllIllIIl() {
        llllIIlIlIII = new int[17];
        llllIIlIlIII[0] = ((168 ^ 191) ^ (24 ^ 75)) & (((((109 + 96) - 204) + 128) ^ (((40 + 122) - (-26)) + 9)) ^ (-" ".length()));
        llllIIlIlIII[1] = " ".length();
        llllIIlIlIII[2] = 52 ^ 30;
        llllIIlIlIII[3] = (-((-518) & 7063)) & (-24579) & 32767;
        llllIIlIlIII[4] = "  ".length();
        llllIIlIlIII[5] = "   ".length();
        llllIIlIlIII[6] = 116 ^ 102;
        llllIIlIlIII[7] = 43 ^ 16;
        llllIIlIlIII[8] = 40 ^ 3;
        llllIIlIlIII[9] = 95 ^ 91;
        llllIIlIlIII[10] = 142 ^ 139;
        llllIIlIlIII[11] = (-((-3987) & 20467)) & (-8449) & 30207;
        llllIIlIlIII[12] = (-((-4661) & 23413)) & (-528) & 24559;
        llllIIlIlIII[13] = (-((-22427) & 24507)) & (-16897) & 24511;
        llllIIlIlIII[14] = (-18453) & 23988;
        llllIIlIlIII[15] = 38 ^ 32;
        llllIIlIlIII[16] = (20 ^ 43) ^ (17 ^ 38);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i2 = llllIIlIlIII[7];
        int l = (((((((llllIIlIlIII[1] * llllIIlIlIII[7]) + l()) * llllIIlIlIII[7]) + m()) * llllIIlIlIII[7]) + n()) * llllIIlIlIII[7]) + o();
        Map<LocalPoint, Projectile> i3 = i();
        int i4 = l * llllIIlIlIII[7];
        if (lIIIllllllIIIlI(i3)) {
            hashCode = llllIIlIlIII[8];
            "".length();
            if (((160 ^ 169) ^ (25 ^ 20)) == " ".length()) {
                return ((157 ^ 143) ^ (28 ^ 40)) & (((89 ^ 27) ^ (49 ^ 85)) ^ (-" ".length()));
            }
        } else {
            hashCode = i3.hashCode();
        }
        int i5 = i4 + hashCode;
        Set<LocalPoint> f = f();
        int i6 = i5 * llllIIlIlIII[7];
        if (lIIIllllllIIIlI(f)) {
            hashCode2 = llllIIlIlIII[8];
            "".length();
            if ((-" ".length()) == ((165 ^ 150) & ((34 ^ 17) ^ (-1)))) {
                return (74 ^ 122) & ((153 ^ 169) ^ (-1));
            }
        } else {
            hashCode2 = f.hashCode();
        }
        int i7 = i6 + hashCode2;
        Client j2 = j();
        int i8 = i7 * llllIIlIlIII[7];
        if (lIIIllllllIIIlI(j2)) {
            hashCode3 = llllIIlIlIII[8];
            "".length();
            if ((true ^ true) & ((!true) ^ true)) {
                return (154 ^ 165) & ((185 ^ 134) ^ (-1));
            }
        } else {
            hashCode3 = j2.hashCode();
        }
        int i9 = i8 + hashCode3;
        h k2 = k();
        int i10 = i9 * llllIIlIlIII[7];
        if (lIIIllllllIIIlI(k2)) {
            hashCode4 = llllIIlIlIII[8];
            "".length();
            if ("  ".length() == ((((104 + 182) - 131) + 34) ^ (((138 + 28) - 130) + 149))) {
                return ((((94 + 45) - 68) + 103) ^ (((15 + 28) - (-69)) + 30)) & (((88 ^ 3) ^ (67 ^ 56)) ^ (-" ".length()));
            }
        } else {
            hashCode4 = k2.hashCode();
        }
        return i10 + hashCode4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    @Subscribe
    private void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (!lIIIlllllIllIll(this.o) || lIIIlllllIlllII(actor, this.o.K())) {
            return;
        }
        k S = this.o.S();
        int animation = actor.getAnimation();
        if ((lIIIlllllIlllIl(animation, S.ac()) && !lIIIlllllIllllI(S, k.FLAME)) || (lIIIlllllIlllIl(animation, S.ab()) && lIIIlllllIllllI(S, k.FLAME))) {
            switch (C0001b.t[S.ordinal()]) {
                case 1:
                    this.o.a(k.LIGHTNING);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    break;
                case 2:
                    this.o.a(k.FLAME);
                    "".length();
                    if ((-((((65 + 79) - 105) + 150) ^ (((12 + 132) - 131) + 172))) > 0) {
                        return;
                    }
                    break;
                case 3:
                    this.o.a(k.ENRAGED);
                    "".length();
                    if ((-" ".length()) >= ((36 ^ 33) ^ " ".length())) {
                        return;
                    }
                    break;
                case 4:
                    this.o = null;
                    this.l.clear();
                    break;
            }
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        } else if (lIIIlllllIlllIl(animation, S.ae()) && lIIIlllllIllIlI(S.ae())) {
            this.o.A();
        }
        if (lIIIlllllIllIll(actor.getOverheadText()) && lIIIlllllIllIlI(actor.getOverheadText().contains(llllIIlIIlll[llllIIlIlIII[1]]) ? 1 : 0)) {
            this.o.d(llllIIlIlIII[0]);
        }
        if (lIIIlllllIlllll(this.l.isEmpty() ? 1 : 0)) {
            this.l.values().removeIf(projectile -> {
                if (lIIIllllllIIIll(projectile.getEndCycle(), this.n.getGameCycle())) {
                    ?? r0 = llllIIlIlIII[1];
                    "".length();
                    return (-(188 ^ 184)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIlIlIII[0];
            });
            "".length();
        }
    }

    private static boolean lIIIllllllIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIIlllllIlIlIl(String lllllllllllllllIIlIlIlIllIllIIII, String lllllllllllllllIIlIlIlIllIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIllIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlIllIlIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIlIlIllIlIllIl = lllllllllllllllIIlIlIlIllIlIllll.toCharArray();
        int lllllllllllllllIIlIlIlIllIlIllII = llllIIlIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llllIIlIlIII[0];
        while (lIIIllllllIIIll(i2, length)) {
            char lllllllllllllllIIlIlIlIllIllIIIl = charArray[i2];
            lllllllllllllllIIlIlIlIllIlIlllI.append((char) (lllllllllllllllIIlIlIlIllIllIIIl ^ lllllllllllllllIIlIlIlIllIlIllIl[lllllllllllllllIIlIlIlIllIlIllII % lllllllllllllllIIlIlIlIllIlIllIl.length]));
            "".length();
            lllllllllllllllIIlIlIlIllIlIllII++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIlIllIlIlllI);
    }

    public int e() {
        return llllIIlIlIII[2] - d();
    }

    public int l() {
        return this.p;
    }

    public Client j() {
        return this.n;
    }

    @Subscribe
    public void a(ProjectileMoved projectileMoved) {
        Projectile projectile = projectileMoved.getProjectile();
        if (!lIIIlllllIllIll(this.o) || lIIIllllllIIIII(this.n.getGameCycle(), projectile.getStartCycle())) {
            return;
        }
        int id = projectile.getId();
        if (!lIIIlllllIlllIl(this.o.S().ad(), id)) {
            if (lIIIllllllIIIIl(this.n.getTickCount(), this.p)) {
                if (!lIIIllllllIIIIl(id, j.MAGIC.W()) || lIIIlllllIlllIl(id, j.RANGED.W())) {
                    a(id);
                    this.p = this.n.getTickCount();
                    return;
                }
                return;
            }
            return;
        }
        if (lIIIllllllIIIII(this.o.N(), this.o.O())) {
            this.o.A();
        }
        if (lIIIlllllIlllIl(id, llllIIlIlIII[3])) {
            this.l.put(projectileMoved.getPosition(), projectile);
            "".length();
            this.m.add(projectileMoved.getPosition());
            "".length();
            this.q = this.n.getTickCount();
            "".length();
            if ((-("   ".length() ^ (22 ^ 17))) > 0) {
            }
        }
    }

    private static String lIIIlllllIlIlll(String lllllllllllllllIIlIlIlIllIIllIll, String lllllllllllllllIIlIlIlIllIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIllIIllIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIlIII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIlIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIllIIlllII) {
            lllllllllllllllIIlIlIlIllIIlllII.printStackTrace();
            return null;
        }
    }

    public int d() {
        return this.n.getTickCount() - this.r;
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        if (lIIIlllllIllIlI(npcDespawned.getNpc().getName().equals(llllIIlIIlll[llllIIlIlIII[0]]) ? 1 : 0)) {
            this.r = this.n.getTickCount();
            this.o = null;
            this.l.clear();
            this.m.clear();
            this.s += llllIIlIlIII[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIIIllllllIIIlI(this.o)) {
            return;
        }
        if (!lIIIlllllIllIlI(message.equals(llllIIlIIlll[llllIIlIlIII[4]]) ? 1 : 0)) {
            if (lIIIlllllIllIlI(message.equals(llllIIlIIlll[llllIIlIlIII[5]]) ? 1 : 0)) {
                this.o.l(this.n.getTickCount());
                return;
            }
            return;
        }
        this.o.d(llllIIlIlIII[0]);
        "".length();
        if ((((((51 + 46) - (-36)) + 90) ^ (((12 + 138) - (-37)) + 9)) & (((((4 + 86) - 8) + 75) ^ (((62 + 79) - 138) + 131)) ^ (-" ".length()))) > (((((39 + 128) - 97) + 98) ^ (((123 + 6) - 19) + 39)) & (((((58 + 55) - (-54)) + 2) ^ (((35 + 21) - (-57)) + 35)) ^ (-" ".length())))) {
        }
    }

    private static String lIIIlllllIlIllI(String lllllllllllllllIIlIlIlIlllIIIIII, String lllllllllllllllIIlIlIlIllIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIlllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIlllIIIIlI.init(llllIIlIlIII[4], lllllllllllllllIIlIlIlIlllIIIIll);
            return new String(lllllllllllllllIIlIlIlIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIlIlllIIIIIl) {
            lllllllllllllllIIlIlIlIlllIIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(OverheadTextChanged overheadTextChanged) {
        Actor actor = overheadTextChanged.getActor();
        if (!lIIIlllllIllIll(this.o) || lIIIlllllIlllII(actor, this.o.K()) || lIIIllllllIIIlI(actor.getOverheadText())) {
            return;
        }
        this.o.d(llllIIlIlIII[0]);
    }

    @Inject
    public C0000a(Client client) {
        this.n = client;
    }
}
