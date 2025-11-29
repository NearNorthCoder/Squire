package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

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
@Singleton
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.c  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/c.class */
public class c {
    private static /* synthetic */ int[] llllIIIIllI;
    private final /* synthetic */ SquireBarrowsConfig x;
    private final /* synthetic */ SquireBarrows w;

    private static boolean lIllIIllIIlIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIllIIllII(int i, int i2) {
        return i > i2;
    }

    public List<String> c(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (lIllIIllIIllII(i, llllIIIIllI[4])) {
            arrayList.add(e.BLOODWORM.H());
            "".length();
            arrayList.add(e.SKELETON.H());
            "".length();
            arrayList.add(e.GIANT_CRYPT_RAT.H());
            "".length();
            arrayList.add(e.GIANT_CRYPT_SPIDER.H());
            "".length();
            return arrayList;
        }
        e[] values = e.values();
        int length = values.length;
        int i2 = llllIIIIllI[5];
        while (lIllIIllIIllIl(i2, length)) {
            e eVar = values[i2];
            if (lIllIIllIIlllI(eVar.G(), i)) {
                arrayList2.add(eVar.H());
                "".length();
            }
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return arrayList2;
    }

    private static void lIllIIllIIlIIl() {
        llllIIIIllI = new int[7];
        llllIIIIllI[0] = (-17441) & 17903;
        llllIIIIllI[1] = (((3 + 119) - 9) + 18) ^ (((89 + 91) - 61) + 14);
        llllIIIIllI[2] = 128 ^ 138;
        llllIIIIllI[3] = "  ".length();
        llllIIIIllI[4] = (249 ^ 180) ^ (132 ^ 153);
        llllIIIIllI[5] = ((((59 + 110) - 32) + 25) ^ (((7 + 110) - 89) + 108)) & (((((172 + 45) - 119) + 77) ^ (((95 + 74) - 39) + 3)) ^ (-" ".length()));
        llllIIIIllI[6] = " ".length();
    }

    private static boolean lIllIIllIIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIllIlIIII(int i) {
        return i != 0;
    }

    private static boolean lIllIIllIIllIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIIllIIlIIl();
    }

    @Inject
    public c(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.w = squireBarrows;
        this.x = squireBarrowsConfig;
    }

    private static boolean lIllIIllIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public List<NPC> b(int i) {
        return NPCs.getAll(npc -> {
            if (lIllIIllIIllll(npc.getInteracting(), Players.getLocal()) && lIllIIllIlIIII(c(i).contains(npc.getName()) ? 1 : 0)) {
                ?? r0 = llllIIIIllI[6];
                "".length();
                return (35 ^ 39) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIIIIllI[5];
        });
    }

    public int d() {
        int bit = Vars.getBit(llllIIIIllI[0]);
        d r = this.w.r();
        return (lIllIIllIIlIlI(r) && lIllIIllIIlIll(this.w.e(), llllIIIIllI[1])) ? (((this.x.rewardPotential() * llllIIIIllI[2]) - bit) - r.E()) + llllIIIIllI[3] : (this.x.rewardPotential() * llllIIIIllI[2]) - bit;
    }

    private static boolean lIllIIllIIlllI(int i, int i2) {
        return i <= i2;
    }
}
