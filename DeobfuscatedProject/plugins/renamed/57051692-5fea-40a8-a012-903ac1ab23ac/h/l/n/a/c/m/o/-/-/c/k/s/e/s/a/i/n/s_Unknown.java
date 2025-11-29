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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.C_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.L_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.O_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Q_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.S_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.T_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.n_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.q_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.u_Unknown;
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

public class s_Unknown
implements K {
    static /* synthetic */ boolean cY;
    static /* synthetic */ int cA;
    public static /* synthetic */ List<K> cX;
    public static /* synthetic */ String h;
    private static /* synthetic */ int[] lIlIIIlIlI;
    private static /* synthetic */ String[] lIlIIIlIIl;

    private static boolean lIIIlIIlllIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean af() {
        int n2;
        if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && s.lIIIlIIlllIll(cA) && s.lIIIlIIllllII(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlIlI[10])) {
            n2 = lIlIIIlIlI[0];
            0;
            if (3 >= (0x83 ^ 0x87)) {
                return (3 & ~3) != 0;
            }
        } else {
            n2 = lIlIIIlIlI[2];
        }
        return n2 != 0;
    }

    private static String lIIIlIIllIIlI(String var10, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIIlIlI[1], var9);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
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

    private static void lIIIlIIllIlIl() {
        lIlIIIlIlI = new int[13];
        s.lIlIIIlIlI[0] = 1;
        s.lIlIIIlIlI[1] = 2;
        s.lIlIIIlIlI[2] = (0x14 ^ 0x19 ^ (0xE0 ^ 0xA8)) & (0x53 ^ 0x2A ^ (0xA ^ 0x36) ^ -1);
        s.lIlIIIlIlI[3] = 0x48 ^ 0x4D;
        s.lIlIIIlIlI[4] = 3;
        s.lIlIIIlIlI[5] = 0xE9 ^ 0xAC ^ (0x2A ^ 0x6B);
        s.lIlIIIlIlI[6] = 0xFFFFDDFB & 0x231D;
        s.lIlIIIlIlI[7] = -(0xFFFFF27B & 0x5D87) & (0xFFFFFFEA & 0x53FF);
        s.lIlIIIlIlI[8] = 0x83 ^ 0x9F ^ (0xBA ^ 0x94);
        s.lIlIIIlIlI[9] = 0x6A ^ 0x3A;
        s.lIlIIIlIlI[10] = 0x3B ^ 6;
        s.lIlIIIlIlI[11] = 0xF8 ^ 0x9C;
        s.lIlIIIlIlI[12] = 0x13 ^ 0x1B;
    }

    private static String lIIIlIIllIIIl(String var11, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlI[12]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIIIlIlI[1], var1);
            return new String(var3.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
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
            kArray[s.lIlIIIlIlI[2]] = new C();
            kArray[s.lIlIIIlIlI[0]] = new T();
            List<K> list = Arrays.asList(kArray);
            K[] kArray2 = new K[lIlIIIlIlI[3]];
            kArray2[s.lIlIIIlIlI[2]] = new S();
            kArray2[s.lIlIIIlIlI[0]] = new u();
            kArray2[s.lIlIIIlIlI[1]] = new Q();
            kArray2[s.lIlIIIlIlI[4]] = new L();
            kArray2[s.lIlIIIlIlI[5]] = new O();
            List<K> list2 = Arrays.asList(kArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            cX.addAll(list);
            0;
            cX.addAll(list2);
            0;
            cX.add(new q());
            0;
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
                0;
                if (s.lIIIlIIlllIII(cX.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cX.get(lIlIIIlIlI[2]).ae());
                    h = cX.get(lIlIIIlIlI[2]).ae();
                }
                if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0)) {
                    h = lIlIIIlIIl[lIlIIIlIlI[2]];
                }
                Time.sleepTicks((int)lIlIIIlIlI[5]);
                0;
            }
            if (s.lIIIlIIlllIIl(Game.getState(), GameState.LOGGED_IN)) {
                while (s.lIIIlIIllIllI(e.x() ? 1 : 0) && s.lIIIlIIlllIII(AccBuilderShamans.d ? 1 : 0) && s.lIIIlIIlllIlI(e.j(lIlIIIlIlI[6]), lIlIIIlIlI[7]) && s.lIIIlIIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIlIIl[lIlIIIlIlI[0]];
                    e.y();
                    Time.sleepTicks((int)lIlIIIlIlI[0]);
                    0;
                    0;
                    if (-3 < 0) continue;
                    return;
                }
                AccBuilderShamans.l = cX.get(lIlIIIlIlI[2]).ae();
                int var8 = cX.get(lIlIIIlIlI[2]).ad();
                Time.sleep((long)var8);
                0;
                Time.sleep((long)e.c(lIlIIIlIlI[8], lIlIIIlIlI[9]));
                0;
            }
            e.E();
            0;
            if (2 != (0x79 ^ 0x2A ^ (0x2F ^ 0x78))) continue;
            return;
        }
        if (s.lIIIlIIllIllI(cX.isEmpty() ? 1 : 0) && s.lIIIlIIlllIll(cA) && s.lIIIlIIllIlll(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlIlI[10])) {
            n.ay();
        }
    }

    private static void lIIIlIIllIIll() {
        lIlIIIlIIl = new String[lIlIIIlIlI[4]];
        s.lIlIIIlIIl[s.lIlIIIlIlI[2]] = s."none";
        s.lIlIIIlIIl[s.lIlIIIlIlI[0]] = s."Disabling GE warning";
        s.lIlIIIlIIl[s.lIlIIIlIlI[1]] = s."";
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
            0;
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

