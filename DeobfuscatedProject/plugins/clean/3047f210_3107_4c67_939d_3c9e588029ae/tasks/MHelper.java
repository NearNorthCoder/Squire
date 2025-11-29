/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.CHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.LHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.PHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.UHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.NHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.OHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.PHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.QHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.RHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.SHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.UHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.VHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.WHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

public class MHelper
implements S {

    public static  String h;
    static  boolean bW;
    public static  List<S> bV;
    static  int bS;

    @Override
    public boolean S() {
        return lllIllIlII[2];
    }

    @Override
    public boolean V() {
        int n2;
        if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0) && m.llIIlIIIlIIlI(bS)) {
            n2 = lllIllIlII[0];

            if (1 <= ((0xB0 ^ 0x81) & ~(0x9E ^ 0xAF))) {
                return false;
            }
        } else {
            n2 = lllIllIlII[2];
        }
        return n2 != 0;
    }

    private static boolean llIIlIIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return h;
    }

    private static boolean llIIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Override
    public int T() {
        try {
            m.au();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 0) {
            return (0x41 ^ 0x1A) & ~(0x34 ^ 0x6F);
        }
        return lllIllIlII[8];
    }

    private static void llIIlIIIIllII() {
        lllIllIIll = new String[lllIllIlII[4]];
        m.lllIllIIll[m.lllIllIlII[2]] = "none";
        m.lllIllIIll[m.lllIllIlII[0]] = "Disabling GE warning";
        m.lllIllIIll[m.lllIllIlII[3]] = m.llIIlIIIIlIll("", "auxnt");
    }

    public static void au() {
        if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0) && m.llIIlIIIIllll(bS, lllIllIlII[0])) {
            S[] sArray = new S[lllIllIlII[1]];
            sArray[m.lllIllIlII[2]] = new WHelper();
            sArray[m.lllIllIlII[0]] = new LHelper();
            sArray[m.lllIllIlII[3]] = new FHelper();
            sArray[m.lllIllIlII[4]] = new EHelper();
            sArray[m.lllIllIlII[5]] = new CHelper();
            List<S> list = Arrays.asList(sArray);
            S[] sArray2 = new S[lllIllIlII[1]];
            sArray2[m.lllIllIlII[2]] = new UHelper();
            sArray2[m.lllIllIlII[0]] = new OHelper();
            sArray2[m.lllIllIlII[3]] = new AHelper();
            sArray2[m.lllIllIlII[4]] = new PHelper();
            sArray2[m.lllIllIlII[5]] = new SHelper();
            List<S> list2 = Arrays.asList(sArray2);
            S[] sArray3 = new S[lllIllIlII[5]];
            sArray3[m.lllIllIlII[2]] = new RHelper();
            sArray3[m.lllIllIlII[0]] = new QHelper();
            sArray3[m.lllIllIlII[3]] = new PHelper();
            sArray3[m.lllIllIlII[4]] = new NHelper();
            List<S> list3 = Arrays.asList(sArray3);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            bV.addAll(list);

            bV.add(new VHelper());

            bV.addAll(list2);

            bV.add(new DHelper());

            bV.add(new UHelper());

            bV.addAll(list3);

            bS += lllIllIlII[0];
            if (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0)) {
                if (m.llIIlIIIIlllI(bW ? 1 : 0)) {
                    Collections.shuffle(bV);
                }
                System.out.println("Switching to : " + bV.get(lllIllIlII[2]).U());
                h = bV.get(lllIllIlII[2]).U();
            }
        }
        while (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0) && m.llIIlIIIlIIII(AccBuilderTempleTrek.d ? 1 : 0)) {
            if (!m.llIIlIIIlIIIl(Game.getState(), GameState.LOGGED_IN)) continue;
            if (m.llIIlIIIIlllI(bV.get(lllIllIlII[2]).V() ? 1 : 0)) {
                AccBuilderTempleTrek.f += lllIllIlII[0];
                System.out.println("Achieved " + bV.get(lllIllIlII[2]).U() + " goal");
                bV.remove(lllIllIlII[2]);

                if (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + bV.get(lllIllIlII[2]).U());
                    h = bV.get(lllIllIlII[2]).U();
                }
                if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0)) {
                    h = lllIllIIll[lllIllIlII[2]];
                }
                Time.sleepTicks((int)lllIllIlII[5]);

            }
            if (m.llIIlIIIlIIIl(Game.getState(), GameState.LOGGED_IN)) {
                while (m.llIIlIIIIlllI(e.x() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIllIIll[lllIllIlII[0]];
                    e.y();
                    Time.sleepTicks((int)lllIllIlII[0]);

                    if (-2 < 0) continue;
                    return;
                }
                AccBuilderTempleTrek.l = bV.get(lllIllIlII[2]).U();
                int var2 = bV.get(lllIllIlII[2]).T();
                Time.sleep((long)var2);

                Time.sleep((long)e.c(lllIllIlII[6], lllIllIlII[7]));

            }
            e.E();

            if (-1 < 2) continue;
            return;
        }
    }

    private static boolean llIIlIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIIlIIII(int n2) {
        return n2 == 0;
    }

    static {
        m.llIIlIIIIllIl();
        m.llIIlIIIIllII();
        bV = new ArrayList<S>();
        h = lllIllIIll[lllIllIlII[3]];
        bW = lllIllIlII[2];
    }
}

