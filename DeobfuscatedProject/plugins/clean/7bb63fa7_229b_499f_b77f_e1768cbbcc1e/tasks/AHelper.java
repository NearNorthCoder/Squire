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
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.NHelper;
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

public class AHelper {

    static  String[] a;

    public static void i() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[4]).interact(lIIll[lIlIl[22]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[23]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static boolean llIIlll(Object object) {
        return object != null;
    }

    public static void f() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[2]).interact(lIIll[lIlIl[17]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[18]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void g() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[19]).interact(lIIll[lIlIl[13]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[20]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void n() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[17]).interact(lIIll[lIlIl[30]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[31]], a);
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

            n.AHelper(lIIll[lIlIl[14]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static boolean llIIlIl(int n2) {
        return n2 != 0;
    }

    public static void AHelper() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[10]).interact(lIIll[lIlIl[0]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[1]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    private static void llIIIIl() {
        lIIll = new String[lIlIl[34]];
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[1]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[2]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[7]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[12]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[8]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[4]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[14]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[15]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[16]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[17]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[18]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[13]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[20]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[21]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[11]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[22]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[23]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[24]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[19]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[10]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[25]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[26]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[27]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[28]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[29]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[30]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[31]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[32]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Perform";
        c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIIll[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.lIlIl[33]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-."Uri";
    }

    public static void l() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[18]).interact(lIIll[lIlIl[26]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[27]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static boolean AHelper(int[] nArray) {
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

            return ((89 + 137 - 145 + 129 ^ 55 + 67 - 9 + 33) & (0xB6 ^ 0x9F ^ (0x5F ^ 0x36) ^ -1)) != 0;
        }
        return lIlIl[1];
    }

    public static void AHelper(String string) {
        Clues.c = "Selecting music: " + string;
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
            Tabs.open((Tab)Tab.MUSIC);
            Time.sleepTicks((int)lIlIl[2]);

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

            }
            try {
                List lllllIIllIIlIIl;
                if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlll(lllllIIllIIlIll)) {
                    Keyboard.type((String)lllllIIllIIllIl, (boolean)lIlIl[0]);
                    Time.sleepTicks((int)k.c(lIlIl[1], lIlIl[2]));

                }
                if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII((lllllIIllIIlIIl = Arrays.stream(lllllIIllIIllII).filter(widget -> widget.getText().contains(lllllIIllIIllIl)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)((Widget)lllllIIllIIlIIl.get(lIlIl[0])).getClickPoint().getX(), (int)((Widget)lllllIIllIIlIIl.get(lIlIl[0])).getClickPoint().getY(), (boolean)lIlIl[1]);
                    Time.sleepTicks((int)k.c(lIlIl[8], lIlIl[4]));

                    Time.sleepTicks((int)lIlIl[8]);

                }

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

            n.AHelper(lIIll[lIlIl[33]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

        return String.valueOf(lllllIIlIlIllll);
    }

    public static void m() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[21]).interact(lIIll[lIlIl[28]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[29]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void b() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[11]).interact(lIIll[lIlIl[2]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[7]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void e() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[8]).interact(lIIll[lIlIl[15]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[16]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void j() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[24]).interact(lIIll[lIlIl[24]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[19]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void k() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[16]).interact(lIIll[lIlIl[10]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[25]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void h() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[14]).interact(lIIll[lIlIl[21]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[11]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }

    public static void c() {
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlII(Dialog.isOpen() ? 1 : 0)) {
            Widgets.get((int)lIlIl[9], (int)lIlIl[2]).getChild(lIlIl[12]).interact(lIIll[lIlIl[12]]);
            Time.sleepTicks((int)lIlIl[2]);

            n.AHelper(lIIll[lIlIl[8]], a);
        }
        if (c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a.llIIlIl(Dialog.isOpen() ? 1 : 0)) {
            n.c(a);
        }
    }
}

