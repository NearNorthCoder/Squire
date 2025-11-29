/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.CHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.LHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.OHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.QHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.SHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.THelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.NHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.QHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.UHelper;
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
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Dialog;

public class SHelper
implements K {
    static  boolean cY;
    static  int cA;
    public static  List<K> cX;
    public static  String h;

    private static boolean lIIIlIIlllIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean af() {
        int n2;
        if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && s.lIIIlIIlllIll(cA) && s.lIIIlIIllllII(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlIlI[10])) {
            n2 = lIlIIIlIlI[0];

            if (3 >= (0x83 ^ 0x87)) {
                return (3 & ~3) != 0;
            }
        } else {
            n2 = lIlIIIlIlI[2];
        }
        return n2 != 0;
    }

    static {
        s.lIIIlIIllIlIl();
        s.lIIIlIIllIIll();
        cX = new ArrayList<K>();
        h = lIlIIIlIIl[lIlIIIlIlI[1]];
        cY = lIlIIIlIlI[2];
    }

    private static boolean lIIIlIIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ae() {
        return h;
    }

    public static void aZ() {
        if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && s.lIIIlIIllIlll(cA, lIlIIIlIlI[0])) {
            K[] kArray = new K[lIlIIIlIlI[1]];
            kArray[s.lIlIIIlIlI[2]] = new CHelper();
            kArray[s.lIlIIIlIlI[0]] = new THelper();
            List<K> list = Arrays.asList(kArray);
            K[] kArray2 = new K[lIlIIIlIlI[3]];
            kArray2[s.lIlIIIlIlI[2]] = new SHelper();
            kArray2[s.lIlIIIlIlI[0]] = new UHelper();
            kArray2[s.lIlIIIlIlI[1]] = new QHelper();
            kArray2[s.lIlIIIlIlI[4]] = new LHelper();
            kArray2[s.lIlIIIlIlI[5]] = new OHelper();
            List<K> list2 = Arrays.asList(kArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            cX.addAll(list);

            cX.addAll(list2);

            cX.add(new QHelper());

            cA += lIlIIIlIlI[0];
            if (s.lIIIlIIlllIII(cX.isEmpty() ? 1 : 0)) {
                if (s.lIIIlIIllIllI(cY ? 1 : 0)) {
                    Collections.shuffle(cX);
                }
                System.out.println("Switching to : " + cX.get(lIlIIIlIlI[2]).ae());
                h = cX.get(lIlIIIlIlI[2]).ae();
            }
        }
        while (s.lIIIlIIlllIII(cX.isEmpty() ? 1 : 0) && s.lIIIlIIlllIII(AccBuilderShamans.d ? 1 : 0)) {
            if (!s.lIIIlIIlllIIl(Game.getState(), GameState.LOGGED_IN)) continue;
            if (s.lIIIlIIllIllI(cX.get(lIlIIIlIlI[2]).af() ? 1 : 0)) {
                AccBuilderShamans.f += lIlIIIlIlI[0];
                System.out.println("Achieved " + cX.get(lIlIIIlIlI[2]).ae() + " goal");
                cX.remove(lIlIIIlIlI[2]);

                if (s.lIIIlIIlllIII(cX.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cX.get(lIlIIIlIlI[2]).ae());
                    h = cX.get(lIlIIIlIlI[2]).ae();
                }
                if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0)) {
                    h = lIlIIIlIIl[lIlIIIlIlI[2]];
                }
                Time.sleepTicks((int)lIlIIIlIlI[5]);

            }
            if (s.lIIIlIIlllIIl(Game.getState(), GameState.LOGGED_IN)) {
                while (s.lIIIlIIllIllI(e.x() ? 1 : 0) && s.lIIIlIIlllIII(AccBuilderShamans.d ? 1 : 0) && s.lIIIlIIlllIlI(e.j(lIlIIIlIlI[6]), lIlIIIlIlI[7]) && s.lIIIlIIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIlIIl[lIlIIIlIlI[0]];
                    e.y();
                    Time.sleepTicks((int)lIlIIIlIlI[0]);

                    if (-3 < 0) continue;
                    return;
                }
                AccBuilderShamans.l = cX.get(lIlIIIlIlI[2]).ae();
                int var1 = cX.get(lIlIIIlIlI[2]).ad();
                Time.sleep((long)var1);

                Time.sleep((long)e.c(lIlIIIlIlI[8], lIlIIIlIlI[9]));

            }
            e.E();

            if (2 != (0x79 ^ 0x2A ^ (0x2F ^ 0x78))) continue;
            return;
        }
        if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && s.lIIIlIIlllIll(cA) && s.lIIIlIIllIlll(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlIlI[10])) {
            n.ay();
        }
    }

    private static void lIIIlIIllIIll() {
        lIlIIIlIIl = new String[lIlIIIlIlI[4]];
        s.lIlIIIlIIl[s.lIlIIIlIlI[2]] = "none";
        s.lIlIIIlIIl[s.lIlIIIlIlI[0]] = "Disabling GE warning";
        s.lIlIIIlIIl[s.lIlIIIlIlI[1]] = s.lIIIlIIllIIlI("8oYqMyawO7c=", "Hsmfy");
    }

    private static boolean lIIIlIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ac() {
        return lIlIIIlIlI[2];
    }

    @Override
    public int ad() {
        try {
            s.aZ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < 0) {
            return (92 + 43 - 63 + 82 ^ 79 + 3 - -75 + 10) & (124 + 100 - 131 + 34 ^ (0x1A ^ 0x58) ^ -1);
        }
        return lIlIIIlIlI[11];
    }

    private static boolean lIIIlIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIlllIIl(Object object, Object object2) {
        return object == object2;
    }
}

