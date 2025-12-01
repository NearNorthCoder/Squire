package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Using thrall", priority = 4999)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.x  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/x.class */
public class x extends a {
    private static /* synthetic */ int[] lIIlIlIllllll;

    private static void lIlIllIIlIIIllI() {
        lIIlIlIllllll = new int[6];
        lIIlIlIllllll[0] = (201 ^ 133) & ((99 ^ 47) ^ (-1));
        lIIlIlIllllll[1] = (-20353) & 32765;
        lIIlIlIllllll[2] = " ".length();
        lIIlIlIllllll[3] = (-((-4337) & 5110)) & (-2081) & 28671;
        lIIlIlIllllll[4] = 39 ^ 30;
        lIIlIlIllllll[5] = 143 ^ 137;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean y() {
        if (lIlIllIIlIIlIII(SpellBook.Necromancy.RESURRECT_GREATER_GHOST.canCast() ? 1 : 0) && lIlIllIIlIIlIIl(Skills.getBoostedLevel(Skill.PRAYER), lIIlIlIllllll[5])) {
            ?? r0 = lIIlIlIllllll[2];
            "".length();
            return 0 != 0 ? ((101 ^ 94) ^ (165 ^ 195)) & (((((187 + 17) - 111) + 106) ^ (((1 + 105) - 24) + 72)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIllllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        if (!lIlIllIIlIIIlll(y() ? 1 : 0) && !lIlIllIIlIIlIII(Vars.getBit(lIIlIlIllllll[1]))) {
            if (!lIlIllIIlIIIlll(this.f.isDead() ? 1 : 0) || lIlIllIIlIIIlll(this.g ? 1 : 0)) {
                return lIIlIlIllllll[0];
            }
            int[] iArr = new int[lIIlIlIllllll[2]];
            iArr[lIIlIlIllllll[0]] = lIIlIlIllllll[3];
            if (lIlIllIIlIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIlIllllll[2]];
                iArr2[lIIlIlIllllll[0]] = lIIlIlIllllll[3];
                if (lIlIllIIlIIIlll(Equipment.contains(iArr2) ? 1 : 0)) {
                    return lIIlIlIllllll[0];
                }
            }
            Magic.cast(SpellBook.Necromancy.RESURRECT_GREATER_GHOST, lIIlIlIllllll[0], lIIlIlIllllll[4]);
            return lIIlIlIllllll[2];
        }
        return lIIlIlIllllll[0];
    }

    private static boolean lIlIllIIlIIlIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIllIIlIIIllI();
    }

    @Inject
    protected x(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
    }

    private static boolean lIlIllIIlIIIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIlIIlIII(int i) {
        return i != 0;
    }
}
