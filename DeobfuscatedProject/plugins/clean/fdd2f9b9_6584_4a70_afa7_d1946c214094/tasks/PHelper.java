/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.HHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.JHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.OHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.OHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.ZHelper;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

public class PHelper
implements G {
    public static  List<G> ce;
    static  int bT;
    public static  String h;

    static  boolean cf;

    private static boolean lllIlllllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIllllllIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        p.lllIlllllIIl();
        p.lllIlllllIII();
        ce = new ArrayList<G>();
        h = lIIIllIlIl[lIIIllIllI[1]];
        cf = lIIIllIllI[2];
    }

    private static boolean lllIllllllII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0) && p.lllIlllllllI(bT)) {
            n2 = lIIIllIllI[0];

            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = lIIIllIllI[2];
        }
        return n2 != 0;
    }

    private static boolean lllIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lIIIllIllI[2];
    }

    private static boolean lllIlllllIlI(int n2) {
        return n2 != 0;
    }

    public static void aB() {
        if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0) && p.lllIlllllIll(bT, lIIIllIllI[0])) {
            G[] gArray = new G[lIIIllIllI[1]];
            gArray[p.lIIIllIllI[2]] = new ZHelper();
            gArray[p.lIIIllIllI[0]] = new HHelper();
            List<G> list = Arrays.asList(gArray);
            G[] gArray2 = new G[lIIIllIllI[3]];
            gArray2[p.lIIIllIllI[2]] = new UHelper();
            gArray2[p.lIIIllIllI[0]] = new JHelper();
            gArray2[p.lIIIllIllI[1]] = new OHelper();
            List<G> list2 = Arrays.asList(gArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            ce.addAll(list);

            ce.addAll(list2);

            ce.add(new OHelper());

            bT += lIIIllIllI[0];
            if (p.lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                if (p.lllIlllllIlI(cf ? 1 : 0)) {
                    Collections.shuffle(ce);
                }
                System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                h = ce.get(lIIIllIllI[2]).U();
            }
        }
        while (p.lllIllllllII(ce.isEmpty() ? 1 : 0) && p.lllIllllllII(AccBuilderRogues.d ? 1 : 0)) {
            if (!p.lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) continue;
            if (p.lllIlllllIlI(ce.get(lIIIllIllI[2]).V() ? 1 : 0)) {
                AccBuilderRogues.f += lIIIllIllI[0];
                System.out.println("Achieved " + ce.get(lIIIllIllI[2]).U() + " goal");
                ce.remove(lIIIllIllI[2]);

                if (p.lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                    h = ce.get(lIIIllIllI[2]).U();
                }
                if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0)) {
                    h = lIIIllIlIl[lIIIllIllI[2]];
                }
                Time.sleepTicks((int)lIIIllIllI[4]);

            }
            if (p.lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) {
                while (p.lllIlllllIlI(e.x() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlIl[lIIIllIllI[0]];
                    e.y();
                    Time.sleepTicks((int)lIIIllIllI[0]);

                    if ((1 & (1 ^ -1)) >= 0) continue;
                    return;
                }
                AccBuilderRogues.l = ce.get(lIIIllIllI[2]).U();
                int lllIllllIIl = ce.get(lIIIllIllI[2]).T();
                Time.sleep((long)lllIllllIIl);

                Time.sleep((long)e.c(lIIIllIllI[5], lIIIllIllI[6]));

            }
            e.E();

            if (-1 <= 0) continue;
            return;
        }
    }

    @Override
    public String U() {
        return h;
    }

    private static void lllIlllllIII() {
        lIIIllIlIl = new String[lIIIllIllI[3]];
        p.lIIIllIlIl[p.lIIIllIllI[2]] = "none";
        p.lIIIllIlIl[p.lIIIllIllI[0]] = "Disabling GE warning";
        p.lIIIllIlIl[p.lIIIllIllI[1]] = p.lllIllllIlll("pxtAPvnYxCA=", "eVVOZ");
    }

    @Override
    public int T() {
        try {
            p.aB();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == 3) {
            return (92 + 149 - 225 + 147 ^ 142 + 23 - 159 + 167) & (0x52 ^ 0x29 ^ (0xEF ^ 0x9A) ^ -1);
        }
        return lIIIllIllI[7];
    }
}

