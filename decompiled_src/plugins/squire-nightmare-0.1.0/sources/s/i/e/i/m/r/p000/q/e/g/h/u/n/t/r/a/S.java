package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.S  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/S.class */
public abstract class S extends D {
    private static /* synthetic */ int[] lllIlllIllII;
    protected static final /* synthetic */ List<Integer> dt;
    public static final /* synthetic */ WorldArea ds;

    private static boolean lIIIllIllllIlIl(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean cl() {
        return Bank.getAll().stream().anyMatch(item -> {
            return dt.contains(Integer.valueOf(item.getId()));
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public S(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static void lIIIllIllllIIll() {
        lllIlllIllII = new int[36];
        lllIlllIllII[0] = ((((2 + 114) - 26) + 83) ^ (((83 + 77) - 108) + 90)) & (((94 ^ 108) ^ (125 ^ 108)) ^ (-" ".length()));
        lllIlllIllII[1] = " ".length();
        lllIlllIllII[2] = (-8449) & 11599;
        lllIlllIllII[3] = (-12293) & 15765;
        lllIlllIllII[4] = (106 ^ 84) ^ (60 ^ 31);
        lllIlllIllII[5] = (73 ^ 105) ^ " ".length();
        lllIlllIllII[6] = 96 ^ 112;
        lllIlllIllII[7] = (-18756) & 24055;
        lllIlllIllII[8] = (-4637) & 5087;
        lllIlllIllII[9] = "  ".length();
        lllIlllIllII[10] = (-15434) & 15997;
        lllIlllIllII[11] = "   ".length();
        lllIlllIllII[12] = (-((-2225) & 32253)) & (-129) & 30717;
        lllIlllIllII[13] = 158 ^ 154;
        lllIlllIllII[14] = (-24577) & 27627;
        lllIlllIllII[15] = 129 ^ 132;
        lllIlllIllII[16] = (-((-25097) & 32267)) & (-8322) & 16383;
        lllIlllIllII[17] = 18 ^ 20;
        lllIlllIllII[18] = (-14359) & 15871;
        lllIlllIllII[19] = 20 ^ 19;
        lllIlllIllII[20] = ((144 + 47) - 139) + 167;
        lllIlllIllII[21] = (49 ^ 53) ^ (90 ^ 86);
        lllIlllIllII[22] = ((189 + 210) - 291) + 107;
        lllIlllIllII[23] = 153 ^ 144;
        lllIlllIllII[24] = (-((-22665) & 32431)) & (-2057) & 12271;
        lllIlllIllII[25] = (194 ^ 183) ^ (((124 + 121) - 119) + 1);
        lllIlllIllII[26] = (-((-93) & 12381)) & (-65) & 12799;
        lllIlllIllII[27] = (((9 + 105) - 90) + 130) ^ (((58 + 13) - (-29)) + 45);
        lllIlllIllII[28] = (-((-17598) & 28351)) & (-21505) & 32701;
        lllIlllIllII[29] = 2 ^ 14;
        lllIlllIllII[30] = 200 ^ 197;
        lllIlllIllII[31] = (-((-161) & 15019)) & (-17409) & 32719;
        lllIlllIllII[32] = (113 ^ 99) ^ (120 ^ 100);
        lllIlllIllII[33] = (-10629) & 12247;
        lllIlllIllII[34] = 172 ^ 163;
        lllIlllIllII[35] = (-((-8603) & 12731)) & (-27009) & 32757;
    }

    public abstract boolean ci();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public void co() {
        this.cW.l(lllIlllIllII[0]);
        this.cW.e((boolean) lllIlllIllII[0]);
        this.cW.f((boolean) lllIlllIllII[0]);
    }

    private static boolean lIIIllIllllIllI(int i) {
        return i != 0;
    }

    private static boolean lIIIllIllllIlII(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean cm() {
        return Inventory.getAll().stream().noneMatch(item -> {
            int id;
            List<Integer> list = dt;
            if (lIIIllIllllIllI(item.isNoted() ? 1 : 0)) {
                id = item.getId() - lllIlllIllII[1];
                "".length();
                if ((-" ".length()) > 0) {
                    return ((((29 + 160) - 86) + 117) ^ (((89 + 50) - 106) + 118)) & (((127 ^ 33) ^ (60 ^ 41)) ^ (-" ".length()));
                }
            } else {
                id = item.getId();
            }
            return list.contains(Integer.valueOf(id));
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean cn() {
        Player local = Players.getLocal();
        return lIIIllIllllIlII(local) ? lllIlllIllII[0] : ds.contains(local.getWorldLocation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllIllllIlIl(this.cV.enableRestocking() ? 1 : 0) && !lIIIllIllllIlIl(this.cW.ae() ? 1 : 0) && !lIIIllIllllIlII(Players.getLocal())) {
            return ci();
        }
        return lllIlllIllII[0];
    }

    static {
        lIIIllIllllIIll();
        ds = new WorldArea(lllIlllIllII[2], lllIlllIllII[3], lllIlllIllII[4], lllIlllIllII[5], lllIlllIllII[0]);
        Integer[] numArr = new Integer[lllIlllIllII[6]];
        numArr[lllIlllIllII[0]] = Integer.valueOf(lllIlllIllII[7]);
        numArr[lllIlllIllII[1]] = Integer.valueOf(lllIlllIllII[8]);
        numArr[lllIlllIllII[9]] = Integer.valueOf(lllIlllIllII[10]);
        numArr[lllIlllIllII[11]] = Integer.valueOf(lllIlllIllII[12]);
        numArr[lllIlllIllII[13]] = Integer.valueOf(lllIlllIllII[14]);
        numArr[lllIlllIllII[15]] = Integer.valueOf(lllIlllIllII[16]);
        numArr[lllIlllIllII[17]] = Integer.valueOf(lllIlllIllII[18]);
        numArr[lllIlllIllII[19]] = Integer.valueOf(lllIlllIllII[20]);
        numArr[lllIlllIllII[21]] = Integer.valueOf(lllIlllIllII[22]);
        numArr[lllIlllIllII[23]] = Integer.valueOf(lllIlllIllII[24]);
        numArr[lllIlllIllII[25]] = Integer.valueOf(lllIlllIllII[26]);
        numArr[lllIlllIllII[27]] = Integer.valueOf(lllIlllIllII[28]);
        numArr[lllIlllIllII[29]] = Integer.valueOf(lllIlllIllII[9]);
        numArr[lllIlllIllII[30]] = Integer.valueOf(lllIlllIllII[31]);
        numArr[lllIlllIllII[32]] = Integer.valueOf(lllIlllIllII[33]);
        numArr[lllIlllIllII[34]] = Integer.valueOf(lllIlllIllII[35]);
        dt = new ArrayList(List.of((Object[]) numArr));
    }
}
