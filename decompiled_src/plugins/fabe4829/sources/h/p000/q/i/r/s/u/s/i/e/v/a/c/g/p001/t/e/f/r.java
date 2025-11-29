package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
@TaskDesc(name = "wave Wave31_62 Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.r  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/r.class */
public class r extends Task {
    private static /* synthetic */ int[] llIIlIIIllII;
    private final /* synthetic */ SquireFightCavesConfig aE;
    private final /* synthetic */ f aD;
    private final /* synthetic */ n aF;
    private static /* synthetic */ String[] llIIlIIIIIII;

    private static String llllIllllIllII(String lllllllllllllllIlIIllllIllIlIlll, String lllllllllllllllIlIIllllIllIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlIIllllIllIlIlII = lllllllllllllllIlIIllllIllIlIllI.toCharArray();
        int lllllllllllllllIlIIllllIllIlIIll = llIIlIIIllII[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlIIIllII[2];
        while (lllllIIIllIIII(i, length)) {
            char lllllllllllllllIlIIllllIllIllIIl = charArray[i];
            lllllllllllllllIlIIllllIllIlIlIl.append((char) (lllllllllllllllIlIIllllIllIllIIl ^ lllllllllllllllIlIIllllIllIlIlII[lllllllllllllllIlIIllllIllIlIIll % lllllllllllllllIlIIllllIllIlIlII.length]));
            "".length();
            lllllllllllllllIlIIllllIllIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllllIllIlIlIl);
    }

    private static boolean lllllIIIlIlIIl(int i) {
        return i > 0;
    }

    private static void lllllIIIlIIIll() {
        llIIlIIIllII = new int[35];
        llIIlIIIllII[0] = (198 ^ 128) ^ (13 ^ 84);
        llIIlIIIllII[1] = 10 ^ 52;
        llIIlIIIllII[2] = (14 ^ 78) & ((62 ^ 126) ^ (-1));
        llIIlIIIllII[3] = " ".length();
        llIIlIIIllII[4] = (((72 + 67) - 108) + 146) ^ (((75 + 94) - 85) + 56);
        llIIlIIIllII[5] = 145 ^ 151;
        llIIlIIIllII[6] = "  ".length();
        llIIlIIIllII[7] = (76 ^ 8) ^ (99 ^ 35);
        llIIlIIIllII[8] = "   ".length();
        llIIlIIIllII[9] = 73 ^ 76;
        llIIlIIIllII[10] = (65 ^ 113) ^ (118 ^ 65);
        llIIlIIIllII[11] = (35 ^ 84) ^ (((12 + 34) - 45) + 126);
        llIIlIIIllII[12] = (15 ^ 38) ^ (55 ^ 10);
        llIIlIIIllII[13] = 130 ^ 139;
        llIIlIIIllII[14] = 152 ^ 146;
        llIIlIIIllII[15] = (((101 + 119) - 112) + 43) ^ (((122 + 47) - 69) + 56);
        llIIlIIIllII[16] = 72 ^ 90;
        llIIlIIIllII[17] = 101 ^ 105;
        llIIlIIIllII[18] = 91 ^ 86;
        llIIlIIIllII[19] = 79 ^ 65;
        llIIlIIIllII[20] = 190 ^ 177;
        llIIlIIIllII[21] = (171 ^ 129) ^ (28 ^ 38);
        llIIlIIIllII[22] = 80 ^ 65;
        llIIlIIIllII[23] = 161 ^ 178;
        llIIlIIIllII[24] = (-((-1045) & 30623)) & (-1) & 32703;
        llIIlIIIllII[25] = (-((-18485) & 31102)) & (-641) & 16383;
        llIIlIIIllII[26] = (-29377) & 32499;
        llIIlIIIllII[27] = (-267) & 3390;
        llIIlIIIllII[28] = (-16837) & 19957;
        llIIlIIIllII[29] = (-16650) & 19771;
        llIIlIIIllII[30] = (-((-1059) & 25827)) & (-4364) & 32251;
        llIIlIIIllII[31] = (-((-16765) & 29694)) & (-17) & 16063;
        llIIlIIIllII[32] = (-5057) & 8175;
        llIIlIIIllII[33] = (-20802) & 23917;
        llIIlIIIllII[34] = (-((-1101) & 30557)) & (-1) & 32573;
    }

    private static String llllIllllIlllI(String lllllllllllllllIlIIllllIlllllIlI, String lllllllllllllllIlIIllllIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIllII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIllllllII) {
            lllllllllllllllIlIIllllIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIlIIlIl(int i, int i2) {
        return i > i2;
    }

    @Inject
    public r(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.aD = fVar;
        this.aE = squireFightCavesConfig;
        this.aF = nVar;
    }

    private static boolean lllllIIIlIIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v203, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v263, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v302, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v320, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v344, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v361, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v377, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    public boolean run() {
        int p = f.p();
        if (!lllllIIIlIIlII(p, llIIlIIIllII[0]) || lllllIIIlIIlIl(p, llIIlIIIllII[1])) {
            return llIIlIIIllII[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllII[3];
        if (lllllIIIlIIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if ((!lllllIIIlIlllI(npc.getId(), llIIlIIIllII[33]) || lllllIIIlIlIII(npc.getId(), llIIlIIIllII[34])) && lllllIIIlIllII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if ((!lllllIIIlIlllI(npc2.getId(), llIIlIIIllII[31]) || lllllIIIlIlIII(npc2.getId(), llIIlIIIllII[32])) && lllllIIIlIllII(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        NPC nearest3 = NPCs.getNearest(npc3 -> {
            if (lllllIIIlIlIII(npc3.getId(), llIIlIIIllII[30]) && lllllIIIlIllII(npc3.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return "  ".length() > (144 ^ 148) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        NPC nearest4 = NPCs.getNearest(npc4 -> {
            if ((!lllllIIIlIlllI(npc4.getId(), llIIlIIIllII[28]) || lllllIIIlIlIII(npc4.getId(), llIIlIIIllII[29])) && lllllIIIlIllII(npc4.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        NPC nearest5 = NPCs.getNearest(npc5 -> {
            if ((!lllllIIIlIlllI(npc5.getId(), llIIlIIIllII[26]) || lllllIIIlIlIII(npc5.getId(), llIIlIIIllII[27])) && lllllIIIlIllII(npc5.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        NPC nearest6 = NPCs.getNearest(npc6 -> {
            if ((!lllllIIIlIlllI(npc6.getId(), llIIlIIIllII[24]) || lllllIIIlIlIII(npc6.getId(), llIIlIIIllII[25])) && lllllIIIlIllII(npc6.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllII[3];
                "".length();
                return ((29 ^ 51) & ((112 ^ 94) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllII[2];
        });
        if (lllllIIIlIIlll(nearest6) && lllllIIIlIIlll(nearest5) && lllllIIIlIlIII(f.r(), f.t()) && lllllIIIlIlIIl(f.r()) && lllllIIIlIlIIl(f.t())) {
            NPC nearest7 = NPCs.getNearest(npc7 -> {
                if (!(lllllIIIlIlllI(npc7.getId(), llIIlIIIllII[24]) && lllllIIIlIlllI(npc7.getId(), llIIlIIIllII[25]) && lllllIIIlIlllI(npc7.getId(), llIIlIIIllII[26]) && !lllllIIIlIlIII(npc7.getId(), llIIlIIIllII[27])) && lllllIIIlIllII(npc7.isDead() ? 1 : 0)) {
                    ?? r0 = llIIlIIIllII[3];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIIllII[2];
            });
            if (lllllIIIlIIlll(nearest7)) {
                Movement.setDestination(nearest7.getWorldLocation());
                return llIIlIIIllII[2];
            }
        }
        n.G();
        if (lllllIIIlIlIII(f.p(), llIIlIIIllII[4]) && lllllIIIlIIlll(nearest5)) {
            List worldPointList = nearest6.getWorldArea().toWorldPointList();
            if (lllllIIIlIlIlI(n.c(worldPointList) ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[2]];
                WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList().stream().filter(worldPoint2 -> {
                    if (lllllIIIlIlIlI(Reachable.isWalkable(worldPoint2) ? 1 : 0) && lllllIIIlIllII(worldPointList.contains(worldPoint2) ? 1 : 0) && lllllIIIlIllII(n.a(worldPoint2) ? 1 : 0)) {
                        ?? r0 = llIIlIIIllII[3];
                        "".length();
                        return (((130 ^ 172) ^ (51 ^ 37)) & (((250 ^ 192) ^ "  ".length()) ^ (-" ".length()))) > 0 ? ((176 ^ 196) ^ (96 ^ 85)) & (((123 ^ 99) ^ (19 ^ 74)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIIIllII[2];
                }).min(Comparator.comparingInt(worldPoint3 -> {
                    return worldPoint3.distanceTo(Players.getLocal().getWorldLocation());
                })).orElse(null);
                if (lllllIIIlIIlll(worldPoint)) {
                    Movement.setDestination(worldPoint);
                    return llIIlIIIllII[2];
                }
            }
            SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[3]];
            nearest5.interact(llIIlIIIIIII[llIIlIIIllII[6]]);
            return llIIlIIIllII[2];
        } else if (lllllIIIlIIlll(nearest) && lllllIIIlIlIll(nearest.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[7]) && ((!lllllIIIlIllII(nearest.isMoving() ? 1 : 0) || lllllIIIlIlIlI(nearest.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && ((!lllllIIIlIIlll(Players.getLocal().getInteracting()) || (lllllIIIlIIlll(Players.getLocal().getInteracting()) && lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), nearest.getName()))) && lllllIIIlIllII(nearest.isDead() ? 1 : 0)))) {
            SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[8]];
            nearest.interact(llIIlIIIIIII[llIIlIIIllII[7]]);
            return llIIlIIIllII[2];
        } else if (lllllIIIlIIlll(nearest5) && lllllIIIlIIlll(nearest6) && lllllIIIlIIlll(nearest4) && lllllIIIlIlIll(nearest4.getWorldLocation().distanceTo(nearest5.getWorldLocation()), llIIlIIIllII[9]) && lllllIIIlIllIl(Players.getLocal().getInteracting()) && lllllIIIlIllII(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && lllllIIIlIllII(nearest5.isMoving() ? 1 : 0) && lllllIIIlIIlIl(nearest5.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && lllllIIIlIIlIl(nearest5.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(nearest5.getWorldLocation()), llIIlIIIllII[5])) {
            SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[9]];
            nearest4.interact(llIIlIIIIIII[llIIlIIIllII[5]]);
            return llIIlIIIllII[2];
        } else if (lllllIIIlIIlll(nearest5) && lllllIIIlIIlll(nearest6) && lllllIIIlIllII(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && lllllIIIlIllII(nearest5.isMoving() ? 1 : 0) && lllllIIIlIIlIl(nearest5.getWorldLocation().distanceTo(n.an), llIIlIIIllII[10]) && lllllIIIlIIlIl(nearest5.getWorldLocation().distanceTo(n.am), llIIlIIIllII[10]) && lllllIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(nearest5.getWorldLocation()), llIIlIIIllII[5])) {
            if (lllllIIIlIllIl(Players.getLocal().getInteracting())) {
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[10]];
                nearest6.interact(llIIlIIIIIII[llIIlIIIllII[11]]);
            }
            return llIIlIIIllII[2];
        } else {
            if (lllllIIIlIIlll(nearest5) && lllllIIIlIlIll(nearest5.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[12]) && ((!lllllIIIlIIlll(Players.getLocal().getInteracting()) || ((lllllIIIlIlIlI(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && !lllllIIIlIlIlI(n.F() ? 1 : 0)) || (lllllIIIlIIlll(Players.getLocal().getInteracting()) && lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), nearest5.getName())))) && lllllIIIlIllII(nearest5.isDead() ? 1 : 0))) {
                if (!lllllIIIlIllII(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) || lllllIIIlIlIlI(nearest5.isMoving() ? 1 : 0)) {
                    n.e(nearest5);
                    return llIIlIIIllII[2];
                } else if (lllllIIIlIllII(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && lllllIIIlIllII(Players.getLocal().isMoving() ? 1 : 0) && lllllIIIlIllII(nearest5.isMoving() ? 1 : 0)) {
                    SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[13]];
                    nearest5.interact(llIIlIIIIIII[llIIlIIIllII[14]]);
                    return llIIlIIIllII[2];
                }
            }
            if (lllllIIIlIIlll(nearest6) && lllllIIIlIllII(nearest6.isDead() ? 1 : 0)) {
                List worldPointList2 = nearest6.getWorldArea().toWorldPointList();
                if (lllllIIIlIlIlI(n.c(worldPointList2) ? 1 : 0)) {
                    SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[15]];
                    WorldPoint worldPoint4 = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList().stream().filter(worldPoint5 -> {
                        if (lllllIIIlIlIlI(Reachable.isWalkable(worldPoint5) ? 1 : 0) && lllllIIIlIllII(worldPointList2.contains(worldPoint5) ? 1 : 0) && lllllIIIlIllII(n.a(worldPoint5) ? 1 : 0)) {
                            ?? r0 = llIIlIIIllII[3];
                            "".length();
                            return (161 ^ 165) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlIIIllII[2];
                    }).min(Comparator.comparingInt(worldPoint6 -> {
                        return worldPoint6.distanceTo(Players.getLocal().getWorldLocation());
                    })).orElse(null);
                    if (lllllIIIlIIlll(worldPoint4)) {
                        Movement.setDestination(worldPoint4);
                        return llIIlIIIllII[2];
                    }
                }
            }
            if (lllllIIIlIIlll(nearest4) && lllllIIIlIlIll(nearest4.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllII[16]) && lllllIIIlIllIl(nearest5) && ((!lllllIIIlIIlll(Players.getLocal().getInteracting()) || (lllllIIIlIIlll(Players.getLocal().getInteracting()) && lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), nearest4.getName()))) && lllllIIIlIllIl(Players.getLocal().getInteracting()) && lllllIIIlIllII(nearest4.isDead() ? 1 : 0))) {
                List worldPointList3 = nearest4.getWorldArea().toWorldPointList();
                if (lllllIIIlIlIlI(n.c(worldPointList3) ? 1 : 0)) {
                    WorldPoint worldPoint7 = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList().stream().filter(worldPoint8 -> {
                        if (lllllIIIlIlIlI(Reachable.isWalkable(worldPoint8) ? 1 : 0) && lllllIIIlIllII(worldPointList3.contains(worldPoint8) ? 1 : 0) && lllllIIIlIllII(n.a(worldPoint8) ? 1 : 0)) {
                            ?? r0 = llIIlIIIllII[3];
                            "".length();
                            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlIIIllII[2];
                    }).min(Comparator.comparingInt(worldPoint9 -> {
                        return worldPoint9.distanceTo(Players.getLocal().getWorldLocation());
                    })).orElse(null);
                    if (lllllIIIlIIlll(worldPoint7)) {
                        Movement.setDestination(worldPoint7);
                        return llIIlIIIllII[2];
                    }
                }
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[17]];
                nearest4.interact(llIIlIIIIIII[llIIlIIIllII[18]]);
                return llIIlIIIllII[2];
            } else if (lllllIIIlIIlll(nearest3) && ((!lllllIIIlIIlll(Players.getLocal().getInteracting()) || (lllllIIIlIIlll(Players.getLocal().getInteracting()) && lllllIIIlIIllI(Players.getLocal().getInteracting().getName(), nearest3.getName()))) && lllllIIIlIllII(nearest3.isDead() ? 1 : 0))) {
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[19]];
                nearest3.interact(llIIlIIIIIII[llIIlIIIllII[20]]);
                return llIIlIIIllII[2];
            } else if (lllllIIIlIIlll(nearest2) && lllllIIIlIllIl(nearest5) && lllllIIIlIllIl(Players.getLocal().getInteracting()) && lllllIIIlIllII(nearest2.isDead() ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[21]];
                nearest2.interact(llIIlIIIIIII[llIIlIIIllII[22]]);
                return llIIlIIIllII[2];
            } else if (lllllIIIlIIlll(nearest6) && lllllIIIlIllIl(nearest5) && lllllIIIlIllIl(Players.getLocal().getInteracting()) && lllllIIIlIllII(nearest6.isDead() ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIlIIIIIII[llIIlIIIllII[16]];
                List worldPointList4 = nearest6.getWorldArea().toWorldPointList();
                if (lllllIIIlIlIlI(n.c(worldPointList4) ? 1 : 0)) {
                    WorldPoint worldPoint10 = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIlIIIllII[5]).toWorldPointList().stream().filter(worldPoint11 -> {
                        if (lllllIIIlIlIlI(Reachable.isWalkable(worldPoint11) ? 1 : 0) && lllllIIIlIllII(worldPointList4.contains(worldPoint11) ? 1 : 0) && lllllIIIlIllII(n.a(worldPoint11) ? 1 : 0)) {
                            ?? r0 = llIIlIIIllII[3];
                            "".length();
                            return (((133 ^ 184) ^ (39 ^ 79)) & (((193 ^ 176) ^ (28 ^ 56)) ^ (-" ".length()))) > 0 ? ((((21 + 152) - 4) + 62) ^ (((125 + 28) - 9) + 36)) & (((52 ^ 112) ^ (94 ^ 73)) ^ (-" ".length())) : r0;
                        }
                        return llIIlIIIllII[2];
                    }).min(Comparator.comparingInt(worldPoint12 -> {
                        return worldPoint12.distanceTo(Players.getLocal().getWorldLocation());
                    })).orElse(null);
                    if (lllllIIIlIIlll(worldPoint10)) {
                        Movement.setDestination(worldPoint10);
                        return llIIlIIIllII[2];
                    }
                }
                nearest6.interact(llIIlIIIIIII[llIIlIIIllII[23]]);
                return llIIlIIIllII[2];
            } else {
                return llIIlIIIllII[2];
            }
        }
    }

    private static boolean lllllIIIlIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllIIIllIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIIIlIllII(int i) {
        return i == 0;
    }

    private static boolean lllllIIIlIlIlI(int i) {
        return i != 0;
    }

    private static boolean lllllIIIlIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lllllIIIlIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lllllIIIlIIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllIIIlIlllI(int i, int i2) {
        return i != i2;
    }

    private static void llllIllllIllll() {
        llIIlIIIIIII = new String[llIIlIIIllII[12]];
        llIIlIIIIIII[llIIlIIIllII[2]] = llllIllllIllII("KT0HCiFNPwIKIR8=", "mRcmD");
        llIIlIIIIIII[llIIlIIIllII[3]] = llllIllllIllIl("WiA8Pd1u2kpKsSZhdB/hXg==", "KqmoB");
        llIIlIIIIIII[llIIlIIIllII[6]] = llllIllllIlllI("wLtJGq4L46o=", "UqYSv");
        llIIlIIIIIII[llIIlIIIllII[8]] = llllIllllIllIl("bofY13PbUwXUsbC3hKoV+Q==", "lxZSf");
        llIIlIIIIIII[llIIlIIIllII[7]] = llllIllllIlllI("YdPDsfYODmI=", "KgvmO");
        llIIlIIIIIII[llIIlIIIllII[9]] = llllIllllIllIl("he3coVtvowsTO86/w2miNaXYAoa1dMO2", "eadtt");
        llIIlIIIIIII[llIIlIIIllII[5]] = llllIllllIllIl("iMaIE4HrzJE=", "dBqBW");
        llIIlIIIIIII[llIIlIIIllII[10]] = llllIllllIllIl("KLAJXol8ijyc/jlfAehP/A==", "IymkZ");
        llIIlIIIIIII[llIIlIIIllII[11]] = llllIllllIllIl("52l/k7hB60E=", "ZLEvm");
        llIIlIIIIIII[llIIlIIIllII[13]] = llllIllllIlllI("xaHXEUZ6JsFLSsm30V7gZQ==", "ibmWf");
        llIIlIIIIIII[llIIlIIIllII[14]] = llllIllllIlllI("F/LcD2kR4M8=", "qcWun");
        llIIlIIIIIII[llIIlIIIllII[15]] = llllIllllIllIl("UzdpAQUyauftw5ZzvUd46w==", "VmuEJ");
        llIIlIIIIIII[llIIlIIIllII[17]] = llllIllllIlllI("eG3nJhTOicEyFMJbCmSWjw==", "QcFLx");
        llIIlIIIIIII[llIIlIIIllII[18]] = llllIllllIlllI("00m4/ZO02Og=", "OGbqH");
        llIIlIIIIIII[llIIlIIIllII[19]] = llllIllllIlllI("aWdVp04PEZgozKAPVNiSKnbioh2ILIUZ", "DOZnF");
        llIIlIIIIIII[llIIlIIIllII[20]] = llllIllllIlllI("0EXjmJhTmUY=", "ejRGF");
        llIIlIIIIIII[llIIlIIIllII[21]] = llllIllllIllII("BAwlBysuET8BaCcRNkYqKRcz", "ExQfH");
        llIIlIIIIIII[llIIlIIIllII[22]] = llllIllllIllIl("hbLArfmjJEE=", "FGAwT");
        llIIlIIIIIII[llIIlIIIllII[16]] = llllIllllIllII("MiE8OBIYPCY+UR40LzwD", "sUHYq");
        llIIlIIIIIII[llIIlIIIllII[23]] = llllIllllIlllI("3J0VTiHg0lE=", "lCBGj");
    }

    private static String llllIllllIllIl(String lllllllllllllllIlIIllllIlIllIIlI, String lllllllllllllllIlIIllllIlIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIIllII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIllII[6], lllllllllllllllIlIIllllIlIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIlIllIlII) {
            lllllllllllllllIlIIllllIlIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIlIlIII(int i, int i2) {
        return i == i2;
    }

    static {
        lllllIIIlIIIll();
        llllIllllIllll();
    }
}
