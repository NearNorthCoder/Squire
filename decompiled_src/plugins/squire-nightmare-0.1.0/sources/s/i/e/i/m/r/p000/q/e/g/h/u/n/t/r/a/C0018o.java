package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.query.results.WidgetQueryResults;
import net.unethicalite.api.query.widgets.WidgetQuery;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/o.class */
public class C0018o {
    private static /* synthetic */ String[] lllIlllIIllI;
    private final /* synthetic */ EnumC0016m bS;
    private final /* synthetic */ EnumC0020q bQ;
    private final /* synthetic */ EnumC0017n bR;
    private static /* synthetic */ int[] lllIlllIIlll;
    private final /* synthetic */ Skill[] bT;

    public EnumC0017n bm() {
        return this.bR;
    }

    private static void lIIIllIlllIIIll() {
        lllIlllIIllI = new String[lllIlllIIlll[2]];
        lllIlllIIllI[lllIlllIIlll[1]] = lIIIllIlllIIIIl("15D2rKP4XJoDWJdIUu9RMOZIyGNvwxXWfSKabGPJKFIJf/B1xBYZVw2XqDdfEo4Vkd6XOUpSe8lmHhgGx46kPoS3ZcbHU1F+vFc9qEFI7jQ=", "IrwIA");
    }

    public boolean bk() {
        return C0019p.br().contains(this);
    }

    public EnumC0016m bn() {
        return this.bS;
    }

    private static boolean lIIIllIlllIIlll(int i) {
        return i != 0;
    }

    public boolean bj() {
        return Objects.equals(C0019p.bq(), this);
    }

    public Skill[] bo() {
        return this.bT;
    }

    private static boolean lIIIllIlllIlIlI(Object obj) {
        return obj != null;
    }

    private static String lIIIllIlllIIIIl(String lllllllllllllllIIllIIlIIlllIIIll, String lllllllllllllllIIllIIlIIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIlllIIlll[8]), "DES");
            Cipher lllllllllllllllIIllIIlIIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIIlllIIlIl.init(lllIlllIIlll[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIlllIIlII) {
            lllllllllllllllIIllIIlIIlllIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIlllIIlIl() {
        lllIlllIIlll = new int[9];
        lllIlllIIlll[0] = "   ".length();
        lllIlllIIlll[1] = ((45 ^ 23) ^ (56 ^ 55)) & (((((103 + 140) - 178) + 103) ^ (((151 + 75) - 173) + 104)) ^ (-" ".length()));
        lllIlllIIlll[2] = " ".length();
        lllIlllIIlll[3] = "  ".length();
        lllIlllIIlll[4] = 121 ^ 38;
        lllIlllIIlll[5] = (-((-10945) & 32751)) & (-2177) & 24575;
        lllIlllIIlll[6] = (-136) & 735;
        lllIlllIIlll[7] = (-((-10893) & 15247)) & (-26701) & 32254;
        lllIlllIIlll[8] = 134 ^ 142;
    }

    private static boolean lIIIllIlllIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean bp() {
        if (lIIIllIlllIIllI(C0019p.bq(), this)) {
            return lllIlllIIlll[2];
        }
        if (lIIIllIlllIIlll(C0019p.br().contains(this) ? 1 : 0)) {
            System.out.println(lllIlllIIllI[lllIlllIIlll[1]]);
            if (lIIIllIlllIlIII(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
            }
            if (lIIIllIlllIIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                String lllllllllllllllIIllIIlIIlllIllII = this.bQ.bC();
                if (lIIIllIlllIlIIl(lllllllllllllllIIllIIlIIlllIllII)) {
                    String lllllllllllllllIIllIIlIIlllIllII2 = this.bQ.name();
                    lllllllllllllllIIllIIlIIlllIllII = lllllllllllllllIIllIIlIIlllIllII2.substring(lllIlllIIlll[1], lllllllllllllllIIllIIlIIlllIllII2.indexOf(lllIlllIIlll[4])).toLowerCase();
                }
                WidgetQuery query = Widgets.query(lllIlllIIlll[5]);
                int[] iArr = new int[lllIlllIIlll[2]];
                iArr[lllIlllIIlll[1]] = lllIlllIIlll[1];
                WidgetQuery types = query.types(iArr);
                String[] strArr = new String[lllIlllIIlll[2]];
                strArr[lllIlllIIlll[1]] = lllllllllllllllIIllIIlIIlllIllII;
                Widget widget = (Widget) ((WidgetQueryResults) types.actions(strArr).results()).first();
                if (lIIIllIlllIlIlI(widget)) {
                    widget.interact(lllllllllllllllIIllIIlIIlllIllII);
                    return Time.sleepUntil(this::bj, Rand.nextInt(lllIlllIIlll[6], lllIlllIIlll[7]));
                }
                "".length();
                if (" ".length() < " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        } else {
            Log.debug("[CombatOption] " + this + " is not available on " + C0019p.bs());
        }
        return lllIlllIIlll[1];
    }

    private static boolean lIIIllIlllIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0018o(EnumC0020q enumC0020q, EnumC0017n enumC0017n, EnumC0016m enumC0016m, Skill skill, Skill skill2) {
        this(enumC0020q, enumC0017n, enumC0016m, r4);
        Skill[] skillArr = new Skill[lllIlllIIlll[0]];
        skillArr[lllIlllIIlll[1]] = skill;
        skillArr[lllIlllIIlll[2]] = skill2;
        skillArr[lllIlllIIlll[3]] = null;
    }

    static {
        lIIIllIlllIIlIl();
        lIIIllIlllIIIll();
    }

    public EnumC0020q bl() {
        return this.bQ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0018o(EnumC0020q enumC0020q, EnumC0017n enumC0017n, EnumC0016m enumC0016m, Skill... skillArr) {
        this.bQ = enumC0020q;
        this.bR = enumC0017n;
        this.bS = enumC0016m;
        this.bT = skillArr;
    }

    private static boolean lIIIllIlllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }
}
