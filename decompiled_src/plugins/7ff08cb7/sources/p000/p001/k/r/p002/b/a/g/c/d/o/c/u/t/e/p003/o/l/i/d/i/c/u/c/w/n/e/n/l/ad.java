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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ad  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ad.class */
public class ad implements ab {
    private static /* synthetic */ WorldPoint me;
    public static /* synthetic */ int lZ;
    private static /* synthetic */ String[] lllllllII;
    static /* synthetic */ WorldArea md;
    private static /* synthetic */ int[] lllllllIl;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ int lY;
    static /* synthetic */ WorldArea mb;
    public static /* synthetic */ int ma;
    static /* synthetic */ WorldArea mc;
    public static /* synthetic */ boolean bv;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean an() {
        if (llIllIIllIII(Skills.getBoostedLevel(Skill.AGILITY), lllllllIl[37])) {
            int[] iArr = new int[lllllllIl[1]];
            iArr[lllllllIl[0]] = lllllllIl[13];
            if (llIllIIlIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllllIl[1]];
                iArr2[lllllllIl[0]] = lllllllIl[25];
                if (llIllIIlIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllllllIl[1]];
                    iArr3[lllllllIl[0]] = lllllllIl[23];
                    if (llIllIIlIIlI(Inventory.contains(iArr3) ? 1 : 0) && ((!llIllIIlIlII(Inventory.contains(item -> {
                        return item.getName().contains(lllllllII[lllllllIl[207]]);
                    }) ? 1 : 0) || llIllIIlIIlI(Equipment.contains(item2 -> {
                        return item2.getName().contains(lllllllII[lllllllIl[206]]);
                    }) ? 1 : 0)) && (!llIllIIlIlII(Inventory.contains(C0005f.bm) ? 1 : 0) || llIllIIlIIlI(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return ((97 ^ 127) ^ (25 ^ 3)) <= 0 ? ((78 ^ 114) ^ (((75 + 118) - 151) + 85)) & (((238 ^ 136) ^ (33 ^ 4)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lllllllIl[0];
        }
        int[] iArr4 = new int[lllllllIl[1]];
        iArr4[lllllllIl[0]] = lllllllIl[13];
        if (llIllIIlIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lllllllIl[1]];
            iArr5[lllllllIl[0]] = lllllllIl[15];
            if (llIllIIlIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllllllIl[1]];
                iArr6[lllllllIl[0]] = lllllllIl[14];
                if (llIllIIlIIlI(Inventory.contains(iArr6) ? 1 : 0) && ((!llIllIIlIlII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lllllllII[lllllllIl[205]]);
                }) ? 1 : 0) || llIllIIlIIlI(Equipment.contains(item4 -> {
                    return item4.getName().contains(lllllllII[lllllllIl[204]]);
                }) ? 1 : 0)) && (!llIllIIlIlII(Inventory.contains(C0005f.bm) ? 1 : 0) || llIllIIlIIlI(Equipment.contains(C0005f.bm) ? 1 : 0)))) {
                    ?? r02 = lllllllIl[1];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return lllllllIl[0];
    }

    private static void dW() {
        WorldArea worldArea = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[1]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[3]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[125], lllllllIl[126], lllllllIl[112], lllllllIl[107], lllllllIl[10]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[127], lllllllIl[128], lllllllIl[49], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[129], lllllllIl[127], lllllllIl[49], lllllllIl[24], lllllllIl[3]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[130], lllllllIl[131], lllllllIl[63], lllllllIl[49], lllllllIl[3]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[132], lllllllIl[133], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[134], lllllllIl[9], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[135], lllllllIl[136], lllllllIl[68], lllllllIl[53], lllllllIl[10]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[137], lllllllIl[138], lllllllIl[63], lllllllIl[64], lllllllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lllllllIl[137], lllllllIl[139], lllllllIl[0]);
        if (llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIllIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllllllIl[1]);
            "".length();
        }
        if (llIllIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lllllllIl[1]);
                "".length();
            }
            if (llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lllllllIl[1]];
                strArr[lllllllIl[0]] = lllllllII[lllllllIl[142]];
                TileObjects.getNearest(strArr).interact(lllllllII[lllllllIl[143]]);
                Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                }, lllllllIl[104]);
                "".length();
                Time.sleepTicks(lllllllIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lllllllIl[1]];
        strArr2[lllllllIl[0]] = lllllllII[lllllllIl[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIllIIlIlIl(nearest) && llIllIIlIIlI(dY() ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[145]];
            System.out.println(lllllllII[lllllllIl[146]]);
            nearest.interact(lllllllII[lllllllIl[147]]);
            Time.sleepTicks(lllllllIl[10]);
            "".length();
        }
        if (llIllIIlIlII(dY() ? 1 : 0)) {
            if (llIllIIlIIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[233]]) ? 1 : 0) && llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[234], lllllllIl[131], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return (-(34 ^ 39)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = lllllllII[lllllllIl[148]];
                    nearest2.interact(lllllllII[lllllllIl[149]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return ((true ^ true) & ((true ^ true) ^ true)) == (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIllIIlIIlI(tileObject2.getName().contains(lllllllII[lllllllIl[232]]) ? 1 : 0) && llIllIIllIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[131], lllllllIl[225], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest3)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lllllllII[lllllllIl[151]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return ((65 ^ 117) ^ (186 ^ 138)) <= (((126 ^ 11) ^ (109 ^ 85)) & (((82 ^ 22) ^ (18 ^ 27)) ^ (-" ".length()))) ? ((254 ^ 178) ^ (58 ^ 34)) & (((((185 + 23) - 127) + 166) ^ (((103 + 1) - 89) + 148)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIllIIlIIlI(tileObject3.getName().contains(lllllllII[lllllllIl[230]]) ? 1 : 0) && llIllIIllIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[139], lllllllIl[231], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest4)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lllllllII[lllllllIl[153]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (92 ^ 88) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIllIIlIIlI(tileObject4.getName().contains(lllllllII[lllllllIl[227]]) ? 1 : 0) && llIllIIllIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[228], lllllllIl[229], lllllllIl[10])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return 0 != 0 ? ((((54 + 87) - 22) + 65) ^ (((13 + 69) - (-48)) + 9)) & (((2 ^ 14) ^ (6 ^ 57)) ^ (-" ".length())) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest5)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lllllllII[lllllllIl[155]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return ((106 ^ 17) ^ (((79 + 116) - 117) + 49)) == ((" ".length() ^ (125 ^ 51)) & (((((16 + 167) - 46) + 112) ^ (((32 + 42) - (-60)) + 48)) ^ (-" ".length()))) ? ((((138 + 72) - 71) + 8) ^ (((106 + 130) - 170) + 122)) & (((176 ^ 190) ^ (21 ^ 52)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIllIIlIIlI(tileObject5.getName().contains(lllllllII[lllllllIl[226]]) ? 1 : 0) && llIllIIllIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[9], lllllllIl[130], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest6)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lllllllII[lllllllIl[157]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((21 ^ 97) ^ (213 ^ 194)) & (((25 ^ 55) ^ (123 ^ 54)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (llIllIIlIIlI(tileObject6.getName().contains(lllllllII[lllllllIl[224]]) ? 1 : 0) && llIllIIllIlI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[225], lllllllIl[215], lllllllIl[10])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return ((((146 + 88) - 76) + 14) ^ (((17 + 152) - 108) + 107)) < (((139 ^ 170) ^ (86 ^ 55)) & (((117 ^ 17) ^ (147 ^ 183)) ^ (-" ".length()))) ? ((((152 + 124) - 185) + 63) ^ (((47 + 75) - 36) + 93)) & (((25 ^ 41) ^ (146 ^ 139)) ^ (-" ".length())) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest7)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lllllllII[lllllllIl[159]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (-(144 ^ 148)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (!llIllIIlIIlI(dY() ? 1 : 0) && llIllIIlIIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (llIllIIlIIlI(tileObject7.getName().contains(lllllllII[lllllllIl[221]]) ? 1 : 0) && llIllIIllIlI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[222], lllllllIl[223], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return " ".length() < 0 ? ((198 ^ 147) ^ (49 ^ 37)) & (((109 ^ 45) ^ " ".length()) ^ (-" ".length())) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest8)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lllllllII[lllllllIl[161]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return " ".length() > "   ".length() ? (true ^ true) & ((!true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
        }
    }

    private static void dU() {
        new WorldArea(lllllllIl[46], lllllllIl[47], lllllllIl[12], lllllllIl[20], lllllllIl[0]);
        WorldArea worldArea = new WorldArea(lllllllIl[46], lllllllIl[48], lllllllIl[49], lllllllIl[24], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[46], lllllllIl[50], lllllllIl[49], lllllllIl[24], lllllllIl[1]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[51], lllllllIl[52], lllllllIl[53], lllllllIl[54], lllllllIl[3]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[55], lllllllIl[56], lllllllIl[24], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[57], lllllllIl[58], lllllllIl[49], lllllllIl[12], lllllllIl[0]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[59], lllllllIl[60], lllllllIl[12], lllllllIl[20], lllllllIl[0]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[46], lllllllIl[47], lllllllIl[61], lllllllIl[20], lllllllIl[0]);
        if (llIllIIlIlII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[12]];
            C0004e.b(me);
            Time.sleepTicks(lllllllIl[1]);
            "".length();
        }
        if (!(llIllIIlIlII(mb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIllIIlIIlI(md.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIllIIllIIl(Players.getLocal().getAnimation(), lllllllIl[62]) && llIllIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (llIllIIlIIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[49]];
                String[] strArr = new String[lllllllIl[1]];
                strArr[lllllllIl[0]] = lllllllII[lllllllIl[63]];
                TileObjects.getNearest(strArr).interact(lllllllII[lllllllIl[64]]);
                Time.sleepTicks(lllllllIl[3]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[53]];
                String[] strArr2 = new String[lllllllIl[1]];
                strArr2[lllllllIl[0]] = lllllllII[lllllllIl[38]];
                TileObjects.getNearest(strArr2).interact(lllllllII[lllllllIl[65]]);
                Time.sleepTicks(lllllllIl[3]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[66]];
                String[] strArr3 = new String[lllllllIl[1]];
                strArr3[lllllllIl[0]] = lllllllII[lllllllIl[54]];
                TileObjects.getNearest(strArr3).interact(lllllllII[lllllllIl[67]]);
                Time.sleepTicks(lllllllIl[3]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[40]];
                String[] strArr4 = new String[lllllllIl[1]];
                strArr4[lllllllIl[0]] = lllllllII[lllllllIl[68]];
                TileObjects.getNearest(strArr4).interact(lllllllII[lllllllIl[61]]);
                Time.sleepTicks(lllllllIl[2]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[69]];
                String[] strArr5 = new String[lllllllIl[1]];
                strArr5[lllllllIl[0]] = lllllllII[lllllllIl[70]];
                TileObjects.getNearest(strArr5).interact(lllllllII[lllllllIl[41]]);
                Time.sleepTicks(lllllllIl[17]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[71]];
                String[] strArr6 = new String[lllllllIl[1]];
                strArr6[lllllllIl[0]] = lllllllII[lllllllIl[72]];
                TileObjects.getNearest(strArr6).interact(lllllllII[lllllllIl[73]]);
                Time.sleepTicks(lllllllIl[10]);
                "".length();
            }
            if (llIllIIlIIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[74]];
                String[] strArr7 = new String[lllllllIl[1]];
                strArr7[lllllllIl[0]] = lllllllII[lllllllIl[42]];
                TileObjects.getNearest(strArr7).interact(lllllllII[lllllllIl[75]]);
                Time.sleepTicks(lllllllIl[17]);
                "".length();
            }
        }
    }

    private static void llIllIIIlIll() {
        lllllllII = new String[lllllllIl[238]];
        lllllllII[lllllllIl[0]] = llIllIIIlIII("dtuJ20ODthYISDBEpXSdxg==", "IYIbR");
        lllllllII[lllllllIl[1]] = llIllIIIlIII("QOkB7sUOvWpfCyL7IsjubK65YQg+yWiVzQPKN3NBCNrfiwgwm67DAYI8KsKNMLx94KVNBCel3bk=", "UgLxY");
        lllllllII[lllllllIl[3]] = llIllIIIlIIl("LAg5JCEDHSYjIUIdIG0kAwck", "biOMF");
        lllllllII[lllllllIl[10]] = llIllIIIlIlI("Q0puCnMjZeuuZuCA3RrNY5bDy9/XCgkK", "HkVFQ");
        lllllllII[lllllllIl[17]] = llIllIIIlIlI("K25rTPFk3EZ5rSOG+f9icZQFSbI0WNv1lCh1bL8aSNiMdAHjVLAcVOh0yqRqLzDW1alec7PPXeg=", "ITFHk");
        lllllllII[lllllllIl[2]] = llIllIIIlIII("FRclIIWhtcg=", "oEqld");
        lllllllII[lllllllIl[20]] = llIllIIIlIlI("awM9OT6pNHM=", "hsjnb");
        lllllllII[lllllllIl[22]] = llIllIIIlIII("U5NnaXw9GFc=", "FiNoW");
        lllllllII[lllllllIl[24]] = llIllIIIlIlI("CpTrFfDdSRw=", "qYYvI");
        lllllllII[lllllllIl[26]] = llIllIIIlIIl("HTIV", "XSasm");
        lllllllII[lllllllIl[12]] = llIllIIIlIIl("LyI+Ui4OYy8cNQwmaBE1FDE7Fw==", "aCHrZ");
        lllllllII[lllllllIl[49]] = llIllIIIlIIl("EgseFgM4FxZFHD4e", "Qyqep");
        lllllllII[lllllllIl[63]] = llIllIIIlIIl("OSwIdQ0ULw47DBA=", "uCoUo");
        lllllllII[lllllllIl[64]] = llIllIIIlIIl("MSo0LW4HKCopMBU=", "fKXFC");
        lllllllII[lllllllIl[53]] = llIllIIIlIlI("x7OhMLgMRAF1RY1yBF33eA==", "baqnJ");
        lllllllII[lllllllIl[38]] = llIllIIIlIlI("1mxX4t8BeCrvGM8UX5oGCA==", "AdYvM");
        lllllllII[lllllllIl[65]] = llIllIIIlIlI("llRz2IULzRixZ7WLZIDNRA==", "vUQsL");
        lllllllII[lllllllIl[66]] = llIllIIIlIIl("KiUCCTcAJwxENxsoBQc9", "iIkdU");
        lllllllII[lllllllIl[54]] = llIllIIIlIlI("3taGnh17i6OHTLPGIOaViA==", "nVNjN");
        lllllllII[lllllllIl[67]] = llIllIIIlIII("TpWnZw5L380=", "cvmMq");
        lllllllII[lllllllIl[40]] = llIllIIIlIIl("MiILFRcYPgNGFh4gAQ==", "qPdfd");
        lllllllII[lllllllIl[68]] = llIllIIIlIlI("78yGtg5ZEMcWmHP6O8Ozyw==", "WGNtq");
        lllllllII[lllllllIl[61]] = llIllIIIlIII("hKsDk2PgG8U=", "hHvxe");
        lllllllII[lllllllIl[69]] = llIllIIIlIII("JFaLFSl6NO+tGasaCzTD1Q==", "CLwPj");
        lllllllII[lllllllIl[70]] = llIllIIIlIII("5Avhok+dA3jmWyeRbFSgXQ==", "NcJCQ");
        lllllllII[lllllllIl[41]] = llIllIIIlIIl("FzosNAx5MiouAA==", "TVEYn");
        lllllllII[lllllllIl[71]] = llIllIIIlIII("jYnofKKIaaIlh3v+JE2oZA==", "MhmWL");
        lllllllII[lllllllIl[72]] = llIllIIIlIIl("Jy4jJBELIDVwHg04", "hLPPp");
        lllllllII[lllllllIl[73]] = llIllIIIlIIl("Jzo8IClJOSMoOQ==", "dVUMK");
        lllllllII[lllllllIl[74]] = llIllIIIlIlI("nryGUmN+z9XyK7GiWpxK3Q==", "XCRfo");
        lllllllII[lllllllIl[42]] = llIllIIIlIIl("CRoWLRAlFAB5AS8IAA==", "FxeYq");
        lllllllII[lllllllIl[75]] = llIllIIIlIII("r79Yjv2Vmo0x6TN2dCBnfA==", "ehLDf");
        lllllllII[lllllllIl[95]] = llIllIIIlIlI("blPnjEDsfgFLINks9hGu3g==", "eywFI");
        lllllllII[lllllllIl[97]] = llIllIIIlIlI("cTQ2RyCY30A6nYIEU8go/w==", "ZNoXc");
        lllllllII[lllllllIl[98]] = llIllIIIlIII("fKDN1uO0564l1yEnDn+uWA==", "oMIzP");
        lllllllII[lllllllIl[99]] = llIllIIIlIlI("lMQVcjhuUknbmIFIob3rx/gRZOiOlkL7", "qsTxh");
        lllllllII[lllllllIl[100]] = llIllIIIlIII("eksT276Gw7U=", "zeYWd");
        lllllllII[lllllllIl[101]] = llIllIIIlIIl("KwU1Jj0RHzN0KhcEJics", "xqTTI");
        lllllllII[lllllllIl[102]] = llIllIIIlIIl("IiIFJi9QOhEtKw==", "pMpAG");
        lllllllII[lllllllIl[103]] = llIllIIIlIIl("LCI9BSM=", "oNThA");
        lllllllII[lllllllIl[37]] = llIllIIIlIIl("JCIaJgEOPhJ1EQs/AT0XFHAZPBwC", "gPuUr");
        lllllllII[lllllllIl[105]] = llIllIIIlIII("OEptgjQtzwDLKtctu5tgaA==", "Vekud");
        lllllllII[lllllllIl[106]] = llIllIIIlIlI("w2KFFGjxlz4=", "FdwfU");
        lllllllII[lllllllIl[107]] = llIllIIIlIII("cb5mZHf2JKs=", "Uuwpa");
        lllllllII[lllllllIl[108]] = llIllIIIlIIl("FCc7", "SFKwE");
        lllllllII[lllllllIl[109]] = llIllIIIlIlI("WLR64vCccJ4=", "ujncr");
        lllllllII[lllllllIl[110]] = llIllIIIlIIl("NRYGCAsUHgQO", "wwjie");
        lllllllII[lllllllIl[111]] = llIllIIIlIII("wXLotc8GVqw=", "alcXW");
        lllllllII[lllllllIl[112]] = llIllIIIlIIl("ITsiOCEAPw==", "cZNYO");
        lllllllII[lllllllIl[113]] = llIllIIIlIIl("HgIuNiU6EGMhLSQ=", "TwCFL");
        lllllllII[lllllllIl[39]] = llIllIIIlIlI("cHKv838xpDc=", "YLzsp");
        lllllllII[lllllllIl[7]] = llIllIIIlIII("iSktNfJJkoE=", "fysro");
        lllllllII[lllllllIl[114]] = llIllIIIlIIl("GTcqEzo9JWcEMiNidQ==", "SBGcS");
        lllllllII[lllllllIl[116]] = llIllIIIlIlI("UFOP99pQ86s=", "xGWGr");
        lllllllII[lllllllIl[117]] = llIllIIIlIlI("uOH6y+kUzyolHgGSoH89rg==", "YDXvF");
        lllllllII[lllllllIl[119]] = llIllIIIlIII("YvfJ7U8ZGL4=", "YNMRu");
        lllllllII[lllllllIl[120]] = llIllIIIlIlI("QneoKgBev9v+P1X80bNPag==", "VkQBO");
        lllllllII[lllllllIl[122]] = llIllIIIlIlI("fSZOiyBHBdg=", "IxOWv");
        lllllllII[lllllllIl[123]] = llIllIIIlIlI("sjF8PZryK+mtFOqWUTtX/gB6v+JSNgG/", "oMfOu");
        lllllllII[lllllllIl[124]] = llIllIIIlIIl("CxQ0PA==", "NpSYX");
        lllllllII[lllllllIl[44]] = llIllIIIlIlI("APH2CQ3/q5Yg6PufDDWKXw==", "sNdda");
        lllllllII[lllllllIl[140]] = llIllIIIlIlI("/EBKO6fPdUzz9Oas7c6FeaSJfi1SzCIq", "OAEBR");
        lllllllII[lllllllIl[6]] = llIllIIIlIlI("xIkG07o3xib6+z4M9nAmOw==", "OhnwR");
        lllllllII[lllllllIl[141]] = llIllIIIlIIl("FTUqBAMvLyxWFCk0OQUS", "FAKvw");
        lllllllII[lllllllIl[142]] = llIllIIIlIIl("OAU8IkcYFjUr", "ldPNg");
        lllllllII[lllllllIl[143]] = llIllIIIlIIl("Jz4bIRA=", "dRrLr");
        lllllllII[lllllllIl[144]] = llIllIIIlIlI("DKVpC+TS+BBLZdJfmORP0A==", "pKOLg");
        lllllllII[lllllllIl[145]] = llIllIIIlIIl("OBUECjgLVAICJAc=", "ltocV");
        lllllllII[lllllllIl[146]] = llIllIIIlIIl("PBkPAwFaGxsfDloZFE0CCBkPAwE=", "zvzme");
        lllllllII[lllllllIl[147]] = llIllIIIlIIl("OyUhDw==", "oDJjJ");
        lllllllII[lllllllIl[148]] = llIllIIIlIII("R1OO8yUUPaLw3s+xNJl9ow==", "CuHvL");
        lllllllII[lllllllIl[149]] = llIllIIIlIlI("Wx1uXZsJRgo=", "hHKZJ");
        lllllllII[lllllllIl[150]] = llIllIIIlIIl("IjsJGwcGKUQMDxhuVg==", "hNdkn");
        lllllllII[lllllllIl[151]] = llIllIIIlIIl("DxMcPg==", "EfqNw");
        lllllllII[lllllllIl[152]] = llIllIIIlIlI("GEyHe9oosyX8tbAjYJtWyA==", "vFRtM");
        lllllllII[lllllllIl[153]] = llIllIIIlIIl("PwMUIw==", "uvySa");
        lllllllII[lllllllIl[154]] = llIllIIIlIII("aIrdustgr8fr0kzhv4+KvA==", "ABuUb");
        lllllllII[lllllllIl[155]] = llIllIIIlIlI("LLjb41PPzf4=", "FaPNC");
        lllllllII[lllllllIl[156]] = llIllIIIlIIl("PQocPRYCBQ4=", "kkiQb");
        lllllllII[lllllllIl[157]] = llIllIIIlIIl("HQk/Lic=", "KhJBS");
        lllllllII[lllllllIl[158]] = llIllIIIlIIl("HSMIOgY5MUUtDid2UA==", "WVeJo");
        lllllllII[lllllllIl[159]] = llIllIIIlIIl("CwQJJw==", "AqdWn");
        lllllllII[lllllllIl[160]] = llIllIIIlIIl("CCMHBgMsMUoRCzJ2XA==", "BVjvj");
        lllllllII[lllllllIl[161]] = llIllIIIlIII("uwy6Acl1XFM=", "Ghzef");
        lllllllII[lllllllIl[172]] = llIllIIIlIIl("KCQSRhIJZQcHCAcjDRVGBSoRFBUD", "fEdff");
        lllllllII[lllllllIl[173]] = llIllIIIlIIl("PQUcZAAcRBkwFQEQ", "sdjDt");
        lllllllII[lllllllIl[174]] = llIllIIIlIII("Q5a3vnowoD9JtOpaKec89g==", "fyLcY");
        lllllllII[lllllllIl[175]] = llIllIIIlIlI("CEwB8PJ8vHo=", "Stbwu");
        lllllllII[lllllllIl[35]] = llIllIIIlIlI("IwMIqA3vcpqc4bDNdhN8ZA==", "yPGNw");
        lllllllII[lllllllIl[176]] = llIllIIIlIlI("c5aEIzAeR9qM13VZxDKW4A==", "KKzWk");
        lllllllII[lllllllIl[177]] = llIllIIIlIlI("+AN0C0xRcqk5Wz/SgHZnFg==", "gBPRp");
        lllllllII[lllllllIl[178]] = llIllIIIlIII("Z2CgGVoICYW1L9Jm2JugCxTYVodvRgSb", "XvNNX");
        lllllllII[lllllllIl[179]] = llIllIIIlIlI("nhgM0tlhu9k=", "cYYxl");
        lllllllII[lllllllIl[180]] = llIllIIIlIIl("DA89IxAoHXA0GDZaYQ==", "FzPSy");
        lllllllII[lllllllIl[79]] = llIllIIIlIIl("IwALIg==", "iufRT");
        lllllllII[lllllllIl[181]] = llIllIIIlIII("xeiSqQqHFloKwAvromf94Q==", "eDzST");
        lllllllII[lllllllIl[182]] = llIllIIIlIII("rePTJDEkkuA=", "ZiUiy");
        lllllllII[lllllllIl[183]] = llIllIIIlIlI("JO4BLhr5T1k1rD8BMMbiVQ==", "kPsLb");
        lllllllII[lllllllIl[184]] = llIllIIIlIIl("DxAMAg==", "EearE");
        lllllllII[lllllllIl[185]] = llIllIIIlIII("6hbEckQmV+BzpadtdzOEcw==", "dPpFs");
        lllllllII[lllllllIl[186]] = llIllIIIlIIl("Ez4KCA==", "YKgxa");
        lllllllII[lllllllIl[187]] = llIllIIIlIIl("EiACMgU2Mk8HCD8w", "XUoBl");
        lllllllII[lllllllIl[188]] = llIllIIIlIIl("MCAkJQ==", "zUIUi");
        lllllllII[lllllllIl[194]] = llIllIIIlIIl("BzUMDB1hNxgQEmE1F0IeMzUMDB0=", "AZyby");
        lllllllII[lllllllIl[203]] = llIllIIIlIII("9b6RomNTWdU=", "Ohdsc");
        lllllllII[lllllllIl[204]] = llIllIIIlIIl("JikrMDYxLQ==", "VHXCW");
        lllllllII[lllllllIl[205]] = llIllIIIlIlI("htOsCyQ0bj4=", "fJAOX");
        lllllllII[lllllllIl[206]] = llIllIIIlIlI("1nEPEO4zpHM=", "OTMrD");
        lllllllII[lllllllIl[207]] = llIllIIIlIIl("ISgpNgo2LA==", "QIZEk");
        lllllllII[lllllllIl[208]] = llIllIIIlIIl("BwAlLg==", "BdBKi");
        lllllllII[lllllllIl[211]] = llIllIIIlIIl("CRI2", "NsFVi");
        lllllllII[lllllllIl[213]] = llIllIIIlIlI("ksy36DFluPE=", "BiDaC");
        lllllllII[lllllllIl[216]] = llIllIIIlIII("axbcOImEw4EzwG3TNtJR1w==", "OdxWk");
        lllllllII[lllllllIl[218]] = llIllIIIlIII("oota7g/rFPs=", "niuNb");
        lllllllII[lllllllIl[221]] = llIllIIIlIIl("LigA", "iIpRJ");
        lllllllII[lllllllIl[224]] = llIllIIIlIIl("JBck", "cvTCk");
        lllllllII[lllllllIl[226]] = llIllIIIlIIl("MgQ/D2EUCiYGOA==", "bkSjL");
        lllllllII[lllllllIl[227]] = llIllIIIlIlI("ekmuJAprTBY=", "lpuYc");
        lllllllII[lllllllIl[230]] = llIllIIIlIlI("/2vAR0tUKXA=", "vfCJi");
        lllllllII[lllllllIl[232]] = llIllIIIlIIl("LAwH", "kmwlc");
        lllllllII[lllllllIl[233]] = llIllIIIlIIl("IxQn", "duWBh");
    }

    static {
        llIllIIlIIIl();
        llIllIIIlIll();
        bx = new ArrayList();
        lY = lllllllIl[27];
        lZ = lllllllIl[23];
        mb = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[0]);
        mc = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[1]);
        md = new WorldArea(lllllllIl[235], lllllllIl[52], lllllllIl[69], lllllllIl[72], lllllllIl[3]);
        me = new WorldPoint(lllllllIl[236], lllllllIl[237], lllllllIl[0]);
    }

    private static String llIllIIIlIII(String lIIllIIllIlll, String lIIllIIllIllI) {
        try {
            SecretKeySpec lIIllIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIlllIIl = Cipher.getInstance("Blowfish");
            lIIllIIlllIIl.init(lllllllIl[3], lIIllIIlllIlI);
            return new String(lIIllIIlllIIl.doFinal(Base64.getDecoder().decode(lIIllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIlllIII) {
            lIIllIIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllllllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void dT() {
        if (llIllIIlIIlI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[0]];
            C0001b.a(bx);
            if (llIllIIlIIll(bx.size(), lllllllIl[1])) {
                System.out.println(lllllllII[lllllllIl[1]]);
                bv = lllllllIl[0];
            }
        }
        if (llIllIIlIlII(bv ? 1 : 0) && llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[2])) {
            if (llIllIIlIlII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIllIIlIlIl(nearest) && llIllIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[3]];
                    if (llIllIIlIIlI(new WorldArea(lllllllIl[4], lllllllIl[5], lllllllIl[6], lllllllIl[7], lllllllIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lllllllIl[8], lllllllIl[9], lllllllIl[0]);
                        if (llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllllIl[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lllllllIl[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (llIllIIlIlIl(nearest) && llIllIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[10]];
                    if (llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllllIl[11]);
                        "".length();
                    }
                    if (llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (llIllIIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllllIl[1]);
                            "".length();
                        }
                        if (llIllIIlIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllllIl[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lllllllIl[12]];
                    iArr[lllllllIl[0]] = lllllllIl[13];
                    iArr[lllllllIl[1]] = lllllllIl[14];
                    iArr[lllllllIl[3]] = lllllllIl[15];
                    iArr[lllllllIl[10]] = lllllllIl[16];
                    iArr[lllllllIl[17]] = lllllllIl[18];
                    iArr[lllllllIl[2]] = lllllllIl[19];
                    iArr[lllllllIl[20]] = lllllllIl[21];
                    iArr[lllllllIl[22]] = lllllllIl[23];
                    iArr[lllllllIl[24]] = lllllllIl[25];
                    iArr[lllllllIl[26]] = lllllllIl[27];
                    if (llIllIIlIlII(C0004e.d(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(lllllllII[lllllllIl[17]]);
                        bv = lllllllIl[1];
                        return;
                    }
                    int[] iArr2 = new int[lllllllIl[12]];
                    iArr2[lllllllIl[0]] = lllllllIl[13];
                    iArr2[lllllllIl[1]] = lllllllIl[14];
                    iArr2[lllllllIl[3]] = lllllllIl[15];
                    iArr2[lllllllIl[10]] = lllllllIl[16];
                    iArr2[lllllllIl[17]] = lllllllIl[18];
                    iArr2[lllllllIl[2]] = lllllllIl[19];
                    iArr2[lllllllIl[20]] = lllllllIl[21];
                    iArr2[lllllllIl[22]] = lllllllIl[23];
                    iArr2[lllllllIl[24]] = lllllllIl[25];
                    iArr2[lllllllIl[26]] = lllllllIl[27];
                    if (llIllIIlIIlI(C0004e.d(iArr2) ? 1 : 0)) {
                        C0000a.a(lllllllIl[28], lllllllIl[1]);
                        C0000a.a(lllllllIl[29], lllllllIl[1]);
                        C0000a.a(lllllllIl[30], lllllllIl[1]);
                        C0000a.a(lllllllIl[31], lllllllIl[1]);
                        C0000a.a(lllllllIl[32], lllllllIl[1]);
                        C0000a.a(lllllllIl[33], lllllllIl[1]);
                        C0000a.a(lllllllIl[34], lllllllIl[1]);
                        int[] iArr3 = new int[lllllllIl[1]];
                        iArr3[lllllllIl[0]] = lllllllIl[28];
                        if (llIllIIlIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllllllIl[1]];
                            iArr4[lllllllIl[0]] = lllllllIl[28];
                            if (llIllIIlIlII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lllllllIl[1]];
                                iArr5[lllllllIl[0]] = lllllllIl[28];
                                if (llIllIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lllllllIl[35], lllllllIl[1]);
                                }
                            }
                        }
                        C0000a.a(lllllllIl[18], lllllllIl[1]);
                        C0004e.l(lllllllIl[28]);
                        C0004e.l(lllllllIl[29]);
                        C0004e.l(lllllllIl[30]);
                        C0004e.l(lllllllIl[31]);
                        C0004e.l(lllllllIl[32]);
                        Time.sleepTicks(lllllllIl[1]);
                        "".length();
                        C0004e.l(lllllllIl[34]);
                        C0004e.l(lllllllIl[36]);
                        C0004e.l(lllllllIl[33]);
                        C0004e.l(lllllllIl[35]);
                        C0004e.l(lllllllIl[18]);
                        Time.sleepTicks(lllllllIl[10]);
                        "".length();
                        if (llIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lllllllIl[20]);
                            "".length();
                        }
                        if (llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                            if (llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[37])) {
                                C0000a.a(lllllllIl[13], lllllllIl[12]);
                                C0000a.a(lllllllIl[14], lllllllIl[12]);
                                C0000a.a(lllllllIl[21], lllllllIl[12]);
                                C0000a.a(lllllllIl[15], lllllllIl[12]);
                                C0000a.b(C0005f.bm, lllllllIl[1]);
                                C0000a.a(lllllllIl[27], lllllllIl[1]);
                                C0000a.a(lllllllIl[19], lllllllIl[2]);
                                C0000a.a(lllllllIl[23], lllllllIl[38]);
                            }
                            if (llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[37])) {
                                C0000a.a(lllllllIl[13], lllllllIl[12]);
                                C0000a.a(lllllllIl[21], lllllllIl[12]);
                                C0000a.a(lllllllIl[25], lllllllIl[12]);
                                C0000a.b(C0005f.bm, lllllllIl[1]);
                                C0000a.a(lllllllIl[27], lllllllIl[1]);
                                C0000a.a(lllllllIl[19], lllllllIl[24]);
                                C0000a.a(lllllllIl[23], lllllllIl[12]);
                            }
                        }
                    }
                }
            }
            if (llIllIIlIIlI(an() ? 1 : 0)) {
                String[] strArr = new String[lllllllIl[1]];
                strArr[lllllllIl[0]] = lllllllII[lllllllIl[2]];
                if (llIllIIlIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllllllIl[1]];
                    strArr2[lllllllIl[0]] = lllllllII[lllllllIl[20]];
                    Inventory.getFirst(strArr2).interact(lllllllII[lllllllIl[22]]);
                }
                if (llIllIIlIIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIllIIlIIll(Movement.getRunEnergy(), lllllllIl[39])) {
                    Inventory.getFirst(C0005f.bc).interact(lllllllII[lllllllIl[24]]);
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIllI(Combat.getMissingHealth(), lllllllIl[40])) {
                    int[] iArr6 = new int[lllllllIl[1]];
                    iArr6[lllllllIl[0]] = lllllllIl[23];
                    if (llIllIIlIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllllllIl[1]];
                        iArr7[lllllllIl[0]] = lllllllIl[23];
                        Inventory.getFirst(iArr7).interact(lllllllII[lllllllIl[26]]);
                        Time.sleepTicks(lllllllIl[3]);
                        "".length();
                    }
                }
                if (llIllIIlIllI(Movement.getRunEnergy(), lllllllIl[41]) && llIllIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[42])) {
                    dU();
                }
                if ((!llIllIIllIII(C0004e.j(lllllllIl[43]), lllllllIl[44]) || llIllIIlIIll(C0004e.j(lllllllIl[45]), lllllllIl[2])) && llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[42]) && llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[44])) {
                    dV();
                }
                if (llIllIIllIII(C0004e.j(lllllllIl[43]), lllllllIl[44]) && llIllIIllIII(C0004e.j(lllllllIl[45]), lllllllIl[2])) {
                    if (llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[42]) && llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[37])) {
                        dV();
                    }
                    if (llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[37]) && llIllIIlIIll(Skills.getLevel(Skill.AGILITY), lllllllIl[44])) {
                        dW();
                    }
                }
                if (llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[44])) {
                    dX();
                }
            }
        }
    }

    private static boolean llIllIIlIIlI(int i) {
        return i != 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dT();
            "".length();
            if (((54 ^ 58) & ((32 ^ 44) ^ (-1))) >= " ".length()) {
                return (232 ^ 179) & ((31 ^ 68) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllllllIl[186];
    }

    private static boolean llIllIIlIlll(int i) {
        return i > 0;
    }

    private static void llIllIIlIIIl() {
        lllllllIl = new int[239];
        lllllllIl[0] = ((6 ^ 78) ^ (41 ^ 78)) & (((57 ^ 35) ^ (97 ^ 84)) ^ (-" ".length()));
        lllllllIl[1] = " ".length();
        lllllllIl[2] = 197 ^ 192;
        lllllllIl[3] = "  ".length();
        lllllllIl[4] = (-((-3335) & 32079)) & (-49) & 32255;
        lllllllIl[5] = (-((-1409) & 30715)) & (-1) & 32767;
        lllllllIl[6] = 145 ^ 175;
        lllllllIl[7] = (((105 + 110) - 63) + 9) ^ (((33 + 97) - 57) + 73);
        lllllllIl[8] = (-((-1921) & 14215)) & (-16898) & 32703;
        lllllllIl[9] = (-((-651) & 8875)) & (-16389) & 28092;
        lllllllIl[10] = "   ".length();
        lllllllIl[11] = (-((-21771) & 32111)) & (-16403) & 31742;
        lllllllIl[12] = (((83 + 152) - 99) + 23) ^ (((62 + 21) - 43) + 109);
        lllllllIl[13] = (-((-5959) & 14175)) & (-16513) & 32735;
        lllllllIl[14] = (-((-7521) & 15731)) & (-2) & 16219;
        lllllllIl[15] = (-16517) & 24525;
        lllllllIl[16] = (-51) & 3903;
        lllllllIl[17] = 172 ^ 168;
        lllllllIl[18] = (-((-7769) & 24444)) & (-1) & 28655;
        lllllllIl[19] = (-((-6503) & 24047)) & (-2087) & 32255;
        lllllllIl[20] = 193 ^ 199;
        lllllllIl[21] = (-181) & 8190;
        lllllllIl[22] = 11 ^ 12;
        lllllllIl[23] = (-((-10821) & 15991)) & (-65) & 5619;
        lllllllIl[24] = (184 ^ 175) ^ (66 ^ 93);
        lllllllIl[25] = (-8201) & 27819;
        lllllllIl[26] = 16 ^ 25;
        lllllllIl[27] = (-2149) & 23294;
        lllllllIl[28] = (-((-25689) & 30076)) & (-16385) & 32631;
        lllllllIl[29] = (-16432) & 28287;
        lllllllIl[30] = (-434) & 12287;
        lllllllIl[31] = (-179) & 12030;
        lllllllIl[32] = (-((-20998) & 21295)) & (-4229) & 16383;
        lllllllIl[33] = (-20770) & 32619;
        lllllllIl[34] = (-291) & 12258;
        lllllllIl[35] = (((178 + 125) - 230) + 130) ^ (((53 + 32) - (-58)) + 4);
        lllllllIl[36] = (-((-3969) & 8097)) & (-197) & 24559;
        lllllllIl[37] = 86 ^ 126;
        lllllllIl[38] = 112 ^ 127;
        lllllllIl[39] = 154 ^ 168;
        lllllllIl[40] = 164 ^ 176;
        lllllllIl[41] = 103 ^ 126;
        lllllllIl[42] = 57 ^ 39;
        lllllllIl[43] = (-((-8373) & 30966)) & (-9745) & 32639;
        lllllllIl[44] = 254 ^ 194;
        lllllllIl[45] = (-12485) & 12791;
        lllllllIl[46] = (-((-7001) & 32603)) & (-4689) & 32759;
        lllllllIl[47] = (-((-14339) & 30743)) & (-4225) & 24063;
        lllllllIl[48] = (-((-5235) & 14070)) & (-4097) & 16355;
        lllllllIl[49] = 205 ^ 198;
        lllllllIl[50] = (-16419) & 19839;
        lllllllIl[51] = (-((-8281) & 26207)) & (-4177) & 24567;
        lllllllIl[52] = (-((-4167) & 28911)) & (-4097) & 32255;
        lllllllIl[53] = "   ".length() ^ (165 ^ 168);
        lllllllIl[54] = 42 ^ 56;
        lllllllIl[55] = (-((-10367) & 28287)) & (-8205) & 28607;
        lllllllIl[56] = (-4612) & 8027;
        lllllllIl[57] = (-((-897) & 30666)) & (-1) & 32251;
        lllllllIl[58] = (-((-16673) & 25509)) & (-3) & 12255;
        lllllllIl[59] = (-((-16549) & 21229)) & (-8197) & 15357;
        lllllllIl[60] = (-((-1155) & 13455)) & (-129) & 15855;
        lllllllIl[61] = 97 ^ 119;
        lllllllIl[62] = -" ".length();
        lllllllIl[63] = (((77 + 102) - 88) + 41) ^ (((133 + 47) - 56) + 12);
        lllllllIl[64] = 146 ^ 159;
        lllllllIl[65] = (((7 + 94) - 34) + 68) ^ (((59 + 125) - 170) + 137);
        lllllllIl[66] = (((179 + 73) - 182) + 140) ^ (((142 + 177) - 163) + 39);
        lllllllIl[67] = (((13 + 136) - 66) + 62) ^ (((86 + 127) - 108) + 25);
        lllllllIl[68] = 40 ^ 61;
        lllllllIl[69] = 82 ^ 69;
        lllllllIl[70] = 114 ^ 106;
        lllllllIl[71] = 17 ^ 11;
        lllllllIl[72] = (107 ^ 72) ^ (131 ^ 187);
        lllllllIl[73] = (114 ^ 110) ^ ((123 ^ 124) & ((95 ^ 88) ^ (-1)));
        lllllllIl[74] = 58 ^ 39;
        lllllllIl[75] = 179 ^ 172;
        lllllllIl[76] = (-29089) & 32255;
        lllllllIl[77] = (-((-21526) & 30239)) & (-16481) & 28543;
        lllllllIl[78] = (((39 ^ 96) + (166 ^ 174)) - (-(190 ^ 178))) + (35 ^ 13);
        lllllllIl[79] = (56 ^ 6) ^ (241 ^ 145);
        lllllllIl[80] = (-((-2265) & 31741)) & (-9) & 32703;
        lllllllIl[81] = (-((-5649) & 30399)) & (-4609) & 32767;
        lllllllIl[82] = (-24852) & 28063;
        lllllllIl[83] = (-12673) & 15870;
        lllllllIl[84] = (-(((35 + 63) - (-2)) + 30)) & (-513) & 4053;
        lllllllIl[85] = (-12426) & 15615;
        lllllllIl[86] = (-((-12679) & 13223)) & (-4097) & 8053;
        lllllllIl[87] = (-16549) & 19949;
        lllllllIl[88] = (-24977) & 28155;
        lllllllIl[89] = (-24586) & 27967;
        lllllllIl[90] = (-8805) & 12021;
        lllllllIl[91] = (-4108) & 7499;
        lllllllIl[92] = (-((-163) & 29603)) & (-85) & 32758;
        lllllllIl[93] = (-((-6217) & 6734)) & (-8337) & 12255;
        lllllllIl[94] = (-((-7521) & 24553)) & (-6) & 20447;
        lllllllIl[95] = 19 ^ 51;
        lllllllIl[96] = (-((-1033) & 13674)) & (-16387) & 32251;
        lllllllIl[97] = (174 ^ 178) ^ (67 ^ 126);
        lllllllIl[98] = (6 ^ 114) ^ (216 ^ 142);
        lllllllIl[99] = (((41 + 115) - 53) + 39) ^ (((46 + 64) - 90) + 153);
        lllllllIl[100] = (((45 + 95) - 85) + 110) ^ (((49 + 66) - 6) + 20);
        lllllllIl[101] = 20 ^ 49;
        lllllllIl[102] = (((11 + 177) - 171) + 212) ^ (((163 + 119) - 256) + 169);
        lllllllIl[103] = 37 ^ 2;
        lllllllIl[104] = (-19010) & 27509;
        lllllllIl[105] = (243 ^ 188) ^ (82 ^ 52);
        lllllllIl[106] = (((166 + 37) - 46) + 12) ^ (((73 + 105) - 148) + 101);
        lllllllIl[107] = 75 ^ 96;
        lllllllIl[108] = 81 ^ 125;
        lllllllIl[109] = (198 ^ 145) ^ (16 ^ 106);
        lllllllIl[110] = 10 ^ 36;
        lllllllIl[111] = 143 ^ 160;
        lllllllIl[112] = 102 ^ 86;
        lllllllIl[113] = 4 ^ 53;
        lllllllIl[114] = 191 ^ 139;
        lllllllIl[115] = (-1030) & 15863;
        lllllllIl[116] = 66 ^ 119;
        lllllllIl[117] = 130 ^ 180;
        lllllllIl[118] = (-1545) & 16379;
        lllllllIl[119] = 87 ^ 96;
        lllllllIl[120] = 41 ^ 17;
        lllllllIl[121] = (-((-10925) & 27310)) & (-513) & 31733;
        lllllllIl[122] = 151 ^ 174;
        lllllllIl[123] = 32 ^ 26;
        lllllllIl[124] = (16 ^ 30) ^ (135 ^ 178);
        lllllllIl[125] = (-((-19871) & 24575)) & (-17) & 8191;
        lllllllIl[126] = (-101) & 3566;
        lllllllIl[127] = (-25105) & 28606;
        lllllllIl[128] = (-((-2978) & 31727)) & (-529) & 32767;
        lllllllIl[129] = (-25113) & 28607;
        lllllllIl[130] = (-((-3221) & 31989)) & (-1) & 32251;
        lllllllIl[131] = (-((-57) & 12861)) & (-16449) & 32749;
        lllllllIl[132] = (-((-5209) & 22142)) & (-12361) & 32765;
        lllllllIl[133] = (-((-18787) & 31599)) & (-19) & 16319;
        lllllllIl[134] = (-((-6417) & 31513)) & (-4129) & 32699;
        lllllllIl[135] = (-((-9) & 21099)) & (-8193) & 32767;
        lllllllIl[136] = (-24577) & 28043;
        lllllllIl[137] = (-((-1257) & 5865)) & (-6) & 8119;
        lllllllIl[138] = (-((-5169) & 22143)) & (-8225) & 28671;
        lllllllIl[139] = (-((-7439) & 16207)) & (-16418) & 28671;
        lllllllIl[140] = (35 ^ 73) ^ (89 ^ 14);
        lllllllIl[141] = 75 ^ 116;
        lllllllIl[142] = 17 ^ 81;
        lllllllIl[143] = 226 ^ 163;
        lllllllIl[144] = (((155 + 137) - 134) + 51) ^ (((90 + 109) - 130) + 78);
        lllllllIl[145] = (((59 + 100) - 39) + 82) ^ (((49 + 0) - 7) + 95);
        lllllllIl[146] = 82 ^ 22;
        lllllllIl[147] = (((9 + 23) - (-107)) + 80) ^ (((70 + 66) - 129) + 151);
        lllllllIl[148] = 134 ^ 192;
        lllllllIl[149] = 79 ^ 8;
        lllllllIl[150] = (58 ^ 92) ^ (48 ^ 30);
        lllllllIl[151] = 56 ^ 113;
        lllllllIl[152] = 86 ^ 28;
        lllllllIl[153] = 94 ^ 21;
        lllllllIl[154] = 229 ^ 169;
        lllllllIl[155] = 199 ^ 138;
        lllllllIl[156] = (((72 + 191) - 78) + 60) ^ (((57 + 156) - 85) + 59);
        lllllllIl[157] = (72 ^ 127) ^ (235 ^ 147);
        lllllllIl[158] = 243 ^ 163;
        lllllllIl[159] = 120 ^ 41;
        lllllllIl[160] = 67 ^ 17;
        lllllllIl[161] = (29 ^ 5) ^ (228 ^ 175);
        lllllllIl[162] = (-5121) & 7807;
        lllllllIl[163] = (-8834) & 12287;
        lllllllIl[164] = (-((-16789) & 22005)) & (-24833) & 32767;
        lllllllIl[165] = (-20499) & 23199;
        lllllllIl[166] = (-((-14947) & 32619)) & (-33) & 20411;
        lllllllIl[167] = (-1045) & 3741;
        lllllllIl[168] = (-20528) & 23215;
        lllllllIl[169] = (-((-17561) & 29887)) & (-16393) & 32175;
        lllllllIl[170] = (-((-209) & 21969)) & (-8211) & 32699;
        lllllllIl[171] = (-8198) & 11685;
        lllllllIl[172] = 2 ^ 86;
        lllllllIl[173] = (112 ^ 53) ^ (76 ^ 92);
        lllllllIl[174] = (107 ^ 47) ^ (76 ^ 94);
        lllllllIl[175] = 30 ^ 73;
        lllllllIl[176] = 241 ^ 168;
        lllllllIl[177] = 204 ^ 150;
        lllllllIl[178] = (((1 + 41) - (-90)) + 60) ^ (((107 + 2) - 56) + 102);
        lllllllIl[179] = 104 ^ 52;
        lllllllIl[180] = (((210 + 188) - 351) + 180) ^ (((7 + 27) - (-92)) + 64);
        lllllllIl[181] = (212 ^ 198) ^ (137 ^ 196);
        lllllllIl[182] = 22 ^ 118;
        lllllllIl[183] = (12 ^ 61) ^ (234 ^ 186);
        lllllllIl[184] = (223 ^ 171) ^ (169 ^ 191);
        lllllllIl[185] = (221 ^ 163) ^ (169 ^ 180);
        lllllllIl[186] = (((85 + 93) - 48) + 88) ^ (((133 + 34) - 122) + 145);
        lllllllIl[187] = (((131 + 29) - 156) + 211) ^ (((8 + 109) - 54) + 115);
        lllllllIl[188] = 52 ^ 82;
        lllllllIl[189] = (-12545) & 15735;
        lllllllIl[190] = (-20618) & 24031;
        lllllllIl[191] = (-17282) & 20463;
        lllllllIl[192] = (-8769) & 12155;
        lllllllIl[193] = (-20919) & 32767;
        lllllllIl[194] = 223 ^ 184;
        lllllllIl[195] = (-8193) & 13692;
        lllllllIl[196] = (-((-8747) & 15935)) & (-4) & 32191;
        lllllllIl[197] = (-((-430) & 11775)) & (-41) & 12285;
        lllllllIl[198] = (-17474) & 18423;
        lllllllIl[199] = (-((-18351) & 24495)) & (-1) & 8094;
        lllllllIl[200] = (-((-16646) & 21775)) & (-16385) & 30463;
        lllllllIl[201] = (-((-2631) & 19063)) & (-257) & 28666;
        lllllllIl[202] = (-((-22822) & 23463)) & (-1) & 26591;
        lllllllIl[203] = 79 ^ 39;
        lllllllIl[204] = 254 ^ 151;
        lllllllIl[205] = (230 ^ 187) ^ (23 ^ 32);
        lllllllIl[206] = (219 ^ 146) ^ (48 ^ 18);
        lllllllIl[207] = 245 ^ 153;
        lllllllIl[208] = 70 ^ 43;
        lllllllIl[209] = (-((-22569) & 32121)) & (-20513) & 32767;
        lllllllIl[210] = (-((-2241) & 31475)) & (-65) & 32763;
        lllllllIl[211] = (199 ^ 189) ^ (93 ^ 73);
        lllllllIl[212] = (-20593) & 24061;
        lllllllIl[213] = 20 ^ 123;
        lllllllIl[214] = (-5129) & 7839;
        lllllllIl[215] = (-((-18822) & 31663)) & (-65) & 16381;
        lllllllIl[216] = (((142 + 174) - 172) + 37) ^ (((157 + 133) - 249) + 156);
        lllllllIl[217] = (-20522) & 23231;
        lllllllIl[218] = (138 ^ 168) ^ (112 ^ 35);
        lllllllIl[219] = (-((-16513) & 17627)) & (-28933) & 32767;
        lllllllIl[220] = (-((-9093) & 29653)) & (-8201) & 32253;
        lllllllIl[221] = (49 ^ 69) ^ (134 ^ 128);
        lllllllIl[222] = (-21001) & 24510;
        lllllllIl[223] = (-((-11477) & 16119)) & (-65) & 8190;
        lllllllIl[224] = 78 ^ 61;
        lllllllIl[225] = (-((-2751) & 27391)) & (-4625) & 32767;
        lllllllIl[226] = (((45 + 129) - (-54)) + 13) ^ (((56 + 117) - 143) + 103);
        lllllllIl[227] = (((111 + 42) - 134) + 187) ^ (((124 + 12) - 113) + 164);
        lllllllIl[228] = (-4650) & 8127;
        lllllllIl[229] = (-((-12965) & 29415)) & (-4121) & 24062;
        lllllllIl[230] = (160 ^ 166) ^ (205 ^ 189);
        lllllllIl[231] = (-((-16651) & 25439)) & (-20481) & 32767;
        lllllllIl[232] = (146 ^ 132) ^ (17 ^ 112);
        lllllllIl[233] = 66 ^ 58;
        lllllllIl[234] = (-4111) & 7615;
        lllllllIl[235] = (-((-19113) & 32428)) & (-25) & 15807;
        lllllllIl[236] = (-12885) & 15358;
        lllllllIl[237] = (-16529) & 19965;
        lllllllIl[238] = (17 ^ 29) ^ (103 ^ 18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    private static boolean dY() {
        WorldArea worldArea = new WorldArea(lllllllIl[80], lllllllIl[81], lllllllIl[69], lllllllIl[64], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[82], lllllllIl[81], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[83], lllllllIl[84], lllllllIl[63], lllllllIl[49], lllllllIl[10]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[189], lllllllIl[190], lllllllIl[24], lllllllIl[2], lllllllIl[1]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[85], lllllllIl[87], lllllllIl[12], lllllllIl[24], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[191], lllllllIl[192], lllllllIl[73], lllllllIl[38], lllllllIl[10]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[90], lllllllIl[91], lllllllIl[66], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[92], lllllllIl[93], lllllllIl[22], lllllllIl[26], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[92], lllllllIl[94], lllllllIl[12], lllllllIl[22], lllllllIl[10]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[127], lllllllIl[128], lllllllIl[49], lllllllIl[12], lllllllIl[3]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[129], lllllllIl[127], lllllllIl[49], lllllllIl[24], lllllllIl[3]);
        WorldArea worldArea12 = new WorldArea(lllllllIl[130], lllllllIl[131], lllllllIl[63], lllllllIl[49], lllllllIl[3]);
        WorldArea worldArea13 = new WorldArea(lllllllIl[132], lllllllIl[133], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea14 = new WorldArea(lllllllIl[134], lllllllIl[9], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea15 = new WorldArea(lllllllIl[135], lllllllIl[136], lllllllIl[68], lllllllIl[53], lllllllIl[10]);
        WorldArea worldArea16 = new WorldArea(lllllllIl[137], lllllllIl[138], lllllllIl[63], lllllllIl[64], lllllllIl[3]);
        WorldArea worldArea17 = new WorldArea(lllllllIl[164], lllllllIl[133], lllllllIl[64], lllllllIl[12], lllllllIl[10]);
        WorldArea worldArea18 = new WorldArea(lllllllIl[165], lllllllIl[139], lllllllIl[38], lllllllIl[53], lllllllIl[3]);
        WorldArea worldArea19 = new WorldArea(lllllllIl[166], lllllllIl[134], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea20 = new WorldArea(lllllllIl[167], lllllllIl[136], lllllllIl[70], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea21 = new WorldArea(lllllllIl[168], lllllllIl[169], lllllllIl[54], lllllllIl[63], lllllllIl[3]);
        WorldArea[] worldAreaArr = new WorldArea[lllllllIl[68]];
        worldAreaArr[lllllllIl[0]] = worldArea;
        worldAreaArr[lllllllIl[1]] = worldArea2;
        worldAreaArr[lllllllIl[3]] = worldArea3;
        worldAreaArr[lllllllIl[10]] = worldArea4;
        worldAreaArr[lllllllIl[17]] = worldArea5;
        worldAreaArr[lllllllIl[2]] = worldArea6;
        worldAreaArr[lllllllIl[20]] = worldArea7;
        worldAreaArr[lllllllIl[22]] = worldArea8;
        worldAreaArr[lllllllIl[24]] = worldArea9;
        worldAreaArr[lllllllIl[26]] = worldArea10;
        worldAreaArr[lllllllIl[12]] = worldArea11;
        worldAreaArr[lllllllIl[49]] = worldArea12;
        worldAreaArr[lllllllIl[63]] = worldArea13;
        worldAreaArr[lllllllIl[64]] = worldArea14;
        worldAreaArr[lllllllIl[53]] = worldArea15;
        worldAreaArr[lllllllIl[38]] = worldArea16;
        worldAreaArr[lllllllIl[65]] = worldArea17;
        worldAreaArr[lllllllIl[66]] = worldArea18;
        worldAreaArr[lllllllIl[54]] = worldArea19;
        worldAreaArr[lllllllIl[67]] = worldArea20;
        worldAreaArr[lllllllIl[40]] = worldArea21;
        int[] iArr = new int[lllllllIl[1]];
        iArr[lllllllIl[0]] = lllllllIl[193];
        if (llIllIIlIlIl(TileItems.getNearest(iArr))) {
            System.out.println(lllllllII[lllllllIl[194]]);
            int i = lllllllIl[0];
            while (llIllIIlIIll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lllllllIl[1]];
                iArr2[lllllllIl[0]] = lllllllIl[193];
                if (llIllIIlIIlI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && llIllIIlIIlI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lllllllIl[1];
                }
                i++;
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((91 ^ 65) ^ (63 ^ 34)) & (((((14 + 14) - (-70)) + 63) ^ (((162 + 82) - 82) + 4)) ^ (-" ".length()));
                }
            }
        }
        return lllllllIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIllIIllIII(Skills.getLevel(Skill.AGILITY), lllllllIl[2])) {
            ?? r0 = lllllllIl[1];
            "".length();
            return " ".length() == 0 ? ((21 ^ 58) ^ (122 ^ 74)) & (((111 ^ 14) ^ (195 ^ 189)) ^ (-" ".length())) : r0;
        }
        return lllllllIl[0];
    }

    private static void dX() {
        WorldArea worldArea = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[0]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[1]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[3]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[162], lllllllIl[163], lllllllIl[111], lllllllIl[111], lllllllIl[10]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[164], lllllllIl[133], lllllllIl[64], lllllllIl[12], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[165], lllllllIl[139], lllllllIl[38], lllllllIl[53], lllllllIl[3]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[166], lllllllIl[134], lllllllIl[49], lllllllIl[26], lllllllIl[3]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[167], lllllllIl[136], lllllllIl[70], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[168], lllllllIl[169], lllllllIl[54], lllllllIl[63], lllllllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lllllllIl[170], lllllllIl[171], lllllllIl[0]);
        if (llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIllIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllllllIl[1]);
            "".length();
        }
        if (llIllIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lllllllIl[1]);
                "".length();
            }
            if (llIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllllllIl[20])) {
                AccBuilderGWD.c = lllllllII[lllllllIl[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lllllllIl[1]];
                strArr[lllllllIl[0]] = lllllllII[lllllllIl[175]];
                TileObjects.getNearest(strArr).interact(lllllllII[lllllllIl[35]]);
                Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                }, lllllllIl[104]);
                "".length();
                Time.sleepTicks(lllllllIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lllllllIl[1]];
        strArr2[lllllllIl[0]] = lllllllII[lllllllIl[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIllIIlIlIl(nearest) && llIllIIlIIlI(dY() ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[177]];
            System.out.println(lllllllII[lllllllIl[178]]);
            nearest.interact(lllllllII[lllllllIl[179]]);
            Time.sleepTicks(lllllllIl[10]);
            "".length();
        }
        if (llIllIIlIlII(dY() ? 1 : 0)) {
            if (llIllIIlIIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIllIIlIIlI(tileObject.getName().contains(lllllllII[lllllllIl[218]]) ? 1 : 0) && llIllIIllIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[219], lllllllIl[220], lllllllIl[10])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return (-(75 ^ 79)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderGWD.c = lllllllII[lllllllIl[180]];
                    nearest2.interact(lllllllII[lllllllIl[79]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIllIIlIIlI(tileObject2.getName().contains(lllllllII[lllllllIl[216]]) ? 1 : 0) && llIllIIllIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[217], lllllllIl[128], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return "  ".length() <= (((((8 + 198) - 187) + 190) ^ (((82 + 95) - 89) + 91)) & (((((94 + 58) - 114) + 191) ^ (((40 + 64) - 31) + 62)) ^ (-" ".length()))) ? ((((66 + 136) - 184) + 121) ^ (((39 + 65) - (-86)) + 2)) & (((((80 + 136) - 96) + 135) ^ (((55 + 113) - 80) + 92)) ^ (-" ".length())) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest3)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lllllllII[lllllllIl[182]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? ((81 ^ 32) ^ (213 ^ 188)) & (((((126 + 142) - 251) + 152) ^ (((86 + 136) - 213) + 168)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIllIIlIIlI(tileObject3.getName().contains(lllllllII[lllllllIl[213]]) ? 1 : 0) && llIllIIllIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[214], lllllllIl[215], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest4)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lllllllII[lllllllIl[184]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (llIllIIlIIlI(dY() ? 1 : 0)) {
                return;
            }
            if (llIllIIlIIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIllIIlIIlI(tileObject4.getName().contains(lllllllII[lllllllIl[211]]) ? 1 : 0) && llIllIIllIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[212], lllllllIl[10])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return (-"   ".length()) >= 0 ? ((78 ^ 55) ^ (1 ^ 39)) & (((169 ^ 174) ^ (66 ^ 26)) ^ (-" ".length())) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest5)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lllllllII[lllllllIl[186]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return ((101 ^ 97) ^ ((99 ^ 73) & ((3 ^ 41) ^ (-1)))) < 0 ? ((164 ^ 198) ^ (42 ^ 83)) & (((((71 + 51) - 38) + 55) ^ (((19 + 73) - 7) + 59)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
            if (!llIllIIlIIlI(dY() ? 1 : 0) && llIllIIlIIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIllIIlIIlI(tileObject5.getName().contains(lllllllII[lllllllIl[208]]) ? 1 : 0) && llIllIIllIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lllllllIl[209], lllllllIl[210], lllllllIl[3])), lllllllIl[3])) {
                        ?? r0 = lllllllIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllllIl[0];
                });
                if (llIllIIlIlIl(nearest6)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lllllllII[lllllllIl[188]]);
                    Time.sleepTicks(C0004e.c(lllllllIl[1], lllllllIl[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? ((144 ^ 168) ^ (42 ^ 65)) & (((85 ^ 3) ^ (59 ^ 62)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIllIIlIlII(int i) {
        return i == 0;
    }

    private static boolean llIllIIlIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIllIIllIIl(int i, int i2) {
        return i == i2;
    }

    private static String llIllIIIlIIl(String lIIllIlIIllII, String lIIllIlIIlIll) {
        String str = new String(Base64.getDecoder().decode(lIIllIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIllIlIIlIIl = lIIllIlIIlIll.toCharArray();
        int lIIllIlIIlIII = lllllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllllllIl[0];
        while (llIllIIlIIll(i, length)) {
            char lIIllIlIIllIl = charArray[i];
            sb.append((char) (lIIllIlIIllIl ^ lIIllIlIIlIIl[lIIllIlIIlIII % lIIllIlIIlIIl.length]));
            "".length();
            lIIllIlIIlIII++;
            i++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllllllII[lllllllIl[203]];
    }

    private static boolean llIllIIllIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (llIllIIlIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ad.lllllllIl[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (llIllIIlIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ad.lllllllIl[12]) != false) goto L43;
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
        int[] iArr4 = new int[lllllllIl[1]];
        iArr4[lllllllIl[0]] = lllllllIl[16];
        if (llIllIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[16], lllllllIl[1], lllllllIl[195]));
            "".length();
        }
        int[] iArr5 = new int[lllllllIl[1]];
        iArr5[lllllllIl[0]] = lllllllIl[18];
        if (llIllIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[18], lllllllIl[3], lllllllIl[196]));
            "".length();
        }
        int[] iArr6 = new int[lllllllIl[1]];
        iArr6[lllllllIl[0]] = lllllllIl[27];
        if (llIllIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[27], lllllllIl[3], lllllllIl[196]));
            "".length();
        }
        int[] iArr7 = new int[lllllllIl[1]];
        iArr7[lllllllIl[0]] = lllllllIl[13];
        if (llIllIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[13], lllllllIl[12], lllllllIl[197]));
            "".length();
        }
        int[] iArr8 = new int[lllllllIl[1]];
        iArr8[lllllllIl[0]] = lllllllIl[21];
        if (llIllIIlIlII(Bank.contains(iArr8) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[21], lllllllIl[12], lllllllIl[198]));
            "".length();
        }
        int[] iArr9 = new int[lllllllIl[1]];
        iArr9[lllllllIl[0]] = lllllllIl[15];
        if (llIllIIlIlII(Bank.contains(iArr9) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[15], lllllllIl[12], lllllllIl[198]));
            "".length();
        }
        int[] iArr10 = new int[lllllllIl[1]];
        iArr10[lllllllIl[0]] = lllllllIl[14];
        if (llIllIIlIlII(Bank.contains(iArr10) ? 1 : 0)) {
            bx.add(new C0003d(lllllllIl[14], lllllllIl[12], lllllllIl[198]));
            "".length();
        }
        int[] iArr11 = new int[lllllllIl[1]];
        iArr11[lllllllIl[0]] = lllllllIl[23];
        if (llIllIIlIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lllllllIl[1]];
            iArr12[lllllllIl[0]] = lllllllIl[23];
            if (llIllIIlIIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lllllllIl[1]];
                iArr13[lllllllIl[0]] = lllllllIl[23];
            }
            iArr = new int[lllllllIl[1]];
            iArr[lllllllIl[0]] = lllllllIl[25];
            if (llIllIIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lllllllIl[1]];
                iArr14[lllllllIl[0]] = lllllllIl[25];
                if (llIllIIlIIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllllllIl[1]];
                    iArr15[lllllllIl[0]] = lllllllIl[25];
                }
                iArr2 = new int[lllllllIl[1]];
                iArr2[lllllllIl[0]] = lllllllIl[201];
                if (llIllIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    bx.add(new C0003d(lllllllIl[201], lllllllIl[1], lllllllIl[202]));
                    "".length();
                }
                iArr3 = new int[lllllllIl[1]];
                iArr3[lllllllIl[0]] = lllllllIl[19];
                if (llIllIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(lllllllIl[19], lllllllIl[40], C0009j.ch));
                    "".length();
                    return;
                }
                return;
            }
            bx.add(new C0003d(lllllllIl[25], lllllllIl[12], lllllllIl[200]));
            "".length();
            iArr2 = new int[lllllllIl[1]];
            iArr2[lllllllIl[0]] = lllllllIl[201];
            if (llIllIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lllllllIl[1]];
            iArr3[lllllllIl[0]] = lllllllIl[19];
            if (llIllIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lZ, lllllllIl[44], lllllllIl[199]));
        "".length();
        iArr = new int[lllllllIl[1]];
        iArr[lllllllIl[0]] = lllllllIl[25];
        if (llIllIIlIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllllIl[25], lllllllIl[12], lllllllIl[200]));
        "".length();
        iArr2 = new int[lllllllIl[1]];
        iArr2[lllllllIl[0]] = lllllllIl[201];
        if (llIllIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllllllIl[1]];
        iArr3[lllllllIl[0]] = lllllllIl[19];
        if (llIllIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean llIllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String llIllIIIlIlI(String lIIllIlIlllII, String lIIllIlIllIIl) {
        try {
            SecretKeySpec lIIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lllllllIl[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllllIl[3], lIIllIlIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIlIlllIl) {
            lIIllIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static void dV() {
        WorldArea worldArea = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[1]);
        WorldArea worldArea2 = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[3]);
        WorldArea worldArea3 = new WorldArea(lllllllIl[76], lllllllIl[77], lllllllIl[78], lllllllIl[79], lllllllIl[10]);
        WorldArea worldArea4 = new WorldArea(lllllllIl[80], lllllllIl[81], lllllllIl[69], lllllllIl[64], lllllllIl[0]);
        WorldArea worldArea5 = new WorldArea(lllllllIl[82], lllllllIl[81], lllllllIl[12], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea6 = new WorldArea(lllllllIl[83], lllllllIl[84], lllllllIl[63], lllllllIl[49], lllllllIl[10]);
        WorldArea worldArea7 = new WorldArea(lllllllIl[85], lllllllIl[86], lllllllIl[26], lllllllIl[22], lllllllIl[1]);
        WorldArea worldArea8 = new WorldArea(lllllllIl[85], lllllllIl[87], lllllllIl[12], lllllllIl[24], lllllllIl[10]);
        WorldArea worldArea9 = new WorldArea(lllllllIl[88], lllllllIl[89], lllllllIl[75], lllllllIl[40], lllllllIl[10]);
        WorldArea worldArea10 = new WorldArea(lllllllIl[90], lllllllIl[91], lllllllIl[66], lllllllIl[64], lllllllIl[10]);
        WorldArea worldArea11 = new WorldArea(lllllllIl[92], lllllllIl[93], lllllllIl[22], lllllllIl[26], lllllllIl[10]);
        WorldArea worldArea12 = new WorldArea(lllllllIl[92], lllllllIl[94], lllllllIl[12], lllllllIl[22], lllllllIl[10]);
        if (llIllIIlIlII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllllII[lllllllIl[95]];
            if (llIllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIllIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lllllllIl[96], lllllllIl[52], lllllllIl[0]));
            "".length();
            Time.sleepTicks(lllllllIl[1]);
            "".length();
        }
        if (llIllIIllIIl(Players.getLocal().getAnimation(), lllllllIl[62]) && llIllIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lllllllIl[1]];
            strArr[lllllllIl[0]] = lllllllII[lllllllIl[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (llIllIIlIlIl(nearest) && llIllIIlIIlI(dY() ? 1 : 0)) {
                AccBuilderGWD.c = lllllllII[lllllllIl[98]];
                System.out.println(lllllllII[lllllllIl[99]]);
                nearest.interact(lllllllII[lllllllIl[100]]);
                Time.sleepTicks(lllllllIl[10]);
                "".length();
            }
            if (llIllIIlIlII(dY() ? 1 : 0)) {
                if (llIllIIlIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lllllllIl[1]];
                    strArr2[lllllllIl[0]] = lllllllII[lllllllIl[102]];
                    TileObjects.getNearest(strArr2).interact(lllllllII[lllllllIl[103]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lllllllIl[1]];
                    strArr3[lllllllIl[0]] = lllllllII[lllllllIl[105]];
                    TileObjects.getNearest(strArr3).interact(lllllllII[lllllllIl[106]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lllllllIl[1]];
                    strArr4[lllllllIl[0]] = lllllllII[lllllllIl[108]];
                    TileObjects.getNearest(strArr4).interact(lllllllII[lllllllIl[109]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lllllllIl[1]];
                    strArr5[lllllllIl[0]] = lllllllII[lllllllIl[111]];
                    TileObjects.getNearest(strArr5).interact(lllllllII[lllllllIl[112]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return "   ".length() == 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lllllllIl[1]];
                    strArr6[lllllllIl[0]] = lllllllII[lllllllIl[39]];
                    TileObjects.getNearest(strArr6).interact(lllllllII[lllllllIl[7]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? ((((4 + 68) - (-21)) + 94) ^ (((6 + 36) - (-48)) + 46)) & (("   ".length() ^ (28 ^ 44)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lllllllIl[1]];
                    iArr[lllllllIl[0]] = lllllllIl[115];
                    TileObjects.getNearest(iArr).interact(lllllllII[lllllllIl[116]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lllllllIl[1]];
                    iArr2[lllllllIl[0]] = lllllllIl[118];
                    TileObjects.getNearest(iArr2).interact(lllllllII[lllllllIl[119]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return 0 != 0 ? ((202 ^ 173) ^ (95 ^ 122)) & (((30 ^ 92) ^ ((136 ^ 159) & ((114 ^ 101) ^ (-1)))) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lllllllIl[1]];
                    iArr3[lllllllIl[0]] = lllllllIl[121];
                    TileObjects.getNearest(iArr3).interact(lllllllII[lllllllIl[122]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (-" ".length()) >= 0 ? ((109 ^ 93) ^ (57 ^ 51)) & (((33 ^ 48) ^ (239 ^ 196)) ^ (-" ".length())) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
                if (llIllIIlIIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIlII(dY() ? 1 : 0)) {
                    AccBuilderGWD.c = lllllllII[lllllllIl[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lllllllIl[1]];
                    strArr7[lllllllIl[0]] = lllllllII[lllllllIl[124]];
                    TileObjects.getNearest(strArr7).interact(lllllllII[lllllllIl[44]]);
                    Time.sleepUntil(() -> {
                        if (llIllIIlIllI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lllllllIl[1];
                            "".length();
                            return (-" ".length()) >= (195 ^ 199) ? (true ^ true) & ((!true) ^ true) : r0;
                        }
                        return lllllllIl[0];
                    }, lllllllIl[104]);
                    "".length();
                    Time.sleepTicks(lllllllIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIllIIllIlI(int i, int i2) {
        return i <= i2;
    }
}
