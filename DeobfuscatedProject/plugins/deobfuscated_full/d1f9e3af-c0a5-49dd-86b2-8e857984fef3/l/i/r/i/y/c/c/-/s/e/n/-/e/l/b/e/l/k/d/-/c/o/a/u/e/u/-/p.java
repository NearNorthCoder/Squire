/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;

public class p
implements W {
    static /* synthetic */ String cc;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ int[] lIIlIIIlI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int bZ;
    static /* synthetic */ String h;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ int ca;
    private static /* synthetic */ String[] lIIlIIIIl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ int cb;

    @Override
    public String U() {
        return h;
    }

    private static String llllIIIlIlI(String lIIIlIIllIlIIlI, String lIIIlIIllIIllll) {
        try {
            SecretKeySpec lIIIlIIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIllIIllll.getBytes(StandardCharsets.UTF_8)), lIIlIIIlI[17]), "DES");
            Cipher lIIIlIIllIlIlII = Cipher.getInstance("DES");
            lIIIlIIllIlIlII.init(lIIlIIIlI[3], lIIIlIIllIlIlIl);
            return new String(lIIIlIIllIlIlII.doFinal(Base64.getDecoder().decode(lIIIlIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIllIlIIll) {
            lIIIlIIllIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void aD() {
        if (p.llllIIlIIII(bt ? 1 : 0)) {
            b.a(bv);
            if (p.llllIIlIIIl(bv.size(), lIIlIIIlI[0])) {
                System.out.println(lIIlIIIIl[lIIlIIIlI[1]]);
                bt = lIIlIIIlI[1];
            }
        }
        if (p.llllIIlIIlI(bt ? 1 : 0)) {
            Widget[] lIIIlIlIIIlllIl;
            if (p.llllIIlIIlI(p.ab() ? 1 : 0)) {
                lIIIlIlIIIlllIl = BankLocation.getNearest();
                if (p.llllIIlIIll(lIIIlIlIIIlllIl) && p.llllIIlIIlI(lIIIlIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[0]];
                    a.a((BankLocation)lIIIlIlIIIlllIl);
                }
                if (p.llllIIlIIll(lIIIlIlIIIlllIl) && p.llllIIlIIII(lIIIlIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (p.llllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIlI[2]);
                        0;
                    }
                    if (p.llllIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[3]];
                        if (p.llllIIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIIlI[4]);
                            0;
                        }
                        if (p.llllIIlIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIIlI[3]);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIlI[5]];
                        nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
                        nArray[p.lIIlIIIlI[0]] = lIIlIIIlI[7];
                        nArray[p.lIIlIIIlI[3]] = lIIlIIIlI[8];
                        nArray[p.lIIlIIIlI[9]] = lIIlIIIlI[10];
                        nArray[p.lIIlIIIlI[4]] = lIIlIIIlI[11];
                        if (p.llllIIlIIlI(e.b(nArray) ? 1 : 0)) {
                            p.af();
                            System.out.println(lIIlIIIIl[lIIlIIIlI[9]]);
                            bt = lIIlIIIlI[0];
                            return;
                        }
                        int[] nArray2 = new int[lIIlIIIlI[5]];
                        nArray2[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
                        nArray2[p.lIIlIIIlI[0]] = lIIlIIIlI[7];
                        nArray2[p.lIIlIIIlI[3]] = lIIlIIIlI[8];
                        nArray2[p.lIIlIIIlI[9]] = lIIlIIIlI[10];
                        nArray2[p.lIIlIIIlI[4]] = lIIlIIIlI[11];
                        if (p.llllIIlIIII(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIlIIIlI[6], lIIlIIIlI[12]);
                            a.a(lIIlIIIlI[7], lIIlIIIlI[12]);
                            a.a(lIIlIIIlI[8], lIIlIIIlI[12]);
                            a.a(lIIlIIIlI[10], lIIlIIIlI[12]);
                            a.a(lIIlIIIlI[11], lIIlIIIlI[5]);
                        }
                    }
                }
            }
            if (p.llllIIlIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && p.llllIIlIIIl(Movement.getRunEnergy(), lIIlIIIlI[13])) {
                Inventory.getFirst((int[])f.aV).interact(lIIlIIIIl[lIIlIIIlI[4]]);
                Time.sleepTicks((int)lIIlIIIlI[0]);
                0;
            }
            if (p.llllIIlIIII(Inventory.contains((int[])f.aS) ? 1 : 0) && p.llllIIlIIIl(Prayers.getPoints(), lIIlIIIlI[14])) {
                Inventory.getFirst((int[])f.aS).interact(lIIlIIIIl[lIIlIIIlI[5]]);
            }
            if (p.llllIIlIlIl(p.llllIIIllll(e.u(), 60.0))) {
                String[] stringArray = new String[lIIlIIIlI[0]];
                stringArray[p.lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[15]];
                if (p.llllIIlIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIlIIIlI[0]];
                    stringArray2[p.lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[16]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIlIIIIl[lIIlIIIlI[17]]);
                    Time.sleepTicks((int)lIIlIIIlI[3]);
                    0;
                }
            }
            if (p.llllIIlIIII(p.ab() ? 1 : 0)) {
                WorldPoint lIIIlIlIIIllIII;
                if (p.llllIIlIIIl(bZ, lIIlIIIlI[0])) {
                    Tabs.open((Tab)Tab.INVENTORY);
                    Time.sleepTicks((int)lIIlIIIlI[0]);
                    0;
                    Tabs.open((Tab)Tab.MUSIC);
                    Time.sleepTicks((int)lIIlIIIlI[0]);
                    0;
                    bZ += lIIlIIIlI[0];
                }
                lIIIlIlIIIlllIl = Widgets.get((int)lIIlIIIlI[18], (int)lIIlIIIlI[15]).getChildren();
                List lIIIlIlIIIlllII = Arrays.stream(lIIIlIlIIIlllIl).filter(widget -> {
                    int n2;
                    if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[14]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                        n2 = lIIlIIIlI[0];
                        0;
                        if (3 <= ((74 + 62 - 53 + 67 ^ 21 + 67 - -18 + 50) & (55 + 150 - 33 + 8 ^ 69 + 158 - 129 + 92 ^ -1))) {
                            return ((0x63 ^ 0x6A ^ (0x55 ^ 0x7D)) & (0x23 ^ 0x70 ^ (0x6A ^ 0x18) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIIlIIIlI[1];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
                List lIIIlIlIIIllIll = Arrays.stream(lIIIlIlIIIlllIl).filter(widget -> {
                    int n2;
                    if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[49]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                        n2 = lIIlIIIlI[0];
                        0;
                        if ((0xD7 ^ 0x9A ^ (0x25 ^ 0x6C)) == ((0x8C ^ 0x89 ^ (0xE6 ^ 0x80)) & (150 + 1 - -36 + 65 ^ 24 + 28 - -106 + 1 ^ -1))) {
                            return ((0x8C ^ 0xAD ^ (0x2E ^ 0x37)) & (0x29 ^ 0x3F ^ (0x6F ^ 0x41) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIIlIIIlI[1];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
                List lIIIlIlIIIllIlI = Arrays.stream(lIIIlIlIIIlllIl).filter(widget -> {
                    int n2;
                    if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[48]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                        n2 = lIIlIIIlI[0];
                        0;
                        if (3 < 2) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIIIlI[1];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
                List lIIIlIlIIIllIIl = Arrays.stream(lIIIlIlIIIlllIl).filter(widget -> {
                    int n2;
                    if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[47]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                        n2 = lIIlIIIlI[0];
                        0;
                        
                        }
                    } else {
                        n2 = lIIlIIIlI[1];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
                if (p.llllIIlIIlI(lIIIlIlIIIllIIl.isEmpty() ? 1 : 0)) {
                    lIIIlIlIIIllIII = new WorldPoint(lIIlIIIlI[19], lIIlIIIlI[20], lIIlIIIlI[1]);
                    WorldPoint lIIIlIlIIIlIlll = new WorldPoint(lIIlIIIlI[21], lIIlIIIlI[22], lIIlIIIlI[1]);
                    if (p.llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIlIlll), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[23]];
                        if (p.llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[4])) {
                            Movement.walkTo((WorldPoint)lIIIlIlIIIllIII);
                            0;
                            Time.sleepTicks((int)lIIlIIIlI[0]);
                            0;
                        }
                        if (p.llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[4])) {
                            AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[12]];
                            String[] stringArray = new String[lIIlIIIlI[0]];
                            stringArray[p.lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[24]];
                            TileObject lIIIlIlIIIlIllI = TileObjects.getNearest((String[])stringArray);
                            lIIIlIlIIIlIllI.interact(lIIlIIIIl[lIIlIIIlI[25]]);
                            Time.sleepTicks((int)lIIlIIIlI[9]);
                            0;
                        }
                    }
                    if (p.llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIlIlll), lIIlIIIlI[5])) {
                        Tabs.open((Tab)Tab.INVENTORY);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                        Tabs.open((Tab)Tab.MUSIC);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                }
                if (p.llllIIlIIII(lIIIlIlIIIllIIl.isEmpty() ? 1 : 0) && p.llllIIlIIlI(lIIIlIlIIIllIlI.isEmpty() ? 1 : 0)) {
                    lIIIlIlIIIllIII = new WorldPoint(lIIlIIIlI[26], lIIlIIIlI[27], lIIlIIIlI[1]);
                    if (p.llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[28]];
                        Movement.walkTo((WorldPoint)lIIIlIlIIIllIII);
                        0;
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                    if (p.llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        Tabs.open((Tab)Tab.INVENTORY);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                        Tabs.open((Tab)Tab.MUSIC);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                }
                if (p.llllIIlIIII(lIIIlIlIIIllIIl.isEmpty() ? 1 : 0) && p.llllIIlIIII(lIIIlIlIIIllIlI.isEmpty() ? 1 : 0) && p.llllIIlIIlI(lIIIlIlIIIlllII.isEmpty() ? 1 : 0)) {
                    lIIIlIlIIIllIII = new WorldPoint(lIIlIIIlI[29], lIIlIIIlI[30], lIIlIIIlI[1]);
                    if (p.llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[31]];
                        e.a(lIIIlIlIIIllIII);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                    if (p.llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        Tabs.open((Tab)Tab.INVENTORY);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                        Tabs.open((Tab)Tab.MUSIC);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                }
                if (p.llllIIlIIII(lIIIlIlIIIllIIl.isEmpty() ? 1 : 0) && p.llllIIlIIII(lIIIlIlIIIllIlI.isEmpty() ? 1 : 0) && p.llllIIlIIII(lIIIlIlIIIlllII.isEmpty() ? 1 : 0) && p.llllIIlIIlI(lIIIlIlIIIllIll.isEmpty() ? 1 : 0)) {
                    lIIIlIlIIIllIII = new WorldPoint(lIIlIIIlI[32], lIIlIIIlI[33], lIIlIIIlI[1]);
                    if (p.llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[34]];
                        e.a(lIIIlIlIIIllIII);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                    if (p.llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(lIIIlIlIIIllIII), lIIlIIIlI[5])) {
                        Tabs.open((Tab)Tab.INVENTORY);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                        Tabs.open((Tab)Tab.MUSIC);
                        Time.sleepTicks((int)lIIlIIIlI[0]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean llllIIlIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIIlIIIlI[1];
    }

    static {
        p.llllIIIlllI();
        p.llllIIIllIl();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIlIIIlI[1], lIIlIIIlI[1], lIIlIIIlI[1]);
        bY = lIIlIIIlI[1];
        String[] stringArray = new String[lIIlIIIlI[0]];
        stringArray[p.lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[50]];
        bR = stringArray;
        ca = lIIlIIIlI[51];
        cb = lIIlIIIlI[52];
        cc = lIIlIIIIl[lIIlIIIlI[53]];
        h = "Music unlocks " + cc;
    }

    private static String llllIIIlIll(String lIIIlIIllIIIlIl, String lIIIlIIllIIIlII) {
        try {
            SecretKeySpec lIIIlIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIllIIIlll = Cipher.getInstance("Blowfish");
            lIIIlIIllIIIlll.init(lIIlIIIlI[3], lIIIlIIllIIlIII);
            return new String(lIIIlIIllIIIlll.doFinal(Base64.getDecoder().decode(lIIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIllIIIllI) {
            lIIIlIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int T() {
        try {
            p.aD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 > (0 ^ 4)) {
            return (0xC0 ^ 0x81) & ~(0x60 ^ 0x21);
        }
        return lIIlIIIlI[42];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIlIlIIIlIIll;
        int[] nArray = new int[lIIlIIIlI[5]];
        nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
        nArray[p.lIIlIIIlI[0]] = lIIlIIIlI[7];
        nArray[p.lIIlIIIlI[3]] = lIIlIIIlI[8];
        nArray[p.lIIlIIIlI[9]] = lIIlIIIlI[10];
        nArray[p.lIIlIIIlI[4]] = lIIlIIIlI[11];
        int[] nArray2 = nArray;
        int lIIIlIlIIIlIIlI = lIIlIIIlI[1];
        while (p.llllIIlIIIl(lIIIlIlIIIlIIlI, ((void)lIIIlIlIIIlIIll).length)) {
            int[] nArray3 = new int[lIIlIIIlI[0]];
            nArray3[p.lIIlIIIlI[1]] = lIIIlIlIIIlIIll[lIIIlIlIIIlIIlI];
            if (p.llllIIlIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIlI[1];
            }
            ++lIIIlIlIIIlIIlI;
            0;
            if (((0x42 ^ 0x56) & ~(0x4C ^ 0x58)) > -1) continue;
            return false;
        }
        return lIIlIIIlI[0];
    }

    private static String llllIIIllII(String lIIIlIIlllIIlll, String lIIIlIIlllIIIIl) {
        lIIIlIIlllIIlll = new String(Base64.getDecoder().decode(lIIIlIIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlllIIlIl = new StringBuilder();
        char[] lIIIlIIlllIIlII = lIIIlIIlllIIIIl.toCharArray();
        int lIIIlIIlllIIIll = lIIlIIIlI[1];
        char[] lIIIlIIllIlllIl = lIIIlIIlllIIlll.toCharArray();
        int lIIIlIIllIlllII = lIIIlIIllIlllIl.length;
        int lIIIlIIllIllIll = lIIlIIIlI[1];
        while (p.llllIIlIIIl(lIIIlIIllIllIll, lIIIlIIllIlllII)) {
            char lIIIlIIlllIlIII = lIIIlIIllIlllIl[lIIIlIIllIllIll];
            lIIIlIIlllIIlIl.append((char)(lIIIlIIlllIlIII ^ lIIIlIIlllIIlII[lIIIlIIlllIIIll % lIIIlIIlllIIlII.length]));
            0;
            ++lIIIlIIlllIIIll;
            ++lIIIlIIllIllIll;
            0;
            if ((0xCC ^ 0x8E ^ (0xC6 ^ 0x80)) != 3) continue;
            return null;
        }
        return String.valueOf(lIIIlIIlllIIlIl);
    }

    private static boolean llllIIlIlII(int n2) {
        return n2 > 0;
    }

    private static boolean llllIIlIIII(int n2) {
        return n2 != 0;
    }

    private static int llllIIIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llllIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void af() {
        block30: {
            d lIIIlIlIIIIlllI;
            block29: {
                block28: {
                    block27: {
                        block26: {
                            block25: {
                                Object lIIIlIlIIIIllll;
                                block24: {
                                    block23: {
                                        block22: {
                                            block21: {
                                                block20: {
                                                    block19: {
                                                        int[] nArray = new int[lIIlIIIlI[0]];
                                                        nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[7];
                                                        if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                                                        int[] nArray2 = new int[lIIlIIIlI[0]];
                                                        nArray2[p.lIIlIIIlI[1]] = lIIlIIIlI[7];
                                                        if (!p.llllIIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                        int[] nArray3 = new int[lIIlIIIlI[0]];
                                                        nArray3[p.lIIlIIIlI[1]] = lIIlIIIlI[7];
                                                        if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIlIIIlI[12])) break block20;
                                                    }
                                                    lIIIlIlIIIIllll = new d(lIIlIIIlI[7], lIIlIIIlI[12], lIIlIIIlI[35]);
                                                    bv.add((d)lIIIlIlIIIIllll);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIlIIIlI[0]];
                                                nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[10];
                                                if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                                                int[] nArray4 = new int[lIIlIIIlI[0]];
                                                nArray4[p.lIIlIIIlI[1]] = lIIlIIIlI[10];
                                                if (!p.llllIIlIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block22;
                                                int[] nArray5 = new int[lIIlIIIlI[0]];
                                                nArray5[p.lIIlIIIlI[1]] = lIIlIIIlI[10];
                                                if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIIlIIIlI[12])) break block22;
                                            }
                                            lIIIlIlIIIIllll = new d(lIIlIIIlI[10], lIIlIIIlI[12], lIIlIIIlI[35]);
                                            bv.add((d)lIIIlIlIIIIllll);
                                            0;
                                        }
                                        int[] nArray = new int[lIIlIIIlI[0]];
                                        nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[8];
                                        if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray6 = new int[lIIlIIIlI[0]];
                                        nArray6[p.lIIlIIIlI[1]] = lIIlIIIlI[8];
                                        if (!p.llllIIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                        int[] nArray7 = new int[lIIlIIIlI[0]];
                                        nArray7[p.lIIlIIIlI[1]] = lIIlIIIlI[8];
                                        if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIlI[12])) break block24;
                                    }
                                    lIIIlIlIIIIllll = new d(lIIlIIIlI[8], lIIlIIIlI[12], lIIlIIIlI[35]);
                                    bv.add((d)lIIIlIlIIIIllll);
                                    0;
                                }
                                if (p.llllIIlIIlI(Bank.contains((Predicate)(lIIIlIlIIIIllll = item -> item.getName().toLowerCase().contains(lIIlIIIIl[lIIlIIIlI[39]]))) ? 1 : 0)) {
                                    lIIIlIlIIIIlllI = new d(lIIlIIIlI[36], lIIlIIIlI[5], lIIlIIIlI[37]);
                                    bv.add(lIIIlIlIIIIlllI);
                                    0;
                                }
                                int[] nArray = new int[lIIlIIIlI[0]];
                                nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[11];
                                if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                                int[] nArray8 = new int[lIIlIIIlI[0]];
                                nArray8[p.lIIlIIIlI[1]] = lIIlIIIlI[11];
                                if (!p.llllIIlIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block26;
                                int[] nArray9 = new int[lIIlIIIlI[0]];
                                nArray9[p.lIIlIIIlI[1]] = lIIlIIIlI[11];
                                if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIlI[4])) break block26;
                            }
                            lIIIlIlIIIIlllI = new d(lIIlIIIlI[11], lIIlIIIlI[4], i.bq);
                            bv.add(lIIIlIlIIIIlllI);
                            0;
                        }
                        int[] nArray = new int[lIIlIIIlI[0]];
                        nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[38];
                        if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray10 = new int[lIIlIIIlI[0]];
                        nArray10[p.lIIlIIIlI[1]] = lIIlIIIlI[38];
                        if (!p.llllIIlIIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block28;
                        int[] nArray11 = new int[lIIlIIIlI[0]];
                        nArray11[p.lIIlIIIlI[1]] = lIIlIIIlI[38];
                        if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIlI[39])) break block28;
                    }
                    lIIIlIlIIIIlllI = new d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]);
                    bv.add(lIIIlIlIIIIlllI);
                    0;
                }
                int[] nArray = new int[lIIlIIIlI[0]];
                nArray[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
                if (!p.llllIIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray12 = new int[lIIlIIIlI[0]];
                nArray12[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
                if (!p.llllIIlIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block30;
                int[] nArray13 = new int[lIIlIIIlI[0]];
                nArray13[p.lIIlIIIlI[1]] = lIIlIIIlI[6];
                if (!p.llllIIlIIIl(Bank.getFirst((int[])nArray13).getQuantity(), lIIlIIIlI[34])) break block30;
            }
            lIIIlIlIIIIlllI = new d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]);
            bv.add(lIIIlIlIIIIlllI);
            0;
        }
    }

    private static void llllIIIllIl() {
        lIIlIIIIl = new String[lIIlIIIlI[54]];
        p.lIIlIIIIl[p.lIIlIIIlI[1]] = p."Finished buying items, switching back to quest";
        p.lIIlIIIIl[p.lIIlIIIlI[0]] = p."Nav to bank";
        p.lIIlIIIIl[p.lIIlIIIlI[3]] = p."Handling banking";
        p.lIIlIIIIl[p.lIIlIIIlI[9]] = p."We are missing quest supplies, switching to BUYING";
        p.lIIlIIIIl[p.lIIlIIIlI[4]] = p."Drink";
        p.lIIlIIIIl[p.lIIlIIIlI[5]] = p."Drink";
        p.lIIlIIIIl[p.lIIlIIIlI[15]] = p."Shark";
        p.lIIlIIIIl[p.lIIlIIIlI[16]] = p."Shark";
        p.lIIlIIIIl[p.lIIlIIIlI[17]] = p."Eat";
        p.lIIlIIIIl[p.lIIlIIIlI[23]] = p."Nav to draynor manor cellar, unlock tiptoe";
        p.lIIlIIIIl[p.lIIlIIIlI[12]] = p."Walking down stairs";
        p.lIIlIIIIl[p.lIIlIIIlI[24]] = p."Stairs";
        p.lIIlIIIIl[p.lIIlIIIlI[25]] = p."Walk-Down";
        p.lIIlIIIIl[p.lIIlIIIlI[28]] = p."Nav to wizards tower, unlock Vision";
        p.lIIlIIIIl[p.lIIlIIIlI[31]] = p."Nav to west of castle, unlock Rugged Terrain";
        p.lIIlIIIIl[p.lIIlIIIlI[34]] = p."Nav to southern coast hosidius, unlock Forlorn Homestead";
        p.lIIlIIIIl[p.lIIlIIIlI[43]] = p."Tiptoe";
        p.lIIlIIIIl[p.lIIlIIIlI[44]] = p."Vision";
        p.lIIlIIIIl[p.lIIlIIIlI[45]] = p."The Forlorn Homestead";
        p.lIIlIIIIl[p.lIIlIIIlI[46]] = p."Rugged Terrain";
        p.lIIlIIIIl[p.lIIlIIIlI[39]] = p."ring of wealth (";
        p.lIIlIIIIl[p.lIIlIIIlI[47]] = p."Tiptoe";
        p.lIIlIIIIl[p.lIIlIIIlI[48]] = p."Vision";
        p.lIIlIIIIl[p.lIIlIIIlI[49]] = p."The Forlorn Homestead";
        p.lIIlIIIIl[p.lIIlIIIlI[14]] = p."Rugged Terrain";
        p.lIIlIIIIl[p.lIIlIIIlI[50]] = p."Yes.";
        p.lIIlIIIIl[p.lIIlIIIlI[53]] = p."";
    }

    private static boolean llllIIlIlIl(int n2) {
        return n2 < 0;
    }

    private static void llllIIIlllI() {
        lIIlIIIlI = new int[55];
        p.lIIlIIIlI[0] = 1;
        p.lIIlIIIlI[1] = (0xFC ^ 0xB8) & ~(4 ^ 0x40);
        p.lIIlIIIlI[2] = 0xFFFFFB89 & 0x17FE;
        p.lIIlIIIlI[3] = 2;
        p.lIIlIIIlI[4] = 176 + 109 - 136 + 39 ^ 36 + 129 - -19 + 0;
        p.lIIlIIIlI[5] = 0x56 ^ 0x53;
        p.lIIlIIIlI[6] = -(0xFFFFC37D & 0x7CA3) & (0xFFFFFF6F & 0x5FF7);
        p.lIIlIIIlI[7] = -(0xFFFFB8A3 & 0x67FE) & (0xFFFFFFFB & 0x3FEF);
        p.lIIlIIIlI[8] = -(0xFFFFF607 & 0x69FD) & (0xFFFFFF4F & 0x7FFD);
        p.lIIlIIIlI[9] = 3;
        p.lIIlIIIlI[10] = 0xFFFFFF68 & 0x1FDF;
        p.lIIlIIIlI[11] = -(0xFFFFEEFB & 0x5707) & (0xFFFFFF77 & 0x77DB);
        p.lIIlIIIlI[12] = 0x67 ^ 0x6D;
        p.lIIlIIIlI[13] = 0x3F ^ 0xD;
        p.lIIlIIIlI[14] = 0x28 ^ 0x30;
        p.lIIlIIIlI[15] = 0x3E ^ 0x38;
        p.lIIlIIIlI[16] = 0x12 ^ 0x15;
        p.lIIlIIIlI[17] = 6 ^ 0xE;
        p.lIIlIIIlI[18] = 5 + 212 - 148 + 170;
        p.lIIlIIIlI[19] = 0xFFFFCEEC & 0x3D3F;
        p.lIIlIIIlI[20] = -(0xFFFFBD67 & 0x52FB) & (0xFFFFDD7F & 0x3FFE);
        p.lIIlIIIlI[21] = 0xFFFFBE1F & 0x4DE5;
        p.lIIlIIIlI[22] = -(0xFFFFD157 & 0x7FFD) & (0xFFFFF77F & Short.MAX_VALUE);
        p.lIIlIIIlI[23] = 113 + 100 - 97 + 49 ^ 94 + 131 - 135 + 82;
        p.lIIlIIIlI[24] = 0x4C ^ 0x47;
        p.lIIlIIIlI[25] = 0x47 ^ 0x70 ^ (0xB9 ^ 0x82);
        p.lIIlIIIlI[26] = -(0xFFFFE6D7 & 0x3B6D) & (0xFFFFEE6D & 0x3FFF);
        p.lIIlIIIlI[27] = -(0xFFFFF3E7 & 0x6F9F) & (0xFFFFFFF7 & 0x6FFF);
        p.lIIlIIIlI[28] = 0xA9 ^ 0x8A ^ (0x3A ^ 0x14);
        p.lIIlIIIlI[29] = 0xFFFFB672 & 0x4FAF;
        p.lIIlIIIlI[30] = -(0xFFFFFAEF & 0x35B4) & (0xFFFFBEFF & Short.MAX_VALUE);
        p.lIIlIIIlI[31] = 0x34 ^ 0x7A ^ (0x3C ^ 0x7C);
        p.lIIlIIIlI[32] = 0xFFFF972F & 0x6FF6;
        p.lIIlIIIlI[33] = -(0xFFFFB3BB & 0x7C7E) & (0xFFFFBDFF & Short.MAX_VALUE);
        p.lIIlIIIlI[34] = 0x20 ^ 0x2F;
        p.lIIlIIIlI[35] = -(0xFFFFEDA3 & 0x5E5F) & (0xFFFFDFFE & 0x6FFF);
        p.lIIlIIIlI[36] = 0xFFFFAEEC & 0x7FDF;
        p.lIIlIIIlI[37] = 0xFFFFEDAF & 0x73F8;
        p.lIIlIIIlI[38] = -(0x8E ^ 0x9B) & (0xFFFFB59D & 0x4BF7);
        p.lIIlIIIlI[39] = 5 ^ 0x11;
        p.lIIlIIIlI[40] = 0x53 ^ 0x7B;
        p.lIIlIIIlI[41] = 0xFFFFB3A6 & 0x4FDD;
        p.lIIlIIIlI[42] = 0x2C ^ 0x22 ^ (0x16 ^ 0x7C);
        p.lIIlIIIlI[43] = 0x34 ^ 0x24;
        p.lIIlIIIlI[44] = 0x3F ^ 0x2E;
        p.lIIlIIIlI[45] = 102 + 90 - 132 + 84 ^ 100 + 94 - 83 + 19;
        p.lIIlIIIlI[46] = 0x5B ^ 0x10 ^ (0xEA ^ 0xB2);
        p.lIIlIIIlI[47] = 1 ^ 0x5F ^ (0x16 ^ 0x5D);
        p.lIIlIIIlI[48] = 0x6C ^ 9 ^ (0x19 ^ 0x6A);
        p.lIIlIIIlI[49] = 0x22 ^ 0x35;
        p.lIIlIIIlI[50] = 138 + 70 - 129 + 91 ^ 77 + 38 - 87 + 151;
        p.lIIlIIIlI[51] = -(0xFFFFBBD9 & 0x7C37) & (0xFFFFFB9D & 0xDFD7F);
        p.lIIlIIIlI[52] = -(0xFFFFFF76 & 0x6FAF) & (0xFFFFFFAD & 0xFF6F77);
        p.lIIlIIIlI[53] = 0x99 ^ 0x83;
        p.lIIlIIIlI[54] = 51 + 8 - 18 + 91 ^ 149 + 144 - 134 + 0;
    }

    private static boolean llllIIlIIll(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        Widget[] widgetArray = Widgets.get((int)lIIlIIIlI[18], (int)lIIlIIIlI[15]).getChildren();
        List list = Arrays.stream(widgetArray).filter(widget -> {
            int n2;
            if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[46]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                n2 = lIIlIIIlI[0];
                0;
                if (((0x24 ^ 0x39) & ~(0x51 ^ 0x4C)) != 0) {
                    return false;
                }
            } else {
                n2 = lIIlIIIlI[1];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        List list2 = Arrays.stream(widgetArray).filter(widget -> {
            int n2;
            if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[45]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                n2 = lIIlIIIlI[0];
                0;
                if (3 == 1) {
                    return ((0x37 ^ 0x73 ^ (0x69 ^ 3)) & (0x75 ^ 0x38 ^ (0x43 ^ 0x20) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIIIlI[1];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        List list3 = Arrays.stream(widgetArray).filter(widget -> {
            int n2;
            if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[44]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                n2 = lIIlIIIlI[0];
                0;
                if (2 <= 0) {
                    return ((0xF5 ^ 0xA6 ^ (0x33 ^ 0x48)) & (0x6C ^ 0x68 ^ (0x81 ^ 0xAD) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIIIlI[1];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        List list4 = Arrays.stream(widgetArray).filter(widget -> {
            int n2;
            if (p.llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[43]]) ? 1 : 0) && p.llllIIllIII(widget.getTextColor(), cb)) {
                n2 = lIIlIIIlI[0];
                0;
                if (1 < 1) {
                    return false;
                }
            } else {
                n2 = lIIlIIIlI[1];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        if (p.llllIIlIIII(list.isEmpty() ? 1 : 0) && p.llllIIlIIII(list2.isEmpty() ? 1 : 0) && p.llllIIlIIII(list3.isEmpty() ? 1 : 0) && p.llllIIlIIII(list4.isEmpty() ? 1 : 0)) {
            return lIIlIIIlI[0];
        }
        return lIIlIIIlI[1];
    }
}

