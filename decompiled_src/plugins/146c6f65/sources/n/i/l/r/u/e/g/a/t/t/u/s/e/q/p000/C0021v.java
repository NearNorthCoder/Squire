package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Consuming supplies", priority = 5, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/v.class */
public class C0021v extends AbstractC0013n {
    private static /* synthetic */ int[] llIIllllllIl;
    private /* synthetic */ boolean bF;
    private static /* synthetic */ String[] llIIllllllII;
    private final /* synthetic */ C0001b bE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIIIIIIIllllll(C0004e.ax.contains(Integer.valueOf(npcSpawned.getNpc().getId())) ? 1 : 0)) {
            return;
        }
        this.bF = llIIllllllIl[0];
    }

    private static void lIIIIIIIIlllIII() {
        llIIllllllII = new String[llIIllllllIl[4]];
        llIIllllllII[llIIllllllIl[1]] = lIIIIIIIIllIllI("AVn6BTDi4AM=", "dXOkW");
        llIIllllllII[llIIllllllIl[0]] = lIIIIIIIIllIlll("DT8dAio=", "IMtlA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean bv() {
        if (lIIIIIIIlIIIIII(NPCs.getAll(npc -> {
            return C0004e.ax.contains(Integer.valueOf(npc.getId()));
        }).size())) {
            ?? r0 = llIIllllllIl[0];
            "".length();
            return "   ".length() < "   ".length() ? ((31 ^ 32) ^ (172 ^ 134)) & (((21 ^ 70) ^ (7 ^ 65)) ^ (-" ".length())) : r0;
        }
        return llIIllllllIl[1];
    }

    private static boolean lIIIIIIIIlllIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIIIIIIllIllI(String lllllllllllllllIlIIIllllIIIllIII, String lllllllllllllllIlIIIllllIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllllIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllllIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllllIIIllIlI.init(llIIllllllIl[4], lllllllllllllllIlIIIllllIIIllIll);
            return new String(lllllllllllllllIlIIIllllIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllllIIIllIIl) {
            lllllllllllllllIlIIIllllIIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIllllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        int i2;
        if (lIIIIIIIIlllIlI(Players.getLocal())) {
            return llIIllllllIl[1];
        }
        Item first = Inventory.getFirst(item -> {
            return C0004e.aH.contains(Integer.valueOf(item.getId()));
        });
        Item first2 = Inventory.getFirst(item2 -> {
            return C0004e.aI.contains(Integer.valueOf(item2.getId()));
        });
        int eatToDuringNados = this.ba.h().eatToDuringNados();
        int boostedLevel = Skills.getBoostedLevel(Skill.HITPOINTS);
        if (!lIIIIIIIIlllIll(Movement.getRunEnergy(), llIIllllllIl[2]) || lIIIIIIIIllllII(Skills.getBoostedLevel(Skill.PRAYER), llIIllllllIl[3])) {
            i = llIIllllllIl[0];
            "".length();
            if ((-((46 ^ 109) ^ (194 ^ 133))) >= 0) {
                return ((((168 + 47) - 64) + 57) ^ (((126 + 118) - 147) + 34)) & (((8 ^ 57) ^ (34 ^ 64)) ^ (-" ".length()));
            }
        } else {
            i = llIIllllllIl[1];
        }
        int i3 = i;
        int i4 = llIIllllllIl[1];
        if ((lIIIIIIIIllllIl(bv() ? 1 : 0) && !lIIIIIIIIlllIll(boostedLevel - llIIllllllIl[2], this.ba.h().eatBelowNoNados())) || lIIIIIIIIllllII(boostedLevel, this.ba.h().eatBelowNoNados())) {
            this.bF = llIIllllllIl[0];
        }
        if (lIIIIIIIIllllII(boostedLevel, eatToDuringNados) && lIIIIIIIIllllIl(this.bF ? 1 : 0) && (!lIIIIIIIIllllIl(bv() ? 1 : 0) || lIIIIIIIIllllIl(Players.getLocal().isMoving() ? 1 : 0))) {
            i2 = llIIllllllIl[0];
            "".length();
            if (" ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llIIllllllIl[1];
        }
        if (lIIIIIIIIllllIl(i2) && lIIIIIIIIlllllI(first) && lIIIIIIIIllllll(this.bE.q() ? 1 : 0)) {
            first.interact(llIIllllllII[llIIllllllIl[1]]);
            this.bE.u();
            i4 = llIIllllllIl[0];
        }
        if (lIIIIIIIIllllIl(i3) && lIIIIIIIIlllllI(first2) && lIIIIIIIIllllll(this.bE.s() ? 1 : 0)) {
            first2.interact(llIIllllllII[llIIllllllIl[0]]);
            this.bE.v();
            i4 = llIIllllllIl[0];
        }
        if (lIIIIIIIIlllIll(boostedLevel, eatToDuringNados)) {
            this.bF = llIIllllllIl[1];
        }
        return i4;
    }

    private static boolean lIIIIIIIlIIIIII(int i) {
        return i > 0;
    }

    private static String lIIIIIIIIllIlll(String lllllllllllllllIlIIIllllIIIIlIII, String lllllllllllllllIlIIIllllIIIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIllllIIIIIlll.toCharArray();
        int lllllllllllllllIlIIIllllIIIIIlII = llIIllllllIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIIIlllIllllllII = llIIllllllIl[1];
        while (lIIIIIIIIllllII(lllllllllllllllIlIIIlllIllllllII, length)) {
            sb.append((char) (charArray2[lllllllllllllllIlIIIlllIllllllII] ^ charArray[lllllllllllllllIlIIIllllIIIIIlII % charArray.length]));
            "".length();
            lllllllllllllllIlIIIllllIIIIIlII++;
            lllllllllllllllIlIIIlllIllllllII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0021v(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllllllIl[0]];
        enumC0003dArr[llIIllllllIl[1]] = EnumC0003d.BOSS_FIGHT;
        this.bE = c0001b;
    }

    static {
        lIIIIIIIIlllIIl();
        lIIIIIIIIlllIII();
    }

    private static boolean lIIIIIIIIlllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIIlllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIIllllIl(int i) {
        return i != 0;
    }

    private static void lIIIIIIIIlllIIl() {
        llIIllllllIl = new int[5];
        llIIllllllIl[0] = " ".length();
        llIIllllllIl[1] = (8 ^ 54) & ((22 ^ 40) ^ (-1));
        llIIllllllIl[2] = (((56 + 141) - 51) + 2) ^ (((38 + 89) - 60) + 61);
        llIIllllllIl[3] = (246 ^ 135) ^ (91 ^ 47);
        llIIllllllIl[4] = "  ".length();
    }

    private static boolean lIIIIIIIIllllll(int i) {
        return i == 0;
    }
}
