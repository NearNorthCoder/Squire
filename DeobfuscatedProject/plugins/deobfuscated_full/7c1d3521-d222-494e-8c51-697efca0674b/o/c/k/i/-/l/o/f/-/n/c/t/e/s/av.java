/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class av
implements ac {
    public static /* synthetic */ int mV;
    public static /* synthetic */ int mT;
    static /* synthetic */ WorldArea mW;
    private static /* synthetic */ String[] llIIIIIllI;
    public static /* synthetic */ int mU;
    private static /* synthetic */ int[] llIIIIlllI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea mY;
    static /* synthetic */ WorldArea mX;
    private static /* synthetic */ WorldPoint mZ;
    public static /* synthetic */ List<d> bv;

    private static boolean lIlIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ae() {
        return llIIIIlllI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[1]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[2]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[75], llIIIIlllI[76], llIIIIlllI[77], llIIIIlllI[78], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[84], llIIIIlllI[85], llIIIIlllI[26], llIIIIlllI[22], llIIIIlllI[1]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[87], llIIIIlllI[88], llIIIIlllI[89], llIIIIlllI[40], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        if (av.lIlIIlIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[89]];
            if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llIIIIlllI[95], llIIIIlllI[52], llIIIIlllI[0]));
            0;
            Time.sleepTicks((int)llIIIIlllI[1]);
            0;
        }
        if (av.lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && av.lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llIIIIlllI[1]];
            stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[96]];
            TileItem var70 = TileItems.getNearest((String[])stringArray);
            if (av.lIlIIlIIllllI(var70) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[97]];
                System.out.println(llIIIIIllI[llIIIIlllI[98]]);
                var70.interact(llIIIIIllI[llIIIIlllI[99]]);
                Time.sleepTicks((int)llIIIIlllI[9]);
                0;
            }
            if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                void var69;
                void var23;
                void var4;
                void var43;
                void var7;
                void var21;
                void var1;
                void var44;
                int var6;
                void var61;
                if (av.lIlIIlIIllIll(var61.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[100]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llIIIIlllI[1]];
                    stringArray2[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[101]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIIIIIllI[llIIIIlllI[102]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if (-1 != -1) {
                                return ((0xE5 ^ 0x86 ^ (0x1A ^ 0x40)) & (80 + 43 - 12 + 76 ^ 33 + 32 - -42 + 23 ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[104]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llIIIIlllI[1]];
                    stringArray3[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[37]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIIIIIllI[llIIIIlllI[105]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if (-(0xBF ^ 0xBB) > 0) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[106]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llIIIIlllI[1]];
                    stringArray4[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[107]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIIIIIllI[llIIIIlllI[108]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[109]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llIIIIlllI[1]];
                    stringArray5[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[110]];
                    TileObjects.getNearest((String[])stringArray5).interact(llIIIIIllI[llIIIIlllI[111]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if (((0x3A ^ 0x2B) & ~(0xB8 ^ 0xA9)) != 0) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[112]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llIIIIlllI[1]];
                    stringArray6[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[113]];
                    TileObjects.getNearest((String[])stringArray6).interact(llIIIIIllI[llIIIIlllI[39]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[6]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[114];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[115]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[116]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[117];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[118]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if (1 != 1) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[119]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[120];
                    TileObjects.getNearest((int[])nArray).interact(llIIIIIllI[llIIIIlllI[121]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if ((0x49 ^ 0x4D) != (0x7B ^ 0x7F)) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIllIll(var69.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[122]];
                    var6 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llIIIIlllI[1]];
                    stringArray7[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[123]];
                    TileObjects.getNearest((String[])stringArray7).interact(llIIIIIllI[llIIIIlllI[124]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var6)) {
                            bl = llIIIIlllI[1];
                            0;
                            if (3 != 3) {
                                return false;
                            }
                        } else {
                            bl = llIIIIlllI[0];
                        }
                        return bl;
                    }, (int)llIIIIlllI[103]);
                    0;
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
            }
        }
    }

    @Override
    public int af() {
        try {
            av.eA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > ((0x6B ^ 0x5F) & ~(0xE ^ 0x3A))) {
            return (0xAE ^ 0x93) & ~(0x26 ^ 0x1B);
        }
        return llIIIIlllI[186];
    }

    private static boolean lIlIIlIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        av.lIlIIlIIllIlI();
        av.lIlIIlIIIllIl();
        bv = new ArrayList<d>();
        mT = llIIIIlllI[27];
        mU = llIIIIlllI[23];
        mW = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[0]);
        mX = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[1]);
        mY = new WorldArea(llIIIIlllI[238], llIIIIlllI[52], llIIIIlllI[69], llIIIIlllI[72], llIIIIlllI[2]);
        mZ = new WorldPoint(llIIIIlllI[239], llIIIIlllI[240], llIIIIlllI[0]);
    }

    private static String lIlIIIllIIIII(String var62, String var68) {
        try {
            SecretKeySpec var45 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var68.getBytes(StandardCharsets.UTF_8)), llIIIIlllI[24]), "DES");
            Cipher var63 = Cipher.getInstance("DES");
            var63.init(llIIIIlllI[2], var45);
            return new String(var63.doFinal(Base64.getDecoder().decode(var62.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void eD() {
        void var26;
        void var46;
        void var64;
        void var15;
        void var13;
        WorldArea worldArea = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[125], llIIIIlllI[126], llIIIIlllI[112], llIIIIlllI[107], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[137], llIIIIlllI[139], llIIIIlllI[0]);
        if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (av.lIlIIlIIlllIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var64.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[44]];
            Movement.walkTo((WorldPoint)var26);
            0;
            Time.sleepTicks((int)llIIIIlllI[1]);
            0;
        }
        if (av.lIlIIlIIllIll(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var26), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[140]];
                Movement.walkTo((WorldPoint)var26);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var26), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[5]];
                int var32 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[141]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[142]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var32)) {
                        bl = llIIIIlllI[1];
                        0;
                        if ((9 ^ 0x5C ^ (0x3C ^ 0x6D)) == 3) {
                            return ((0x4B ^ 0x29 ^ (0xF4 ^ 0x9C)) & (0x45 ^ 0x43 ^ (0x32 ^ 0x3E) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
        }
        String[] stringArray = new String[llIIIIlllI[1]];
        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[143]];
        TileItem var32 = TileItems.getNearest((String[])stringArray);
        if (av.lIlIIlIIllllI(var32) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[144]];
            System.out.println(llIIIIIllI[llIIIIlllI[145]]);
            var32.interact(llIIIIIllI[llIIIIlllI[146]]);
            Time.sleepTicks((int)llIIIIlllI[9]);
            0;
        }
        if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
            void var67;
            void var39;
            void var54;
            void var8;
            void var10;
            void var33;
            int var11;
            TileObject var3;
            void var34;
            if (av.lIlIIlIIllIll(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[232]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[233], llIIIIlllI[131], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (((0x46 ^ 0x4F) & ~(0x14 ^ 0x1D)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[147]];
                var3.interact(llIIIIIllI[llIIIIlllI[148]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (-1 >= 1) {
                            return ((0x91 ^ 0x82 ^ (0x78 ^ 0x66)) & (2 ^ (0x61 ^ 0x6E) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[231]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[131], llIIIIlllI[224], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if ((0x76 ^ 0x2F ^ (0x73 ^ 0x2E)) == 0) {
                        return ((0xE5 ^ 0x88 ^ (0x66 ^ 0x42)) & (0xDF ^ 0x91 ^ (0x8B ^ 0x8C) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[149]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[150]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (1 == 0) {
                            return ((139 + 135 - 218 + 166 ^ 64 + 53 - 48 + 64) & (0x8D ^ 0xB4 ^ (0x4D ^ 0x2F) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[229]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[139], llIIIIlllI[230], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (2 == 1) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[151]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[152]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (-3 >= 0) {
                            return ((0xF0 ^ 0x89 ^ (0x46 ^ 0x17)) & (0xE8 ^ 0xC6 ^ (0x6C ^ 0x6A) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[226]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[227], llIIIIlllI[228], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if ((72 + 82 - 148 + 162 ^ 31 + 78 - 71 + 135) <= 0) {
                        return ((0x73 ^ 0x21 ^ (0x18 ^ 0x44)) & (63 + 72 - 58 + 62 ^ 19 + 7 - 4 + 111 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[153]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[154]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (2 == 0) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[225]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[8], llIIIIlllI[130], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (2 <= 1) {
                        return ((0x5D ^ 0x61 ^ (0xE8 ^ 0xB7)) & (82 + 206 - 273 + 210 ^ 6 + 29 - 22 + 117 ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[155]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[156]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (1 <= ((0x79 ^ 0x27) & ~(0x23 ^ 0x7D))) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var39.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[223]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[224], llIIIIlllI[214], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (-1 >= 3) {
                        return ((127 + 174 - 222 + 144 ^ 28 + 55 - 51 + 103) & (0x78 ^ 0x5E ^ (0x72 ^ 0xC) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[157]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[158]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if ((0xB2 ^ 0xB6) == 3) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var67.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var3 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[220]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[221], llIIIIlllI[222], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (-(0xEC ^ 0x9B ^ (0x1A ^ 0x69)) > 0) {
                        return ((32 + 136 - 120 + 99 ^ 105 + 132 - 232 + 160) & (0x52 ^ 0xA ^ (0xA ^ 0x64) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[159]];
                var11 = Skills.getExperience((Skill)Skill.AGILITY);
                var3.interact(llIIIIIllI[llIIIIlllI[160]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var11)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (-1 > 1) {
                            return ((0xB3 ^ 0xAE ^ (0x28 ^ 0x20)) & (22 + 12 - -73 + 46 ^ 69 + 92 - 79 + 58 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
        }
    }

    private static boolean lIlIIlIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String ag() {
        return llIIIIIllI[llIIIIlllI[202]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (av.lIlIIlIlIIIIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
            int n3;
            int[] nArray = new int[llIIIIlllI[1]];
            nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
            if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIlllI[1]];
                nArray2[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIlllI[1]];
                    nArray3[av.llIIIIlllI[0]] = llIIIIlllI[23];
                    if (!(!av.lIlIIlIIllIll(Inventory.contains((int[])nArray3) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[206]])) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[205]])) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = llIIIIlllI[1];
                        0;
                        if (1 > 0) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = llIIIIlllI[0];
            return n3 != 0;
        }
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
        if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIIIlllI[1]];
            nArray4[av.llIIIIlllI[0]] = llIIIIlllI[14];
            if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llIIIIlllI[1]];
                nArray5[av.llIIIIlllI[0]] = llIIIIlllI[13];
                if (!(!av.lIlIIlIIllIll(Inventory.contains((int[])nArray5) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[204]])) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains(item -> item.getName().contains(llIIIIIllI[llIIIIlllI[203]])) ? 1 : 0) || av.lIlIIlIIlllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && !av.lIlIIlIIllIll(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = llIIIIlllI[1];
                    0;
                    if ((129 + 33 - 92 + 113 ^ 94 + 81 - 144 + 148) == (0x5E ^ 0x55 ^ (0x20 ^ 0x2F))) return n2 != 0;
                    return ((0x75 ^ 0x3A ^ (0xDB ^ 0xAB)) & (0xF5 ^ 0xB9 ^ (0xC6 ^ 0xB5) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIIIlllI[0];
        return n2 != 0;
    }

    private static String lIlIIIlIllllI(String var51, String var35) {
        var51 = new String(Base64.getDecoder().decode(var51.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var65 = var35.toCharArray();
        int var14 = llIIIIlllI[0];
        char[] var48 = var51.toCharArray();
        int var37 = var48.length;
        int var57 = llIIIIlllI[0];
        while (av.lIlIIlIIlllII(var57, var37)) {
            char var55 = var48[var57];
            var30.append((char)(var55 ^ var65[var14 % var65.length]));
            0;
            ++var14;
            ++var57;
            0;
            if (3 <= (0x3E ^ 0x3A)) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[185])) {
            bl = llIIIIlllI[1];
            0;
            
            }
        } else {
            bl = llIIIIlllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIIIII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIIllIlI() {
        llIIIIlllI = new int[242];
        av.llIIIIlllI[0] = (0x10 ^ 0x31 ^ (0x53 ^ 0x49)) & (0x2F ^ 0x30 ^ (0x39 ^ 0x1D) ^ -1);
        av.llIIIIlllI[1] = 1;
        av.llIIIIlllI[2] = 2;
        av.llIIIIlllI[3] = 0xFFFFAFEF & 0x5D97;
        av.llIIIIlllI[4] = 0xFFFFEFE5 & 0x1D9F;
        av.llIIIIlllI[5] = 63 + 78 - 43 + 42 ^ 30 + 18 - -103 + 27;
        av.llIIIIlllI[6] = 0x98 ^ 0xAB;
        av.llIIIIlllI[7] = -(0xFFFFF6C5 & 0x4B7B) & (0xFFFFCFFA & 0x7FFD);
        av.llIIIIlllI[8] = 0xFFFFBD99 & 0x4FFE;
        av.llIIIIlllI[9] = 3;
        av.llIIIIlllI[10] = -(0xFFFFEDEA & 0x7A77) & (0xFFFFFBFF & 0x7FE9);
        av.llIIIIlllI[11] = 0xAF ^ 0x8E ^ (0xB0 ^ 0x9B);
        av.llIIIIlllI[12] = -(0xFFFFA76F & 0x78B1) & (0xFFFFBF7F & 0x7FE7);
        av.llIIIIlllI[13] = 0xFFFFFF7F & 0x1FC8;
        av.llIIIIlllI[14] = 0xFFFF9F59 & 0x7FEF;
        av.llIIIIlllI[15] = -(0xFFFFF1B3 & 0x1ECF) & (0xFFFFDFCF & 0x3FBF);
        av.llIIIIlllI[16] = 0xA5 ^ 0xA1;
        av.llIIIIlllI[17] = -(0xFFFFB5F3 & 0x5B3E) & (0xFFFFFFFD & 0x3FFF);
        av.llIIIIlllI[18] = 0x9C ^ 0x99;
        av.llIIIIlllI[19] = 0xFFFFB97F & 0x77D1;
        av.llIIIIlllI[20] = 3 ^ 0x55 ^ (0x74 ^ 0x24);
        av.llIIIIlllI[21] = 0xFFFFBFCF & 0x5F7A;
        av.llIIIIlllI[22] = 0x84 ^ 0x83;
        av.llIIIIlllI[23] = -(0xFFFFE57F & 0x5ABD) & (0xFFFFF3BF & 0x4DFD);
        av.llIIIIlllI[24] = 0x11 ^ 0x19;
        av.llIIIIlllI[25] = 0xFFFFEFF7 & 0x5CAB;
        av.llIIIIlllI[26] = 0x6D ^ 0x64;
        av.llIIIIlllI[27] = -(0xFFFFBDB5 & 0x6F6B) & (0xFFFFFFFB & 0x7FBE);
        av.llIIIIlllI[28] = -(0xFFFFC3AE & 0x7D7B) & (0xFFFFFF7F & 0x6FFD);
        av.llIIIIlllI[29] = 0xFFFFAE58 & 0x7FF7;
        av.llIIIIlllI[30] = 0xFFFFAFEF & 0x7E5E;
        av.llIIIIlllI[31] = 0xFFFFAFEE & 0x7E5D;
        av.llIIIIlllI[32] = 0xFFFFBF5A & 0x6EF7;
        av.llIIIIlllI[33] = 0xFFFFAEDB & 0x7F6E;
        av.llIIIIlllI[34] = -(0xFFFF914F & 0x6FBD) & (0xFFFFBFDD & 0x6FEE);
        av.llIIIIlllI[35] = 0xDD ^ 0x85;
        av.llIIIIlllI[36] = 0xFFFFDFBF & 0x6F4B;
        av.llIIIIlllI[37] = 69 + 0 - -51 + 53 ^ 116 + 4 - 106 + 119;
        av.llIIIIlllI[38] = 108 + 91 - 197 + 160 ^ 157 + 31 - 185 + 170;
        av.llIIIIlllI[39] = 0xB8 ^ 0x8A;
        av.llIIIIlllI[40] = 0x20 ^ 0x34;
        av.llIIIIlllI[41] = 0xA1 ^ 0xB4 ^ (0x43 ^ 0x4F);
        av.llIIIIlllI[42] = 0x5A ^ 0x44;
        av.llIIIIlllI[43] = -(0xFFFFCBCA & 0x7CB7) & (0xFFFFCBAF & 0x7DFF);
        av.llIIIIlllI[44] = 0x6D ^ 0x27 ^ (0x34 ^ 0x42);
        av.llIIIIlllI[45] = -(0xFFFFEA29 & 0x7DDF) & (0xFFFFE9FF & 0x7F3B);
        av.llIIIIlllI[46] = -(0xFFFFFE19 & 0x57EF) & (0xFFFFFFAD & 0x5FFF);
        av.llIIIIlllI[47] = 0xFFFFBF7B & 0x4DEF;
        av.llIIIIlllI[48] = 0xFFFFCDE6 & 0x3F79;
        av.llIIIIlllI[49] = 0x76 ^ 0x7D;
        av.llIIIIlllI[50] = 0xFFFFCDFF & 0x3F5D;
        av.llIIIIlllI[51] = 0xFFFFE9F1 & 0x1FAF;
        av.llIIIIlllI[52] = -(0xFFFFC8AF & 0x7779) & (0xFFFFDDFF & 0x6F7F);
        av.llIIIIlllI[53] = 0x39 ^ 0x37;
        av.llIIIIlllI[54] = 0x49 ^ 0x6B ^ (0xB6 ^ 0x86);
        av.llIIIIlllI[55] = 0xFFFFEBF7 & 0x1DBB;
        av.llIIIIlllI[56] = -(0xFFFFFA9F & 0x67E5) & (0xFFFFFFFE & 0x6FDD);
        av.llIIIIlllI[57] = -(0xFFFFE64F & 0x7FB9) & (0xFFFFFFBB & 0x6FFE);
        av.llIIIIlllI[58] = -(0xFFFFF2A7 & 0x4F5F) & (0xFFFFDF7F & 0x6FDF);
        av.llIIIIlllI[59] = -(0xFFFFE24F & 0x3FB5) & (0xFFFFBFFF & 0x6BB5);
        av.llIIIIlllI[60] = -(0xFFFFEEFF & 0x7389) & (0xFFFFFFEB & 0x6FFF);
        av.llIIIIlllI[61] = 4 ^ 0x12;
        av.llIIIIlllI[62] = -1;
        av.llIIIIlllI[63] = 0x51 ^ 0x5D;
        av.llIIIIlllI[64] = 0x57 ^ 0x76 ^ (3 ^ 0x2F);
        av.llIIIIlllI[65] = 0x28 ^ 0xF ^ (0x46 ^ 0x71);
        av.llIIIIlllI[66] = 52 + 124 - 94 + 63 ^ 87 + 108 - 104 + 37;
        av.llIIIIlllI[67] = 1 ^ 0x76 ^ (0x70 ^ 0x14);
        av.llIIIIlllI[68] = 0x6F ^ 0x71 ^ (0x88 ^ 0x83);
        av.llIIIIlllI[69] = 0x69 ^ 0x45 ^ (0x19 ^ 0x22);
        av.llIIIIlllI[70] = 122 + 83 - 131 + 113 ^ 22 + 39 - 35 + 137;
        av.llIIIIlllI[71] = 0xBB ^ 0xA1;
        av.llIIIIlllI[72] = 154 + 166 - 193 + 89 ^ 146 + 69 - 33 + 13;
        av.llIIIIlllI[73] = 2 ^ 0x1E;
        av.llIIIIlllI[74] = 0xDF ^ 0xC2;
        av.llIIIIlllI[75] = -(0xFFFFD987 & 0x6779) & (0xFFFFED7F & 0x5FDF);
        av.llIIIIlllI[76] = -(0xFFFFFE5D & 0x63E3) & (0xFFFFEFF6 & 0x7F5F);
        av.llIIIIlllI[77] = (0x62 ^ 0x6C) + (0x20 ^ 0x36) - -1 + (0x6E ^ 0xA);
        av.llIIIIlllI[78] = 0x3B ^ 0x65;
        av.llIIIIlllI[79] = 0xFFFFCEB7 & 0x3DDB;
        av.llIIIIlllI[80] = -(0xFFFFE127 & 0x5EFF) & (0xFFFFFDFF & 0x4F77);
        av.llIIIIlllI[81] = -(0xFFFFE377 & 0x5EBC) & (0xFFFFFEBF & 0x4FFF);
        av.llIIIIlllI[82] = 0xFFFFDC7E & 0x2FFF;
        av.llIIIIlllI[83] = 0xFFFFBDF6 & 0x4F5D;
        av.llIIIIlllI[84] = 0xFFFFACF6 & 0x5F7F;
        av.llIIIIlllI[85] = 0xFFFFCDF7 & 0x3F5D;
        av.llIIIIlllI[86] = 0xFFFFAD5F & 0x5FE9;
        av.llIIIIlllI[87] = -(0xFFFFA29D & 0x5FF7) & (0xFFFF8FFF & 0x7EFF);
        av.llIIIIlllI[88] = 0xFFFFEDFF & 0x1F36;
        av.llIIIIlllI[89] = 0xB7 ^ 0xA8;
        av.llIIIIlllI[90] = -(0xFFFFB3F7 & 0x6F4F) & (0xFFFFBFFF & 0x6FD7);
        av.llIIIIlllI[91] = -(0xFFFFFBFA & 0x66BF) & (0xFFFFFFFD & 0x6FFB);
        av.llIIIIlllI[92] = 0xFFFF8EFE & 0x7DA3;
        av.llIIIIlllI[93] = -(0xFFFFEEE7 & 0x519A) & (0xFFFFDFDB & 0x6DEF);
        av.llIIIIlllI[94] = 0xFFFFBD52 & 0x4FFF;
        av.llIIIIlllI[95] = 0xFFFFBFB8 & 0x4CDF;
        av.llIIIIlllI[96] = 97 + 146 - 118 + 105 ^ 52 + 49 - 56 + 153;
        av.llIIIIlllI[97] = 0xB3 ^ 0x92;
        av.llIIIIlllI[98] = 0x12 ^ 0x17 ^ (0x63 ^ 0x44);
        av.llIIIIlllI[99] = 0x7E ^ 0x5D;
        av.llIIIIlllI[100] = 0x21 ^ 5;
        av.llIIIIlllI[101] = 0x10 ^ 0x35;
        av.llIIIIlllI[102] = 0x38 ^ 0x1E;
        av.llIIIIlllI[103] = -(0xFFFFFBDB & 0x5E27) & (0xFFFFFFB7 & 0x7B7E);
        av.llIIIIlllI[104] = 14 + 151 - -1 + 21 ^ 65 + 61 - 70 + 100;
        av.llIIIIlllI[105] = 0x76 ^ 0x5F;
        av.llIIIIlllI[106] = 0xA1 ^ 0x8B;
        av.llIIIIlllI[107] = 0xC ^ 0x1A ^ (0x37 ^ 0xA);
        av.llIIIIlllI[108] = 97 + 1 - -52 + 1 ^ 183 + 130 - 250 + 124;
        av.llIIIIlllI[109] = 100 + 2 - 22 + 74 ^ 109 + 94 - 201 + 181;
        av.llIIIIlllI[110] = 0xA5 ^ 0x8B;
        av.llIIIIlllI[111] = 0x51 ^ 0x5C ^ (0xE6 ^ 0xC4);
        av.llIIIIlllI[112] = 0x40 ^ 0x59 ^ (0xAD ^ 0x84);
        av.llIIIIlllI[113] = 72 + 133 - 119 + 66 ^ 70 + 80 - 42 + 61;
        av.llIIIIlllI[114] = -(0xFFFFDA5A & 0x67A7) & (0xFFFFFFF7 & 0x7BFB);
        av.llIIIIlllI[115] = 0xC ^ 0x38;
        av.llIIIIlllI[116] = 0x9D ^ 0xA8;
        av.llIIIIlllI[117] = 0xFFFFFBFB & 0x3DF7;
        av.llIIIIlllI[118] = 5 ^ 0x33;
        av.llIIIIlllI[119] = 0xB6 ^ 0x81;
        av.llIIIIlllI[120] = 0xFFFFFFF7 & 0x39FC;
        av.llIIIIlllI[121] = 0x86 ^ 0x95 ^ (0x82 ^ 0xA9);
        av.llIIIIlllI[122] = 0x5F ^ 0x62 ^ (0x9F ^ 0x9B);
        av.llIIIIlllI[123] = 1 ^ (0x4F ^ 0x74);
        av.llIIIIlllI[124] = 0x2B ^ 0x4E ^ (0x13 ^ 0x4D);
        av.llIIIIlllI[125] = -(0xFFFFFB79 & 0x6B7) & (0xFFFF9FFF & 0x6FBF);
        av.llIIIIlllI[126] = -(0xFFFFF2B2 & 0x4F4F) & (0xFFFFCFDB & 0x7FAF);
        av.llIIIIlllI[127] = 0xFFFFDDFE & 0x2FAF;
        av.llIIIIlllI[128] = -(0xFFFFB07D & 0x6FD3) & (0xFFFFBFFB & 0x6DF6);
        av.llIIIIlllI[129] = -(0xFFFFF3FD & 0x7C5B) & (0xFFFFFFFF & 0x7DFF);
        av.llIIIIlllI[130] = 0xFFFF9FDF & 0x6DBB;
        av.llIIIIlllI[131] = -(0xFFFFF7DB & 0x1A37) & (0xFFFF9FFB & 0x7FBF);
        av.llIIIIlllI[132] = 0xFFFFEFBF & 0x1DD0;
        av.llIIIIlllI[133] = -(0xFFFFDA2D & 0x77D7) & (0xFFFFFFAF & 0x5FF5);
        av.llIIIIlllI[134] = -(0xFFFFF34D & 0x5CFB) & (0xFFFFDDFB & 0x7FDF);
        av.llIIIIlllI[135] = 0xFFFFDFDF & 0x2DBD;
        av.llIIIIlllI[136] = 0xFFFF9FCB & 0x6DBF;
        av.llIIIIlllI[137] = 0xFFFF8DBB & 0x7FF6;
        av.llIIIIlllI[138] = 0xFFFFCD9F & 0x3FF1;
        av.llIIIIlllI[139] = 0xFFFFBFDF & 0x4DBE;
        av.llIIIIlllI[140] = 58 + 98 - 57 + 35 ^ 59 + 150 - 114 + 92;
        av.llIIIIlllI[141] = 0x96 ^ 0xA9;
        av.llIIIIlllI[142] = 0x35 ^ 0x75;
        av.llIIIIlllI[143] = 0x98 ^ 0xC6 ^ (0x35 ^ 0x2A);
        av.llIIIIlllI[144] = 172 + 112 - 247 + 177 ^ 97 + 10 - 39 + 80;
        av.llIIIIlllI[145] = 0x26 ^ 0x44 ^ (0x97 ^ 0xB6);
        av.llIIIIlllI[146] = 0xDD ^ 0xB3 ^ (0x7D ^ 0x57);
        av.llIIIIlllI[147] = 0x4B ^ 0xE;
        av.llIIIIlllI[148] = 0xCC ^ 0x8A;
        av.llIIIIlllI[149] = 0xF1 ^ 0xB6;
        av.llIIIIlllI[150] = 8 ^ 0x40;
        av.llIIIIlllI[151] = 0x1D ^ 0x54;
        av.llIIIIlllI[152] = 15 + 28 - -133 + 43 ^ 61 + 22 - 5 + 67;
        av.llIIIIlllI[153] = 0xF0 ^ 0xBB;
        av.llIIIIlllI[154] = 0xC7 ^ 0x8B;
        av.llIIIIlllI[155] = 0x74 ^ 0x39;
        av.llIIIIlllI[156] = 100 + 21 - 44 + 143 ^ 54 + 25 - 53 + 120;
        av.llIIIIlllI[157] = 173 + 155 - 210 + 117 ^ 77 + 80 - 15 + 22;
        av.llIIIIlllI[158] = 0xDF ^ 0x8F;
        av.llIIIIlllI[159] = 79 + 26 - -1 + 94 ^ 62 + 80 - 113 + 124;
        av.llIIIIlllI[160] = 117 + 122 - 56 + 14 ^ 48 + 108 - 46 + 41;
        av.llIIIIlllI[161] = -(0xFFFFEA75 & 0x758B) & (0xFFFFFB7F & 0x6EFF);
        av.llIIIIlllI[162] = 0xFFFFFDFE & 0xF7F;
        av.llIIIIlllI[163] = -(0xFFFFF16B & 0x7FD5) & (0xFFFFFBFF & 0x7FDF);
        av.llIIIIlllI[164] = -(0xFFFFE37B & 0x7CD7) & (0xFFFFFEDF & 0x6BFF);
        av.llIIIIlllI[165] = -(0xFFFFFC6F & 0x37F5) & (0xFFFFFFF7 & 0x3EFF);
        av.llIIIIlllI[166] = 0xFFFFEFD9 & 0x1AAF;
        av.llIIIIlllI[167] = -(0xFFFFE5CE & 0x3B75) & (0xFFFFAFC3 & 0x7BFF);
        av.llIIIIlllI[168] = -(0xFFFFB87D & 0x77F7) & (0xFFFFBFF5 & 0x7DFF);
        av.llIIIIlllI[169] = -(0xC ^ 0x1B) & (0xFFFFCFBF & 0x3AFF);
        av.llIIIIlllI[170] = -(0xFFFFFE8F & 0x7377) & (0xFFFFFFA7 & 0x7FFE);
        av.llIIIIlllI[171] = 0x7C ^ 0x27 ^ (0x58 ^ 0x50);
        av.llIIIIlllI[172] = 0x11 ^ 0x45;
        av.llIIIIlllI[173] = 0xFF ^ 0xAA;
        av.llIIIIlllI[174] = 0x2A ^ 0x7C;
        av.llIIIIlllI[175] = 0x15 ^ 0x3E ^ (0x68 ^ 0x14);
        av.llIIIIlllI[176] = 0xD6 ^ 0xC2 ^ (0x5E ^ 0x13);
        av.llIIIIlllI[177] = 0x13 ^ 0x49;
        av.llIIIIlllI[178] = 0x62 ^ 0x39;
        av.llIIIIlllI[179] = 142 + 68 - 55 + 4 ^ 182 + 71 - 153 + 95;
        av.llIIIIlllI[180] = 0x73 ^ 0x2E;
        av.llIIIIlllI[181] = 0x64 ^ 0x2C ^ (0x49 ^ 0x5E);
        av.llIIIIlllI[182] = 0xCF ^ 0xAF;
        av.llIIIIlllI[183] = 67 + 83 - 108 + 118 ^ 160 + 181 - 270 + 122;
        av.llIIIIlllI[184] = 0xE8 ^ 0x8A;
        av.llIIIIlllI[185] = 0xBF ^ 0xC3 ^ (0x31 ^ 0x2E);
        av.llIIIIlllI[186] = 0xE ^ 0x7A ^ (0x4A ^ 0x5A);
        av.llIIIIlllI[187] = 0xA4 ^ 0xC1;
        av.llIIIIlllI[188] = -(0xFFFFB1AB & 0x7EDD) & (0xFFFFBFFF & 0x7CFF);
        av.llIIIIlllI[189] = 0xFFFFDD5E & 0x2FF7;
        av.llIIIIlllI[190] = -(0xFFFF9295 & 0x7D7B) & (0xFFFF9E7E & 0x7DFF);
        av.llIIIIlllI[191] = 0xFFFFEF7B & 0x1DBF;
        av.llIIIIlllI[192] = 0xFFFFEEDD & 0x3F6B;
        av.llIIIIlllI[193] = 19 + 179 - 194 + 237 ^ 115 + 76 - 111 + 71;
        av.llIIIIlllI[194] = -(0xFFFFAEE9 & 0x5317) & (0xFFFF9FFD & 0x777E);
        av.llIIIIlllI[195] = -(0xFFFFECDD & 0x1F63) & (0xFFFFFDFA & 0x6FED);
        av.llIIIIlllI[196] = 0xFFFFB7CE & 0x4BB5;
        av.llIIIIlllI[197] = 0xFFFF8FBE & 0x73F7;
        av.llIIIIlllI[198] = -(0xFFFFF969 & 0x3EF7) & (0xFFFFFFFF & 0x3FFE);
        av.llIIIIlllI[199] = 0xFFFFE6F6 & 0x3BFF;
        av.llIIIIlllI[200] = -(0xFFFFD1F3 & 0x2F1E) & (0xFFFFAFDF & 0x7FFB);
        av.llIIIIlllI[201] = -(0xFFFF9DB3 & 0x6ACD) & (0xFFFFFDFE & 0x6FDF);
        av.llIIIIlllI[202] = 0xFA ^ 0xC1 ^ (0xCA ^ 0x96);
        av.llIIIIlllI[203] = 0xD6 ^ 0xBE;
        av.llIIIIlllI[204] = 5 ^ 0x77 ^ (0xB2 ^ 0xA9);
        av.llIIIIlllI[205] = 0x28 ^ 0x69 ^ (0xAB ^ 0x80);
        av.llIIIIlllI[206] = 0x52 ^ 0x39;
        av.llIIIIlllI[207] = 59 + 171 - 161 + 146 ^ 7 + 44 - -78 + 58;
        av.llIIIIlllI[208] = -(0xFFFFF531 & 0x1FFF) & (0xFFFFFFFF & 0x1FBF);
        av.llIIIIlllI[209] = 0xFFFFFFCD & 0xDBB;
        av.llIIIIlllI[210] = 0xD5 ^ 0xB8;
        av.llIIIIlllI[211] = -(0x19 ^ 0x3A) & (0xFFFFEFBF & 0x1DEF);
        av.llIIIIlllI[212] = 0x78 ^ 0x16;
        av.llIIIIlllI[213] = 0xFFFFCF9F & 0x3AF7;
        av.llIIIIlllI[214] = 0xFFFFFDB6 & 0xFDD;
        av.llIIIIlllI[215] = 0x6E ^ 1;
        av.llIIIIlllI[216] = 0xFFFFBFDF & 0x4AB6;
        av.llIIIIlllI[217] = 0x42 ^ 0x32;
        av.llIIIIlllI[218] = 0xFFFFEEBF & 0x1BE1;
        av.llIIIIlllI[219] = 0xFFFF9DED & 0x6FB7;
        av.llIIIIlllI[220] = 0x65 ^ 0x14;
        av.llIIIIlllI[221] = -(0xFFFFDF69 & 0x72D7) & (0xFFFFDFFF & 0x7FF6);
        av.llIIIIlllI[222] = -(0xFFFFF34F & 0x7CB1) & (0xFFFFFDFE & 0x7F9D);
        av.llIIIIlllI[223] = 0xAC ^ 0xB2 ^ (0x45 ^ 0x29);
        av.llIIIIlllI[224] = 0xFFFFEDAF & 0x1FFF;
        av.llIIIIlllI[225] = 0x20 ^ 0x68 ^ (0x9B ^ 0xA0);
        av.llIIIIlllI[226] = 0xB ^ 0x5F ^ (0x63 ^ 0x43);
        av.llIIIIlllI[227] = -(0xFFFFF7E9 & 0x1A7F) & (0xFFFFDFFF & 0x3FFE);
        av.llIIIIlllI[228] = -(0xFFFFDA5F & 0x27BB) & (0xFFFF8FBF & 0x7FFE);
        av.llIIIIlllI[229] = 140 + 32 - 118 + 175 ^ 108 + 81 - 67 + 22;
        av.llIIIIlllI[230] = -(0xFFFFF3ED & 0x4C53) & (0xFFFFDFFB & 0x6DEF);
        av.llIIIIlllI[231] = 0x37 ^ 0x41;
        av.llIIIIlllI[232] = 0xA ^ 0x6E ^ (0x48 ^ 0x5B);
        av.llIIIIlllI[233] = 0xFFFF8FF3 & 0x7DBD;
        av.llIIIIlllI[234] = 0xDC ^ 0xA4;
        av.llIIIIlllI[235] = -(0xFFFFBA43 & 0x75BD) & (0xFFFFFFF7 & 0x39BF);
        av.llIIIIlllI[236] = -(0xFFFFE485 & 0x7B7B) & (0xFFFFFD67 & 0x6FFF);
        av.llIIIIlllI[237] = 0xC9 ^ 0xB0;
        av.llIIIIlllI[238] = -(0xFFFFDEDF & 0x713B) & (0xFFFFDFBE & 0x79FF);
        av.llIIIIlllI[239] = 0xFFFFABAF & 0x5DFA;
        av.llIIIIlllI[240] = -(0xFFFFFEB3 & 0x535F) & (0xFFFFFFFF & 0x5F7F);
        av.llIIIIlllI[241] = 0x13 ^ 0x69;
    }

    /*
     * WARNING - void declaration
     */
    private static void eE() {
        void var31;
        void var27;
        void var56;
        void var42;
        void var28;
        WorldArea worldArea = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[1]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[2]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[161], llIIIIlllI[162], llIIIIlllI[111], llIIIIlllI[111], llIIIIlllI[9]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldPoint worldPoint = new WorldPoint(llIIIIlllI[169], llIIIIlllI[170], llIIIIlllI[0]);
        if (av.lIlIIlIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (av.lIlIIlIIlllIl(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var56.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[171]];
            Movement.walkTo((WorldPoint)var31);
            0;
            Time.sleepTicks((int)llIIIIlllI[1]);
            0;
        }
        if (av.lIlIIlIIllIll(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var31), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[172]];
                Movement.walkTo((WorldPoint)var31);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var31), llIIIIlllI[20])) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[173]];
                int var58 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[174]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[175]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var58)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (2 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
        }
        String[] stringArray = new String[llIIIIlllI[1]];
        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[35]];
        TileItem var58 = TileItems.getNearest((String[])stringArray);
        if (av.lIlIIlIIllllI(var58) && av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[176]];
            System.out.println(llIIIIIllI[llIIIIlllI[177]]);
            var58.interact(llIIIIIllI[llIIIIlllI[178]]);
            Time.sleepTicks((int)llIIIIlllI[9]);
            0;
        }
        if (av.lIlIIlIIlllIl(av.eF() ? 1 : 0)) {
            void var25;
            void var47;
            void var16;
            void var9;
            int var17;
            TileObject var72;
            void var71;
            if (av.lIlIIlIIllIll(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var72 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[217]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[218], llIIIIlllI[219], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (((0x47 ^ 0x1B) & ~(0xE0 ^ 0xBC)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                var17 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[179]];
                var72.interact(llIIIIIllI[llIIIIlllI[180]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (-1 > 0) {
                            return ((0xF9 ^ 0xBA ^ (0x7F ^ 0xE)) & (91 + 13 - 27 + 84 ^ 12 + 14 - 24 + 145 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var72 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[215]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[216], llIIIIlllI[128], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (((0xC1 ^ 0x98) & ~(0xCE ^ 0x97)) != 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[78]];
                var17 = Skills.getExperience((Skill)Skill.AGILITY);
                var72.interact(llIIIIIllI[llIIIIlllI[181]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (-3 >= 0) {
                            return ((0x13 ^ 0x23 ^ (0x68 ^ 0x4B)) & (0x4C ^ 0x36 ^ (0x7A ^ 0x13) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var72 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[212]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[213], llIIIIlllI[214], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (2 != 2) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[182]];
                var17 = Skills.getExperience((Skill)Skill.AGILITY);
                var72.interact(llIIIIIllI[llIIIIlllI[183]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (3 <= -1) {
                            return false;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var72 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[210]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[211], llIIIIlllI[9])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (-(0x7E ^ 0x68 ^ (0xA ^ 0x18)) >= 0) {
                        return ((55 + 90 - 107 + 119 ^ 60 + 30 - -22 + 29) & (0xBB ^ 0xAF ^ (0x4E ^ 0x4A) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[184]];
                var17 = Skills.getExperience((Skill)Skill.AGILITY);
                var72.interact(llIIIIIllI[llIIIIlllI[185]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];
                        0;
                        
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
            if (av.lIlIIlIIllIll(av.eF() ? 1 : 0)) {
                return;
            }
            if (av.lIlIIlIIllIll(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllllI(var72 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[207]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[208], llIIIIlllI[209], llIIIIlllI[2])), llIIIIlllI[2])) {
                    n2 = llIIIIlllI[1];
                    0;
                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIIlllI[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[186]];
                var17 = Skills.getExperience((Skill)Skill.AGILITY);
                var72.interact(llIIIIIllI[llIIIIlllI[187]]);
                Time.sleepTicks((int)e.c(llIIIIlllI[1], llIIIIlllI[2]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (av.lIlIIlIIlllll(Skills.getExperience((Skill)Skill.AGILITY), var17)) {
                        bl = llIIIIlllI[1];
                        0;
                        if (((0x5B ^ 0x30 ^ (0x83 ^ 0xA1)) & (118 + 152 - 207 + 134 ^ 38 + 57 - 93 + 138 ^ -1)) != 0) {
                            return ((0x92 ^ 0xC0 ^ (0x42 ^ 2)) & (52 + 47 - 22 + 53 ^ 51 + 95 - 88 + 86 ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIIIlllI[0];
                    }
                    return bl;
                }, (int)llIIIIlllI[103]);
                0;
                Time.sleepTicks((int)llIIIIlllI[1]);
                0;
            }
        }
    }

    private static boolean lIlIIlIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void eB() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[46], llIIIIlllI[48], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[0]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[46], llIIIIlllI[50], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[1]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[51], llIIIIlllI[52], llIIIIlllI[53], llIIIIlllI[54], llIIIIlllI[2]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[55], llIIIIlllI[56], llIIIIlllI[24], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[57], llIIIIlllI[58], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[0]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[59], llIIIIlllI[60], llIIIIlllI[11], llIIIIlllI[20], llIIIIlllI[0]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[46], llIIIIlllI[47], llIIIIlllI[61], llIIIIlllI[20], llIIIIlllI[0]);
        if (av.lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && av.lIlIIlIIlllIl(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[11]];
            e.b(mZ);
            Time.sleepTicks((int)llIIIIlllI[1]);
            0;
        }
        if ((!av.lIlIIlIIlllIl(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !av.lIlIIlIIlllIl(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || av.lIlIIlIIllIll(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && av.lIlIIlIlIIIlI(Players.getLocal().getAnimation(), llIIIIlllI[62]) && av.lIlIIlIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void var18;
            void var49;
            void var66;
            void var22;
            void var29;
            void var50;
            void var59;
            if (av.lIlIIlIIllIll(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[49]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[63]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[64]]);
                Time.sleepTicks((int)llIIIIlllI[2]);
                0;
            }
            if (av.lIlIIlIIllIll(var50.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[53]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[38]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[65]]);
                Time.sleepTicks((int)llIIIIlllI[2]);
                0;
            }
            if (av.lIlIIlIIllIll(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[66]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[54]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[67]]);
                Time.sleepTicks((int)llIIIIlllI[2]);
                0;
            }
            if (av.lIlIIlIIllIll(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[40]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[68]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[61]]);
                Time.sleepTicks((int)llIIIIlllI[18]);
                0;
            }
            if (av.lIlIIlIIllIll(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[69]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[70]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[41]]);
                Time.sleepTicks((int)llIIIIlllI[16]);
                0;
            }
            if (av.lIlIIlIIllIll(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[71]];
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[72]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIIIllI[llIIIIlllI[73]]);
                Time.sleepTicks((int)llIIIIlllI[9]);
                0;
            }
            if (av.lIlIIlIIllIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[74]];
                TileObject var19 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (av.lIlIIlIIllIll(tileObject.getName().contains(llIIIIIllI[llIIIIlllI[234]]) ? 1 : 0) && av.lIlIIlIlIIlII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIIIlllI[235], llIIIIlllI[236], llIIIIlllI[0])), llIIIIlllI[2])) {
                        String[] stringArray = new String[llIIIIlllI[1]];
                        stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[237]];
                        if (av.lIlIIlIIllIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIIIIlllI[1];
                            0;
                            if (1 < 3) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIIIIlllI[0];
                    return n2 != 0;
                });
                if (av.lIlIIlIIllllI(var19)) {
                    var19.interact(llIIIIIllI[llIIIIlllI[42]]);
                    Time.sleepTicks((int)e.c(llIIIIlllI[9], llIIIIlllI[16]));
                    0;
                }
                if (av.lIlIIlIlIIIll(var19)) {
                    e.D();
                }
            }
        }
    }

    private static boolean lIlIIlIIllllI(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIIIlllI[79], llIIIIlllI[80], llIIIIlllI[69], llIIIIlllI[64], llIIIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(llIIIIlllI[81], llIIIIlllI[80], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea3 = new WorldArea(llIIIIlllI[82], llIIIIlllI[83], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[9]);
        WorldArea worldArea4 = new WorldArea(llIIIIlllI[188], llIIIIlllI[189], llIIIIlllI[24], llIIIIlllI[18], llIIIIlllI[1]);
        WorldArea worldArea5 = new WorldArea(llIIIIlllI[84], llIIIIlllI[86], llIIIIlllI[11], llIIIIlllI[24], llIIIIlllI[9]);
        WorldArea worldArea6 = new WorldArea(llIIIIlllI[190], llIIIIlllI[191], llIIIIlllI[73], llIIIIlllI[38], llIIIIlllI[9]);
        WorldArea worldArea7 = new WorldArea(llIIIIlllI[90], llIIIIlllI[91], llIIIIlllI[66], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea8 = new WorldArea(llIIIIlllI[92], llIIIIlllI[93], llIIIIlllI[22], llIIIIlllI[26], llIIIIlllI[9]);
        WorldArea worldArea9 = new WorldArea(llIIIIlllI[92], llIIIIlllI[94], llIIIIlllI[11], llIIIIlllI[22], llIIIIlllI[9]);
        WorldArea worldArea10 = new WorldArea(llIIIIlllI[127], llIIIIlllI[128], llIIIIlllI[49], llIIIIlllI[11], llIIIIlllI[2]);
        WorldArea worldArea11 = new WorldArea(llIIIIlllI[129], llIIIIlllI[127], llIIIIlllI[49], llIIIIlllI[24], llIIIIlllI[2]);
        WorldArea worldArea12 = new WorldArea(llIIIIlllI[130], llIIIIlllI[131], llIIIIlllI[63], llIIIIlllI[49], llIIIIlllI[2]);
        WorldArea worldArea13 = new WorldArea(llIIIIlllI[132], llIIIIlllI[133], llIIIIlllI[11], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea14 = new WorldArea(llIIIIlllI[134], llIIIIlllI[8], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea15 = new WorldArea(llIIIIlllI[135], llIIIIlllI[136], llIIIIlllI[68], llIIIIlllI[53], llIIIIlllI[9]);
        WorldArea worldArea16 = new WorldArea(llIIIIlllI[137], llIIIIlllI[138], llIIIIlllI[63], llIIIIlllI[64], llIIIIlllI[2]);
        WorldArea worldArea17 = new WorldArea(llIIIIlllI[163], llIIIIlllI[133], llIIIIlllI[64], llIIIIlllI[11], llIIIIlllI[9]);
        WorldArea worldArea18 = new WorldArea(llIIIIlllI[164], llIIIIlllI[139], llIIIIlllI[38], llIIIIlllI[53], llIIIIlllI[2]);
        WorldArea worldArea19 = new WorldArea(llIIIIlllI[165], llIIIIlllI[134], llIIIIlllI[49], llIIIIlllI[26], llIIIIlllI[2]);
        WorldArea worldArea20 = new WorldArea(llIIIIlllI[166], llIIIIlllI[136], llIIIIlllI[70], llIIIIlllI[64], llIIIIlllI[9]);
        WorldArea worldArea21 = new WorldArea(llIIIIlllI[167], llIIIIlllI[168], llIIIIlllI[54], llIIIIlllI[63], llIIIIlllI[2]);
        WorldArea[] worldAreaArray = new WorldArea[llIIIIlllI[68]];
        worldAreaArray[av.llIIIIlllI[0]] = worldArea;
        worldAreaArray[av.llIIIIlllI[1]] = worldArea2;
        worldAreaArray[av.llIIIIlllI[2]] = worldArea3;
        worldAreaArray[av.llIIIIlllI[9]] = worldArea4;
        worldAreaArray[av.llIIIIlllI[16]] = worldArea5;
        worldAreaArray[av.llIIIIlllI[18]] = worldArea6;
        worldAreaArray[av.llIIIIlllI[20]] = worldArea7;
        worldAreaArray[av.llIIIIlllI[22]] = worldArea8;
        worldAreaArray[av.llIIIIlllI[24]] = worldArea9;
        worldAreaArray[av.llIIIIlllI[26]] = worldArea10;
        worldAreaArray[av.llIIIIlllI[11]] = worldArea11;
        worldAreaArray[av.llIIIIlllI[49]] = worldArea12;
        worldAreaArray[av.llIIIIlllI[63]] = worldArea13;
        worldAreaArray[av.llIIIIlllI[64]] = worldArea14;
        worldAreaArray[av.llIIIIlllI[53]] = worldArea15;
        worldAreaArray[av.llIIIIlllI[38]] = worldArea16;
        worldAreaArray[av.llIIIIlllI[65]] = worldArea17;
        worldAreaArray[av.llIIIIlllI[66]] = worldArea18;
        worldAreaArray[av.llIIIIlllI[54]] = worldArea19;
        worldAreaArray[av.llIIIIlllI[67]] = worldArea20;
        worldAreaArray[av.llIIIIlllI[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[192];
        if (av.lIlIIlIIllllI(TileItems.getNearest((int[])nArray))) {
            void var52;
            System.out.println(llIIIIIllI[llIIIIlllI[193]]);
            int var60 = llIIIIlllI[0];
            while (av.lIlIIlIIlllII(var60, ((void)var52).length)) {
                int[] nArray2 = new int[llIIIIlllI[1]];
                nArray2[av.llIIIIlllI[0]] = llIIIIlllI[192];
                if (av.lIlIIlIIllIll(var52[var60].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && av.lIlIIlIIllIll(var52[var60].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIIIlllI[1];
                }
                ++var60;
                0;
                if (3 > 0) continue;
                return false;
            }
        }
        return llIIIIlllI[0];
    }

    private static boolean lIlIIlIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIllIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIlIlllll(String var5, String var2) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var41 = Cipher.getInstance("Blowfish");
            var41.init(llIIIIlllI[2], var24);
            return new String(var41.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIll(Object object) {
        return object == null;
    }

    public static void eA() {
        if (av.lIlIIlIIllIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[0]];
            b.a(bv);
            if (av.lIlIIlIIlllII(bv.size(), llIIIIlllI[1])) {
                System.out.println(llIIIIIllI[llIIIIlllI[1]]);
                bt = llIIIIlllI[0];
            }
        }
        if (av.lIlIIlIIlllIl(bt ? 1 : 0)) {
            if (av.lIlIIlIIlllIl(av.an() ? 1 : 0)) {
                BankLocation var38 = BankLocation.getNearest();
                if (av.lIlIIlIIllllI(var38) && av.lIlIIlIIlllIl(var38.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[2]];
                    WorldArea var36 = new WorldArea(llIIIIlllI[3], llIIIIlllI[4], llIIIIlllI[5], llIIIIlllI[6], llIIIIlllI[0]);
                    if (av.lIlIIlIIllIll(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var40 = new WorldPoint(llIIIIlllI[7], llIIIIlllI[8], llIIIIlllI[0]);
                        if (av.lIlIIlIIlllll(Players.getLocal().getWorldLocation().distanceTo(var40), llIIIIlllI[9])) {
                            Movement.walkTo((WorldPoint)var40);
                            0;
                            Time.sleepTicks((int)llIIIIlllI[1]);
                            0;
                        }
                    }
                    a.a(var38);
                }
                if (av.lIlIIlIIllllI(var38) && av.lIlIIlIIllIll(var38.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIllI[llIIIIlllI[9]];
                    if (av.lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlllI[10]);
                        0;
                    }
                    if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (av.lIlIIlIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIIIlllI[1]);
                            0;
                        }
                        if (av.lIlIIlIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIIIlllI[2]);
                            0;
                        }
                    }
                    int[] nArray = new int[llIIIIlllI[11]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[12];
                    nArray[av.llIIIIlllI[1]] = llIIIIlllI[13];
                    nArray[av.llIIIIlllI[2]] = llIIIIlllI[14];
                    nArray[av.llIIIIlllI[9]] = llIIIIlllI[15];
                    nArray[av.llIIIIlllI[16]] = llIIIIlllI[17];
                    nArray[av.llIIIIlllI[18]] = llIIIIlllI[19];
                    nArray[av.llIIIIlllI[20]] = llIIIIlllI[21];
                    nArray[av.llIIIIlllI[22]] = llIIIIlllI[23];
                    nArray[av.llIIIIlllI[24]] = llIIIIlllI[25];
                    nArray[av.llIIIIlllI[26]] = llIIIIlllI[27];
                    if (av.lIlIIlIIlllIl(e.c(nArray) ? 1 : 0)) {
                        av.Q();
                        System.out.println(llIIIIIllI[llIIIIlllI[16]]);
                        bt = llIIIIlllI[1];
                        return;
                    }
                    int[] nArray2 = new int[llIIIIlllI[11]];
                    nArray2[av.llIIIIlllI[0]] = llIIIIlllI[12];
                    nArray2[av.llIIIIlllI[1]] = llIIIIlllI[13];
                    nArray2[av.llIIIIlllI[2]] = llIIIIlllI[14];
                    nArray2[av.llIIIIlllI[9]] = llIIIIlllI[15];
                    nArray2[av.llIIIIlllI[16]] = llIIIIlllI[17];
                    nArray2[av.llIIIIlllI[18]] = llIIIIlllI[19];
                    nArray2[av.llIIIIlllI[20]] = llIIIIlllI[21];
                    nArray2[av.llIIIIlllI[22]] = llIIIIlllI[23];
                    nArray2[av.llIIIIlllI[24]] = llIIIIlllI[25];
                    nArray2[av.llIIIIlllI[26]] = llIIIIlllI[27];
                    if (av.lIlIIlIIllIll(e.c(nArray2) ? 1 : 0)) {
                        a.a(llIIIIlllI[28], llIIIIlllI[1]);
                        a.a(llIIIIlllI[29], llIIIIlllI[1]);
                        a.a(llIIIIlllI[30], llIIIIlllI[1]);
                        a.a(llIIIIlllI[31], llIIIIlllI[1]);
                        a.a(llIIIIlllI[32], llIIIIlllI[1]);
                        a.a(llIIIIlllI[33], llIIIIlllI[1]);
                        a.a(llIIIIlllI[34], llIIIIlllI[1]);
                        int[] nArray3 = new int[llIIIIlllI[1]];
                        nArray3[av.llIIIIlllI[0]] = llIIIIlllI[28];
                        if (av.lIlIIlIIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIIIlllI[1]];
                            nArray4[av.llIIIIlllI[0]] = llIIIIlllI[28];
                            if (av.lIlIIlIIlllIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIIIIlllI[1]];
                                nArray5[av.llIIIIlllI[0]] = llIIIIlllI[28];
                                if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIIIIlllI[35], llIIIIlllI[1]);
                                }
                            }
                        }
                        a.a(llIIIIlllI[17], llIIIIlllI[1]);
                        e.l(llIIIIlllI[28]);
                        e.l(llIIIIlllI[29]);
                        e.l(llIIIIlllI[30]);
                        e.l(llIIIIlllI[31]);
                        e.l(llIIIIlllI[32]);
                        Time.sleepTicks((int)llIIIIlllI[1]);
                        0;
                        e.l(llIIIIlllI[34]);
                        e.l(llIIIIlllI[36]);
                        e.l(llIIIIlllI[33]);
                        e.l(llIIIIlllI[35]);
                        e.l(llIIIIlllI[17]);
                        Time.sleepTicks((int)llIIIIlllI[9]);
                        0;
                        if (av.lIlIIlIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIIIlllI[20]);
                            0;
                        }
                        if (av.lIlIIlIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                                a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                a.a(llIIIIlllI[13], llIIIIlllI[11]);
                                a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                a.a(llIIIIlllI[14], llIIIIlllI[11]);
                                a.b(f.bk, llIIIIlllI[1]);
                                a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                a.a(llIIIIlllI[19], llIIIIlllI[18]);
                                a.a(llIIIIlllI[23], llIIIIlllI[38]);
                            }
                            if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                                a.a(llIIIIlllI[12], llIIIIlllI[11]);
                                a.a(llIIIIlllI[21], llIIIIlllI[11]);
                                a.a(llIIIIlllI[25], llIIIIlllI[11]);
                                a.b(f.bk, llIIIIlllI[1]);
                                a.a(llIIIIlllI[27], llIIIIlllI[1]);
                                a.a(llIIIIlllI[19], llIIIIlllI[24]);
                                a.a(llIIIIlllI[23], llIIIIlllI[11]);
                            }
                        }
                    }
                }
            }
            if (av.lIlIIlIIllIll(av.an() ? 1 : 0)) {
                String[] stringArray = new String[llIIIIlllI[1]];
                stringArray[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[18]];
                if (av.lIlIIlIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIIIlllI[1]];
                    stringArray2[av.llIIIIlllI[0]] = llIIIIIllI[llIIIIlllI[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llIIIIIllI[llIIIIlllI[22]]);
                }
                if (av.lIlIIlIIllIll(Inventory.contains((int[])f.ba) ? 1 : 0) && av.lIlIIlIIlllII(Movement.getRunEnergy(), llIIIIlllI[39])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIIIIllI[llIIIIlllI[24]]);
                    Time.sleepTicks((int)llIIIIlllI[1]);
                    0;
                }
                if (av.lIlIIlIIlllll(Combat.getMissingHealth(), llIIIIlllI[40])) {
                    int[] nArray = new int[llIIIIlllI[1]];
                    nArray[av.llIIIIlllI[0]] = llIIIIlllI[23];
                    if (av.lIlIIlIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIIIlllI[1]];
                        nArray6[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        Inventory.getFirst((int[])nArray6).interact(llIIIIIllI[llIIIIlllI[26]]);
                        Time.sleepTicks((int)llIIIIlllI[2]);
                        0;
                    }
                }
                if (av.lIlIIlIIlllll(Movement.getRunEnergy(), llIIIIlllI[41]) && av.lIlIIlIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42])) {
                    av.eB();
                }
                if ((!av.lIlIIlIlIIIIl(e.j(llIIIIlllI[43]), llIIIIlllI[44]) || av.lIlIIlIIlllII(e.j(llIIIIlllI[45]), llIIIIlllI[18])) && av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                    av.eC();
                }
                if (av.lIlIIlIlIIIIl(e.j(llIIIIlllI[43]), llIIIIlllI[44]) && av.lIlIIlIlIIIIl(e.j(llIIIIlllI[45]), llIIIIlllI[18])) {
                    if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[42]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37])) {
                        av.eC();
                    }
                    if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[37]) && av.lIlIIlIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                        av.eD();
                    }
                }
                if (av.lIlIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llIIIIlllI[44])) {
                    av.eE();
                }
            }
        }
    }

    private static void lIlIIlIIIllIl() {
        llIIIIIllI = new String[llIIIIlllI[241]];
        av.llIIIIIllI[av.llIIIIlllI[0]] = av."Buying items";
        av.llIIIIIllI[av.llIIIIlllI[1]] = av."Finished buying items, switching back to agility";
        av.llIIIIIllI[av.llIIIIlllI[2]] = av."Navigating to bank";
        av.llIIIIIllI[av.llIIIIlllI[9]] = av."Handling banking";
        av.llIIIIIllI[av.llIIIIlllI[16]] = av."We are missing quest supplies, switching to BUYING";
        av.llIIIIIllI[av.llIIIIlllI[18]] = av."Vial";
        av.llIIIIIllI[av.llIIIIlllI[20]] = av."Vial";
        av.llIIIIIllI[av.llIIIIlllI[22]] = av."Drop";
        av.llIIIIIllI[av.llIIIIlllI[24]] = av."Drink";
        av.llIIIIIllI[av.llIIIIlllI[26]] = av."Eat";
        av.llIIIIIllI[av.llIIIIlllI[11]] = av."Nav to gnome course";
        av.llIIIIIllI[av.llIIIIlllI[49]] = av."Crossing log";
        av.llIIIIIllI[av.llIIIIlllI[63]] = av."Log balance";
        av.llIIIIIllI[av.llIIIIlllI[64]] = av."Walk-across";
        av.llIIIIIllI[av.llIIIIlllI[53]] = av."Climbing net";
        av.llIIIIIllI[av.llIIIIlllI[38]] = av."Obstacle net";
        av.llIIIIIllI[av.llIIIIlllI[65]] = av."Climb-over";
        av.llIIIIIllI[av.llIIIIlllI[66]] = av."Climbing branch";
        av.llIIIIIllI[av.llIIIIlllI[54]] = av."Tree branch";
        av.llIIIIIllI[av.llIIIIlllI[67]] = av."Climb";
        av.llIIIIIllI[av.llIIIIlllI[40]] = av."Crossing rope";
        av.llIIIIIllI[av.llIIIIlllI[68]] = av."Balancing rope";
        av.llIIIIIllI[av.llIIIIlllI[61]] = av."Walk-on";
        av.llIIIIIllI[av.llIIIIlllI[69]] = av."Climbing down";
        av.llIIIIIllI[av.llIIIIlllI[70]] = av."Tree branch";
        av.llIIIIIllI[av.llIIIIlllI[41]] = av."Climb-down";
        av.llIIIIIllI[av.llIIIIlllI[71]] = av."Climbing net";
        av.llIIIIIllI[av.llIIIIlllI[72]] = av."Obstacle net";
        av.llIIIIIllI[av.llIIIIlllI[73]] = av."Climb-over";
        av.llIIIIIllI[av.llIIIIlllI[74]] = av."Crossing pipe";
        av.llIIIIIllI[av.llIIIIlllI[42]] = av."Squeeze-through";
        av.llIIIIIllI[av.llIIIIlllI[89]] = av."Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[96]] = av."Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[97]] = av."Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[98]] = av."Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[99]] = av."Take";
        av.llIIIIIllI[av.llIIIIlllI[100]] = av."Starting course";
        av.llIIIIIllI[av.llIIIIlllI[101]] = av."Rough wall";
        av.llIIIIIllI[av.llIIIIlllI[102]] = av."Climb";
        av.llIIIIIllI[av.llIIIIlllI[104]] = av."Crossing clothes line";
        av.llIIIIIllI[av.llIIIIlllI[37]] = av."Clothes line";
        av.llIIIIIllI[av.llIIIIlllI[105]] = av."Cross";
        av.llIIIIIllI[av.llIIIIlllI[106]] = av."Leaping";
        av.llIIIIIllI[av.llIIIIlllI[107]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[108]] = av."Leap";
        av.llIIIIIllI[av.llIIIIlllI[109]] = av."Balancing";
        av.llIIIIIllI[av.llIIIIlllI[110]] = av."Wall";
        av.llIIIIIllI[av.llIIIIlllI[111]] = av."Balance";
        av.llIIIIIllI[av.llIIIIlllI[112]] = av."Jumping gap";
        av.llIIIIIllI[av.llIIIIlllI[113]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[39]] = av."Leap";
        av.llIIIIIllI[av.llIIIIlllI[6]] = av."Jumping gap 2";
        av.llIIIIIllI[av.llIIIIlllI[115]] = av."Leap";
        av.llIIIIIllI[av.llIIIIlllI[116]] = av."Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[118]] = av."Leap";
        av.llIIIIIllI[av.llIIIIlllI[119]] = av."Hurdle roof";
        av.llIIIIIllI[av.llIIIIlllI[121]] = av."Hurdle";
        av.llIIIIIllI[av.llIIIIlllI[122]] = av."Finishing course";
        av.llIIIIIllI[av.llIIIIlllI[123]] = av."Edge";
        av.llIIIIIllI[av.llIIIIlllI[124]] = av."Jump-off";
        av.llIIIIIllI[av.llIIIIlllI[44]] = av."Nav to canafis course";
        av.llIIIIIllI[av.llIIIIlllI[140]] = av."Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[5]] = av."Starting course";
        av.llIIIIIllI[av.llIIIIlllI[141]] = av."Tall tree";
        av.llIIIIIllI[av.llIIIIlllI[142]] = av."Climb";
        av.llIIIIIllI[av.llIIIIlllI[143]] = av."Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[144]] = av."Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[145]] = av."Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[146]] = av."Take";
        av.llIIIIIllI[av.llIIIIlllI[147]] = av."Jumping gap 1";
        av.llIIIIIllI[av.llIIIIlllI[148]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[149]] = av."Jumping gap 2";
        av.llIIIIIllI[av.llIIIIlllI[150]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[151]] = av."Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[152]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[153]] = av."Jumping gap 4";
        av.llIIIIIllI[av.llIIIIlllI[154]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[155]] = av."Vaulting";
        av.llIIIIIllI[av.llIIIIlllI[156]] = av."Vault";
        av.llIIIIIllI[av.llIIIIlllI[157]] = av."Jumping gap 5";
        av.llIIIIIllI[av.llIIIIlllI[158]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[159]] = av."Jumping gap 6";
        av.llIIIIIllI[av.llIIIIlllI[160]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[171]] = av."Nav to canafis course";
        av.llIIIIIllI[av.llIIIIlllI[172]] = av."Nav to start";
        av.llIIIIIllI[av.llIIIIlllI[173]] = av."Starting course";
        av.llIIIIIllI[av.llIIIIlllI[174]] = av."Wall";
        av.llIIIIIllI[av.llIIIIlllI[175]] = av."Climb-up";
        av.llIIIIIllI[av.llIIIIlllI[35]] = av."Mark of grace";
        av.llIIIIIllI[av.llIIIIlllI[176]] = av."Taking mark";
        av.llIIIIIllI[av.llIIIIlllI[177]] = av."Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[178]] = av."Take";
        av.llIIIIIllI[av.llIIIIlllI[179]] = av."Jumping gap 1";
        av.llIIIIIllI[av.llIIIIlllI[180]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[78]] = av."cross rope";
        av.llIIIIIllI[av.llIIIIlllI[181]] = av."Cross";
        av.llIIIIIllI[av.llIIIIlllI[182]] = av."Jumping gap 3";
        av.llIIIIIllI[av.llIIIIlllI[183]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[184]] = av."Jumping gap 4";
        av.llIIIIIllI[av.llIIIIlllI[185]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[186]] = av."Jumping Edge";
        av.llIIIIIllI[av.llIIIIlllI[187]] = av."Jump";
        av.llIIIIIllI[av.llIIIIlllI[193]] = av."Found mark on ground";
        av.llIIIIIllI[av.llIIIIlllI[202]] = av."Agility";
        av.llIIIIIllI[av.llIIIIlllI[203]] = av."passage";
        av.llIIIIIllI[av.llIIIIlllI[204]] = av."passage";
        av.llIIIIIllI[av.llIIIIlllI[205]] = av."passage";
        av.llIIIIIllI[av.llIIIIlllI[206]] = av."passage";
        av.llIIIIIllI[av.llIIIIlllI[207]] = av."Edge";
        av.llIIIIIllI[av.llIIIIlllI[210]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[212]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[215]] = av."Tightrope";
        av.llIIIIIllI[av.llIIIIlllI[217]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[220]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[223]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[225]] = av."Pole-vault";
        av.llIIIIIllI[av.llIIIIlllI[226]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[229]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[231]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[232]] = av."Gap";
        av.llIIIIIllI[av.llIIIIlllI[234]] = av."pipe";
        av.llIIIIIllI[av.llIIIIlllI[237]] = av."Squeeze-through";
    }

    public static void Q() {
        d var12;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llIIIIlllI[1]];
                        nArray[av.llIIIIlllI[0]] = llIIIIlllI[15];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIIIIlllI[15], llIIIIlllI[1], llIIIIlllI[194]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIIIIlllI[1]];
                        nArray2[av.llIIIIlllI[0]] = llIIIIlllI[17];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[17], llIIIIlllI[2], llIIIIlllI[195]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray3 = new int[llIIIIlllI[1]];
                        nArray3[av.llIIIIlllI[0]] = llIIIIlllI[27];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[27], llIIIIlllI[2], llIIIIlllI[195]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray4 = new int[llIIIIlllI[1]];
                        nArray4[av.llIIIIlllI[0]] = llIIIIlllI[12];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[12], llIIIIlllI[11], llIIIIlllI[196]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray5 = new int[llIIIIlllI[1]];
                        nArray5[av.llIIIIlllI[0]] = llIIIIlllI[21];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[21], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray6 = new int[llIIIIlllI[1]];
                        nArray6[av.llIIIIlllI[0]] = llIIIIlllI[14];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[14], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray7 = new int[llIIIIlllI[1]];
                        nArray7[av.llIIIIlllI[0]] = llIIIIlllI[13];
                        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var12 = new d(llIIIIlllI[13], llIIIIlllI[11], llIIIIlllI[197]);
                            bv.add(var12);
                            0;
                        }
                        int[] nArray8 = new int[llIIIIlllI[1]];
                        nArray8[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llIIIIlllI[1]];
                        nArray9[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llIIIIlllI[1]];
                        nArray10[av.llIIIIlllI[0]] = llIIIIlllI[23];
                        if (!av.lIlIIlIIlllII(Bank.getFirst((int[])nArray10).getQuantity(), llIIIIlllI[11])) break block16;
                    }
                    var12 = new d(mU, llIIIIlllI[44], llIIIIlllI[198]);
                    bv.add(var12);
                    0;
                }
                int[] nArray = new int[llIIIIlllI[1]];
                nArray[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llIIIIlllI[1]];
                nArray11[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llIIIIlllI[1]];
                nArray12[av.llIIIIlllI[0]] = llIIIIlllI[25];
                if (!av.lIlIIlIIlllII(Bank.getFirst((int[])nArray12).getQuantity(), llIIIIlllI[11])) break block18;
            }
            var12 = new d(llIIIIlllI[25], llIIIIlllI[11], llIIIIlllI[199]);
            bv.add(var12);
            0;
        }
        int[] nArray = new int[llIIIIlllI[1]];
        nArray[av.llIIIIlllI[0]] = llIIIIlllI[200];
        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var12 = new d(llIIIIlllI[200], llIIIIlllI[1], llIIIIlllI[201]);
            bv.add(var12);
            0;
        }
        int[] nArray13 = new int[llIIIIlllI[1]];
        nArray13[av.llIIIIlllI[0]] = llIIIIlllI[19];
        if (av.lIlIIlIIlllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var12 = new d(llIIIIlllI[19], llIIIIlllI[40], j.cf);
            bv.add(var12);
            0;
        }
    }
}

