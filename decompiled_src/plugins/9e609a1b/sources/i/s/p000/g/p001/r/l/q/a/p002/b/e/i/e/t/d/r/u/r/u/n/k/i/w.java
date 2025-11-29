package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.w  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/w.class */
public class w implements M {
    public static final /* synthetic */ WorldPoint fL;
    public static final /* synthetic */ WorldPoint fO;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIlIIIIIlIIl;
    public static final /* synthetic */ WorldPoint fM;
    public static final /* synthetic */ WorldPoint fN;
    private static /* synthetic */ int[] lIIlIIIIlIlll;
    static /* synthetic */ boolean fP;
    public static /* synthetic */ String[] bW;
    public static /* synthetic */ List<C0003d> bA;
    static /* synthetic */ int co;
    static /* synthetic */ boolean fQ;
    static /* synthetic */ boolean fR;
    static /* synthetic */ boolean cp;
    static /* synthetic */ boolean fS;

    private static void br() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[303]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lIIlIIIIlIlll[2]);
            "".length();
        }
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[304]];
            if (lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlIIIIlIlll[18]);
                "".length();
            }
            if (lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlIIIIlIlll[9]);
                    "".length();
                }
                C0000a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                C0000a.b(C0005f.ba, lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[35], lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[27], lIIlIIIIlIlll[7]);
                C0000a.a(lIIlIIIIlIlll[34], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25]);
                C0000a.a(lIIlIIIIlIlll[305], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                int[] iArr = new int[lIIlIIIIlIlll[1]];
                iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (lIlIIlllllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIlIlll[1]];
                    iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (lIlIIlllllllIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllllllllll(int i2, int i3) {
        return i2 > i3;
    }

    private static void bs() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[306]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lIIlIIIIlIlll[2]);
            "".length();
        }
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[307]];
            if (lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlIIIIlIlll[18]);
                "".length();
            }
            if (lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlIIIIlIlll[9]);
                    "".length();
                }
                C0000a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                C0000a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                C0000a.b(C0005f.ba, lIIlIIIIlIlll[2]);
                C0000a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[7]);
                C0000a.a(lIIlIIIIlIlll[33], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[32], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[30], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[31], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                Bank.withdraw(lIIlIIIIIlIIl[lIIlIIIIlIlll[308]], lIIlIIIIlIlll[1], Bank.WithdrawMode.ITEM);
                int[] iArr = new int[lIIlIIIIlIlll[1]];
                iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (lIlIIlllllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIlIlll[1]];
                    iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (lIlIIlllllllIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], Bank.WithdrawMode.ITEM);
                    }
                }
                C0000a.a(lIIlIIIIlIlll[35], Inventory.getFreeSlots());
            }
        }
    }

    private static void lIlIIllllllIlIl() {
        lIIlIIIIIlIIl = new String[lIIlIIIIlIlll[365]];
        lIIlIIIIIlIIl[lIIlIIIIlIlll[0]] = lIlIIlllIIlIlIl("kqxW/we8WyUh93THitf6Rw==", "adLdT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[1]] = lIlIIlllIIlIllI("sazzCpZTbsvHkYoEIAQXJDlnLTO8k9Rao1ZJgnibaxcQFYBUpnGzvSZiJ3ko2CVk", "AygZA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[2]] = lIlIIlllIIlIlll("Ahw3PDYuHHY/MzE=", "AnVRR");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[7]] = lIlIIlllIIlIlIl("he21ZdTEo54=", "rQHjr");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[9]] = lIlIIlllIIlIllI("J0F/UqfdG/M=", "lygJg");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[11]] = lIlIIlllIIlIllI("llX84M/7HCM=", "EJdAO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[12]] = lIlIIlllIIlIllI("JNe4rKuGs1g=", "IqkKQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[13]] = lIlIIlllIIlIlIl("UpPjwmaNV0w=", "XuFWm");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[16]] = lIlIIlllIIlIlll("AxgbciQiWQ8zPiY=", "MymRP");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[17]] = lIlIIlllIIlIlll("LjsWESEPNB9VLwc0ExwjAQ==", "fZxuM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[23]] = lIlIIlllIIlIlIl("86X4j+6nP13Mvnt4e2C7UROJa/2yssJVx6YY8Ezb/6qyb5TwuXQD0aWrdiwcRc+L", "BYhCj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[26]] = lIlIIlllIIlIlIl("JUqPDQNCKFm6UZXy/n/cLaCzw7sTlNMOHwF/b3EADUwC853QwcRrFEBMkZfgcBYr", "KBJsJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[28]] = lIlIIlllIIlIlll("LTZ4EBkfczUYGAk6NhZLCj85HwAJf3gCHBMnOxkCFDR4BQRaEQ0oIjQU", "zSXqk");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[38]] = lIlIIlllIIlIlll("EjRXCyQgcRoDJTY4GQ12NCQSGSJlIgIaJik4Ehl6ZSIAAyImOR4EMWUlGEoUEAg+JBE=", "EQwjV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[40]] = lIlIIlllIIlIlll("PgIMUT8fQxkZKh0TWhY+GQ8e", "pczqK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[20]] = lIlIIlllIIlIlIl("connUA3oFm0=", "GZZbo");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[43]] = lIlIIlllIIlIllI("zskIbeh61NvvNKAmEBhSsA==", "OTTaJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[29]] = lIlIIlllIIlIllI("/QQv5vUizMADnTMRMSSZrg==", "iiiLw");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[50]] = lIlIIlllIIlIlIl("+YOYlONOhMs=", "rVEfC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[51]] = lIlIIlllIIlIllI("UiP3bUXXUY3pozYqzOewtA==", "OHVVj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[10]] = lIlIIlllIIlIllI("VDevCM/AcCs=", "UYenx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[52]] = lIlIIlllIIlIllI("6FcOTb86d/4=", "maHTe");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[53]] = lIlIIlllIIlIllI("H4DHQaOuFOI=", "RFyMl");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[55]] = lIlIIlllIIlIlIl("liLmGbvvHgq9olTsjpuJPg==", "fbbRh");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[8]] = lIlIIlllIIlIlIl("PZyBJMzcytd4zlMXQ3L1Xsc+IaS3luhN", "nbnro");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[56]] = lIlIIlllIIlIllI("VNW8GlKsDYo=", "FDpJH");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[57]] = lIlIIlllIIlIlll("AQIoHDw7BA==", "UcDwU");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[58]] = lIlIIlllIIlIllI("dpDiwqgHdScqGMP2F3S7Xg==", "OHosz");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[60]] = lIlIIlllIIlIlll("PB0iBRRLFiYZUSJVIR4fD1UzHxRLBy4QGR9VNB8YG0o=", "kuGwq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[61]] = lIlIIlllIIlIlll("L1kQJwgNHABmEAlZKzwNBxoMaEpI", "fydFd");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[63]] = lIlIIlllIIlIlIl("zFY3sC0Cg12wkjjPWVvL+NsBK+jW3inso7dpMmDDA19Lykqlv1eLfYVqkA5dRQpW6iwmhFSB+pk=", "laoQc");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[65]] = lIlIIlllIIlIllI("AxYCsgjp/brd1iwxiGuLFQ==", "xRYKY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[15]] = lIlIIlllIIlIlll("OAQ2VgoRBWE/SRYCLxJJBAMkVhsfHjUTSQQEYTUbEQUlGRtP", "pkAvi");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[66]] = lIlIIlllIIlIlll("OQ0cPBBODApuOAsJAy8HSRZZIxQeRQknEA0ARg==", "neyNu");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[68]] = lIlIIlllIIlIlIl("8sNmQ31ajQlbo0UpwP1UqlnKr0qdKt5l1ynXuQJ2acQ8hcXyxSmBvQ==", "QWGmL");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[69]] = lIlIIlllIIlIllI("olPspq+hDB3vgHKOuevJ98TWgV1YA+hAuqBVN/L2OQk=", "NzEbq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[70]] = lIlIIlllIIlIlll("Eismdxo7KnEeWTwtPzNZLiw0dws1MSUyWS4rcRQLOyo1OAtl", "ZDQWy");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[71]] = lIlIIlllIIlIlll("EgU/Hh1lBClMNCoXOx5fNk03DQhlHTMJGyBS", "EmZlx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[74]] = lIlIIlllIIlIllI("xIVWzrzxd+S/RyhM9ZzsPA==", "RbARD");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[77]] = lIlIIlllIIlIllI("ERDHDzp5Av4=", "wLtBX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[78]] = lIlIIlllIIlIllI("TKRZrh6Ft+aVJZHHBN5aaQ==", "CRIDI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[79]] = lIlIIlllIIlIllI("nP3QlH8VGAY=", "NSLkm");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[80]] = lIlIIlllIIlIlIl("V7tzDoH+h/w=", "okBlJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[82]] = lIlIIlllIIlIlll("Px0EGDcWAEYbLAc=", "srfkC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[84]] = lIlIIlllIIlIllI("XalAASLk3QGOYAwG8yQN3g==", "yYeaR");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[87]] = lIlIIlllIIlIllI("Utk5kgZZojQ8t7+I+K09rvVZYGP/5F1m", "CHYsB");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[88]] = lIlIIlllIIlIlIl("4o8HwkIltZXFH8pnYRHOXLmFkNbOLLtZ", "fZKrm");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[89]] = lIlIIlllIIlIlIl("eqBgFBhgFwI=", "oNLyo");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[90]] = lIlIIlllIIlIllI("jxbCgnhxOBM=", "gthvS");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[91]] = lIlIIlllIIlIlll("CAoLKgJlDwMsEw==", "EklCa");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[6]] = lIlIIlllIIlIlll("BSMtFBgsPm8XAz0=", "ILOgl");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[92]] = lIlIIlllIIlIlll("Cx8DGSwiAkEaNzM=", "GpajX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[93]] = lIlIIlllIIlIllI("HSAOdA4TJ0QODG0cK5ZiHA==", "kXIiw");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[94]] = lIlIIlllIIlIllI("WtRNQNZLRCXxYuo2AsQ1EA==", "XkAKK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[95]] = lIlIIlllIIlIlll("PQYQAAMNDFYLHh8E", "hhviq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[96]] = lIlIIlllIIlIllI("nr3GXpHizFRhsC4YCUwPmA==", "UXViP");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[97]] = lIlIIlllIIlIlIl("6ZW7W7bcGrZ3/M68+FiRk8nb5ji3O0b7", "qBRJn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[98]] = lIlIIlllIIlIlIl("PvCdLtEN5MKCwFUo+k27FNl0yF3JOauS", "KAEVy");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[99]] = lIlIIlllIIlIlIl("pUYMlclwgcHJiQc75MofNQ==", "PriwY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[100]] = lIlIIlllIIlIlll("HAMrOA==", "OjGSC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[101]] = lIlIIlllIIlIllI("NJ8rBU+qKUA=", "GQsCM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[102]] = lIlIIlllIIlIllI("X/ZhS4OVJpP4BB7DjxUOIg==", "WkQoE");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[103]] = lIlIIlllIIlIlll("IAsrJQQJFmkmHxg=", "ldIVp");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[104]] = lIlIIlllIIlIllI("VLH2MjtX/OvbH2K916FgtA==", "YAWQY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[105]] = lIlIIlllIIlIlll("ACACBTdtJQoDJg==", "MAelT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[106]] = lIlIIlllIIlIllI("5iQlAlzcOKJDw7W8AtTbkg==", "cTUOI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[107]] = lIlIIlllIIlIlIl("TYCS7PyKbO/aByxKs9hYkw==", "lKuTO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[108]] = lIlIIlllIIlIllI("WSd4Q6OSqofkb01N+YJL+w==", "qXHBg");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[109]] = lIlIIlllIIlIlll("PiERKTwNbxhoIwAmD2gsBiUJ", "iHkHN");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[110]] = lIlIIlllIIlIllI("mtqmGV+F7KXJASILQcrtkYwkvAcqQW6/", "bAMmA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[111]] = lIlIIlllIIlIllI("eKvRJ7I8QDEhxIFNXpYoKA==", "xNfdx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[112]] = lIlIIlllIIlIllI("kCWAiKT1/Rk=", "kuEof");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[113]] = lIlIIlllIIlIlll("PBMXACpRFh8GOw==", "qrpiI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[114]] = lIlIIlllIIlIlIl("BxzUgEt3p7Q=", "CwtTJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[115]] = lIlIIlllIIlIlll("HzELIg==", "PAnLw");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[116]] = lIlIIlllIIlIllI("06jJrw5SDTQ=", "aFvqQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[117]] = lIlIIlllIIlIlIl("tHo/Hjp02xU=", "GIsPF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[118]] = lIlIIlllIIlIlIl("cSlq8nx07Lo=", "MjxXC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[119]] = lIlIIlllIIlIlll("MSo7CA==", "bCWcO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[120]] = lIlIIlllIIlIllI("OBFZqF7mEtc=", "YOsdA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[121]] = lIlIIlllIIlIlll("AwcEDhNuAgwIAg==", "Nfcgp");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[122]] = lIlIIlllIIlIlIl("vXNRncidfqXCh/EGnKJXyg==", "pwsvI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[123]] = lIlIIlllIIlIlIl("/ZwbXGJkQ8aBYMkKYrkqlg==", "rSTGE");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[124]] = lIlIIlllIIlIlIl("Cz9xjAku+5TKIl2e2HmJJA==", "rjSak");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[125]] = lIlIIlllIIlIlll("EhQVHAQiHlMXGTAW", "Gzsuv");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[126]] = lIlIIlllIIlIlIl("qnCOWRqg8K2In8EJoKSQXw==", "mYNXD");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[127]] = lIlIIlllIIlIlIl("GJ1mjEWKN7bATnBPPNB1yg==", "FdQqq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[128]] = lIlIIlllIIlIllI("IslcYx6yFQ9FjQaldxADZSIzdLIQnliA", "nLDQI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[129]] = lIlIIlllIIlIllI("ukbQ4H0cul4Xzw1/FdiyWTKG02O52qNP", "YaLYV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[130]] = lIlIIlllIIlIllI("qhhW+B1G9iBDr98xVNbwAg==", "TmURj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[25]] = lIlIIlllIIlIlll("GT4SEBw=", "ZVwch");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[131]] = lIlIIlllIIlIlll("IQUGJTVMAA4jJA==", "ldaLV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[132]] = lIlIIlllIIlIlIl("o5k+KZ5gva8=", "jWFyl");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[133]] = lIlIIlllIIlIlll("GRkDNA==", "VifZC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[134]] = lIlIIlllIIlIllI("0TjL97NEXZU=", "BvAGC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[135]] = lIlIIlllIIlIlIl("WqjPeyGAwJ8=", "qkVVC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[136]] = lIlIIlllIIlIlIl("URISfZ0Pfhs=", "eaXEj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[137]] = lIlIIlllIIlIlIl("t6wUyJjOZiI=", "zzSIv");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[140]] = lIlIIlllIIlIllI("sRcvF9d1mvLlz8TfLa9GPPienb42bUim", "WkSJI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[141]] = lIlIIlllIIlIlIl("oL5yGF97kOVv0YL63Vi3ZCxasglwCAAZkSjONGPxHSU=", "grGgN");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[142]] = lIlIIlllIIlIlll("NwEgIwYMRCAmBB1IYRhFDAU3NEUKCzU5DAoDYSUKRAwoNQBK", "ddAQe");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[143]] = lIlIIlllIIlIlIl("bqWDmPPlpoc=", "UJCQK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[144]] = lIlIIlllIIlIllI("Nd9KO2m5D+M=", "XzrZF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[145]] = lIlIIlllIIlIlIl("mcF9PP1w9T9Jvit0AnYHqQ==", "AwNgf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[146]] = lIlIIlllIIlIlIl("5X6Q5mtm2ui2geYPIoMtYw==", "TzrcG");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[147]] = lIlIIlllIIlIlll("OxIhC2keGyUKOg==", "ywDyI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[148]] = lIlIIlllIIlIlIl("2fGNsaMz+rY=", "oUuFP");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[155]] = lIlIIlllIIlIllI("ZDPcI63b7yKC3EWkh2eFrg==", "yqqtx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[156]] = lIlIIlllIIlIllI("jGlePzAuC1o=", "zpHXI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[157]] = lIlIIlllIIlIlIl("XdNBOIQ2gF0=", "LwbFr");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[165]] = lIlIIlllIIlIllI("RVPkKe3P/gqvfkMm9rgOhQ==", "mjbtn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[167]] = lIlIIlllIIlIllI("ItvXwrK18RQ=", "mDOuF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[168]] = lIlIIlllIIlIlll("Jw44AA==", "soSeG");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[171]] = lIlIIlllIIlIlll("FgsicCI3SiY1MngOOz8k", "XjTPV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[172]] = lIlIIlllIIlIlll("IQwTajIcBgU=", "siwJV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[173]] = lIlIIlllIIlIlIl("Qrtlm2qH3D8=", "ZavMl");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[174]] = lIlIIlllIIlIllI("h+c6Qd9gfr0=", "MPTmY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[175]] = lIlIIlllIIlIlll("JjwZNRhIJQA=", "ePpXz");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[179]] = lIlIIlllIIlIllI("BSShJjvu5gQ1lmednlaZrg==", "gzjjd");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[181]] = lIlIIlllIIlIllI("kLOzwG4IRGw=", "DUiOE");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[182]] = lIlIIlllIIlIlll("JRQHMw==", "qulVT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[185]] = lIlIIlllIIlIllI("vJQVKPJ11RCdODvjVg7uhZZ+cOr4+E4a", "mnUdQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[186]] = lIlIIlllIIlIlll("IBMlLxMKQSAuGx0=", "oaDAt");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[187]] = lIlIIlllIIlIlll("BjIdFw==", "IBxyh");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[188]] = lIlIIlllIIlIllI("QCuYkl0OR+JhV5czfpYcWQ==", "mHPEq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[190]] = lIlIIlllIIlIllI("PBC3W/vt1ASZAN/k73f8cg==", "zBxhG");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[192]] = lIlIIlllIIlIlIl("T2ZXHAtXeXk=", "gJrMf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[193]] = lIlIIlllIIlIlIl("vl6ZDIFTAuc=", "ZmKld");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[195]] = lIlIIlllIIlIllI("dK0FXz0YgtOj8+cweU5mUe/6tLVt8s0h", "xIFxT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[196]] = lIlIIlllIIlIlll("MQ8VBC0fSh0HLRo=", "hjyhB");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[197]] = lIlIIlllIIlIlIl("T7ptzjiKzO8=", "njmfM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[198]] = lIlIIlllIIlIllI("CX2rnjkN7dfb8hILZhfWhg==", "mIExd");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[201]] = lIlIIlllIIlIllI("JTBsHwAjmXj4ropo9ckFYw==", "hdVbn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[202]] = lIlIIlllIIlIllI("N3DCJ8wpKnyX6DgHyhXyXQ==", "GmTiI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[208]] = lIlIIlllIIlIlll("JQ44GDEMDGwONBcObAc9Gw==", "bkLlX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[210]] = lIlIIlllIIlIlll("JAwhLQEO", "exULb");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[211]] = lIlIIlllIIlIlll("NQATLg==", "aaxKJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[213]] = lIlIIlllIIlIllI("paDkoV9jNJ/oXCMJpmioqW5I7/kevZ7D", "dIOPI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[214]] = lIlIIlllIIlIlll("GCIGJ3E+IRww", "ZNsBQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[215]] = lIlIIlllIIlIlIl("poOjvsYZmEQ=", "PEJby");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[217]] = lIlIIlllIIlIllI("uqy7szV8IAAqnHFYDwokQg==", "EbLPA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[219]] = lIlIIlllIIlIlIl("W6T8jCaS//Q=", "UlqSK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[220]] = lIlIIlllIIlIlIl("Sb2oSu0DtkU=", "UAglr");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[223]] = lIlIIlllIIlIllI("bnkl1EjHijujPbMe3ZNEUr8IPpXrsFRN", "VOiRX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[224]] = lIlIIlllIIlIlll("KjQkCB0TNGMJHAgn", "gUCms");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[225]] = lIlIIlllIIlIlll("DTkNJA==", "BIhJh");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[226]] = lIlIIlllIIlIlll("BxA/Egg5VSgEACQb", "KuLam");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[228]] = lIlIIlllIIlIlll("NTY5Lgcf", "tBMOd");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[229]] = lIlIIlllIIlIllI("24x9XBylL6Y=", "ZSmIc");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[231]] = lIlIIlllIIlIllI("nh9aF6927j6L8VGNb72pZXkMnZp28kA4", "HUBrC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[232]] = lIlIIlllIIlIllI("9rIFOaGy47vKQ8Iv9XMnOg==", "sTCTL");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[233]] = lIlIIlllIIlIlIl("BbW7VicGkEM=", "kMicp");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[234]] = lIlIIlllIIlIllI("q5QGui/LL7Q=", "YKetn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[235]] = lIlIIlllIIlIlll("Ch0uAw==", "EmKmP");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[236]] = lIlIIlllIIlIllI("HoXw03SHM/I=", "cvDMM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[237]] = lIlIIlllIIlIlIl("ouBZ82P0FoQ=", "UrTQM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[238]] = lIlIIlllIIlIllI("mxGx22xfhJA=", "gtxdO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[239]] = lIlIIlllIIlIlIl("W+y3fzIsKb4=", "iUzAq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[240]] = lIlIIlllIIlIlll("DSoldSAsazE6NTc=", "CKSUT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[241]] = lIlIIlllIIlIlll("NhkCNRsYH1EuEhMFEiQG", "ulqAt");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[242]] = lIlIIlllIIlIlll("MiAjTytRKyIaEB8kNE8NH2E5BwsCYT4HCwF+", "qAMob");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[243]] = lIlIIlllIIlIllI("4nGU4Yun9kBDhr18105wnf8/BmhDJ2Ws14krd+y2TVn1FUSNo7kQxg==", "RTMgf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[244]] = lIlIIlllIIlIllI("rhA9uQTVG8A=", "TPgUf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[245]] = lIlIIlllIIlIlll("ITY7ChcEKT8=", "jZZxr");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[246]] = lIlIIlllIIlIlll("MxMEPz1QEAkvczoXCD06HgE=", "prfVS");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[247]] = lIlIIlllIIlIlIl("RTcqDUZz1cs6VWjOHGtAQw==", "Gatwu");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[248]] = lIlIIlllIIlIlIl("CcsPdzqQYDfxujaY2y4mRw==", "TnDCr");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[249]] = lIlIIlllIIlIllI("k+qGr9CuOIg=", "EenLH");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[250]] = lIlIIlllIIlIllI("dXTJU6hi56bK/k6ahOBoow==", "aNtnn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[251]] = lIlIIlllIIlIllI("lNeDR3aT/Vc=", "KLdxj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[252]] = lIlIIlllIIlIlll("NxIoJwAX", "ewXFi");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[253]] = lIlIIlllIIlIlll("KDYcNjYW", "dWxRS");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[254]] = lIlIIlllIIlIlll("AhYvBwlsHikdBQ==", "AzFjk");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[255]] = lIlIIlllIIlIlIl("CT4OYBm8D4Lh7/KJPk5G7A==", "CwnPs");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[256]] = lIlIIlllIIlIlIl("Plzuxl98cpo=", "vBFmD");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[257]] = lIlIIlllIIlIlll("PQcXHisWB1YxLBUZFwAg", "yuvgE");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[14]] = lIlIIlllIIlIlll("NDYC", "zSfyM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[72]] = lIlIIlllIIlIllI("tWCt82w4mldiu34v3+MJog==", "aEbJl");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[260]] = lIlIIlllIIlIllI("uCzE28v65374hjxbm4ICwA==", "eVyhf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[261]] = lIlIIlllIIlIllI("/7Do2FsVB3WbyxEmhOV+5w==", "OEMfN");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[262]] = lIlIIlllIIlIlIl("DS9v5R872i6FblNsOASS5iydK2VlYrrTMCjIB0lQUR4=", "fPJEP");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[263]] = lIlIIlllIIlIlll("PSMnJAgGZichChdqZh9LBicwM0sAKTI+AgAhZiIETi4vMg5A", "nFFVk");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[264]] = lIlIIlllIIlIlIl("eLGTI8dvgkc=", "QewLc");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[265]] = lIlIIlllIIlIlll("LA45JT8HDjkp", "koWBO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[266]] = lIlIIlllIIlIlIl("WhidaslkfAo=", "Elmji");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[267]] = lIlIIlllIIlIlIl("KMOvrWZe+4Ws2JBE7M8mDw==", "ChDSa");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[268]] = lIlIIlllIIlIlll("BjgjGygsN3MhLCE=", "EYSoI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[272]] = lIlIIlllIIlIlll("LTUuWjUMdD0UNRE1Nhkk", "cTXzA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[273]] = lIlIIlllIIlIlIl("N6xC6YOD27c=", "QXfXs");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[274]] = lIlIIlllIIlIlIl("5m7A4rBB5SA=", "KSOsg");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[275]] = lIlIIlllIIlIlIl("rihVXkoeN7g=", "yjjJT");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[277]] = lIlIIlllIIlIllI("iA06AEWMdPnlMDJKoXMFWQ==", "ZCRaq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[278]] = lIlIIlllIIlIllI("oELx8BBYJoSbIQzjGE3hbA==", "SsqVs");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[279]] = lIlIIlllIIlIllI("yI2WenRZrsg=", "nrnHj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[280]] = lIlIIlllIIlIlll("ODwCHzI=", "kTcmY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[281]] = lIlIIlllIIlIlIl("8yY6ow+R4DI=", "PyGrK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[282]] = lIlIIlllIIlIlIl("nwdgkR101Is=", "Vrjfx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[283]] = lIlIIlllIIlIllI("XYa5tWAzVBAM6e5cV44S1w==", "ujvUM");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[284]] = lIlIIlllIIlIlIl("hsrQGbJVYbf8xKO2GUiZRV1Tt8sye1xe", "dwZZN");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[285]] = lIlIIlllIIlIlll("BD4jFQ==", "RWByX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[286]] = lIlIIlllIIlIlll("HBwTOA==", "JurTQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[287]] = lIlIIlllIIlIllI("n9Mzt1+5qZQ=", "YEMsa");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[288]] = lIlIIlllIIlIlIl("tHE+fbTb0oY=", "aZRWz");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[289]] = lIlIIlllIIlIlll("LTskMQ==", "iIKAN");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[290]] = lIlIIlllIIlIlll("HgQTBwc=", "Zvzil");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[292]] = lIlIIlllIIlIlIl("c0VGPOFYlzw=", "AVObo");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[293]] = lIlIIlllIIlIlIl("/8szOk1nSIw=", "bAhkD");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[295]] = lIlIIlllIIlIllI("zcG3yULhmI/3rFyWNLnmcg==", "GFVDo");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[296]] = lIlIIlllIIlIllI("rWp4aoXnMLE=", "uIhEz");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[297]] = lIlIIlllIIlIlIl("L4TOdbo5hgM=", "yovcR");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[298]] = lIlIIlllIIlIllI("HIyoh2el5lLD0IB8M7NJcw==", "MnERA");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[299]] = lIlIIlllIIlIlIl("wczd2qKWg68=", "ocMZf");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[300]] = lIlIIlllIIlIlll("GiY2Iho=", "XTSCq");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[301]] = lIlIIlllIIlIlIl("ysjUB/Ok1eq58ymBkxRdqg==", "rxSWR");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[302]] = lIlIIlllIIlIlIl("p7LfQnOU8CNEAWnYEUezz3KsB6s+bbtZ", "IaGlF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[303]] = lIlIIlllIIlIlIl("CDeEVszWnSPb05swP6QZyQ==", "AJJME");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[304]] = lIlIIlllIIlIlll("LhsrMioPFCJ2JAcULj8oAQ==", "fzEVF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[306]] = lIlIIlllIIlIlll("CyMPUzwqYhsSJi4=", "EBysH");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[307]] = lIlIIlllIIlIllI("ZhHQXz21Jl0HB9gOwjrFY5iG8h0B0qiU", "heeSm");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[308]] = lIlIIlllIIlIlll("AQgJM0knDAo=", "LisVi");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[315]] = lIlIIlllIIlIlll("CxULLAUhRxknCzYCGGtbbxYfLhk7", "OgjKj");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[316]] = lIlIIlllIIlIllI("Y6lM8dMpCewYkLmDdZHtPM97EXG9aNkz", "kFVxi");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[317]] = lIlIIlllIIlIlll("JQ85Kz4NEyg=", "daMBX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[318]] = lIlIIlllIIlIlIl("q5MjbzXjyIJQsrAWwNZJVQ==", "UeJkp");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[319]] = lIlIIlllIIlIlll("AS4gOhQW", "bAMXu");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[320]] = lIlIIlllIIlIlll("DB47DgIb", "oqVlc");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[321]] = lIlIIlllIIlIlIl("w21p5fv2sZIq3ROLeBscyQ==", "UGOXx");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[322]] = lIlIIlllIIlIllI("Wb91eb8q9TITCgrJQtCYDg==", "njuwv");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[323]] = lIlIIlllIIlIlll("Ci8KCzM=", "mCeyJ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[324]] = lIlIIlllIIlIlIl("rmdRacXgMsg=", "UuzYy");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[325]] = lIlIIlllIIlIllI("sUzeNZ7RxWI=", "UdbGn");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[326]] = lIlIIlllIIlIllI("Z9RXZ6syRNQ=", "LCXFe");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[327]] = lIlIIlllIIlIlll("BRYnGS1rHiEDIQ==", "FzNtO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[328]] = lIlIIlllIIlIllI("CgElNBOglU0=", "MvxNO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[329]] = lIlIIlllIIlIllI("MLGiycTEW2WxJZn1YjGB6Q==", "HFFAK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[330]] = lIlIIlllIIlIlll("GiAhBhAk", "VAEbu");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[331]] = lIlIIlllIIlIlll("KSAHHgoOJAw=", "zKbro");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[332]] = lIlIIlllIIlIlIl("NJzXH+n49FU=", "gUith");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[333]] = lIlIIlllIIlIlll("LCQ7Jzg=", "kLTTL");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[334]] = lIlIIlllIIlIlIl("OLv4LwD64XI=", "ShabF");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[335]] = lIlIIlllIIlIllI("W7OMPCwgc6s=", "wIBCL");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[336]] = lIlIIlllIIlIlll("MyQWBTcs", "DAwiC");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[337]] = lIlIIlllIIlIlIl("zITcTbcj/Nc=", "gyUSZ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[338]] = lIlIIlllIIlIlll("BBk4GC8=", "cuWjV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[339]] = lIlIIlllIIlIllI("SUh9uQlRWsg=", "YiMer");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[340]] = lIlIIlllIIlIllI("j/kPEnvPKBY=", "NRxdK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[349]] = lIlIIlllIIlIllI("JeqbgkxMsJvVi9FAl983d8N4cLwf7/xV", "tTKFO");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[350]] = lIlIIlllIIlIllI("1JVkvNnP1bk=", "gLUGV");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[351]] = lIlIIlllIIlIllI("ttmMMrHtm7KLrxEIIaggLEo5in8kC5S/dc3lXAOsDs/InIKsSstpGg==", "BMTAL");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[352]] = lIlIIlllIIlIllI("NIB2jBjogyQ1EE4ddvkBYx8vSFiHABWEUIl2uz4B2s6q4BccGrGKD/gwIXbBTzUr4hKnyIuL4XU=", "fLsef");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[353]] = lIlIIlllIIlIlIl("Z/nyFXcGTr3aYgUR5jrspjUU71BHsuu4sSs5PkaUiFexSfGUQymHYKUI//TM2NPZ", "YEDok");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[354]] = lIlIIlllIIlIllI("q80YvWDmZqRfjR4fSXu7fQ3S9zhZpJjJwqDytHRQ0UI=", "xSYZE");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[355]] = lIlIIlllIIlIlll("HnEHBz08NBdGJThxPBw4NjIbSH95", "WQsfQ");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[356]] = lIlIIlllIIlIllI("cuCjAQ4MYCg1IG1+MDd2I9tjqHVklIdldxFv5hpTJYyCz/QbZk8qUA==", "ATIeY");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[357]] = lIlIIlllIIlIllI("ujDDiYsuyQ2YBTeEL6jZOJs4uCs4Ucbh6D9/MUCLwWrE+4jH7sHtWRCLhZBYt8aRRaUj7Lathtk=", "pwdme");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[358]] = lIlIIlllIIlIllI("GqdBLceI1lJxKWx1uWtcKjjeT3OYvuSiD4luTBR3bK80msq5iEU47OSbr6521Lmy3kiiIeK90n4=", "NzLZX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[359]] = lIlIIlllIIlIlIl("y3aQUTXM/wwibmD5IYOYwvSp1GkWH/VBtCwOx7dDPU+qvQnkEBIUdXRmpgjCVRfx", "jJeUK");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[360]] = lIlIIlllIIlIlll("JCgcGQYNME4ECQAqQlBQVWheQFFFLRpQCBZq", "eDnpa");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[361]] = lIlIIlllIIlIlll("BXAiciUlPCNyPSN3JCcwbD8jIGc=", "LWFRI");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[362]] = lIlIIlllIIlIlIl("1MWb1KnwyI5ue3HnRj1RlWboMRPZUu2N", "leyYX");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[363]] = lIlIIlllIIlIlIl("S2p2/DM5XSfu8xfp31CarCA012L6E0EpMp4YTtSrx8gqEaQLIVzfGgkaZQcp1byx", "NRUVd");
        lIIlIIIIIlIIl[lIIlIIIIlIlll[364]] = lIlIIlllIIlIlll("CDQeWEY9NBlTFXE2AlU=", "QQmtf");
    }

    static {
        lIlIIllllllIllI();
        lIlIIllllllIlIl();
        fL = new WorldPoint(lIIlIIIIlIlll[341], lIIlIIIIlIlll[342], lIIlIIIIlIlll[0]);
        fM = new WorldPoint(lIIlIIIIlIlll[343], lIIlIIIIlIlll[344], lIIlIIIIlIlll[0]);
        fN = new WorldPoint(lIIlIIIIlIlll[345], lIIlIIIIlIlll[346], lIIlIIIIlIlll[1]);
        fO = new WorldPoint(lIIlIIIIlIlll[347], lIIlIIIIlIlll[348], lIIlIIIIlIlll[0]);
        bA = new ArrayList();
        String[] strArr = new String[lIIlIIIIlIlll[43]];
        strArr[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[349]];
        strArr[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[350]];
        strArr[lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[351]];
        strArr[lIIlIIIIlIlll[7]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[352]];
        strArr[lIIlIIIIlIlll[9]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[353]];
        strArr[lIIlIIIIlIlll[11]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[354]];
        strArr[lIIlIIIIlIlll[12]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[355]];
        strArr[lIIlIIIIlIlll[13]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[356]];
        strArr[lIIlIIIIlIlll[16]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[357]];
        strArr[lIIlIIIIlIlll[17]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[358]];
        strArr[lIIlIIIIlIlll[23]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[359]];
        strArr[lIIlIIIIlIlll[26]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[360]];
        strArr[lIIlIIIIlIlll[28]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[361]];
        strArr[lIIlIIIIlIlll[38]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[362]];
        strArr[lIIlIIIIlIlll[40]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[363]];
        strArr[lIIlIIIIlIlll[20]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[364]];
        bW = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[63]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028a, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[25]) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a0, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[23]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0526, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[23]) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05ea, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[20]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[7]) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0674, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[20]) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        int[] iArr17;
        int[] iArr18 = new int[lIIlIIIIlIlll[1]];
        iArr18[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
        if (lIlIIlllllllIII(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIIlIIIIlIlll[1]];
            iArr19[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
            if (lIlIIlllllllIII(Bank.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIIIIlIlll[1]];
                iArr20[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
            }
            iArr = new int[lIIlIIIIlIlll[1]];
            iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
            if (lIlIIlllllllIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlIIIIlIlll[1]];
                iArr21[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                if (lIlIIlllllllIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlIIIIlIlll[1]];
                    iArr22[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                }
                iArr2 = new int[lIIlIIIIlIlll[1]];
                iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[39];
                if (lIlIIlllllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    bA.add(new C0003d(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1], lIIlIIIIlIlll[310]));
                    "".length();
                }
                iArr3 = new int[lIIlIIIIlIlll[1]];
                iArr3[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[41];
                if (lIlIIlllllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    bA.add(new C0003d(lIIlIIIIlIlll[41], lIIlIIIIlIlll[1], lIIlIIIIlIlll[311]));
                    "".length();
                }
                iArr4 = new int[lIIlIIIIlIlll[1]];
                iArr4[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                if (lIlIIlllllllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    bA.add(new C0003d(lIIlIIIIlIlll[44], lIIlIIIIlIlll[1], lIIlIIIIlIlll[312]));
                    "".length();
                }
                iArr5 = new int[lIIlIIIIlIlll[1]];
                iArr5[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[42];
                if (lIlIIlllllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                    bA.add(new C0003d(lIIlIIIIlIlll[42], lIIlIIIIlIlll[7], lIIlIIIIlIlll[310]));
                    "".length();
                }
                iArr6 = new int[lIIlIIIIlIlll[1]];
                iArr6[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                if (lIlIIlllllllIII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr23 = new int[lIIlIIIIlIlll[1]];
                    iArr23[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                    if (lIlIIlllllllIII(Bank.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[lIIlIIIIlIlll[1]];
                        iArr24[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                    }
                    iArr7 = new int[lIIlIIIIlIlll[1]];
                    iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (lIlIIlllllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr8 = new int[lIIlIIIIlIlll[1]];
                    iArr8[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
                    if (lIlIIlllllllIlI(Bank.contains(iArr8) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[34], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr9 = new int[lIIlIIIIlIlll[1]];
                    iArr9[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
                    if (lIlIIlllllllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[33], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr10 = new int[lIIlIIIIlIlll[1]];
                    iArr10[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
                    if (lIlIIlllllllIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[32], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr11 = new int[lIIlIIIIlIlll[1]];
                    iArr11[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
                    if (lIlIIlllllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[30], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr12 = new int[lIIlIIIIlIlll[1]];
                    iArr12[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
                    if (lIlIIlllllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                        bA.add(new C0003d(lIIlIIIIlIlll[31], lIIlIIIIlIlll[1], C0007h.bv));
                        "".length();
                    }
                    iArr13 = new int[lIIlIIIIlIlll[1]];
                    iArr13[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                    if (lIlIIlllllllIII(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr25 = new int[lIIlIIIIlIlll[1]];
                        iArr25[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                        if (lIlIIlllllllIII(Bank.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[lIIlIIIIlIlll[1]];
                            iArr26[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                        }
                        iArr14 = new int[lIIlIIIIlIlll[1]];
                        iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                        if (lIlIIlllllllIII(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr27 = new int[lIIlIIIIlIlll[1]];
                            iArr27[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                            if (lIlIIlllllllIII(Bank.contains(iArr27) ? 1 : 0)) {
                                int[] iArr28 = new int[lIIlIIIIlIlll[1]];
                                iArr28[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                            }
                            if (lIlIIlllllllIlI(Bank.contains(item -> {
                                return item.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
                            }) ? 1 : 0)) {
                                bA.add(new C0003d(lIIlIIIIlIlll[313], lIIlIIIIlIlll[11], lIIlIIIIlIlll[311]));
                                "".length();
                            }
                            iArr15 = new int[lIIlIIIIlIlll[1]];
                            iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                            if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr29 = new int[lIIlIIIIlIlll[1]];
                                iArr29[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                if (lIlIIlllllllIII(Bank.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[lIIlIIIIlIlll[1]];
                                    iArr30[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                                }
                                iArr16 = new int[lIIlIIIIlIlll[1]];
                                iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                                if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
                                    int[] iArr31 = new int[lIIlIIIIlIlll[1]];
                                    iArr31[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                                    if (lIlIIlllllllIII(Bank.contains(iArr31) ? 1 : 0)) {
                                        int[] iArr32 = new int[lIIlIIIIlIlll[1]];
                                        iArr32[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                                    }
                                    iArr17 = new int[lIIlIIIIlIlll[1]];
                                    iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                    if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                                        int[] iArr33 = new int[lIIlIIIIlIlll[1]];
                                        iArr33[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                        if (!lIlIIlllllllIII(Bank.contains(iArr33) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr34 = new int[lIIlIIIIlIlll[1]];
                                        iArr34[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                        if (!lIlIIlllllllIIl(Bank.getFirst(iArr34).getQuantity(), lIIlIIIIlIlll[20])) {
                                            return;
                                        }
                                    }
                                    bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                                    "".length();
                                }
                                bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                                "".length();
                                iArr17 = new int[lIIlIIIIlIlll[1]];
                                iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                                if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                                }
                                bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                                "".length();
                            }
                            bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                            "".length();
                            iArr16 = new int[lIIlIIIIlIlll[1]];
                            iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                            if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
                            }
                            bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                            "".length();
                            iArr17 = new int[lIIlIIIIlIlll[1]];
                            iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                            if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                            }
                            bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                            "".length();
                        }
                        bA.add(new C0003d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]));
                        "".length();
                        if (lIlIIlllllllIlI(Bank.contains(item2 -> {
                            return item2.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
                        }) ? 1 : 0)) {
                        }
                        iArr15 = new int[lIIlIIIIlIlll[1]];
                        iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                        "".length();
                        iArr16 = new int[lIIlIIIIlIlll[1]];
                        iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
                        }
                        bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                        "".length();
                        iArr17 = new int[lIIlIIIIlIlll[1]];
                        iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                        if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                        }
                        bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                        "".length();
                    }
                    bA.add(new C0003d(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], C0007h.bv));
                    "".length();
                    iArr14 = new int[lIIlIIIIlIlll[1]];
                    iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                    if (lIlIIlllllllIII(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]));
                    "".length();
                    if (lIlIIlllllllIlI(Bank.contains(item22 -> {
                        return item22.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
                    }) ? 1 : 0)) {
                    }
                    iArr15 = new int[lIIlIIIIlIlll[1]];
                    iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                    if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                    "".length();
                    iArr16 = new int[lIIlIIIIlIlll[1]];
                    iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                    if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                    "".length();
                    iArr17 = new int[lIIlIIIIlIlll[1]];
                    iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                    if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                    "".length();
                }
                bA.add(new C0003d(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25], lIIlIIIIlIlll[309]));
                "".length();
                iArr7 = new int[lIIlIIIIlIlll[1]];
                iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (lIlIIlllllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lIIlIIIIlIlll[1]];
                iArr8[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
                if (lIlIIlllllllIlI(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIIlIIIIlIlll[1]];
                iArr9[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
                if (lIlIIlllllllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIIlIIIIlIlll[1]];
                iArr10[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
                if (lIlIIlllllllIlI(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIIlIIIIlIlll[1]];
                iArr11[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
                if (lIlIIlllllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lIIlIIIIlIlll[1]];
                iArr12[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
                if (lIlIIlllllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[lIIlIIIIlIlll[1]];
                iArr13[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
                if (lIlIIlllllllIII(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], C0007h.bv));
                "".length();
                iArr14 = new int[lIIlIIIIlIlll[1]];
                iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
                if (lIlIIlllllllIII(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]));
                "".length();
                if (lIlIIlllllllIlI(Bank.contains(item222 -> {
                    return item222.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
                }) ? 1 : 0)) {
                }
                iArr15 = new int[lIIlIIIIlIlll[1]];
                iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                "".length();
                iArr16 = new int[lIIlIIIIlIlll[1]];
                iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                "".length();
                iArr17 = new int[lIIlIIIIlIlll[1]];
                iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
                "".length();
            }
            bA.add(new C0003d(lIIlIIIIlIlll[35], lIIlIIIIlIlll[63], lIIlIIIIlIlll[309]));
            "".length();
            iArr2 = new int[lIIlIIIIlIlll[1]];
            iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[39];
            if (lIlIIlllllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIlIIIIlIlll[1]];
            iArr3[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[41];
            if (lIlIIlllllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIIlIIIIlIlll[1]];
            iArr4[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
            if (lIlIIlllllllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIlIIIIlIlll[1]];
            iArr5[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[42];
            if (lIlIIlllllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIlIIIIlIlll[1]];
            iArr6[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
            if (lIlIIlllllllIII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25], lIIlIIIIlIlll[309]));
            "".length();
            iArr7 = new int[lIIlIIIIlIlll[1]];
            iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
            if (lIlIIlllllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIIlIIIIlIlll[1]];
            iArr8[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
            if (lIlIIlllllllIlI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIIlIIIIlIlll[1]];
            iArr9[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
            if (lIlIIlllllllIlI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIIlIIIIlIlll[1]];
            iArr10[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
            if (lIlIIlllllllIlI(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIIlIIIIlIlll[1]];
            iArr11[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
            if (lIlIIlllllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lIIlIIIIlIlll[1]];
            iArr12[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
            if (lIlIIlllllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[lIIlIIIIlIlll[1]];
            iArr13[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
            if (lIlIIlllllllIII(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], C0007h.bv));
            "".length();
            iArr14 = new int[lIIlIIIIlIlll[1]];
            iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
            if (lIlIIlllllllIII(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]));
            "".length();
            if (lIlIIlllllllIlI(Bank.contains(item2222 -> {
                return item2222.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
            }) ? 1 : 0)) {
            }
            iArr15 = new int[lIIlIIIIlIlll[1]];
            iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
            if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
            "".length();
            iArr16 = new int[lIIlIIIIlIlll[1]];
            iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
            if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
            "".length();
            iArr17 = new int[lIIlIIIIlIlll[1]];
            iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
            if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
            "".length();
        }
        bA.add(new C0003d(lIIlIIIIlIlll[27], lIIlIIIIlIlll[7], lIIlIIIIlIlll[309]));
        "".length();
        iArr = new int[lIIlIIIIlIlll[1]];
        iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
        if (lIlIIlllllllIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[35], lIIlIIIIlIlll[63], lIIlIIIIlIlll[309]));
        "".length();
        iArr2 = new int[lIIlIIIIlIlll[1]];
        iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[39];
        if (lIlIIlllllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIIIIlIlll[1]];
        iArr3[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[41];
        if (lIlIIlllllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIIIIlIlll[1]];
        iArr4[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
        if (lIlIIlllllllIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIIIIlIlll[1]];
        iArr5[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[42];
        if (lIlIIlllllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIIIIlIlll[1]];
        iArr6[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
        if (lIlIIlllllllIII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[24], lIIlIIIIlIlll[25], lIIlIIIIlIlll[309]));
        "".length();
        iArr7 = new int[lIIlIIIIlIlll[1]];
        iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
        if (lIlIIlllllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIIlIIIIlIlll[1]];
        iArr8[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[34];
        if (lIlIIlllllllIlI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIlIIIIlIlll[1]];
        iArr9[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[33];
        if (lIlIIlllllllIlI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIIlIIIIlIlll[1]];
        iArr10[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[32];
        if (lIlIIlllllllIlI(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIIlIIIIlIlll[1]];
        iArr11[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[30];
        if (lIlIIlllllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lIIlIIIIlIlll[1]];
        iArr12[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[31];
        if (lIlIIlllllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[lIIlIIIIlIlll[1]];
        iArr13[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[37];
        if (lIlIIlllllllIII(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[37], lIIlIIIIlIlll[23], C0007h.bv));
        "".length();
        iArr14 = new int[lIIlIIIIlIlll[1]];
        iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[45];
        if (lIlIIlllllllIII(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[45], lIIlIIIIlIlll[23], lIIlIIIIlIlll[47]));
        "".length();
        if (lIlIIlllllllIlI(Bank.contains(item22222 -> {
            return item22222.getName().toLowerCase().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[316]]);
        }) ? 1 : 0)) {
        }
        iArr15 = new int[lIIlIIIIlIlll[1]];
        iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
        if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[19], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
        "".length();
        iArr16 = new int[lIIlIIIIlIlll[1]];
        iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
        if (lIlIIlllllllIII(Bank.contains(iArr16) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[22], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
        "".length();
        iArr17 = new int[lIIlIIIIlIlll[1]];
        iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
        if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIlll[21], lIIlIIIIlIlll[10], lIIlIIIIlIlll[314]));
        "".length();
    }

    private static void bq() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[301]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lIIlIIIIlIlll[2]);
            "".length();
        }
        if (lIlIIlllllllllI(nearest) && lIlIIlllllllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[302]];
            if (lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIlIIIIlIlll[18]);
                "".length();
            }
            if (lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllllllllII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIlIIIIlIlll[9]);
                    "".length();
                }
                C0000a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                C0000a.b(C0005f.ba, lIIlIIIIlIlll[2]);
                C0000a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[9]);
                C0000a.a(lIIlIIIIlIlll[41], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1]);
                C0000a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                int[] iArr = new int[lIIlIIIIlIlll[1]];
                iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (lIlIIlllllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIlIlll[1]];
                    iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    if (lIlIIlllllllIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1], Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw(lIIlIIIIlIlll[35], Inventory.getFreeSlots() - lIIlIIIIlIlll[1], Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean lIlIIlllllllIIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x099b, code lost:
        if (lIlIIlllllllIlI(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.fS ? 1 : 0) != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b2f, code lost:
        if (lIlIIlllllllIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0325, code lost:
        if (lIlIIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[20]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0368, code lost:
        if (lIlIIllllllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[20]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ab, code lost:
        if (lIlIIlllllllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[20]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03ae, code lost:
        W();
        java.lang.System.out.println(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIIlIIl[i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[23]]);
        i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.by = i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.w.lIIlIIIIlIlll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c9, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1299  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x12c4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x132f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x139a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1406  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1488  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x14fd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1543  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x156c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x15a6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x1607  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x168a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x16b2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x16e7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x17c7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1804  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x18cf  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x19b9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1a61  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1a95  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1b15  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1ba1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1c42  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1d01  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1d35  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1d84  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1dcd  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x2079  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x20d5  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x2192  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x2875  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x28ac  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x28f3  */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1760, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1769, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1778, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1793, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1836, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1838, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1840, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1842, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1844, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1846, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1848, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1857, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v590, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v598, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bp() {
        int[] iArr;
        String[] strArr;
        WorldArea worldArea;
        WorldArea worldArea2;
        TileObject nearest;
        int[] iArr2;
        int[] iArr3;
        WorldArea worldArea3;
        int[] iArr4;
        WorldPoint worldPoint;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        TileObject nearest2;
        WorldPoint worldPoint2;
        WorldPoint worldPoint3;
        WorldPoint worldPoint4;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        TileObject nearest3;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        if (lIlIIlllllllIII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[0]];
            C0001b.a(bA);
            if (lIlIIlllllllIIl(bA.size(), lIIlIIIIlIlll[1])) {
                System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[1]]);
                by = lIIlIIIIlIlll[0];
            }
        }
        if (lIlIIlllllllIlI(by ? 1 : 0)) {
            String[] strArr11 = new String[lIIlIIIIlIlll[1]];
            strArr11[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[2]];
            if (lIlIIlllllllIII(Inventory.contains(strArr11) ? 1 : 0)) {
                fS = lIIlIIIIlIlll[1];
                fR = lIIlIIIIlIlll[1];
                fP = lIIlIIIIlIlll[1];
                fQ = lIIlIIIIlIlll[1];
            }
            int[] iArr8 = new int[lIIlIIIIlIlll[1]];
            iArr8[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
            if (lIlIIlllllllIII(Inventory.contains(iArr8) ? 1 : 0)) {
                fR = lIIlIIIIlIlll[1];
            }
            int[] iArr9 = new int[lIIlIIIIlIlll[1]];
            iArr9[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[4];
            if (lIlIIlllllllIII(Inventory.contains(iArr9) ? 1 : 0)) {
                fP = lIIlIIIIlIlll[1];
            }
            int[] iArr10 = new int[lIIlIIIIlIlll[1]];
            iArr10[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
            if (lIlIIlllllllIII(Inventory.contains(iArr10) ? 1 : 0)) {
                fQ = lIIlIIIIlIlll[1];
            }
            if (lIlIIlllllllIII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlllllllIIl(Movement.getRunEnergy(), lIIlIIIIlIlll[6])) {
                Inventory.getFirst(C0005f.ba).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[7]]);
                Time.sleepTicks(lIIlIIIIlIlll[1]);
                "".length();
            }
            if (lIlIIlllllllIII(Inventory.contains(C0005f.aX) ? 1 : 0) && lIlIIlllllllIIl(Prayers.getPoints(), lIIlIIIIlIlll[8])) {
                Inventory.getFirst(C0005f.aX).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[9]]);
            }
            if (!lIlIIlllllllIIl(Combat.getMissingHealth(), lIIlIIIIlIlll[10]) || lIlIIlllllllIll(lIlIIllllllIlll(C0004e.v(), 51.0d))) {
                String[] strArr12 = new String[lIIlIIIIlIlll[1]];
                strArr12[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[11]];
                if (lIlIIlllllllIII(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[lIIlIIIIlIlll[1]];
                    strArr13[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[12]];
                    Inventory.getFirst(strArr13).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[13]]);
                }
            }
            if (lIlIIlllllllIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIIllllllllII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlllllllIlI(S() ? 1 : 0) && lIlIIlllllllIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[2]) && lIlIIllllllllIl(C0004e.I(), lIIlIIIIlIlll[15])) {
                BankLocation nearest4 = BankLocation.getNearest();
                if (lIlIIlllllllllI(nearest4) && lIlIIlllllllIlI(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[16]];
                    Movement.walkTo(nearest4);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                    "".length();
                }
                if (lIlIIlllllllllI(nearest4) && lIlIIlllllllIII(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[17]];
                    if (lIlIIlllllllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIlIlll[18]);
                        "".length();
                    }
                    if (lIlIIlllllllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIllllllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIlIlll[9]);
                            "".length();
                        }
                        if (lIlIIllllllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIlIlll[2]);
                            "".length();
                        }
                        int[] iArr11 = new int[lIIlIIIIlIlll[1]];
                        iArr11[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        if (lIlIIlllllllIII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlIIIIlIlll[1]];
                            iArr12[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        }
                        int[] iArr13 = new int[lIIlIIIIlIlll[1]];
                        iArr13[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                        if (lIlIIlllllllIII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIIlIIIIlIlll[1]];
                            iArr14[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                        }
                        int[] iArr15 = new int[lIIlIIIIlIlll[1]];
                        iArr15[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        if (lIlIIlllllllIII(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIlIIIIlIlll[1]];
                            iArr16[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[22];
                        }
                        int[] iArr17 = new int[lIIlIIIIlIlll[1]];
                        iArr17[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                        if (lIlIIlllllllIII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIlIIIIlIlll[1]];
                            iArr18[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[24];
                            if (lIlIIlllllllIIl(Bank.getFirst(iArr18).getQuantity(), lIIlIIIIlIlll[25])) {
                                W();
                                System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[26]]);
                                by = lIIlIIIIlIlll[1];
                                return;
                            }
                        }
                        int[] iArr19 = new int[lIIlIIIIlIlll[1]];
                        iArr19[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                        if (lIlIIlllllllIII(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[lIIlIIIIlIlll[1]];
                            iArr20[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[27];
                            if (lIlIIlllllllIIl(Bank.getFirst(iArr20).getQuantity(), lIIlIIIIlIlll[7])) {
                                W();
                                System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[28]]);
                                by = lIIlIIIIlIlll[1];
                                return;
                            }
                        }
                        int[] iArr21 = new int[lIIlIIIIlIlll[29]];
                        iArr21[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        iArr21[lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[22];
                        iArr21[lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[21];
                        iArr21[lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[30];
                        iArr21[lIIlIIIIlIlll[9]] = lIIlIIIIlIlll[31];
                        iArr21[lIIlIIIIlIlll[11]] = lIIlIIIIlIlll[32];
                        iArr21[lIIlIIIIlIlll[12]] = lIIlIIIIlIlll[33];
                        iArr21[lIIlIIIIlIlll[13]] = lIIlIIIIlIlll[34];
                        iArr21[lIIlIIIIlIlll[16]] = lIIlIIIIlIlll[35];
                        iArr21[lIIlIIIIlIlll[17]] = lIIlIIIIlIlll[36];
                        iArr21[lIIlIIIIlIlll[23]] = lIIlIIIIlIlll[24];
                        iArr21[lIIlIIIIlIlll[26]] = lIIlIIIIlIlll[27];
                        iArr21[lIIlIIIIlIlll[28]] = lIIlIIIIlIlll[37];
                        iArr21[lIIlIIIIlIlll[38]] = lIIlIIIIlIlll[39];
                        iArr21[lIIlIIIIlIlll[40]] = lIIlIIIIlIlll[41];
                        iArr21[lIIlIIIIlIlll[20]] = lIIlIIIIlIlll[42];
                        iArr21[lIIlIIIIlIlll[43]] = lIIlIIIIlIlll[44];
                        if (lIlIIlllllllIlI(C0004e.b(iArr21) ? 1 : 0)) {
                            W();
                            System.out.println(lIIlIIIIIlIIl[lIIlIIIIlIlll[38]]);
                            by = lIIlIIIIlIlll[1];
                            return;
                        }
                        int[] iArr22 = new int[lIIlIIIIlIlll[29]];
                        iArr22[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        iArr22[lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[22];
                        iArr22[lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[21];
                        iArr22[lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[30];
                        iArr22[lIIlIIIIlIlll[9]] = lIIlIIIIlIlll[31];
                        iArr22[lIIlIIIIlIlll[11]] = lIIlIIIIlIlll[32];
                        iArr22[lIIlIIIIlIlll[12]] = lIIlIIIIlIlll[33];
                        iArr22[lIIlIIIIlIlll[13]] = lIIlIIIIlIlll[34];
                        iArr22[lIIlIIIIlIlll[16]] = lIIlIIIIlIlll[35];
                        iArr22[lIIlIIIIlIlll[17]] = lIIlIIIIlIlll[36];
                        iArr22[lIIlIIIIlIlll[23]] = lIIlIIIIlIlll[24];
                        iArr22[lIIlIIIIlIlll[26]] = lIIlIIIIlIlll[27];
                        iArr22[lIIlIIIIlIlll[28]] = lIIlIIIIlIlll[37];
                        iArr22[lIIlIIIIlIlll[38]] = lIIlIIIIlIlll[39];
                        iArr22[lIIlIIIIlIlll[40]] = lIIlIIIIlIlll[41];
                        iArr22[lIIlIIIIlIlll[20]] = lIIlIIIIlIlll[42];
                        iArr22[lIIlIIIIlIlll[43]] = lIIlIIIIlIlll[44];
                        if (lIlIIlllllllIII(C0004e.b(iArr22) ? 1 : 0)) {
                            C0000a.a(lIIlIIIIlIlll[19], lIIlIIIIlIlll[11]);
                            C0000a.a(lIIlIIIIlIlll[22], lIIlIIIIlIlll[11]);
                            C0000a.a(lIIlIIIIlIlll[21], lIIlIIIIlIlll[11]);
                            C0000a.b(C0005f.ba, lIIlIIIIlIlll[11]);
                            C0000a.a(lIIlIIIIlIlll[35], lIIlIIIIlIlll[13]);
                            C0000a.b(C0005f.bk, lIIlIIIIlIlll[1]);
                            C0000a.a(lIIlIIIIlIlll[42], lIIlIIIIlIlll[1]);
                            C0000a.a(lIIlIIIIlIlll[44], lIIlIIIIlIlll[1]);
                            C0000a.a(lIIlIIIIlIlll[39], lIIlIIIIlIlll[1]);
                            C0000a.a(lIIlIIIIlIlll[36], lIIlIIIIlIlll[1]);
                            C0000a.a(lIIlIIIIlIlll[45], lIIlIIIIlIlll[2]);
                            C0000a.a(lIIlIIIIlIlll[46], lIIlIIIIlIlll[47]);
                        }
                    }
                }
            }
            if (lIlIIlllllllIII(S() ? 1 : 0) && lIlIIlllllllIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[1])) {
                if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[40]];
                    Movement.walkTo(fL);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIlll[1]);
                    "".length();
                }
                if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[20]];
                    C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[43]], bW, lIIlIIIIlIlll[1]);
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[1]) && lIlIIlllllllIII(S() ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIlIIIIlIlll[16])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[29]];
                    Movement.walkTo(worldPoint5);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIlll[1]);
                    "".length();
                }
                if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIlIIIIlIlll[16])) {
                    C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[50]], bW, lIIlIIIIlIlll[1]);
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[2])) {
                co = lIIlIIIIlIlll[0];
                int[] iArr23 = new int[lIIlIIIIlIlll[1]];
                iArr23[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                if (lIlIIlllllllIII(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIIlIIIIlIlll[1]];
                    iArr24[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[44];
                    if (lIlIIlllllllIlI(Equipment.contains(iArr24) ? 1 : 0)) {
                        String[] strArr14 = new String[lIIlIIIIlIlll[1]];
                        strArr14[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[51]];
                        Inventory.getFirst(strArr14).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[10]]);
                    }
                }
                if (lIlIIlllllllIII(Inventory.contains(item -> {
                    return item.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[340]]);
                }) ? 1 : 0) && lIlIIlllllllIlI(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[339]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[338]]);
                    }).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[52]]);
                }
                if (lIlIIlllllllIII(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[337]]);
                }) ? 1 : 0) && lIlIIlllllllIlI(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[336]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[335]]);
                    }).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[53]]);
                }
                if (lIlIlIIIIIIIIlI(Vars.getBit(lIIlIIIIlIlll[54]), lIIlIIIIlIlll[1])) {
                    String[] strArr15 = new String[lIIlIIIIlIlll[1]];
                    strArr15[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[55]];
                    if (lIlIIlllllllIlI(Inventory.contains(strArr15) ? 1 : 0)) {
                    }
                    if (((lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[54])) && lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[67])) && !lIlIIlllllllIII(Vars.getBit(lIIlIIIIlIlll[62]))) || lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[72]), lIIlIIIIlIlll[20])) && lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[73]))) {
                        strArr10 = new String[lIIlIIIIlIlll[1]];
                        strArr10[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[74]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr10) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(lIIlIIIIlIlll[75], lIIlIIIIlIlll[76], lIIlIIIIlIlll[0]);
                            String[] strArr16 = new String[lIIlIIIIlIlll[1]];
                            strArr16[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[77]];
                            if (lIlIlIIIIIIIIll(NPCs.getNearest(strArr16))) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[78]];
                                Movement.walkTo(worldPoint6);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                            String[] strArr17 = new String[lIIlIIIIlIlll[1]];
                            strArr17[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[79]];
                            if (lIlIIlllllllllI(NPCs.getNearest(strArr17))) {
                                C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[80]], bW);
                            }
                        }
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[73]), lIIlIIIIlIlll[1]) && (!lIlIIlllllllIII(Vars.getBit(lIIlIIIIlIlll[81])) || lIlIIlllllllIlI(fP ? 1 : 0))) {
                        strArr8 = new String[lIIlIIIIlIlll[1]];
                        strArr8[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[82]];
                        if (lIlIIlllllllIlI(Inventory.contains(strArr8) ? 1 : 0) && lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[83]))) {
                            bs();
                        }
                        strArr9 = new String[lIIlIIIIlIlll[1]];
                        strArr9[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[84]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr9) ? 1 : 0)) {
                            WorldPoint worldPoint7 = new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0]);
                            if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIlIIIIlIlll[9]) && lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[81]))) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[87]];
                                if (lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(worldPoint7);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                            if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIIlIIIIlIlll[23])) {
                                if (lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[81]))) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[88]];
                                    String[] strArr18 = new String[lIIlIIIIlIlll[1]];
                                    strArr18[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[89]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[lIIlIIIIlIlll[1]];
                                        strArr19[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[90]];
                                        Item first = Inventory.getFirst(strArr19);
                                        String[] strArr20 = new String[lIIlIIIIlIlll[1]];
                                        strArr20[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[91]];
                                        first.useOn(TileObjects.getNearest(strArr20));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr21 = new String[lIIlIIIIlIlll[1]];
                                    strArr21[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[6]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr21) ? 1 : 0)) {
                                        String[] strArr22 = new String[lIIlIIIIlIlll[1]];
                                        strArr22[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[92]];
                                        Item first2 = Inventory.getFirst(strArr22);
                                        String[] strArr23 = new String[lIIlIIIIlIlll[1]];
                                        strArr23[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[93]];
                                        first2.useOn(TileObjects.getNearest(strArr23));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr24 = new String[lIIlIIIIlIlll[1]];
                                    strArr24[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[94]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr24) ? 1 : 0)) {
                                        String[] strArr25 = new String[lIIlIIIIlIlll[1]];
                                        strArr25[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[95]];
                                        Item first3 = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[lIIlIIIIlIlll[1]];
                                        strArr26[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[96]];
                                        first3.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[lIIlIIIIlIlll[1]];
                                    strArr27[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[97]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr27) ? 1 : 0)) {
                                        String[] strArr28 = new String[lIIlIIIIlIlll[1]];
                                        strArr28[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[98]];
                                        Item first4 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[lIIlIIIIlIlll[1]];
                                        strArr29[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[99]];
                                        first4.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                }
                                if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1])) {
                                    String[] strArr30 = new String[lIIlIIIIlIlll[1]];
                                    strArr30[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[100]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr30) ? 1 : 0)) {
                                        String[] strArr31 = new String[lIIlIIIIlIlll[1]];
                                        strArr31[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[101]];
                                        Item first5 = Inventory.getFirst(strArr31);
                                        String[] strArr32 = new String[lIIlIIIIlIlll[1]];
                                        strArr32[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[102]];
                                        first5.useOn(TileObjects.getNearest(strArr32));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr33 = new String[lIIlIIIIlIlll[1]];
                                    strArr33[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[103]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr33) ? 1 : 0)) {
                                        String[] strArr34 = new String[lIIlIIIIlIlll[1]];
                                        strArr34[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[104]];
                                        Item first6 = Inventory.getFirst(strArr34);
                                        String[] strArr35 = new String[lIIlIIIIlIlll[1]];
                                        strArr35[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[105]];
                                        first6.useOn(TileObjects.getNearest(strArr35));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr36 = new String[lIIlIIIIlIlll[1]];
                                    strArr36[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[106]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr36) ? 1 : 0)) {
                                        String[] strArr37 = new String[lIIlIIIIlIlll[1]];
                                        strArr37[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[107]];
                                        Item first7 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[lIIlIIIIlIlll[1]];
                                        strArr38[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[108]];
                                        first7.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[lIIlIIIIlIlll[1]];
                                    strArr39[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[109]];
                                    if (lIlIIlllllllIII(Inventory.contains(strArr39) ? 1 : 0)) {
                                        String[] strArr40 = new String[lIIlIIIIlIlll[1]];
                                        strArr40[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[110]];
                                        Item first8 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[lIIlIIIIlIlll[1]];
                                        strArr41[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[111]];
                                        first8.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[lIIlIIIIlIlll[1]];
                                    strArr42[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[112]];
                                    TileObject nearest5 = TileObjects.getNearest(strArr42);
                                    if (lIlIIlllllllllI(nearest5) && lIlIIlllllllIlI(fP ? 1 : 0)) {
                                        if (lIlIIlllllllIlI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            String[] strArr43 = new String[lIIlIIIIlIlll[1]];
                                            strArr43[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[113]];
                                            TileObjects.getNearest(strArr43).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[114]]);
                                            Time.sleepTicks(lIIlIIIIlIlll[16]);
                                            "".length();
                                        }
                                        if (lIlIIlllllllIII(Reachable.isInteractable(nearest5) ? 1 : 0) && lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr44 = new String[lIIlIIIIlIlll[1]];
                                            strArr44[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[115]];
                                            if (lIlIIlllllllIII(nearest5.hasAction(strArr44) ? 1 : 0)) {
                                                nearest5.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[116]]);
                                                Time.sleepTicks(lIIlIIIIlIlll[9]);
                                                "".length();
                                            }
                                            String[] strArr45 = new String[lIIlIIIIlIlll[1]];
                                            strArr45[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[117]];
                                            if (lIlIIlllllllIII(nearest5.hasAction(strArr45) ? 1 : 0)) {
                                                nearest5.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[118]]);
                                                Time.sleepTicks(lIIlIIIIlIlll[9]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1]) && lIlIIlllllllIlI(fP ? 1 : 0)) {
                        strArr2 = new String[lIIlIIIIlIlll[1]];
                        strArr2[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[119]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr46 = new String[lIIlIIIIlIlll[1]];
                            strArr46[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[120]];
                            Item first9 = Inventory.getFirst(strArr46);
                            String[] strArr47 = new String[lIIlIIIIlIlll[1]];
                            strArr47[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[121]];
                            first9.useOn(TileObjects.getNearest(strArr47));
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                        strArr3 = new String[lIIlIIIIlIlll[1]];
                        strArr3[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[122]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr3) ? 1 : 0)) {
                            String[] strArr48 = new String[lIIlIIIIlIlll[1]];
                            strArr48[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[123]];
                            Item first10 = Inventory.getFirst(strArr48);
                            String[] strArr49 = new String[lIIlIIIIlIlll[1]];
                            strArr49[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[124]];
                            first10.useOn(TileObjects.getNearest(strArr49));
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                        strArr4 = new String[lIIlIIIIlIlll[1]];
                        strArr4[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[125]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr4) ? 1 : 0)) {
                            String[] strArr50 = new String[lIIlIIIIlIlll[1]];
                            strArr50[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[126]];
                            Item first11 = Inventory.getFirst(strArr50);
                            String[] strArr51 = new String[lIIlIIIIlIlll[1]];
                            strArr51[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[127]];
                            first11.useOn(TileObjects.getNearest(strArr51));
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                        strArr5 = new String[lIIlIIIIlIlll[1]];
                        strArr5[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[128]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr5) ? 1 : 0)) {
                            String[] strArr52 = new String[lIIlIIIIlIlll[1]];
                            strArr52[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[129]];
                            Item first12 = Inventory.getFirst(strArr52);
                            String[] strArr53 = new String[lIIlIIIIlIlll[1]];
                            strArr53[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[130]];
                            first12.useOn(TileObjects.getNearest(strArr53));
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                        String[] strArr54 = new String[lIIlIIIIlIlll[1]];
                        strArr54[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[25]];
                        nearest3 = TileObjects.getNearest(strArr54);
                        if (lIlIIlllllllllI(nearest3) && lIlIIlllllllIlI(fP ? 1 : 0)) {
                            if (lIlIIlllllllIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                String[] strArr55 = new String[lIIlIIIIlIlll[1]];
                                strArr55[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[131]];
                                TileObjects.getNearest(strArr55).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[132]]);
                                Time.sleepTicks(lIIlIIIIlIlll[16]);
                                "".length();
                            }
                            if (lIlIIlllllllIII(Reachable.isInteractable(nearest3) ? 1 : 0) && lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                strArr6 = new String[lIIlIIIIlIlll[1]];
                                strArr6[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[133]];
                                if (lIlIIlllllllIII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                    nearest3.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[134]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[9]);
                                    "".length();
                                }
                                strArr7 = new String[lIIlIIIIlIlll[1]];
                                strArr7[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[135]];
                                if (lIlIIlllllllIII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                    nearest3.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[136]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[9]);
                                    "".length();
                                }
                            }
                        }
                    }
                    if (lIlIIlllllllIII(fP ? 1 : 0) && lIlIIlllllllIlI(fQ ? 1 : 0)) {
                        if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0])), lIIlIIIIlIlll[23])) {
                            int[] iArr25 = new int[lIIlIIIIlIlll[1]];
                            iArr25[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[21];
                            Inventory.getFirst(iArr25).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[137]]);
                            Time.sleepTicks(lIIlIIIIlIlll[16]);
                            "".length();
                        }
                        worldPoint4 = new WorldPoint(lIIlIIIIlIlll[138], lIIlIIIIlIlll[139], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[140]];
                            if (lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(worldPoint4);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                            String[] strArr56 = new String[lIIlIIIIlIlll[7]];
                            strArr56[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[141]];
                            strArr56[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[142]];
                            strArr56[lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[143]];
                            C0006g.a(strArr56);
                        }
                        if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[144]];
                            C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[145]], bW);
                        }
                    }
                    if (lIlIIlllllllIII(fP ? 1 : 0) && lIlIIlllllllIII(fQ ? 1 : 0) && lIlIIlllllllIlI(fR ? 1 : 0)) {
                        strArr = new String[lIIlIIIIlIlll[1]];
                        strArr[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[146]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr) ? 1 : 0)) {
                            String[] strArr57 = new String[lIIlIIIIlIlll[1]];
                            strArr57[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[147]];
                            Inventory.getFirst(strArr57).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[148]]);
                        }
                        WorldArea worldArea4 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[150], lIIlIIIIlIlll[51], lIIlIIIIlIlll[10], lIIlIIIIlIlll[0]);
                        worldArea = new WorldArea(lIIlIIIIlIlll[151], lIIlIIIIlIlll[152], lIIlIIIIlIlll[58], lIIlIIIIlIlll[58], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && lIlIIlllllllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            worldPoint3 = new WorldPoint(lIIlIIIIlIlll[153], lIIlIIIIlIlll[154], lIIlIIIIlIlll[0]);
                            if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIlIlll[2])) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[155]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                            if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIlIlll[2])) {
                                String[] strArr58 = new String[lIIlIIIIlIlll[1]];
                                strArr58[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[156]];
                                TileObjects.getNearest(strArr58).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[157]]);
                                Time.sleepTicks(lIIlIIIIlIlll[11]);
                                "".length();
                            }
                        }
                        worldArea2 = new WorldArea(lIIlIIIIlIlll[158], lIIlIIIIlIlll[159], lIIlIIIIlIlll[11], lIIlIIIIlIlll[16], lIIlIIIIlIlll[0]);
                        WorldArea worldArea5 = new WorldArea(lIIlIIIIlIlll[160], lIIlIIIIlIlll[161], lIIlIIIIlIlll[13], lIIlIIIIlIlll[7], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && lIlIIlllllllIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr5 = new int[lIIlIIIIlIlll[1]];
                            iArr5[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr26 = new int[lIIlIIIIlIlll[1]];
                                iArr26[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                                if (lIlIlIIIIIIIIll(TileItems.getNearest(iArr26)) && lIlIIlllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[165]];
                                    if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                        int[] iArr27 = new int[lIIlIIIIlIlll[1]];
                                        iArr27[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[166];
                                        NPCs.getNearest(iArr27).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[167]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr6 = new int[lIIlIIIIlIlll[1]];
                            iArr6[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr6))) {
                                int[] iArr28 = new int[lIIlIIIIlIlll[1]];
                                iArr28[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                                TileItems.getNearest(iArr28).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[168]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                            iArr7 = new int[lIIlIIIIlIlll[1]];
                            iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllIII(Inventory.contains(iArr7) ? 1 : 0) && lIlIIlllllllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(lIIlIIIIlIlll[169], lIIlIIIIlIlll[170], lIIlIIIIlIlll[0]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[171]];
                                    C0004e.b(worldPoint2);
                                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                                    "".length();
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    String[] strArr59 = new String[lIIlIIIIlIlll[1]];
                                    strArr59[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[172]];
                                    TileObjects.getNearest(strArr59).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[173]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIlllllllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIlllllllIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                nearest2 = TileObjects.getNearest(tileObject -> {
                                    if (lIlIIlllllllIII(tileObject.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[334]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                                        ?? r0 = lIIlIIIIlIlll[1];
                                        "".length();
                                        return " ".length() < (((117 ^ 66) ^ (126 ^ 26)) & (((13 ^ 92) ^ "  ".length()) ^ (-" ".length()))) ? ((((14 + 148) - 9) + 59) ^ (((88 + 170) - 107) + 31)) & (((2 ^ 24) ^ (211 ^ 171)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIIIIlIlll[0];
                                });
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[174]];
                                if (lIlIIlllllllllI(nearest2)) {
                                    nearest2.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[175]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1]) && lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr2 = new int[lIIlIIIIlIlll[1]];
                            iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr29 = new int[lIIlIIIIlIlll[1]];
                                iArr29[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                                if (lIlIlIIIIIIIIll(TileItems.getNearest(iArr29))) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[179]];
                                    NPC nearest6 = NPCs.getNearest(npc -> {
                                        if (lIlIIlllllllIII(npc.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[333]]) ? 1 : 0) && lIlIlIIIIIIIlII(npc.getInteracting(), Players.getLocal()) && lIlIlIIIIIIIIII(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                            ?? r0 = lIIlIIIIlIlll[1];
                                            "".length();
                                            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlIIIIlIlll[0];
                                    });
                                    if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && lIlIlIIIIIIIIll(nearest6)) {
                                        int[] iArr30 = new int[lIIlIIIIlIlll[1]];
                                        iArr30[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[180];
                                        NPCs.getNearest(iArr30).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[181]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr3 = new int[lIIlIIIIlIlll[1]];
                            iArr3[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr3))) {
                                int[] iArr31 = new int[lIIlIIIIlIlll[1]];
                                iArr31[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                                TileItems.getNearest(iArr31).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[182]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                            worldArea3 = new WorldArea(lIIlIIIIlIlll[183], lIIlIIIIlIlll[184], lIIlIIIIlIlll[12], lIIlIIIIlIlll[11], lIIlIIIIlIlll[1]);
                            iArr4 = new int[lIIlIIIIlIlll[1]];
                            iArr4[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllIII(Inventory.contains(iArr4) ? 1 : 0) && lIlIIlllllllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint = new WorldPoint(lIIlIIIIlIlll[163], lIIlIIIIlIlll[170], lIIlIIIIlIlll[1]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[185]];
                                    C0004e.b(worldPoint);
                                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                                    "".length();
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    String[] strArr60 = new String[lIIlIIIIlIlll[1]];
                                    strArr60[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[186]];
                                    TileObjects.getNearest(strArr60).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[187]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIlllllllIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest7 = TileObjects.getNearest(tileObject2 -> {
                                    if (lIlIIlllllllIII(tileObject2.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[332]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                                        ?? r0 = lIIlIIIIlIlll[1];
                                        "".length();
                                        return " ".length() == 0 ? ((((30 + 3) - (-7)) + 156) ^ (((111 + 52) - (-11)) + 19)) & (((112 ^ 60) ^ (60 ^ 117)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIIIIlIlll[0];
                                });
                                if (lIlIIlllllllllI(nearest7)) {
                                    nearest7.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[188]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[2])) {
                            int[] iArr32 = new int[lIIlIIIIlIlll[1]];
                            iArr32[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lIIlIIIIlIlll[1]];
                                iArr33[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                                if (lIlIlIIIIIIIIll(TileItems.getNearest(iArr33))) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[190]];
                                    NPC nearest8 = NPCs.getNearest(npc2 -> {
                                        if (lIlIIlllllllIII(npc2.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[331]]) ? 1 : 0) && lIlIlIIIIIIIlII(npc2.getInteracting(), Players.getLocal()) && lIlIlIIIIIIIIII(npc2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                            ?? r0 = lIIlIIIIlIlll[1];
                                            "".length();
                                            return "   ".length() == (-" ".length()) ? ((((76 + 233) - 214) + 145) ^ (((133 + 147) - 227) + 122)) & (((203 ^ 192) ^ (221 ^ 137)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIIlIlll[0];
                                    });
                                    if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && lIlIlIIIIIIIIll(nearest8)) {
                                        int[] iArr34 = new int[lIIlIIIIlIlll[1]];
                                        iArr34[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[191];
                                        NPCs.getNearest(iArr34).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[192]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr35 = new int[lIIlIIIIlIlll[1]];
                            iArr35[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr35))) {
                                int[] iArr36 = new int[lIIlIIIIlIlll[1]];
                                iArr36[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                                TileItems.getNearest(iArr36).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[193]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                            WorldArea worldArea6 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[164], lIIlIIIIlIlll[10], lIIlIIIIlIlll[38], lIIlIIIIlIlll[2]);
                            int[] iArr37 = new int[lIIlIIIIlIlll[1]];
                            iArr37[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[189];
                            if (lIlIIlllllllIII(Inventory.contains(iArr37) ? 1 : 0) && lIlIIlllllllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint8 = new WorldPoint(lIIlIIIIlIlll[194], lIIlIIIIlIlll[159], lIIlIIIIlIlll[2]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[195]];
                                    C0004e.b(worldPoint8);
                                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                                    "".length();
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    String[] strArr61 = new String[lIIlIIIIlIlll[1]];
                                    strArr61[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[196]];
                                    TileObjects.getNearest(strArr61).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[197]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIlllllllIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest9 = TileObjects.getNearest(tileObject3 -> {
                                    if (lIlIIlllllllIII(tileObject3.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[330]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                                        ?? r0 = lIIlIIIIlIlll[1];
                                        "".length();
                                        return "   ".length() < 0 ? ((((17 + 39) - (-42)) + 80) ^ (((148 + 88) - 145) + 98)) & (((111 ^ 69) ^ (149 ^ 176)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIIIIlIlll[0];
                                });
                                if (lIlIIlllllllllI(nearest9)) {
                                    nearest9.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[198]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIIIIlIlll[199], lIIlIIIIlIlll[200], lIIlIIIIlIlll[1])) ? 1 : 0)) {
                            nearest = TileObjects.getNearest(tileObject4 -> {
                                if (lIlIIlllllllIII(tileObject4.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[328]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject4) ? 1 : 0)) {
                                    String[] strArr62 = new String[lIIlIIIIlIlll[1]];
                                    strArr62[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[329]];
                                    if (lIlIIlllllllIII(tileObject4.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = lIIlIIIIlIlll[1];
                                        "".length();
                                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return lIIlIIIIlIlll[0];
                            });
                            if (lIlIIlllllllllI(nearest)) {
                                nearest.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[201]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                        }
                        if (lIlIIlllllllIII(new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            TileObject nearest10 = TileObjects.getNearest(tileObject5 -> {
                                if (lIlIIlllllllIII(tileObject5.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[326]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject5) ? 1 : 0)) {
                                    String[] strArr62 = new String[lIIlIIIIlIlll[1]];
                                    strArr62[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[327]];
                                    if (lIlIIlllllllIII(tileObject5.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = lIIlIIIIlIlll[1];
                                        "".length();
                                        return "   ".length() <= 0 ? ((41 ^ 117) ^ (215 ^ 147)) & (((((13 + 80) - (-66)) + 63) ^ (((38 + 163) - 5) + 2)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIIlIIIIlIlll[0];
                            });
                            if (lIlIIlllllllllI(nearest10)) {
                                nearest10.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[202]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                        }
                        WorldArea worldArea7 = new WorldArea(lIIlIIIIlIlll[194], lIIlIIIIlIlll[203], lIIlIIIIlIlll[43], lIIlIIIIlIlll[9], lIIlIIIIlIlll[0]);
                        WorldArea worldArea8 = new WorldArea(lIIlIIIIlIlll[204], lIIlIIIIlIlll[205], lIIlIIIIlIlll[13], lIIlIIIIlIlll[23], lIIlIIIIlIlll[0]);
                        WorldArea worldArea9 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr38 = new int[lIIlIIIIlIlll[1]];
                            iArr38[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr38) ? 1 : 0)) {
                                int[] iArr39 = new int[lIIlIIIIlIlll[1]];
                                iArr39[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                                if (lIlIlIIIIIIIIll(TileItems.getNearest(iArr39)) && lIlIIlllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[208]];
                                    NPC nearest11 = NPCs.getNearest(npc3 -> {
                                        if (lIlIIlllllllIII(npc3.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[325]]) ? 1 : 0) && lIlIlIIIIIIIlII(npc3.getInteracting(), Players.getLocal()) && lIlIlIIIIIIIIII(npc3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIIIIlIlll[1])) {
                                            ?? r0 = lIIlIIIIlIlll[1];
                                            "".length();
                                            return 0 != 0 ? ((65 ^ 43) ^ (40 ^ 32)) & (((138 ^ 149) ^ (74 ^ 55)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIIlIlll[0];
                                    });
                                    if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting()) && lIlIlIIIIIIIIll(nearest11)) {
                                        int[] iArr40 = new int[lIIlIIIIlIlll[1]];
                                        iArr40[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[209];
                                        NPCs.getNearest(iArr40).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[210]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr41 = new int[lIIlIIIIlIlll[1]];
                            iArr41[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr41))) {
                                int[] iArr42 = new int[lIIlIIIIlIlll[1]];
                                iArr42[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                                TileItems.getNearest(iArr42).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[211]]);
                                Time.sleepTicks(lIIlIIIIlIlll[7]);
                                "".length();
                            }
                            WorldArea worldArea10 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                            int[] iArr43 = new int[lIIlIIIIlIlll[1]];
                            iArr43[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[207];
                            if (lIlIIlllllllIII(Inventory.contains(iArr43) ? 1 : 0) && lIlIIlllllllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint9 = new WorldPoint(lIIlIIIIlIlll[183], lIIlIIIIlIlll[212], lIIlIIIIlIlll[0]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[213]];
                                    C0004e.b(worldPoint9);
                                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                                    "".length();
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    String[] strArr62 = new String[lIIlIIIIlIlll[1]];
                                    strArr62[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[214]];
                                    TileObjects.getNearest(strArr62).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[215]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIlllllllIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] iArr44 = new int[lIIlIIIIlIlll[1]];
                                iArr44[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                if (lIlIIlllllllIlI(Inventory.contains(iArr44) ? 1 : 0)) {
                                    int[] iArr45 = new int[lIIlIIIIlIlll[1]];
                                    iArr45[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                    if (lIlIlIIIIIIIIll(TileItems.getNearest(iArr45))) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[217]];
                                        if (lIlIIlllllllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                            int[] iArr46 = new int[lIIlIIIIlIlll[1]];
                                            iArr46[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[218];
                                            NPCs.getNearest(iArr46).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[219]]);
                                            Time.sleepTicks(lIIlIIIIlIlll[11]);
                                            "".length();
                                        }
                                    }
                                }
                                int[] iArr47 = new int[lIIlIIIIlIlll[1]];
                                iArr47[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                if (lIlIIlllllllllI(TileItems.getNearest(iArr47))) {
                                    if (lIlIIlllllllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    int[] iArr48 = new int[lIIlIIIIlIlll[1]];
                                    iArr48[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                    TileItems.getNearest(iArr48).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[220]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[7]);
                                    "".length();
                                }
                                WorldArea worldArea11 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                                int[] iArr49 = new int[lIIlIIIIlIlll[1]];
                                iArr49[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[216];
                                if (lIlIIlllllllIII(Inventory.contains(iArr49) ? 1 : 0) && lIlIIlllllllIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint10 = new WorldPoint(lIIlIIIIlIlll[221], lIIlIIIIlIlll[222], lIIlIIIIlIlll[0]);
                                    if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[223]];
                                        C0004e.b(worldPoint10);
                                        Time.sleepTicks(lIIlIIIIlIlll[2]);
                                        "".length();
                                    }
                                    if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        String[] strArr63 = new String[lIIlIIIIlIlll[1]];
                                        strArr63[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[224]];
                                        TileObjects.getNearest(strArr63).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[225]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[12]);
                                        "".length();
                                    }
                                }
                            }
                            if (!lIlIIlllllllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIlllllllIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                String[] strArr64 = new String[lIIlIIIIlIlll[1]];
                                strArr64[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[226]];
                                NPC nearest12 = NPCs.getNearest(strArr64);
                                if (lIlIIlllllllllI(nearest12)) {
                                    int[] iArr50 = new int[lIIlIIIIlIlll[1]];
                                    iArr50[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                    if (lIlIIlllllllIlI(Inventory.contains(iArr50) ? 1 : 0) && lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                                        if (lIlIIlllllllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        nearest12.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[228]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[7]);
                                        "".length();
                                    }
                                }
                                int[] iArr51 = new int[lIIlIIIIlIlll[1]];
                                iArr51[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                if (lIlIIlllllllllI(TileItems.getNearest(iArr51))) {
                                    int[] iArr52 = new int[lIIlIIIIlIlll[1]];
                                    iArr52[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                    TileItems.getNearest(iArr52).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[229]]);
                                    Time.sleepTicks(lIIlIIIIlIlll[2]);
                                    "".length();
                                }
                                int[] iArr53 = new int[lIIlIIIIlIlll[1]];
                                iArr53[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[227];
                                if (lIlIIlllllllIII(Inventory.contains(iArr53) ? 1 : 0)) {
                                    WorldPoint worldPoint11 = new WorldPoint(lIIlIIIIlIlll[176], lIIlIIIIlIlll[230], lIIlIIIIlIlll[0]);
                                    if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[231]];
                                        C0004e.b(worldPoint11);
                                        Time.sleepTicks(lIIlIIIIlIlll[2]);
                                        "".length();
                                    }
                                    if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        String[] strArr65 = new String[lIIlIIIIlIlll[1]];
                                        strArr65[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[232]];
                                        TileObjects.getNearest(strArr65).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[233]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[12]);
                                        "".length();
                                    }
                                }
                            }
                            TileObject nearest13 = TileObjects.getNearest(tileObject6 -> {
                                if (lIlIIlllllllIII(tileObject6.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[324]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject6) ? 1 : 0)) {
                                    ?? r0 = lIIlIIIIlIlll[1];
                                    "".length();
                                    return " ".length() >= (115 ^ 119) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlIIIIlIlll[0];
                            });
                            if (lIlIIlllllllllI(nearest13)) {
                                if (lIlIIlllllllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                if (lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr66 = new String[lIIlIIIIlIlll[1]];
                                    strArr66[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[234]];
                                    if (lIlIIlllllllIII(nearest13.hasAction(strArr66) ? 1 : 0)) {
                                        nearest13.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[235]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[9]);
                                        "".length();
                                    }
                                    String[] strArr67 = new String[lIIlIIIIlIlll[1]];
                                    strArr67[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[236]];
                                    if (lIlIIlllllllIII(nearest13.hasAction(strArr67) ? 1 : 0)) {
                                        nearest13.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[237]]);
                                        Time.sleepTicks(lIIlIIIIlIlll[9]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIlIIlllllllIII(fQ ? 1 : 0) && lIlIIlllllllIII(fR ? 1 : 0) && lIlIIlllllllIII(fP ? 1 : 0) && lIlIIlllllllIlI(fS ? 1 : 0)) {
                        iArr = new int[lIIlIIIIlIlll[1]];
                        iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                        if (lIlIIlllllllIII(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr54 = new int[lIIlIIIIlIlll[1]];
                            iArr54[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                            Item first13 = Inventory.getFirst(iArr54);
                            int[] iArr55 = new int[lIIlIIIIlIlll[1]];
                            iArr55[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
                            first13.useOn(Inventory.getFirst(iArr55));
                            Time.sleepTicks(lIIlIIIIlIlll[7]);
                            "".length();
                        }
                    }
                    if (lIlIIlllllllIII(fS ? 1 : 0)) {
                        String[] strArr68 = new String[lIIlIIIIlIlll[1]];
                        strArr68[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[238]];
                        if (lIlIIlllllllIlI(Inventory.contains(strArr68) ? 1 : 0)) {
                            br();
                        }
                        String[] strArr69 = new String[lIIlIIIIlIlll[1]];
                        strArr69[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[239]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr69) ? 1 : 0)) {
                            if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[9])) {
                                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[240]];
                                if (lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr70 = new String[lIIlIIIIlIlll[1]];
                                    strArr70[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[241]];
                                    if (lIlIlIIIIIIIIll(NPCs.getNearest(strArr70))) {
                                        Dialog.close();
                                    }
                                }
                                if (lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo(fO);
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIlIlll[1]);
                                    "".length();
                                }
                                String[] strArr71 = new String[lIIlIIIIlIlll[7]];
                                strArr71[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[242]];
                                strArr71[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[243]];
                                strArr71[lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[244]];
                                C0006g.a(strArr71);
                            }
                            if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[9])) {
                                C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[245]], bW);
                            }
                        }
                    }
                }
                if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[8]];
                    if (lIlIIlllllllIII(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr56 = new int[lIIlIIIIlIlll[1]];
                        iArr56[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                        if (lIlIIlllllllIII(Inventory.contains(iArr56) ? 1 : 0)) {
                            int[] iArr57 = new int[lIIlIIIIlIlll[1]];
                            iArr57[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[35];
                            Inventory.getFirst(iArr57).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[56]]);
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                    }
                    Movement.walkTo(fL);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIlll[1]);
                    "".length();
                }
                if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fL), lIIlIIIIlIlll[12])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[57]];
                    if (lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[58]], bW, lIIlIIIIlIlll[1]);
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[59]), lIIlIIIIlIlll[1])) {
                        String[] strArr72 = new String[lIIlIIIIlIlll[2]];
                        strArr72[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[60]];
                        strArr72[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[61]];
                        C0006g.a(strArr72);
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[62]), lIIlIIIIlIlll[1])) {
                        String[] strArr73 = new String[lIIlIIIIlIlll[1]];
                        strArr73[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[63]];
                        C0006g.a(strArr73);
                    }
                    if (!lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[64]), lIIlIIIIlIlll[1]) || lIlIIlllllllIII(Vars.getBit(lIIlIIIIlIlll[62]))) {
                        String[] strArr74 = new String[lIIlIIIIlIlll[1]];
                        strArr74[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[65]];
                    }
                    String[] strArr75 = new String[lIIlIIIIlIlll[2]];
                    strArr75[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[15]];
                    strArr75[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[66]];
                    C0006g.a(strArr75);
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[67]), lIIlIIIIlIlll[1])) {
                        String[] strArr76 = new String[lIIlIIIIlIlll[2]];
                        strArr76[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[68]];
                        strArr76[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[69]];
                        C0006g.a(strArr76);
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[54]), lIIlIIIIlIlll[1])) {
                        String[] strArr77 = new String[lIIlIIIIlIlll[2]];
                        strArr77[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[70]];
                        strArr77[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[71]];
                        C0006g.a(strArr77);
                    }
                }
                if (lIlIIlllllllIlI(Vars.getBit(lIIlIIIIlIlll[54]))) {
                    strArr10 = new String[lIIlIIIIlIlll[1]];
                    strArr10[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[74]];
                    if (lIlIIlllllllIII(Inventory.contains(strArr10) ? 1 : 0)) {
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[73]), lIIlIIIIlIlll[1])) {
                        strArr8 = new String[lIIlIIIIlIlll[1]];
                        strArr8[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[82]];
                        if (lIlIIlllllllIlI(Inventory.contains(strArr8) ? 1 : 0)) {
                            bs();
                        }
                        strArr9 = new String[lIIlIIIIlIlll[1]];
                        strArr9[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[84]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr9) ? 1 : 0)) {
                        }
                    }
                    if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1])) {
                        strArr2 = new String[lIIlIIIIlIlll[1]];
                        strArr2[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[119]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr2) ? 1 : 0)) {
                        }
                        strArr3 = new String[lIIlIIIIlIlll[1]];
                        strArr3[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[122]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr3) ? 1 : 0)) {
                        }
                        strArr4 = new String[lIIlIIIIlIlll[1]];
                        strArr4[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[125]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr4) ? 1 : 0)) {
                        }
                        strArr5 = new String[lIIlIIIIlIlll[1]];
                        strArr5[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[128]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr5) ? 1 : 0)) {
                        }
                        String[] strArr542 = new String[lIIlIIIIlIlll[1]];
                        strArr542[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[25]];
                        nearest3 = TileObjects.getNearest(strArr542);
                        if (lIlIIlllllllllI(nearest3)) {
                            if (lIlIIlllllllIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            }
                            if (lIlIIlllllllIII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                strArr6 = new String[lIIlIIIIlIlll[1]];
                                strArr6[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[133]];
                                if (lIlIIlllllllIII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                }
                                strArr7 = new String[lIIlIIIIlIlll[1]];
                                strArr7[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[135]];
                                if (lIlIIlllllllIII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                }
                            }
                        }
                    }
                    if (lIlIIlllllllIII(fP ? 1 : 0)) {
                        if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIlIlll[85], lIIlIIIIlIlll[86], lIIlIIIIlIlll[0])), lIIlIIIIlIlll[23])) {
                        }
                        worldPoint4 = new WorldPoint(lIIlIIIIlIlll[138], lIIlIIIIlIlll[139], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                        if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIlllllllIII(fP ? 1 : 0)) {
                        strArr = new String[lIIlIIIIlIlll[1]];
                        strArr[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[146]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr) ? 1 : 0)) {
                        }
                        WorldArea worldArea42 = new WorldArea(lIIlIIIIlIlll[149], lIIlIIIIlIlll[150], lIIlIIIIlIlll[51], lIIlIIIIlIlll[10], lIIlIIIIlIlll[0]);
                        worldArea = new WorldArea(lIIlIIIIlIlll[151], lIIlIIIIlIlll[152], lIIlIIIIlIlll[58], lIIlIIIIlIlll[58], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            worldPoint3 = new WorldPoint(lIIlIIIIlIlll[153], lIIlIIIIlIlll[154], lIIlIIIIlIlll[0]);
                            if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIlIlll[2])) {
                            }
                            if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIIlIlll[2])) {
                            }
                        }
                        worldArea2 = new WorldArea(lIIlIIIIlIlll[158], lIIlIIIIlIlll[159], lIIlIIIIlIlll[11], lIIlIIIIlIlll[16], lIIlIIIIlIlll[0]);
                        WorldArea worldArea52 = new WorldArea(lIIlIIIIlIlll[160], lIIlIIIIlIlll[161], lIIlIIIIlIlll[13], lIIlIIIIlIlll[7], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane())) {
                            iArr5 = new int[lIIlIIIIlIlll[1]];
                            iArr5[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                            }
                            iArr6 = new int[lIIlIIIIlIlll[1]];
                            iArr6[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr6))) {
                            }
                            iArr7 = new int[lIIlIIIIlIlll[1]];
                            iArr7[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[162];
                            if (lIlIIlllllllIII(Inventory.contains(iArr7) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(lIIlIIIIlIlll[169], lIIlIIIIlIlll[170], lIIlIIIIlIlll[0]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                            }
                            if (lIlIIlllllllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                            nearest2 = TileObjects.getNearest(tileObject7 -> {
                                if (lIlIIlllllllIII(tileObject7.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[334]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject7) ? 1 : 0)) {
                                    ?? r0 = lIIlIIIIlIlll[1];
                                    "".length();
                                    return " ".length() < (((117 ^ 66) ^ (126 ^ 26)) & (((13 ^ 92) ^ "  ".length()) ^ (-" ".length()))) ? ((((14 + 148) - 9) + 59) ^ (((88 + 170) - 107) + 31)) & (((2 ^ 24) ^ (211 ^ 171)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIIIIlIlll[0];
                            });
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[174]];
                            if (lIlIIlllllllllI(nearest2)) {
                            }
                        }
                        if (lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                            iArr2 = new int[lIIlIIIIlIlll[1]];
                            iArr2[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                            }
                            iArr3 = new int[lIIlIIIIlIlll[1]];
                            iArr3[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllllI(TileItems.getNearest(iArr3))) {
                            }
                            worldArea3 = new WorldArea(lIIlIIIIlIlll[183], lIIlIIIIlIlll[184], lIIlIIIIlIlll[12], lIIlIIIIlIlll[11], lIIlIIIIlIlll[1]);
                            iArr4 = new int[lIIlIIIIlIlll[1]];
                            iArr4[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[178];
                            if (lIlIIlllllllIII(Inventory.contains(iArr4) ? 1 : 0)) {
                                worldPoint = new WorldPoint(lIIlIIIIlIlll[163], lIIlIIIIlIlll[170], lIIlIIIIlIlll[1]);
                                if (lIlIIlllllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                                if (lIlIIlllllllIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                            }
                            if (lIlIIlllllllIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                        }
                        if (lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[2])) {
                        }
                        if (lIlIIlllllllIlI(new WorldArea(lIIlIIIIlIlll[176], lIIlIIIIlIlll[177], lIIlIIIIlIlll[11], lIIlIIIIlIlll[13], lIIlIIIIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        nearest = TileObjects.getNearest(tileObject42 -> {
                            if (lIlIIlllllllIII(tileObject42.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[328]]) ? 1 : 0) && lIlIIlllllllIII(Reachable.isInteractable(tileObject42) ? 1 : 0)) {
                                String[] strArr622 = new String[lIIlIIIIlIlll[1]];
                                strArr622[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[329]];
                                if (lIlIIlllllllIII(tileObject42.hasAction(strArr622) ? 1 : 0)) {
                                    ?? r0 = lIIlIIIIlIlll[1];
                                    "".length();
                                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lIIlIIIIlIlll[0];
                        });
                        if (lIlIIlllllllllI(nearest)) {
                        }
                        if (lIlIIlllllllIII(new WorldArea(lIIlIIIIlIlll[163], lIIlIIIIlIlll[164], lIIlIIIIlIlll[26], lIIlIIIIlIlll[12], lIIlIIIIlIlll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        WorldArea worldArea72 = new WorldArea(lIIlIIIIlIlll[194], lIIlIIIIlIlll[203], lIIlIIIIlIlll[43], lIIlIIIIlIlll[9], lIIlIIIIlIlll[0]);
                        WorldArea worldArea82 = new WorldArea(lIIlIIIIlIlll[204], lIIlIIIIlIlll[205], lIIlIIIIlIlll[13], lIIlIIIIlIlll[23], lIIlIIIIlIlll[0]);
                        WorldArea worldArea92 = new WorldArea(lIIlIIIIlIlll[169], lIIlIIIIlIlll[206], lIIlIIIIlIlll[11], lIIlIIIIlIlll[17], lIIlIIIIlIlll[0]);
                        if (lIlIIlllllllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIlllllllIII(fQ ? 1 : 0)) {
                        iArr = new int[lIIlIIIIlIlll[1]];
                        iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
                        if (lIlIIlllllllIII(Inventory.contains(iArr) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIlllllllIII(fS ? 1 : 0)) {
                    }
                }
                strArr10 = new String[lIIlIIIIlIlll[1]];
                strArr10[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[74]];
                if (lIlIIlllllllIII(Inventory.contains(strArr10) ? 1 : 0)) {
                }
                if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[73]), lIIlIIIIlIlll[1])) {
                }
                if (lIlIlIIIIIIIIIl(Vars.getBit(lIIlIIIIlIlll[81]), lIIlIIIIlIlll[1])) {
                }
                if (lIlIIlllllllIII(fP ? 1 : 0)) {
                }
                if (lIlIIlllllllIII(fP ? 1 : 0)) {
                }
                if (lIlIIlllllllIII(fQ ? 1 : 0)) {
                }
                if (lIlIIlllllllIII(fS ? 1 : 0)) {
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[7])) {
                co = lIIlIIIIlIlll[0];
                String[] strArr78 = new String[lIIlIIIIlIlll[1]];
                strArr78[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[246]];
                NPC nearest14 = NPCs.getNearest(strArr78);
                if (lIlIlIIIIIIIIll(nearest14) && lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[247]];
                    String[] strArr79 = new String[lIIlIIIIlIlll[1]];
                    strArr79[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[248]];
                    TileObjects.getNearest(strArr79).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[249]]);
                    Time.sleepTicks(lIIlIIIIlIlll[16]);
                    "".length();
                }
                if (lIlIlIIIIIIIIll(nearest14) && lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[250]];
                    String[] strArr80 = new String[lIIlIIIIlIlll[1]];
                    strArr80[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[251]];
                    TileObjects.getNearest(strArr80).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[252]]);
                    Time.sleepTicks(lIIlIIIIlIlll[7]);
                    "".length();
                }
                if (lIlIIlllllllllI(nearest14) && lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                    String[] strArr81 = new String[lIIlIIIIlIlll[1]];
                    strArr81[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[253]];
                    TileObjects.getNearest(strArr81).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[254]]);
                    Time.sleepTicks(lIIlIIIIlIlll[11]);
                    "".length();
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[12])) {
                AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[255]];
                String[] strArr82 = new String[lIIlIIIIlIlll[1]];
                strArr82[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[256]];
                NPC nearest15 = NPCs.getNearest(strArr82);
                if (lIlIlIIIIIIIIll(nearest15)) {
                    Equipment.getFirst(item7 -> {
                        return item7.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[323]]);
                    }).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[257]]);
                    Time.sleepTicks(lIIlIIIIlIlll[23]);
                    "".length();
                    Movement.walkTo(new WorldPoint(lIIlIIIIlIlll[258], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]));
                    "".length();
                }
                if (lIlIIlllllllllI(nearest15)) {
                    C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[14]], bW, lIIlIIIIlIlll[1]);
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[13])) {
                if (lIlIIlllllllIlI(Inventory.contains(item8 -> {
                    return item8.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[322]]);
                }) ? 1 : 0)) {
                    bq();
                }
                if (lIlIIlllllllIII(Inventory.contains(item9 -> {
                    return item9.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[321]]);
                }) ? 1 : 0)) {
                    String[] strArr83 = new String[lIIlIIIIlIlll[1]];
                    strArr83[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[72]];
                    if (lIlIlIIIIIIIIll(NPCs.getNearest(strArr83)) && lIlIIlllllllIlI(Players.getLocal().getWorldLocation().getPlane()) && lIlIIlllllllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[2])) {
                            AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[260]];
                            if (lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr84 = new String[lIIlIIIIlIlll[1]];
                                strArr84[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[261]];
                                if (lIlIlIIIIIIIIll(NPCs.getNearest(strArr84))) {
                                    Dialog.close();
                                }
                            }
                            if (lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(fO);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                            String[] strArr85 = new String[lIIlIIIIlIlll[7]];
                            strArr85[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[262]];
                            strArr85[lIIlIIIIlIlll[1]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[263]];
                            strArr85[lIIlIIIIlIlll[2]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[264]];
                            C0006g.a(strArr85);
                        }
                        if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(fO), lIIlIIIIlIlll[2]) && lIlIIlllllllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr86 = new String[lIIlIIIIlIlll[1]];
                            strArr86[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[265]];
                            TileObjects.getNearest(strArr86).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[266]]);
                            Time.sleepTicks(lIIlIIIIlIlll[13]);
                            "".length();
                        }
                    }
                    String[] strArr87 = new String[lIIlIIIIlIlll[1]];
                    strArr87[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[267]];
                    if (lIlIIlllllllllI(NPCs.getNearest(strArr87)) && lIlIlIIIIIIIIIl(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIlIlll[1])) {
                        C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[268]], bW);
                    }
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[16])) {
                WorldArea worldArea12 = new WorldArea(lIIlIIIIlIlll[269], lIIlIIIIlIlll[270], lIIlIIIIlIlll[89], lIIlIIIIlIlll[79], lIIlIIIIlIlll[0]);
                if (lIlIIlllllllIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint12 = new WorldPoint(lIIlIIIIlIlll[271], lIIlIIIIlIlll[259], lIIlIIIIlIlll[0]);
                    if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lIIlIIIIlIlll[7])) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[272]];
                        Movement.walkTo(worldPoint12);
                        "".length();
                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                        "".length();
                    }
                    if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lIIlIIIIlIlll[7])) {
                        String[] strArr88 = new String[lIIlIIIIlIlll[1]];
                        strArr88[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[273]];
                        TileObjects.getNearest(strArr88).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[274]]);
                        Time.sleepTicks(lIIlIIIIlIlll[9]);
                        "".length();
                    }
                }
                if (lIlIIlllllllIII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr89 = new String[lIIlIIIIlIlll[1]];
                    strArr89[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[275]];
                    NPC nearest16 = NPCs.getNearest(strArr89);
                    WorldPoint worldPoint13 = new WorldPoint(lIIlIIIIlIlll[276], lIIlIIIIlIlll[152], lIIlIIIIlIlll[0]);
                    if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lIIlIIIIlIlll[7]) && lIlIlIIIIIIIIll(nearest16)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[277]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                        "".length();
                    }
                    if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lIIlIIIIlIlll[7]) && lIlIIlllllllllI(nearest16) && lIlIIlllllllIlI(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[278]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(lIIlIIIIlIlll[1]);
                        "".length();
                    }
                    if (lIlIIlllllllllI(nearest16) && lIlIIlllllllIlI(Reachable.isInteractable(nearest16) ? 1 : 0) && lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lIIlIIIIlIlll[7]) && lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        if (lIlIIllllllllll(Combat.getMissingHealth(), lIIlIIIIlIlll[9])) {
                            String[] strArr90 = new String[lIIlIIIIlIlll[1]];
                            strArr90[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[279]];
                            if (lIlIIlllllllIII(Inventory.contains(strArr90) ? 1 : 0)) {
                                String[] strArr91 = new String[lIIlIIIIlIlll[1]];
                                strArr91[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[280]];
                                Inventory.getFirst(strArr91).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[281]]);
                                Time.sleepTicks(lIIlIIIIlIlll[1]);
                                "".length();
                            }
                        }
                        String[] strArr92 = new String[lIIlIIIIlIlll[1]];
                        strArr92[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[282]];
                        TileObjects.getNearest(strArr92).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[283]]);
                    }
                    if (lIlIIlllllllllI(nearest16) && lIlIIlllllllIII(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[284]];
                        if (lIlIIlllllllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        if (lIlIIlllllllIlI(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                        }
                        if (lIlIIlllllllIlI(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] strArr93 = new String[lIIlIIIIlIlll[1]];
                        strArr93[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[285]];
                        if (lIlIIlllllllIII(Inventory.contains(strArr93) ? 1 : 0)) {
                            String[] strArr94 = new String[lIIlIIIIlIlll[1]];
                            strArr94[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[286]];
                            Inventory.getFirst(strArr94).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[287]]);
                        }
                        if (lIlIIlllllllIII(Inventory.isFull() ? 1 : 0)) {
                            String[] strArr95 = new String[lIIlIIIIlIlll[1]];
                            strArr95[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[288]];
                            Inventory.getFirst(strArr95).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[289]]);
                        }
                        if (lIlIlIIIIIIIIIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIIlllllllIII(Inventory.contains(item10 -> {
                            return item10.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[320]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item11 -> {
                                return item11.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[319]]);
                            }).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[290]]);
                        }
                        if (lIlIIlllllllIIl(Vars.getBit(lIIlIIIIlIlll[291]), lIIlIIIIlIlll[1]) && lIlIIlllllllIII(Inventory.contains(item12 -> {
                            return item12.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[318]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item13 -> {
                                return item13.getName().contains(lIIlIIIIIlIIl[lIIlIIIIlIlll[317]]);
                            }).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[292]]);
                        }
                        if (lIlIlIIIIIIIIll(Players.getLocal().getInteracting())) {
                            nearest16.interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[293]]);
                            Time.sleepTicks(lIIlIIIIlIlll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[17])) {
                Prayers.disableAll();
                WorldPoint worldPoint14 = new WorldPoint(lIIlIIIIlIlll[48], lIIlIIIIlIlll[49], lIIlIIIIlIlll[0]);
                if (lIlIIllllllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lIIlIIIIlIlll[16]) && lIlIlIIIIIIIIIl(Players.getLocal().getAnimation(), lIIlIIIIlIlll[294])) {
                    AccBuilderRat.c = lIIlIIIIIlIIl[lIIlIIIIlIlll[295]];
                    Movement.walkTo(worldPoint14);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIlll[1]);
                    "".length();
                }
                if (lIlIlIIIIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lIIlIIIIlIlll[16])) {
                    if (lIlIIlllllllIIl(co, lIIlIIIIlIlll[1])) {
                        P.lz += lIIlIIIIlIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIlIlll[1];
                        P.lz = lIIlIIIIlIlll[0];
                        cp = lIIlIIIIlIlll[0];
                    }
                    C0006g.a(lIIlIIIIIlIIl[lIIlIIIIlIlll[296]], bW, lIIlIIIIlIlll[1]);
                }
            }
            int[] iArr58 = new int[lIIlIIIIlIlll[1]];
            iArr58[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
            if (lIlIIlllllllIII(Inventory.contains(iArr58) ? 1 : 0)) {
                int[] iArr59 = new int[lIIlIIIIlIlll[1]];
                iArr59[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                if (lIlIIlllllllIlI(Equipment.contains(iArr59) ? 1 : 0) && lIlIIllllllllII(C0004e.j(lIIlIIIIlIlll[14]))) {
                    int[] iArr60 = new int[lIIlIIIIlIlll[1]];
                    iArr60[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[36];
                    Inventory.getFirst(iArr60).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[297]]);
                }
            }
            String[] strArr96 = new String[lIIlIIIIlIlll[1]];
            strArr96[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[298]];
            if (lIlIIlllllllIII(Inventory.contains(strArr96) ? 1 : 0)) {
                fS = lIIlIIIIlIlll[1];
                fR = lIIlIIIIlIlll[1];
                fP = lIIlIIIIlIlll[1];
                fQ = lIIlIIIIlIlll[1];
            }
            int[] iArr61 = new int[lIIlIIIIlIlll[1]];
            iArr61[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[3];
            if (lIlIIlllllllIII(Inventory.contains(iArr61) ? 1 : 0)) {
                fR = lIIlIIIIlIlll[1];
            }
            int[] iArr62 = new int[lIIlIIIIlIlll[1]];
            iArr62[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[4];
            if (lIlIIlllllllIII(Inventory.contains(iArr62) ? 1 : 0)) {
                fP = lIIlIIIIlIlll[1];
            }
            int[] iArr63 = new int[lIIlIIIIlIlll[1]];
            iArr63[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[5];
            if (lIlIIlllllllIII(Inventory.contains(iArr63) ? 1 : 0)) {
                fQ = lIIlIIIIlIlll[1];
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23])) {
                String[] strArr97 = new String[lIIlIIIIlIlll[1]];
                strArr97[lIIlIIIIlIlll[0]] = lIIlIIIIIlIIl[lIIlIIIIlIlll[299]];
                if (lIlIIlllllllllI(NPCs.getNearest(strArr97))) {
                    int[] iArr64 = new int[lIIlIIIIlIlll[1]];
                    iArr64[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                    if (lIlIIlllllllIII(Inventory.contains(iArr64) ? 1 : 0)) {
                        int[] iArr65 = new int[lIIlIIIIlIlll[1]];
                        iArr65[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
                        Inventory.getFirst(iArr65).interact(lIIlIIIIIlIIl[lIIlIIIIlIlll[300]]);
                        Time.sleepTicks(lIIlIIIIlIlll[12]);
                        "".length();
                    }
                }
            }
            if (lIlIlIIIIIIIIIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23]) && lIlIIlllllllIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + C0004e.j(lIIlIIIIlIlll[14]));
        }
        C0006g.a(new String[lIIlIIIIlIlll[0]]);
    }

    private static String lIlIIlllIIlIlll(String llllllllllllllIllllllIllIllIlllI, String llllllllllllllIllllllIllIllIllIl) {
        String llllllllllllllIllllllIllIllIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllllIllIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllIllIllIllII = new StringBuilder();
        char[] charArray = llllllllllllllIllllllIllIllIllIl.toCharArray();
        int llllllllllllllIllllllIllIllIlIlI = lIIlIIIIlIlll[0];
        char[] charArray2 = llllllllllllllIllllllIllIllIlllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIIIIlIlll[0];
        while (lIlIIlllllllIIl(i2, length)) {
            char llllllllllllllIllllllIllIllIllll = charArray2[i2];
            llllllllllllllIllllllIllIllIllII.append((char) (llllllllllllllIllllllIllIllIllll ^ charArray[llllllllllllllIllllllIllIllIlIlI % charArray.length]));
            "".length();
            llllllllllllllIllllllIllIllIlIlI++;
            i2++;
            "".length();
            if (((47 ^ 32) & ((132 ^ 139) ^ (-1))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllllIllIllIllII);
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIIlIIl[lIIlIIIIlIlll[315]];
    }

    private static boolean lIlIlIIIIIIIIII(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIlIIIIlIlll[9]];
        iArr[lIIlIIIIlIlll[0]] = lIIlIIIIlIlll[19];
        iArr[lIIlIIIIlIlll[1]] = lIIlIIIIlIlll[37];
        iArr[lIIlIIIIlIlll[2]] = lIIlIIIIlIlll[46];
        iArr[lIIlIIIIlIlll[7]] = lIIlIIIIlIlll[39];
        int i2 = lIIlIIIIlIlll[0];
        while (lIlIIlllllllIIl(i2, iArr.length)) {
            int[] iArr2 = new int[lIIlIIIIlIlll[1]];
            iArr2[lIIlIIIIlIlll[0]] = iArr[i2];
            if (lIlIIlllllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIIlIlll[0];
            }
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((69 ^ 77) ^ (1 ^ 91)) & (((31 ^ 44) ^ (105 ^ 8)) ^ (-" ".length()));
            }
        }
        return lIIlIIIIlIlll[1];
    }

    private static boolean lIlIIllllllllIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static int lIlIIllllllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIllllllllII(int i2) {
        return i2 > 0;
    }

    private static void lIlIIllllllIllI() {
        lIIlIIIIlIlll = new int[366];
        lIIlIIIIlIlll[0] = ((((36 + 145) - 91) + 84) ^ (((85 + 124) - 144) + 85)) & (((((172 + 107) - 194) + 89) ^ (((124 + 90) - 121) + 57)) ^ (-" ".length()));
        lIIlIIIIlIlll[1] = " ".length();
        lIIlIIIIlIlll[2] = "  ".length();
        lIIlIIIIlIlll[3] = (-2049) & 3583;
        lIIlIIIIlIlll[4] = (-((-911) & 27583)) & (-4165) & 32373;
        lIIlIIIIlIlll[5] = (-((-9394) & 25791)) & (-4371) & 22303;
        lIIlIIIIlIlll[6] = (((18 + 121) - 94) + 117) ^ (((24 + 123) - 88) + 85);
        lIIlIIIIlIlll[7] = "   ".length();
        lIIlIIIIlIlll[8] = (209 ^ 141) ^ (127 ^ 59);
        lIIlIIIIlIlll[9] = (12 ^ 123) ^ (103 ^ 20);
        lIIlIIIIlIlll[10] = 45 ^ 57;
        lIIlIIIIlIlll[11] = 72 ^ 77;
        lIIlIIIIlIlll[12] = 28 ^ 26;
        lIIlIIIIlIlll[13] = 44 ^ 43;
        lIIlIIIIlIlll[14] = (((75 ^ 119) + (((39 + 133) - 110) + 87)) - (((125 + 130) - 100) + 27)) + ((12 + 145) - 35) + 27;
        lIIlIIIIlIlll[15] = 138 ^ 170;
        lIIlIIIIlIlll[16] = (((159 + 121) - 256) + 177) ^ (((191 + 175) - 250) + 77);
        lIIlIIIIlIlll[17] = (109 ^ 81) ^ (160 ^ 149);
        lIIlIIIIlIlll[18] = (-18501) & 23500;
        lIIlIIIIlIlll[19] = (-24601) & 32607;
        lIIlIIIIlIlll[20] = 120 ^ 119;
        lIIlIIIIlIlll[21] = (-((-2633) & 19199)) & (-1) & 24575;
        lIIlIIIIlIlll[22] = (-((-9985) & 26549)) & (-8195) & 32766;
        lIIlIIIIlIlll[23] = (((181 + 184) - 230) + 55) ^ (((125 + 46) - 105) + 114);
        lIIlIIIIlIlll[24] = (-8333) & 9871;
        lIIlIIIIlIlll[25] = (63 ^ 44) ^ (198 ^ 143);
        lIIlIIIIlIlll[26] = 100 ^ 111;
        lIIlIIIIlIlll[27] = (-29749) & 30708;
        lIIlIIIIlIlll[28] = (((10 + 186) - 96) + 100) ^ (((104 + 42) - 122) + 172);
        lIIlIIIIlIlll[29] = (109 ^ 87) ^ (4 ^ 47);
        lIIlIIIIlIlll[30] = (-20481) & 22271;
        lIIlIIIIlIlll[31] = (-((-20113) & 28317)) & (-2049) & 12159;
        lIIlIIIIlIlll[32] = (-((-10601) & 15867)) & (-8769) & 14335;
        lIIlIIIIlIlll[33] = (-((-6970) & 32571)) & (-2121) & 28671;
        lIIlIIIIlIlll[34] = (-9409) & 11755;
        lIIlIIIIlIlll[35] = (-((-8195) & 28271)) & (-3) & 20463;
        lIIlIIIIlIlll[36] = (-((-4098) & 31101)) & (-1) & 28543;
        lIIlIIIIlIlll[37] = (-((-449) & 19915)) & (-677) & 32767;
        lIIlIIIIlIlll[38] = 101 ^ 104;
        lIIlIIIIlIlll[39] = (-1539) & 3990;
        lIIlIIIIlIlll[40] = 89 ^ 87;
        lIIlIIIIlIlll[41] = (-((-49) & 18041)) & (-2081) & 32767;
        lIIlIIIIlIlll[42] = (-((-8553) & 29053)) & (-33) & 32510;
        lIIlIIIIlIlll[43] = (93 ^ 29) ^ (243 ^ 163);
        lIIlIIIIlIlll[44] = (-8267) & 9599;
        lIIlIIIIlIlll[45] = (-((-16649) & 29513)) & (-16429) & 31726;
        lIIlIIIIlIlll[46] = (-((-2723) & 16055)) & (-2057) & 16383;
        lIIlIIIIlIlll[47] = (-17505) & 32504;
        lIIlIIIIlIlll[48] = (-((-26567) & 30663)) & (-17411) & 24575;
        lIIlIIIIlIlll[49] = (-((-4277) & 28855)) & (-577) & 28671;
        lIIlIIIIlIlll[50] = 156 ^ 142;
        lIIlIIIIlIlll[51] = (27 ^ 67) ^ (17 ^ 90);
        lIIlIIIIlIlll[52] = (((37 + 52) - (-14)) + 69) ^ (((78 + 2) - (-63)) + 42);
        lIIlIIIIlIlll[53] = 185 ^ 175;
        lIIlIIIIlIlll[54] = (-20763) & 24506;
        lIIlIIIIlIlll[55] = 2 ^ 21;
        lIIlIIIIlIlll[56] = 27 ^ 2;
        lIIlIIIIlIlll[57] = 120 ^ 98;
        lIIlIIIIlIlll[58] = 38 ^ 61;
        lIIlIIIIlIlll[59] = (-((-681) & 13295)) & (-9) & 16367;
        lIIlIIIIlIlll[60] = (179 ^ 162) ^ (154 ^ 151);
        lIIlIIIIlIlll[61] = 49 ^ 44;
        lIIlIIIIlIlll[62] = (-((-1266) & 13819)) & (-16385) & 32683;
        lIIlIIIIlIlll[63] = 90 ^ 68;
        lIIlIIIIlIlll[64] = (-((-11381) & 32117)) & (-8194) & 32671;
        lIIlIIIIlIlll[65] = 0 ^ 31;
        lIIlIIIIlIlll[66] = 172 ^ 141;
        lIIlIIIIlIlll[67] = (-24833) & 28575;
        lIIlIIIIlIlll[68] = (((18 + 145) - 60) + 126) ^ (((167 + 110) - 133) + 55);
        lIIlIIIIlIlll[69] = (125 ^ 52) ^ (19 ^ 121);
        lIIlIIIIlIlll[70] = (((86 + 130) - 211) + 174) ^ (((4 + 2) - (-112)) + 33);
        lIIlIIIIlIlll[71] = (243 ^ 147) ^ (69 ^ 0);
        lIIlIIIIlIlll[72] = (((((84 + 32) - (-34)) + 1) + (((117 + 62) - 103) + 61)) - (((47 + 102) - 129) + 225)) + ((130 + 94) - 150) + 60;
        lIIlIIIIlIlll[73] = (-((-545) & 2792)) & (-16401) & 20479;
        lIIlIIIIlIlll[74] = (((79 + 125) - 104) + 64) ^ (((14 + 5) - (-48)) + 63);
        lIIlIIIIlIlll[75] = (-((-6855) & 32495)) & (-4114) & 32767;
        lIIlIIIIlIlll[76] = (-4675) & 8175;
        lIIlIIIIlIlll[77] = (((67 + 65) - 56) + 59) ^ (((117 + 62) - 89) + 70);
        lIIlIIIIlIlll[78] = 71 ^ 111;
        lIIlIIIIlIlll[79] = (((111 + 27) - 62) + 64) ^ (((144 + 29) - 107) + 99);
        lIIlIIIIlIlll[80] = (242 ^ 179) ^ (45 ^ 70);
        lIIlIIIIlIlll[81] = (-((-16906) & 29531)) & (-16385) & 32759;
        lIIlIIIIlIlll[82] = (((112 + 23) - 50) + 74) ^ (((97 + 89) - 139) + 133);
        lIIlIIIIlIlll[83] = (-29017) & 32765;
        lIIlIIIIlIlll[84] = 191 ^ 147;
        lIIlIIIIlIlll[85] = (-8197) & 11245;
        lIIlIIIIlIlll[86] = (-((-2613) & 6846)) & (-2307) & 16379;
        lIIlIIIIlIlll[87] = 63 ^ 18;
        lIIlIIIIlIlll[88] = 182 ^ 152;
        lIIlIIIIlIlll[89] = "   ".length() ^ (49 ^ 29);
        lIIlIIIIlIlll[90] = (120 ^ 95) ^ (133 ^ 146);
        lIIlIIIIlIlll[91] = (((56 + 29) - 40) + 106) ^ (((10 + 151) - 90) + 95);
        lIIlIIIIlIlll[92] = (96 ^ 63) ^ (4 ^ 104);
        lIIlIIIIlIlll[93] = (((69 + 37) - (-66)) + 17) ^ (((41 + 100) - 132) + 128);
        lIIlIIIIlIlll[94] = (((29 + 37) - 31) + 104) ^ (((73 + 72) - (-21)) + 24);
        lIIlIIIIlIlll[95] = (91 ^ 56) ^ (222 ^ 139);
        lIIlIIIIlIlll[96] = 67 ^ 116;
        lIIlIIIIlIlll[97] = 149 ^ 173;
        lIIlIIIIlIlll[98] = (250 ^ 132) ^ (64 ^ 7);
        lIIlIIIIlIlll[99] = (244 ^ 183) ^ (62 ^ 71);
        lIIlIIIIlIlll[100] = (((22 + 66) - (-15)) + 59) ^ (((72 + 112) - 181) + 150);
        lIIlIIIIlIlll[101] = 19 ^ 47;
        lIIlIIIIlIlll[102] = (32 ^ 113) ^ (14 ^ 98);
        lIIlIIIIlIlll[103] = (((154 + 65) - 184) + 139) ^ (((11 + 32) - (-49)) + 52);
        lIIlIIIIlIlll[104] = (((27 + 69) - 79) + 112) ^ (((30 + 95) - 111) + 176);
        lIIlIIIIlIlll[105] = 193 ^ 129;
        lIIlIIIIlIlll[106] = 24 ^ 89;
        lIIlIIIIlIlll[107] = 208 ^ 146;
        lIIlIIIIlIlll[108] = 27 ^ 88;
        lIIlIIIIlIlll[109] = 27 ^ 95;
        lIIlIIIIlIlll[110] = 107 ^ 46;
        lIIlIIIIlIlll[111] = (((95 + 79) - 160) + 116) ^ (((138 + 24) - 41) + 75);
        lIIlIIIIlIlll[112] = 65 ^ 6;
        lIIlIIIIlIlll[113] = 89 ^ 17;
        lIIlIIIIlIlll[114] = (153 ^ 177) ^ (82 ^ 51);
        lIIlIIIIlIlll[115] = (114 ^ 45) ^ (184 ^ 173);
        lIIlIIIIlIlll[116] = 217 ^ 146;
        lIIlIIIIlIlll[117] = 75 ^ 7;
        lIIlIIIIlIlll[118] = (95 ^ 16) ^ "  ".length();
        lIIlIIIIlIlll[119] = (234 ^ 166) ^ "  ".length();
        lIIlIIIIlIlll[120] = 15 ^ 64;
        lIIlIIIIlIlll[121] = (28 ^ 115) ^ (43 ^ 20);
        lIIlIIIIlIlll[122] = 151 ^ 198;
        lIIlIIIIlIlll[123] = 49 ^ 99;
        lIIlIIIIlIlll[124] = 251 ^ 168;
        lIIlIIIIlIlll[125] = (((151 + 42) - 120) + 163) ^ (((124 + 58) - 123) + 125);
        lIIlIIIIlIlll[126] = 55 ^ 98;
        lIIlIIIIlIlll[127] = 115 ^ 37;
        lIIlIIIIlIlll[128] = 233 ^ 190;
        lIIlIIIIlIlll[129] = (204 ^ 184) ^ (127 ^ 83);
        lIIlIIIIlIlll[130] = 111 ^ 54;
        lIIlIIIIlIlll[131] = (((100 + 60) - 106) + 190) ^ (((143 + 47) - 77) + 62);
        lIIlIIIIlIlll[132] = 226 ^ 190;
        lIIlIIIIlIlll[133] = (149 ^ 135) ^ (218 ^ 149);
        lIIlIIIIlIlll[134] = (213 ^ 166) ^ (75 ^ 102);
        lIIlIIIIlIlll[135] = (161 ^ 179) ^ (143 ^ 194);
        lIIlIIIIlIlll[136] = 224 ^ 128;
        lIIlIIIIlIlll[137] = 99 ^ 2;
        lIIlIIIIlIlll[138] = (-((-23514) & 31739)) & (-1043) & 12279;
        lIIlIIIIlIlll[139] = (-((-417) & 24995)) & (-393) & 28159;
        lIIlIIIIlIlll[140] = 254 ^ 156;
        lIIlIIIIlIlll[141] = 89 ^ 58;
        lIIlIIIIlIlll[142] = 228 ^ 128;
        lIIlIIIIlIlll[143] = 68 ^ 33;
        lIIlIIIIlIlll[144] = 34 ^ 68;
        lIIlIIIIlIlll[145] = (4 ^ 8) ^ (85 ^ 62);
        lIIlIIIIlIlll[146] = (((35 + 160) - 151) + 177) ^ (((14 + 34) - 7) + 140);
        lIIlIIIIlIlll[147] = (232 ^ 137) ^ (148 ^ 156);
        lIIlIIIIlIlll[148] = 254 ^ 148;
        lIIlIIIIlIlll[149] = (-((-8257) & 9413)) & (-28689) & 32766;
        lIIlIIIIlIlll[150] = (-8794) & 12031;
        lIIlIIIIlIlll[151] = (-((-19046) & 32383)) & (-16387) & 32639;
        lIIlIIIIlIlll[152] = (-2561) & 12196;
        lIIlIIIIlIlll[153] = (-((-18885) & 19911)) & (-12289) & 16255;
        lIIlIIIIlIlll[154] = (-((-24707) & 25034)) & (-521) & 4095;
        lIIlIIIIlIlll[155] = 173 ^ 198;
        lIIlIIIIlIlll[156] = (97 ^ 94) ^ (209 ^ 130);
        lIIlIIIIlIlll[157] = 207 ^ 162;
        lIIlIIIIlIlll[158] = (-13319) & 16239;
        lIIlIIIIlIlll[159] = (-25422) & 28671;
        lIIlIIIIlIlll[160] = (-((-4673) & 14017)) & (-20481) & 32747;
        lIIlIIIIlIlll[161] = (-((-3059) & 31739)) & (-769) & 32703;
        lIIlIIIIlIlll[162] = (-41) & 1583;
        lIIlIIIIlIlll[163] = (-28678) & 31607;
        lIIlIIIIlIlll[164] = (-((-1185) & 9705)) & (-21011) & 32767;
        lIIlIIIIlIlll[165] = 39 ^ 73;
        lIIlIIIIlIlll[166] = (-3) & 3971;
        lIIlIIIIlIlll[167] = (60 ^ 116) ^ (116 ^ 83);
        lIIlIIIIlIlll[168] = 177 ^ 193;
        lIIlIIIIlIlll[169] = (-1153) & 4078;
        lIIlIIIIlIlll[170] = (-((-2741) & 11253)) & (-4097) & 15861;
        lIIlIIIIlIlll[171] = 178 ^ 195;
        lIIlIIIIlIlll[172] = 0 ^ 114;
        lIIlIIIIlIlll[173] = (66 ^ 7) ^ (147 ^ 165);
        lIIlIIIIlIlll[174] = 202 ^ 190;
        lIIlIIIIlIlll[175] = 103 ^ 18;
        lIIlIIIIlIlll[176] = (-29699) & 32634;
        lIIlIIIIlIlll[177] = (-((-261) & 8542)) & (-20995) & 32511;
        lIIlIIIIlIlll[178] = (-20629) & 22172;
        lIIlIIIIlIlll[179] = (((39 + 51) - 33) + 150) ^ (((21 + 103) - 81) + 142);
        lIIlIIIIlIlll[180] = (-12377) & 16351;
        lIIlIIIIlIlll[181] = (((134 + 25) - (-82)) + 8) ^ (((33 + 15) - 1) + 95);
        lIIlIIIIlIlll[182] = (104 ^ 60) ^ (83 ^ 127);
        lIIlIIIIlIlll[183] = (-29837) & 32767;
        lIIlIIIIlIlll[184] = (-((-23828) & 32535)) & (-20489) & 32447;
        lIIlIIIIlIlll[185] = 237 ^ 148;
        lIIlIIIIlIlll[186] = (202 ^ 191) ^ (184 ^ 183);
        lIIlIIIIlIlll[187] = (122 ^ 22) ^ (151 ^ 128);
        lIIlIIIIlIlll[188] = 213 ^ 169;
        lIIlIIIIlIlll[189] = (-30849) & 32393;
        lIIlIIIIlIlll[190] = (89 ^ 47) ^ (2 ^ 9);
        lIIlIIIIlIlll[191] = (-12306) & 16277;
        lIIlIIIIlIlll[192] = 49 ^ 79;
        lIIlIIIIlIlll[193] = (((106 ^ 4) + " ".length()) - (30 ^ 19)) + (104 ^ 117);
        lIIlIIIIlIlll[194] = (-((-4865) & 30612)) & (-1) & 28671;
        lIIlIIIIlIlll[195] = (((177 ^ 134) + (79 ^ 20)) - (((93 + 34) - 0) + 2)) + (222 ^ 177);
        lIIlIIIIlIlll[196] = (((75 ^ 24) + (55 ^ 45)) - (126 ^ 23)) + (35 ^ 94);
        lIIlIIIIlIlll[197] = ((12 + 79) - (-22)) + 17;
        lIIlIIIIlIlll[198] = ((44 + 126) - 58) + 19;
        lIIlIIIIlIlll[199] = (-9345) & 12283;
        lIIlIIIIlIlll[200] = (-21063) & 24302;
        lIIlIIIIlIlll[201] = ((3 + 110) - (-19)) + 0;
        lIIlIIIIlIlll[202] = ((55 + 123) - 132) + 87;
        lIIlIIIIlIlll[203] = (-((-13658) & 32605)) & (-4097) & 32695;
        lIIlIIIIlIlll[204] = (-1163) & 4095;
        lIIlIIIIlIlll[205] = (-22529) & 32174;
        lIIlIIIIlIlll[206] = (-2581) & 12223;
        lIIlIIIIlIlll[207] = (-((-5646) & 30271)) & (-2369) & 28539;
        lIIlIIIIlIlll[208] = ((44 + 103) - 40) + 27;
        lIIlIIIIlIlll[209] = (-((-28317) & 32510)) & (-8193) & 16365;
        lIIlIIIIlIlll[210] = (((8 ^ 1) + (60 ^ 25)) - (-(17 ^ 28))) + (225 ^ 173);
        lIIlIIIIlIlll[211] = ((38 + 115) - 77) + 60;
        lIIlIIIIlIlll[212] = (-((-20771) & 21302)) & (-6209) & 16383;
        lIIlIIIIlIlll[213] = (((32 ^ 105) + (116 ^ 48)) - (98 ^ 91)) + (32 ^ 21);
        lIIlIIIIlIlll[214] = ((61 + 99) - 83) + 61;
        lIIlIIIIlIlll[215] = ((129 + 87) - 161) + 84;
        lIIlIIIIlIlll[216] = (-20849) & 22395;
        lIIlIIIIlIlll[217] = ((61 + 1) - (-25)) + 53;
        lIIlIIIIlIlll[218] = (-1033) & 1855;
        lIIlIIIIlIlll[219] = (((247 ^ 185) + (36 ^ 13)) - (0 ^ 76)) + (202 ^ 168);
        lIIlIIIIlIlll[220] = (((76 ^ 83) + (11 ^ 68)) - (-(1 ^ 12))) + (110 ^ 125);
        lIIlIIIIlIlll[221] = (-129) & 3057;
        lIIlIIIIlIlll[222] = (-4173) & 13823;
        lIIlIIIIlIlll[223] = (((((103 + 12) - 21) + 42) + (248 ^ 178)) - (50 ^ 83)) + (167 ^ 185);
        lIIlIIIIlIlll[224] = (((216 ^ 182) + (185 ^ 197)) - (((105 + 28) - (-47)) + 32)) + (69 ^ 63);
        lIIlIIIIlIlll[225] = (((145 ^ 154) + (102 ^ 105)) - (-(25 ^ 39))) + (1 ^ 56);
        lIIlIIIIlIlll[226] = ((64 + 20) - 79) + 141;
        lIIlIIIIlIlll[227] = (-((-17543) & 30183)) & (-16531) & 30718;
        lIIlIIIIlIlll[228] = (((((29 + 55) - (-39)) + 14) + (49 ^ 32)) - (((24 + 14) - (-95)) + 11)) + ((86 + 114) - 153) + 90;
        lIIlIIIIlIlll[229] = (((175 ^ 143) + (212 ^ 184)) - "  ".length()) + (2 ^ 8);
        lIIlIIIIlIlll[230] = (-((-26465) & 32617)) & (-16449) & 32255;
        lIIlIIIIlIlll[231] = (((((123 + 78) - 194) + 125) + (((43 + 31) - 56) + 119)) - (((115 + 62) - 170) + 135)) + (85 ^ 67);
        lIIlIIIIlIlll[232] = (((83 ^ 52) + (((117 + 112) - 221) + 121)) - (((65 + 70) - 85) + 120)) + (246 ^ 174);
        lIIlIIIIlIlll[233] = ((141 + 17) - 122) + 115;
        lIIlIIIIlIlll[234] = ((29 + 114) - 40) + 49;
        lIIlIIIIlIlll[235] = ((110 + 89) - 103) + 57;
        lIIlIIIIlIlll[236] = (((((28 + 130) - 51) + 38) + (((25 + 79) - 94) + 141)) - (((183 + 18) - 99) + 106)) + (27 ^ 89);
        lIIlIIIIlIlll[237] = ((25 + 106) - (-5)) + 19;
        lIIlIIIIlIlll[238] = ((85 + 72) - 85) + 84;
        lIIlIIIIlIlll[239] = ((53 + 60) - (-19)) + 25;
        lIIlIIIIlIlll[240] = ((76 + 44) - 103) + 141;
        lIIlIIIIlIlll[241] = ((51 + 88) - 76) + 96;
        lIIlIIIIlIlll[242] = ((136 + 126) - 244) + 142;
        lIIlIIIIlIlll[243] = ((127 + 128) - 152) + 58;
        lIIlIIIIlIlll[244] = (((60 ^ 106) + "  ".length()) - (24 ^ 10)) + (99 ^ 63);
        lIIlIIIIlIlll[245] = (((((154 + 126) - 165) + 41) + (168 ^ 131)) - (((85 + 138) - 96) + 26)) + (19 ^ 102);
        lIIlIIIIlIlll[246] = (((128 ^ 186) + (((18 + 17) - 33) + 142)) - (((29 + 51) - 23) + 79)) + (65 ^ 35);
        lIIlIIIIlIlll[247] = ((84 + 56) - 41) + 66;
        lIIlIIIIlIlll[248] = ((117 + 36) - 146) + 159;
        lIIlIIIIlIlll[249] = ((165 + 91) - 216) + 127;
        lIIlIIIIlIlll[250] = ((108 + 43) - 144) + 161;
        lIIlIIIIlIlll[251] = (((61 ^ 71) + (((164 + 93) - 213) + 124)) - (230 ^ 159)) + ((16 ^ 88) & ((23 ^ 95) ^ (-1)));
        lIIlIIIIlIlll[252] = (((35 ^ 13) + (((115 + 30) - (-2)) + 17)) - (((63 + 71) - 83) + 77)) + (4 ^ 92);
        lIIlIIIIlIlll[253] = (((73 ^ 114) + (12 ^ 80)) - (90 ^ 63)) + (83 ^ 42);
        lIIlIIIIlIlll[254] = ((" ".length() + (((56 + 88) - 68) + 75)) - (197 ^ 169)) + ((8 + 83) - (-8)) + 29;
        lIIlIIIIlIlll[255] = (((221 ^ 134) + (((32 + 85) - 85) + 104)) - (((106 + 36) - 3) + 2)) + (253 ^ 170);
        lIIlIIIIlIlll[256] = (((126 ^ 28) + (226 ^ 164)) - (73 ^ 98)) + (112 ^ 65);
        lIIlIIIIlIlll[257] = ((64 + 46) - (-20)) + 45;
        lIIlIIIIlIlll[258] = (-((-3609) & 19993)) & (-8646) & 28127;
        lIIlIIIIlIlll[259] = (-((-6666) & 31247)) & (-4097) & 31935;
        lIIlIIIIlIlll[260] = (((129 ^ 148) + (26 ^ 83)) - (-(154 ^ 131))) + (47 ^ 20);
        lIIlIIIIlIlll[261] = ((68 + 83) - 57) + 85;
        lIIlIIIIlIlll[262] = ((119 + 94) - 177) + 144;
        lIIlIIIIlIlll[263] = ((131 + 70) - 106) + 86;
        lIIlIIIIlIlll[264] = ((77 + 146) - 65) + 24;
        lIIlIIIIlIlll[265] = (((146 ^ 177) + (71 ^ 9)) - (-(210 ^ 198))) + (26 ^ 40);
        lIIlIIIIlIlll[266] = ((134 + 53) - 45) + 42;
        lIIlIIIIlIlll[267] = (((69 ^ 66) + (122 ^ 64)) - (-(220 ^ 136))) + (65 ^ 101);
        lIIlIIIIlIlll[268] = (((21 ^ 58) + (((23 + 130) - 88) + 76)) - (140 ^ 153)) + (190 ^ 173);
        lIIlIIIIlIlll[269] = (-((-13089) & 30578)) & (-12419) & 32731;
        lIIlIIIIlIlll[270] = (-((-13511) & 30415)) & (-6177) & 32703;
        lIIlIIIIlIlll[271] = (-((-8705) & 14026)) & (-8229) & 16383;
        lIIlIIIIlIlll[272] = (((((89 + 102) - 161) + 116) + (7 ^ 60)) - (((66 + 128) - 130) + 101)) + ((95 + 47) - 34) + 39;
        lIIlIIIIlIlll[273] = (((95 ^ 110) + (47 ^ 96)) - (128 ^ 189)) + (62 ^ 71);
        lIIlIIIIlIlll[274] = (((116 ^ 25) + (((149 + 32) - 166) + 141)) - (((53 + 114) - 153) + 131)) + (101 ^ 32);
        lIIlIIIIlIlll[275] = ((158 + 150) - 264) + 146;
        lIIlIIIIlIlll[276] = (-28737) & 31581;
        lIIlIIIIlIlll[277] = ((178 + 129) - 154) + 38;
        lIIlIIIIlIlll[278] = (((((36 + 128) - 110) + 122) + (193 ^ 187)) - (((142 + 170) - 97) + 5)) + (202 ^ 184);
        lIIlIIIIlIlll[279] = (((((87 + 26) - 16) + 52) + (((41 + 50) - (-43)) + 11)) - (((100 + 97) - 90) + 131)) + ((5 + 32) - 11) + 111;
        lIIlIIIIlIlll[280] = (((((77 + 159) - 129) + 70) + (109 ^ 7)) - ((-18145) & 18424)) + ((183 + 25) - 154) + 137;
        lIIlIIIIlIlll[281] = (((((63 + 36) - 43) + 95) + (42 ^ 70)) - (27 ^ 119)) + (125 ^ 81);
        lIIlIIIIlIlll[282] = (((216 ^ 178) + (26 ^ 94)) - (58 ^ 47)) + (0 ^ 43);
        lIIlIIIIlIlll[283] = (((246 ^ 159) + (58 ^ 111)) - (139 ^ 165)) + (134 ^ 179);
        lIIlIIIIlIlll[284] = ((80 + 182) - 246) + 182;
        lIIlIIIIlIlll[285] = ((159 + 55) - 22) + 7;
        lIIlIIIIlIlll[286] = ((40 + 61) - (-32)) + 67;
        lIIlIIIIlIlll[287] = ((116 + 1) - (-23)) + 61;
        lIIlIIIIlIlll[288] = ((0 + 17) - (-18)) + 167;
        lIIlIIIIlIlll[289] = ((45 + 155) - 146) + 149;
        lIIlIIIIlIlll[290] = (((238 ^ 142) + (((128 + 120) - 142) + 78)) - (((128 + 41) - (-17)) + 7)) + (88 ^ 45);
        lIIlIIIIlIlll[291] = (-16403) & 20383;
        lIIlIIIIlIlll[292] = ((141 + 63) - 74) + 75;
        lIIlIIIIlIlll[293] = (((32 ^ 23) + "  ".length()) - (-(53 ^ 123))) + (46 ^ 105);
        lIIlIIIIlIlll[294] = -" ".length();
        lIIlIIIIlIlll[295] = ((61 + 44) - 54) + 156;
        lIIlIIIIlIlll[296] = (((245 ^ 143) + (((58 + 36) - 32) + 114)) - ((-13927) & 14207)) + ((127 + 125) - 225) + 164;
        lIIlIIIIlIlll[297] = ((96 + 97) - 151) + 167;
        lIIlIIIIlIlll[298] = ((178 + 203) - 184) + 13;
        lIIlIIIIlIlll[299] = (((((68 + 44) - 11) + 62) + (((62 + 137) - 106) + 68)) - (((148 + 45) - 18) + 3)) + (250 ^ 187);
        lIIlIIIIlIlll[300] = (((((132 + 59) - 147) + 105) + (192 ^ 146)) - (7 ^ 63)) + (73 ^ 108);
        lIIlIIIIlIlll[301] = ((166 + 121) - 149) + 75;
        lIIlIIIIlIlll[302] = (((38 ^ 80) + (((14 + 2) - (-169)) + 12)) - ((-22209) & 22521)) + ((48 + 165) - 17) + 16;
        lIIlIIIIlIlll[303] = (((138 ^ 144) + (((67 + 73) - 58) + 66)) - (65 ^ 98)) + (44 ^ 96);
        lIIlIIIIlIlll[304] = (((198 ^ 141) + (203 ^ 136)) - (-(203 ^ 141))) + (134 ^ 130);
        lIIlIIIIlIlll[305] = (-((-1667) & 22455)) & (-8266) & 30591;
        lIIlIIIIlIlll[306] = ((197 + 26) - 98) + 92;
        lIIlIIIIlIlll[307] = ((162 + 166) - 127) + 17;
        lIIlIIIIlIlll[308] = (((((154 + 59) - 74) + 55) + (119 ^ 14)) - (247 ^ 154)) + (31 ^ 18);
        lIIlIIIIlIlll[309] = (-((-419) & 15802)) & (-1) & 16383;
        lIIlIIIIlIlll[310] = (-8465) & 28464;
        lIIlIIIIlIlll[311] = (-((-2971) & 8091)) & (-87) & 30206;
        lIIlIIIIlIlll[312] = (-((-8583) & 30151)) & (-8711) & 65278;
        lIIlIIIIlIlll[313] = (-4115) & 16094;
        lIIlIIIIlIlll[314] = (-10828) & 12127;
        lIIlIIIIlIlll[315] = ((124 + 43) - (-25)) + 28;
        lIIlIIIIlIlll[316] = ((70 + 73) - (-76)) + 2;
        lIIlIIIIlIlll[317] = (((41 ^ 64) + (203 ^ 129)) - (-(8 ^ 40))) + (113 ^ 122);
        lIIlIIIIlIlll[318] = ((116 + 204) - 220) + 123;
        lIIlIIIIlIlll[319] = (((((75 + 114) - 108) + 105) + (((2 + 137) - 97) + 132)) - ((-6274) & 6573)) + ((43 + 138) - 118) + 101;
        lIIlIIIIlIlll[320] = ((179 + 216) - 289) + 119;
        lIIlIIIIlIlll[321] = (((127 ^ 100) + (128 ^ 163)) - (-(((136 + 97) - 186) + 116))) + " ".length();
        lIIlIIIIlIlll[322] = ((176 + 109) - 168) + 110;
        lIIlIIIIlIlll[323] = ((56 + 134) - 9) + 47;
        lIIlIIIIlIlll[324] = (((214 ^ 141) + (67 ^ 33)) - (-(31 ^ 25))) + (146 ^ 176);
        lIIlIIIIlIlll[325] = ((34 + 212) - 154) + 138;
        lIIlIIIIlIlll[326] = (((4 ^ 122) + (87 ^ 3)) - (((94 + 81) - 166) + 161)) + ((10 + 78) - (-51)) + 52;
        lIIlIIIIlIlll[327] = ((171 + 46) - 142) + 157;
        lIIlIIIIlIlll[328] = (((((105 + 71) - 169) + 184) + (250 ^ 130)) - (((158 + 111) - 170) + 115)) + ((111 + 84) - 70) + 11;
        lIIlIIIIlIlll[329] = ((197 + 88) - 87) + 36;
        lIIlIIIIlIlll[330] = (((37 ^ 29) + (((57 + 3) - (-53)) + 26)) - (103 ^ 127)) + (90 ^ 26);
        lIIlIIIIlIlll[331] = (((188 ^ 159) + (73 ^ 115)) - (-(139 ^ 171))) + (200 ^ 167);
        lIIlIIIIlIlll[332] = ((87 + 175) - 151) + 126;
        lIIlIIIIlIlll[333] = ((194 + 187) - 378) + 235;
        lIIlIIIIlIlll[334] = ((94 + 33) - (-94)) + 18;
        lIIlIIIIlIlll[335] = ((72 + 158) - 143) + 153;
        lIIlIIIIlIlll[336] = (((((133 + 28) - (-7)) + 13) + (12 ^ 62)) - (((43 + 75) - 58) + 68)) + ((108 + 93) - 81) + 18;
        lIIlIIIIlIlll[337] = (((91 ^ 10) + (((33 + 177) - 117) + 89)) - (((156 + 28) - (-8)) + 3)) + ((171 + 18) - 47) + 32;
        lIIlIIIIlIlll[338] = ((146 + 4) - 61) + 154;
        lIIlIIIIlIlll[339] = ((18 + 112) - (-41)) + 73;
        lIIlIIIIlIlll[340] = ((186 + 136) - 288) + 211;
        lIIlIIIIlIlll[341] = (-393) & 3583;
        lIIlIIIIlIlll[342] = (-16897) & 20258;
        lIIlIIIIlIlll[343] = (-12291) & 15358;
        lIIlIIIIlIlll[344] = (-((-1061) & 13925)) & (-1) & 16382;
        lIIlIIIIlIlll[345] = (-((-17193) & 21309)) & (-8961) & 16286;
        lIIlIIIIlIlll[346] = (-10) & 3231;
        lIIlIIIIlIlll[347] = (-((-4613) & 30222)) & (-1) & 28655;
        lIIlIIIIlIlll[348] = (-12649) & 15851;
        lIIlIIIIlIlll[349] = ((20 + 73) - (-144)) + 9;
        lIIlIIIIlIlll[350] = (((((126 + 206) - 209) + 89) + ((114 ^ 48) & ((30 ^ 92) ^ (-1)))) - (((147 + 22) - 114) + 96)) + ((138 + 74) - 183) + 157;
        lIIlIIIIlIlll[351] = (((68 ^ 90) + (((93 + 44) - 95) + 124)) - (15 ^ 54)) + (88 ^ 53);
        lIIlIIIIlIlll[352] = (((94 ^ 102) + (((151 + 49) - 43) + 25)) - (((168 + 182) - 168) + 32)) + ((92 + 10) - (-33)) + 90;
        lIIlIIIIlIlll[353] = (((((38 + 67) - 10) + 60) + (((179 + 26) - 72) + 48)) - (111 ^ 27)) + (70 ^ 88);
        lIIlIIIIlIlll[354] = ((102 + 11) - 27) + 165;
        lIIlIIIIlIlll[355] = (((((4 + 15) - (-107)) + 86) + (11 ^ 110)) - (197 ^ 152)) + (62 ^ 30);
        lIIlIIIIlIlll[356] = (((((81 + 172) - 154) + 85) + (137 ^ 195)) - (118 ^ 78)) + (159 ^ 172);
        lIIlIIIIlIlll[357] = ((121 + 65) - 4) + 72;
        lIIlIIIIlIlll[358] = (((78 ^ 91) + (((124 + 151) - 115) + 4)) - (-(56 ^ 121))) + (11 ^ 14);
        lIIlIIIIlIlll[359] = (-((-869) & 26604)) & (-6249) & 32239;
        lIIlIIIIlIlll[360] = (-19521) & 19777;
        lIIlIIIIlIlll[361] = (-((-4943) & 22383)) & (-12317) & 30014;
        lIIlIIIIlIlll[362] = (-10785) & 11043;
        lIIlIIIIlIlll[363] = (-((-16677) & 26605)) & (-22546) & 32733;
        lIIlIIIIlIlll[364] = (-27833) & 28093;
        lIIlIIIIlIlll[365] = (-((-7461) & 32766)) & (-6177) & 31743;
    }

    private static boolean lIlIIlllllllIll(int i2) {
        return i2 < 0;
    }

    private static String lIlIIlllIIlIlIl(String llllllllllllllIllllllIllIllllllI, String llllllllllllllIllllllIllIlllllIl) {
        try {
            SecretKeySpec llllllllllllllIllllllIlllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIllIlllllIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIlll[16]), "DES");
            Cipher llllllllllllllIllllllIlllIIIIIII = Cipher.getInstance("DES");
            llllllllllllllIllllllIlllIIIIIII.init(lIIlIIIIlIlll[2], llllllllllllllIllllllIlllIIIIIIl);
            return new String(llllllllllllllIllllllIlllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIllIlllllll) {
            llllllllllllllIllllllIllIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllllllllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIlIlll[0];
    }

    private static boolean lIlIlIIIIIIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIIIIIIIIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIlIIIIIIIIlI(int i2, int i3) {
        return i2 != i3;
    }

    private static String lIlIIlllIIlIllI(String llllllllllllllIllllllIlllIIIlIll, String llllllllllllllIllllllIlllIIIlIII) {
        try {
            SecretKeySpec llllllllllllllIllllllIlllIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlllIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIIlIlll[2], llllllllllllllIllllllIlllIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllllIlllIIIllII) {
            llllllllllllllIllllllIlllIIIllII.printStackTrace();
            return null;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bp();
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((((99 + 0) - (-55)) + 97) ^ (((51 + 33) - (-33)) + 44)) & (((135 ^ 184) ^ (25 ^ 124)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIlIlll[142];
    }

    private static boolean lIlIlIIIIIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllllllllIl(C0004e.j(lIIlIIIIlIlll[14]), lIIlIIIIlIlll[23]) && lIlIIlllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            ?? r0 = lIIlIIIIlIlll[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIIlIlll[0];
    }

    private static boolean lIlIIlllllllIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlllllllIII(int i2) {
        return i2 != 0;
    }
}
