/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.HHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.JHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.KHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.YHelper;
import gg.squire.account.AccBuilderBarrows;
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
import net.unethicalite.api.widgets.Dialog;

public class OHelper
implements F {
    public static  String h;
    public static  List<F> cc;

    static  boolean cd;
    static  int bZ;

    public static void az() {
        if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0) && o.llIIIlIlIIl(bZ, lllIlllI[0])) {
            F[] fArray = new F[lllIlllI[1]];
            fArray[o.lllIlllI[2]] = new YHelper();
            fArray[o.lllIlllI[0]] = new KHelper();
            List<F> list = Arrays.asList(fArray);
            F[] fArray2 = new F[lllIlllI[3]];
            fArray2[o.lllIlllI[2]] = new HHelper();
            fArray2[o.lllIlllI[0]] = new QHelper();
            fArray2[o.lllIlllI[1]] = new IHelper();
            List<F> list2 = Arrays.asList(fArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            cc.addAll(list);

            cc.addAll(list2);

            cc.add(new JHelper());

            bZ += lllIlllI[0];
            if (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                if (o.llIIIlIlIII(cd ? 1 : 0)) {
                    Collections.shuffle(cc);
                }
                System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                h = cc.get(lllIlllI[2]).V();
            }
        }
        while (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0) && o.llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0)) {
            if (!o.llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) continue;
            if (o.llIIIlIlIII(cc.get(lllIlllI[2]).W() ? 1 : 0)) {
                AccBuilderBarrows.f += lllIlllI[0];
                System.out.println("Achieved " + cc.get(lllIlllI[2]).V() + " goal");
                cc.remove(lllIlllI[2]);

                if (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                    h = cc.get(lllIlllI[2]).V();
                }
                if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0)) {
                    h = lllIllII[lllIlllI[2]];
                }
                Time.sleepTicks((int)lllIlllI[4]);

            }
            if (o.llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
                while (o.llIIIlIlIII(e.y() ? 1 : 0) && o.llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0) && o.llIIIlIllII(e.j(lllIlllI[5]), lllIlllI[6]) && o.llIIIlIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIllII[lllIlllI[0]];
                    e.z();
                    Time.sleepTicks((int)lllIlllI[0]);

                    if ((0x11 ^ 0x61 ^ (0x24 ^ 0x51)) != 0) continue;
                    return;
                }
                AccBuilderBarrows.l = cc.get(lllIlllI[2]).V();
                int lIIllllIIllIIIl = cc.get(lllIlllI[2]).U();
                Time.sleep((long)lIIllllIIllIIIl);

                Time.sleep((long)e.c(lllIlllI[7], lllIlllI[8]));

            }
            e.F();

            if (1 >= 0) continue;
            return;
        }
    }

    private static boolean llIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIlIll(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int U() {
        try {
            o.az();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 != 1) {
            return (0x20 ^ 0) & ~(0x97 ^ 0xB7);
        }
        return lllIlllI[9];
    }

        return String.valueOf(lIIllllIIlIIIIl);
    }

    static {
        o.llIIIlIIlll();
        o.llIIIIllllI();
        cc = new ArrayList<F>();
        h = lllIllII[lllIlllI[1]];
        cd = lllIlllI[2];
    }

    private static boolean llIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public String V() {
        return h;
    }

    private static boolean llIIIlIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean T() {
        return lllIlllI[2];
    }

    @Override
    public boolean W() {
        int n2;
        if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0) && o.llIIIlIllIl(bZ)) {
            n2 = lllIlllI[0];

            if ((0x4D ^ 0x49) == 0) {
                return false;
            }
        } else {
            n2 = lllIlllI[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIlIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIllllI() {
        lllIllII = new String[lllIlllI[3]];
        o.lllIllII[o.lllIlllI[2]] = "none";
        o.lllIllII[o.lllIlllI[0]] = "Disabling GE warning";
        o.lllIllII[o.lllIlllI[1]] = o.llIIIIlllIl("iGrAcWMDdfk=", "okQwP");
    }

}

