/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.query.results.WidgetQueryResults
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.MEnum;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.NEnum;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.QEnum;

public class o_Unknown {
    private static /* synthetic */ String[] lllIlllIIllI;
    private final /* synthetic */ m bS;
    private final /* synthetic */ q bQ;
    private final /* synthetic */ n bR;
    private static /* synthetic */ int[] lllIlllIIlll;
    private final /* synthetic */ Skill[] bT;

    public n bm() {
        return this.bR;
    }

    private static void lIIIllIlllIIIll() {
        lllIlllIIllI = new String[lllIlllIIlll[2]];
        o.lllIlllIIllI[o.lllIlllIIlll[1]] = o."[CombatOption] Changing the current combat option from $current to $this";
    }

    public boolean bk() {
        return p.br().contains(this);
    }

    public m bn() {
        return this.bS;
    }

    private static boolean lIIIllIlllIIlll(int n2) {
        return n2 != 0;
    }

    public boolean bj() {
        return Objects.equals(p.bq(), this);
    }

    public Skill[] bo() {
        return this.bT;
    }

    private static boolean lIIIllIlllIlIlI(Object object) {
        return object != null;
    }

    private static String lIIIllIlllIIIIl(String var4, String var5) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIlllIIlll[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lllIlllIIlll[3], var2);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIlllIIlIl() {
        lllIlllIIlll = new int[9];
        o.lllIlllIIlll[0] = 3;
        o.lllIlllIIlll[1] = (0x2D ^ 0x17 ^ (0x38 ^ 0x37)) & (103 + 140 - 178 + 103 ^ 151 + 75 - 173 + 104 ^ -1);
        o.lllIlllIIlll[2] = 1;
        o.lllIlllIIlll[3] = 2;
        o.lllIlllIIlll[4] = 0x79 ^ 0x26;
        o.lllIlllIIlll[5] = -(0xFFFFD53F & 0x7FEF) & (0xFFFFF77F & 0x5FFF);
        o.lllIlllIIlll[6] = 0xFFFFFF78 & 0x2DF;
        o.lllIlllIIlll[7] = -(0xFFFFD573 & 0x3B8F) & (0xFFFF97B3 & 0x7DFE);
        o.lllIlllIIlll[8] = 0x86 ^ 0x8E;
    }

    private static boolean lIIIllIlllIlIII(int n2) {
        return n2 == 0;
    }

    public boolean bp() {
        o var6;
        o o2 = p.bq();
        if (o.lIIIllIlllIIllI(o2, this)) {
            return lllIlllIIlll[2];
        }
        if (o.lIIIllIlllIIlll(p.br().contains(var6) ? 1 : 0)) {
            System.out.println(lllIlllIIllI[lllIlllIIlll[1]]);
            if (o.lIIIllIlllIlIII(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
            }
            if (o.lIIIllIlllIIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                String var1 = var6.bQ.bC();
                if (o.lIIIllIlllIlIIl(var1)) {
                    var1 = var6.bQ.name();
                    var1 = var1.substring(lllIlllIIlll[1], var1.indexOf(lllIlllIIlll[4])).toLowerCase();
                }
                int[] nArray = new int[lllIlllIIlll[2]];
                nArray[o.lllIlllIIlll[1]] = lllIlllIIlll[1];
                String[] stringArray = new String[lllIlllIIlll[2]];
                stringArray[o.lllIlllIIlll[1]] = var1;
                Widget var7 = (Widget)((WidgetQueryResults)Widgets.query((int)lllIlllIIlll[5]).types(nArray).actions(stringArray).results()).first();
                if (o.lIIIllIlllIlIlI(var7)) {
                    var7.interact(var1);
                    return Time.sleepUntil(var6::bj, (int)Rand.nextInt((int)lllIlllIIlll[6], (int)lllIlllIIlll[7]));
                }
                0;
                if (1 < 1) {
                    return false;
                }
            }
        } else {
            Log.debug((String)("[CombatOption] " + var6 + " is not available on " + p.bs()));
        }
        return lllIlllIIlll[1];
    }

    private static boolean lIIIllIlllIlIIl(Object object) {
        return object == null;
    }

    o(q q2, n n2, m m2, Skill skill, Skill skill2) {
        Skill[] skillArray = new Skill[lllIlllIIlll[0]];
        skillArray[o.lllIlllIIlll[1]] = skill;
        skillArray[o.lllIlllIIlll[2]] = skill2;
        skillArray[o.lllIlllIIlll[3]] = null;
        this(q2, n2, m2, skillArray);
    }

    static {
        o.lIIIllIlllIIlIl();
        o.lIIIllIlllIIIll();
    }

    public q bl() {
        return this.bQ;
    }

    o(q q2, n n2, m m2, Skill ... skillArray) {
        this.bQ = q2;
        this.bR = n2;
        this.bS = m2;
        this.bT = skillArray;
    }

    private static boolean lIIIllIlllIIllI(Object object, Object object2) {
        return object == object2;
    }
}

