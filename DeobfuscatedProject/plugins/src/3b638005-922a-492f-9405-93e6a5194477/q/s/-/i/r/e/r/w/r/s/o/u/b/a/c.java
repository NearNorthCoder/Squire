/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.e;

@Singleton
public class c {
    private static /* synthetic */ int[] llllIIIIllI;
    private final /* synthetic */ SquireBarrowsConfig x;
    private final /* synthetic */ SquireBarrows w;

    private static boolean lIllIIllIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIllIIllII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> c(int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        if (c.lIllIIllIIllII(n2, llllIIIIllI[4])) {
            void llllllllllllllllIIIllllIIIlllIlI;
            arrayList.add(e.BLOODWORM.H());
            "".length();
            arrayList.add(e.SKELETON.H());
            "".length();
            arrayList.add(e.GIANT_CRYPT_RAT.H());
            "".length();
            arrayList.add(e.GIANT_CRYPT_SPIDER.H());
            "".length();
            return llllllllllllllllIIIllllIIIlllIlI;
        }
        e[] llllllllllllllllIIIllllIIIlllIII = e.values();
        int llllllllllllllllIIIllllIIIllIlll = llllllllllllllllIIIllllIIIlllIII.length;
        int llllllllllllllllIIIllllIIIllIllI = llllIIIIllI[5];
        while (c.lIllIIllIIllIl(llllllllllllllllIIIllllIIIllIllI, llllllllllllllllIIIllllIIIllIlll)) {
            void llllllllllllllllIIIllllIIIlllIll;
            e llllllllllllllllIIIllllIIIllIlIl = llllllllllllllllIIIllllIIIlllIII[llllllllllllllllIIIllllIIIllIllI];
            if (c.lIllIIllIIlllI(llllllllllllllllIIIllllIIIllIlIl.G(), (int)llllllllllllllllIIIllllIIIlllIll)) {
                void llllllllllllllllIIIllllIIIlllIIl;
                llllllllllllllllIIIllllIIIlllIIl.add(llllllllllllllllIIIllllIIIllIlIl.H());
                "".length();
            }
            ++llllllllllllllllIIIllllIIIllIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return arrayList2;
    }

    private static void lIllIIllIIlIIl() {
        llllIIIIllI = new int[7];
        c.llllIIIIllI[0] = 0xFFFFBBDF & 0x45EF;
        c.llllIIIIllI[1] = 3 + 119 - 9 + 18 ^ 89 + 91 - 61 + 14;
        c.llllIIIIllI[2] = 0x80 ^ 0x8A;
        c.llllIIIIllI[3] = "  ".length();
        c.llllIIIIllI[4] = 0xF9 ^ 0xB4 ^ (0x84 ^ 0x99);
        c.llllIIIIllI[5] = (59 + 110 - 32 + 25 ^ 7 + 110 - 89 + 108) & (172 + 45 - 119 + 77 ^ 95 + 74 - 39 + 3 ^ -" ".length());
        c.llllIIIIllI[6] = " ".length();
    }

    private static boolean lIllIIllIIlIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIIllIlIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.lIllIIllIIlIIl();
    }

    @Inject
    public c(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.w = squireBarrows;
        this.x = squireBarrowsConfig;
    }

    private static boolean lIllIIllIIllll(Object object, Object object2) {
        return object == object2;
    }

    public List<NPC> b(int n2) {
        return NPCs.getAll(nPC -> {
            int n3;
            if (c.lIllIIllIIllll(nPC.getInteracting(), Players.getLocal()) && c.lIllIIllIlIIII(this.c(n2).contains(nPC.getName()) ? 1 : 0)) {
                n3 = llllIIIIllI[6];
                "".length();
                if ((0x23 ^ 0x27) < "   ".length()) {
                    return ((0xD2 ^ 0x80) & ~(0x5E ^ 0xC)) != 0;
                }
            } else {
                n3 = llllIIIIllI[5];
            }
            return n3 != 0;
        });
    }

    public int d() {
        int n2 = Vars.getBit((int)llllIIIIllI[0]);
        d d2 = this.w.r();
        if (c.lIllIIllIIlIlI((Object)d2) && c.lIllIIllIIlIll(this.w.e(), llllIIIIllI[1])) {
            return this.x.rewardPotential() * llllIIIIllI[2] - n2 - d2.E() + llllIIIIllI[3];
        }
        return this.x.rewardPotential() * llllIIIIllI[2] - n2;
    }

    private static boolean lIllIIllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }
}

