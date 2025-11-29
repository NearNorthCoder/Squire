package gg.squire.basics.combat.AutoAttacker;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.H;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.I;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@SquireUtil
@PluginDescriptor(name = "Squire Auto Attacker", description = "Auto Attacks when idle", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/AutoAttacker/AutoAttack.class */
public class AutoAttack extends SquirePlugin {
    /* synthetic */ WorldPoint bC;
    @Inject
    /* synthetic */ AutoAttackConfig bz;
    @Inject
    /* synthetic */ ConfigManager bA;
    private static /* synthetic */ String[] lIlIIIl;
    @Inject
    /* synthetic */ ClientThread bB;
    private static /* synthetic */ int[] lIlIIlI;
    private /* synthetic */ int bD = lIlIIlI[0];
    private /* synthetic */ int bE = lIlIIlI[0];

    private static boolean lIlIIlIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIllII(Object obj) {
        return obj != null;
    }

    public void k(int i2) {
        this.bD = i2;
    }

    private static boolean lIlIlIIII(Object obj) {
        return obj == null;
    }

    protected void onStart() {
        if (lIlIIlIIl(this.bz.safeSpot() ? 1 : 0)) {
            this.bC = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean lIlIIllll(int i2, int i3) {
        return i2 != i3;
    }

    private static String lIlIIIIll(String lllIlllIIIllIll, String lllIlllIIIllIlI) {
        String str = new String(Base64.getDecoder().decode(lllIlllIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIlllIIIllIII = lllIlllIIIllIlI.toCharArray();
        int lllIlllIIIlIlll = lIlIIlI[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIIlI[2];
        while (lIlIIlllI(i2, length)) {
            char lllIlllIIIlllII = charArray[i2];
            sb.append((char) (lllIlllIIIlllII ^ lllIlllIIIllIII[lllIlllIIIlIlll % lllIlllIIIllIII.length]));
            "".length();
            lllIlllIIIlIlll++;
            i2++;
            "".length();
            if ("  ".length() == (((56 ^ 32) ^ (111 ^ 40)) & (((103 ^ 2) ^ (175 ^ 149)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIIllI() {
        lIlIIIl = new String[lIlIIlI[35]];
        lIlIIIl[lIlIIlI[2]] = lIlIIIIll("ExoWCS8=", "DsseK");
        lIlIIIl[lIlIIlI[1]] = lIlIIIlII("0Xzv8MdisHI=", "QsEyV");
        lIlIIIl[lIlIIlI[6]] = lIlIIIlII("xAup22wghhU=", "gWSeS");
        lIlIIIl[lIlIIlI[7]] = lIlIIIIll("IxkhBRI=", "tpDiv");
        lIlIIIl[lIlIIlI[8]] = lIlIIIIll("FyRYHzkvLhYCOCsyWAUnOCgdViM2awgDI3kkFlYkKS4bViA8KggZOXc=", "YKxvW");
        lIlIIIl[lIlIIlI[9]] = lIlIIIIll("DS0zDRAn", "LYGls");
        lIlIIIl[lIlIIlI[10]] = lIlIIIlII("Oc13UTkYEIk2HVtmwuvfAQ==", "FubYA");
        lIlIIIl[lIlIIlI[11]] = lIlIIIlIl("f6VDFHH1qUM=", "GeqIV");
        lIlIIIl[lIlIIlI[12]] = lIlIIIlII("P4NtFJrJEdQ=", "kfJAG");
        lIlIIIl[lIlIIlI[13]] = lIlIIIlII("8FSRO3pGv8gazpvfUfbt7g==", "Dmbhl");
        lIlIIIl[lIlIIlI[14]] = lIlIIIlIl("39o/AOc3NwU=", "pghli");
        lIlIIIl[lIlIIlI[15]] = lIlIIIIll("JzAeLhoN", "fDjOy");
        lIlIIIl[lIlIIlI[16]] = lIlIIIlIl("vy5T6/v+jLNgWKL2foF6IDfnNBLPRbMo", "REcsI");
        lIlIIIl[lIlIIlI[17]] = lIlIIIIll("HBwvBRUKDC4YBgwGPx4=", "omZlg");
        lIlIIIl[lIlIIlI[18]] = lIlIIIIll("HDomCzUGKyYh", "rJEJA");
        lIlIIIl[lIlIIlI[19]] = lIlIIIlII("Sy7rSR5x2hQ=", "CzCRK");
        lIlIIIl[lIlIIlI[20]] = lIlIIIlII("hT3KLRC798KJwDQ5gyoA51WUMCyIWXw3g6pEsrRFwxViceYjjD14qg==", "YAryc");
        lIlIIIl[lIlIIlI[21]] = lIlIIIlIl("6xv3MNL2FD4=", "mYoPV");
        lIlIIIl[lIlIIlI[22]] = lIlIIIlIl("P3o7bpdxQBk=", "nXEWN");
        lIlIIIl[lIlIIlI[23]] = lIlIIIIll("LSQkBQU=", "oVAdn");
        lIlIIIl[lIlIIlI[27]] = lIlIIIlIl("Ag3hc/fQQAA=", "fFFom");
        lIlIIIl[lIlIIlI[28]] = lIlIIIIll("DSszEw==", "oBAwx");
        lIlIIIl[lIlIIlI[29]] = lIlIIIlIl("aoicu+hKCuc=", "aNVsr");
        lIlIIIl[lIlIIlI[30]] = lIlIIIlII("/MEy/pGNgdx1CAeKIn57Qg==", "JLFjP");
        lIlIIIl[lIlIIlI[31]] = lIlIIIIll("OicxJB8gNjEO", "TWRek");
        lIlIIIl[lIlIIlI[32]] = lIlIIIlIl("Yq57xBCD1rogr7G8HbbTUg==", "cRXHG");
        lIlIIIl[lIlIIlI[33]] = lIlIIIIll("IzgtBRE5KS0v", "MHNDe");
        lIlIIIl[lIlIIlI[34]] = lIlIIIIll("Izc4JDAJ", "bCLES");
    }

    private static boolean lIlIIllIl(int i2, int i3) {
        return i2 == i3;
    }

    public int ap() {
        return this.bD;
    }

    protected Class<?>[] tasks() {
        return new Class[lIlIIlI[2]];
    }

    private static boolean lIlIIlIlI(int i2, int i3) {
        return i2 > i3;
    }

    public int aq() {
        return this.bE;
    }

    private void ao() {
        H teleportItem = this.bz.teleportItem();
        boolean aw = teleportItem.aw();
        int[] av = teleportItem.av();
        String au = teleportItem.au();
        if (lIlIIlIIl(aw ? 1 : 0) && lIlIIlIII(Equipment.contains(av) ? 1 : 0) && lIlIIlIIl(Inventory.contains(av) ? 1 : 0)) {
            a(av);
        }
        if (lIlIIlIIl(Equipment.contains(av) ? 1 : 0)) {
            Equipment.getFirst(av).interact(au);
        }
        if (lIlIIlIIl(Inventory.contains(av) ? 1 : 0)) {
            Inventory.getFirst(av).interact(au);
        }
    }

    public void l(int i2) {
        this.bE = i2;
    }

    protected void onStop() {
    }

    private static boolean lIlIIlIII(int i2) {
        return i2 == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int id;
        if (lIlIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (lIlIIlIIl(this.bz.safeSpot() ? 1 : 0) && lIlIIlIlI(this.bC.distanceTo(Players.getLocal()), this.bz.safeSpotRadius()) && lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIlIIlIll(this.bC.distanceTo(Players.getLocal()), lIlIIlI[3])) {
                return;
            }
            Movement.walkTo(this.bC);
            "".length();
            return;
        }
        if (lIlIIlIII(Combat.isSpecEnabled() ? 1 : 0)) {
            Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (lIlIIllII(fromSlot) && lIlIIllIl(fromSlot.getId(), this.bz.specWeapon().ar())) {
                Widget widget = Widgets.get(lIlIIlI[4], lIlIIlI[5]);
                if (lIlIIllII(widget)) {
                    widget.interact(lIlIIlI[2]);
                }
            }
        }
        if (!lIlIIllII(Players.getLocal().getInteracting())) {
            List all = NPCs.getAll(npc -> {
                if (lIlIIlIII(npc.isDead() ? 1 : 0) && lIlIlIIIl(npc.getInteracting(), Players.getLocal())) {
                    String[] strArr = new String[lIlIIlI[1]];
                    strArr[lIlIIlI[2]] = lIlIIIl[lIlIIlI[34]];
                    if (lIlIIlIIl(npc.hasAction(strArr) ? 1 : 0) && lIlIIlIIl(npc.getName().contains(this.bz.npcName()) ? 1 : 0)) {
                        ?? r0 = lIlIIlI[1];
                        "".length();
                        return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIlI[2];
            });
            if (lIlIIlIII(all.isEmpty() ? 1 : 0) && lIlIIlIIl(Players.getLocal().isIdle() ? 1 : 0)) {
                ((NPC) all.get(lIlIIlI[2])).interact(lIlIIIl[lIlIIlI[9]]);
            }
            if (lIlIIlIIl(this.bz.exactName() ? 1 : 0)) {
                NPC attackableNPC = Combat.getAttackableNPC(npc2 -> {
                    if (lIlIIlIIl(npc2.getName().equalsIgnoreCase(this.bz.npcName()) ? 1 : 0) && lIlIIlIII(npc2.isDead() ? 1 : 0) && lIlIlIIlI(npc2.distanceTo(Players.getLocal()), this.bz.npcDistance()) && lIlIlIIlI(Walker.buildPath(npc2.getWorldLocation()).size(), this.bz.npcDistance())) {
                        ?? r0 = lIlIIlI[1];
                        "".length();
                        return "  ".length() == (54 ^ 50) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlI[2];
                });
                if (lIlIlIIII(attackableNPC)) {
                    return;
                }
                if (lIlIIlIIl(attackableNPC.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[10]]) ? 1 : 0) && lIlIIlIIl(all.isEmpty() ? 1 : 0) && lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                    attackableNPC.interact(lIlIIIl[lIlIIlI[11]]);
                    Time.sleep(2L);
                    "".length();
                }
                if (lIlIIlIIl(all.isEmpty() ? 1 : 0) && lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && lIlIIlIII(attackableNPC.isDead() ? 1 : 0)) {
                    attackableNPC.interact(lIlIIIl[lIlIIlI[12]]);
                    Time.sleep(2L);
                    "".length();
                }
            }
            if (lIlIIlIII(this.bz.exactName() ? 1 : 0)) {
                NPC attackableNPC2 = Combat.getAttackableNPC(npc3 -> {
                    if (lIlIIlIIl(npc3.getName().toLowerCase().contains(this.bz.npcName().toLowerCase()) ? 1 : 0) && lIlIIlIII(npc3.isDead() ? 1 : 0) && lIlIlIIlI(npc3.distanceTo(Players.getLocal()), this.bz.npcDistance()) && lIlIlIIlI(Walker.buildPath(npc3.getWorldLocation()).size(), this.bz.npcDistance())) {
                        ?? r0 = lIlIIlI[1];
                        "".length();
                        return 0 != 0 ? ((107 ^ 3) ^ (237 ^ 177)) & (((226 ^ 196) ^ (39 ^ 53)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIlI[2];
                });
                if (lIlIlIIII(attackableNPC2)) {
                    return;
                }
                if (lIlIIlIIl(attackableNPC2.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[13]]) ? 1 : 0) && lIlIIlIIl(all.isEmpty() ? 1 : 0) && lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                    attackableNPC2.interact(lIlIIIl[lIlIIlI[14]]);
                    Time.sleep(2L);
                    "".length();
                }
                if (lIlIIlIIl(all.isEmpty() ? 1 : 0) && lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && lIlIIlIII(attackableNPC2.isDead() ? 1 : 0)) {
                    attackableNPC2.interact(lIlIIIl[lIlIIlI[15]]);
                    Time.sleep(2L);
                    "".length();
                    return;
                }
                return;
            }
            return;
        }
        if (lIlIIlllI(Combat.getSpecEnergy(), this.bz.specWeapon().as())) {
            Item fromSlot2 = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            if (lIlIIllII(fromSlot2) && lIlIIllll(fromSlot2.getId(), ap())) {
                int[] iArr = new int[lIlIIlI[1]];
                iArr[lIlIIlI[2]] = ap();
                if (lIlIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIlI[1]];
                    iArr2[lIlIIlI[2]] = ap();
                    Inventory.getFirst(iArr2).interact(lIlIIIl[lIlIIlI[2]]);
                }
            }
            Item fromSlot3 = Equipment.fromSlot(EquipmentInventorySlot.SHIELD);
            if (lIlIIllll(aq(), lIlIIlI[0]) && (!lIlIIllII(fromSlot3) || lIlIIllll(fromSlot3.getId(), aq()))) {
                int[] iArr3 = new int[lIlIIlI[1]];
                iArr3[lIlIIlI[2]] = aq();
                if (lIlIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIIlI[1]];
                    iArr4[lIlIIlI[2]] = aq();
                    Inventory.getFirst(iArr4).interact(lIlIIIl[lIlIIlI[1]]);
                }
            }
        }
        if (lIlIIlIll(Combat.getSpecEnergy(), this.bz.specWeapon().as())) {
            Item fromSlot4 = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
            Item fromSlot5 = Equipment.fromSlot(EquipmentInventorySlot.SHIELD);
            if (lIlIIllII(fromSlot4) && lIlIIllll(fromSlot4.getId(), this.bz.specWeapon().ar())) {
                int[] iArr5 = new int[lIlIIlI[1]];
                iArr5[lIlIIlI[2]] = this.bz.specWeapon().ar();
                if (lIlIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    k(fromSlot4.getId());
                    if (lIlIlIIII(fromSlot5)) {
                        id = lIlIIlI[0];
                        "".length();
                        if ("   ".length() > ((((7 + 115) - 80) + 142) ^ (((46 + 62) - (-44)) + 36))) {
                            return;
                        }
                    } else {
                        id = fromSlot5.getId();
                    }
                    l(id);
                    if (lIlIIlIII(this.bz.specWeapon().at() ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIlI[1]];
                        iArr6[lIlIIlI[2]] = this.bz.specWeapon().ar();
                        Inventory.getFirst(iArr6).interact(lIlIIIl[lIlIIlI[6]]);
                    }
                    if (!lIlIIlIIl(this.bz.specWeapon().at() ? 1 : 0) || !lIlIIlIlI(Inventory.getFreeSlots(), lIlIIlI[6])) {
                        System.out.println(lIlIIIl[lIlIIlI[8]]);
                        return;
                    }
                    int[] iArr7 = new int[lIlIIlI[1]];
                    iArr7[lIlIIlI[2]] = this.bz.specWeapon().ar();
                    Inventory.getFirst(iArr7).interact(lIlIIIl[lIlIIlI[7]]);
                    "".length();
                    if ((((66 ^ 38) ^ (196 ^ 174)) & (((46 ^ 23) ^ (127 ^ 72)) ^ (-" ".length()))) != 0) {
                    }
                }
            }
        }
    }

    static {
        lIlIIIlll();
        lIlIIIllI();
    }

    private static String lIlIIIlII(String lllIlllIIlIlIll, String lllIlllIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlI[12]), "DES");
            Cipher lllIlllIIlIllIl = Cipher.getInstance("DES");
            lllIlllIIlIllIl.init(lIlIIlI[6], secretKeySpec);
            return new String(lllIlllIIlIllIl.doFinal(Base64.getDecoder().decode(lllIlllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllIIlIllII) {
            lllIlllIIlIllII.printStackTrace();
            return null;
        }
    }

    private void a(int[] iArr) {
        Inventory.getFirst(iArr).interact(lIlIIIl[lIlIIlI[22]]);
    }

    private static boolean lIlIlIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIlIIIlIl(String lllIlllIIlllIII, String lllIlllIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllIIlllIIl) {
            lllIlllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlll() {
        lIlIIlI = new int[36];
        lIlIIlI[0] = -" ".length();
        lIlIIlI[1] = " ".length();
        lIlIIlI[2] = ((190 ^ 197) ^ (88 ^ 10)) & (((97 ^ 57) ^ (9 ^ 120)) ^ (-" ".length()));
        lIlIIlI[3] = (119 ^ 5) ^ (55 ^ 14);
        lIlIIlI[4] = (((4 ^ 75) + (197 ^ 155)) - (175 ^ 138)) + (179 ^ 171);
        lIlIIlI[5] = (((113 + 41) - 153) + 146) ^ (((104 + 67) - 143) + 148);
        lIlIIlI[6] = "  ".length();
        lIlIIlI[7] = "   ".length();
        lIlIIlI[8] = (144 ^ 139) ^ (112 ^ 111);
        lIlIIlI[9] = 90 ^ 95;
        lIlIIlI[10] = (((105 + 119) - 199) + 133) ^ (((72 + 140) - 95) + 35);
        lIlIIlI[11] = 18 ^ 21;
        lIlIIlI[12] = 168 ^ 160;
        lIlIIlI[13] = 91 ^ 82;
        lIlIIlI[14] = (((92 + 121) - 85) + 0) ^ (((23 + 32) - (-5)) + 78);
        lIlIIlI[15] = (62 ^ 5) ^ (130 ^ 178);
        lIlIIlI[16] = 159 ^ 147;
        lIlIIlI[17] = 187 ^ 182;
        lIlIIlI[18] = 69 ^ 75;
        lIlIIlI[19] = (56 ^ 123) ^ (238 ^ 162);
        lIlIIlI[20] = (17 ^ 106) ^ (200 ^ 163);
        lIlIIlI[21] = (33 ^ 6) ^ (75 ^ 125);
        lIlIIlI[22] = (17 ^ 47) ^ (101 ^ 73);
        lIlIIlI[23] = 38 ^ 53;
        lIlIIlI[24] = (-((-16517) & 25334)) & (-6149) & 15359;
        lIlIIlI[25] = (-((-2487) & 24055)) & (-11) & 22271;
        lIlIIlI[26] = (-8769) & 9163;
        lIlIIlI[27] = (99 ^ 127) ^ (161 ^ 169);
        lIlIIlI[28] = (80 ^ 95) ^ (82 ^ 72);
        lIlIIlI[29] = 185 ^ 175;
        lIlIIlI[30] = (36 ^ 81) ^ (28 ^ 126);
        lIlIIlI[31] = (105 ^ 29) ^ (31 ^ 115);
        lIlIIlI[32] = 21 ^ 12;
        lIlIIlI[33] = 119 ^ 109;
        lIlIIlI[34] = (111 ^ 103) ^ (11 ^ 24);
        lIlIIlI[35] = 7 ^ 27;
    }

    private void am() {
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIIlI[1]];
            strArr[lIlIIlI[2]] = lIlIIIl[lIlIIlI[23]];
            return item.hasAction(strArr);
        });
        if (lIlIlIIII(first)) {
            System.out.println(lIlIIIl[lIlIIlI[20]]);
        } else {
            first.interact(lIlIIIl[lIlIIlI[21]]);
        }
    }

    @Provides
    AutoAttackConfig c(ConfigManager configManager) {
        return (AutoAttackConfig) configManager.getConfig(AutoAttackConfig.class);
    }

    public static String b(String str) {
        return a(str, lIlIIlI[1]);
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!lIlIIlIIl(chatMessage.getMessage().contains(lIlIIIl[lIlIIlI[16]]) ? 1 : 0) || lIlIIlIII(this.bz.teleportAfterTask() ? 1 : 0)) {
            return;
        }
        I teleportType = this.bz.teleportType();
        if (lIlIlIIIl(teleportType, I.TAB)) {
            am();
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else if (lIlIlIIIl(teleportType, I.SPELL)) {
            an();
            "".length();
            if ((174 ^ 170) == (-" ".length())) {
                return;
            }
        } else if (lIlIlIIIl(teleportType, I.ITEM)) {
            ao();
        }
        this.bA.setConfiguration(lIlIIIl[lIlIIlI[17]], lIlIIIl[lIlIIlI[18]], lIlIIIl[lIlIIlI[19]]);
    }

    private static boolean lIlIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIlIIlI(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIlIIl(int i2) {
        return i2 != 0;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.bB.invokeLater(() -> {
            if (lIlIIlIIl(this.bz.fillSlayer() ? 1 : 0) && lIlIIllIl(varbitChanged.getIndex(), lIlIIlI[24])) {
                String stringValue = Static.getClient().getEnum(lIlIIlI[25]).getStringValue(Vars.getVarp(lIlIIlI[26]));
                if (!lIlIIlIIl(stringValue.endsWith(lIlIIIl[lIlIIlI[27]]) ? 1 : 0)) {
                    this.bA.setConfiguration(lIlIIIl[lIlIIlI[32]], lIlIIIl[lIlIIlI[33]], stringValue);
                    return;
                }
                String b = b(stringValue);
                if (lIlIIlIIl(b.equals(lIlIIIl[lIlIIlI[28]]) ? 1 : 0)) {
                    b = lIlIIIl[lIlIIlI[29]];
                }
                this.bA.setConfiguration(lIlIIIl[lIlIIlI[30]], lIlIIIl[lIlIIlI[31]], b);
                "".length();
                if ((-"   ".length()) > 0) {
                }
            }
        });
    }

    public static String a(String str, int i2) {
        return str.substring(lIlIIlI[2], str.length() - i2);
    }

    private void an() {
        Magic.cast(this.bz.teleportSpell().getSpell());
    }
}
