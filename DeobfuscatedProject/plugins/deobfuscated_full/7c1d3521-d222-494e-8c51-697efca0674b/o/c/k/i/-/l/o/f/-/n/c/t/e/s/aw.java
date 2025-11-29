/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;

public class aw
implements ac {
    private static /* synthetic */ int[] lllIIlIllI;
    public static final /* synthetic */ int oA;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint oz;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lllIIlIlIl;

    private static void eK() {
        if (aw.llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]))) {
            Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[98]]);
            Time.sleepTicks((int)lllIIlIllI[2]);
            0;
        }
        if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[6]))) {
            Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[6]).interact(lllIIlIlIl[lllIIlIllI[99]]);
            Time.sleepTicks((int)lllIIlIllI[5]);
            0;
        }
    }

    static {
        aw.llIIIIIlIlIll();
        aw.llIIIIIlIlIlI();
        oA = lllIIlIllI[31];
        oz = new WorldPoint(lllIIlIllI[138], lllIIlIllI[139], lllIIlIllI[0]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lllIIlIllI[2]];
        stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[140]];
        stringArray[aw.lllIIlIllI[1]] = lllIIlIlIl[lllIIlIllI[141]];
        cE = stringArray;
    }

    private static void llIIIIIlIlIlI() {
        lllIIlIlIl = new String[lllIIlIllI[142]];
        aw.lllIIlIlIl[aw.lllIIlIllI[0]] = aw."Buying items";
        aw.lllIIlIlIl[aw.lllIIlIllI[1]] = aw."Finished buying items, switching back to construction";
        aw.lllIIlIlIl[aw.lllIIlIllI[2]] = aw."Navigating to bank";
        aw.lllIIlIlIl[aw.lllIIlIllI[3]] = aw."Castle Wars";
        aw.lllIIlIlIl[aw.lllIIlIllI[5]] = aw."Wear";
        aw.lllIIlIlIl[aw.lllIIlIllI[6]] = aw."Handling banking";
        aw.lllIIlIlIl[aw.lllIIlIllI[9]] = aw."We are missing rings, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[11]] = aw."We are missing saw, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[13]] = aw."We are missing hammer, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[15]] = aw."We are missing house tab, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[18]] = aw."We are missing nails, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[20]] = aw."We are missing plank, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[22]] = aw."We are missing oak planks, switching to BUYING";
        aw.lllIIlIlIl[aw.lllIIlIllI[29]] = aw."Equiping duel";
        aw.lllIIlIlIl[aw.lllIIlIllI[30]] = aw."Wear";
        aw.lllIIlIlIl[aw.lllIIlIllI[32]] = aw."Nav to house guy";
        aw.lllIIlIlIl[aw.lllIIlIllI[33]] = aw."Buy house";
        aw.lllIIlIlIl[aw.lllIIlIllI[34]] = aw."Estate agent";
        aw.lllIIlIlIl[aw.lllIIlIllI[36]] = aw."Entering portal";
        aw.lllIIlIlIl[aw.lllIIlIllI[37]] = aw."Build mode";
        aw.lllIIlIlIl[aw.lllIIlIllI[39]] = aw."Tele to house";
        aw.lllIIlIlIl[aw.lllIIlIllI[40]] = aw."Break";
        aw.lllIIlIlIl[aw.lllIIlIllI[41]] = aw."Turning on build mode";
        aw.lllIIlIlIl[aw.lllIIlIllI[16]] = aw."Yes";
        aw.lllIIlIlIl[aw.lllIIlIllI[43]] = aw."Building chair";
        aw.lllIIlIlIl[aw.lllIIlIllI[46]] = aw."Build";
        aw.lllIIlIlIl[aw.lllIIlIllI[48]] = aw."Removing";
        aw.lllIIlIlIl[aw.lllIIlIllI[49]] = aw."Remove";
        aw.lllIIlIlIl[aw.lllIIlIllI[27]] = aw."Yes";
        aw.lllIIlIlIl[aw.lllIIlIllI[51]] = aw."Building wood larder";
        aw.lllIIlIlIl[aw.lllIIlIllI[53]] = aw."Build";
        aw.lllIIlIlIl[aw.lllIIlIllI[55]] = aw."Removing";
        aw.lllIIlIlIl[aw.lllIIlIllI[56]] = aw."Remove";
        aw.lllIIlIlIl[aw.lllIIlIllI[57]] = aw."Yes";
        aw.lllIIlIlIl[aw.lllIIlIllI[58]] = aw."Build oak table";
        aw.lllIIlIlIl[aw.lllIIlIllI[61]] = aw."Build";
        aw.lllIIlIlIl[aw.lllIIlIllI[63]] = aw."Removing";
        aw.lllIIlIlIl[aw.lllIIlIllI[64]] = aw."Remove";
        aw.lllIIlIlIl[aw.lllIIlIllI[65]] = aw."Yes";
        aw.lllIIlIlIl[aw.lllIIlIllI[66]] = aw."Build oak larder";
        aw.lllIIlIlIl[aw.lllIIlIllI[67]] = aw."Remove";
        aw.lllIIlIlIl[aw.lllIIlIllI[68]] = aw."Build";
        aw.lllIIlIlIl[aw.lllIIlIllI[70]] = aw."Removing";
        aw.lllIIlIlIl[aw.lllIIlIllI[71]] = aw."Remove";
        aw.lllIIlIlIl[aw.lllIIlIllI[72]] = aw."Yes";
        aw.lllIIlIlIl[aw.lllIIlIllI[73]] = aw."Building rooms";
        aw.lllIIlIlIl[aw.lllIIlIllI[77]] = aw."View House Options";
        aw.lllIIlIlIl[aw.lllIIlIllI[79]] = aw."Viewer";
        aw.lllIIlIlIl[aw.lllIIlIllI[81]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[83]] = aw."Add room";
        aw.lllIIlIlIl[aw.lllIIlIllI[84]] = aw."Kitchen";
        aw.lllIIlIlIl[aw.lllIIlIllI[85]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[87]] = aw."Counter-clockwise";
        aw.lllIIlIlIl[aw.lllIIlIllI[88]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[89]] = aw."View House Options";
        aw.lllIIlIlIl[aw.lllIIlIllI[90]] = aw."Viewer";
        aw.lllIIlIlIl[aw.lllIIlIllI[91]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[93]] = aw."Add room";
        aw.lllIIlIlIl[aw.lllIIlIllI[94]] = aw."Dining room";
        aw.lllIIlIlIl[aw.lllIIlIllI[95]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[96]] = aw."Counter-clockwise";
        aw.lllIIlIlIl[aw.lllIIlIllI[97]] = aw."Done";
        aw.lllIIlIlIl[aw.lllIIlIllI[86]] = aw."Build";
        aw.lllIIlIlIl[aw.lllIIlIllI[98]] = aw."View House Options";
        aw.lllIIlIlIl[aw.lllIIlIllI[99]] = aw."On";
        aw.lllIIlIlIl[aw.lllIIlIllI[80]] = aw."Iron nails";
        aw.lllIIlIlIl[aw.lllIIlIllI[104]] = aw."Teleport to house";
        aw.lllIIlIlIl[aw.lllIIlIllI[105]] = aw."Saw";
        aw.lllIIlIlIl[aw.lllIIlIllI[106]] = aw."Hammer";
        aw.lllIIlIlIl[aw.lllIIlIllI[107]] = aw."Plank";
        aw.lllIIlIlIl[aw.lllIIlIllI[108]] = aw."Plank";
        aw.lllIIlIlIl[aw.lllIIlIllI[109]] = aw."Iron nails";
        aw.lllIIlIlIl[aw.lllIIlIllI[110]] = aw."Teleport to house";
        aw.lllIIlIlIl[aw.lllIIlIllI[111]] = aw."Saw";
        aw.lllIIlIlIl[aw.lllIIlIllI[112]] = aw."Hammer";
        aw.lllIIlIlIl[aw.lllIIlIllI[113]] = aw."Plank";
        aw.lllIIlIlIl[aw.lllIIlIllI[114]] = aw."Plank";
        aw.lllIIlIlIl[aw.lllIIlIllI[115]] = aw."Teleport to house";
        aw.lllIIlIlIl[aw.lllIIlIllI[116]] = aw."Saw";
        aw.lllIIlIlIl[aw.lllIIlIllI[117]] = aw."Hammer";
        aw.lllIIlIlIl[aw.lllIIlIllI[118]] = aw."Teleport to house";
        aw.lllIIlIlIl[aw.lllIIlIllI[119]] = aw."Saw";
        aw.lllIIlIlIl[aw.lllIIlIllI[120]] = aw."Hammer";
        aw.lllIIlIlIl[aw.lllIIlIllI[92]] = aw."Construction";
        aw.lllIIlIlIl[aw.lllIIlIllI[135]] = aw."ring of wealth (";
        aw.lllIIlIlIl[aw.lllIIlIllI[136]] = aw."ring of dueling(";
        aw.lllIIlIlIl[aw.lllIIlIllI[137]] = aw."ring of dueling(";
        aw.lllIIlIlIl[aw.lllIIlIllI[140]] = aw."How can I get a house?";
        aw.lllIIlIlIl[aw.lllIIlIllI[141]] = aw."Yes please!";
    }

    private static boolean llIIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return lllIIlIllI[0];
    }

    private static boolean llIIIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static boolean eL() {
        boolean bl;
        int[] nArray = new int[lllIIlIllI[1]];
        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[100];
        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
            bl = lllIIlIllI[1];
            0;
            if (-1 >= (0x7F ^ 0x7B)) {
                return false;
            }
        } else {
            bl = lllIIlIllI[0];
        }
        return bl;
    }

    private static String llIIIIIlIIlll(String var17, String var20) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lllIIlIllI[13]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lllIIlIllI[2], var25);
            return new String(var12.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[134])) {
            bl = lllIIlIllI[1];
            0;
            if (-1 != -1) {
                return ((170 + 84 - 200 + 147 ^ 121 + 107 - 131 + 37) & (0xF0 ^ 0xAF ^ (0x78 ^ 0x68) ^ -1)) != 0;
            }
        } else {
            bl = lllIIlIllI[0];
        }
        return bl;
    }

    private static boolean llIIIIIllIlII(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[18])) {
            int n3;
            String[] stringArray = new String[lllIIlIllI[1]];
            stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[80]];
            if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIllI[1]];
                stringArray2[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[104]];
                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIIlIllI[1]];
                    stringArray3[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[105]];
                    if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        String[] stringArray4 = new String[lllIIlIllI[1]];
                        stringArray4[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[106]];
                        if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            int[] nArray = new int[lllIIlIllI[1]];
                            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[25];
                            if (aw.llIIIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray5 = new String[lllIIlIllI[1]];
                                stringArray5[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[107]];
                                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lllIIlIllI[1]];
                                    stringArray6[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[108]];
                                    if (aw.llIIIIIllIIIl(Inventory.getAll((String[])stringArray6).size(), lllIIlIllI[2]) && (!aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0) || aw.llIIIIIlIllII(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                        n3 = lllIIlIllI[1];
                                        0;
                                        if (1 == 1) return n3 != 0;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n3 = lllIIlIllI[0];
            return n3 != 0;
        }
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[18]) && aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) {
            int n4;
            String[] stringArray = new String[lllIIlIllI[1]];
            stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[109]];
            if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray7 = new String[lllIIlIllI[1]];
                stringArray7[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[110]];
                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lllIIlIllI[1]];
                    stringArray8[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[111]];
                    if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lllIIlIllI[1]];
                        stringArray9[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[112]];
                        if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            int[] nArray = new int[lllIIlIllI[1]];
                            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[25];
                            if (aw.llIIIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllIIlIllI[1]];
                                stringArray10[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[113]];
                                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[lllIIlIllI[1]];
                                    stringArray11[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[114]];
                                    if (aw.llIIIIIllIIIl(Inventory.getAll((String[])stringArray11).size(), lllIIlIllI[13]) && (!aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0) || aw.llIIIIIlIllII(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                        n4 = lllIIlIllI[1];
                                        0;
                                        if (-1 != 1) return n4 != 0;
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = lllIIlIllI[0];
            return n4 != 0;
        }
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16]) && aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[57])) {
            int n5;
            String[] stringArray = new String[lllIIlIllI[1]];
            stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[115]];
            if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray12 = new String[lllIIlIllI[1]];
                stringArray12[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[116]];
                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lllIIlIllI[1]];
                    stringArray13[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[117]];
                    if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (aw.llIIIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lllIIlIllI[1]];
                            nArray2[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                            if (aw.llIIIIIllIIIl(Inventory.getAll((int[])nArray2).size(), lllIIlIllI[5]) && (!aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0) || aw.llIIIIIlIllII(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                                n5 = lllIIlIllI[1];
                                0;
                                if (1 >= -1) return n5 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
            n5 = lllIIlIllI[0];
            return n5 != 0;
        }
        if (!aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[57])) return lllIIlIllI[0];
        String[] stringArray = new String[lllIIlIllI[1]];
        stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[118]];
        if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray14 = new String[lllIIlIllI[1]];
            stringArray14[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[119]];
            if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                String[] stringArray15 = new String[lllIIlIllI[1]];
                stringArray15[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[120]];
                if (aw.llIIIIIlIllII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    int[] nArray = new int[lllIIlIllI[1]];
                    nArray[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                    if (aw.llIIIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIIlIllI[1]];
                        nArray3[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (aw.llIIIIIllIIIl(Inventory.getAll((int[])nArray3).size(), lllIIlIllI[13]) && (!aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0) || aw.llIIIIIlIllII(Equipment.contains((int[])f.aS) ? 1 : 0))) {
                            n2 = lllIIlIllI[1];
                            0;
                            if (((0x2A ^ 0x39 ^ (0x6F ^ 0x6A)) & (48 + 150 - 171 + 142 ^ 70 + 178 - 120 + 63 ^ -1)) <= 0) return n2 != 0;
                            return ((0x34 ^ 0x14 ^ (0x43 ^ 0x3B)) & (0x1A ^ 0x4F ^ (0xCA ^ 0xC7) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lllIIlIllI[0];
        return n2 != 0;
    }

    private static boolean llIIIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIIIIlIlIII(String var6, String var7) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lllIIlIllI[2], var15);
            return new String(var18.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIllll(Object object) {
        return object != null;
    }

    private static void eI() {
        Widget var14;
        if (aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[18])) {
            int[] nArray = new int[lllIIlIllI[1]];
            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[42];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                Widget widget;
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[43]];
                if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0) && aw.llIIIIIlIllll(widget = Widgets.get((int)lllIIlIllI[44], (int)lllIIlIllI[5]))) {
                    Mouse.click((int)widget.getChild(lllIIlIllI[9]).getClickPoint().getX(), (int)widget.getChild(lllIIlIllI[9]).getClickPoint().getY(), (boolean)lllIIlIllI[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[47];
                        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIIlIllI[1];
                            0;
                            if (2 != 2) {
                                return false;
                            }
                        } else {
                            bl = lllIIlIllI[0];
                        }
                        return bl;
                    }, (int)lllIIlIllI[45]);
                    0;
                }
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIlIllI[1]];
                    nArray2[aw.lllIIlIllI[0]] = lllIIlIllI[42];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray2))) {
                        int[] nArray3 = new int[lllIIlIllI[1]];
                        nArray3[aw.lllIIlIllI[0]] = lllIIlIllI[42];
                        TileObjects.getNearest((int[])nArray3).interact(lllIIlIlIl[lllIIlIllI[46]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIIlIllI[1];
                                0;
                                if (-1 > (0x6D ^ 0x49 ^ (0x4F ^ 0x6F))) {
                                    return ((0x57 ^ 0x60 ^ (0xA ^ 0x6C)) & (0x7A ^ 0x18 ^ (0x54 ^ 0x67) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIIlIllI[0];
                            }
                            return bl;
                        }, (int)lllIIlIllI[45]);
                        0;
                    }
                }
            }
            int[] nArray4 = new int[lllIIlIllI[1]];
            nArray4[aw.lllIIlIllI[0]] = lllIIlIllI[47];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray4))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[48]];
                if (aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIIlIllI[1]);
                    0;
                    int[] nArray5 = new int[lllIIlIllI[1]];
                    nArray5[aw.lllIIlIllI[0]] = lllIIlIllI[47];
                    TileObjects.getNearest((int[])nArray5).interact(lllIIlIlIl[lllIIlIllI[49]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIIlIllI[45]);
                    0;
                }
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[27]];
                g.a(stringArray);
            }
        }
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[18]) && aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16]) && aw.llIIIIIlIllII(aw.eN() ? 1 : 0)) {
            int[] nArray = new int[lllIIlIllI[1]];
            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[50];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[51]];
                if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0) && aw.llIIIIIlIllll(var14 = Widgets.get((int)lllIIlIllI[44], (int)lllIIlIllI[5]))) {
                    Mouse.click((int)var14.getChild(lllIIlIllI[9]).getClickPoint().getX(), (int)var14.getChild(lllIIlIllI[9]).getClickPoint().getY(), (boolean)lllIIlIllI[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[50];
                        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIIlIllI[1];
                            0;
                            if (((85 + 5 - -19 + 110 ^ 127 + 129 - 162 + 50) & (4 ^ 0x24 ^ (0x4D ^ 0x26) ^ -1)) != 0) {
                                return ((101 + 3 - -12 + 26 ^ 15 + 0 - 13 + 184) & (0x77 ^ 0x45 ^ (0x8D ^ 0x8B) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIllI[0];
                        }
                        return bl;
                    }, (int)lllIIlIllI[52]);
                    0;
                }
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIlIllI[1]];
                    nArray6[aw.lllIIlIllI[0]] = lllIIlIllI[50];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray6))) {
                        int[] nArray7 = new int[lllIIlIllI[1]];
                        nArray7[aw.lllIIlIllI[0]] = lllIIlIllI[50];
                        TileObjects.getNearest((int[])nArray7).interact(lllIIlIlIl[lllIIlIllI[53]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIIlIllI[1];
                                0;
                                if (2 >= (0x3C ^ 0x38)) {
                                    return false;
                                }
                            } else {
                                bl = lllIIlIllI[0];
                            }
                            return bl;
                        }, (int)lllIIlIllI[45]);
                        0;
                    }
                }
            }
            int[] nArray8 = new int[lllIIlIllI[1]];
            nArray8[aw.lllIIlIllI[0]] = lllIIlIllI[54];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray8))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[55]];
                if (aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIIlIllI[1]);
                    0;
                    int[] nArray9 = new int[lllIIlIllI[1]];
                    nArray9[aw.lllIIlIllI[0]] = lllIIlIllI[54];
                    TileObjects.getNearest((int[])nArray9).interact(lllIIlIlIl[lllIIlIllI[56]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIIlIllI[45]);
                    0;
                }
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[57]];
                g.a(stringArray);
            }
        }
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16]) && aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[57]) && aw.llIIIIIlIllII(aw.eN() ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[58]];
            int[] nArray = new int[lllIIlIllI[1]];
            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[59];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0) && aw.llIIIIIlIllll(var14 = Widgets.get((int)lllIIlIllI[44], (int)lllIIlIllI[6]))) {
                    Mouse.click((int)var14.getChild(lllIIlIllI[5]).getClickPoint().getX(), (int)var14.getChild(lllIIlIllI[5]).getClickPoint().getY(), (boolean)lllIIlIllI[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[62];
                        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIIlIllI[1];
                            0;
                            if (3 < ((0xA4 ^ 0x92 ^ (0x75 ^ 0x53)) & (0xA7 ^ 0xB6 ^ 1 ^ -1))) {
                                return ((0x75 ^ 0x20 ^ (0xF ^ 0x6C)) & (0xE2 ^ 0xBA ^ (0x3A ^ 0x54) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIllI[0];
                        }
                        return bl;
                    }, (int)lllIIlIllI[60]);
                    0;
                }
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray10 = new int[lllIIlIllI[1]];
                    nArray10[aw.lllIIlIllI[0]] = lllIIlIllI[59];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray10))) {
                        int[] nArray11 = new int[lllIIlIllI[1]];
                        nArray11[aw.lllIIlIllI[0]] = lllIIlIllI[59];
                        TileObjects.getNearest((int[])nArray11).interact(lllIIlIlIl[lllIIlIllI[61]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIIlIllI[1];
                                0;
                                if (-1 > 0) {
                                    return ((0x64 ^ 0xB ^ (0xE6 ^ 0xB1)) & (227 + 65 - 127 + 83 ^ 57 + 134 - 99 + 100 ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIIlIllI[0];
                            }
                            return bl;
                        }, (int)lllIIlIllI[45]);
                        0;
                    }
                }
            }
            int[] nArray12 = new int[lllIIlIllI[1]];
            nArray12[aw.lllIIlIllI[0]] = lllIIlIllI[62];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray12))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[63]];
                if (aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIIlIllI[1]);
                    0;
                    int[] nArray13 = new int[lllIIlIllI[1]];
                    nArray13[aw.lllIIlIllI[0]] = lllIIlIllI[62];
                    TileObjects.getNearest((int[])nArray13).interact(lllIIlIlIl[lllIIlIllI[64]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIIlIllI[45]);
                    0;
                }
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[65]];
                g.a(stringArray);
            }
        }
        if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[57]) && aw.llIIIIIlIllII(aw.eN() ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[66]];
            int[] nArray = new int[lllIIlIllI[1]];
            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[54];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray)) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks((int)lllIIlIllI[1]);
                0;
                int[] nArray14 = new int[lllIIlIllI[1]];
                nArray14[aw.lllIIlIllI[0]] = lllIIlIllI[54];
                TileObjects.getNearest((int[])nArray14).interact(lllIIlIlIl[lllIIlIllI[67]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIIlIllI[45]);
                0;
            }
            int[] nArray15 = new int[lllIIlIllI[1]];
            nArray15[aw.lllIIlIllI[0]] = lllIIlIllI[50];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray15))) {
                if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0) && aw.llIIIIIlIllll(var14 = Widgets.get((int)lllIIlIllI[44], (int)lllIIlIllI[6]))) {
                    Mouse.click((int)var14.getChild(lllIIlIllI[5]).getClickPoint().getX(), (int)var14.getChild(lllIIlIllI[5]).getClickPoint().getY(), (boolean)lllIIlIllI[1]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[69];
                        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                            bl = lllIIlIllI[1];
                            0;
                            if (1 > 3) {
                                return ((0x26 ^ 0x69 ^ (0xA5 ^ 0xC7)) & (29 + 198 - 91 + 102 ^ 153 + 154 - 113 + 1 ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIllI[0];
                        }
                        return bl;
                    }, (int)lllIIlIllI[60]);
                    0;
                }
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] nArray16 = new int[lllIIlIllI[1]];
                    nArray16[aw.lllIIlIllI[0]] = lllIIlIllI[50];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray16))) {
                        int[] nArray17 = new int[lllIIlIllI[1]];
                        nArray17[aw.lllIIlIllI[0]] = lllIIlIllI[50];
                        TileObjects.getNearest((int[])nArray17).interact(lllIIlIlIl[lllIIlIllI[68]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                bl = lllIIlIllI[1];
                                0;
                                
                                }
                            } else {
                                bl = lllIIlIllI[0];
                            }
                            return bl;
                        }, (int)lllIIlIllI[45]);
                        0;
                    }
                }
            }
            int[] nArray18 = new int[lllIIlIllI[1]];
            nArray18[aw.lllIIlIllI[0]] = lllIIlIllI[69];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray18))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[70]];
                if (aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIIlIllI[1]);
                    0;
                    int[] nArray19 = new int[lllIIlIllI[1]];
                    nArray19[aw.lllIIlIllI[0]] = lllIIlIllI[69];
                    TileObjects.getNearest((int[])nArray19).interact(lllIIlIlIl[lllIIlIllI[71]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIIlIllI[45]);
                    0;
                }
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[72]];
                g.a(stringArray);
            }
        }
    }

    static boolean eM() {
        boolean bl;
        int[] nArray = new int[lllIIlIllI[1]];
        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[101];
        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
            bl = lllIIlIllI[1];
            0;
            if ((0x23 ^ 0x27) == 0) {
                return false;
            }
        } else {
            bl = lllIIlIllI[0];
        }
        return bl;
    }

    private static void llIIIIIlIlIll() {
        lllIIlIllI = new int[143];
        aw.lllIIlIllI[0] = (0xD4 ^ 0x85) & ~(0x68 ^ 0x39);
        aw.lllIIlIllI[1] = 1;
        aw.lllIIlIllI[2] = 2;
        aw.lllIIlIllI[3] = 3;
        aw.lllIIlIllI[4] = -(0xFFFFECF9 & 0x5F07) & (0xFFFFED7C & 0x7FB7);
        aw.lllIIlIllI[5] = 0x15 ^ 0x11;
        aw.lllIIlIllI[6] = 63 + 96 - 78 + 104 ^ 98 + 101 - 118 + 107;
        aw.lllIIlIllI[7] = 0xFFFFF7AD & 0x1BDA;
        aw.lllIIlIllI[8] = -(0xFFFFF16F & 0x6E95) & (0xFFFFEFBF & 0x7BFC);
        aw.lllIIlIllI[9] = 0x89 ^ 0x8F;
        aw.lllIIlIllI[10] = -(0xC4 ^ 0xC2) & (0xFFFFEB5F & 0x36FF);
        aw.lllIIlIllI[11] = 0xBC ^ 0xBB;
        aw.lllIIlIllI[12] = 0xFFFFA9BF & 0x5F6B;
        aw.lllIIlIllI[13] = 0x5B ^ 0x53;
        aw.lllIIlIllI[14] = -(0xFFFFABB9 & 0x74C7) & (0xFFFFFFCF & 0x3FFD);
        aw.lllIIlIllI[15] = 0x79 ^ 0x22 ^ (0x6A ^ 0x38);
        aw.lllIIlIllI[16] = 0x32 ^ 0x15 ^ (0x12 ^ 0x22);
        aw.lllIIlIllI[17] = -(0xFFFFC99F & 0x3F69) & (0xFFFFBFDE & 0x5BFD);
        aw.lllIIlIllI[18] = 0x79 ^ 0x73;
        aw.lllIIlIllI[19] = 0xFFFFD3C2 & 0x2FFD;
        aw.lllIIlIllI[20] = 0x93 ^ 0x98;
        aw.lllIIlIllI[21] = -(0xFFFFDBA1 & 0x6CFF) & (0xFFFFEAEA & Short.MAX_VALUE);
        aw.lllIIlIllI[22] = 0x5A ^ 0x56;
        aw.lllIIlIllI[23] = 0xFFFF83FF & 0x7FE8;
        aw.lllIIlIllI[24] = -(0xFFFFBFE5 & 0x56DB) & (0xFFFFD7EC & 0x3FFF);
        aw.lllIIlIllI[25] = -(0xFFFFD7B7 & 0x7849) & (0xFFFFDFE3 & 0x73FF);
        aw.lllIIlIllI[26] = -(0xFFFF8E71 & 0x7B9F) & (0xFFFFEFFA & 0x7BBD);
        aw.lllIIlIllI[27] = 0x19 ^ 0x3D ^ (0x7B ^ 0x43);
        aw.lllIIlIllI[28] = -(0xFFFFB5CF & 0x7A37) & (0xFFFFF9FF & 0x3FFE);
        aw.lllIIlIllI[29] = 0x52 ^ 0x5F;
        aw.lllIIlIllI[30] = 16 + 111 - -9 + 17 ^ 85 + 134 - 188 + 120;
        aw.lllIIlIllI[31] = -(0xFFFFFE7A & 0x658F) & (0xFFFFEFEF & 0x76FB);
        aw.lllIIlIllI[32] = 0xCE ^ 0xC1;
        aw.lllIIlIllI[33] = 0x19 ^ 0x21 ^ (0x70 ^ 0x58);
        aw.lllIIlIllI[34] = 0xD1 ^ 0xC0;
        aw.lllIIlIllI[35] = 0xFFFFFE76 & 0x3DFF;
        aw.lllIIlIllI[36] = 0x78 ^ 0x62 ^ (0 ^ 8);
        aw.lllIIlIllI[37] = 0x39 ^ 0x2A;
        aw.lllIIlIllI[38] = 0xFFFF9FEF & 0x71BD;
        aw.lllIIlIllI[39] = 0x2C ^ 0x38;
        aw.lllIIlIllI[40] = 0xA0 ^ 0xB5;
        aw.lllIIlIllI[41] = 3 ^ (0x1A ^ 0xF);
        aw.lllIIlIllI[42] = -(0xFFFFFF9B & 0x226F) & (0xFFFFB7BF & 0x7BEF);
        aw.lllIIlIllI[43] = 0x59 ^ 0x22 ^ (0xF1 ^ 0x92);
        aw.lllIIlIllI[44] = 0xFFFFC7EF & 0x39DA;
        aw.lllIIlIllI[45] = 0xFFFF91FE & 0x7F95;
        aw.lllIIlIllI[46] = 0x63 ^ 0x7A;
        aw.lllIIlIllI[47] = -(0xFFFFF3F7 & 0x6D9B) & (0xFFFFFBFA & 0x7FF7);
        aw.lllIIlIllI[48] = 0xAE ^ 0xB4;
        aw.lllIIlIllI[49] = 0x1E ^ 5;
        aw.lllIIlIllI[50] = 0xFFFFBCFF & 0x7F2B;
        aw.lllIIlIllI[51] = 0x29 ^ 0x34;
        aw.lllIIlIllI[52] = -(0xFFFFFAF6 & 0x5FAB) & (0xFFFFFFFF & 0x7FBD);
        aw.lllIIlIllI[53] = 0x7F ^ 0x61;
        aw.lllIIlIllI[54] = -3 & (0xFFFFBEFF & 0x75FF);
        aw.lllIIlIllI[55] = 0xB4 ^ 0xAB;
        aw.lllIIlIllI[56] = 73 + 109 - 107 + 102 ^ 46 + 69 - 83 + 113;
        aw.lllIIlIllI[57] = 0xE6 ^ 0xC7;
        aw.lllIIlIllI[58] = 0xA9 ^ 0x8B;
        aw.lllIIlIllI[59] = -(0xE ^ 0x2F) & (0xFFFFBFFF & 0x7BE3);
        aw.lllIIlIllI[60] = -(0xFFFFE0FF & 0x7F8A) & (0xFFFFFFFD & 0x79EF);
        aw.lllIIlIllI[61] = 0x6D ^ 0x4E;
        aw.lllIIlIllI[62] = -(0xFFFFDEC3 & 0x6D3F) & (0xFFFFFFFF & 0x7FF7);
        aw.lllIIlIllI[63] = 0x87 ^ 0xBE ^ (0xAE ^ 0xB3);
        aw.lllIIlIllI[64] = 92 + 159 - 166 + 80 ^ 63 + 64 - 90 + 91;
        aw.lllIIlIllI[65] = 0x2B ^ 0xD;
        aw.lllIIlIllI[66] = 27 + 107 - 128 + 125 ^ 156 + 30 - 95 + 73;
        aw.lllIIlIllI[67] = 0xEA ^ 0xC2;
        aw.lllIIlIllI[68] = 145 + 80 - 208 + 164 ^ 89 + 79 - 110 + 98;
        aw.lllIIlIllI[69] = -(0xFFFFE931 & 0x56CF) & (0xFFFFFDFE & 0x76FF);
        aw.lllIIlIllI[70] = 0x25 ^ 0xC ^ 3;
        aw.lllIIlIllI[71] = 0x34 ^ 0x1F;
        aw.lllIIlIllI[72] = 0x80 ^ 0xAC;
        aw.lllIIlIllI[73] = 75 + 150 - 130 + 76 ^ 29 + 87 - 79 + 97;
        aw.lllIIlIllI[74] = (0x43 ^ 0x6A) + (70 + 59 - 40 + 75) - (0x7C ^ 0x20) + (0xD1 ^ 0xB2);
        aw.lllIIlIllI[75] = 0xFFFF87F6 & 0x79AF;
        aw.lllIIlIllI[76] = 0x6C ^ 0x18;
        aw.lllIIlIllI[77] = 0x57 ^ 0x79;
        aw.lllIIlIllI[78] = 0xFFFFBD72 & 0x43FF;
        aw.lllIIlIllI[79] = 72 + 85 - 152 + 162 ^ 27 + 49 - 55 + 115;
        aw.lllIIlIllI[80] = 0x6D ^ 0x2C;
        aw.lllIIlIllI[81] = 0x4A ^ 0x1F ^ (0x36 ^ 0x53);
        aw.lllIIlIllI[82] = 0xC9 ^ 0x92;
        aw.lllIIlIllI[83] = 0x30 ^ 1;
        aw.lllIIlIllI[84] = 0x2C ^ 0x1E;
        aw.lllIIlIllI[85] = 0x46 ^ 0x75;
        aw.lllIIlIllI[86] = 0x23 ^ 0x5B ^ (0xFF ^ 0xB9);
        aw.lllIIlIllI[87] = 0x4F ^ 0x7B;
        aw.lllIIlIllI[88] = 0x2D ^ 0x28 ^ (0xF6 ^ 0xC6);
        aw.lllIIlIllI[89] = 0xAC ^ 0xBC ^ (0x10 ^ 0x36);
        aw.lllIIlIllI[90] = 0x4C ^ 0x78 ^ 3;
        aw.lllIIlIllI[91] = 0xF3 ^ 0xA6 ^ (0x41 ^ 0x2C);
        aw.lllIIlIllI[92] = 0xE4 ^ 0xB7;
        aw.lllIIlIllI[93] = 0xD ^ 0x34;
        aw.lllIIlIllI[94] = 0x7C ^ 0x30 ^ (0xD9 ^ 0xAF);
        aw.lllIIlIllI[95] = 0x9A ^ 0xA1;
        aw.lllIIlIllI[96] = 0x2C ^ 0x10;
        aw.lllIIlIllI[97] = 0x94 ^ 0xA9;
        aw.lllIIlIllI[98] = 67 + 41 - -34 + 28 ^ 55 + 63 - 47 + 78;
        aw.lllIIlIllI[99] = 74 + 120 - 167 + 108 ^ 112 + 143 - 243 + 187;
        aw.lllIIlIllI[100] = 0xFFFFFFFB & 0x3C2D;
        aw.lllIIlIllI[101] = 0xFFFFBFC5 & 0x7BFF;
        aw.lllIIlIllI[102] = 0xFFFFFBEA & 0x3FD7;
        aw.lllIIlIllI[103] = -(0xFFFF95CD & 0x6F77) & (0xFFFF9FC4 & 0x6DFF);
        aw.lllIIlIllI[104] = 48 + 6 - -55 + 21 ^ 44 + 34 - -63 + 51;
        aw.lllIIlIllI[105] = 0x1D ^ 0x5E;
        aw.lllIIlIllI[106] = 0xD6 ^ 0x92;
        aw.lllIIlIllI[107] = 0xD9 ^ 0x9B ^ (0x21 ^ 0x26);
        aw.lllIIlIllI[108] = 0x4A ^ 0xC;
        aw.lllIIlIllI[109] = 0x1A ^ 0x56 ^ (0x20 ^ 0x2B);
        aw.lllIIlIllI[110] = 0x10 ^ 0x68 ^ (0x1B ^ 0x2B);
        aw.lllIIlIllI[111] = 0x1E ^ 0x57;
        aw.lllIIlIllI[112] = 0x45 ^ 0x36 ^ (0x6E ^ 0x57);
        aw.lllIIlIllI[113] = 165 + 168 - 320 + 183 ^ 106 + 123 - 216 + 130;
        aw.lllIIlIllI[114] = 0x21 ^ 0x6D;
        aw.lllIIlIllI[115] = 157 + 78 - 189 + 152 ^ 18 + 35 - -69 + 17;
        aw.lllIIlIllI[116] = 0xD8 ^ 0x96;
        aw.lllIIlIllI[117] = 3 ^ (0x58 ^ 0x14);
        aw.lllIIlIllI[118] = 0x13 ^ 0x43;
        aw.lllIIlIllI[119] = 8 ^ 0x48 ^ (0xB ^ 0x1A);
        aw.lllIIlIllI[120] = 0x36 ^ 0x64;
        aw.lllIIlIllI[121] = -(0xFFFFFAFE & 0x6593) & (0xFFFFF197 & 0x6FFD);
        aw.lllIIlIllI[122] = -(0xFFFFE2AF & 0x3F53) & (0xFFFFF3FF & 0x2FBA);
        aw.lllIIlIllI[123] = -(0xFFFFFF6E & 0x5CBF) & (0xFFFFFFFF & 0x5DFF);
        aw.lllIIlIllI[124] = -(0xFFFFB20F & 0x5FFC) & (0xFFFFF7FF & 0x1BFF);
        aw.lllIIlIllI[125] = 0xFFFFD75D & 0x2AE6;
        aw.lllIIlIllI[126] = 122 + 108 - -4 + 16;
        aw.lllIIlIllI[127] = 0xFFFFAAAD & 0x57FA;
        aw.lllIIlIllI[128] = -(0xFFFFD6EF & 0x699E) & (0xFFFFF7DD & 0x5DEF);
        aw.lllIIlIllI[129] = 0xFFFFD7DB & 0x2FF4;
        aw.lllIIlIllI[130] = 0xFFFFBFFC & 0x6ECF;
        aw.lllIIlIllI[131] = 0xFFFFDF5F & 0x3FE7;
        aw.lllIIlIllI[132] = 0xFFFFFFC7 & 0x3BC;
        aw.lllIIlIllI[133] = 0xB4 ^ 0x96 ^ (0xF6 ^ 0xB0);
        aw.lllIIlIllI[134] = 0x69 ^ 0xA;
        aw.lllIIlIllI[135] = 0xE2 ^ 0xB6;
        aw.lllIIlIllI[136] = 0x54 ^ 1;
        aw.lllIIlIllI[137] = 0xAA ^ 0xC1 ^ (0x57 ^ 0x6A);
        aw.lllIIlIllI[138] = 0xFFFFFCAC & 0xFFB;
        aw.lllIIlIllI[139] = -(0xFFFFA05B & 0x7FED) & (0xFFFFADFE & 0x7FDB);
        aw.lllIIlIllI[140] = 18 + 7 - 6 + 197 ^ 16 + 116 - 79 + 90;
        aw.lllIIlIllI[141] = 0x3D ^ 0x7C ^ (0x48 ^ 0x51);
        aw.lllIIlIllI[142] = 0xFE ^ 0xA7;
    }

    private static void eJ() {
        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[73]];
        if (aw.llIIIIIlIlllI(aw.eL() ? 1 : 0)) {
            if (aw.llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[74]).isEmpty() ? 1 : 0) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                if (aw.llIIIIIllIlII(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                    if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]))) {
                        Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[77]]);
                        Time.sleepTicks((int)lllIIlIllI[2]);
                        0;
                    }
                    if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[1]))) {
                        Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[1]).interact(lllIIlIlIl[lllIIlIllI[79]]);
                        Time.sleepTicks((int)lllIIlIllI[5]);
                        0;
                    }
                }
                if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                    String[] stringArray = new String[lllIIlIllI[1]];
                    stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[81]];
                    if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]).getChild(lllIIlIllI[82]).interact(lllIIlIlIl[lllIIlIllI[83]]);
                        Time.sleepTicks((int)lllIIlIllI[3]);
                        0;
                    }
                }
            }
            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[74]).isEmpty() ? 1 : 0) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)lllIIlIllI[74], (int)lllIIlIllI[15]).interact(lllIIlIlIl[lllIIlIllI[84]]);
                Time.sleepTicks((int)lllIIlIllI[6]);
                0;
            }
            if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[85]];
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[86]).interact(lllIIlIlIl[lllIIlIllI[87]]);
                    Time.sleepTicks((int)lllIIlIllI[2]);
                    0;
                    Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).interact(lllIIlIlIl[lllIIlIllI[88]]);
                    Time.sleepTicks((int)lllIIlIllI[3]);
                    0;
                }
            }
        }
        if (aw.llIIIIIlIlllI(aw.eM() ? 1 : 0) && aw.llIIIIIlIllII(aw.eL() ? 1 : 0)) {
            if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[74]).isEmpty() ? 1 : 0) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                if (aw.llIIIIIllIlII(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                    if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]))) {
                        Widgets.get((int)lllIIlIllI[76], (int)lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[89]]);
                        Time.sleepTicks((int)lllIIlIllI[2]);
                        0;
                    }
                    if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[1]))) {
                        Widgets.get((int)lllIIlIllI[78], (int)lllIIlIllI[1]).interact(lllIIlIlIl[lllIIlIllI[90]]);
                        Time.sleepTicks((int)lllIIlIllI[5]);
                        0;
                    }
                }
                if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                    String[] stringArray = new String[lllIIlIllI[1]];
                    stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[91]];
                    if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).hasAction(stringArray) ? 1 : 0)) {
                        Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]).getChild(lllIIlIllI[92]).interact(lllIIlIlIl[lllIIlIllI[93]]);
                        Time.sleepTicks((int)lllIIlIllI[3]);
                        0;
                    }
                }
            }
            if (aw.llIIIIIlIlllI(Widgets.get((int)lllIIlIllI[74]).isEmpty() ? 1 : 0) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get((int)lllIIlIllI[74], (int)lllIIlIllI[20]).interact(lllIIlIlIl[lllIIlIllI[94]]);
                Time.sleepTicks((int)lllIIlIllI[6]);
                0;
            }
            if (aw.llIIIIIlIllll(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[6]))) {
                String[] stringArray = new String[lllIIlIllI[1]];
                stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[95]];
                if (aw.llIIIIIlIllII(Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).hasAction(stringArray) ? 1 : 0)) {
                    Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[86]).interact(lllIIlIlIl[lllIIlIllI[96]]);
                    Time.sleepTicks((int)lllIIlIllI[2]);
                    0;
                    Widgets.get((int)lllIIlIllI[75], (int)lllIIlIllI[80]).interact(lllIIlIlIl[lllIIlIllI[97]]);
                    Time.sleepTicks((int)lllIIlIllI[3]);
                    0;
                }
            }
        }
        String[] stringArray = new String[lllIIlIllI[1]];
        stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[86]];
        g.a(stringArray);
    }

    private static boolean llIIIIIlIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIlIllII(int n2) {
        return n2 != 0;
    }

    private static void Q() {
        d var1;
        Object var2;
        Object var22;
        block24: {
            block23: {
                block21: {
                    block22: {
                        block17: {
                            block20: {
                                block19: {
                                    block18: {
                                        if (!aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) break block17;
                                        int[] nArray = new int[lllIIlIllI[1]];
                                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[19];
                                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                                        int[] nArray2 = new int[lllIIlIllI[1]];
                                        nArray2[aw.lllIIlIllI[0]] = lllIIlIllI[19];
                                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block19;
                                        int[] nArray3 = new int[lllIIlIllI[1]];
                                        nArray3[aw.lllIIlIllI[0]] = lllIIlIllI[19];
                                        if (!aw.llIIIIIlIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lllIIlIllI[67])) break block19;
                                    }
                                    var22 = new d(lllIIlIllI[19], lllIIlIllI[121], e.c(lllIIlIllI[122], lllIIlIllI[123]));
                                    bv.add((d)var22);
                                    0;
                                }
                                int[] nArray = new int[lllIIlIllI[1]];
                                nArray[aw.lllIIlIllI[0]] = lllIIlIllI[17];
                                if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray4 = new int[lllIIlIllI[1]];
                                nArray4[aw.lllIIlIllI[0]] = lllIIlIllI[17];
                                if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block17;
                                int[] nArray5 = new int[lllIIlIllI[1]];
                                nArray5[aw.lllIIlIllI[0]] = lllIIlIllI[17];
                                if (!aw.llIIIIIlIllIl(Bank.getFirst((int[])nArray5).getQuantity(), lllIIlIllI[121])) break block17;
                            }
                            var22 = new d(lllIIlIllI[17], lllIIlIllI[23], lllIIlIllI[67]);
                            bv.add((d)var22);
                            0;
                        }
                        if (!aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) break block21;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray6 = new int[lllIIlIllI[1]];
                        nArray6[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                        int[] nArray7 = new int[lllIIlIllI[1]];
                        nArray7[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lllIIlIllI[121])) break block21;
                    }
                    var22 = new d(lllIIlIllI[21], lllIIlIllI[124], lllIIlIllI[125]);
                    bv.add((d)var22);
                    0;
                }
                int[] nArray = new int[lllIIlIllI[1]];
                nArray[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                int[] nArray8 = new int[lllIIlIllI[1]];
                nArray8[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block24;
                int[] nArray9 = new int[lllIIlIllI[1]];
                nArray9[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                if (!aw.llIIIIIlIllIl(Bank.getFirst((int[])nArray9).getQuantity(), lllIIlIllI[67])) break block24;
            }
            var22 = new d(lllIIlIllI[14], lllIIlIllI[126], lllIIlIllI[127]);
            bv.add((d)var22);
            0;
        }
        int[] nArray = new int[lllIIlIllI[1]];
        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[12];
        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var22 = new d(lllIIlIllI[12], lllIIlIllI[1], lllIIlIllI[128]);
            bv.add((d)var22);
            0;
        }
        int[] nArray10 = new int[lllIIlIllI[1]];
        nArray10[aw.lllIIlIllI[0]] = lllIIlIllI[10];
        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray10) ? 1 : 0)) {
            var22 = new d(lllIIlIllI[10], lllIIlIllI[1], lllIIlIllI[128]);
            bv.add((d)var22);
            0;
        }
        if (aw.llIIIIIlIlllI(Bank.contains((Predicate)(var22 = item -> item.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[136]]))) ? 1 : 0)) {
            var2 = new d(lllIIlIllI[28], lllIIlIllI[39], lllIIlIllI[129]);
            bv.add((d)var2);
            0;
        }
        if (aw.llIIIIIlIlllI(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[135]])) ? 1 : 0)) {
            var1 = new d(lllIIlIllI[130], lllIIlIllI[2], lllIIlIllI[26]);
            bv.add(var1);
            0;
        }
        int[] nArray11 = new int[lllIIlIllI[1]];
        nArray11[aw.lllIIlIllI[0]] = lllIIlIllI[131];
        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var1 = new d(lllIIlIllI[131], lllIIlIllI[67], lllIIlIllI[132]);
            bv.add(var1);
            0;
        }
    }

    private static boolean llIIIIIllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIIIIlIlIIl(String var24, String var8) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var8.toCharArray();
        int var21 = lllIIlIllI[0];
        char[] var10 = var24.toCharArray();
        int var13 = var10.length;
        int var9 = lllIIlIllI[0];
        while (aw.llIIIIIlIllIl(var9, var13)) {
            char var16 = var10[var9];
            var3.append((char)(var16 ^ var4[var21 % var4.length]));
            0;
            ++var21;
            ++var9;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    @Override
    public String ag() {
        return lllIIlIlIl[lllIIlIllI[92]];
    }

    private static boolean eO() {
        boolean bl;
        if (aw.llIIIIIllIlIl(Vars.getBit((int)lllIIlIllI[103]), lllIIlIllI[1])) {
            bl = lllIIlIllI[1];
            0;
            if (((0xB ^ 0x18) & ~(0x2E ^ 0x3D)) != 0) {
                return false;
            }
        } else {
            bl = lllIIlIllI[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean eN() {
        int n2;
        int[] nArray = new int[lllIIlIllI[1]];
        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[100];
        if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
            int[] nArray2 = new int[lllIIlIllI[1]];
            nArray2[aw.lllIIlIllI[0]] = lllIIlIllI[102];
            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray2))) {
                n2 = lllIIlIllI[1];
                0;
                if (((0xBA ^ 0xA1) & ~(0x97 ^ 0x8C)) == 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllIIlIllI[0];
        return n2 != 0;
    }

    public static void eH() {
        block39: {
            BankLocation var11;
            block40: {
                block41: {
                    block42: {
                        Predicate<Item> var23;
                        if (aw.llIIIIIlIllII(bt ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[0]];
                            b.a(bv);
                            if (aw.llIIIIIlIllIl(bv.size(), lllIIlIllI[1])) {
                                System.out.println(lllIIlIlIl[lllIIlIllI[1]]);
                                bt = lllIIlIllI[0];
                            }
                        }
                        if (!aw.llIIIIIlIlllI(bt ? 1 : 0)) break block39;
                        if (!aw.llIIIIIlIlllI(aw.an() ? 1 : 0)) break block40;
                        var11 = BankLocation.getNearest();
                        if (aw.llIIIIIlIllll(var11) && aw.llIIIIIlIlllI(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[2]];
                            if (aw.llIIIIIlIllII(Equipment.contains((int[])f.aS) ? 1 : 0)) {
                                Equipment.getFirst((int[])f.aS).interact(lllIIlIlIl[lllIIlIllI[3]]);
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lllIIlIllI[1]];
                                    nArray[aw.lllIIlIllI[0]] = lllIIlIllI[38];
                                    if (aw.llIIIIIllIlII(TileObjects.getNearest((int[])nArray))) {
                                        bl = lllIIlIllI[1];
                                        0;
                                        
                                        }
                                    } else {
                                        bl = lllIIlIllI[0];
                                    }
                                    return bl;
                                }, (int)lllIIlIllI[4]);
                                0;
                            }
                            if (aw.llIIIIIlIlllI(Equipment.contains((int[])f.aS) ? 1 : 0) && aw.llIIIIIlIllII(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aS).interact(lllIIlIlIl[lllIIlIllI[5]]);
                            }
                            if (aw.llIIIIIlIlllI(Equipment.contains((int[])f.aS) ? 1 : 0) && aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                                a.a(var11);
                                Time.sleepTicks((int)lllIIlIllI[1]);
                                0;
                            }
                        }
                        if (!aw.llIIIIIlIllll(var11) || !aw.llIIIIIlIllII(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block40;
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[6]];
                        if (aw.llIIIIIlIlllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIllI[7]);
                            0;
                        }
                        if (aw.llIIIIIlIllII(Bank.isOpen() ? 1 : 0) && aw.llIIIIIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (aw.llIIIIIlIlllI(Inventory.getAll().size())) {
                                    bl = lllIIlIllI[1];
                                    0;
                                    if (((0xE7 ^ 0xB2) & ~(0x40 ^ 0x15)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIIlIllI[0];
                                }
                                return bl;
                            }, (int)lllIIlIllI[8]);
                            0;
                            Time.sleepTicks((int)lllIIlIllI[1]);
                            0;
                        }
                        if (aw.llIIIIIlIlllI(Bank.contains(var23 = item -> item.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[137]])) ? 1 : 0)) {
                            aw.Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[9]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[10];
                        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            aw.Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[11]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                        int[] nArray2 = new int[lllIIlIllI[1]];
                        nArray2[aw.lllIIlIllI[0]] = lllIIlIllI[12];
                        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            aw.Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[13]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                        int[] nArray3 = new int[lllIIlIllI[1]];
                        nArray3[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                        if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lllIIlIllI[1]];
                            nArray4[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                            if (aw.llIIIIIlIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                aw.Q();
                                System.out.println(lllIIlIlIl[lllIIlIllI[15]]);
                                bt = lllIIlIllI[1];
                                return;
                            }
                        }
                        if (aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) {
                            int[] nArray5 = new int[lllIIlIllI[1]];
                            nArray5[aw.lllIIlIllI[0]] = lllIIlIllI[17];
                            if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                aw.Q();
                                System.out.println(lllIIlIlIl[lllIIlIllI[18]]);
                                bt = lllIIlIllI[1];
                                return;
                            }
                            int[] nArray6 = new int[lllIIlIllI[1]];
                            nArray6[aw.lllIIlIllI[0]] = lllIIlIllI[19];
                            if (aw.llIIIIIlIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                aw.Q();
                                System.out.println(lllIIlIlIl[lllIIlIllI[20]]);
                                bt = lllIIlIllI[1];
                                return;
                            }
                        }
                        if (!aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) break block41;
                        int[] nArray7 = new int[lllIIlIllI[1]];
                        nArray7[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray7) ? 1 : 0)) break block42;
                        int[] nArray8 = new int[lllIIlIllI[1]];
                        nArray8[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block41;
                        int[] nArray9 = new int[lllIIlIllI[1]];
                        nArray9[aw.lllIIlIllI[0]] = lllIIlIllI[21];
                        if (!aw.llIIIIIlIllIl(Bank.getFirst((int[])nArray9).getQuantity(), lllIIlIllI[13])) break block41;
                    }
                    aw.Q();
                    System.out.println(lllIIlIlIl[lllIIlIllI[22]]);
                    bt = lllIIlIllI[1];
                    return;
                }
                if (aw.llIIIIIlIlllI(Equipment.contains((int[])f.aS) ? 1 : 0) && aw.llIIIIIlIlllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    a.b(f.aS, lllIIlIllI[1]);
                    Time.sleepTicks((int)lllIIlIllI[1]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lllIIlIllI[1]];
                        nArray[aw.lllIIlIllI[0]] = lllIIlIllI[28];
                        if (aw.llIIIIIllIIII(Inventory.getCount((int[])nArray))) {
                            bl = lllIIlIllI[1];
                            0;
                            if (1 != 1) {
                                return ((76 + 60 - 122 + 114 ^ 40 + 127 - 8 + 38) & (0x1A ^ 0x52 ^ (0x83 ^ 0x8E) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIllI[0];
                        }
                        return bl;
                    }, (int)lllIIlIllI[7]);
                    0;
                }
                if (aw.llIIIIIlIllIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) {
                    a.a(lllIIlIllI[17], lllIIlIllI[23]);
                    a.a(lllIIlIllI[14], lllIIlIllI[24]);
                    a.a(lllIIlIllI[10], lllIIlIllI[1]);
                    a.a(lllIIlIllI[12], lllIIlIllI[1]);
                    a.a(lllIIlIllI[25], lllIIlIllI[26]);
                    a.a(lllIIlIllI[19], lllIIlIllI[27]);
                }
                if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[16])) {
                    a.a(lllIIlIllI[14], lllIIlIllI[24]);
                    a.a(lllIIlIllI[10], lllIIlIllI[1]);
                    a.a(lllIIlIllI[12], lllIIlIllI[1]);
                    a.a(lllIIlIllI[21], lllIIlIllI[27]);
                }
            }
            if (aw.llIIIIIlIllII(aw.an() ? 1 : 0)) {
                int[] nArray = new int[lllIIlIllI[1]];
                nArray[aw.lllIIlIllI[0]] = lllIIlIllI[28];
                if (aw.llIIIIIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray10 = new int[lllIIlIllI[1]];
                    nArray10[aw.lllIIlIllI[0]] = lllIIlIllI[28];
                    if (aw.llIIIIIlIlllI(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[29]];
                        Bank.close();
                        Time.sleepTicks((int)lllIIlIllI[1]);
                        0;
                        int[] nArray11 = new int[lllIIlIllI[1]];
                        nArray11[aw.lllIIlIllI[0]] = lllIIlIllI[28];
                        var11 = Inventory.getFirst((int[])nArray11);
                        if (aw.llIIIIIlIllll(var11)) {
                            var11.interact(lllIIlIlIl[lllIIlIllI[30]]);
                            Time.sleepTicks((int)lllIIlIllI[3]);
                            0;
                        }
                    }
                }
                if (aw.llIIIIIlIllIl(e.j(lllIIlIllI[31]), lllIIlIllI[1])) {
                    if (aw.llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (aw.llIIIIIllIIlI(Players.getLocal().getWorldLocation().distanceTo(oz), lllIIlIllI[2]) && aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[32]];
                        Movement.walkTo((WorldPoint)oz);
                        0;
                        Time.sleepTicks((int)lllIIlIllI[1]);
                        0;
                    }
                    if (aw.llIIIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(oz), lllIIlIllI[3])) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[33]];
                        g.a(lllIIlIlIl[lllIIlIllI[34]], cE);
                    }
                }
                if (aw.llIIIIIllIIII(e.j(lllIIlIllI[31]))) {
                    int[] nArray12 = new int[lllIIlIllI[1]];
                    nArray12[aw.lllIIlIllI[0]] = lllIIlIllI[35];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray12))) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[36]];
                        int[] nArray13 = new int[lllIIlIllI[1]];
                        nArray13[aw.lllIIlIllI[0]] = lllIIlIllI[35];
                        TileObjects.getNearest((int[])nArray13).interact(lllIIlIlIl[lllIIlIllI[37]]);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lllIIlIllI[1]];
                            nArray[aw.lllIIlIllI[0]] = lllIIlIllI[38];
                            if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                                bl = lllIIlIllI[1];
                                0;
                                
                                }
                            } else {
                                bl = lllIIlIllI[0];
                            }
                            return bl;
                        }, (int)lllIIlIllI[4]);
                        0;
                    }
                    int[] nArray14 = new int[lllIIlIllI[1]];
                    nArray14[aw.lllIIlIllI[0]] = lllIIlIllI[38];
                    if (aw.llIIIIIllIlII(TileObjects.getNearest((int[])nArray14))) {
                        int[] nArray15 = new int[lllIIlIllI[1]];
                        nArray15[aw.lllIIlIllI[0]] = lllIIlIllI[35];
                        if (aw.llIIIIIllIlII(TileObjects.getNearest((int[])nArray15))) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[39]];
                            Bank.close();
                            int[] nArray16 = new int[lllIIlIllI[1]];
                            nArray16[aw.lllIIlIllI[0]] = lllIIlIllI[14];
                            Inventory.getFirst((int[])nArray16).interact(lllIIlIlIl[lllIIlIllI[40]]);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllIIlIllI[1]];
                                nArray[aw.lllIIlIllI[0]] = lllIIlIllI[38];
                                if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray))) {
                                    bl = lllIIlIllI[1];
                                    0;
                                    if ((0x7F ^ 0x6F ^ (0x82 ^ 0x96)) <= -1) {
                                        return ((0xDF ^ 0xBE ^ (0xBE ^ 0x98)) & (35 + 49 - -10 + 117 ^ 106 + 132 - 236 + 146 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lllIIlIllI[0];
                                }
                                return bl;
                            }, (int)lllIIlIllI[4]);
                            0;
                            Time.sleepTicks((int)lllIIlIllI[3]);
                            0;
                        }
                    }
                    int[] nArray17 = new int[lllIIlIllI[1]];
                    nArray17[aw.lllIIlIllI[0]] = lllIIlIllI[38];
                    if (aw.llIIIIIlIllll(TileObjects.getNearest((int[])nArray17))) {
                        if (aw.llIIIIIlIlllI(aw.eO() ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[41]];
                            aw.eK();
                        }
                        if (aw.llIIIIIlIllII(aw.eO() ? 1 : 0)) {
                            if (aw.llIIIIIllIIIl(Skills.getLevel((Skill)Skill.CONSTRUCTION), lllIIlIllI[18]) && aw.llIIIIIlIlllI(aw.eN() ? 1 : 0)) {
                                aw.eJ();
                            }
                            if (aw.llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                aw.eI();
                            }
                            String[] stringArray = new String[lllIIlIllI[1]];
                            stringArray[aw.lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[16]];
                            g.a(stringArray);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int af() {
        try {
            aw.eH();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xC ^ 0x13 ^ (0x63 ^ 0x79)) <= 0) {
            return (0x44 ^ 0x4F ^ (0x68 ^ 0x23)) & (123 + 98 - 132 + 153 ^ 57 + 121 - 130 + 130 ^ -1);
        }
        return lllIIlIllI[133];
    }
}

