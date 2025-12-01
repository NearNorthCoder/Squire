package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.K  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/K.class */
public class K extends Task {
    private final /* synthetic */ BankStanderConfig x;
    private static /* synthetic */ int[] lllIlIllIlI;
    private static /* synthetic */ String[] lllIlIllIIl;

    @Inject
    public K(BankStanderConfig bankStanderConfig) {
        this.x = bankStanderConfig;
    }

    private static void lIllIIIIIIlIIl() {
        lllIlIllIlI = new int[4];
        lllIlIllIlI[0] = ((121 ^ 58) ^ (4 ^ 79)) & (((((69 + 60) - 117) + 192) ^ (((130 + 96) - 182) + 152)) ^ (-" ".length()));
        lllIlIllIlI[1] = "   ".length();
        lllIlIllIlI[2] = " ".length();
        lllIlIllIlI[3] = (65 ^ 82) ^ (23 ^ 51);
    }

    private Spell S() {
        return lIllIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lllIlIllIlI[3]) ? SpellBook.Standard.HIGH_LEVEL_ALCHEMY : SpellBook.Standard.LOW_LEVEL_ALCHEMY;
    }

    private static String lIllIIIIIIIlll(String llllllllllllllllIIlIIlIIIlIIIIll, String llllllllllllllllIIlIIlIIIlIIIIlI) {
        String llllllllllllllllIIlIIlIIIlIIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIlIIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIlIIIlIIIIlI.toCharArray();
        int llllllllllllllllIIlIIlIIIIllllll = lllIlIllIlI[0];
        char[] charArray2 = llllllllllllllllIIlIIlIIIlIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIllIlI[0];
        while (lIllIIIIIIlllI(i, length)) {
            llllllllllllllllIIlIIlIIIlIIIIIl.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIIlIIIIllllll % charArray.length]));
            "".length();
            llllllllllllllllIIlIIlIIIIllllll++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIlIIIIIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    private boolean d(Item item) {
        String[] split = this.x.alchItems().split(lllIlIllIIl[lllIlIllIlI[0]]);
        int length = split.length;
        int i = lllIlIllIlI[0];
        while (lIllIIIIIIlllI(i, length)) {
            String trim = split[i].trim();
            if (!lIllIIIIIIllII(trim.equals(item.getName()) ? 1 : 0) || lIllIIIIIIllll(trim.equals(String.valueOf(item.getId())) ? 1 : 0)) {
                return lllIlIllIlI[2];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((23 ^ 103) ^ (70 ^ 23)) & (((47 ^ 26) ^ (176 ^ 164)) ^ (-" ".length()));
            }
        }
        return lllIlIllIlI[0];
    }

    static {
        lIllIIIIIIlIIl();
        lIllIIIIIIlIII();
    }

    private static boolean lIllIIIIIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIIIIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIIIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (lIllIIIIIIlIlI(this.x.activity(), EnumC0001b.ALCHING)) {
            return lllIlIllIlI[0];
        }
        Item first = Inventory.getFirst(this::d);
        if (lIllIIIIIIlIll(first)) {
            return lllIlIllIlI[0];
        }
        Spell S = S();
        if (lIllIIIIIIllII(S.canCast() ? 1 : 0)) {
            return lllIlIllIlI[0];
        }
        S.castOn(first);
        sleep(lllIlIllIlI[1]);
        return lllIlIllIlI[2];
    }

    private static boolean lIllIIIIIIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIIIIIIllII(int i) {
        return i == 0;
    }

    private static void lIllIIIIIIlIII() {
        lllIlIllIIl = new String[lllIlIllIlI[2]];
        lllIlIllIIl[lllIlIllIlI[0]] = lIllIIIIIIIlll("bQ==", "AHGeP");
    }
}
