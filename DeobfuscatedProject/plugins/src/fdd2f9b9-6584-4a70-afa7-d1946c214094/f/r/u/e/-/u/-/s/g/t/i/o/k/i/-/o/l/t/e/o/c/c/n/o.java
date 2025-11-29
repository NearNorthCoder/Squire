/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class o
implements G {
    static /* synthetic */ WorldPoint I;
    static /* synthetic */ WorldPoint cc;
    private static /* synthetic */ String[] lIIIlIIIII;
    public static /* synthetic */ boolean bY;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean ca;
    public static /* synthetic */ boolean cb;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIIlIIIIl;
    static /* synthetic */ WorldArea cd;
    public static /* synthetic */ boolean bZ;
    public static /* synthetic */ boolean bX;

    private static boolean lllIIllllllI(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            o.ay();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("  ".length() >= "   ".length()) {
            return (191 + 209 - 391 + 209 ^ 27 + 30 - 56 + 139) & (41 + 21 - 44 + 189 ^ 44 + 29 - -43 + 37 ^ -" ".length());
        }
        return lIIIlIIIIl[183];
    }

    @Override
    public boolean V() {
        int n2;
        if (o.lllIIllllIIl(cb ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bX ? 1 : 0)) {
            n2 = lIIIlIIIIl[0];
            "".length();
            if (" ".length() < 0) {
                return ((65 + 74 - 29 + 26 ^ 64 + 59 - 74 + 96) & (0xA1 ^ 0x9E ^ (0x55 ^ 0x73) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIIlIIIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIlllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllIll(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean az() {
        int n2;
        int[] nArray = new int[lIIIlIIIIl[0]];
        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
        if (o.lllIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlIIIIl[0]];
            nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (o.lllIIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIlIIIIl[0]];
                nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                if (o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlIIIIl[0]];
                    nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                        if (o.lllIIllllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            n2 = lIIIlIIIIl[0];
                            "".length();
                            if (-" ".length() < (0x23 ^ 0x27)) return n2 != 0;
                            return ((0xF0 ^ 0xA3) & ~(0x28 ^ 0x7B)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIIIlIIIIl[1];
        return n2 != 0;
    }

    private static boolean lllIIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIlllIIlI(String llIIIIIlIllI, String llIIIIIlIIll) {
        try {
            SecretKeySpec llIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIllIII = Cipher.getInstance("Blowfish");
            llIIIIIllIII.init(lIIIlIIIIl[4], llIIIIIllIIl);
            return new String(llIIIIIllIII.doFinal(Base64.getDecoder().decode(llIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIlIlll) {
            llIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lllIIlllIIll() {
        lIIIlIIIII = new String[lIIIlIIIIl[194]];
        o.lIIIlIIIII[o.lIIIlIIIIl[1]] = o.lllIIlllIIII("Kh8YMBYEExJ5BxkPHzcCTB8CPAgfWlYqEgUCFTEMAhFWOwQPHVYtCkwHAzwWGA==", "lvvYe");
        o.lIIIlIIIII[o.lIIIlIIIIl[0]] = o.lllIIlllIIII("FhAhETg9Nx9DCCI2Ygc+bS0tF3EgJicXcTkrJ0MjKDI3CiMoLicNJT5jJAwjbTEtBCQoMGIHNCM=", "MCBcQ");
        o.lIIIlIIIII[o.lIIIlIIIIl[4]] = o.lllIIlllIIIl("3zCuDrV29U2DaJoMi+gIBA==", "WqJkZ");
        o.lIIIlIIIII[o.lIIIlIIIIl[6]] = o.lllIIlllIIIl("YTUmTPicoJFqYzKpbj8Dld0CmGfpHume", "eHNaz");
        o.lIIIlIIIII[o.lIIIlIIIIl[7]] = o.lllIIlllIIIl("0j6+YWvjOsE2tNpn9NHK8w6L4/olyJR3uF6ghysr2DVKkHNKguVVOZinrgf7JUnAiE2ff5ywPaE=", "RiCaZ");
        o.lIIIlIIIII[o.lIIIlIIIIl[12]] = o.lllIIlllIIII("JwpoECEVTyUYIAMGJhZzARotAidQHD0BIxwGLQJ/UBw/GCcTByEfNFAbJ1ERJTYBPxQ=", "poHqS");
        o.lIIIlIIIII[o.lIIIlIIIIl[14]] = o.lllIIlllIIIl("+q158A9C8I4b5I749kk6nQ==", "FGTHe");
        o.lIIIlIIIII[o.lIIIlIIIIl[16]] = o.lllIIlllIIII("LwI/bjcHHQ==", "hmKNC");
        o.lIIIlIIIII[o.lIIIlIIIIl[18]] = o.lllIIlllIIII("IRcHUgADHwA=", "fxsrl");
        o.lIIIlIIIII[o.lIIIlIIIIl[20]] = o.lllIIlllIIlI("6dRoi1Ec0tBRuLyJXPgmyw==", "lWdvz");
        o.lIIIlIIIII[o.lIIIlIIIIl[22]] = o.lllIIlllIIlI("iHtllhTSnndJWcyPYnRpHg==", "sfBMw");
        o.lIIIlIIIII[o.lIIIlIIIIl[27]] = o.lllIIlllIIlI("7waUApvDWjI=", "pCLwp");
        o.lIIIlIIIII[o.lIIIlIIIIl[28]] = o.lllIIlllIIlI("RxAoXsMSDec=", "OBxdl");
        o.lIIIlIIIII[o.lIIIlIIIIl[29]] = o.lllIIlllIIII("LxEPIhM=", "kcfLx");
        o.lIIIlIIIII[o.lIIIlIIIIl[30]] = o.lllIIlllIIII("CRMiSDooUjkBIC4VNQUrZxc6HDwmHDcN", "GrThN");
        o.lIIIlIIIII[o.lIIIlIIIIl[31]] = o.lllIIlllIIII("IhojMQ8HDA==", "fuLCx");
        o.lIIIlIIIII[o.lIIIlIIIIl[32]] = o.lllIIlllIIII("FQMqPA==", "ZsORI");
        o.lIIIlIIIII[o.lIIIlIIIIl[33]] = o.lllIIlllIIII("OAc6BzxaOnQ0OxkdMhQ2", "zuSfR");
        o.lIIIlIIIII[o.lIIIlIIIIl[34]] = o.lllIIlllIIIl("whNyIDHl20e7yIZUdH5kRg==", "aESGn");
        o.lIIIlIIIII[o.lIIIlIIIIl[37]] = o.lllIIlllIIIl("OS/va7qwLxFt+Hgo9OzCfQ==", "LYuPP");
        o.lIIIlIIIII[o.lIIIlIIIIl[38]] = o.lllIIlllIIlI("1pqdqDpoVw/g2Mm5XW/bbg==", "BfGQd");
        o.lIIIlIIIII[o.lIIIlIIIIl[39]] = o.lllIIlllIIII("MB0MMSA=", "usxTR");
        o.lIIIlIIIII[o.lIIIlIIIIl[45]] = o.lllIIlllIIII("HwA+JmEBHSE5NBIdcyU2HBs0MzM=", "uuSVA");
        o.lIIIlIIIII[o.lIIIlIIIIl[46]] = o.lllIIlllIIIl("t8KGordAuVAbA0ZXYEPxLWXQprRGY5lO", "vKlEo");
        o.lIIIlIIIII[o.lIIIlIIIIl[49]] = o.lllIIlllIIlI("nuUVT/PCpMzaouANmCfVfg==", "Djgbv");
        o.lIIIlIIIII[o.lIIIlIIIIl[25]] = o.lllIIlllIIIl("c8MQtCYFhGU=", "ySIwu");
        o.lIIIlIIIII[o.lIIIlIIIIl[50]] = o.lllIIlllIIlI("ASY5/3qDVG4=", "BsEEg");
        o.lIIIlIIIII[o.lIIIlIIIIl[56]] = o.lllIIlllIIIl("kQffuutgG5s=", "FZCjC");
        o.lIIIlIIIII[o.lIIIlIIIIl[57]] = o.lllIIlllIIlI("BP+owUbasUA=", "hLCEm");
        o.lIIIlIIIII[o.lIIIlIIIIl[65]] = o.lllIIlllIIIl("A7ryggZwrHA=", "EONMI");
        o.lIIIlIIIII[o.lIIIlIIIIl[23]] = o.lllIIlllIIIl("Pyd0yNYZrAA=", "XsLtI");
        o.lIIIlIIIII[o.lIIIlIIIIl[74]] = o.lllIIlllIIII("OQYcFQIOAhgHGg==", "igofc");
        o.lIIIlIIIII[o.lIIIlIIIIl[75]] = o.lllIIlllIIIl("y3xnzPpi2LA=", "FuEjJ");
        o.lIIIlIIIII[o.lIIIlIIIIl[81]] = o.lllIIlllIIlI("zLNlv6rSMPQwAzg+47/2rg==", "ONZvY");
        o.lIIIlIIIII[o.lIIIlIIIIl[82]] = o.lllIIlllIIlI("+By5Y1PKyiE=", "URFHN");
        o.lIIIlIIIII[o.lIIIlIIIIl[86]] = o.lllIIlllIIlI("LBDO3GsY4Jf0hf3C/vDtPA==", "zFbEi");
        o.lIIIlIIIII[o.lIIIlIIIIl[87]] = o.lllIIlllIIlI("56LN/LuTboU=", "YgviD");
        o.lIIIlIIIII[o.lIIIlIIIIl[89]] = o.lllIIlllIIlI("gat7P0raqNI=", "cFaRx");
        o.lIIIlIIIII[o.lIIIlIIIIl[90]] = o.lllIIlllIIII("KxoTAQ==", "djvoO");
        o.lIIIlIIIII[o.lIIIlIIIIl[94]] = o.lllIIlllIIII("AC00FyY=", "LHPpC");
        o.lIIIlIIIII[o.lIIIlIIIIl[95]] = o.lllIIlllIIII("AD0jHwU=", "CQJrg");
        o.lIIIlIIIII[o.lIIIlIIIIl[98]] = o.lllIIlllIIIl("w8S91lD2f7c=", "bwHbM");
        o.lIIIlIIIII[o.lIIIlIIIIl[99]] = o.lllIIlllIIIl("wnwHjPziDKs=", "muMnj");
        o.lIIIlIIIII[o.lIIIlIIIIl[105]] = o.lllIIlllIIIl("If2uUc+Wtv0=", "KXnSK");
        o.lIIIlIIIII[o.lIIIlIIIIl[107]] = o.lllIIlllIIII("PgM9Bg==", "zlRtR");
        o.lIIIlIIIII[o.lIIIlIIIIl[108]] = o.lllIIlllIIII("BwU8Bw==", "HuYiP");
        o.lIIIlIIIII[o.lIIIlIIIIl[109]] = o.lllIIlllIIlI("Wan3dd9OaL0=", "XqHul");
        o.lIIIlIIIII[o.lIIIlIIIIl[128]] = o.lllIIlllIIlI("LLY1AECLnk4=", "vyIGb");
        o.lIIIlIIIII[o.lIIIlIIIIl[129]] = o.lllIIlllIIIl("NhexmsrguMQ=", "bpktU");
        o.lIIIlIIIII[o.lIIIlIIIIl[130]] = o.lllIIlllIIlI("dbN6sHUDnO4=", "HEEDK");
        o.lIIIlIIIII[o.lIIIlIIIIl[2]] = o.lllIIlllIIIl("ci3aa3z7LO8=", "JnxAr");
        o.lIIIlIIIII[o.lIIIlIIIIl[131]] = o.lllIIlllIIlI("PipZqqfL+ZE=", "lAjjL");
        o.lIIIlIIIII[o.lIIIlIIIIl[132]] = o.lllIIlllIIlI("5Hpn8N+Z1sQ=", "vofra");
        o.lIIIlIIIII[o.lIIIlIIIIl[138]] = o.lllIIlllIIII("DxU7GAA=", "HgRtl");
        o.lIIIlIIIII[o.lIIIlIIIIl[139]] = o.lllIIlllIIII("Gio2Bg==", "UZShH");
        o.lIIIlIIIII[o.lIIIlIIIIl[140]] = o.lllIIlllIIII("EQgkFBs=", "VzMxw");
        o.lIIIlIIIII[o.lIIIlIIIIl[141]] = o.lllIIlllIIlI("HfVCM9WGIGI=", "WVNkD");
        o.lIIIlIIIII[o.lIIIlIIIIl[151]] = o.lllIIlllIIII("HAgjIh96FC0mEz8W", "ZdBQw");
        o.lIIIlIIIII[o.lIIIlIIIIl[152]] = o.lllIIlllIIlI("SJMlAuiFNoQ=", "zEowS");
        o.lIIIlIIIII[o.lIIIlIIIIl[154]] = o.lllIIlllIIIl("z0Na47mg9obrCPRjwsr0oQ==", "nHBuu");
        o.lIIIlIIIII[o.lIIIlIIIIl[155]] = o.lllIIlllIIII("LDQjJw9KKC0jAw8q", "jXBTg");
        o.lIIIlIIIII[o.lIIIlIIIIl[156]] = o.lllIIlllIIIl("qOWnLRt+B1TNDMBQNCdyKQ==", "hhnMk");
        o.lIIIlIIIII[o.lIIIlIIIIl[158]] = o.lllIIlllIIII("PB0FOhFaAQs+HR8D", "zqdIy");
        o.lIIIlIIIII[o.lIIIlIIIIl[161]] = o.lllIIlllIIII("HRU6HUY5FTAU", "JtVqf");
        o.lIIIlIIIII[o.lIIIlIIIIl[162]] = o.lllIIlllIIlI("oKi7sEKTzW4=", "xCZJz");
        o.lIIIlIIIII[o.lIIIlIIIIl[163]] = o.lllIIlllIIII("KSkSGwYS", "zLsie");
        o.lIIIlIIIII[o.lIIIlIIIIl[164]] = o.lllIIlllIIIl("lxFf2AxZ8u7H/b8SXiB7Gdc/tO/Pygp76ivmzUQhlL0=", "KJPqq");
        o.lIIIlIIIII[o.lIIIlIIIIl[165]] = o.lllIIlllIIlI("qk88vFZEZV0=", "Hsfnp");
        o.lIIIlIIIII[o.lIIIlIIIIl[166]] = o.lllIIlllIIlI("5Lr/7wscFadfAii8NmxBw2VCOkpDNOoEab/ZYpZPAPI=", "SVtCQ");
        o.lIIIlIIIII[o.lIIIlIIIIl[167]] = o.lllIIlllIIIl("W1JODSKcc0k=", "vkTgn");
        o.lIIIlIIIII[o.lIIIlIIIIl[168]] = o.lllIIlllIIlI("WWe4hETT/2A7utmtu7W0fCY6h3OibfNQWC/3XAsZ7Dg=", "kguig");
        o.lIIIlIIIII[o.lIIIlIIIIl[169]] = o.lllIIlllIIIl("ZFB4Q21WwjGXYY0Nqe4t0g==", "MsKLw");
        o.lIIIlIIIII[o.lIIIlIIIIl[170]] = o.lllIIlllIIlI("dp6q0UdwIB5oUolMgIqG3wXDtdhwkHR8bYUui0l6Ikg=", "WNmHd");
        o.lIIIlIIIII[o.lIIIlIIIIl[171]] = o.lllIIlllIIlI("mRt8wQxAi0g=", "pmfQF");
        o.lIIIlIIIII[o.lIIIlIIIIl[172]] = o.lllIIlllIIlI("cvDWThDunB3vHe6VlX2THiYUhjEUjYJDefY0aGlApP4=", "pWaXQ");
        o.lIIIlIIIII[o.lIIIlIIIIl[173]] = o.lllIIlllIIIl("V9QqModm5Oo=", "nXqXK");
        o.lIIIlIIIII[o.lIIIlIIIIl[174]] = o.lllIIlllIIlI("F8wzhcOL/e4uCSkg/4tJ8A==", "vIwJZ");
        o.lIIIlIIIII[o.lIIIlIIIIl[175]] = o.lllIIlllIIIl("TkoIT+SzLJs=", "aixxR");
        o.lIIIlIIIII[o.lIIIlIIIIl[176]] = o.lllIIlllIIlI("oUt6NyPYX3c6ND7/iIoK5w==", "eggyJ");
        o.lIIIlIIIII[o.lIIIlIIIIl[177]] = o.lllIIlllIIII("FQY6axUdBjo4", "riNKw");
        o.lIIIlIIIII[o.lIIIlIIIIl[26]] = o.lllIIlllIIIl("dPW+9c5C7JNXe6rFduswLQ==", "GRjPW");
        o.lIIIlIIIII[o.lIIIlIIIIl[184]] = o.lllIIlllIIlI("mC9DcxZO2xI+J8t/7uBNJw==", "YHrlC");
        o.lIIIlIIIII[o.lIIIlIIIIl[185]] = o.lllIIlllIIlI("PNFg7cMbEZZLMz9dwSBQnd5AnJoDQhYm", "nsioF");
        o.lIIIlIIIII[o.lIIIlIIIIl[191]] = o.lllIIlllIIII("EBIyVw==", "IwAyj");
        o.lIIIlIIIII[o.lIIIlIIIIl[192]] = o.lllIIlllIIII("HAIJZSQmEw8kKSkeVmUyLQYOYjMgRwMqMGUAFTF6", "EgzEE");
        o.lIIIlIIIII[o.lIIIlIIIIl[193]] = o.lllIIlllIIIl("Th+8KRWFYWiHAuEozGZqkf2tDaj7w34w", "lfFVF");
    }

    private static void af() {
        block12: {
            d llIIIIlIIIII;
            block11: {
                block10: {
                    block9: {
                        Object llIIIIlIIIIl;
                        int[] nArray = new int[lIIIlIIIIl[0]];
                        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[10];
                        if (o.lllIIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIIIlIIIIl[10], lIIIlIIIIl[12], lIIIlIIIIl[178]);
                            bv.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[lIIIlIIIIl[0]];
                        nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[11];
                        if (o.lllIIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llIIIIlIIIIl = new d(lIIIlIIIIl[11], lIIIlIIIIl[25], lIIIlIIIIl[179]);
                            bv.add((d)llIIIIlIIIIl);
                            "".length();
                        }
                        if (o.lllIIllllIll(Bank.contains(llIIIIlIIIIl = item -> item.getName().toLowerCase().contains(lIIIlIIIII[lIIIlIIIIl[185]])) ? 1 : 0)) {
                            llIIIIlIIIII = new d(lIIIlIIIIl[180], lIIIlIIIIl[12], lIIIlIIIIl[181]);
                            bv.add(llIIIIlIIIII);
                            "".length();
                        }
                        int[] nArray3 = new int[lIIIlIIIIl[0]];
                        nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIIIlIIIIl[0]];
                        nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIIIl[4])) break block10;
                    }
                    llIIIIlIIIII = new d(lIIIlIIIIl[8], lIIIlIIIIl[38], i.bq);
                    bv.add(llIIIIlIIIII);
                    "".length();
                }
                int[] nArray = new int[lIIIlIIIIl[0]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIIIlIIIIl[0]];
                nArray6[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                int[] nArray7 = new int[lIIIlIIIIl[0]];
                nArray7[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlIIIIl[31])) break block12;
            }
            llIIIIlIIIII = new d(lIIIlIIIIl[9], lIIIlIIIIl[95], lIIIlIIIIl[182]);
            bv.add(llIIIIlIIIII);
            "".length();
        }
    }

    @Override
    public String U() {
        return lIIIlIIIII[lIIIlIIIIl[184]];
    }

    private static boolean ab() {
        int n2;
        if (o.lllIlIIIIIIl(Vars.getBit((int)lIIIlIIIIl[25]), lIIIlIIIIl[0]) && o.lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) && o.lllIIllllIIl(Inventory.isEmpty() ? 1 : 0)) {
            n2 = lIIIlIIIIl[0];
            "".length();
            if (" ".length() <= 0) {
                return ((9 ^ 0x38) & ~(0x38 ^ 9)) != 0;
            }
        } else {
            n2 = lIIIlIIIIl[1];
        }
        return n2 != 0;
    }

    private static void lllIIllllIII() {
        lIIIlIIIIl = new int[195];
        o.lIIIlIIIIl[0] = " ".length();
        o.lIIIlIIIIl[1] = (35 + 19 - -104 + 87 ^ 175 + 145 - 302 + 176) & (164 + 152 - 282 + 132 ^ 126 + 20 - 116 + 115 ^ -" ".length());
        o.lIIIlIIIIl[2] = 0x57 ^ 0x29 ^ (0x8A ^ 0xC6);
        o.lIIIlIIIIl[3] = -(0xFFFFA4D7 & 0x7F6D) & (0xFFFFF77F & Short.MAX_VALUE);
        o.lIIIlIIIIl[4] = "  ".length();
        o.lIIIlIIIIl[5] = -(0xFFFFFCB7 & 0x4B7D) & (0xFFFFDFBE & 0x7BFD);
        o.lIIIlIIIIl[6] = "   ".length();
        o.lIIIlIIIIl[7] = 0x45 ^ 0x41;
        o.lIIIlIIIIl[8] = -(0xFFFFCEEF & 0x7F9B) & (0xFFFFFFFB & 0x7FDF);
        o.lIIIlIIIIl[9] = 0xFFFFBF4F & 0x5FF7;
        o.lIIIlIIIIl[10] = 0xFFFFCF2D & 0x3FDF;
        o.lIIIlIIIIl[11] = 0xFFFF8FCC & 0x7BFB;
        o.lIIIlIIIIl[12] = 0x49 ^ 0x4C;
        o.lIIIlIIIIl[13] = 0xFFFFF7BB & 0x1DF6;
        o.lIIIlIIIIl[14] = 0x76 ^ 0x70;
        o.lIIIlIIIIl[15] = 0xFFFFD7B1 & 0x3DFF;
        o.lIIIlIIIIl[16] = 16 + 75 - -97 + 6 ^ 76 + 153 - 195 + 163;
        o.lIIIlIIIIl[17] = 0xFFFFF5BF & 0x1FF3;
        o.lIIIlIIIIl[18] = 0x8F ^ 0x87;
        o.lIIIlIIIIl[19] = -(0xFFFFE099 & 0x7F6F) & (0xFFFFFDFF & 0x77BD);
        o.lIIIlIIIIl[20] = 0x21 ^ 0x4D ^ (0x2F ^ 0x4A);
        o.lIIIlIIIIl[21] = -(0xFFFFBEFE & 0x4B4D) & (0xFFFFDFFF & 0x3FFF);
        o.lIIIlIIIIl[22] = 127 + 58 - 52 + 18 ^ 88 + 46 - 28 + 51;
        o.lIIIlIIIIl[23] = 0x1C ^ 2;
        o.lIIIlIIIIl[24] = 0x2F ^ 0x75;
        o.lIIIlIIIIl[25] = 0xB7 ^ 0xAE;
        o.lIIIlIIIIl[26] = 0x51 ^ 1;
        o.lIIIlIIIIl[27] = 9 ^ 2;
        o.lIIIlIIIIl[28] = 0x15 ^ 0x31 ^ (0x95 ^ 0xBD);
        o.lIIIlIIIIl[29] = 0x1D ^ 0x4E ^ (0x22 ^ 0x7C);
        o.lIIIlIIIIl[30] = 0x39 ^ 0x79 ^ (0x75 ^ 0x3B);
        o.lIIIlIIIIl[31] = (0x9B ^ 0xB2) & ~(0x12 ^ 0x3B) ^ (1 ^ 0xE);
        o.lIIIlIIIIl[32] = 0x6E ^ 0x7E;
        o.lIIIlIIIIl[33] = 86 + 95 - 142 + 96 ^ 27 + 27 - -96 + 0;
        o.lIIIlIIIIl[34] = 57 + 73 - 11 + 20 ^ 139 + 7 - 38 + 45;
        o.lIIIlIIIIl[35] = -(0xFFFFF03D & 0x5FCE) & (0xFFFFFFFB & 0x5BFF);
        o.lIIIlIIIIl[36] = 0xFFFFF384 & 0x1FFB;
        o.lIIIlIIIIl[37] = 0x6E ^ 0x7D;
        o.lIIIlIIIIl[38] = 0xAC ^ 0xBA ^ "  ".length();
        o.lIIIlIIIIl[39] = 0x4A ^ 0xC ^ (0xD4 ^ 0x87);
        o.lIIIlIIIIl[40] = -(0xFFFFAFD3 & 0x703F) & (0xFFFFEBFB & 0x3FFE);
        o.lIIIlIIIIl[41] = 0xFFFF9FFF & 0x7385;
        o.lIIIlIIIIl[42] = -" ".length() & (0xFFFFABFF & 0x5FDF);
        o.lIIIlIIIIl[43] = 0xFFFFD397 & 0x3FEF;
        o.lIIIlIIIIl[44] = -(0xFFFFF53B & 0x4EDD) & (0xFFFFDFFA & 0x6FFF);
        o.lIIIlIIIIl[45] = 0xB2 ^ 0xA4;
        o.lIIIlIIIIl[46] = 0x27 ^ 0x30;
        o.lIIIlIIIIl[47] = -(0x6D ^ 0x4C) & (0xFFFFDFF7 & 0x2BFD);
        o.lIIIlIIIIl[48] = 0xFFFF97AF & 0x7BDB;
        o.lIIIlIIIIl[49] = 0xDD ^ 0x9F ^ (0x4A ^ 0x10);
        o.lIIIlIIIIl[50] = 0xBD ^ 0xA7;
        o.lIIIlIIIIl[51] = -(0xFFFFDEEB & 0x3135) & (0xFFFFDBFF & 0x3FEF);
        o.lIIIlIIIIl[52] = -(0xFFFFEE11 & 0x7DFF) & (0xFFFFFF99 & Short.MAX_VALUE);
        o.lIIIlIIIIl[53] = 0xFFFF9FEB & 0x6BD7;
        o.lIIIlIIIIl[54] = -(0xFFFFDF7F & 0x6CF1) & (0xFFFFFFFD & 0x5FFF);
        o.lIIIlIIIIl[55] = 0xFFFFDFBD & 0x2BFE;
        o.lIIIlIIIIl[56] = 152 + 70 - 142 + 96 ^ 123 + 72 - 31 + 7;
        o.lIIIlIIIIl[57] = 0xAD ^ 0xB1;
        o.lIIIlIIIIl[58] = -(0xFFFFC452 & 0x7FBF) & (0xFFFFFFFD & 0x4FBF);
        o.lIIIlIIIIl[59] = 0xFFFF9B8D & 0x77FE;
        o.lIIIlIIIIl[60] = 0xFFFFBFB9 & 0x4BDF;
        o.lIIIlIIIIl[61] = -(0xFFFFBF67 & 0x48FB) & (0xFFFFBFFF & 0x5BFB);
        o.lIIIlIIIIl[62] = -(0xFFFFE9BD & 0x7673) & (0xFFFFFBBF & 0x6FF9);
        o.lIIIlIIIIl[63] = -(0xFFFFDDEB & 0x2675) & (0xFFFF97F6 & 0x7FFB);
        o.lIIIlIIIIl[64] = -(0xFFFFE4BF & 0x7F69) & (0xFFFFFFBF & 0x6FFF);
        o.lIIIlIIIIl[65] = 0xAA ^ 0x89 ^ (8 ^ 0x36);
        o.lIIIlIIIIl[66] = -(0xFFFFF0FB & 0x6F36) & (0xFFFFEBBF & Short.MAX_VALUE);
        o.lIIIlIIIIl[67] = -(0xFFFFFF77 & 0x64CD) & (0xFFFFFFEF & 0x77FF);
        o.lIIIlIIIIl[68] = -(0xFFFFC7AB & 0x7C55) & (0xFFFFDF96 & 0x6FFB);
        o.lIIIlIIIIl[69] = -(0xFFFFDE7F & 0x2DC1) & (0xFFFFDFFE & 0x3FFB);
        o.lIIIlIIIIl[70] = -(0xFFFFF025 & 0x6FDB) & (0xFFFFEBB3 & 0x7FDF);
        o.lIIIlIIIIl[71] = 0xFFFF97FA & 0x7BC5;
        o.lIIIlIIIIl[72] = 0xFFFFDBAF & 0x2FDD;
        o.lIIIlIIIIl[73] = 0xFFFF97CB & 0x7BFF;
        o.lIIIlIIIIl[74] = 0xD ^ 0x12;
        o.lIIIlIIIIl[75] = 0x1A ^ 0x3A;
        o.lIIIlIIIIl[76] = -(0xFFFFF6FB & 0x2D57) & (0xFFFFEFFB & 0x3FDE);
        o.lIIIlIIIIl[77] = 0xFFFFFBEF & 0x17DF;
        o.lIIIlIIIIl[78] = 0xFFFFBBBF & 0x4FCB;
        o.lIIIlIIIIl[79] = 0xFFFF97FE & 0x7BE7;
        o.lIIIlIIIIl[80] = -(0xFFFFEE86 & 0x197D) & (0xFFFFFBD7 & 0x1FFB);
        o.lIIIlIIIIl[81] = 95 + 113 - 165 + 135 ^ 90 + 94 - 107 + 70;
        o.lIIIlIIIIl[82] = 0x22 ^ 0x30 ^ (0xA8 ^ 0x98);
        o.lIIIlIIIIl[83] = -(0xFFFFADDD & 0x5E27) & (0xFFFFDFFE & 0x3FEF);
        o.lIIIlIIIIl[84] = 0xFFFFB7FD & 0x5BF3;
        o.lIIIlIIIIl[85] = -(0xFFFFFDF9 & 0x7647) & (0xFFFFFFDF & 0x7FFC);
        o.lIIIlIIIIl[86] = 0x18 ^ 0x2E ^ (0xBD ^ 0xA8);
        o.lIIIlIIIIl[87] = 0x16 ^ 0x5F ^ (0x41 ^ 0x2C);
        o.lIIIlIIIIl[88] = -(0xFFFFBCFF & 0x7723) & (0xFFFFFFBF & 0x3FFF);
        o.lIIIlIIIIl[89] = 0x43 ^ 0x75 ^ (0x7E ^ 0x6D);
        o.lIIIlIIIIl[90] = 37 + 57 - 49 + 133 ^ 99 + 30 - 22 + 41;
        o.lIIIlIIIIl[91] = 0xFFFFDFFF & 0x33E5;
        o.lIIIlIIIIl[92] = 0xFFFFBBF7 & 0x4FAE;
        o.lIIIlIIIIl[93] = 0xFFFFB7DF & 0x5BFF;
        o.lIIIlIIIIl[94] = 0x8A ^ 0xA0 ^ (0x31 ^ 0x3C);
        o.lIIIlIIIIl[95] = 0x60 ^ 0x32 ^ (0x1D ^ 0x67);
        o.lIIIlIIIIl[96] = 0xFFFFEFBF & 0x1BEE;
        o.lIIIlIIIIl[97] = 0xFFFF93DF & 0x7FFE;
        o.lIIIlIIIIl[98] = 0x3A ^ 0x13;
        o.lIIIlIIIIl[99] = 0x12 ^ 1 ^ (0x5B ^ 0x62);
        o.lIIIlIIIIl[100] = -(0xFFFFEF6F & 0x54D3) & (0xFFFFFFFF & 0x4FF7);
        o.lIIIlIIIIl[101] = -(0xFFFFE5F6 & 0x7A1F) & (0xFFFFF3F7 & 0x7FFD);
        o.lIIIlIIIIl[102] = 0xFFFFFBBF & 0xFFE;
        o.lIIIlIIIIl[103] = 0xFFFFAFF5 & 0x5BBB;
        o.lIIIlIIIIl[104] = -(0xFFFFF63D & 0x4BFB) & (0xFFFFF7FD & 0x5FFA);
        o.lIIIlIIIIl[105] = 0x5D ^ 0x76;
        o.lIIIlIIIIl[106] = -(0xFFFFC9AF & 0x7F56) & (0xFFFFEBF5 & 0x5FBF);
        o.lIIIlIIIIl[107] = 107 + 6 - 81 + 101 ^ 149 + 131 - 236 + 125;
        o.lIIIlIIIIl[108] = 152 + 27 - 163 + 164 ^ 31 + 58 - 17 + 81;
        o.lIIIlIIIIl[109] = 0x39 ^ 0x17;
        o.lIIIlIIIIl[110] = 0xFFFFAFFD & 0x5BD2;
        o.lIIIlIIIIl[111] = -(0xFFFFDE79 & 0x65A7) & (0xFFFFDFFF & 0x77FA);
        o.lIIIlIIIIl[112] = -(0xFFFFF559 & 0x4EAF) & (0xFFFFDFDF & 0x6FFF);
        o.lIIIlIIIIl[113] = 0xFFFFF3D7 & 0x1FFF;
        o.lIIIlIIIIl[114] = -(0xFFFFE4AC & 0x1F5B) & (0xFFFFDFDF & 0x2FFF);
        o.lIIIlIIIIl[115] = 0xFFFFF3F7 & 0x1FDE;
        o.lIIIlIIIIl[116] = 0xFFFFFBD5 & 0x17FF;
        o.lIIIlIIIIl[117] = 0xFFFFEFFC & 0x1BDF;
        o.lIIIlIIIIl[118] = 0xFFFFD3DC & 0x3FF7;
        o.lIIIlIIIIl[119] = -(0xFFFFCDD7 & 0x722B) & (0xFFFFDFFF & 0x6BDF);
        o.lIIIlIIIIl[120] = -(0xFFFFF561 & 0x5EBE) & (0xFFFFDFFF & Short.MAX_VALUE);
        o.lIIIlIIIIl[121] = 0xFFFFDBF3 & 0x2FEF;
        o.lIIIlIIIIl[122] = -(0xFFFFF137 & 0x5EC9) & (0xFFFFDBF5 & 0x7FEE);
        o.lIIIlIIIIl[123] = 0xFFFFD7FF & 0x3BCD;
        o.lIIIlIIIIl[124] = -(0xFFFFFD5F & 0x4EB1) & (0xFFFFFFDC & 0x5FFF);
        o.lIIIlIIIIl[125] = -(0xFFFFF51F & 0x2EFB) & (0xFFFFBFFF & 0x6FFB);
        o.lIIIlIIIIl[126] = 0xFFFFBBFE & 0x57CF;
        o.lIIIlIIIIl[127] = -(0xFFFFF523 & 0x7AFE) & (0xFFFFFBFF & Short.MAX_VALUE);
        o.lIIIlIIIIl[128] = 0x9C ^ 0xB3;
        o.lIIIlIIIIl[129] = 0xF ^ 0x2E ^ (0x3C ^ 0x2D);
        o.lIIIlIIIIl[130] = 0xA4 ^ 0x95;
        o.lIIIlIIIIl[131] = 0x73 ^ 0x40;
        o.lIIIlIIIIl[132] = 0x4B ^ 0x78 ^ (0x9E ^ 0x99);
        o.lIIIlIIIIl[133] = -(0xFFFFE41D & 0x5FEB) & (0xFFFFCFFD & 0x7FDE);
        o.lIIIlIIIIl[134] = -(0xFFFFED17 & 0x7EE9) & (0xFFFFFFFB & 0x7FAE);
        o.lIIIlIIIIl[135] = -(0xFFFFEC3D & 0x53E3) & (0xFFFFFFF6 & 0x4BEF);
        o.lIIIlIIIIl[136] = 0xFFFF97B9 & 0x7BEF;
        o.lIIIlIIIIl[137] = -(0xFFFFFC66 & 0x37BF) & (0xFFFFBFF7 & 0x7FEF);
        o.lIIIlIIIIl[138] = 0x82 ^ 0xB7;
        o.lIIIlIIIIl[139] = 0x37 ^ 1;
        o.lIIIlIIIIl[140] = 0x91 ^ 0xC5 ^ (0xA0 ^ 0xC3);
        o.lIIIlIIIIl[141] = 0xFD ^ 0xC5;
        o.lIIIlIIIIl[142] = -(0xFFFFBDBF & 0x766B) & (0xFFFFBFEF & 0x7FFB);
        o.lIIIlIIIIl[143] = -" ".length() & (0xFFFF8BF8 & 0x7FBF);
        o.lIIIlIIIIl[144] = 0xFFFFCBF2 & 0x3FBD;
        o.lIIIlIIIIl[145] = 0xFFFF97BF & 0x7BF5;
        o.lIIIlIIIIl[146] = -(0xFFFFDFCF & 0x2439) & (0xFFFFB7DF & 0x5FFB);
        o.lIIIlIIIIl[147] = -(0xFFFFF611 & 0x1DEF) & (0xFFFFDFFF & 0x3FBF);
        o.lIIIlIIIIl[148] = 0xFFFFB3FB & 0x5FCC;
        o.lIIIlIIIIl[149] = 0xFFFFFBFF & 0x17B7;
        o.lIIIlIIIIl[150] = -(0xFFFFCEA5 & 0x755F) & (0xFFFFEFBF & 0x5FFF);
        o.lIIIlIIIIl[151] = 0x52 ^ 0x6B;
        o.lIIIlIIIIl[152] = 0x6D ^ 0x41 ^ (0x46 ^ 0x50);
        o.lIIIlIIIIl[153] = -(0xFFFFFEE5 & 0x6D3F) & (0xFFFFFFE5 & Short.MAX_VALUE);
        o.lIIIlIIIIl[154] = 0x8F ^ 0xAF ^ (0x5C ^ 0x47);
        o.lIIIlIIIIl[155] = 232 + 162 - 311 + 165 ^ 1 + 87 - 63 + 171;
        o.lIIIlIIIIl[156] = 0x19 ^ 0x24;
        o.lIIIlIIIIl[157] = -(0xFFFFA1BB & 0x7ECD) & (0xFFFFEEFF & 0x3DFF);
        o.lIIIlIIIIl[158] = 0xAC ^ 0x92;
        o.lIIIlIIIIl[159] = 0xFFFFDBBE & 0x37FD;
        o.lIIIlIIIIl[160] = 0xFFFF9BBB & 0x77FC;
        o.lIIIlIIIIl[161] = 0xAB ^ 0x90 ^ (8 ^ 0xC);
        o.lIIIlIIIIl[162] = 23 + 197 - 22 + 6 ^ 14 + 124 - 42 + 44;
        o.lIIIlIIIIl[163] = 0x3A ^ 0x7B;
        o.lIIIlIIIIl[164] = 80 + 121 - 7 + 20 ^ 104 + 18 - 119 + 145;
        o.lIIIlIIIIl[165] = " ".length() ^ (0x86 ^ 0xC4);
        o.lIIIlIIIIl[166] = 0xC9 ^ 0xAC ^ (0x69 ^ 0x48);
        o.lIIIlIIIIl[167] = 0x78 ^ 0x3D;
        o.lIIIlIIIIl[168] = 18 + 113 - 42 + 147 ^ 71 + 3 - -68 + 28;
        o.lIIIlIIIIl[169] = 219 + 163 - 316 + 169 ^ 16 + 130 - 67 + 93;
        o.lIIIlIIIIl[170] = 0x62 ^ 1 ^ (0x19 ^ 0x32);
        o.lIIIlIIIIl[171] = 104 + 175 - 239 + 213 ^ 71 + 28 - 92 + 173;
        o.lIIIlIIIIl[172] = 0x5D ^ 0x17;
        o.lIIIlIIIIl[173] = 0xE0 ^ 0xAB;
        o.lIIIlIIIIl[174] = 157 + 32 - 49 + 57 ^ 120 + 80 - 128 + 65;
        o.lIIIlIIIIl[175] = 0xD3 ^ 0x9E;
        o.lIIIlIIIIl[176] = 0xFB ^ 0xBB ^ (0x8C ^ 0x82);
        o.lIIIlIIIIl[177] = 0x37 ^ 0x78;
        o.lIIIlIIIIl[178] = -(0xFFFFF4BF & 0x1B6F) & (0xFFFFFFFF & 0x17FE);
        o.lIIIlIIIIl[179] = -(78 + 2 - 21 + 70) & (0xFFFFB9E7 & 0x5FFC);
        o.lIIIlIIIIl[180] = -(0xFFFFDFAB & 0x3076) & (0xFFFFBFFD & 0x7EEF);
        o.lIIIlIIIIl[181] = 0xFFFFE5E8 & 0x7BBF;
        o.lIIIlIIIIl[182] = 0xFFFF9FFC & 0x6387;
        o.lIIIlIIIIl[183] = 0xDE ^ 0xBA;
        o.lIIIlIIIIl[184] = 0x32 ^ 0x63;
        o.lIIIlIIIIl[185] = 0x67 ^ 0xC ^ (0x73 ^ 0x4A);
        o.lIIIlIIIIl[186] = 0xFFFF976D & 0x7BFF;
        o.lIIIlIIIIl[187] = 0xFFFFB77D & 0x5BFF;
        o.lIIIlIIIIl[188] = -(0xFFFFFF7F & 0x34CF) & (0xFFFFBFEF & 0x7FDF);
        o.lIIIlIIIIl[189] = (0x55 ^ 0x62) + (0x93 ^ 0x9D) - -(0x90 ^ 0x89) + (0x78 ^ 0x59);
        o.lIIIlIIIIl[190] = 19 + 7 - -169 + 10 ^ 64 + 178 - 117 + 54;
        o.lIIIlIIIIl[191] = 0xF1 ^ 0xA2;
        o.lIIIlIIIIl[192] = 127 + 17 - -17 + 55 ^ 122 + 126 - 178 + 70;
        o.lIIIlIIIIl[193] = 0x39 ^ 0x6C;
        o.lIIIlIIIIl[194] = 6 ^ 0x50;
    }

    private static String lllIIlllIIIl(String llIIIIIIIlll, String llIIIIIIlIII) {
        try {
            SecretKeySpec llIIIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIIIl[18]), "DES");
            Cipher llIIIIIIlIll = Cipher.getInstance("DES");
            llIIIIIIlIll.init(lIIIlIIIIl[4], llIIIIIIllII);
            return new String(llIIIIIIlIll.doFinal(Base64.getDecoder().decode(llIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlIlI) {
            llIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllllIl(Object object) {
        return object != null;
    }

    private static boolean lllIlIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIIlIIIIl[1];
    }

    static {
        o.lllIIllllIII();
        o.lllIIlllIIll();
        bv = new ArrayList<d>();
        I = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[186], lIIIlIIIIl[0]);
        cc = new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[187], lIIIlIIIIl[0]);
        cd = new WorldArea(lIIIlIIIIl[188], lIIIlIIIIl[36], lIIIlIIIIl[189], lIIIlIIIIl[190], lIIIlIIIIl[0]);
        String[] stringArray = new String[lIIIlIIIIl[6]];
        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[191]];
        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[192]];
        stringArray[o.lIIIlIIIIl[4]] = lIIIlIIIII[lIIIlIIIIl[193]];
        bR = stringArray;
    }

    private static String lllIIlllIIII(String lIlllllllIIl, String lIlllllllIII) {
        lIlllllllIIl = new String(Base64.getDecoder().decode(lIlllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllllIlll = new StringBuilder();
        char[] lIllllllIllI = lIlllllllIII.toCharArray();
        int lIllllllIlIl = lIIIlIIIIl[1];
        char[] lIlllllIllll = lIlllllllIIl.toCharArray();
        int lIlllllIlllI = lIlllllIllll.length;
        int lIlllllIllIl = lIIIlIIIIl[1];
        while (o.lllIIllllIlI(lIlllllIllIl, lIlllllIlllI)) {
            char lIlllllllIlI = lIlllllIllll[lIlllllIllIl];
            lIllllllIlll.append((char)(lIlllllllIlI ^ lIllllllIllI[lIllllllIlIl % lIllllllIllI.length]));
            "".length();
            ++lIllllllIlIl;
            ++lIlllllIllIl;
            "".length();
            if ("   ".length() > ((0xDB ^ 0xC2 ^ (0xA4 ^ 0x81)) & (0xC0 ^ 0xB7 ^ (0x8C ^ 0xC7) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lIllllllIlll);
    }

    public static void ay() {
        block140: {
            Object llIIIllIIlll;
            block141: {
                block143: {
                    block142: {
                        if (o.lllIIllllIIl(bt ? 1 : 0)) {
                            b.a(bv);
                            if (o.lllIIllllIlI(bv.size(), lIIIlIIIIl[0])) {
                                System.out.println(lIIIlIIIII[lIIIlIIIIl[1]]);
                                bt = lIIIlIIIIl[1];
                            }
                        }
                        if (!o.lllIIllllIll(bt ? 1 : 0)) break block140;
                        if (!o.lllIIlllllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlIIIIl[2]) || o.lllIIllllIlI(Skills.getLevel((Skill)Skill.THIEVING), lIIIlIIIIl[2])) {
                            System.out.println(lIIIlIIIII[lIIIlIIIIl[0]]);
                            return;
                        }
                        if (!o.lllIIllllIll(o.ab() ? 1 : 0) || !o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block141;
                        int[] nArray = new int[lIIIlIIIIl[0]];
                        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                        if (!o.lllIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) || !o.lllIIlllllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlIIIIl[2]) || !o.lllIIlllllII(Skills.getLevel((Skill)Skill.THIEVING), lIIIlIIIIl[2])) break block141;
                        llIIIllIIlll = BankLocation.getNearest();
                        if (o.lllIIlllllIl(llIIIllIIlll) && o.lllIIllllIll(llIIIllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[4]];
                            a.a((BankLocation)llIIIllIIlll);
                        }
                        int[] nArray2 = new int[lIIIlIIIIl[0]];
                        nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                        if (o.lllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            return;
                        }
                        if (!o.lllIIlllllIl(llIIIllIIlll) || !o.lllIIllllIIl(llIIIllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block141;
                        if (o.lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIIIl[5]);
                            "".length();
                        }
                        if (!o.lllIIllllIIl(Bank.isOpen() ? 1 : 0)) break block141;
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[6]];
                        if (o.lllIIllllllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlIIIIl[7]);
                            "".length();
                        }
                        if (o.lllIIllllllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlIIIIl[4]);
                            "".length();
                        }
                        Time.sleepTicks((int)lIIIlIIIIl[6]);
                        "".length();
                        int[] nArray3 = new int[lIIIlIIIIl[0]];
                        nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block142;
                        int[] nArray4 = new int[lIIIlIIIIl[0]];
                        nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block143;
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIIIl[4])) break block143;
                    }
                    o.af();
                    System.out.println(lIIIlIIIII[lIIIlIIIIl[7]]);
                    bt = lIIIlIIIIl[0];
                    return;
                }
                int[] nArray = new int[lIIIlIIIIl[7]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                nArray[o.lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                nArray[o.lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                nArray[o.lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                if (o.lllIIllllIll(e.b(nArray) ? 1 : 0)) {
                    o.af();
                    System.out.println(lIIIlIIIII[lIIIlIIIIl[12]]);
                    bt = lIIIlIIIIl[0];
                    return;
                }
                int[] nArray6 = new int[lIIIlIIIIl[7]];
                nArray6[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                nArray6[o.lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                nArray6[o.lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                nArray6[o.lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                if (o.lllIIllllIIl(e.b(nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIlIIIIl[0]];
                    nArray7[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[14]]);
                        bX = lIIIlIIIIl[0];
                    }
                    int[] nArray8 = new int[lIIIlIIIIl[0]];
                    nArray8[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[16]]);
                        bY = lIIIlIIIIl[0];
                    }
                    int[] nArray9 = new int[lIIIlIIIIl[0]];
                    nArray9[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[18]]);
                        bZ = lIIIlIIIIl[0];
                    }
                    int[] nArray10 = new int[lIIIlIIIIl[0]];
                    nArray10[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[20]]);
                        ca = lIIIlIIIIl[0];
                    }
                    int[] nArray11 = new int[lIIIlIIIIl[0]];
                    nArray11[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[22]]);
                        cb = lIIIlIIIIl[0];
                    }
                    if (o.lllIIllllIIl(cb ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bX ? 1 : 0)) {
                        return;
                    }
                    while (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                        if (o.lllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.b(f.aO, lIIIlIIIIl[0]);
                            a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                            a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                        }
                        Movement.walkTo((WorldPoint)I);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (((0x57 ^ 0x1B ^ (0x25 ^ 0x30)) & (0x25 ^ 0x5B ^ (0x41 ^ 0x66) ^ -" ".length())) == 0) continue;
                        return;
                    }
                    if ((!o.lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) || o.lllIIllllIll(Vars.getBit((int)lIIIlIIIIl[25]))) && o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                        a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                        a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                        while (o.lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[26]) && o.lllIIllllIIl(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aW).interact(lIIIlIIIII[lIIIlIIIIl[27]]);
                            Time.sleepTicks((int)lIIIlIIIIl[0]);
                            "".length();
                            "".length();
                            if ("  ".length() > ((0x23 ^ 0x76 ^ (0xCC ^ 0x94)) & (0xFA ^ 0x88 ^ 25 + 23 - -22 + 57 ^ -" ".length()))) continue;
                            return;
                        }
                        if (o.lllIIllllIIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                            Time.sleepTicks((int)lIIIlIIIIl[4]);
                            "".length();
                            Inventory.getFirst((int[])f.aV).interact(lIIIlIIIII[lIIIlIIIIl[28]]);
                        }
                        if (o.lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlIIIIl[7]);
                            "".length();
                        }
                        Bank.depositInventory();
                    }
                }
            }
            if (!o.lllIIllllIIl(o.ab() ? 1 : 0) || !o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                // empty if block
            }
            if (o.lllIIllllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && o.lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[2])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlIIIII[lIIIlIIIIl[29]]);
                Time.sleepTicks((int)lIIIlIIIIl[0]);
                "".length();
            }
            if (o.lllIIllllIIl(o.ab() ? 1 : 0) && o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (o.lllIIllllIll(bW ? 1 : 0)) {
                    if (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[30]];
                        if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cc);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                    }
                    if (o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[31]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[32]]);
                        Time.sleepTicks((int)lIIIlIIIIl[7]);
                        "".length();
                        if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            bW = lIIIlIIIIl[0];
                        }
                    }
                }
                if (o.lllIIllllIIl(bW ? 1 : 0)) {
                    g.a(lIIIlIIIII[lIIIlIIIIl[33]], bR);
                    llIIIllIIlll = Dialog.getOptions();
                    if (o.lllIIllllIll(llIIIllIIlll.isEmpty() ? 1 : 0)) {
                        int llIIIllIIllI = lIIIlIIIIl[1];
                        while (o.lllIIllllIlI(llIIIllIIllI, llIIIllIIlll.size())) {
                            if (o.lllIIllllIIl(((Widget)llIIIllIIlll.get(llIIIllIIllI)).getText().contains(lIIIlIIIII[lIIIlIIIIl[34]]) ? 1 : 0)) {
                                bW = lIIIlIIIIl[1];
                            }
                            ++llIIIllIIllI;
                            "".length();
                            if (-" ".length() < " ".length()) continue;
                            return;
                        }
                    }
                }
            }
            if (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea llIIIlIIlIll;
                WorldPoint llIIIlIlIIll;
                llIIIllIIlll = new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[36], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals(llIIIllIIlll) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[37]];
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[38]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[39]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIllIIllI = new WorldPoint(lIIIlIIIIl[40], lIIIlIIIIl[41], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIlIl = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIlII = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[41], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIlII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIllIIlIl);
                    "".length();
                }
                WorldPoint llIIIllIIIll = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIllI) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[45]];
                    Movement.walkTo((WorldPoint)llIIIllIIIll);
                    "".length();
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIll) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[46]];
                    Movement.walkTo((WorldPoint)llIIIllIIllI);
                    "".length();
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIllIIIlI = new WorldPoint(lIIIlIIIIl[47], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIlIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[49]];
                        Movement.walkTo((WorldPoint)llIIIllIIIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (-"   ".length() <= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIlI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[25]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[50]]);
                }
                WorldPoint llIIIllIIIIl = new WorldPoint(lIIIlIIIIl[51], lIIIlIIIIl[52], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIIII = new WorldPoint(lIIIlIIIIl[53], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIIIII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() > 0) continue;
                        return;
                    }
                }
                WorldPoint llIIIlIlllll = new WorldPoint(lIIIlIIIIl[55], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlllll);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() == " ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[56]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[57]]);
                }
                WorldPoint llIIIlIllllI = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[59], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlllIl = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlllII = new WorldPoint(lIIIlIIIIl[60], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllllI) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlllII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() == "   ".length()) continue;
                        return;
                    }
                }
                WorldArea llIIIlIllIll = new WorldArea(lIIIlIIIIl[62], lIIIlIIIIl[63], lIIIlIIIIl[31], lIIIlIIIIl[45], lIIIlIIIIl[0]);
                WorldPoint llIIIlIllIlI = new WorldPoint(lIIIlIIIIl[64], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(llIIIlIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[65]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[23]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIlIllIIl = new WorldPoint(lIIIlIIIIl[66], lIIIlIIIIl[67], lIIIlIIIIl[0]);
                WorldPoint llIIIlIllIII = new WorldPoint(lIIIlIIIIl[68], lIIIlIIIIl[69], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIllIII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() >= 0) continue;
                        return;
                    }
                }
                WorldPoint llIIIlIlIlll = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIlIlIlll);
                    "".length();
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIlIlIllI = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIlll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIllI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (-(0x53 ^ 0x56) < 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIllI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[74]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[75]]);
                }
                WorldArea llIIIlIlIlIl = new WorldArea(lIIIlIIIIl[76], lIIIlIIIIl[77], lIIIlIIIIl[16], lIIIlIIIIl[25], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIlII = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(llIIIlIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    llIIIlIlIIll = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[80], lIIIlIIIIl[0]);
                    if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIlIIll.getX(), llIIIlIlIIll.getY() + lIIIlIIIIl[14], lIIIlIIIIl[0]));
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[18]);
                        "".length();
                    }
                    if (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(llIIIlIlIlII), lIIIlIIIIl[7])) {
                        Movement.walkTo((WorldPoint)llIIIlIlIlII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                    }
                    if (o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(llIIIlIlIlII), lIIIlIIIIl[7])) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[82]]);
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                    }
                }
                llIIIlIlIIll = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIIlI = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[84], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIIIl = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[4]);
                        "".length();
                        "".length();
                        if (-" ".length() == -" ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIlI) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIIl) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIIIl);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() > "  ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIIl) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[87]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIlIlIIII = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllll = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIII) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[89]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[90]]);
                }
                WorldPoint llIIIlIIlllI = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllIl = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllII = new WorldPoint(lIIIlIIIIl[92], lIIIlIIIIl[93], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlllI) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIllII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((0x46 ^ 0x42) != 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[95]]);
                }
                if (o.lllIIllllIIl((llIIIlIIlIll = new WorldArea(lIIIlIIIIl[96], lIIIlIIIIl[97], lIIIlIIIIl[6], lIIIlIIIIl[12], lIIIlIIIIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[99]]);
                    Time.sleepTicks((int)lIIIlIIIIl[6]);
                    "".length();
                }
                WorldPoint llIIIlIIlIlI = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIlIIl = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIlIII = new WorldPoint(lIIIlIIIIl[102], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlll = new WorldPoint(lIIIlIIIIl[103], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIlIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("  ".length() < (57 + 65 - 61 + 77 ^ 77 + 45 - 92 + 112)) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIlIII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (-"   ".length() < 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIII) ? 1 : 0)) {
                    int[] nArray = new int[lIIIlIIIIl[0]];
                    nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                    TileItems.getNearest((int[])nArray).interact(lIIIlIIIII[lIIIlIIIIl[105]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                int[] nArray = new int[lIIIlIIIIl[0]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                if (o.lllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (o.lllIIllllIIl(Widgets.get((int)lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[107]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[108]]);
                        Time.sleepTicks((int)lIIIlIIIIl[6]);
                        "".length();
                    }
                    if (o.lllIIllllIll(Widgets.get((int)lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        Widgets.get((int)lIIIlIIIIl[106], (int)lIIIlIIIIl[12]).interact(lIIIlIIIII[lIIIlIIIIl[109]]);
                        Time.sleepTicks((int)lIIIlIIIIl[4]);
                        "".length();
                    }
                }
                WorldPoint llIIIlIIIllI = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[111], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlIl = new WorldPoint(lIIIlIIIIl[112], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlII = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[115], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIll = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[116], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIlI = new WorldPoint(lIIIlIIIIl[117], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIIl = new WorldPoint(lIIIlIIIIl[119], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIII = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllll = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllllI = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllIl = new WorldPoint(lIIIlIIIIl[121], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllII = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIll = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIlI = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIIl = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIII = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIlll = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIllI = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIllI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[128]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[129]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlIl) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIlIIIlII);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[130]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[2]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIIIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (null == null) continue;
                        return;
                    }
                }
                if (!(o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIlI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIII) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllllI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllII) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIlI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIII) ? 1 : 0) && !o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIllI) ? 1 : 0))) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[131]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[132]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIIIII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (null == null) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlllllI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() != 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllllII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("  ".length() >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlllIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() <= "   ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIIl) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIIlllIII);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIIllIllI);
                    "".length();
                }
                WorldPoint llIIIIllIlIl = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIlII = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIll = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIlI = new WorldPoint(lIIIlIIIIl[135], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIIl = new WorldPoint(lIIIlIIIIl[137], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIlII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (((0x18 ^ 0x3D) & ~(0xB1 ^ 0x94)) == 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIIll);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (((0x9E ^ 0xBF) & ~(0xE2 ^ 0xC3)) >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[138]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[139]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIlI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIIIl);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() < "   ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIIl) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[140]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[141]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint llIIIIllIIII = new WorldPoint(lIIIlIIIIl[142], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllll = new WorldPoint(lIIIlIIIIl[143], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlllI = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[145], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllIl = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllII = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[146], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIll = new WorldPoint(lIIIlIIIIl[147], lIIIlIIIIl[148], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIlI = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIIl = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIII = new WorldPoint(lIIIlIIIIl[150], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() > 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllll);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (-"   ".length() <= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlllI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (-" ".length() < " ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlllI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllIl);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((0x5C ^ 0x22 ^ (0x7B ^ 1)) > "   ".length()) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllII);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIll);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() > ((0xD6 ^ 0x9C) & ~(0x34 ^ 0x7E))) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[151]];
                    TileItems.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[152]]);
                }
                WorldArea llIIIIlIIlll = new WorldArea(lIIIlIIIIl[150], lIIIlIIIIl[153], lIIIlIIIIl[25], lIIIlIIIIl[32], lIIIlIIIIl[0]);
                String[] stringArray = new String[lIIIlIIIIl[0]];
                stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[154]];
                if (o.lllIIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlIIIIl[0]];
                    stringArray2[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[155]];
                    if (o.lllIlIIIIIIl(Inventory.getFirst((String[])stringArray2).getQuantity(), lIIIlIIIIl[12])) {
                        String[] stringArray3 = new String[lIIIlIIIIl[0]];
                        stringArray3[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[156]];
                        int[] nArray12 = new int[lIIIlIIIIl[0]];
                        nArray12[o.lIIIlIIIIl[1]] = lIIIlIIIIl[157];
                        Inventory.getFirst((String[])stringArray3).useOn((Actor)NPCs.getNearest((int[])nArray12));
                    }
                    String[] stringArray4 = new String[lIIIlIIIIl[0]];
                    stringArray4[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[158]];
                    if (o.lllIlIIIIIIl(Inventory.getFirst((String[])stringArray4).getQuantity(), lIIIlIIIIl[7]) && o.lllIIllllIIl(llIIIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIlI) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIIIIlIlIlI);
                            "".length();
                            Time.sleepTicks((int)lIIIlIIIIl[0]);
                            "".length();
                            "".length();
                            if (-" ".length() <= 0) continue;
                            return;
                        }
                    }
                }
                WorldPoint llIIIIlIIllI = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[159], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIIlIl = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[160], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIIlII = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIlI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIIllI);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        Movement.toggleRun();
                        "".length();
                        if ("   ".length() <= (0x9E ^ 0xB2 ^ (0xB4 ^ 0x9C))) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIllI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIIl);
                        "".length();
                        Time.sleepTicks((int)lIIIlIIIIl[0]);
                        "".length();
                        Movement.toggleRun();
                        "".length();
                        if ("  ".length() > 0) continue;
                        return;
                    }
                }
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIlIl) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIlII) ? 1 : 0)) {
                    String[] stringArray5 = new String[lIIIlIIIIl[0]];
                    stringArray5[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[161]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIIlIIIII[lIIIlIIIIl[162]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);
                    "".length();
                }
            }
            int[] nArray = new int[lIIIlIIIIl[0]];
            nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (o.lllIIllllIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray13 = new int[lIIIlIIIIl[0]];
                    nArray13[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                    Inventory.getFirst((int[])nArray13).interact(lIIIlIIIII[lIIIlIIIIl[163]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);
                    "".length();
                }
                if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                    if (o.lllIIllllIll(bX ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[164]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[165]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIll(bY ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[166]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[167]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIll(bZ ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[168]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[169]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIll(ca ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[170]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[171]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIll(cb ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[172]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[173]];
                        g.a(stringArray);
                    }
                }
            }
            int[] nArray14 = new int[lIIIlIIIIl[0]];
            nArray14[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[174]]);
                bX = lIIIlIIIIl[0];
            }
            int[] nArray15 = new int[lIIIlIIIIl[0]];
            nArray15[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[175]]);
                bY = lIIIlIIIIl[0];
            }
            int[] nArray16 = new int[lIIIlIIIIl[0]];
            nArray16[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[176]]);
                bZ = lIIIlIIIIl[0];
            }
            int[] nArray17 = new int[lIIIlIIIIl[0]];
            nArray17[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[177]]);
                ca = lIIIlIIIIl[0];
            }
            int[] nArray18 = new int[lIIIlIIIIl[0]];
            nArray18[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[26]]);
                cb = lIIIlIIIIl[0];
            }
            g.a(bR);
        }
    }
}

