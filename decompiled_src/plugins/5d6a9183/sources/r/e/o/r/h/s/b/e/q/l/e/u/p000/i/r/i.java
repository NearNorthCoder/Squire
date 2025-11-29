package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import net.runelite.api.Item;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Making potions", register = true)
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.i  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/i.class */
public class i extends d {
    private /* synthetic */ int q;
    private /* synthetic */ c e;
    private /* synthetic */ b f;

    /* renamed from: r  reason: collision with root package name */
    private /* synthetic */ int f0r;
    private /* synthetic */ e g;
    private static /* synthetic */ int[] lllIlIIIlIII;

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (!lIIIlIlllIIlllI(animationChanged.getActor(), Players.getLocal()) && lIIIlIlllIIllll(animationChanged.getActor().getAnimation(), lllIlIIIlIII[7])) {
            this.q = this.f0r;
        }
    }

    private static boolean lIIIlIlllIIllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        super(squireHerblore, herbloreConfig, r3);
        c[] cVarArr = new c[lllIlIIIlIII[0]];
        cVarArr[lllIlIIIlIII[1]] = c.MAKE_UNF_POTS;
        cVarArr[lllIlIIIlIII[2]] = c.FINISH_POTS;
        cVarArr[lllIlIIIlIII[3]] = c.ALL_STAGES;
        cVarArr[lllIlIIIlIII[4]] = c.ALL_STAGES_ALL_HERBS;
        this.f = herbloreConfig.herb();
        this.g = herbloreConfig.potion();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.d
    public boolean h() {
        if (lIIIlIlllIIIIll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.q = this.f0r;
            return lllIlIIIlIII[2];
        } else if (lIIIlIlllIIIlII(this.f0r - this.q, lllIlIIIlIII[5])) {
            if (lIIIlIlllIIIllI(this.f0r, this.q)) {
                ?? r0 = lllIlIIIlIII[2];
                "".length();
                return "   ".length() < 0 ? ((126 ^ 36) ^ (223 ^ 157)) & (((47 ^ 20) ^ (47 ^ 12)) ^ (-" ".length())) : r0;
            }
            return lllIlIIIlIII[1];
        } else {
            return v();
        }
    }

    static {
        lIIIlIlllIIIIlI();
    }

    private static boolean lIIIlIlllIIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIlllIIllll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlIlllIIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIlllIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIlllIIlllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIlIlllIIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIIlIlllIIIIlI() {
        lllIlIIIlIII = new int[8];
        lllIlIIIlIII[0] = (((101 + 147) - 179) + 102) ^ (((30 + 25) - 22) + 142);
        lllIlIIIlIII[1] = (100 ^ 61) & ((22 ^ 79) ^ (-1));
        lllIlIIIlIII[2] = " ".length();
        lllIlIIIlIII[3] = "  ".length();
        lllIlIIIlIII[4] = "   ".length();
        lllIlIIIlIII[5] = "   ".length() ^ (8 ^ 13);
        lllIlIIIlIII[6] = ((139 + 121) - 146) + 113;
        lllIlIIIlIII[7] = -" ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    private boolean v() {
        Item item = null;
        Item item2 = null;
        if (lIIIlIlllIIlIll(this.e, c.MAKE_UNF_POTS)) {
            int[] iArr = new int[lllIlIIIlIII[2]];
            iArr[lllIlIIIlIII[1]] = this.f.f();
            item = Inventory.getFirst(iArr);
            int[] iArr2 = new int[lllIlIIIlIII[2]];
            iArr2[lllIlIIIlIII[1]] = lllIlIIIlIII[6];
            item2 = Inventory.getFirst(iArr2);
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (lIIIlIlllIIlIll(this.e, c.FINISH_POTS)) {
            for (Integer num : this.g.n().keySet()) {
                b a = b.a(num);
                if (lIIIlIlllIIllII(a)) {
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return ((((116 + 78) - 89) + 96) ^ (((117 + 77) - 144) + 103)) & (((66 ^ 8) ^ (43 ^ 49)) ^ (-" ".length()));
                    }
                } else {
                    int[] iArr3 = new int[lllIlIIIlIII[3]];
                    iArr3[lllIlIIIlIII[1]] = a.f();
                    iArr3[lllIlIIIlIII[2]] = a.g();
                    item = Inventory.getFirst(iArr3);
                    "".length();
                    if (((101 ^ 22) ^ (182 ^ 193)) <= " ".length()) {
                        return ((((25 + 96) - 31) + 137) ^ (((63 + 115) - 104) + 100)) & (((((10 + 20) - (-152)) + 12) ^ (((13 + 96) - 50) + 84)) ^ (-" ".length()));
                    }
                }
            }
            if (lIIIlIlllIIllII(item)) {
                int[] iArr4 = new int[lllIlIIIlIII[2]];
                iArr4[lllIlIIIlIII[1]] = this.g.n().keySet().stream().findAny().orElse(Integer.valueOf(lllIlIIIlIII[7])).intValue();
                item = Inventory.getFirst(iArr4);
            }
            Item item3 = item;
            if (lIIIlIlllIIllII(item3)) {
                return lllIlIIIlIII[1];
            }
            item2 = Inventory.getFirst(item4 -> {
                return this.g.n().keySet().stream().filter(num2 -> {
                    if (lIIIlIlllIIllll(num2.intValue(), item3.getId())) {
                        ?? r0 = lllIlIIIlIII[2];
                        "".length();
                        return (((((39 + 9) - (-2)) + 111) ^ (((134 + 48) - 169) + 162)) & (((60 ^ 52) ^ (158 ^ 152)) ^ (-" ".length()))) != ((((168 ^ 163) & ((29 ^ 22) ^ (-1))) ^ (218 ^ 130)) & (((224 ^ 191) ^ (193 ^ 198)) ^ (-" ".length()))) ? ((((209 + 85) - 247) + 206) ^ (((120 + 50) - 88) + 114)) & (((((19 + 88) - (-20)) + 26) ^ (((74 + 83) - 88) + 91)) ^ (-" ".length())) : r0;
                    }
                    return lllIlIIIlIII[1];
                }).anyMatch(num3 -> {
                    if (lIIIlIlllIIIllI(num3.intValue(), item4.getId())) {
                        ?? r0 = lllIlIIIlIII[2];
                        "".length();
                        return 0 != 0 ? ((((241 + 106) - 279) + 180) ^ (((106 + 155) - 222) + 127)) & (((63 ^ 19) ^ (42 ^ 88)) ^ (-" ".length())) : r0;
                    }
                    return lllIlIIIlIII[1];
                });
            });
        }
        if (!lIIIlIlllIIllIl(item) || lIIIlIlllIIllII(item2)) {
            return lllIlIIIlIII[1];
        }
        item.useOn(item2);
        return lllIlIIIlIII[2];
    }

    private static boolean lIIIlIlllIIIIll(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(a aVar) {
        this.e = aVar.b();
        this.g = aVar.d();
        this.f = aVar.c();
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.f0r += lllIlIIIlIII[2];
    }
}
