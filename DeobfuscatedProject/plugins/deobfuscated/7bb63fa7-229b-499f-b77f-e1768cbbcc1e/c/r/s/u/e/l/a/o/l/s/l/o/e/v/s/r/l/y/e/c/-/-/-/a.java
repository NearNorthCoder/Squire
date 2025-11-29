/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.plugins.logout.Clues;

public class a {
    private static /* synthetic */ String[] lIIll;
    private static /* synthetic */ int[] lIlIl;
    static /* synthetic */ String[] a;

    public static void i() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[4]).interact(lIIll[lIlIl[22]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[23]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIllllI(String lllllIIllIIIIIl, String lllllIIlIlllllI) {
        try {
            SecretKeySpec lllllIIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIlIlllllI.getBytes(StandardCharsets.UTF_8)), lIlIl[15]), "DES");
            Cipher lllllIIllIIIIll = Cipher.getInstance("DES");
            lllllIIllIIIIll.init(lIlIl[2], lllllIIllIIIlII);
            return new String(lllllIIllIIIIll.doFinal(Base64.getDecoder().decode(lllllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIllIIIIlI) {
            lllllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlll(Object object) {
        return object != null;
    }

    public static void f() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[2]).interact(lIIll[lIlIl[17]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[18]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void g() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[19]).interact(lIIll[lIlIl[13]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[20]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void n() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[17]).interact(lIIll[lIlIl[30]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[31]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static boolean llIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIIlI();
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIIIl();
        a = new String[lIlIl[0]];
    }

    public static void d() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[13]).interact(lIIll[lIlIl[4]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[14]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIlllIl(String lllllIIlIIllIlI, String lllllIIlIIllIIl) {
        try {
            SecretKeySpec lllllIIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIlIIllllI = Cipher.getInstance("Blowfish");
            lllllIIlIIllllI.init(lIlIl[2], lllllIIlIIlllll);
            return new String(lllllIIlIIllllI.doFinal(Base64.getDecoder().decode(lllllIIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIlIIlllIl) {
            lllllIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIl(int n2) {
        return n2 != 0;
    }

    public static void a() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[10]).interact(lIIll[lIlIl[0]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[1]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static void llIIIIl() {
        lIIll = new String[lIlIl[34]];
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[1]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[2]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[7]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[12]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[8]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[4]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[14]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[15]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[16]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[17]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[18]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[13]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[20]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[21]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[11]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[22]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[23]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[24]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[19]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[10]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[25]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[26]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[27]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[28]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[29]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[30]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[31]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[32]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[33]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a."Uri";
    }

    public static void l() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[18]).interact(lIIll[lIlIl[26]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[27]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static boolean a(int[] nArray) {
        int[] lllllIIllIlIlII;
        int lllllIIllIlIIll = lIlIl[0];
        while (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIIll(lllllIIllIlIIll, lllllIIllIlIlII.length)) {
            int[] nArray2 = new int[lIlIl[1]];
            nArray2[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[0]] = lllllIIllIlIlII[lllllIIllIlIIll];
            if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIl[1]];
                nArray3[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[0]] = lllllIIllIlIlII[lllllIIllIlIIll];
                if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                    return lIlIl[0];
                }
            }
            ++lllllIIllIlIIll;
            0;
            if (null == null) continue;
            return ((89 + 137 - 145 + 129 ^ 55 + 67 - 9 + 33) & (0xB6 ^ 0x9F ^ (0x5F ^ 0x36) ^ -1)) != 0;
        }
        return lIlIl[1];
    }

    public static void a(String string) {
        Clues.c = "Selecting music: " + string;
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
            Tabs.open((Tab)Tab.MUSIC);
            Time.sleepTicks((int)lIlIl[2]);
            0;
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
            String lllllIIllIIllIl;
            if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIllI(Widgets.get((int)lIlIl[3], (int)lIlIl[0])) && c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Widget[] lllllIIllIIllII = Widgets.get((int)lIlIl[3], (int)lIlIl[4]).getChildren();
            Widget lllllIIllIIlIll = Widgets.get((int)lIlIl[5], (int)lIlIl[6]);
            Widget lllllIIllIIlIlI = Widgets.get((int)lIlIl[3], (int)lIlIl[0]).getChild(lIlIl[0]);
            if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlll(lllllIIllIIlIlI)) {
                System.out.println(lllllIIllIIllIl);
                Mouse.click((int)lllllIIllIIlIlI.getClickPoint().getX(), (int)lllllIIllIIlIlI.getClickPoint().getY(), (boolean)lIlIl[1]);
                Time.sleepTicks((int)k.c(lIlIl[2], lIlIl[7]));
                0;
            }
            try {
                List lllllIIllIIlIIl;
                if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlll(lllllIIllIIlIll)) {
                    Keyboard.type((String)lllllIIllIIllIl, (boolean)lIlIl[0]);
                    Time.sleepTicks((int)k.c(lIlIl[1], lIlIl[2]));
                    0;
                }
                if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII((lllllIIllIIlIIl = Arrays.stream(lllllIIllIIllII).filter(widget -> widget.getText().contains(lllllIIllIIllIl)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)((Widget)lllllIIllIIlIIl.get(lIlIl[0])).getClickPoint().getX(), (int)((Widget)lllllIIllIIlIIl.get(lIlIl[0])).getClickPoint().getY(), (boolean)lIlIl[1]);
                    Time.sleepTicks((int)k.c(lIlIl[8], lIlIl[4]));
                    0;
                    Time.sleepTicks((int)lIlIl[8]);
                    0;
                }
                0;
            }
            catch (Exception lllllIIllIIlIIl) {
                System.out.println(lllllIIllIIlIIl.getMessage());
                System.out.println(lllllIIllIIlIIl.getCause());
                lllllIIllIIlIIl.printStackTrace();
            }
            if (1 == 0) {
                return;
            }
        }
    }

    private static boolean llIIllI(Object object) {
        return object == null;
    }

    public static void o() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[20]).interact(lIIll[lIlIl[32]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[33]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static String lIlllll(String lllllIIlIlIllII, String lllllIIlIllIIII) {
        lllllIIlIlIllII = new String(Base64.getDecoder().decode(lllllIIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIlIlIllll = new StringBuilder();
        char[] lllllIIlIlIlllI = lllllIIlIllIIII.toCharArray();
        int lllllIIlIlIllIl = lIlIl[0];
        char[] lllllIIlIlIIlll = lllllIIlIlIllII.toCharArray();
        int lllllIIlIlIIllI = lllllIIlIlIIlll.length;
        int lllllIIlIlIIlIl = lIlIl[0];
        while (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIIll(lllllIIlIlIIlIl, lllllIIlIlIIllI)) {
            char lllllIIlIllIIlI = lllllIIlIlIIlll[lllllIIlIlIIlIl];
            lllllIIlIlIllll.append((char)(lllllIIlIllIIlI ^ lllllIIlIlIlllI[lllllIIlIlIllIl % lllllIIlIlIlllI.length]));
            0;
            ++lllllIIlIlIllIl;
            ++lllllIIlIlIIlIl;
            0;
            if (((205 + 69 - 110 + 55 ^ 34 + 7 - -95 + 15) & (0x66 ^ 0x14 ^ (0x46 ^ 0x78) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(lllllIIlIlIllll);
    }

    public static void m() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[21]).interact(lIIll[lIlIl[28]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[29]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void b() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[11]).interact(lIIll[lIlIl[2]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[7]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void e() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[8]).interact(lIIll[lIlIl[15]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[16]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void j() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[24]).interact(lIIll[lIlIl[24]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[19]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void k() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[16]).interact(lIIll[lIlIl[10]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[25]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void h() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[14]).interact(lIIll[lIlIl[21]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[11]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static void llIIIlI() {
        lIlIl = new int[35];
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[0] = (0xE9 ^ 0xC3) & ~(0xE8 ^ 0xC2);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[1] = 1;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[2] = 2;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[3] = (0xC ^ 0x1D) + (0xF1 ^ 0x94) - (0x16 ^ 0x10) + (70 + 44 - 70 + 83);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[4] = 146 + 71 - 208 + 170 ^ 60 + 106 - 150 + 165;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[5] = 2 + (0x14 ^ 0x3E) - -(0x2E ^ 0x61) + (0x7B ^ 0x5C);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[6] = 0x61 ^ 0x4D ^ (0x9A ^ 0x93);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[7] = 3;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[8] = 0x8C ^ 0x89;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[9] = 165 + 38 - 123 + 88 + (0xDB ^ 0x85) - (165 + 23 - -26 + 24) + (78 + 0 - 75 + 189);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[10] = 0x94 ^ 0x80;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[11] = 0xFD ^ 0xAB ^ (0x44 ^ 0x1D);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[12] = 0x3F ^ 0x1A ^ (0x18 ^ 0x39);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[13] = 0x4E ^ 0x7B ^ (0x5B ^ 0x62);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[14] = 0x88 ^ 0x8F;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[15] = 0xAC ^ 0xA2 ^ (0x7C ^ 0x7A);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[16] = 0xBF ^ 0xB6;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[17] = 0x4F ^ 0x45;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[18] = 0x7F ^ 0x33 ^ (0xC ^ 0x4B);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[19] = 0x78 ^ 0x3A ^ (0xC4 ^ 0x95);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[20] = 0x81 ^ 0x95 ^ (0x1E ^ 7);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[21] = 0x74 ^ 0x5B ^ (0x61 ^ 0x40);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[22] = (0x72 ^ 0x40) & ~(0x72 ^ 0x40) ^ (0x84 ^ 0x94);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[23] = 0x45 ^ 0x54;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[24] = 0xF2 ^ 0xC2 ^ (0xBF ^ 0x9D);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[25] = 0xD5 ^ 0xC0;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[26] = 0x28 ^ 0x3E;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[27] = 23 + 96 - 16 + 37 ^ 3 + 15 - -96 + 41;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[28] = 0xA3 ^ 0xBB;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[29] = 135 + 139 - 139 + 18 ^ 125 + 38 - 109 + 74;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[30] = 0x1C ^ 0xD ^ (0xA7 ^ 0xAC);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[31] = 0x9D ^ 0xA0 ^ (0x95 ^ 0xB3);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[32] = 0xC2 ^ 0x92 ^ (0x8F ^ 0xC3);
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[33] = 0x88 ^ 0x95;
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[34] = 0x85 ^ 0x9B;
    }

    public static void c() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[12]).interact(lIIll[lIlIl[12]]);
            Time.sleepTicks((int)lIlIl[2]);
            0;
            n.a(lIIll[lIlIl[8]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }
}

