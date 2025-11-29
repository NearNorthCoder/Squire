package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.al  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/al.class */
public class al implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] llIlIlIlI;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ int lZ;
    static /* synthetic */ WorldArea mb;
    static /* synthetic */ WorldArea md;
    private static /* synthetic */ WorldPoint me;
    public static /* synthetic */ int ma;
    static /* synthetic */ WorldArea mc;
    private static /* synthetic */ String[] llIlIlIIl;
    public static /* synthetic */ int lY;

    private static boolean lIllIlIIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIlIIIllI(int i) {
        return i != 0;
    }

    private static void dW() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[2]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[125], llIlIlIlI[126], llIlIlIlI[112], llIlIlIlI[107], llIlIlIlI[9]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[127], llIlIlIlI[128], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[129], llIlIlIlI[127], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[2]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[130], llIlIlIlI[131], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[2]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[132], llIlIlIlI[133], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[134], llIlIlIlI[8], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[135], llIlIlIlI[136], llIlIlIlI[68], llIlIlIlI[53], llIlIlIlI[9]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[137], llIlIlIlI[138], llIlIlIlI[63], llIlIlIlI[64], llIlIlIlI[2]);
        WorldPoint worldPoint = new WorldPoint(llIlIlIlI[137], llIlIlIlI[139], llIlIlIlI[0]);
        if (lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIllIlIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[44]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIlIlIlI[1]);
            "".length();
        }
        if (lIllIlIIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[140]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIlIlIlI[1]);
                "".length();
            }
            if (lIllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[5]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIlIlIlI[1]];
                strArr[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[141]];
                TileObjects.getNearest(strArr).interact(llIlIlIIl[llIlIlIlI[142]]);
                Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return ((36 ^ 60) & ((23 ^ 15) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                }, llIlIlIlI[103]);
                "".length();
                Time.sleepTicks(llIlIlIlI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIlIlIlI[1]];
        strArr2[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[143]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIllIlIIlIIl(nearest) && lIllIlIIIllI(dY() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[144]];
            System.out.println(llIlIlIIl[llIlIlIlI[145]]);
            nearest.interact(llIlIlIIl[llIlIlIlI[146]]);
            Time.sleepTicks(llIlIlIlI[9]);
            "".length();
        }
        if (lIllIlIIlIII(dY() ? 1 : 0)) {
            if (lIllIlIIIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[232]]) ? 1 : 0) && lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[233], llIlIlIlI[131], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return ((31 ^ 50) & ((75 ^ 102) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[147]];
                    nearest2.interact(llIlIlIIl[llIlIlIlI[148]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIllIlIIIllI(tileObject2.getName().contains(llIlIlIIl[llIlIlIlI[231]]) ? 1 : 0) && lIllIlIIllll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[131], llIlIlIlI[224], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return ((157 ^ 165) ^ (175 ^ 147)) < 0 ? ((((31 + 53) - 32) + 97) ^ (((63 + 7) - 37) + 166)) & (((191 ^ 171) ^ (60 ^ 122)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest3)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[149]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIlIlIIl[llIlIlIlI[150]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (((((15 + 81) - (-33)) + 99) ^ (((56 + 44) - 46) + 112)) & (((102 ^ 97) ^ (58 ^ 127)) ^ (-" ".length()))) != 0 ? ((75 ^ 79) ^ (41 ^ 29)) & (((((143 + 30) - 141) + 124) ^ (((33 + 85) - 67) + 121)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIllIlIIIllI(tileObject3.getName().contains(llIlIlIIl[llIlIlIlI[229]]) ? 1 : 0) && lIllIlIIllll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[139], llIlIlIlI[230], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return "   ".length() <= 0 ? ((((126 + 65) - 86) + 22) ^ (80 ^ 28)) & (((191 ^ 181) ^ (23 ^ 46)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest4)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[151]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIlIlIIl[llIlIlIlI[152]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return 0 != 0 ? ((((92 + 63) - 109) + 147) ^ (((68 + 114) - 176) + 139)) & (((161 ^ 157) ^ (212 ^ 184)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIllIlIIIllI(tileObject4.getName().contains(llIlIlIIl[llIlIlIlI[226]]) ? 1 : 0) && lIllIlIIllll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[227], llIlIlIlI[228], llIlIlIlI[9])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest5)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[153]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIlIlIIl[llIlIlIlI[154]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (((((109 + 204) - 211) + 133) ^ (((51 + 79) - 26) + 81)) & (((((103 + 13) - 72) + 197) ^ (((131 + 6) - 122) + 148)) ^ (-" ".length()))) > "  ".length() ? ((177 ^ 157) ^ (114 ^ 124)) & (((99 ^ 46) ^ (200 ^ 167)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIllIlIIIllI(tileObject5.getName().contains(llIlIlIIl[llIlIlIlI[225]]) ? 1 : 0) && lIllIlIIllll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[8], llIlIlIlI[130], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest6)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[155]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIlIlIIl[llIlIlIlI[156]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "  ".length() == 0 ? ((((110 + 129) - 207) + 148) ^ (((140 + 130) - 250) + 131)) & (((23 ^ 31) ^ (104 ^ 67)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIllIlIIIllI(tileObject6.getName().contains(llIlIlIIl[llIlIlIlI[223]]) ? 1 : 0) && lIllIlIIllll(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[224], llIlIlIlI[214], llIlIlIlI[9])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return ((252 ^ 184) & ((92 ^ 24) ^ (-1))) > 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest7)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[157]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llIlIlIIl[llIlIlIlI[158]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (-((((31 + 145) - 167) + 161) ^ (((19 + 31) - (-75)) + 49))) >= 0 ? ((((70 + 101) - 88) + 105) ^ (((38 + 72) - 40) + 66)) & (((149 ^ 130) ^ (122 ^ 89)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (!lIllIlIIIllI(dY() ? 1 : 0) && lIllIlIIIllI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIllIlIIIllI(tileObject7.getName().contains(llIlIlIIl[llIlIlIlI[220]]) ? 1 : 0) && lIllIlIIllll(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[221], llIlIlIlI[222], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest8)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[159]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llIlIlIIl[llIlIlIlI[160]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (-"   ".length()) > 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static void dX() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[2]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[161], llIlIlIlI[162], llIlIlIlI[111], llIlIlIlI[111], llIlIlIlI[9]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[163], llIlIlIlI[133], llIlIlIlI[64], llIlIlIlI[11], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[164], llIlIlIlI[139], llIlIlIlI[38], llIlIlIlI[53], llIlIlIlI[2]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[165], llIlIlIlI[134], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[166], llIlIlIlI[136], llIlIlIlI[70], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[167], llIlIlIlI[168], llIlIlIlI[54], llIlIlIlI[63], llIlIlIlI[2]);
        WorldPoint worldPoint = new WorldPoint(llIlIlIlI[169], llIlIlIlI[170], llIlIlIlI[0]);
        if (lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIllIlIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[171]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIlIlIlI[1]);
            "".length();
        }
        if (lIllIlIIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[172]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIlIlIlI[1]);
                "".length();
            }
            if (lIllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlIlI[20])) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[173]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llIlIlIlI[1]];
                strArr[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[174]];
                TileObjects.getNearest(strArr).interact(llIlIlIIl[llIlIlIlI[175]]);
                Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (-" ".length()) > "   ".length() ? ((((172 + 153) - 169) + 19) ^ (((39 + 70) - 34) + 93)) & (((((170 + 141) - 205) + 85) ^ (((50 + 177) - 57) + 14)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIlI[0];
                }, llIlIlIlI[103]);
                "".length();
                Time.sleepTicks(llIlIlIlI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llIlIlIlI[1]];
        strArr2[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[35]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIllIlIIlIIl(nearest) && lIllIlIIIllI(dY() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[176]];
            System.out.println(llIlIlIIl[llIlIlIlI[177]]);
            nearest.interact(llIlIlIIl[llIlIlIlI[178]]);
            Time.sleepTicks(llIlIlIlI[9]);
            "".length();
        }
        if (lIllIlIIlIII(dY() ? 1 : 0)) {
            if (lIllIlIIIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[217]]) ? 1 : 0) && lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[218], llIlIlIlI[219], llIlIlIlI[9])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[179]];
                    nearest2.interact(llIlIlIIl[llIlIlIlI[180]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "  ".length() == (((81 ^ 64) ^ (38 ^ 27)) & (((78 ^ 68) ^ (104 ^ 78)) ^ (-" ".length()))) ? ((105 ^ 66) ^ (3 ^ 6)) & (((((91 + 41) - 55) + 63) ^ (((143 + 18) - 36) + 37)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIllIlIIIllI(tileObject2.getName().contains(llIlIlIIl[llIlIlIlI[215]]) ? 1 : 0) && lIllIlIIllll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[216], llIlIlIlI[128], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (-" ".length()) > " ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest3)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[78]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llIlIlIIl[llIlIlIlI[181]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (((207 ^ 165) ^ (71 ^ 22)) & (((52 ^ 67) ^ (215 ^ 155)) ^ (-" ".length()))) != (((23 ^ 94) ^ (80 ^ 71)) & (((120 ^ 0) ^ (36 ^ 2)) ^ (-" ".length()))) ? ((17 ^ 44) ^ (15 ^ 105)) & (((((181 + 102) - 98) + 59) ^ (((135 + 96) - 131) + 75)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIllIlIIIllI(tileObject3.getName().contains(llIlIlIIl[llIlIlIlI[212]]) ? 1 : 0) && lIllIlIIllll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[213], llIlIlIlI[214], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return " ".length() <= (((((46 + 123) - 106) + 77) ^ (((10 + 75) - (-4)) + 46)) & (((233 ^ 186) ^ (25 ^ 65)) ^ (-" ".length()))) ? ((164 ^ 137) ^ (172 ^ 159)) & (((103 ^ 75) ^ (54 ^ 4)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest4)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[182]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llIlIlIIl[llIlIlIlI[183]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (lIllIlIIIllI(dY() ? 1 : 0)) {
                return;
            }
            if (lIllIlIIIllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIllIlIIIllI(tileObject4.getName().contains(llIlIlIIl[llIlIlIlI[210]]) ? 1 : 0) && lIllIlIIllll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[208], llIlIlIlI[211], llIlIlIlI[9])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest5)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[184]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llIlIlIIl[llIlIlIlI[185]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
            if (!lIllIlIIIllI(dY() ? 1 : 0) && lIllIlIIIllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIllIlIIIllI(tileObject5.getName().contains(llIlIlIIl[llIlIlIlI[207]]) ? 1 : 0) && lIllIlIIllll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[208], llIlIlIlI[209], llIlIlIlI[2])), llIlIlIlI[2])) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (-" ".length()) > 0 ? ((((119 + 162) - 71) + 23) ^ (((85 + 33) - 43) + 123)) & (((54 ^ 71) ^ (27 ^ 69)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest6)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[186]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llIlIlIIl[llIlIlIlI[187]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[1], llIlIlIlI[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return 0 != 0 ? ((143 ^ 132) ^ (77 ^ 88)) & (((7 ^ 39) ^ (57 ^ 7)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v212, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v256, types: [boolean] */
    public static void dT() {
        if (lIllIlIIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[0]];
            C0001b.a(bx);
            if (lIllIlIIIlll(bx.size(), llIlIlIlI[1])) {
                System.out.println(llIlIlIIl[llIlIlIlI[1]]);
                bv = llIlIlIlI[0];
            }
        }
        if (lIllIlIIlIII(bv ? 1 : 0)) {
            if (lIllIlIIlIII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIlIIlIIl(nearest) && lIllIlIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[2]];
                    if (lIllIlIIIllI(new WorldArea(llIlIlIlI[3], llIlIlIlI[4], llIlIlIlI[5], llIlIlIlI[6], llIlIlIlI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIlIlIlI[7], llIlIlIlI[8], llIlIlIlI[0]);
                        if (lIllIlIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlIlI[9])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIlIlIlI[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIllIlIIlIIl(nearest) && lIllIlIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[9]];
                    if (lIllIlIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlIlI[10]);
                        "".length();
                    }
                    if (lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIlIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlIlI[1]);
                            "".length();
                        }
                        if (lIllIlIIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlIlI[2]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llIlIlIlI[11]];
                    iArr[llIlIlIlI[0]] = llIlIlIlI[12];
                    iArr[llIlIlIlI[1]] = llIlIlIlI[13];
                    iArr[llIlIlIlI[2]] = llIlIlIlI[14];
                    iArr[llIlIlIlI[9]] = llIlIlIlI[15];
                    iArr[llIlIlIlI[16]] = llIlIlIlI[17];
                    iArr[llIlIlIlI[18]] = llIlIlIlI[19];
                    iArr[llIlIlIlI[20]] = llIlIlIlI[21];
                    iArr[llIlIlIlI[22]] = llIlIlIlI[23];
                    iArr[llIlIlIlI[24]] = llIlIlIlI[25];
                    iArr[llIlIlIlI[26]] = llIlIlIlI[27];
                    if (lIllIlIIlIII(C0004e.d(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(llIlIlIIl[llIlIlIlI[16]]);
                        bv = llIlIlIlI[1];
                        return;
                    }
                    int[] iArr2 = new int[llIlIlIlI[11]];
                    iArr2[llIlIlIlI[0]] = llIlIlIlI[12];
                    iArr2[llIlIlIlI[1]] = llIlIlIlI[13];
                    iArr2[llIlIlIlI[2]] = llIlIlIlI[14];
                    iArr2[llIlIlIlI[9]] = llIlIlIlI[15];
                    iArr2[llIlIlIlI[16]] = llIlIlIlI[17];
                    iArr2[llIlIlIlI[18]] = llIlIlIlI[19];
                    iArr2[llIlIlIlI[20]] = llIlIlIlI[21];
                    iArr2[llIlIlIlI[22]] = llIlIlIlI[23];
                    iArr2[llIlIlIlI[24]] = llIlIlIlI[25];
                    iArr2[llIlIlIlI[26]] = llIlIlIlI[27];
                    if (lIllIlIIIllI(C0004e.d(iArr2) ? 1 : 0)) {
                        C0000a.a(llIlIlIlI[28], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[29], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[30], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[31], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[32], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[33], llIlIlIlI[1]);
                        C0000a.a(llIlIlIlI[34], llIlIlIlI[1]);
                        int[] iArr3 = new int[llIlIlIlI[1]];
                        iArr3[llIlIlIlI[0]] = llIlIlIlI[28];
                        if (lIllIlIIlIII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIlIlIlI[1]];
                            iArr4[llIlIlIlI[0]] = llIlIlIlI[28];
                            if (lIllIlIIlIII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIlIlIlI[1]];
                                iArr5[llIlIlIlI[0]] = llIlIlIlI[28];
                                if (lIllIlIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llIlIlIlI[35], llIlIlIlI[1]);
                                }
                            }
                        }
                        C0000a.a(llIlIlIlI[17], llIlIlIlI[1]);
                        C0004e.l(llIlIlIlI[28]);
                        C0004e.l(llIlIlIlI[29]);
                        C0004e.l(llIlIlIlI[30]);
                        C0004e.l(llIlIlIlI[31]);
                        C0004e.l(llIlIlIlI[32]);
                        Time.sleepTicks(llIlIlIlI[1]);
                        "".length();
                        C0004e.l(llIlIlIlI[34]);
                        C0004e.l(llIlIlIlI[36]);
                        C0004e.l(llIlIlIlI[33]);
                        C0004e.l(llIlIlIlI[35]);
                        C0004e.l(llIlIlIlI[17]);
                        Time.sleepTicks(llIlIlIlI[9]);
                        "".length();
                        if (lIllIlIIlIII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIlIlIlI[20]);
                            "".length();
                        }
                        if (lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                            if (lIllIlIIIlll(Skills.getLevel(Skill.AGILITY), llIlIlIlI[37])) {
                                C0000a.a(llIlIlIlI[12], llIlIlIlI[11]);
                                C0000a.a(llIlIlIlI[13], llIlIlIlI[11]);
                                C0000a.a(llIlIlIlI[21], llIlIlIlI[11]);
                                C0000a.a(llIlIlIlI[14], llIlIlIlI[11]);
                                C0000a.b(C0005f.bm, llIlIlIlI[1]);
                                C0000a.a(llIlIlIlI[27], llIlIlIlI[1]);
                                C0000a.a(llIlIlIlI[19], llIlIlIlI[18]);
                                C0000a.a(llIlIlIlI[23], llIlIlIlI[38]);
                            }
                            if (lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[37])) {
                                C0000a.a(llIlIlIlI[12], llIlIlIlI[11]);
                                C0000a.a(llIlIlIlI[21], llIlIlIlI[11]);
                                C0000a.a(llIlIlIlI[25], llIlIlIlI[11]);
                                C0000a.b(C0005f.bm, llIlIlIlI[1]);
                                C0000a.a(llIlIlIlI[27], llIlIlIlI[1]);
                                C0000a.a(llIlIlIlI[19], llIlIlIlI[24]);
                                C0000a.a(llIlIlIlI[23], llIlIlIlI[11]);
                            }
                        }
                    }
                }
            }
            if (lIllIlIIIllI(an() ? 1 : 0)) {
                String[] strArr = new String[llIlIlIlI[1]];
                strArr[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[18]];
                if (lIllIlIIIllI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIlIlI[1]];
                    strArr2[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[20]];
                    Inventory.getFirst(strArr2).interact(llIlIlIIl[llIlIlIlI[22]]);
                }
                if (lIllIlIIIllI(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllIlIIIlll(Movement.getRunEnergy(), llIlIlIlI[39])) {
                    Inventory.getFirst(C0005f.bc).interact(llIlIlIIl[llIlIlIlI[24]]);
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIlIlI(Combat.getMissingHealth(), llIlIlIlI[40])) {
                    int[] iArr6 = new int[llIlIlIlI[1]];
                    iArr6[llIlIlIlI[0]] = llIlIlIlI[23];
                    if (lIllIlIIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIlIlIlI[1]];
                        iArr7[llIlIlIlI[0]] = llIlIlIlI[23];
                        Inventory.getFirst(iArr7).interact(llIlIlIIl[llIlIlIlI[26]]);
                        Time.sleepTicks(llIlIlIlI[2]);
                        "".length();
                    }
                }
                if (lIllIlIIlIlI(Movement.getRunEnergy(), llIlIlIlI[41]) && lIllIlIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIllIlIIIlll(Skills.getLevel(Skill.AGILITY), llIlIlIlI[42])) {
                    dU();
                }
                if ((!lIllIlIIllII(C0004e.j(llIlIlIlI[43]), llIlIlIlI[44]) || lIllIlIIIlll(C0004e.j(llIlIlIlI[45]), llIlIlIlI[18])) && lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[42]) && lIllIlIIIlll(Skills.getLevel(Skill.AGILITY), llIlIlIlI[44])) {
                    dV();
                }
                if (lIllIlIIllII(C0004e.j(llIlIlIlI[43]), llIlIlIlI[44]) && lIllIlIIllII(C0004e.j(llIlIlIlI[45]), llIlIlIlI[18])) {
                    if (lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[42]) && lIllIlIIIlll(Skills.getLevel(Skill.AGILITY), llIlIlIlI[37])) {
                        dV();
                    }
                    if (lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[37]) && lIllIlIIIlll(Skills.getLevel(Skill.AGILITY), llIlIlIlI[44])) {
                        dW();
                    }
                }
                if (lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[44])) {
                    dX();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIlIlIlI[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dT();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (221 ^ 135) & ((114 ^ 40) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlIlIlI[186];
    }

    private static boolean lIllIlIIllll(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIlIIIIll(String lIIIllllIlIlIl, String lIIIllllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIllllIlIlll = Cipher.getInstance("Blowfish");
            lIIIllllIlIlll.init(llIlIlIlI[2], secretKeySpec);
            return new String(lIIIllllIlIlll.doFinal(Base64.getDecoder().decode(lIIIllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllllIlIllI) {
            lIIIllllIlIllI.printStackTrace();
            return null;
        }
    }

    private static void dU() {
        new WorldArea(llIlIlIlI[46], llIlIlIlI[47], llIlIlIlI[11], llIlIlIlI[20], llIlIlIlI[0]);
        WorldArea worldArea = new WorldArea(llIlIlIlI[46], llIlIlIlI[48], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[46], llIlIlIlI[50], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[51], llIlIlIlI[52], llIlIlIlI[53], llIlIlIlI[54], llIlIlIlI[2]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[55], llIlIlIlI[56], llIlIlIlI[24], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[57], llIlIlIlI[58], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[0]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[59], llIlIlIlI[60], llIlIlIlI[11], llIlIlIlI[20], llIlIlIlI[0]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[46], llIlIlIlI[47], llIlIlIlI[61], llIlIlIlI[20], llIlIlIlI[0]);
        if (lIllIlIIlIII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[11]];
            C0004e.b(me);
            Time.sleepTicks(llIlIlIlI[1]);
            "".length();
        }
        if (!(lIllIlIIlIII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIllIlIIIllI(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIlIIllIl(Players.getLocal().getAnimation(), llIlIlIlI[62]) && lIllIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIllIlIIIllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[49]];
                String[] strArr = new String[llIlIlIlI[1]];
                strArr[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[63]];
                TileObjects.getNearest(strArr).interact(llIlIlIIl[llIlIlIlI[64]]);
                Time.sleepTicks(llIlIlIlI[2]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[53]];
                String[] strArr2 = new String[llIlIlIlI[1]];
                strArr2[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[38]];
                TileObjects.getNearest(strArr2).interact(llIlIlIIl[llIlIlIlI[65]]);
                Time.sleepTicks(llIlIlIlI[2]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[66]];
                String[] strArr3 = new String[llIlIlIlI[1]];
                strArr3[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[54]];
                TileObjects.getNearest(strArr3).interact(llIlIlIIl[llIlIlIlI[67]]);
                Time.sleepTicks(llIlIlIlI[2]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[40]];
                String[] strArr4 = new String[llIlIlIlI[1]];
                strArr4[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[68]];
                TileObjects.getNearest(strArr4).interact(llIlIlIIl[llIlIlIlI[61]]);
                Time.sleepTicks(llIlIlIlI[18]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[69]];
                String[] strArr5 = new String[llIlIlIlI[1]];
                strArr5[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[70]];
                TileObjects.getNearest(strArr5).interact(llIlIlIIl[llIlIlIlI[41]]);
                Time.sleepTicks(llIlIlIlI[16]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[71]];
                String[] strArr6 = new String[llIlIlIlI[1]];
                strArr6[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[72]];
                TileObjects.getNearest(strArr6).interact(llIlIlIIl[llIlIlIlI[73]]);
                Time.sleepTicks(llIlIlIlI[9]);
                "".length();
            }
            if (lIllIlIIIllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[74]];
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIllIlIIIllI(tileObject.getName().contains(llIlIlIIl[llIlIlIlI[234]]) ? 1 : 0) && lIllIlIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlI[235], llIlIlIlI[236], llIlIlIlI[0])), llIlIlIlI[2])) {
                        String[] strArr7 = new String[llIlIlIlI[1]];
                        strArr7[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[237]];
                        if (lIllIlIIIllI(tileObject.hasAction(strArr7) ? 1 : 0)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return 0 != 0 ? ((((59 + 21) - 22) + 140) ^ (((96 + 115) - 115) + 34)) & (((((222 + 104) - 107) + 28) ^ (((169 + 19) - 167) + 158)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlIlIlI[0];
                });
                if (lIllIlIIlIIl(nearest)) {
                    nearest.interact(llIlIlIIl[llIlIlIlI[42]]);
                    Time.sleepTicks(C0004e.c(llIlIlIlI[9], llIlIlIlI[16]));
                    "".length();
                }
                if (lIllIlIIlllI(nearest)) {
                    C0004e.D();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllIlIIllII(Skills.getLevel(Skill.AGILITY), llIlIlIlI[185])) {
            ?? r0 = llIlIlIlI[1];
            "".length();
            return "  ".length() < 0 ? ((28 ^ 116) ^ (135 ^ 188)) & (((186 ^ 192) ^ (6 ^ 47)) ^ (-" ".length())) : r0;
        }
        return llIlIlIlI[0];
    }

    private static boolean lIllIlIIlIII(int i) {
        return i == 0;
    }

    private static void dV() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[1]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[2]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[75], llIlIlIlI[76], llIlIlIlI[77], llIlIlIlI[78], llIlIlIlI[9]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[79], llIlIlIlI[80], llIlIlIlI[69], llIlIlIlI[64], llIlIlIlI[0]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[81], llIlIlIlI[80], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[82], llIlIlIlI[83], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[9]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[84], llIlIlIlI[85], llIlIlIlI[26], llIlIlIlI[22], llIlIlIlI[1]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[84], llIlIlIlI[86], llIlIlIlI[11], llIlIlIlI[24], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[87], llIlIlIlI[88], llIlIlIlI[89], llIlIlIlI[40], llIlIlIlI[9]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[90], llIlIlIlI[91], llIlIlIlI[66], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[92], llIlIlIlI[93], llIlIlIlI[22], llIlIlIlI[26], llIlIlIlI[9]);
        WorldArea worldArea12 = new WorldArea(llIlIlIlI[92], llIlIlIlI[94], llIlIlIlI[11], llIlIlIlI[22], llIlIlIlI[9]);
        if (lIllIlIIlIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[89]];
            if (lIllIlIIIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIllIlIIIllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llIlIlIlI[95], llIlIlIlI[52], llIlIlIlI[0]));
            "".length();
            Time.sleepTicks(llIlIlIlI[1]);
            "".length();
        }
        if (lIllIlIIllIl(Players.getLocal().getAnimation(), llIlIlIlI[62]) && lIllIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llIlIlIlI[1]];
            strArr[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[96]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIllIlIIlIIl(nearest) && lIllIlIIIllI(dY() ? 1 : 0)) {
                AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[97]];
                System.out.println(llIlIlIIl[llIlIlIlI[98]]);
                nearest.interact(llIlIlIIl[llIlIlIlI[99]]);
                Time.sleepTicks(llIlIlIlI[9]);
                "".length();
            }
            if (lIllIlIIlIII(dY() ? 1 : 0)) {
                if (lIllIlIIIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[100]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llIlIlIlI[1]];
                    strArr2[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[101]];
                    TileObjects.getNearest(strArr2).interact(llIlIlIIl[llIlIlIlI[102]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "   ".length() >= (162 ^ 166) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[104]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llIlIlIlI[1]];
                    strArr3[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[37]];
                    TileObjects.getNearest(strArr3).interact(llIlIlIIl[llIlIlIlI[105]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "   ".length() == 0 ? ((29 ^ 7) ^ (201 ^ 132)) & (((((116 + 31) - (-30)) + 59) ^ (((90 + 17) - (-42)) + 38)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[106]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llIlIlIlI[1]];
                    strArr4[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[107]];
                    TileObjects.getNearest(strArr4).interact(llIlIlIIl[llIlIlIlI[108]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[109]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llIlIlIlI[1]];
                    strArr5[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[110]];
                    TileObjects.getNearest(strArr5).interact(llIlIlIIl[llIlIlIlI[111]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[112]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llIlIlIlI[1]];
                    strArr6[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[113]];
                    TileObjects.getNearest(strArr6).interact(llIlIlIIl[llIlIlIlI[39]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return 0 != 0 ? ((1 ^ 56) ^ (73 ^ 121)) & (((((20 + 48) - (-56)) + 12) ^ (((60 + 68) - 65) + 66)) ^ (-" ".length())) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[6]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llIlIlIlI[1]];
                    iArr[llIlIlIlI[0]] = llIlIlIlI[114];
                    TileObjects.getNearest(iArr).interact(llIlIlIIl[llIlIlIlI[115]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "  ".length() > (125 ^ 121) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[116]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llIlIlIlI[1]];
                    iArr2[llIlIlIlI[0]] = llIlIlIlI[117];
                    TileObjects.getNearest(iArr2).interact(llIlIlIIl[llIlIlIlI[118]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return (-(168 ^ 172)) >= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[119]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llIlIlIlI[1]];
                    iArr3[llIlIlIlI[0]] = llIlIlIlI[120];
                    TileObjects.getNearest(iArr3).interact(llIlIlIIl[llIlIlIlI[121]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
                if (lIllIlIIIllI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIlIII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIlIIl[llIlIlIlI[122]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llIlIlIlI[1]];
                    strArr7[llIlIlIlI[0]] = llIlIlIIl[llIlIlIlI[123]];
                    TileObjects.getNearest(strArr7).interact(llIlIlIIl[llIlIlIlI[124]]);
                    Time.sleepUntil(() -> {
                        if (lIllIlIIlIlI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = llIlIlIlI[1];
                            "".length();
                            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIlIlI[0];
                    }, llIlIlIlI[103]);
                    "".length();
                    Time.sleepTicks(llIlIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static void lIllIlIIIlII() {
        llIlIlIIl = new String[llIlIlIlI[241]];
        llIlIlIIl[llIlIlIlI[0]] = lIllIlIIIIIl("YeFusHGC8z3TSKaWMcWQzw==", "gaPtB");
        llIlIlIIl[llIlIlIlI[1]] = lIllIlIIIIIl("CE9DFiiIsYsUlHLyJvEMbv7UtIP8XplXTVtGP4PCmOmSDzkPkyXWp0YqiCOxoX2+5hjdNDNT4ts=", "JJlbh");
        llIlIlIIl[llIlIlIlI[2]] = lIllIlIIIIIl("vizecXOjRkBvyHMEPOljqSCn9lsLj/uF", "eCdqK");
        llIlIlIIl[llIlIlIlI[9]] = lIllIlIIIIIl("SrcuER3FmKiXMdXbFHI9iGGKdzkpt/os", "vpCnp");
        llIlIlIIl[llIlIlIlI[16]] = lIllIlIIIIlI("DwRiLic9QS8mJisILCh1KRQnPCF4Ejc/JTQIJzx5eBI1JiE7CSshMngVLW8XDTgLARI=", "XaBOU");
        llIlIlIIl[llIlIlIlI[18]] = lIllIlIIIIIl("66n1kWTDyAs=", "rvMVM");
        llIlIlIIl[llIlIlIlI[20]] = lIllIlIIIIll("s7HcjSIMVRc=", "uZPFe");
        llIlIlIIl[llIlIlIlI[22]] = lIllIlIIIIlI("CgQHPg==", "NvhNl");
        llIlIlIIl[llIlIlIlI[24]] = lIllIlIIIIll("DOIbs4ToW5Y=", "qUNMb");
        llIlIlIIl[llIlIlIlI[26]] = lIllIlIIIIll("r5jX4l3836c=", "vmmSa");
        llIlIlIIl[llIlIlIlI[11]] = lIllIlIIIIIl("tZRUEVLKq7ndyXGlixdFVYUZF26QLHWJ", "BCuhI");
        llIlIlIIl[llIlIlIlI[49]] = lIllIlIIIIll("L+8WyicRgMlK/Ag3LVP8aQ==", "peWBG");
        llIlIlIIl[llIlIlIlI[63]] = lIllIlIIIIlI("CSAzQjYkIzUMNyA=", "EOTbT");
        llIlIlIIl[llIlIlIlI[64]] = lIllIlIIIIIl("FgmjiGvPER4R8mGn/46WVQ==", "fQUnK");
        llIlIlIIl[llIlIlIlI[53]] = lIllIlIIIIll("KGtLIoB97BI2zJPpMrhs+A==", "pWVHI");
        llIlIlIIl[llIlIlIlI[38]] = lIllIlIIIIIl("BtVv+CcTcY38JeV5MWDI0A==", "pkTfE");
        llIlIlIIl[llIlIlIlI[65]] = lIllIlIIIIIl("28V/sSsZ4mawDBqWxeDqxw==", "TScYI");
        llIlIlIIl[llIlIlIlI[66]] = lIllIlIIIIll("Mm3ESiC8vS/2oVkRA4Srlw==", "FhgKO");
        llIlIlIIl[llIlIlIlI[54]] = lIllIlIIIIll("SzipqW+8DL8uSqz0lb5O4Q==", "OkIIZ");
        llIlIlIIl[llIlIlIlI[67]] = lIllIlIIIIIl("LjISkD23jpk=", "sRWBt");
        llIlIlIIl[llIlIlIlI[40]] = lIllIlIIIIll("+yqI+T9n934RHII46bH3vA==", "NEMzK");
        llIlIlIIl[llIlIlIlI[68]] = lIllIlIIIIll("OHqENRg+CECQOSuYGIshyA==", "VnFJU");
        llIlIlIIl[llIlIlIlI[61]] = lIllIlIIIIIl("TlA9vkpshYo=", "lPzVP");
        llIlIlIIl[llIlIlIlI[69]] = lIllIlIIIIlI("OyQdFykRJhNaLxc/Gg==", "xHtzK");
        llIlIlIIl[llIlIlIlI[70]] = lIllIlIIIIll("XIKmG2LBueHQXEB1BNMheA==", "mjoUC");
        llIlIlIIl[llIlIlIlI[41]] = lIllIlIIIIll("qn4jn53L5UQwGEVlwzH48w==", "NjyNn");
        llIlIlIIl[llIlIlIlI[71]] = lIllIlIIIIlI("Dj0iIgwkPyxvACgl", "MQKOn");
        llIlIlIIl[llIlIlIlI[72]] = lIllIlIIIIll("7OpbfmAmEYKYa36u3JlTdA==", "KWKqC");
        llIlIlIIl[llIlIlIlI[73]] = lIllIlIIIIIl("nbSarlVBGeJuKg1awGzOUw==", "wOjPU");
        llIlIlIIl[llIlIlIlI[74]] = lIllIlIIIIll("kcPElDK6rc6cwA997odGbg==", "NEDar");
        llIlIlIIl[llIlIlIlI[42]] = lIllIlIIIIIl("k1cyziOrhEl+A6IkDUeIuA==", "POnpR");
        llIlIlIIl[llIlIlIlI[89]] = lIllIlIIIIll("9n11t1Vp7X75A1z+WKenVg==", "hRSDX");
        llIlIlIIl[llIlIlIlI[96]] = lIllIlIIIIll("/tTHGzLe3ZU/xWnSEtih9A==", "Lvbyk");
        llIlIlIIl[llIlIlIlI[97]] = lIllIlIIIIIl("EsKulpJE/zpuq/IaMVRzkA==", "VRRNO");
        llIlIlIIl[llIlIlIlI[98]] = lIllIlIIIIIl("+CcKFBz7uTl7psSLfqL3MJ63EMj3+hEP", "BFLXm");
        llIlIlIIl[llIlIlIlI[99]] = lIllIlIIIIll("S+YwEeM4QRI=", "aUSKG");
        llIlIlIIl[llIlIlIlI[100]] = lIllIlIIIIlI("OwcNNBwBHQtmCwcGHjUN", "hslFh");
        llIlIlIIl[llIlIlIlI[101]] = lIllIlIIIIlI("EyIGCx5hOhIAGg==", "AMslv");
        llIlIlIIl[llIlIlIlI[102]] = lIllIlIIIIlI("CTkDNCg=", "JUjYJ");
        llIlIlIIl[llIlIlIlI[104]] = lIllIlIIIIlI("MiAbIzgYPBNwKB09ADguAnIYOSUU", "qRtPK");
        llIlIlIIl[llIlIlIlI[37]] = lIllIlIIIIll("6szME6cnsxGjjRPdoBIUaw==", "LeRkW");
        llIlIlIIl[llIlIlIlI[105]] = lIllIlIIIIll("vsvfm2w/+pI=", "MRLEG");
        llIlIlIIl[llIlIlIlI[106]] = lIllIlIIIIll("+qvIDJzC25U=", "ZJNXs");
        llIlIlIIl[llIlIlIlI[107]] = lIllIlIIIIll("Q3Lv9rZ64XA=", "UXttQ");
        llIlIlIIl[llIlIlIlI[108]] = lIllIlIIIIlI("LQsAGA==", "anahk");
        llIlIlIIl[llIlIlIlI[109]] = lIllIlIIIIlI("Cww5ETgqBDsX", "ImUpV");
        llIlIlIIl[llIlIlIlI[110]] = lIllIlIIIIll("sFQfaC0ML/Y=", "IvnAE");
        llIlIlIIl[llIlIlIlI[111]] = lIllIlIIIIIl("O2TxO//u8Bc=", "yHUFu");
        llIlIlIIl[llIlIlIlI[112]] = lIllIlIIIIlI("ODoBFw0cKEwABQI=", "rOlgd");
        llIlIlIIl[llIlIlIlI[113]] = lIllIlIIIIlI("EBIm", "WsVGL");
        llIlIlIIl[llIlIlIlI[39]] = lIllIlIIIIlI("PhUzCg==", "rpRzS");
        llIlIlIIl[llIlIlIlI[6]] = lIllIlIIIIll("DzmzntSMROOVJqJMbgsEVw==", "SDaCx");
        llIlIlIIl[llIlIlIlI[115]] = lIllIlIIIIlI("ByonMg==", "KOFBG");
        llIlIlIIl[llIlIlIlI[116]] = lIllIlIIIIIl("P2lq7+UtsUKHKqNRTyWnpw==", "KDQUp");
        llIlIlIIl[llIlIlIlI[118]] = lIllIlIIIIlI("Hgg1Bg==", "RmTva");
        llIlIlIIl[llIlIlIlI[119]] = lIllIlIIIIIl("6upRyEZUYlpamVqodWgrYg==", "HNWeF");
        llIlIlIIl[llIlIlIlI[121]] = lIllIlIIIIlI("CyMVDwQm", "CVgkh");
        llIlIlIIl[llIlIlIlI[122]] = lIllIlIIIIlI("Lw4UAisBDhQMeAoIDxkrDA==", "igzkX");
        llIlIlIIl[llIlIlIlI[123]] = lIllIlIIIIlI("DxAKJA==", "JtmAh");
        llIlIlIIl[llIlIlIlI[124]] = lIllIlIIIIll("Jd6t5+qmshH+rk1uBrUhpg==", "UwHXt");
        llIlIlIIl[llIlIlIlI[44]] = lIllIlIIIIlI("JQ4heicETzQ7PQoJPilzCAAiKCAO", "koWZS");
        llIlIlIIl[llIlIlIlI[140]] = lIllIlIIIIlI("ITgddxUAeRgjAB0t", "oYkWa");
        llIlIlIIl[llIlIlIlI[5]] = lIllIlIIIIll("Op4el+BAwZFJcqkx0ziq7A==", "KAzxD");
        llIlIlIIl[llIlIlIlI[141]] = lIllIlIIIIlI("AhQrOkMiByIz", "VuGVc");
        llIlIlIIl[llIlIlIlI[142]] = lIllIlIIIIll("DcFykfvrSiA=", "GNnWA");
        llIlIlIIl[llIlIlIlI[143]] = lIllIlIIIIIl("68dhHw7291KZ6chTZBr4yw==", "iNgtH");
        llIlIlIIl[llIlIlIlI[144]] = lIllIlIIIIlI("GzYNDS8odwsFMyQ=", "OWfdA");
        llIlIlIIl[llIlIlIlI[145]] = lIllIlIIIIIl("5Yfj7nLAjrxIqJyou6HiFCPF7JirNZo3", "hVxmI");
        llIlIlIIl[llIlIlIlI[146]] = lIllIlIIIIIl("6dRXQxnJcoo=", "vMDOB");
        llIlIlIIl[llIlIlIlI[147]] = lIllIlIIIIIl("/NzoBcHGVbQyapQiCoagpg==", "OQWsA");
        llIlIlIIl[llIlIlIlI[148]] = lIllIlIIIIll("Nqlzp3QyhB0=", "YRzyE");
        llIlIlIIl[llIlIlIlI[149]] = lIllIlIIIIll("qOB7xL/LHiAVYrDR+a4TlQ==", "DNRgR");
        llIlIlIIl[llIlIlIlI[150]] = lIllIlIIIIlI("PRgvOg==", "wmBJW");
        llIlIlIIl[llIlIlIlI[151]] = lIllIlIIIIll("Mfe9FWRSXhYwAucMeElLow==", "zyfMq");
        llIlIlIIl[llIlIlIlI[152]] = lIllIlIIIIll("cRQJqMFUlvo=", "ftshy");
        llIlIlIIl[llIlIlIlI[153]] = lIllIlIIIIIl("JyJG2qaQloMM5Nj4+MBhww==", "fLBnZ");
        llIlIlIIl[llIlIlIlI[154]] = lIllIlIIIIll("pSt6KkQqCxQ=", "wPFap");
        llIlIlIIl[llIlIlIlI[155]] = lIllIlIIIIll("925XwiekrIN+VeyJpX+v9w==", "okBMF");
        llIlIlIIl[llIlIlIlI[156]] = lIllIlIIIIIl("fKQ6QMODiWM=", "zjDwx");
        llIlIlIIl[llIlIlIlI[157]] = lIllIlIIIIIl("IbEcwgT7K1QjagLexW8JVQ==", "RMrQr");
        llIlIlIIl[llIlIlIlI[158]] = lIllIlIIIIIl("4jbQhT4Mrms=", "znIGF");
        llIlIlIIl[llIlIlIlI[159]] = lIllIlIIIIll("WyXhVwHjtpke3cUxEmfoCA==", "IqHTY");
        llIlIlIIl[llIlIlIlI[160]] = lIllIlIIIIlI("KTYrJg==", "cCFVm");
        llIlIlIIl[llIlIlIlI[171]] = lIllIlIIIIlI("Ow0SZBkaTAclAxQKDTdNFgMRNh4Q", "uldDm");
        llIlIlIIl[llIlIlIlI[172]] = lIllIlIIIIll("OLjc+yVINouWiGLhtP8kbw==", "FRKpE");
        llIlIlIIl[llIlIlIlI[173]] = lIllIlIIIIIl("8MflW9dd9jjt2PcoNPLokA==", "ScDZg");
        llIlIlIIl[llIlIlIlI[174]] = lIllIlIIIIlI("PQkIDw==", "jhdcO");
        llIlIlIIl[llIlIlIlI[175]] = lIllIlIIIIIl("MW0IcHY6T5UFPbIB2iqyEw==", "wvOUV");
        llIlIlIIl[llIlIlIlI[35]] = lIllIlIIIIlI("GhEQDHU4FkIAJzYTBw==", "WpbgU");
        llIlIlIIl[llIlIlIlI[176]] = lIllIlIIIIIl("Tr/w3VKgYL4jao9IZ5X+wQ==", "bUbDc");
        llIlIlIIl[llIlIlIlI[177]] = lIllIlIIIIlI("PiwWCzFYLgIXPlgsDUUyCiwWCzE=", "xCceU");
        llIlIlIIl[llIlIlIlI[178]] = lIllIlIIIIll("gGcbTA/XI7Y=", "lHHQy");
        llIlIlIIl[llIlIlIlI[179]] = lIllIlIIIIll("DmV5wmx8Hb0tg3xBW6cg2w==", "mEylP");
        llIlIlIIl[llIlIlIlI[180]] = lIllIlIIIIIl("YS+eC85Tty8=", "edehn");
        llIlIlIIl[llIlIlIlI[78]] = lIllIlIIIIlI("LxgNIBBsGA0jBg==", "LjbSc");
        llIlIlIIl[llIlIlIlI[181]] = lIllIlIIIIll("kW7gpzKZG5A=", "vjhqX");
        llIlIlIIl[llIlIlIlI[182]] = lIllIlIIIIll("FgsMjLuB2cnTTsBfsnp0+w==", "OZOXB");
        llIlIlIIl[llIlIlIlI[183]] = lIllIlIIIIIl("0T5Sa2gBh+s=", "AtqyG");
        llIlIlIIl[llIlIlIlI[184]] = lIllIlIIIIIl("EzM3Ju3zA8JPw44dQNu5kQ==", "DHlhv");
        llIlIlIIl[llIlIlIlI[185]] = lIllIlIIIIIl("y9ucDLGZuJE=", "rtgxp");
        llIlIlIIl[llIlIlIlI[186]] = lIllIlIIIIll("SFscWlQSbpN2t/W+xxTkpQ==", "nGYLF");
        llIlIlIIl[llIlIlIlI[187]] = lIllIlIIIIIl("GjN0l2/wJgE=", "Ffgcu");
        llIlIlIIl[llIlIlIlI[193]] = lIllIlIIIIlI("Mgw4JydUDiw7KFQMI2kkBgw4Jyc=", "tcMIC");
        llIlIlIIl[llIlIlIlI[202]] = lIllIlIIIIlI("Ih8MIz0XAQ==", "cxeOT");
        llIlIlIIl[llIlIlIlI[203]] = lIllIlIIIIll("fa8n8Q2UlJA=", "gxbEw");
        llIlIlIIl[llIlIlIlI[204]] = lIllIlIIIIIl("D8BYWQsc0oE=", "fHHbO");
        llIlIlIIl[llIlIlIlI[205]] = lIllIlIIIIll("DR3JjMpJT4c=", "eDRQO");
        llIlIlIIl[llIlIlIlI[206]] = lIllIlIIIIIl("/+khjDx/8nw=", "nrVAC");
        llIlIlIIl[llIlIlIlI[207]] = lIllIlIIIIlI("Bh4yLA==", "CzUIr");
        llIlIlIIl[llIlIlIlI[210]] = lIllIlIIIIll("oJHvgXj97tE=", "iduLN");
        llIlIlIIl[llIlIlIlI[212]] = lIllIlIIIIlI("LRUX", "jtgfq");
        llIlIlIIl[llIlIlIlI[215]] = lIllIlIIIIll("ISL1rdrAQ2QsngCoCrAhwg==", "wrHMh");
        llIlIlIIl[llIlIlIlI[217]] = lIllIlIIIIIl("0d8ZMvIaK2Y=", "kQcfE");
        llIlIlIIl[llIlIlIlI[220]] = lIllIlIIIIIl("VbImABpQ8KQ=", "FmxGm");
        llIlIlIIl[llIlIlIlI[223]] = lIllIlIIIIIl("tdZNBErPBvw=", "baCLx");
        llIlIlIIl[llIlIlIlI[225]] = lIllIlIIIIlI("OwgiPWEdBjs0OA==", "kgNXL");
        llIlIlIIl[llIlIlIlI[226]] = lIllIlIIIIlI("IAoo", "gkXNj");
        llIlIlIIl[llIlIlIlI[229]] = lIllIlIIIIlI("CQAx", "NaAYt");
        llIlIlIIl[llIlIlIlI[231]] = lIllIlIIIIll("RR5Gsuf0xzs=", "SIaGH");
        llIlIlIIl[llIlIlIlI[232]] = lIllIlIIIIIl("NjIjI/B/SMA=", "rjoba");
        llIlIlIIl[llIlIlIlI[234]] = lIllIlIIIIlI("ET8lNQ==", "aVUPn");
        llIlIlIIl[llIlIlIlI[237]] = lIllIlIIIIIl("u3T1EEdnbqKfziUs1fFiiw==", "DoMLj");
    }

    static {
        lIllIlIIIlIl();
        lIllIlIIIlII();
        bx = new ArrayList();
        lY = llIlIlIlI[27];
        lZ = llIlIlIlI[23];
        mb = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[0]);
        mc = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[1]);
        md = new WorldArea(llIlIlIlI[238], llIlIlIlI[52], llIlIlIlI[69], llIlIlIlI[72], llIlIlIlI[2]);
        me = new WorldPoint(llIlIlIlI[239], llIlIlIlI[240], llIlIlIlI[0]);
    }

    private static boolean lIllIlIIllIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIllIlIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.al.llIlIlIlI[11]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIllIlIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.al.llIlIlIlI[11]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llIlIlIlI[1]];
        iArr4[llIlIlIlI[0]] = llIlIlIlI[15];
        if (lIllIlIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[15], llIlIlIlI[1], llIlIlIlI[194]));
            "".length();
        }
        int[] iArr5 = new int[llIlIlIlI[1]];
        iArr5[llIlIlIlI[0]] = llIlIlIlI[17];
        if (lIllIlIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[17], llIlIlIlI[2], llIlIlIlI[195]));
            "".length();
        }
        int[] iArr6 = new int[llIlIlIlI[1]];
        iArr6[llIlIlIlI[0]] = llIlIlIlI[27];
        if (lIllIlIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[27], llIlIlIlI[2], llIlIlIlI[195]));
            "".length();
        }
        int[] iArr7 = new int[llIlIlIlI[1]];
        iArr7[llIlIlIlI[0]] = llIlIlIlI[12];
        if (lIllIlIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[12], llIlIlIlI[11], llIlIlIlI[196]));
            "".length();
        }
        int[] iArr8 = new int[llIlIlIlI[1]];
        iArr8[llIlIlIlI[0]] = llIlIlIlI[21];
        if (lIllIlIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[21], llIlIlIlI[11], llIlIlIlI[197]));
            "".length();
        }
        int[] iArr9 = new int[llIlIlIlI[1]];
        iArr9[llIlIlIlI[0]] = llIlIlIlI[14];
        if (lIllIlIIlIII(Bank.contains(iArr9) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[14], llIlIlIlI[11], llIlIlIlI[197]));
            "".length();
        }
        int[] iArr10 = new int[llIlIlIlI[1]];
        iArr10[llIlIlIlI[0]] = llIlIlIlI[13];
        if (lIllIlIIlIII(Bank.contains(iArr10) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIlI[13], llIlIlIlI[11], llIlIlIlI[197]));
            "".length();
        }
        int[] iArr11 = new int[llIlIlIlI[1]];
        iArr11[llIlIlIlI[0]] = llIlIlIlI[23];
        if (lIllIlIIIllI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llIlIlIlI[1]];
            iArr12[llIlIlIlI[0]] = llIlIlIlI[23];
            if (lIllIlIIIllI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIlIlIlI[1]];
                iArr13[llIlIlIlI[0]] = llIlIlIlI[23];
            }
            iArr = new int[llIlIlIlI[1]];
            iArr[llIlIlIlI[0]] = llIlIlIlI[25];
            if (lIllIlIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llIlIlIlI[1]];
                iArr14[llIlIlIlI[0]] = llIlIlIlI[25];
                if (lIllIlIIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIlIlIlI[1]];
                    iArr15[llIlIlIlI[0]] = llIlIlIlI[25];
                }
                iArr2 = new int[llIlIlIlI[1]];
                iArr2[llIlIlIlI[0]] = llIlIlIlI[200];
                if (lIllIlIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
                    bx.add(new C0003d(llIlIlIlI[200], llIlIlIlI[1], llIlIlIlI[201]));
                    "".length();
                }
                iArr3 = new int[llIlIlIlI[1]];
                iArr3[llIlIlIlI[0]] = llIlIlIlI[19];
                if (lIllIlIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(llIlIlIlI[19], llIlIlIlI[40], C0009j.ch));
                    "".length();
                    return;
                }
                return;
            }
            bx.add(new C0003d(llIlIlIlI[25], llIlIlIlI[11], llIlIlIlI[199]));
            "".length();
            iArr2 = new int[llIlIlIlI[1]];
            iArr2[llIlIlIlI[0]] = llIlIlIlI[200];
            if (lIllIlIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIlIlIlI[1]];
            iArr3[llIlIlIlI[0]] = llIlIlIlI[19];
            if (lIllIlIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lZ, llIlIlIlI[44], llIlIlIlI[198]));
        "".length();
        iArr = new int[llIlIlIlI[1]];
        iArr[llIlIlIlI[0]] = llIlIlIlI[25];
        if (lIllIlIIIllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIlIlI[25], llIlIlIlI[11], llIlIlIlI[199]));
        "".length();
        iArr2 = new int[llIlIlIlI[1]];
        iArr2[llIlIlIlI[0]] = llIlIlIlI[200];
        if (lIllIlIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIlIlIlI[1]];
        iArr3[llIlIlIlI[0]] = llIlIlIlI[19];
        if (lIllIlIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIlIlIIl[llIlIlIlI[202]];
    }

    private static boolean lIllIlIIlIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(llIlIlIlI[79], llIlIlIlI[80], llIlIlIlI[69], llIlIlIlI[64], llIlIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIlIlIlI[81], llIlIlIlI[80], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea3 = new WorldArea(llIlIlIlI[82], llIlIlIlI[83], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[9]);
        WorldArea worldArea4 = new WorldArea(llIlIlIlI[188], llIlIlIlI[189], llIlIlIlI[24], llIlIlIlI[18], llIlIlIlI[1]);
        WorldArea worldArea5 = new WorldArea(llIlIlIlI[84], llIlIlIlI[86], llIlIlIlI[11], llIlIlIlI[24], llIlIlIlI[9]);
        WorldArea worldArea6 = new WorldArea(llIlIlIlI[190], llIlIlIlI[191], llIlIlIlI[73], llIlIlIlI[38], llIlIlIlI[9]);
        WorldArea worldArea7 = new WorldArea(llIlIlIlI[90], llIlIlIlI[91], llIlIlIlI[66], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea8 = new WorldArea(llIlIlIlI[92], llIlIlIlI[93], llIlIlIlI[22], llIlIlIlI[26], llIlIlIlI[9]);
        WorldArea worldArea9 = new WorldArea(llIlIlIlI[92], llIlIlIlI[94], llIlIlIlI[11], llIlIlIlI[22], llIlIlIlI[9]);
        WorldArea worldArea10 = new WorldArea(llIlIlIlI[127], llIlIlIlI[128], llIlIlIlI[49], llIlIlIlI[11], llIlIlIlI[2]);
        WorldArea worldArea11 = new WorldArea(llIlIlIlI[129], llIlIlIlI[127], llIlIlIlI[49], llIlIlIlI[24], llIlIlIlI[2]);
        WorldArea worldArea12 = new WorldArea(llIlIlIlI[130], llIlIlIlI[131], llIlIlIlI[63], llIlIlIlI[49], llIlIlIlI[2]);
        WorldArea worldArea13 = new WorldArea(llIlIlIlI[132], llIlIlIlI[133], llIlIlIlI[11], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea14 = new WorldArea(llIlIlIlI[134], llIlIlIlI[8], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea15 = new WorldArea(llIlIlIlI[135], llIlIlIlI[136], llIlIlIlI[68], llIlIlIlI[53], llIlIlIlI[9]);
        WorldArea worldArea16 = new WorldArea(llIlIlIlI[137], llIlIlIlI[138], llIlIlIlI[63], llIlIlIlI[64], llIlIlIlI[2]);
        WorldArea worldArea17 = new WorldArea(llIlIlIlI[163], llIlIlIlI[133], llIlIlIlI[64], llIlIlIlI[11], llIlIlIlI[9]);
        WorldArea worldArea18 = new WorldArea(llIlIlIlI[164], llIlIlIlI[139], llIlIlIlI[38], llIlIlIlI[53], llIlIlIlI[2]);
        WorldArea worldArea19 = new WorldArea(llIlIlIlI[165], llIlIlIlI[134], llIlIlIlI[49], llIlIlIlI[26], llIlIlIlI[2]);
        WorldArea worldArea20 = new WorldArea(llIlIlIlI[166], llIlIlIlI[136], llIlIlIlI[70], llIlIlIlI[64], llIlIlIlI[9]);
        WorldArea worldArea21 = new WorldArea(llIlIlIlI[167], llIlIlIlI[168], llIlIlIlI[54], llIlIlIlI[63], llIlIlIlI[2]);
        WorldArea[] worldAreaArr = new WorldArea[llIlIlIlI[68]];
        worldAreaArr[llIlIlIlI[0]] = worldArea;
        worldAreaArr[llIlIlIlI[1]] = worldArea2;
        worldAreaArr[llIlIlIlI[2]] = worldArea3;
        worldAreaArr[llIlIlIlI[9]] = worldArea4;
        worldAreaArr[llIlIlIlI[16]] = worldArea5;
        worldAreaArr[llIlIlIlI[18]] = worldArea6;
        worldAreaArr[llIlIlIlI[20]] = worldArea7;
        worldAreaArr[llIlIlIlI[22]] = worldArea8;
        worldAreaArr[llIlIlIlI[24]] = worldArea9;
        worldAreaArr[llIlIlIlI[26]] = worldArea10;
        worldAreaArr[llIlIlIlI[11]] = worldArea11;
        worldAreaArr[llIlIlIlI[49]] = worldArea12;
        worldAreaArr[llIlIlIlI[63]] = worldArea13;
        worldAreaArr[llIlIlIlI[64]] = worldArea14;
        worldAreaArr[llIlIlIlI[53]] = worldArea15;
        worldAreaArr[llIlIlIlI[38]] = worldArea16;
        worldAreaArr[llIlIlIlI[65]] = worldArea17;
        worldAreaArr[llIlIlIlI[66]] = worldArea18;
        worldAreaArr[llIlIlIlI[54]] = worldArea19;
        worldAreaArr[llIlIlIlI[67]] = worldArea20;
        worldAreaArr[llIlIlIlI[40]] = worldArea21;
        int[] iArr = new int[llIlIlIlI[1]];
        iArr[llIlIlIlI[0]] = llIlIlIlI[192];
        if (lIllIlIIlIIl(TileItems.getNearest(iArr))) {
            System.out.println(llIlIlIIl[llIlIlIlI[193]]);
            int i = llIlIlIlI[0];
            while (lIllIlIIIlll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llIlIlIlI[1]];
                iArr2[llIlIlIlI[0]] = llIlIlIlI[192];
                if (lIllIlIIIllI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIllIlIIIllI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIlIlIlI[1];
                }
                i++;
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIlIlIlI[0];
    }

    private static boolean lIllIlIIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIIlIll(int i) {
        return i > 0;
    }

    private static String lIllIlIIIIIl(String lIIIlllllIIIlI, String lIIIlllllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlI[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllllIIIll) {
            lIIIlllllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIlllI(Object obj) {
        return obj == null;
    }

    private static String lIllIlIIIIlI(String lIIIllllllIlll, String lIIIllllllIllI) {
        String str = new String(Base64.getDecoder().decode(lIIIllllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIllllllIlII = lIIIllllllIllI.toCharArray();
        int lIIIllllllIIll = llIlIlIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIlIlI[0];
        while (lIllIlIIIlll(i, length)) {
            char lIIIlllllIlIlI = charArray[i];
            sb.append((char) (lIIIlllllIlIlI ^ lIIIllllllIlII[lIIIllllllIIll % lIIIllllllIlII.length]));
            "".length();
            lIIIllllllIIll++;
            i++;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (lIllIlIIllII(Skills.getBoostedLevel(Skill.AGILITY), llIlIlIlI[37])) {
            int[] iArr = new int[llIlIlIlI[1]];
            iArr[llIlIlIlI[0]] = llIlIlIlI[12];
            if (lIllIlIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlIlI[1]];
                iArr2[llIlIlIlI[0]] = llIlIlIlI[25];
                if (lIllIlIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlIlIlI[1]];
                    iArr3[llIlIlIlI[0]] = llIlIlIlI[23];
                    if (lIllIlIIIllI(Inventory.contains(iArr3) ? 1 : 0) && ((!lIllIlIIlIII(Inventory.contains(item -> {
                        return item.getName().contains(llIlIlIIl[llIlIlIlI[206]]);
                    }) ? 1 : 0) || lIllIlIIIllI(Equipment.contains(item2 -> {
                        return item2.getName().contains(llIlIlIIl[llIlIlIlI[205]]);
                    }) ? 1 : 0)) && (!lIllIlIIlIII(Inventory.contains(C0005f.bm) ? 1 : 0) || lIllIlIIIllI(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                        ?? r0 = llIlIlIlI[1];
                        "".length();
                        return (137 ^ 141) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return llIlIlIlI[0];
        }
        int[] iArr4 = new int[llIlIlIlI[1]];
        iArr4[llIlIlIlI[0]] = llIlIlIlI[12];
        if (lIllIlIIIllI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llIlIlIlI[1]];
            iArr5[llIlIlIlI[0]] = llIlIlIlI[14];
            if (lIllIlIIIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIlIlIlI[1]];
                iArr6[llIlIlIlI[0]] = llIlIlIlI[13];
                if (lIllIlIIIllI(Inventory.contains(iArr6) ? 1 : 0) && ((!lIllIlIIlIII(Inventory.contains(item3 -> {
                    return item3.getName().contains(llIlIlIIl[llIlIlIlI[204]]);
                }) ? 1 : 0) || lIllIlIIIllI(Equipment.contains(item4 -> {
                    return item4.getName().contains(llIlIlIIl[llIlIlIlI[203]]);
                }) ? 1 : 0)) && (!lIllIlIIlIII(Inventory.contains(C0005f.bm) ? 1 : 0) || lIllIlIIIllI(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                    ?? r02 = llIlIlIlI[1];
                    "".length();
                    return "   ".length() <= 0 ? ((46 ^ 88) ^ (51 ^ 121)) & (((((116 + 15) - 19) + 24) ^ (((178 + 15) - 92) + 79)) ^ (-" ".length())) : r02;
                }
            }
        }
        return llIlIlIlI[0];
    }

    private static boolean lIllIlIIIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIIIlIl() {
        llIlIlIlI = new int[242];
        llIlIlIlI[0] = ((((139 + 120) - 198) + 96) ^ (((18 + 110) - (-49)) + 6)) & (((44 ^ 53) ^ (244 ^ 199)) ^ (-" ".length()));
        llIlIlIlI[1] = " ".length();
        llIlIlIlI[2] = "  ".length();
        llIlIlIlI[3] = (-((-27057) & 31737)) & (-16417) & 24559;
        llIlIlIlI[4] = (-12851) & 16311;
        llIlIlIlI[5] = 189 ^ 131;
        llIlIlIlI[6] = (146 ^ 190) ^ (179 ^ 172);
        llIlIlIlI[7] = (-((-19274) & 31567)) & (-577) & 16381;
        llIlIlIlI[8] = (-21058) & 24537;
        llIlIlIlI[9] = "   ".length();
        llIlIlIlI[10] = (-((-1688) & 20159)) & (-1041) & 24511;
        llIlIlIlI[11] = 170 ^ 160;
        llIlIlIlI[12] = (-((-6211) & 30963)) & (-1) & 32759;
        llIlIlIlI[13] = (-((-3539) & 28122)) & (-17) & 32607;
        llIlIlIlI[14] = (-(162 ^ 131)) & (-147) & 8187;
        llIlIlIlI[15] = (-147) & 3999;
        llIlIlIlI[16] = 73 ^ 77;
        llIlIlIlI[17] = (-(92 ^ 78)) & (-4385) & 16381;
        llIlIlIlI[18] = 135 ^ 130;
        llIlIlIlI[19] = (-3085) & 15709;
        llIlIlIlI[20] = 180 ^ 178;
        llIlIlIlI[21] = (-((-2737) & 27314)) & (-133) & 32719;
        llIlIlIlI[22] = 57 ^ 62;
        llIlIlIlI[23] = (-28689) & 29073;
        llIlIlIlI[24] = "  ".length() ^ (102 ^ 108);
        llIlIlIlI[25] = (-((-11433) & 16313)) & (-5) & 24503;
        llIlIlIlI[26] = (161 ^ 142) ^ (9 ^ 47);
        llIlIlIlI[27] = (-1382) & 22527;
        llIlIlIlI[28] = (-((-21014) & 21303)) & (-20481) & 32629;
        llIlIlIlI[29] = (-((-1633) & 22501)) & (-3) & 32726;
        llIlIlIlI[30] = (-16386) & 28239;
        llIlIlIlI[31] = (-132) & 11983;
        llIlIlIlI[32] = (-390) & 12247;
        llIlIlIlI[33] = (-20629) & 32478;
        llIlIlIlI[34] = (-((-9745) & 10035)) & (-4125) & 16382;
        llIlIlIlI[35] = 35 ^ 123;
        llIlIlIlI[36] = (-((-23569) & 31989)) & (-4097) & 32751;
        llIlIlIlI[37] = (138 ^ 177) ^ (93 ^ 78);
        llIlIlIlI[38] = (136 ^ 165) ^ (55 ^ 21);
        llIlIlIlI[39] = (121 ^ 24) ^ (118 ^ 37);
        llIlIlIlI[40] = 99 ^ 119;
        llIlIlIlI[41] = (191 ^ 139) ^ (169 ^ 132);
        llIlIlIlI[42] = 160 ^ 190;
        llIlIlIlI[43] = (-21506) & 21807;
        llIlIlIlI[44] = 154 ^ 166;
        llIlIlIlI[45] = (-9413) & 9719;
        llIlIlIlI[46] = (-5129) & 7597;
        llIlIlIlI[47] = (-16517) & 19951;
        llIlIlIlI[48] = (-16900) & 20323;
        llIlIlIlI[49] = (((29 + 58) - (-34)) + 29) ^ (((12 + 5) - 5) + 145);
        llIlIlIlI[50] = (-4771) & 8191;
        llIlIlIlI[51] = (-16991) & 19455;
        llIlIlIlI[52] = (-((-1319) & 21807)) & (-513) & 24415;
        llIlIlIlI[53] = 1 ^ 15;
        llIlIlIlI[54] = (224 ^ 167) ^ (236 ^ 185);
        llIlIlIlI[55] = (-25601) & 28083;
        llIlIlIlI[56] = (-((-1282) & 26403)) & (-4231) & 32767;
        llIlIlIlI[57] = (-25161) & 27642;
        llIlIlIlI[58] = (-20993) & 24409;
        llIlIlIlI[59] = (-17933) & 20413;
        llIlIlIlI[60] = (-((-19043) & 31335)) & (-16921) & 32639;
        llIlIlIlI[61] = 125 ^ 107;
        llIlIlIlI[62] = -" ".length();
        llIlIlIlI[63] = 70 ^ 74;
        llIlIlIlI[64] = (((147 + 157) - 251) + 107) ^ (((145 + 61) - 115) + 82);
        llIlIlIlI[65] = 66 ^ 82;
        llIlIlIlI[66] = (237 ^ 192) ^ (73 ^ 117);
        llIlIlIlI[67] = 89 ^ 74;
        llIlIlIlI[68] = (2 ^ 7) ^ (100 ^ 116);
        llIlIlIlI[69] = (((130 + 67) - 170) + 114) ^ (((20 + 6) - (-23)) + 105);
        llIlIlIlI[70] = (((51 + 54) - 47) + 96) ^ (((35 + 112) - 83) + 66);
        llIlIlIlI[71] = (67 ^ 20) ^ (224 ^ 173);
        llIlIlIlI[72] = (39 ^ 17) ^ (61 ^ 16);
        llIlIlIlI[73] = (175 ^ 139) ^ (151 ^ 175);
        llIlIlIlI[74] = (63 ^ 23) ^ (145 ^ 164);
        llIlIlIlI[75] = (-16801) & 19967;
        llIlIlIlI[76] = (-((-8522) & 13259)) & (-8193) & 16279;
        llIlIlIlI[77] = ((102 + 12) - (-8)) + 15;
        llIlIlIlI[78] = 55 ^ 105;
        llIlIlIlI[79] = (-((-4117) & 12885)) & (-4353) & 16339;
        llIlIlIlI[80] = (-28705) & 32113;
        llIlIlIlI[81] = (-4609) & 7820;
        llIlIlIlI[82] = (-16898) & 20095;
        llIlIlIlI[83] = (-((-1885) & 30718)) & (-521) & 32765;
        llIlIlIlI[84] = (-8962) & 12151;
        llIlIlIlI[85] = (-12843) & 16255;
        llIlIlIlI[86] = (-12949) & 16349;
        llIlIlIlI[87] = (-((-10271) & 30879)) & (-773) & 24559;
        llIlIlIlI[88] = (-21002) & 24383;
        llIlIlIlI[89] = (((116 + 22) - 45) + 64) ^ (((1 + 34) - 27) + 122);
        llIlIlIlI[90] = (-24623) & 27839;
        llIlIlIlI[91] = (-4133) & 7524;
        llIlIlIlI[92] = (-((-15850) & 32763)) & (-12609) & 32755;
        llIlIlIlI[93] = (-((-3075) & 31891)) & (-6) & 32223;
        llIlIlIlI[94] = (-12802) & 16211;
        llIlIlIlI[95] = (-((-22545) & 31606)) & (-4099) & 16383;
        llIlIlIlI[96] = (((122 + 80) - 48) + 21) ^ (((4 + 132) - 102) + 109);
        llIlIlIlI[97] = 75 ^ 106;
        llIlIlIlI[98] = (251 ^ 180) ^ (18 ^ 127);
        llIlIlIlI[99] = 50 ^ 17;
        llIlIlIlI[100] = 112 ^ 84;
        llIlIlIlI[101] = (((13 + 90) - 8) + 85) ^ (((133 + 61) - 178) + 129);
        llIlIlIlI[102] = (((151 + 5) - 47) + 78) ^ (((3 + 67) - 48) + 135);
        llIlIlIlI[103] = (-18956) & 27455;
        llIlIlIlI[104] = 26 ^ 61;
        llIlIlIlI[105] = 151 ^ 190;
        llIlIlIlI[106] = (135 ^ 195) ^ (79 ^ 33);
        llIlIlIlI[107] = (16 ^ 63) ^ (122 ^ 126);
        llIlIlIlI[108] = (242 ^ 187) ^ (215 ^ 178);
        llIlIlIlI[109] = 146 ^ 191;
        llIlIlIlI[110] = (191 ^ 155) ^ (74 ^ 64);
        llIlIlIlI[111] = (117 ^ 85) ^ (10 ^ 5);
        llIlIlIlI[112] = 244 ^ 196;
        llIlIlIlI[113] = (55 ^ 40) ^ (139 ^ 165);
        llIlIlIlI[114] = (-((-914) & 18331)) & (-1) & 32251;
        llIlIlIlI[115] = 64 ^ 116;
        llIlIlIlI[116] = (((83 + 233) - 312) + 236) ^ (((100 + 3) - 18) + 112);
        llIlIlIlI[117] = (-16393) & 31227;
        llIlIlIlI[118] = 110 ^ 88;
        llIlIlIlI[119] = (((98 + 31) - (-21)) + 9) ^ (((138 + 138) - 173) + 65);
        llIlIlIlI[120] = (-16386) & 31221;
        llIlIlIlI[121] = 187 ^ 131;
        llIlIlIlI[122] = 33 ^ 24;
        llIlIlIlI[123] = 175 ^ 149;
        llIlIlIlI[124] = (218 ^ 159) ^ (224 ^ 158);
        llIlIlIlI[125] = (-4625) & 8095;
        llIlIlIlI[126] = (-((-25761) & 30454)) & (-1) & 8159;
        llIlIlIlI[127] = (-4113) & 7614;
        llIlIlIlI[128] = (-((-2231) & 23295)) & (-8213) & 32766;
        llIlIlIlI[129] = (-((-24967) & 29663)) & (-1) & 8191;
        llIlIlIlI[130] = (-((-3073) & 32353)) & (-5) & 32767;
        llIlIlIlI[131] = (-4693) & 8189;
        llIlIlIlI[132] = (-((-406) & 9215)) & (-20483) & 32763;
        llIlIlIlI[133] = (-((-6533) & 31693)) & (-4117) & 32765;
        llIlIlIlI[134] = (-((-16785) & 29661)) & (-33) & 16383;
        llIlIlIlI[135] = (-35) & 3519;
        llIlIlIlI[136] = (-((-1137) & 22133)) & (-8241) & 32703;
        llIlIlIlI[137] = (-((-2162) & 23167)) & (-65) & 24575;
        llIlIlIlI[138] = (-((-17523) & 30335)) & (-1) & 16285;
        llIlIlIlI[139] = (-((-12057) & 32634)) & (-1) & 24063;
        llIlIlIlI[140] = 93 ^ 96;
        llIlIlIlI[141] = "  ".length() ^ (161 ^ 156);
        llIlIlIlI[142] = (168 ^ 150) ^ (122 ^ 4);
        llIlIlIlI[143] = (((1 + 148) - (-72)) + 3) ^ (((93 + 33) - 58) + 93);
        llIlIlIlI[144] = 112 ^ 50;
        llIlIlIlI[145] = (((148 + 61) - 39) + 65) ^ (((116 + 119) - 156) + 89);
        llIlIlIlI[146] = (114 ^ 121) ^ (40 ^ 103);
        llIlIlIlI[147] = 80 ^ 21;
        llIlIlIlI[148] = (242 ^ 162) ^ (208 ^ 198);
        llIlIlIlI[149] = 238 ^ 169;
        llIlIlIlI[150] = 12 ^ 68;
        llIlIlIlI[151] = 52 ^ 125;
        llIlIlIlI[152] = (((227 + 176) - 322) + 154) ^ (((94 + 125) - 97) + 39);
        llIlIlIlI[153] = (187 ^ 136) ^ (122 ^ 2);
        llIlIlIlI[154] = 233 ^ 165;
        llIlIlIlI[155] = 221 ^ 144;
        llIlIlIlI[156] = 141 ^ 195;
        llIlIlIlI[157] = 235 ^ 164;
        llIlIlIlI[158] = (((176 + 77) - 196) + 167) ^ (((102 + 43) - 21) + 52);
        llIlIlIlI[159] = 198 ^ 151;
        llIlIlIlI[160] = (((110 + 185) - 234) + 181) ^ (((141 + 114) - 150) + 55);
        llIlIlIlI[161] = (-13313) & 15999;
        llIlIlIlI[162] = (-8706) & 12159;
        llIlIlIlI[163] = (-((-6453) & 7477)) & (-257) & 3999;
        llIlIlIlI[164] = (-((-9901) & 30463)) & (-289) & 23551;
        llIlIlIlI[165] = (-((-721) & 22237)) & (-257) & 24479;
        llIlIlIlI[166] = (-4401) & 7097;
        llIlIlIlI[167] = (-25952) & 28639;
        llIlIlIlI[168] = (-((-2885) & 19295)) & (-4197) & 24063;
        llIlIlIlI[169] = (-21765) & 24493;
        llIlIlIlI[170] = (-((-9481) & 14171)) & (-2) & 8179;
        llIlIlIlI[171] = (79 ^ 24) ^ (31 ^ 27);
        llIlIlIlI[172] = (((105 + 6) - (-4)) + 109) ^ (((27 + 71) - 62) + 144);
        llIlIlIlI[173] = (93 ^ 2) ^ (107 ^ 97);
        llIlIlIlI[174] = (51 ^ 22) ^ (62 ^ 77);
        llIlIlIlI[175] = 80 ^ 7;
        llIlIlIlI[176] = 22 ^ 79;
        llIlIlIlI[177] = 224 ^ 186;
        llIlIlIlI[178] = 21 ^ 78;
        llIlIlIlI[179] = 205 ^ 145;
        llIlIlIlI[180] = 15 ^ 82;
        llIlIlIlI[181] = 227 ^ 188;
        llIlIlIlI[182] = (55 ^ 120) ^ (239 ^ 192);
        llIlIlIlI[183] = 161 ^ 192;
        llIlIlIlI[184] = 59 ^ 89;
        llIlIlIlI[185] = (((177 + 176) - 190) + 33) ^ (((79 + 80) - 106) + 114);
        llIlIlIlI[186] = 219 ^ 191;
        llIlIlIlI[187] = 237 ^ 136;
        llIlIlIlI[188] = (-28801) & 31991;
        llIlIlIlI[189] = (-((-2561) & 19113)) & (-8194) & 28159;
        llIlIlIlI[190] = (-((-1933) & 30622)) & (-897) & 32767;
        llIlIlIlI[191] = (-((-3489) & 23973)) & (-8705) & 32575;
        llIlIlIlI[192] = (-((-27281) & 31379)) & (-273) & 16219;
        llIlIlIlI[193] = 53 ^ 83;
        llIlIlIlI[194] = (-16388) & 21887;
        llIlIlIlI[195] = (-((-22406) & 24471)) & (-583) & 27647;
        llIlIlIlI[196] = (-27660) & 28559;
        llIlIlIlI[197] = (-24577) & 25526;
        llIlIlIlI[198] = (-16418) & 18367;
        llIlIlIlI[199] = (-((-17026) & 22403)) & (-18441) & 32767;
        llIlIlIlI[200] = (-4133) & 16110;
        llIlIlIlI[201] = (-((-10513) & 14610)) & (-2209) & 32255;
        llIlIlIlI[202] = 41 ^ 78;
        llIlIlIlI[203] = 249 ^ 145;
        llIlIlIlI[204] = 78 ^ 39;
        llIlIlIlI[205] = (59 ^ 87) ^ (191 ^ 185);
        llIlIlIlI[206] = 119 ^ 28;
        llIlIlIlI[207] = 39 ^ 75;
        llIlIlIlI[208] = (-5185) & 7887;
        llIlIlIlI[209] = (-((-1291) & 26459)) & (-4133) & 32765;
        llIlIlIlI[210] = 5 ^ 104;
        llIlIlIlI[211] = (-((-321) & 13137)) & (-16385) & 32669;
        llIlIlIlI[212] = 25 ^ 119;
        llIlIlIlI[213] = (-65) & 2775;
        llIlIlIlI[214] = (-((-14513) & 15099)) & (-4130) & 8191;
        llIlIlIlI[215] = (92 ^ 116) ^ (5 ^ 66);
        llIlIlIlI[216] = (-17514) & 20223;
        llIlIlIlI[217] = 55 ^ 71;
        llIlIlIlI[218] = (-9247) & 11967;
        llIlIlIlI[219] = (-((-1377) & 5499)) & (-8257) & 15871;
        llIlIlIlI[220] = 54 ^ 71;
        llIlIlIlI[221] = (-12354) & 15863;
        llIlIlIlI[222] = (-((-16407) & 28759)) & (-33) & 15868;
        llIlIlIlI[223] = 103 ^ 21;
        llIlIlIlI[224] = (-((-671) & 29407)) & (-513) & 32751;
        llIlIlIlI[225] = 217 ^ 170;
        llIlIlIlI[226] = "  ".length() ^ (50 ^ 68);
        llIlIlIlI[227] = (-((-16681) & 21354)) & (-16425) & 24575;
        llIlIlIlI[228] = (-25179) & 28670;
        llIlIlIlI[229] = (146 ^ 166) ^ (25 ^ 88);
        llIlIlIlI[230] = (-25169) & 28667;
        llIlIlIlI[231] = 115 ^ 5;
        llIlIlIlI[232] = 109 ^ 26;
        llIlIlIlI[233] = (-15) & 3519;
        llIlIlIlI[234] = 50 ^ 74;
        llIlIlIlI[235] = (-((-15533) & 16109)) & (-28673) & 31735;
        llIlIlIlI[236] = (-((-10115) & 26523)) & (-12929) & 32767;
        llIlIlIlI[237] = 126 ^ 7;
        llIlIlIlI[238] = (-((-2066) & 31315)) & (-1049) & 32765;
        llIlIlIlI[239] = (-21077) & 23550;
        llIlIlIlI[240] = (-(((98 + 121) - 92) + 4)) & (-28689) & 32255;
        llIlIlIlI[241] = 215 ^ 173;
    }
}
