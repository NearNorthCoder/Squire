package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.H  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/H.class */
public class H implements G {
    static /* synthetic */ WorldArea iA;
    private static /* synthetic */ int[] lIIlIIlIlI;
    static /* synthetic */ WorldArea iB;
    public static /* synthetic */ int iw;
    static /* synthetic */ WorldArea iz;
    private static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ int ix;
    private static /* synthetic */ String[] lIIlIIlIII;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ int iy;

    private static String lllllIIIIIII(String lllIllI, String lllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIIlIlI[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIl) {
            llllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIlIlI[0];
    }

    private static void cs() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[125], lIIlIIlIlI[126], lIIlIIlIlI[112], lIIlIIlIlI[107], lIIlIIlIlI[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[127], lIIlIIlIlI[128], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[129], lIIlIIlIlI[127], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[130], lIIlIIlIlI[131], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[132], lIIlIIlIlI[133], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[134], lIIlIIlIlI[9], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[135], lIIlIIlIlI[136], lIIlIIlIlI[68], lIIlIIlIlI[53], lIIlIIlIlI[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[137], lIIlIIlIlI[138], lIIlIIlIlI[63], lIIlIIlIlI[64], lIIlIIlIlI[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIIlIlI[137], lIIlIIlIlI[139], lIIlIIlIlI[0]);
        if (lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllllIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIlIIlIlI[1]);
            "".length();
        }
        if (lllllIIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIlIIlIlI[1]);
                "".length();
            }
            if (lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIlIIlIlI[1]];
                strArr[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[142]];
                TileObjects.getNearest(strArr).interact(lIIlIIlIII[lIIlIIlIlI[143]]);
                Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return (-((106 ^ 88) ^ (81 ^ 103))) >= 0 ? (((160 ^ 166) & ((149 ^ 147) ^ (-1))) ^ (139 ^ 182)) & (((92 ^ 52) ^ (240 ^ 165)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                }, lIIlIIlIlI[104]);
                "".length();
                Time.sleepTicks(lIIlIIlIlI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIlIIlIlI[1]];
        strArr2[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lllllIIIlIlI(nearest) && lllllIIIIlll(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[145]];
            System.out.println(lIIlIIlIII[lIIlIIlIlI[146]]);
            nearest.interact(lIIlIIlIII[lIIlIIlIlI[147]]);
            Time.sleepTicks(lIIlIIlIlI[10]);
            "".length();
        }
        if (lllllIIIlIIl(cu() ? 1 : 0)) {
            if (lllllIIIIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[233]]) ? 1 : 0) && lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[234], lIIlIIlIlI[131], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return 0 != 0 ? ((175 ^ 189) ^ (8 ^ 23)) & (((((6 + 125) - (-23)) + 12) ^ (((2 + 116) - (-1)) + 52)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[148]];
                    nearest2.interact(lIIlIIlIII[lIIlIIlIlI[149]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return ((185 ^ 181) ^ (95 ^ 87)) > ((77 ^ 35) ^ (209 ^ 187)) ? ((241 ^ 198) ^ (159 ^ 181)) & (((((84 + 113) - 159) + 89) ^ (17 ^ 115)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lllllIIIIlll(tileObject2.getName().contains(lIIlIIlIII[lIIlIIlIlI[232]]) ? 1 : 0) && lllllIIIllll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[131], lIIlIIlIlI[225], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return "  ".length() < 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest3)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIlIIlIII[lIIlIIlIlI[151]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lllllIIIIlll(tileObject3.getName().contains(lIIlIIlIII[lIIlIIlIlI[230]]) ? 1 : 0) && lllllIIIllll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[139], lIIlIIlIlI[231], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest4)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIlIIlIII[lIIlIIlIlI[153]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lllllIIIIlll(tileObject4.getName().contains(lIIlIIlIII[lIIlIIlIlI[227]]) ? 1 : 0) && lllllIIIllll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[228], lIIlIIlIlI[229], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest5)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIlIIlIII[lIIlIIlIlI[155]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lllllIIIIlll(tileObject5.getName().contains(lIIlIIlIII[lIIlIIlIlI[226]]) ? 1 : 0) && lllllIIIllll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[9], lIIlIIlIlI[130], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return " ".length() != " ".length() ? ((76 ^ 36) ^ (0 ^ 75)) & (((213 ^ 160) ^ (30 ^ 72)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest6)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIlIIlIII[lIIlIIlIlI[157]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return ((127 ^ 47) ^ (194 ^ 150)) <= "  ".length() ? ((148 ^ 144) ^ (90 ^ 74)) & (((210 ^ 139) ^ (54 ^ 123)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lllllIIIIlll(tileObject6.getName().contains(lIIlIIlIII[lIIlIIlIlI[224]]) ? 1 : 0) && lllllIIIllll(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[225], lIIlIIlIlI[215], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return "  ".length() == (-" ".length()) ? ((1 ^ 31) ^ (206 ^ 196)) & (((((113 + 49) - 32) + 31) ^ (((32 + 151) - 63) + 61)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest7)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIlIIlIII[lIIlIIlIlI[159]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (!lllllIIIIlll(cu() ? 1 : 0) && lllllIIIIlll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lllllIIIIlll(tileObject7.getName().contains(lIIlIIlIII[lIIlIIlIlI[221]]) ? 1 : 0) && lllllIIIllll(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[222], lIIlIIlIlI[223], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return (((((93 + 120) - 126) + 67) ^ (((93 + 107) - 125) + 108)) & (((83 ^ 2) ^ (108 ^ 16)) ^ (-" ".length()))) != 0 ? ((222 ^ 198) ^ (4 ^ 124)) & (((57 ^ 74) ^ (113 ^ 98)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest8)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIlIIlIII[lIIlIIlIlI[161]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllllIIIlllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (lllllIIIllIl(Skills.getBoostedLevel(Skill.AGILITY), lIIlIIlIlI[38])) {
            int[] iArr = new int[lIIlIIlIlI[1]];
            iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[13];
            if (lllllIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIlIlI[1]];
                iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (lllllIIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIIlIlI[1]];
                    iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                    if (lllllIIIIlll(Inventory.contains(iArr3) ? 1 : 0) && ((!lllllIIIlIIl(Inventory.contains(item -> {
                        return item.getName().contains(lIIlIIlIII[lIIlIIlIlI[207]]);
                    }) ? 1 : 0) || lllllIIIIlll(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIlIIlIII[lIIlIIlIlI[206]]);
                    }) ? 1 : 0)) && (!lllllIIIlIIl(Inventory.contains(C0005f.bf) ? 1 : 0) || lllllIIIIlll(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return "   ".length() == 0 ? ((((181 + 3) - 20) + 31) ^ (((91 + 52) - 44) + 42)) & (((16 ^ 57) ^ (217 ^ 190)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lIIlIIlIlI[0];
        }
        int[] iArr4 = new int[lIIlIIlIlI[1]];
        iArr4[lIIlIIlIlI[0]] = lIIlIIlIlI[13];
        if (lllllIIIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIlIIlIlI[1]];
            iArr5[lIIlIIlIlI[0]] = lIIlIIlIlI[15];
            if (lllllIIIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIIlIlI[1]];
                iArr6[lIIlIIlIlI[0]] = lIIlIIlIlI[14];
                if (lllllIIIIlll(Inventory.contains(iArr6) ? 1 : 0) && ((!lllllIIIlIIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIlIIlIII[lIIlIIlIlI[205]]);
                }) ? 1 : 0) || lllllIIIIlll(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIlIIlIII[lIIlIIlIlI[204]]);
                }) ? 1 : 0)) && (!lllllIIIlIIl(Inventory.contains(C0005f.bf) ? 1 : 0) || lllllIIIIlll(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIIlIIlIlI[1];
                    "".length();
                    return (-" ".length()) > 0 ? ((152 ^ 132) ^ (((46 + 47) - 15) + 49)) & (((((131 + 85) - 1) + 7) ^ (((94 + 177) - 264) + 182)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIIlIIlIlI[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIlIII[lIIlIIlIlI[203]];
    }

    private static void cr() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[1]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[3]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[76], lIIlIIlIlI[77], lIIlIIlIlI[78], lIIlIIlIlI[79], lIIlIIlIlI[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[80], lIIlIIlIlI[81], lIIlIIlIlI[69], lIIlIIlIlI[64], lIIlIIlIlI[0]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[82], lIIlIIlIlI[81], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[83], lIIlIIlIlI[84], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[86], lIIlIIlIlI[27], lIIlIIlIlI[23], lIIlIIlIlI[1]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[87], lIIlIIlIlI[12], lIIlIIlIlI[25], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[88], lIIlIIlIlI[89], lIIlIIlIlI[75], lIIlIIlIlI[41], lIIlIIlIlI[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[90], lIIlIIlIlI[91], lIIlIIlIlI[66], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[93], lIIlIIlIlI[23], lIIlIIlIlI[27], lIIlIIlIlI[10]);
        WorldArea worldArea12 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[94], lIIlIIlIlI[12], lIIlIIlIlI[23], lIIlIIlIlI[10]);
        if (lllllIIIlIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[95]];
            if (lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIlIIlIlI[96], lIIlIIlIlI[52], lIIlIIlIlI[0]));
            "".length();
            Time.sleepTicks(lIIlIIlIlI[1]);
            "".length();
        }
        if (lllllIIIlllI(Players.getLocal().getAnimation(), lIIlIIlIlI[62]) && lllllIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIlIIlIlI[1]];
            strArr[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lllllIIIlIlI(nearest) && lllllIIIIlll(cu() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[98]];
                System.out.println(lIIlIIlIII[lIIlIIlIlI[99]]);
                nearest.interact(lIIlIIlIII[lIIlIIlIlI[100]]);
                Time.sleepTicks(lIIlIIlIlI[10]);
                "".length();
            }
            if (lllllIIIlIIl(cu() ? 1 : 0)) {
                if (lllllIIIIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIlIIlIlI[1]];
                    strArr2[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[102]];
                    TileObjects.getNearest(strArr2).interact(lIIlIIlIII[lIIlIIlIlI[103]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return " ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[38]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIlIIlIlI[1]];
                    strArr3[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[105]];
                    TileObjects.getNearest(strArr3).interact(lIIlIIlIII[lIIlIIlIlI[106]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (((((19 + 38) - 21) + 92) ^ (((35 + 26) - (-9)) + 99)) & (((165 ^ 180) ^ (170 ^ 146)) ^ (-" ".length()))) != 0 ? ((71 ^ 37) ^ (2 ^ 89)) & (((((151 + 3) - 69) + 81) ^ (((15 + 150) - 121) + 115)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIlIIlIlI[1]];
                    strArr4[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[108]];
                    TileObjects.getNearest(strArr4).interact(lIIlIIlIII[lIIlIIlIlI[109]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return "   ".length() <= (-" ".length()) ? ((((21 + 9) - (-73)) + 35) ^ (((74 + 19) - (-9)) + 54)) & (((((146 + 161) - 249) + 126) ^ (((128 + 106) - 200) + 140)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIlIIlIlI[1]];
                    strArr5[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[111]];
                    TileObjects.getNearest(strArr5).interact(lIIlIIlIII[lIIlIIlIlI[112]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (27 ^ 31) <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIlIIlIlI[1]];
                    strArr6[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[40]];
                    TileObjects.getNearest(strArr6).interact(lIIlIIlIII[lIIlIIlIlI[7]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIlIIlIlI[1]];
                    iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[115];
                    TileObjects.getNearest(iArr).interact(lIIlIIlIII[lIIlIIlIlI[116]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return " ".length() == (64 ^ 68) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIlIIlIlI[1]];
                    iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[118];
                    TileObjects.getNearest(iArr2).interact(lIIlIIlIII[lIIlIIlIlI[119]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((135 ^ 128) ^ (155 ^ 133)) & (((17 ^ 23) ^ (157 ^ 130)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIlIIlIlI[1]];
                    iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[121];
                    TileObjects.getNearest(iArr3).interact(lIIlIIlIII[lIIlIIlIlI[122]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return ((39 ^ 7) & ((63 ^ 31) ^ (-1))) >= (172 ^ 168) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIIlll(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIlIIlIlI[1]];
                    strArr7[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[124]];
                    TileObjects.getNearest(strArr7).interact(lIIlIIlIII[lIIlIIlIlI[44]]);
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return ((17 ^ 112) & ((235 ^ 138) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static void cq() {
        new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[47], lIIlIIlIlI[12], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[48], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[50], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[51], lIIlIIlIlI[52], lIIlIIlIlI[53], lIIlIIlIlI[54], lIIlIIlIlI[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[55], lIIlIIlIlI[56], lIIlIIlIlI[25], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[57], lIIlIIlIlI[58], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[0]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[59], lIIlIIlIlI[60], lIIlIIlIlI[12], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[46], lIIlIIlIlI[47], lIIlIIlIlI[61], lIIlIIlIlI[21], lIIlIIlIlI[0]);
        if (lllllIIIlIIl(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[12]];
            C0004e.b(iC);
            Time.sleepTicks(lIIlIIlIlI[1]);
            "".length();
        }
        if (!(lllllIIIlIIl(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllllIIIIlll(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllllIIIlllI(Players.getLocal().getAnimation(), lIIlIIlIlI[62]) && lllllIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lllllIIIIlll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[49]];
                String[] strArr = new String[lIIlIIlIlI[1]];
                strArr[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[63]];
                TileObjects.getNearest(strArr).interact(lIIlIIlIII[lIIlIIlIlI[64]]);
                Time.sleepTicks(lIIlIIlIlI[3]);
                "".length();
            }
            if (lllllIIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[53]];
                String[] strArr2 = new String[lIIlIIlIlI[1]];
                strArr2[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[39]];
                TileObjects.getNearest(strArr2).interact(lIIlIIlIII[lIIlIIlIlI[65]]);
                Time.sleepTicks(lIIlIIlIlI[3]);
                "".length();
            }
            if (lllllIIIIlll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[66]];
                String[] strArr3 = new String[lIIlIIlIlI[1]];
                strArr3[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[54]];
                TileObjects.getNearest(strArr3).interact(lIIlIIlIII[lIIlIIlIlI[67]]);
                Time.sleepTicks(lIIlIIlIlI[3]);
                "".length();
            }
            if (lllllIIIIlll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[41]];
                String[] strArr4 = new String[lIIlIIlIlI[1]];
                strArr4[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[68]];
                TileObjects.getNearest(strArr4).interact(lIIlIIlIII[lIIlIIlIlI[61]]);
                Time.sleepTicks(lIIlIIlIlI[19]);
                "".length();
            }
            if (lllllIIIIlll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[69]];
                String[] strArr5 = new String[lIIlIIlIlI[1]];
                strArr5[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[70]];
                TileObjects.getNearest(strArr5).interact(lIIlIIlIII[lIIlIIlIlI[42]]);
                Time.sleepTicks(lIIlIIlIlI[17]);
                "".length();
            }
            if (lllllIIIIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[71]];
                String[] strArr6 = new String[lIIlIIlIlI[1]];
                strArr6[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[72]];
                TileObjects.getNearest(strArr6).interact(lIIlIIlIII[lIIlIIlIlI[73]]);
                Time.sleepTicks(lIIlIIlIlI[10]);
                "".length();
            }
            if (lllllIIIIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[74]];
                String[] strArr7 = new String[lIIlIIlIlI[1]];
                strArr7[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[2]];
                TileObjects.getNearest(strArr7).interact(lIIlIIlIII[lIIlIIlIlI[75]]);
                Time.sleepTicks(lIIlIIlIlI[17]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lllllIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.H.lIIlIIlIlI[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lllllIIIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.H.lIIlIIlIlI[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIlIIlIlI[1]];
        iArr4[lIIlIIlIlI[0]] = lIIlIIlIlI[16];
        if (lllllIIIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[16], lIIlIIlIlI[1], lIIlIIlIlI[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIIlIlI[1]];
        iArr5[lIIlIIlIlI[0]] = lIIlIIlIlI[18];
        if (lllllIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[18], lIIlIIlIlI[3], lIIlIIlIlI[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIIlIlI[1]];
        iArr6[lIIlIIlIlI[0]] = lIIlIIlIlI[28];
        if (lllllIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[28], lIIlIIlIlI[3], lIIlIIlIlI[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIIlIlI[1]];
        iArr7[lIIlIIlIlI[0]] = lIIlIIlIlI[13];
        if (lllllIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[13], lIIlIIlIlI[12], lIIlIIlIlI[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIIlIlI[1]];
        iArr8[lIIlIIlIlI[0]] = lIIlIIlIlI[22];
        if (lllllIIIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[22], lIIlIIlIlI[12], lIIlIIlIlI[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIlIIlIlI[1]];
        iArr9[lIIlIIlIlI[0]] = lIIlIIlIlI[15];
        if (lllllIIIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[15], lIIlIIlIlI[12], lIIlIIlIlI[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIlIIlIlI[1]];
        iArr10[lIIlIIlIlI[0]] = lIIlIIlIlI[14];
        if (lllllIIIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlIlI[14], lIIlIIlIlI[12], lIIlIIlIlI[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIlIIlIlI[1]];
        iArr11[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
        if (lllllIIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIlIIlIlI[1]];
            iArr12[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
            if (lllllIIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIlIIlIlI[1]];
                iArr13[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
            }
            iArr = new int[lIIlIIlIlI[1]];
            iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[26];
            if (lllllIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlIIlIlI[1]];
                iArr14[lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                if (lllllIIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIIlIlI[1]];
                    iArr15[lIIlIIlIlI[0]] = lIIlIIlIlI[26];
                }
                iArr2 = new int[lIIlIIlIlI[1]];
                iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[201];
                if (lllllIIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIIlIlI[201], lIIlIIlIlI[1], lIIlIIlIlI[202]));
                    "".length();
                }
                iArr3 = new int[lIIlIIlIlI[1]];
                iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[20];
                if (lllllIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIIlIlI[20], lIIlIIlIlI[41], C0008i.bq));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIlIIlIlI[26], lIIlIIlIlI[12], lIIlIIlIlI[200]));
            "".length();
            iArr2 = new int[lIIlIIlIlI[1]];
            iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[201];
            if (lllllIIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIlIIlIlI[1]];
            iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[20];
            if (lllllIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(ix, lIIlIIlIlI[44], lIIlIIlIlI[199]));
        "".length();
        iArr = new int[lIIlIIlIlI[1]];
        iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[26];
        if (lllllIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIlIlI[26], lIIlIIlIlI[12], lIIlIIlIlI[200]));
        "".length();
        iArr2 = new int[lIIlIIlIlI[1]];
        iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[201];
        if (lllllIIIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIIlIlI[1]];
        iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[20];
        if (lllllIIIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lllllIIIIlll(int i) {
        return i != 0;
    }

    private static boolean lllllIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void ct() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[1]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[3]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[162], lIIlIIlIlI[163], lIIlIIlIlI[111], lIIlIIlIlI[111], lIIlIIlIlI[10]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[164], lIIlIIlIlI[133], lIIlIIlIlI[64], lIIlIIlIlI[12], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[165], lIIlIIlIlI[139], lIIlIIlIlI[39], lIIlIIlIlI[53], lIIlIIlIlI[3]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[166], lIIlIIlIlI[134], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[167], lIIlIIlIlI[136], lIIlIIlIlI[70], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[168], lIIlIIlIlI[169], lIIlIIlIlI[54], lIIlIIlIlI[63], lIIlIIlIlI[3]);
        WorldPoint worldPoint = new WorldPoint(lIIlIIlIlI[170], lIIlIIlIlI[171], lIIlIIlIlI[0]);
        if (lllllIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllllIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIIIlIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIlIIlIlI[1]);
            "".length();
        }
        if (lllllIIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIlIIlIlI[1]);
                "".length();
            }
            if (lllllIIIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIlIlI[21])) {
                AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIlIIlIlI[1]];
                strArr[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[175]];
                TileObjects.getNearest(strArr).interact(lIIlIIlIII[lIIlIIlIlI[36]]);
                Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return 0 != 0 ? ((9 ^ 38) ^ (199 ^ 188)) & (((245 ^ 149) ^ (119 ^ 67)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                }, lIIlIIlIlI[104]);
                "".length();
                Time.sleepTicks(lIIlIIlIlI[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIlIIlIlI[1]];
        strArr2[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lllllIIIlIlI(nearest) && lllllIIIIlll(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[177]];
            System.out.println(lIIlIIlIII[lIIlIIlIlI[178]]);
            nearest.interact(lIIlIIlIII[lIIlIIlIlI[179]]);
            Time.sleepTicks(lIIlIIlIlI[10]);
            "".length();
        }
        if (lllllIIIlIIl(cu() ? 1 : 0)) {
            if (lllllIIIIlll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lllllIIIIlll(tileObject.getName().contains(lIIlIIlIII[lIIlIIlIlI[218]]) ? 1 : 0) && lllllIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[219], lIIlIIlIlI[220], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return " ".length() == ((101 ^ 28) ^ (19 ^ 110)) ? ((218 ^ 170) ^ (234 ^ 169)) & (((155 ^ 170) ^ "  ".length()) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest2)) {
                    int lIIIIIlIl = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[180]];
                    nearest2.interact(lIIlIIlIII[lIIlIIlIlI[79]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), lIIIIIlIl)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return ((240 ^ 172) & ((118 ^ 42) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lllllIIIIlll(tileObject2.getName().contains(lIIlIIlIII[lIIlIIlIlI[216]]) ? 1 : 0) && lllllIIIllll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[217], lIIlIIlIlI[128], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return " ".length() <= 0 ? ((220 ^ 139) ^ (6 ^ 114)) & (((110 ^ 60) ^ (90 ^ 43)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest3)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[181]];
                    int lIIIIIlIl2 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIlIIlIII[lIIlIIlIlI[182]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), lIIIIIlIl2)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return "  ".length() == 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lllllIIIIlll(tileObject3.getName().contains(lIIlIIlIII[lIIlIIlIlI[213]]) ? 1 : 0) && lllllIIIllll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[214], lIIlIIlIlI[215], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest4)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[183]];
                    int lIIIIIlIl3 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIlIIlIII[lIIlIIlIlI[184]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), lIIIIIlIl3)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (lllllIIIIlll(cu() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIlll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lllllIIIIlll(tileObject4.getName().contains(lIIlIIlIII[lIIlIIlIlI[211]]) ? 1 : 0) && lllllIIIllll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[212], lIIlIIlIlI[10])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest5)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[185]];
                    int lIIIIIlIl4 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIlIIlIII[lIIlIIlIlI[186]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), lIIIIIlIl4)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
            if (!lllllIIIIlll(cu() ? 1 : 0) && lllllIIIIlll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lllllIIIIlll(tileObject5.getName().contains(lIIlIIlIII[lIIlIIlIlI[208]]) ? 1 : 0) && lllllIIIllll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIlIIlIlI[209], lIIlIIlIlI[210], lIIlIIlIlI[3])), lIIlIIlIlI[3])) {
                        ?? r0 = lIIlIIlIlI[1];
                        "".length();
                        return 0 != 0 ? ((38 ^ 50) ^ (148 ^ 152)) & (((((135 + 101) - 57) + 1) ^ (((152 + 64) - 44) + 0)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIlIlI[0];
                });
                if (lllllIIIlIlI(nearest6)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[187]];
                    int lIIIIIlIl5 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIlIIlIII[lIIlIIlIlI[188]]);
                    Time.sleepTicks(C0004e.c(lIIlIIlIlI[1], lIIlIIlIlI[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllllIIIlIll(Skills.getExperience(Skill.AGILITY), lIIIIIlIl5)) {
                            ?? r0 = lIIlIIlIlI[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIlIlI[0];
                    }, lIIlIIlIlI[104]);
                    "".length();
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllllIIIlIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[2])) {
            ?? r0 = lIIlIIlIlI[1];
            "".length();
            return " ".length() < 0 ? ((((169 + 111) - 84) + 0) ^ (((42 + 91) - 121) + 131)) & (((15 ^ 96) ^ (47 ^ 11)) ^ (-" ".length())) : r0;
        }
        return lIIlIIlIlI[0];
    }

    static {
        lllllIIIIllI();
        lllllIIIIlIl();
        bv = new ArrayList();
        iw = lIIlIIlIlI[28];
        ix = lIIlIIlIlI[24];
        iz = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[0]);
        iA = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[1]);
        iB = new WorldArea(lIIlIIlIlI[235], lIIlIIlIlI[52], lIIlIIlIlI[69], lIIlIIlIlI[72], lIIlIIlIlI[3]);
        iC = new WorldPoint(lIIlIIlIlI[236], lIIlIIlIlI[237], lIIlIIlIlI[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean cu() {
        WorldArea worldArea = new WorldArea(lIIlIIlIlI[80], lIIlIIlIlI[81], lIIlIIlIlI[69], lIIlIIlIlI[64], lIIlIIlIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlIlI[82], lIIlIIlIlI[81], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea3 = new WorldArea(lIIlIIlIlI[83], lIIlIIlIlI[84], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[10]);
        WorldArea worldArea4 = new WorldArea(lIIlIIlIlI[189], lIIlIIlIlI[190], lIIlIIlIlI[25], lIIlIIlIlI[19], lIIlIIlIlI[1]);
        WorldArea worldArea5 = new WorldArea(lIIlIIlIlI[85], lIIlIIlIlI[87], lIIlIIlIlI[12], lIIlIIlIlI[25], lIIlIIlIlI[10]);
        WorldArea worldArea6 = new WorldArea(lIIlIIlIlI[191], lIIlIIlIlI[192], lIIlIIlIlI[73], lIIlIIlIlI[39], lIIlIIlIlI[10]);
        WorldArea worldArea7 = new WorldArea(lIIlIIlIlI[90], lIIlIIlIlI[91], lIIlIIlIlI[66], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea8 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[93], lIIlIIlIlI[23], lIIlIIlIlI[27], lIIlIIlIlI[10]);
        WorldArea worldArea9 = new WorldArea(lIIlIIlIlI[92], lIIlIIlIlI[94], lIIlIIlIlI[12], lIIlIIlIlI[23], lIIlIIlIlI[10]);
        WorldArea worldArea10 = new WorldArea(lIIlIIlIlI[127], lIIlIIlIlI[128], lIIlIIlIlI[49], lIIlIIlIlI[12], lIIlIIlIlI[3]);
        WorldArea worldArea11 = new WorldArea(lIIlIIlIlI[129], lIIlIIlIlI[127], lIIlIIlIlI[49], lIIlIIlIlI[25], lIIlIIlIlI[3]);
        WorldArea worldArea12 = new WorldArea(lIIlIIlIlI[130], lIIlIIlIlI[131], lIIlIIlIlI[63], lIIlIIlIlI[49], lIIlIIlIlI[3]);
        WorldArea worldArea13 = new WorldArea(lIIlIIlIlI[132], lIIlIIlIlI[133], lIIlIIlIlI[12], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea14 = new WorldArea(lIIlIIlIlI[134], lIIlIIlIlI[9], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea15 = new WorldArea(lIIlIIlIlI[135], lIIlIIlIlI[136], lIIlIIlIlI[68], lIIlIIlIlI[53], lIIlIIlIlI[10]);
        WorldArea worldArea16 = new WorldArea(lIIlIIlIlI[137], lIIlIIlIlI[138], lIIlIIlIlI[63], lIIlIIlIlI[64], lIIlIIlIlI[3]);
        WorldArea worldArea17 = new WorldArea(lIIlIIlIlI[164], lIIlIIlIlI[133], lIIlIIlIlI[64], lIIlIIlIlI[12], lIIlIIlIlI[10]);
        WorldArea worldArea18 = new WorldArea(lIIlIIlIlI[165], lIIlIIlIlI[139], lIIlIIlIlI[39], lIIlIIlIlI[53], lIIlIIlIlI[3]);
        WorldArea worldArea19 = new WorldArea(lIIlIIlIlI[166], lIIlIIlIlI[134], lIIlIIlIlI[49], lIIlIIlIlI[27], lIIlIIlIlI[3]);
        WorldArea worldArea20 = new WorldArea(lIIlIIlIlI[167], lIIlIIlIlI[136], lIIlIIlIlI[70], lIIlIIlIlI[64], lIIlIIlIlI[10]);
        WorldArea worldArea21 = new WorldArea(lIIlIIlIlI[168], lIIlIIlIlI[169], lIIlIIlIlI[54], lIIlIIlIlI[63], lIIlIIlIlI[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIIlIIlIlI[68]];
        worldAreaArr[lIIlIIlIlI[0]] = worldArea;
        worldAreaArr[lIIlIIlIlI[1]] = worldArea2;
        worldAreaArr[lIIlIIlIlI[3]] = worldArea3;
        worldAreaArr[lIIlIIlIlI[10]] = worldArea4;
        worldAreaArr[lIIlIIlIlI[17]] = worldArea5;
        worldAreaArr[lIIlIIlIlI[19]] = worldArea6;
        worldAreaArr[lIIlIIlIlI[21]] = worldArea7;
        worldAreaArr[lIIlIIlIlI[23]] = worldArea8;
        worldAreaArr[lIIlIIlIlI[25]] = worldArea9;
        worldAreaArr[lIIlIIlIlI[27]] = worldArea10;
        worldAreaArr[lIIlIIlIlI[12]] = worldArea11;
        worldAreaArr[lIIlIIlIlI[49]] = worldArea12;
        worldAreaArr[lIIlIIlIlI[63]] = worldArea13;
        worldAreaArr[lIIlIIlIlI[64]] = worldArea14;
        worldAreaArr[lIIlIIlIlI[53]] = worldArea15;
        worldAreaArr[lIIlIIlIlI[39]] = worldArea16;
        worldAreaArr[lIIlIIlIlI[65]] = worldArea17;
        worldAreaArr[lIIlIIlIlI[66]] = worldArea18;
        worldAreaArr[lIIlIIlIlI[54]] = worldArea19;
        worldAreaArr[lIIlIIlIlI[67]] = worldArea20;
        worldAreaArr[lIIlIIlIlI[41]] = worldArea21;
        int[] iArr = new int[lIIlIIlIlI[1]];
        iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[193];
        if (lllllIIIlIlI(TileItems.getNearest(iArr))) {
            System.out.println(lIIlIIlIII[lIIlIIlIlI[194]]);
            int i = lIIlIIlIlI[0];
            while (lllllIIIlIII(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIIlIIlIlI[1]];
                iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[193];
                if (lllllIIIIlll(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lllllIIIIlll(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIlIIlIlI[1];
                }
                i++;
                "".length();
                if (" ".length() < 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIlIIlIlI[0];
    }

    private static void lllllIIIIlIl() {
        lIIlIIlIII = new String[lIIlIIlIlI[238]];
        lIIlIIlIII[lIIlIIlIlI[0]] = llllIlllllll("S0uSsk8+swnLdQ0mslYX+w==", "KuIsH");
        lIIlIIlIII[lIIlIIlIlI[1]] = lllllIIIIIII("jvjRRWP4RI6KmWDKNC2bSRf1pDPWb/d7WktqQI+LKaLd3KTlUQwJ94Uq/RX73hhnD5sRbg+htDQ=", "ujRDy");
        lIIlIIlIII[lIIlIIlIlI[3]] = lllllIIIIIII("QX3dAC12mxcQTTvRNjTi1bx1DPst7wne", "VaGYr");
        lIIlIIlIII[lIIlIIlIlI[10]] = lllllIIIIIIl("BSojDCYkJSpIKCwlJgEkKg==", "MKMhJ");
        lIIlIIlIII[lIIlIIlIlI[17]] = lllllIIIIIII("WRF+mahKQEJYzchu5RGmtKJFE7hRLLiEBboabw8R/5iemCcUagxVoIM8kvNxvu7Bx6HYIuMf0T0=", "zjFmM");
        lIIlIIlIII[lIIlIIlIlI[19]] = llllIlllllll("/nqLKZXoIWA=", "ZGfAk");
        lIIlIIlIII[lIIlIIlIlI[21]] = lllllIIIIIII("E+uMt0xzskY=", "WDLDc");
        lIIlIIlIII[lIIlIIlIlI[23]] = lllllIIIIIIl("Fj8XJw==", "RMxWZ");
        lIIlIIlIII[lIIlIIlIlI[25]] = lllllIIIIIIl("IyEaKTE=", "gSsGZ");
        lIIlIIlIII[lIIlIIlIlI[27]] = llllIlllllll("Y9hFh+p0jQU=", "QbElM");
        lIIlIIlIII[lIIlIIlIlI[12]] = lllllIIIIIII("40nic8xh0BqXm2Pbwu6DWsppThUeb7Sm", "JFxFo");
        lIIlIIlIII[lIIlIIlIlI[49]] = lllllIIIIIIl("OxsGMB4RBw5jARcO", "xiiCm");
        lIIlIIlIII[lIIlIIlIlI[63]] = llllIlllllll("fXomBsXzCSokgK1VQxK1JA==", "vblzZ");
        lIIlIIlIII[lIIlIIlIlI[64]] = lllllIIIIIII("X8/Wv6IGmI/Ja4hkm30sGg==", "EMhQu");
        lIIlIIlIII[lIIlIIlIlI[53]] = lllllIIIIIIl("MQgaAjYbChRPOhcQ", "rdsoT");
        lIIlIIlIII[lIIlIIlIlI[39]] = lllllIIIIIIl("HTQYNw0xOg5jAjci", "RVkCl");
        lIIlIIlIII[lIIlIIlIlI[65]] = llllIlllllll("dOJdwoFbJBo9NfG93NWmjw==", "fAuON");
        lIIlIIlIII[lIIlIIlIlI[66]] = lllllIIIIIIl("ECkNPzI6KwNyMiEkCjE4", "SEdRP");
        lIIlIIlIII[lIIlIIlIlI[54]] = lllllIIIIIII("RzXpX31SlNJRX50xbnH5/Q==", "hrNLR");
        lIIlIIlIII[lIIlIIlIlI[67]] = llllIlllllll("ZBgUwVis1vs=", "KFvIA");
        lIIlIIlIII[lIIlIIlIlI[41]] = llllIlllllll("B4Yx9MQskWu7oN17933ApQ==", "hBKza");
        lIIlIIlIII[lIIlIIlIlI[68]] = lllllIIIIIII("+FDIwErcpVHwM9JGxYP17Q==", "prAxp");
        lIIlIIlIII[lIIlIIlIlI[61]] = llllIlllllll("E/P5urIbnG0=", "QSVrR");
        lIIlIIlIII[lIIlIIlIlI[69]] = lllllIIIIIII("Ud3bqz7s2DDMHnEUu4/Fgg==", "zDbUL");
        lIIlIIlIII[lIIlIIlIlI[70]] = lllllIIIIIIl("HBkHK24qGQMgLSA=", "HkbNN");
        lIIlIIlIII[lIIlIIlIlI[42]] = lllllIIIIIII("FH0zbKsx2s6TBAzo1rwdCA==", "ECqmH");
        lIIlIIlIII[lIIlIIlIlI[71]] = lllllIIIIIIl("GgguPhEwCiBzHTwQ", "YdGSs");
        lIIlIIlIII[lIIlIIlIlI[72]] = lllllIIIIIII("KUOJuoD953lyfclTZQO/VA==", "pTMTi");
        lIIlIIlIII[lIIlIIlIlI[73]] = lllllIIIIIII("52EQBCM1ETaX8Y7+XnieiA==", "TuFKi");
        lIIlIIlIII[lIIlIIlIlI[74]] = llllIlllllll("0Jwzt+Nuufz2Nu3JAkCBuw==", "RCpzE");
        lIIlIIlIII[lIIlIIlIlI[2]] = lllllIIIIIIl("IDAGBTEMPhBRIAYiEA==", "oRuqP");
        lIIlIIlIII[lIIlIIlIlI[75]] = lllllIIIIIII("Y3pATuY2kY2fqVQXhMHi8g==", "lttMM");
        lIIlIIlIII[lIIlIIlIlI[95]] = lllllIIIIIII("nZ/ECKeKVE5WaRFN948t3Q==", "gJzJa");
        lIIlIIlIII[lIIlIIlIlI[97]] = lllllIIIIIII("hMVkQXg+wseV+8UwppOz/Q==", "IYFVy");
        lIIlIIlIII[lIIlIIlIlI[98]] = lllllIIIIIIl("PygCOj0MaQQyIQA=", "kIiSS");
        lIIlIIlIII[lIIlIIlIlI[99]] = lllllIIIIIII("ReHxHj1rzQs9v4BPTaj7tF/DRYk7YVAW", "HzLgQ");
        lIIlIIlIII[lIIlIIlIlI[100]] = lllllIIIIIIl("Fi8YMw==", "BNsVe");
        lIIlIIlIII[lIIlIIlIlI[101]] = llllIlllllll("6yO2rn+0VgTVAFjSlvj9/w==", "YGeYw");
        lIIlIIlIII[lIIlIIlIlI[102]] = lllllIIIIIII("WBJ/bL+9fUCrsvc6rXuMIQ==", "YkcfW");
        lIIlIIlIII[lIIlIIlIlI[103]] = lllllIIIIIII("aI6qS0IR1Fo=", "Pjkxk");
        lIIlIIlIII[lIIlIIlIlI[38]] = lllllIIIIIII("+mNoKFGGE59H+zDyfbVyeJ92NpXCqHf2", "LJGWF");
        lIIlIIlIII[lIIlIIlIlI[105]] = lllllIIIIIIl("Fi4uLCEwMWE0IDsn", "UBAXI");
        lIIlIIlIII[lIIlIIlIlI[106]] = llllIlllllll("ZNndARbqu2M=", "BPRKt");
        lIIlIIlIII[lIIlIIlIlI[107]] = lllllIIIIIII("ZJswP0iDQRs=", "BueMk");
        lIIlIIlIII[lIIlIIlIlI[108]] = lllllIIIIIIl("KzUX", "lTgHF");
        lIIlIIlIII[lIIlIIlIlI[109]] = lllllIIIIIII("mQ04yV/Qu0M=", "rQfnC");
        lIIlIIlIII[lIIlIIlIlI[110]] = lllllIIIIIIl("LiUJGwIPLQsd", "lDezl");
        lIIlIIlIII[lIIlIIlIlI[111]] = llllIlllllll("symWsVeHP60=", "WiBoN");
        lIIlIIlIII[lIIlIIlIlI[112]] = llllIlllllll("u/FiNMi8LaM=", "eQSSz");
        lIIlIIlIII[lIIlIIlIlI[113]] = llllIlllllll("Qik92t2bJmlI9YqqhA3U0w==", "qtrGJ");
        lIIlIIlIII[lIIlIIlIlI[40]] = lllllIIIIIII("FUqzXRimFn4=", "AwVbu");
        lIIlIIlIII[lIIlIIlIlI[7]] = lllllIIIIIII("enaZyQHbdl0=", "zAVGj");
        lIIlIIlIII[lIIlIIlIlI[114]] = lllllIIIIIIl("JAA4Ig0AEnU1BR5VZw==", "nuURd");
        lIIlIIlIII[lIIlIIlIlI[116]] = lllllIIIIIIl("FCQPBg==", "XAnvF");
        lIIlIIlIII[lIIlIIlIlI[117]] = lllllIIIIIIl("JzYVIC4DJFg3Jh1jSw==", "mCxPG");
        lIIlIIlIII[lIIlIIlIlI[119]] = llllIlllllll("AttXqE4u97g=", "amGCN");
        lIIlIIlIII[lIIlIIlIlI[120]] = lllllIIIIIIl("EDAQHSY9ZRAWJT4=", "XEbyJ");
        lIIlIIlIII[lIIlIIlIlI[122]] = lllllIIIIIII("iei3HifNIbI=", "bVqsX");
        lIIlIIlIII[lIIlIIlIlI[123]] = lllllIIIIIII("YF/XYCH6IS0HxS/Os9HKCfVT3tvO/Zvs", "YgDjY");
        lIIlIIlIII[lIIlIIlIlI[124]] = lllllIIIIIII("8WuyDT2/Fx4=", "ZNKjP");
        lIIlIIlIII[lIIlIIlIlI[44]] = llllIlllllll("HK7g62hqaZe+6Acbg4gqJQ==", "xjjDn");
        lIIlIIlIII[lIIlIIlIlI[140]] = lllllIIIIIII("ZA8rJ3iF+fVxR3Po1hAcEKZO4/gz753h", "mTuAm");
        lIIlIIlIII[lIIlIIlIlI[6]] = lllllIIIIIIl("KDcdaBsJdhg8DhQi", "fVkHo");
        lIIlIIlIII[lIIlIIlIlI[141]] = lllllIIIIIIl("CQYrHh0zHC1MCjUHOB8M", "ZrJli");
        lIIlIIlIII[lIIlIIlIlI[142]] = lllllIIIIIII("qjdDvOWLGD7gQwn0peA/xA==", "BfpFX");
        lIIlIIlIII[lIIlIIlIlI[143]] = lllllIIIIIIl("EwEZGjY=", "PmpwT");
        lIIlIIlIII[lIIlIIlIlI[144]] = lllllIIIIIII("fbNYTAcFTMLNX2zOUBw/OA==", "oOcBn");
        lIIlIIlIII[lIIlIIlIlI[145]] = lllllIIIIIIl("PxUmMwQMVCA7GAA=", "ktMZj");
        lIIlIIlIII[lIIlIIlIlI[146]] = lllllIIIIIII("c5t5yN8SZN/WOXFb5ZX4HOlfnSaJ5gJ0", "PuIBC");
        lIIlIIlIII[lIIlIIlIlI[147]] = lllllIIIIIII("aJ5omzzVNCI=", "CBeUv");
        lIIlIIlIII[lIIlIIlIlI[148]] = llllIlllllll("VVWsKgpQ/6MiCHETEN3soQ==", "GNwQy");
        lIIlIIlIII[lIIlIIlIlI[149]] = lllllIIIIIII("4mvEyndp9jY=", "jLIbX");
        lIIlIIlIII[lIIlIIlIlI[150]] = lllllIIIIIII("VI9HsGJdVxgMvIRXKbxcHA==", "FqRtM");
        lIIlIIlIII[lIIlIIlIlI[151]] = lllllIIIIIII("w+ARABoE8lc=", "JSBKV");
        lIIlIIlIII[lIIlIIlIlI[152]] = lllllIIIIIII("2Esv8SB5BVo7q5aajAOS9w==", "CRhZF");
        lIIlIIlIII[lIIlIIlIlI[153]] = lllllIIIIIII("V7ydAkTTnbQ=", "DgGXU");
        lIIlIIlIII[lIIlIIlIlI[154]] = llllIlllllll("0XIlFQSnPUmeW2u8qKMpVw==", "siRtM");
        lIIlIIlIII[lIIlIIlIlI[155]] = lllllIIIIIII("K31aLEaTKVM=", "fTBLS");
        lIIlIIlIII[lIIlIIlIlI[156]] = llllIlllllll("Af7n6GYbZStScjnq+o+6HA==", "eddrP");
        lIIlIIlIII[lIIlIIlIlI[157]] = llllIlllllll("qVB+SrHoQrc=", "UNoNe");
        lIIlIIlIII[lIIlIIlIlI[158]] = lllllIIIIIIl("JwQ8IBoDFnE3Eh1RZA==", "mqQPs");
        lIIlIIlIII[lIIlIIlIlI[159]] = lllllIIIIIII("iFntkwiZ92o=", "ADWiW");
        lIIlIIlIII[lIIlIIlIlI[160]] = lllllIIIIIIl("DBobBSAoCFYSKDZPQA==", "FovuI");
        lIIlIIlIII[lIIlIIlIlI[161]] = lllllIIIIIII("OWxBdlt/MXk=", "EySPY");
        lIIlIIlIII[lIIlIIlIlI[172]] = llllIlllllll("5OzRg/98tNUevJ4NSyGgTPQIzBo1Tsk9", "DzHyf");
        lIIlIIlIII[lIIlIIlIlI[173]] = lllllIIIIIII("gr1FmQZJ07uPhfir4lw1PA==", "fFOHp");
        lIIlIIlIII[lIIlIIlIlI[174]] = lllllIIIIIIl("ABIUHhI6CBJMBTwTBx8D", "Sfulf");
        lIIlIIlIII[lIIlIIlIlI[175]] = lllllIIIIIII("TCfQ9eHLXBY=", "aNbwp");
        lIIlIIlIII[lIIlIIlIlI[36]] = llllIlllllll("SHm93+Ye/Kh3TlbdBCxX0A==", "xapux");
        lIIlIIlIII[lIIlIIlIlI[176]] = llllIlllllll("B6hU2juOg7Ry4TruiMQp+Q==", "eBkZb");
        lIIlIIlIII[lIIlIIlIlI[177]] = lllllIIIIIII("rBFVAi15m715RoBALhz5fw==", "XrquW");
        lIIlIIlIII[lIIlIIlIlI[178]] = lllllIIIIIII("w7421rRzrPGicLQclKBK8tzSNxDAWMoH", "ZwFgg");
        lIIlIIlIII[lIIlIIlIlI[179]] = lllllIIIIIIl("FxgvCg==", "CyDol");
        lIIlIIlIII[lIIlIIlIlI[180]] = lllllIIIIIII("jkMsK9wtbSAe8E5VaaN3aQ==", "pJRQK");
        lIIlIIlIII[lIIlIIlIlI[79]] = lllllIIIIIIl("GSYjOA==", "SSNHE");
        lIIlIIlIII[lIIlIIlIlI[181]] = llllIlllllll("y6TyuEy7oQxGSB2P6BHtzw==", "BFkbD");
        lIIlIIlIII[lIIlIIlIlI[182]] = lllllIIIIIII("O1uGnD7z7G0=", "ZSDQK");
        lIIlIIlIII[lIIlIIlIlI[183]] = llllIlllllll("U02OU9klJs+wRBVELjhcQg==", "SvUnJ");
        lIIlIIlIII[lIIlIIlIlI[184]] = lllllIIIIIII("THom7DpaXJo=", "kZVRf");
        lIIlIIlIII[lIIlIIlIlI[185]] = lllllIIIIIII("L8QRvbgEPFGjIzuq3Il+3g==", "lcTAA");
        lIIlIIlIII[lIIlIIlIlI[186]] = lllllIIIIIII("Ak6sueWlGtY=", "xNEIk");
        lIIlIIlIII[lIIlIIlIlI[187]] = lllllIIIIIII("zyguadq7Ll7B4WgPMnl0Vg==", "Auhdi");
        lIIlIIlIII[lIIlIIlIlI[188]] = lllllIIIIIII("Xih+8Xh10F4=", "UHLiQ");
        lIIlIIlIII[lIIlIIlIlI[194]] = lllllIIIIIII("mZZfPXrFB3oJi9qCahGHUodw+w9BR8uy", "rXkik");
        lIIlIIlIII[lIIlIIlIlI[203]] = lllllIIIIIII("tUZURxRY1uY=", "xndoV");
        lIIlIIlIII[lIIlIIlIlI[204]] = lllllIIIIIIl("OQIaODguBg==", "IciKY");
        lIIlIIlIII[lIIlIIlIlI[205]] = lllllIIIIIII("3HbVYb4W0os=", "IcGri");
        lIIlIIlIII[lIIlIIlIlI[206]] = lllllIIIIIIl("ASQVCyYWIA==", "qEfxG");
        lIIlIIlIII[lIIlIIlIlI[207]] = lllllIIIIIIl("HCs1IRULLw==", "lJFRt");
        lIIlIIlIII[lIIlIIlIlI[208]] = llllIlllllll("8U/kb1GxvuY=", "PrzDD");
        lIIlIIlIII[lIIlIIlIlI[211]] = llllIlllllll("gD4vDSkIe8c=", "lsKIq");
        lIIlIIlIII[lIIlIIlIlI[213]] = llllIlllllll("q+g331+L+7s=", "TnnXR");
        lIIlIIlIII[lIIlIIlIlI[216]] = llllIlllllll("gTgw6CweJvgu9nHHIhSGvw==", "Bhprf");
        lIIlIIlIII[lIIlIIlIlI[218]] = lllllIIIIIII("1fXiUOqTPs8=", "AbEEX");
        lIIlIIlIII[lIIlIIlIlI[221]] = llllIlllllll("6aIay/ttUDw=", "BiGgX");
        lIIlIIlIII[lIIlIIlIlI[224]] = llllIlllllll("Aj8fojIG5RA=", "YwBYK");
        lIIlIIlIII[lIIlIIlIlI[226]] = lllllIIIIIII("mtHBHCPCaPOpTCI+IFScVA==", "XfKdP");
        lIIlIIlIII[lIIlIIlIlI[227]] = lllllIIIIIII("sexIAGZJDXY=", "UGmoo");
        lIIlIIlIII[lIIlIIlIlI[230]] = lllllIIIIIII("Q3SfhMtyjXE=", "tBxKe");
        lIIlIIlIII[lIIlIIlIlI[232]] = lllllIIIIIIl("MSw1", "vMEVt");
        lIIlIIlIII[lIIlIIlIlI[233]] = llllIlllllll("gQkVZdhYHEo=", "EJxUO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cp() {
        if (lllllIIIIlll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[0]];
            C0001b.a(bv);
            if (lllllIIIlIII(bv.size(), lIIlIIlIlI[1])) {
                System.out.println(lIIlIIlIII[lIIlIIlIlI[1]]);
                bt = lIIlIIlIlI[0];
            }
        }
        if (lllllIIIlIIl(bt ? 1 : 0) && lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[2])) {
            if (lllllIIIlIIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIIIlIlI(nearest) && lllllIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[3]];
                    if (lllllIIIIlll(new WorldArea(lIIlIIlIlI[4], lIIlIIlIlI[5], lIIlIIlIlI[6], lIIlIIlIlI[7], lIIlIIlIlI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIlIIlIlI[8], lIIlIIlIlI[9], lIIlIIlIlI[0]);
                        if (lllllIIIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIlIlI[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlIIlIlI[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lllllIIIlIlI(nearest) && lllllIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIlIII[lIIlIIlIlI[10]];
                    if (lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIlIlI[11]);
                        "".length();
                    }
                    if (lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lllllIIIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIlIlI[1]);
                            "".length();
                        }
                        if (lllllIIIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIlIlI[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIlIIlIlI[12]];
                    iArr[lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                    iArr[lIIlIIlIlI[1]] = lIIlIIlIlI[14];
                    iArr[lIIlIIlIlI[3]] = lIIlIIlIlI[15];
                    iArr[lIIlIIlIlI[10]] = lIIlIIlIlI[16];
                    iArr[lIIlIIlIlI[17]] = lIIlIIlIlI[18];
                    iArr[lIIlIIlIlI[19]] = lIIlIIlIlI[20];
                    iArr[lIIlIIlIlI[21]] = lIIlIIlIlI[22];
                    iArr[lIIlIIlIlI[23]] = lIIlIIlIlI[24];
                    iArr[lIIlIIlIlI[25]] = lIIlIIlIlI[26];
                    iArr[lIIlIIlIlI[27]] = lIIlIIlIlI[28];
                    if (lllllIIIlIIl(C0004e.b(iArr) ? 1 : 0)) {
                        af();
                        System.out.println(lIIlIIlIII[lIIlIIlIlI[17]]);
                        bt = lIIlIIlIlI[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIlIIlIlI[12]];
                    iArr2[lIIlIIlIlI[0]] = lIIlIIlIlI[13];
                    iArr2[lIIlIIlIlI[1]] = lIIlIIlIlI[14];
                    iArr2[lIIlIIlIlI[3]] = lIIlIIlIlI[15];
                    iArr2[lIIlIIlIlI[10]] = lIIlIIlIlI[16];
                    iArr2[lIIlIIlIlI[17]] = lIIlIIlIlI[18];
                    iArr2[lIIlIIlIlI[19]] = lIIlIIlIlI[20];
                    iArr2[lIIlIIlIlI[21]] = lIIlIIlIlI[22];
                    iArr2[lIIlIIlIlI[23]] = lIIlIIlIlI[24];
                    iArr2[lIIlIIlIlI[25]] = lIIlIIlIlI[26];
                    iArr2[lIIlIIlIlI[27]] = lIIlIIlIlI[28];
                    if (lllllIIIIlll(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIlIIlIlI[29], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[30], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[31], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[32], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[33], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[34], lIIlIIlIlI[1]);
                        C0000a.a(lIIlIIlIlI[35], lIIlIIlIlI[1]);
                        int[] iArr3 = new int[lIIlIIlIlI[1]];
                        iArr3[lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                        if (lllllIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIIlIlI[1]];
                            iArr4[lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                            if (lllllIIIlIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIlIIlIlI[1]];
                                iArr5[lIIlIIlIlI[0]] = lIIlIIlIlI[29];
                                if (lllllIIIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIlIIlIlI[36], lIIlIIlIlI[1]);
                                }
                            }
                        }
                        C0000a.a(lIIlIIlIlI[18], lIIlIIlIlI[1]);
                        C0004e.l(lIIlIIlIlI[29]);
                        C0004e.l(lIIlIIlIlI[30]);
                        C0004e.l(lIIlIIlIlI[31]);
                        C0004e.l(lIIlIIlIlI[32]);
                        C0004e.l(lIIlIIlIlI[33]);
                        Time.sleepTicks(lIIlIIlIlI[1]);
                        "".length();
                        C0004e.l(lIIlIIlIlI[35]);
                        C0004e.l(lIIlIIlIlI[37]);
                        C0004e.l(lIIlIIlIlI[34]);
                        C0004e.l(lIIlIIlIlI[36]);
                        C0004e.l(lIIlIIlIlI[18]);
                        Time.sleepTicks(lIIlIIlIlI[10]);
                        "".length();
                        if (lllllIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIlIIlIlI[21]);
                            "".length();
                        }
                        if (lllllIIIIlll(Bank.isOpen() ? 1 : 0)) {
                            if (lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[38])) {
                                C0000a.a(lIIlIIlIlI[13], lIIlIIlIlI[12]);
                                C0000a.a(lIIlIIlIlI[14], lIIlIIlIlI[12]);
                                C0000a.a(lIIlIIlIlI[22], lIIlIIlIlI[12]);
                                C0000a.a(lIIlIIlIlI[15], lIIlIIlIlI[12]);
                                C0000a.b(C0005f.bf, lIIlIIlIlI[1]);
                                C0000a.a(lIIlIIlIlI[28], lIIlIIlIlI[1]);
                                C0000a.a(lIIlIIlIlI[20], lIIlIIlIlI[19]);
                                C0000a.a(lIIlIIlIlI[24], lIIlIIlIlI[39]);
                            }
                            if (lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[38])) {
                                C0000a.a(lIIlIIlIlI[13], lIIlIIlIlI[12]);
                                C0000a.a(lIIlIIlIlI[22], lIIlIIlIlI[12]);
                                C0000a.a(lIIlIIlIlI[26], lIIlIIlIlI[12]);
                                C0000a.b(C0005f.bf, lIIlIIlIlI[1]);
                                C0000a.a(lIIlIIlIlI[28], lIIlIIlIlI[1]);
                                C0000a.a(lIIlIIlIlI[20], lIIlIIlIlI[25]);
                                C0000a.a(lIIlIIlIlI[24], lIIlIIlIlI[12]);
                            }
                        }
                    }
                }
            }
            if (lllllIIIIlll(ab() ? 1 : 0)) {
                String[] strArr = new String[lIIlIIlIlI[1]];
                strArr[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[19]];
                if (lllllIIIIlll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIIlIlI[1]];
                    strArr2[lIIlIIlIlI[0]] = lIIlIIlIII[lIIlIIlIlI[21]];
                    Inventory.getFirst(strArr2).interact(lIIlIIlIII[lIIlIIlIlI[23]]);
                }
                if (lllllIIIIlll(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllIIIlIII(Movement.getRunEnergy(), lIIlIIlIlI[40])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlIIlIII[lIIlIIlIlI[25]]);
                    Time.sleepTicks(lIIlIIlIlI[1]);
                    "".length();
                }
                if (lllllIIIlIll(Combat.getMissingHealth(), lIIlIIlIlI[41])) {
                    int[] iArr6 = new int[lIIlIIlIlI[1]];
                    iArr6[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                    if (lllllIIIIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIIlIlI[1]];
                        iArr7[lIIlIIlIlI[0]] = lIIlIIlIlI[24];
                        Inventory.getFirst(iArr7).interact(lIIlIIlIII[lIIlIIlIlI[27]]);
                        Time.sleepTicks(lIIlIIlIlI[3]);
                        "".length();
                    }
                }
                if (lllllIIIlIll(Movement.getRunEnergy(), lIIlIIlIlI[42]) && lllllIIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[2])) {
                    cq();
                }
                if ((!lllllIIIllIl(C0004e.j(lIIlIIlIlI[43]), lIIlIIlIlI[44]) || lllllIIIlIII(C0004e.j(lIIlIIlIlI[45]), lIIlIIlIlI[19])) && lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[2]) && lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[44])) {
                    cr();
                }
                if (lllllIIIllIl(C0004e.j(lIIlIIlIlI[43]), lIIlIIlIlI[44]) && lllllIIIllIl(C0004e.j(lIIlIIlIlI[45]), lIIlIIlIlI[19])) {
                    if (lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[2]) && lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[38])) {
                        cr();
                    }
                    if (lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[38]) && lllllIIIlIII(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[44])) {
                        cs();
                    }
                }
                if (lllllIIIllIl(Skills.getLevel(Skill.AGILITY), lIIlIIlIlI[44])) {
                    ct();
                }
            }
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cp();
            "".length();
            if ((((93 ^ 115) ^ (163 ^ 182)) & (((117 ^ 39) ^ (62 ^ 87)) ^ (-" ".length()))) > 0) {
                return ((147 ^ 181) ^ (144 ^ 167)) & (((((82 + 19) - (-53)) + 34) ^ (((4 + 139) - 88) + 118)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIlIlI[186];
    }

    private static boolean lllllIIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lllllIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIIIllII(int i) {
        return i > 0;
    }

    private static String lllllIIIIIIl(String llIlIII, String llIIlll) {
        String llIlIII2 = new String(Base64.getDecoder().decode(llIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllI = new StringBuilder();
        char[] charArray = llIIlll.toCharArray();
        int llIIlII = lIIlIIlIlI[0];
        char[] charArray2 = llIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIlIlI[0];
        while (lllllIIIlIII(i, length)) {
            char llIlIIl = charArray2[i];
            llIIllI.append((char) (llIlIIl ^ charArray[llIIlII % charArray.length]));
            "".length();
            llIIlII++;
            i++;
            "".length();
            if ((123 ^ 127) < ((185 ^ 169) & ((179 ^ 163) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llIIllI);
    }

    private static boolean lllllIIIlIll(int i, int i2) {
        return i > i2;
    }

    private static String llllIlllllll(String lIIIIIll, String lIIIIlII) {
        try {
            SecretKeySpec lIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlIlI[3], lIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIllI) {
            lIIIIllI.printStackTrace();
            return null;
        }
    }

    private static void lllllIIIIllI() {
        lIIlIIlIlI = new int[239];
        lIIlIIlIlI[0] = ((((226 + 144) - 279) + 143) ^ (((51 + 129) - 24) + 15)) & (((227 ^ 165) ^ (105 ^ 110)) ^ (-" ".length()));
        lIIlIIlIlI[1] = " ".length();
        lIIlIIlIlI[2] = 220 ^ 194;
        lIIlIIlIlI[3] = "  ".length();
        lIIlIIlIlI[4] = (-((-5323) & 13531)) & (-97) & 11767;
        lIIlIIlIlI[5] = (-24699) & 28159;
        lIIlIIlIlI[6] = (221 ^ 153) ^ (219 ^ 161);
        lIIlIIlIlI[7] = 41 ^ 26;
        lIIlIIlIlI[8] = (-8196) & 11707;
        lIIlIIlIlI[9] = (-(97 ^ 6)) & (-1) & 3582;
        lIIlIIlIlI[10] = "   ".length();
        lIIlIIlIlI[11] = (-(27 ^ 127)) & (-11281) & 16379;
        lIIlIIlIlI[12] = 89 ^ 83;
        lIIlIIlIlI[13] = (-((-6677) & 31285)) & (-1) & 32615;
        lIIlIIlIlI[14] = (-((-23825) & 32179)) & (-16386) & 32747;
        lIIlIIlIlI[15] = (-(11 ^ 62)) & (-24705) & 32765;
        lIIlIIlIlI[16] = (-4257) & 8109;
        lIIlIIlIlI[17] = 167 ^ 163;
        lIIlIIlIlI[18] = (-((-2753) & 23524)) & (-1) & 32751;
        lIIlIIlIlI[19] = 104 ^ 109;
        lIIlIIlIlI[20] = (-((-8513) & 12271)) & (-16385) & 32767;
        lIIlIIlIlI[21] = 112 ^ 118;
        lIIlIIlIlI[22] = (-((-2857) & 11178)) & (-16385) & 32715;
        lIIlIIlIlI[23] = 78 ^ 73;
        lIIlIIlIlI[24] = (-((-4773) & 13031)) & (-3645) & 12287;
        lIIlIIlIlI[25] = (120 ^ 69) ^ (63 ^ 10);
        lIIlIIlIlI[26] = (-((-8589) & 13213)) & (-9) & 24251;
        lIIlIIlIlI[27] = (((32 + 143) - 31) + 14) ^ (((105 + 49) - 135) + 132);
        lIIlIIlIlI[28] = (-2081) & 23226;
        lIIlIIlIlI[29] = (-16681) & 28540;
        lIIlIIlIlI[30] = (-((-16721) & 20991)) & (-16642) & 32767;
        lIIlIIlIlI[31] = (-((-3338) & 23963)) & (-33) & 32511;
        lIIlIIlIlI[32] = (-20628) & 32479;
        lIIlIIlIlI[33] = (-"  ".length()) & (-397) & 12255;
        lIIlIIlIlI[34] = (-((-4106) & 20543)) & (-4225) & 32511;
        lIIlIIlIlI[35] = (-(16 ^ 46)) & (-1) & 12029;
        lIIlIIlIlI[36] = 249 ^ 161;
        lIIlIIlIlI[37] = (-((-771) & 5079)) & (-8225) & 32767;
        lIIlIIlIlI[38] = 2 ^ 42;
        lIIlIIlIlI[39] = 153 ^ 150;
        lIIlIIlIlI[40] = (36 ^ 4) ^ (210 ^ 192);
        lIIlIIlIlI[41] = (85 ^ 37) ^ (17 ^ 117);
        lIIlIIlIlI[42] = (107 ^ 26) ^ (121 ^ 17);
        lIIlIIlIlI[43] = (-19473) & 19774;
        lIIlIIlIlI[44] = (((89 + 41) - 47) + 165) ^ (((191 + 43) - 193) + 155);
        lIIlIIlIlI[45] = (-16901) & 17207;
        lIIlIIlIlI[46] = (-((-4385) & 14203)) & (-16385) & 28671;
        lIIlIIlIlI[47] = (-5) & 3439;
        lIIlIIlIlI[48] = (-((-11053) & 31549)) & (-8714) & 32633;
        lIIlIIlIlI[49] = 181 ^ 190;
        lIIlIIlIlI[50] = (-((-2317) & 31151)) & (-1) & 32255;
        lIIlIIlIlI[51] = (-29187) & 31651;
        lIIlIIlIlI[52] = (-((-7383) & 7895)) & (-8201) & 12127;
        lIIlIIlIlI[53] = 20 ^ 26;
        lIIlIIlIlI[54] = 90 ^ 72;
        lIIlIIlIlI[55] = (-((-6913) & 16129)) & (-21005) & 32703;
        lIIlIIlIlI[56] = (-12322) & 15737;
        lIIlIIlIlI[57] = (-((-16401) & 26198)) & (-4097) & 16375;
        lIIlIIlIlI[58] = (-16897) & 20313;
        lIIlIIlIlI[59] = (-30283) & 32763;
        lIIlIIlIlI[60] = (-(((26 + 20) - (-57)) + 54)) & (-20993) & 24575;
        lIIlIIlIlI[61] = 20 ^ 2;
        lIIlIIlIlI[62] = -" ".length();
        lIIlIIlIlI[63] = 32 ^ 44;
        lIIlIIlIlI[64] = (102 ^ 126) ^ (89 ^ 76);
        lIIlIIlIlI[65] = (124 ^ 42) ^ (63 ^ 121);
        lIIlIIlIlI[66] = 151 ^ 134;
        lIIlIIlIlI[67] = 136 ^ 155;
        lIIlIIlIlI[68] = 184 ^ 173;
        lIIlIIlIlI[69] = (((14 + 89) - (-21)) + 44) ^ (((174 + 123) - 248) + 142);
        lIIlIIlIlI[70] = 177 ^ 169;
        lIIlIIlIlI[71] = (56 ^ 16) ^ (247 ^ 197);
        lIIlIIlIlI[72] = 136 ^ 147;
        lIIlIIlIlI[73] = (((98 + 98) - 91) + 34) ^ (((102 + 9) - 17) + 57);
        lIIlIIlIlI[74] = 54 ^ 43;
        lIIlIIlIlI[75] = 19 ^ 12;
        lIIlIIlIlI[76] = (-13185) & 16351;
        lIIlIIlIlI[77] = (-((-10310) & 15079)) & (-73) & 8191;
        lIIlIIlIlI[78] = ((57 + 104) - 126) + 102;
        lIIlIIlIlI[79] = 119 ^ 41;
        lIIlIIlIlI[80] = (-257) & 3475;
        lIIlIIlIlI[81] = (-16391) & 19799;
        lIIlIIlIlI[82] = (-25361) & 28572;
        lIIlIIlIlI[83] = (-((-24645) & 29509)) & (-16385) & 24446;
        lIIlIIlIlI[84] = (-((-11394) & 27819)) & (-3) & 19839;
        lIIlIIlIlI[85] = (-513) & 3702;
        lIIlIIlIlI[86] = (-29219) & 32631;
        lIIlIIlIlI[87] = (-17061) & 20461;
        lIIlIIlIlI[88] = (-((-9289) & 30541)) & (-1) & 24431;
        lIIlIIlIlI[89] = (-((-23670) & 32511)) & (-20481) & 32703;
        lIIlIIlIlI[90] = (-17165) & 20381;
        lIIlIIlIlI[91] = (-28861) & 32252;
        lIIlIIlIlI[92] = (-25429) & 28662;
        lIIlIIlIlI[93] = (-16533) & 19934;
        lIIlIIlIlI[94] = (-((-347) & 4575)) & (-521) & 8158;
        lIIlIIlIlI[95] = (((26 + 86) - (-11)) + 57) ^ (((95 + 107) - 86) + 32);
        lIIlIIlIlI[96] = (-12644) & 15867;
        lIIlIIlIlI[97] = 65 ^ 96;
        lIIlIIlIlI[98] = (36 ^ 80) ^ (214 ^ 128);
        lIIlIIlIlI[99] = 79 ^ 108;
        lIIlIIlIlI[100] = (((104 + 24) - 8) + 18) ^ (((40 + 3) - (-2)) + 129);
        lIIlIIlIlI[101] = 148 ^ 177;
        lIIlIIlIlI[102] = (((113 + 32) - 69) + 100) ^ (((100 + 10) - (-8)) + 32);
        lIIlIIlIlI[103] = 135 ^ 160;
        lIIlIIlIlI[104] = (-19458) & 27957;
        lIIlIIlIlI[105] = (((98 + 48) - (-17)) + 74) ^ (((0 + 154) - 14) + 56);
        lIIlIIlIlI[106] = 16 ^ 58;
        lIIlIIlIlI[107] = (3 ^ 38) ^ (19 ^ 29);
        lIIlIIlIlI[108] = 22 ^ 58;
        lIIlIIlIlI[109] = (((159 + 178) - 234) + 83) ^ (((123 + 103) - 98) + 23);
        lIIlIIlIlI[110] = 110 ^ 64;
        lIIlIIlIlI[111] = (38 ^ 34) ^ (97 ^ 74);
        lIIlIIlIlI[112] = 184 ^ 136;
        lIIlIIlIlI[113] = (((149 + 27) - 71) + 56) ^ (((87 + 133) - 167) + 91);
        lIIlIIlIlI[114] = 37 ^ 17;
        lIIlIIlIlI[115] = (-((-2627) & 20047)) & (-2) & 32255;
        lIIlIIlIlI[116] = 140 ^ 185;
        lIIlIIlIlI[117] = 31 ^ 41;
        lIIlIIlIlI[118] = (-16901) & 31735;
        lIIlIIlIlI[119] = 66 ^ 117;
        lIIlIIlIlI[120] = (71 ^ 64) ^ (177 ^ 142);
        lIIlIIlIlI[121] = (-((-13977) & 30363)) & (-521) & 31742;
        lIIlIIlIlI[122] = 186 ^ 131;
        lIIlIIlIlI[123] = 3 ^ 57;
        lIIlIIlIlI[124] = 115 ^ 72;
        lIIlIIlIlI[125] = (-17009) & 20479;
        lIIlIIlIlI[126] = (-((-7451) & 32539)) & (-21) & 28574;
        lIIlIIlIlI[127] = (-(23 ^ 70)) & (-25090) & 28671;
        lIIlIIlIlI[128] = (-((-9259) & 25727)) & (-8705) & 28662;
        lIIlIIlIlI[129] = (-16401) & 19895;
        lIIlIIlIlI[130] = (-((-9603) & 30087)) & (-8705) & 32671;
        lIIlIIlIlI[131] = (-((-3969) & 16341)) & (-16385) & 32253;
        lIIlIIlIlI[132] = (-((-8202) & 25195)) & (-4111) & 24575;
        lIIlIIlIlI[133] = (-((-16585) & 29407)) & (-1) & 16311;
        lIIlIIlIlI[134] = (-16417) & 19891;
        lIIlIIlIlI[135] = (-((-15713) & 16225)) & (-24579) & 28575;
        lIIlIIlIlI[136] = (-21009) & 24475;
        lIIlIIlIlI[137] = (-((-7353) & 32505)) & (-4105) & 32762;
        lIIlIIlIlI[138] = (-28745) & 32217;
        lIIlIIlIlI[139] = (-((-9225) & 26217)) & (-1) & 20478;
        lIIlIIlIlI[140] = 53 ^ 8;
        lIIlIIlIlI[141] = 146 ^ 173;
        lIIlIIlIlI[142] = 8 ^ 72;
        lIIlIIlIlI[143] = (((55 + 120) - 104) + 129) ^ (((44 + 122) - 66) + 37);
        lIIlIIlIlI[144] = 51 ^ 113;
        lIIlIIlIlI[145] = 15 ^ 76;
        lIIlIIlIlI[146] = (((108 + 64) - 43) + 5) ^ (((158 + 109) - 145) + 72);
        lIIlIIlIlI[147] = (169 ^ 197) ^ (45 ^ 4);
        lIIlIIlIlI[148] = 242 ^ 180;
        lIIlIIlIlI[149] = (58 ^ 125) ^ ((215 ^ 129) & ((7 ^ 81) ^ (-1)));
        lIIlIIlIlI[150] = (((7 + 47) - (-12)) + 73) ^ (((93 + 188) - 173) + 87);
        lIIlIIlIlI[151] = (((75 + 135) - 91) + 76) ^ (((2 + 49) - 16) + 103);
        lIIlIIlIlI[152] = 25 ^ 83;
        lIIlIIlIlI[153] = 113 ^ 58;
        lIIlIIlIlI[154] = 66 ^ 14;
        lIIlIIlIlI[155] = (18 ^ 34) ^ (185 ^ 196);
        lIIlIIlIlI[156] = 53 ^ 123;
        lIIlIIlIlI[157] = 52 ^ 123;
        lIIlIIlIlI[158] = 199 ^ 151;
        lIIlIIlIlI[159] = (225 ^ 166) ^ (18 ^ 4);
        lIIlIIlIlI[160] = (41 ^ 101) ^ (57 ^ 39);
        lIIlIIlIlI[161] = 119 ^ 36;
        lIIlIIlIlI[162] = (-4481) & 7167;
        lIIlIIlIlI[163] = (-28802) & 32255;
        lIIlIIlIlI[164] = (-12545) & 15263;
        lIIlIIlIlI[165] = (-4369) & 7069;
        lIIlIIlIlI[166] = (-((-16597) & 30205)) & (-5) & 16319;
        lIIlIIlIlI[167] = (-((-20001) & 32549)) & (-16417) & 31661;
        lIIlIIlIlI[168] = (-((-2114) & 31857)) & (-257) & 32687;
        lIIlIIlIlI[169] = (-((-16775) & 29119)) & (-16961) & 32761;
        lIIlIIlIlI[170] = (-25669) & 28397;
        lIIlIIlIlI[171] = (-4181) & 7668;
        lIIlIIlIlI[172] = 146 ^ 198;
        lIIlIIlIlI[173] = 22 ^ 67;
        lIIlIIlIlI[174] = 37 ^ 115;
        lIIlIIlIlI[175] = (((2 + 130) - 41) + 161) ^ (((78 + 35) - 64) + 122);
        lIIlIIlIlI[176] = 83 ^ 10;
        lIIlIIlIlI[177] = 230 ^ 188;
        lIIlIIlIlI[178] = 152 ^ 195;
        lIIlIIlIlI[179] = 109 ^ 49;
        lIIlIIlIlI[180] = 213 ^ 136;
        lIIlIIlIlI[181] = 29 ^ 66;
        lIIlIIlIlI[182] = (((158 + 178) - 262) + 124) ^ (((85 + 97) - 45) + 29);
        lIIlIIlIlI[183] = (45 ^ 39) ^ (20 ^ 127);
        lIIlIIlIlI[184] = (103 ^ 11) ^ (140 ^ 130);
        lIIlIIlIlI[185] = 75 ^ 40;
        lIIlIIlIlI[186] = 163 ^ 199;
        lIIlIIlIlI[187] = (49 ^ 4) ^ (17 ^ 65);
        lIIlIIlIlI[188] = 244 ^ 146;
        lIIlIIlIlI[189] = (-((-2081) & 19369)) & (-4097) & 24575;
        lIIlIIlIlI[190] = (-8706) & 12119;
        lIIlIIlIlI[191] = (-17153) & 20334;
        lIIlIIlIlI[192] = (-((-2507) & 7119)) & (-16577) & 24575;
        lIIlIIlIlI[193] = (-((-10769) & 31633)) & (-23) & 32735;
        lIIlIIlIlI[194] = 160 ^ 199;
        lIIlIIlIlI[195] = (-516) & 6015;
        lIIlIIlIlI[196] = (-((-19513) & 24185)) & (-1028) & 30699;
        lIIlIIlIlI[197] = (-((-594) & 20091)) & (-81) & 20477;
        lIIlIIlIlI[198] = (-24649) & 25598;
        lIIlIIlIlI[199] = (-10338) & 12287;
        lIIlIIlIlI[200] = (-7434) & 16383;
        lIIlIIlIlI[201] = (-(171 ^ 186)) & (-4134) & 16127;
        lIIlIIlIlI[202] = (-4129) & 30078;
        lIIlIIlIlI[203] = 206 ^ 166;
        lIIlIIlIlI[204] = 81 ^ 56;
        lIIlIIlIlI[205] = 93 ^ 55;
        lIIlIIlIlI[206] = (174 ^ 194) ^ (123 ^ 124);
        lIIlIIlIlI[207] = 91 ^ 55;
        lIIlIIlIlI[208] = 122 ^ 23;
        lIIlIIlIlI[209] = (-((-2575) & 12095)) & (-4161) & 16383;
        lIIlIIlIlI[210] = (-((-9881) & 30397)) & (-8195) & 32175;
        lIIlIIlIlI[211] = (((148 + 43) - 160) + 200) ^ (((105 + 17) - 38) + 53);
        lIIlIIlIlI[212] = (-16401) & 19869;
        lIIlIIlIlI[213] = (232 ^ 169) ^ (158 ^ 176);
        lIIlIIlIlI[214] = (-((-6675) & 31611)) & (-1025) & 28671;
        lIIlIIlIlI[215] = (-((-3861) & 12151)) & (-16898) & 28663;
        lIIlIIlIlI[216] = (((181 + 89) - 135) + 69) ^ (((92 + 57) - 107) + 146);
        lIIlIIlIlI[217] = (-((-18834) & 32251)) & (-1) & 16127;
        lIIlIIlIlI[218] = 115 ^ 2;
        lIIlIIlIlI[219] = (-((-7377) & 15577)) & (-21783) & 32703;
        lIIlIIlIlI[220] = (-12801) & 16293;
        lIIlIIlIlI[221] = (92 ^ 82) ^ (65 ^ 61);
        lIIlIIlIlI[222] = (-((-1189) & 22254)) & (-1) & 24575;
        lIIlIIlIlI[223] = (-(147 ^ 151)) & (-28769) & 32255;
        lIIlIIlIlI[224] = (((48 + 214) - 89) + 45) ^ (((122 + 156) - 189) + 80);
        lIIlIIlIlI[225] = (-((-6151) & 31255)) & (-65) & 28671;
        lIIlIIlIlI[226] = (254 ^ 156) ^ (16 ^ 6);
        lIIlIIlIlI[227] = (((14 + 115) - 79) + 161) ^ (((90 + 13) - (-38)) + 25);
        lIIlIIlIlI[228] = (-4682) & 8159;
        lIIlIIlIlI[229] = (-((-26897) & 31513)) & (-84) & 8191;
        lIIlIIlIlI[230] = 226 ^ 148;
        lIIlIIlIlI[231] = (-((-2309) & 6981)) & (-21) & 8191;
        lIIlIIlIlI[232] = (((188 + 153) - 319) + 197) ^ (((93 + 64) - 8) + 23);
        lIIlIIlIlI[233] = 222 ^ 166;
        lIIlIIlIlI[234] = (-24589) & 28093;
        lIIlIIlIlI[235] = (-((-19149) & 32463)) & (-16393) & 32174;
        lIIlIIlIlI[236] = (-((-10281) & 15981)) & (-16386) & 24559;
        lIIlIIlIlI[237] = (-((-8685) & 25597)) & (-12289) & 32637;
        lIIlIIlIlI[238] = 76 ^ 53;
    }

    private static boolean lllllIIIllll(int i, int i2) {
        return i <= i2;
    }
}
