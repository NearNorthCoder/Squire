/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.combat.AutoAttacker;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.combat.AutoAttacker.AutoAttackConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.HEnum;
import i.i.b.s.c.q.r.s.s.-.u.a.e.IEnum;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
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
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Auto Attacker", description="Auto Attacks when idle", enabledByDefault=false)
public class AutoAttack
extends SquirePlugin {
    /* synthetic */ WorldPoint bC;
    @Inject
    /* synthetic */ AutoAttackConfig bz;
    @Inject
    /* synthetic */ ConfigManager bA;
    private /* synthetic */ int bD;
    private static /* synthetic */ String[] lIlIIIl;
    private /* synthetic */ int bE;
    @Inject
    /* synthetic */ ClientThread bB;
    private static /* synthetic */ int[] lIlIIlI;

    private static boolean lIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllII(Object object) {
        return object != null;
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean lIlIlIIII(Object object) {
        return object == null;
    }

    protected void onStart() {
        if (AutoAttack.lIlIIlIIl(this.bz.safeSpot() ? 1 : 0)) {
            this.bC = Players.getLocal().getWorldLocation();
        }
    }

    private static boolean lIlIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIIll(String lllIlllIIIllIll, String lllIlllIIIlIlIl) {
        lllIlllIIIllIll = new String(Base64.getDecoder().decode(lllIlllIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllIIIllIIl = new StringBuilder();
        char[] lllIlllIIIllIII = lllIlllIIIlIlIl.toCharArray();
        int lllIlllIIIlIlll = lIlIIlI[2];
        char[] lllIlllIIIlIIIl = lllIlllIIIllIll.toCharArray();
        int lllIlllIIIlIIII = lllIlllIIIlIIIl.length;
        int lllIlllIIIIllll = lIlIIlI[2];
        while (AutoAttack.lIlIIlllI(lllIlllIIIIllll, lllIlllIIIlIIII)) {
            char lllIlllIIIlllII = lllIlllIIIlIIIl[lllIlllIIIIllll];
            lllIlllIIIllIIl.append((char)(lllIlllIIIlllII ^ lllIlllIIIllIII[lllIlllIIIlIlll % lllIlllIIIllIII.length]));
            0;
            ++lllIlllIIIlIlll;
            ++lllIlllIIIIllll;
            0;
            if (2 != ((0x38 ^ 0x20 ^ (0x6F ^ 0x28)) & (0x67 ^ 2 ^ (0xAF ^ 0x95) ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllIlllIIIllIIl);
    }

    private static void lIlIIIllI() {
        lIlIIIl = new String[lIlIIlI[35]];
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[2]] = AutoAttack."Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[1]] = AutoAttack."Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[6]] = AutoAttack."Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[7]] = AutoAttack."Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[8]] = AutoAttack."No inventory space to put on spec weapon.";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[9]] = AutoAttack."Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[10]] = AutoAttack."gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[11]] = AutoAttack."Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[12]] = AutoAttack."Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[13]] = AutoAttack."gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[14]] = AutoAttack."Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[15]] = AutoAttack."Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[16]] = AutoAttack."completed your task!";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[17]] = AutoAttack."squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[18]] = AutoAttack."npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[19]] = AutoAttack."empty";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[20]] = AutoAttack."No teleport tabs left in inventory";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[21]] = AutoAttack."Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[22]] = AutoAttack."Wear";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[23]] = AutoAttack."Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[27]] = AutoAttack."s";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[28]] = AutoAttack."bird";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[29]] = AutoAttack."Chicken";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[30]] = AutoAttack."squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[31]] = AutoAttack."npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[32]] = AutoAttack."squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[33]] = AutoAttack."npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[34]] = AutoAttack."Attack";
    }

    private static boolean lIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public int ap() {
        return this.bD;
    }

    protected Class<?>[] tasks() {
        return new Class[lIlIIlI[2]];
    }

    private static boolean lIlIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    public int aq() {
        return this.bE;
    }

    /*
     * WARNING - void declaration
     */
    private void ao() {
        void lllIlllIlIlIlII;
        void lllIlllIlIlIlIl;
        H h2 = this.bz.teleportItem();
        int n2 = h2.aw();
        int[] nArray = h2.av();
        String string = h2.au();
        if (AutoAttack.lIlIIlIIl(n2) && AutoAttack.lIlIIlIII(Equipment.contains((int[])nArray) ? 1 : 0) && AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            this.a(nArray);
        }
        if (AutoAttack.lIlIIlIIl(Equipment.contains((int[])lllIlllIlIlIlIl) ? 1 : 0)) {
            Equipment.getFirst((int[])lllIlllIlIlIlIl).interact((String)lllIlllIlIlIlII);
        }
        if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])lllIlllIlIlIlIl) ? 1 : 0)) {
            Inventory.getFirst((int[])lllIlllIlIlIlIl).interact((String)lllIlllIlIlIlII);
        }
    }

    public void l(int n2) {
        this.bE = n2;
    }

    protected void onStop() {
    }

    private static boolean lIlIIlIII(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Item lllIlllIllIlIII;
        Object lllIlllIllIlIIl;
        AutoAttack lllIlllIllIlIlI;
        if (AutoAttack.lIlIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (AutoAttack.lIlIIlIIl(lllIlllIllIlIlI.bz.safeSpot() ? 1 : 0) && AutoAttack.lIlIIlIlI(lllIlllIllIlIlI.bC.distanceTo((Locatable)Players.getLocal()), lllIlllIllIlIlI.bz.safeSpotRadius()) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (AutoAttack.lIlIIlIll(lllIlllIllIlIlI.bC.distanceTo((Locatable)Players.getLocal()), lIlIIlI[3])) {
                return;
            }
            Movement.walkTo((WorldPoint)lllIlllIllIlIlI.bC);
            0;
            return;
        }
        if (AutoAttack.lIlIIlIII(Combat.isSpecEnabled() ? 1 : 0) && AutoAttack.lIlIIllII(lllIlllIllIlIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && AutoAttack.lIlIIllIl(lllIlllIllIlIIl.getId(), lllIlllIllIlIlI.bz.specWeapon().ar()) && AutoAttack.lIlIIllII(lllIlllIllIlIII = Widgets.get((int)lIlIIlI[4], (int)lIlIIlI[5]))) {
            lllIlllIllIlIII.interact(lIlIIlI[2]);
        }
        if (AutoAttack.lIlIIllII(Players.getLocal().getInteracting())) {
            if (AutoAttack.lIlIIlllI(Combat.getSpecEnergy(), lllIlllIllIlIlI.bz.specWeapon().as())) {
                lllIlllIllIlIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
                if (AutoAttack.lIlIIllII(lllIlllIllIlIIl) && AutoAttack.lIlIIllll(lllIlllIllIlIIl.getId(), lllIlllIllIlIlI.ap())) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.ap();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIIlI[1]];
                        nArray2[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.ap();
                        Inventory.getFirst((int[])nArray2).interact(lIlIIIl[lIlIIlI[2]]);
                    }
                }
                lllIlllIllIlIII = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
                if (AutoAttack.lIlIIllll(lllIlllIllIlIlI.aq(), lIlIIlI[0]) && (!AutoAttack.lIlIIllII(lllIlllIllIlIII) || AutoAttack.lIlIIllll(lllIlllIllIlIII.getId(), lllIlllIllIlIlI.aq()))) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.aq();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIIlI[1]];
                        nArray3[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.aq();
                        Inventory.getFirst((int[])nArray3).interact(lIlIIIl[lIlIIlI[1]]);
                    }
                }
            }
            if (AutoAttack.lIlIIlIll(Combat.getSpecEnergy(), lllIlllIllIlIlI.bz.specWeapon().as())) {
                lllIlllIllIlIIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
                lllIlllIllIlIII = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
                if (AutoAttack.lIlIIllII(lllIlllIllIlIIl) && AutoAttack.lIlIIllll(lllIlllIllIlIIl.getId(), lllIlllIllIlIlI.bz.specWeapon().ar())) {
                    int[] nArray = new int[lIlIIlI[1]];
                    nArray[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.bz.specWeapon().ar();
                    if (AutoAttack.lIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int n2;
                        lllIlllIllIlIlI.k(lllIlllIllIlIIl.getId());
                        if (AutoAttack.lIlIlIIII(lllIlllIllIlIII)) {
                            n2 = lIlIIlI[0];
                            0;
                            if (3 > (7 + 115 - 80 + 142 ^ 46 + 62 - -44 + 36)) {
                                return;
                            }
                        } else {
                            n2 = lllIlllIllIlIII.getId();
                        }
                        lllIlllIllIlIlI.l(n2);
                        if (AutoAttack.lIlIIlIII(lllIlllIllIlIlI.bz.specWeapon().at() ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIIlI[1]];
                            nArray4[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.bz.specWeapon().ar();
                            Inventory.getFirst((int[])nArray4).interact(lIlIIIl[lIlIIlI[6]]);
                        }
                        if (AutoAttack.lIlIIlIIl(lllIlllIllIlIlI.bz.specWeapon().at() ? 1 : 0) && AutoAttack.lIlIIlIlI(Inventory.getFreeSlots(), lIlIIlI[6])) {
                            int[] nArray5 = new int[lIlIIlI[1]];
                            nArray5[AutoAttack.lIlIIlI[2]] = lllIlllIllIlIlI.bz.specWeapon().ar();
                            Inventory.getFirst((int[])nArray5).interact(lIlIIIl[lIlIIlI[7]]);
                            0;
                            if (((0x42 ^ 0x26 ^ (0xC4 ^ 0xAE)) & (0x2E ^ 0x17 ^ (0x7F ^ 0x48) ^ -1)) != 0) {
                                return;
                            }
                        } else {
                            System.out.println(lIlIIIl[lIlIIlI[8]]);
                        }
                    }
                }
            }
            return;
        }
        lllIlllIllIlIIl = NPCs.getAll(nPC -> {
            int n2;
            if (AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIIl(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIIlI[1]];
                stringArray[AutoAttack.lIlIIlI[2]] = lIlIIIl[lIlIIlI[34]];
                if (AutoAttack.lIlIIlIIl(nPC.hasAction(stringArray) ? 1 : 0) && AutoAttack.lIlIIlIIl(nPC.getName().contains(this.bz.npcName()) ? 1 : 0)) {
                    n2 = lIlIIlI[1];
                    0;
                    if (1 <= 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlI[2];
            return n2 != 0;
        });
        if (AutoAttack.lIlIIlIII(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIIl(Players.getLocal().isIdle() ? 1 : 0)) {
            ((NPC)lllIlllIllIlIIl.get(lIlIIlI[2])).interact(lIlIIIl[lIlIIlI[9]]);
        }
        if (AutoAttack.lIlIIlIIl(lllIlllIllIlIlI.bz.exactName() ? 1 : 0)) {
            lllIlllIllIlIII = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (AutoAttack.lIlIIlIIl(nPC.getName().equalsIgnoreCase(this.bz.npcName()) ? 1 : 0) && AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIlI(nPC.distanceTo((Locatable)Players.getLocal()), this.bz.npcDistance()) && AutoAttack.lIlIlIIlI(Walker.buildPath((WorldPoint)nPC.getWorldLocation()).size(), this.bz.npcDistance())) {
                    n2 = lIlIIlI[1];
                    0;
                    if (2 == (0x36 ^ 0x32)) {
                        return false;
                    }
                } else {
                    n2 = lIlIIlI[2];
                }
                return n2 != 0;
            });
            if (AutoAttack.lIlIlIIII(lllIlllIllIlIII)) {
                return;
            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIII.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[10]]) ? 1 : 0) && AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[11]]);
                Time.sleep((long)2L);
                0;
            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(lllIlllIllIlIII.isDead() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[12]]);
                Time.sleep((long)2L);
                0;
            }
        }
        if (AutoAttack.lIlIIlIII(lllIlllIllIlIlI.bz.exactName() ? 1 : 0)) {
            lllIlllIllIlIII = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (AutoAttack.lIlIIlIIl(nPC.getName().toLowerCase().contains(this.bz.npcName().toLowerCase()) ? 1 : 0) && AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIlI(nPC.distanceTo((Locatable)Players.getLocal()), this.bz.npcDistance()) && AutoAttack.lIlIlIIlI(Walker.buildPath((WorldPoint)nPC.getWorldLocation()).size(), this.bz.npcDistance())) {
                    n2 = lIlIIlI[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIIlI[2];
                }
                return n2 != 0;
            });
            if (AutoAttack.lIlIlIIII(lllIlllIllIlIII)) {
                return;
            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIII.getName().equalsIgnoreCase(lIlIIIl[lIlIIlI[13]]) ? 1 : 0) && AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[14]]);
                Time.sleep((long)2L);
                0;
            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(lllIlllIllIlIII.isDead() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[15]]);
                Time.sleep((long)2L);
                0;
            }
        }
    }

    static {
        AutoAttack.lIlIIIlll();
        AutoAttack.lIlIIIllI();
    }

    private static String lIlIIIlII(String lllIlllIIlIlIll, String lllIlllIIlIlIII) {
        try {
            SecretKeySpec lllIlllIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlllIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIlI[12]), "DES");
            Cipher lllIlllIIlIllIl = Cipher.getInstance("DES");
            lllIlllIIlIllIl.init(lIlIIlI[6], lllIlllIIlIlllI);
            return new String(lllIlllIIlIllIl.doFinal(Base64.getDecoder().decode(lllIlllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllIIlIllII) {
            lllIlllIIlIllII.printStackTrace();
            return null;
        }
    }

    private void a(int[] nArray) {
        Inventory.getFirst((int[])nArray).interact(lIlIIIl[lIlIIlI[22]]);
    }

    private static boolean lIlIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String lIlIIIlIl(String lllIlllIIllIllI, String lllIlllIIllIlIl) {
        try {
            SecretKeySpec lllIlllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllIIlllIlI = Cipher.getInstance("Blowfish");
            lllIlllIIlllIlI.init(lIlIIlI[6], lllIlllIIlllIll);
            return new String(lllIlllIIlllIlI.doFinal(Base64.getDecoder().decode(lllIlllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllIIlllIIl) {
            lllIlllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlll() {
        lIlIIlI = new int[36];
        AutoAttack.lIlIIlI[0] = -1;
        AutoAttack.lIlIIlI[1] = 1;
        AutoAttack.lIlIIlI[2] = (0xBE ^ 0xC5 ^ (0x58 ^ 0xA)) & (0x61 ^ 0x39 ^ (9 ^ 0x78) ^ -1);
        AutoAttack.lIlIIlI[3] = 0x77 ^ 5 ^ (0x37 ^ 0xE);
        AutoAttack.lIlIIlI[4] = (4 ^ 0x4B) + (0xC5 ^ 0x9B) - (0xAF ^ 0x8A) + (0xB3 ^ 0xAB);
        AutoAttack.lIlIIlI[5] = 113 + 41 - 153 + 146 ^ 104 + 67 - 143 + 148;
        AutoAttack.lIlIIlI[6] = 2;
        AutoAttack.lIlIIlI[7] = 3;
        AutoAttack.lIlIIlI[8] = 0x90 ^ 0x8B ^ (0x70 ^ 0x6F);
        AutoAttack.lIlIIlI[9] = 0x5A ^ 0x5F;
        AutoAttack.lIlIIlI[10] = 105 + 119 - 199 + 133 ^ 72 + 140 - 95 + 35;
        AutoAttack.lIlIIlI[11] = 0x12 ^ 0x15;
        AutoAttack.lIlIIlI[12] = 0xA8 ^ 0xA0;
        AutoAttack.lIlIIlI[13] = 0x5B ^ 0x52;
        AutoAttack.lIlIIlI[14] = 92 + 121 - 85 + 0 ^ 23 + 32 - -5 + 78;
        AutoAttack.lIlIIlI[15] = 0x3E ^ 5 ^ (0x82 ^ 0xB2);
        AutoAttack.lIlIIlI[16] = 0x9F ^ 0x93;
        AutoAttack.lIlIIlI[17] = 0xBB ^ 0xB6;
        AutoAttack.lIlIIlI[18] = 0x45 ^ 0x4B;
        AutoAttack.lIlIIlI[19] = 0x38 ^ 0x7B ^ (0xEE ^ 0xA2);
        AutoAttack.lIlIIlI[20] = 0x11 ^ 0x6A ^ (0xC8 ^ 0xA3);
        AutoAttack.lIlIIlI[21] = 0x21 ^ 6 ^ (0x4B ^ 0x7D);
        AutoAttack.lIlIIlI[22] = 0x11 ^ 0x2F ^ (0x65 ^ 0x49);
        AutoAttack.lIlIIlI[23] = 0x26 ^ 0x35;
        AutoAttack.lIlIIlI[24] = -(0xFFFFBF7B & 0x62F6) & (0xFFFFE7FB & 0x3BFF);
        AutoAttack.lIlIIlI[25] = -(0xFFFFF649 & 0x5DF7) & (0xFFFFFFF5 & 0x56FF);
        AutoAttack.lIlIIlI[26] = 0xFFFFDDBF & 0x23CB;
        AutoAttack.lIlIIlI[27] = 0x63 ^ 0x7F ^ (0xA1 ^ 0xA9);
        AutoAttack.lIlIIlI[28] = 0x50 ^ 0x5F ^ (0x52 ^ 0x48);
        AutoAttack.lIlIIlI[29] = 0xB9 ^ 0xAF;
        AutoAttack.lIlIIlI[30] = 0x24 ^ 0x51 ^ (0x1C ^ 0x7E);
        AutoAttack.lIlIIlI[31] = 0x69 ^ 0x1D ^ (0x1F ^ 0x73);
        AutoAttack.lIlIIlI[32] = 0x15 ^ 0xC;
        AutoAttack.lIlIIlI[33] = 0x77 ^ 0x6D;
        AutoAttack.lIlIIlI[34] = 0x6F ^ 0x67 ^ (0xB ^ 0x18);
        AutoAttack.lIlIIlI[35] = 7 ^ 0x1B;
    }

    private void am() {
        Item item2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIIlI[1]];
            stringArray[AutoAttack.lIlIIlI[2]] = lIlIIIl[lIlIIlI[23]];
            return item.hasAction(stringArray);
        });
        if (AutoAttack.lIlIlIIII(item2)) {
            System.out.println(lIlIIIl[lIlIIlI[20]]);
            return;
        }
        item2.interact(lIlIIIl[lIlIIlI[21]]);
    }

    @Provides
    AutoAttackConfig c(ConfigManager configManager) {
        return (AutoAttackConfig)configManager.getConfig(AutoAttackConfig.class);
    }

    public static String b(String string) {
        return AutoAttack.a(string, lIlIIlI[1]);
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        AutoAttack lllIlllIllIIIlI;
        if (!AutoAttack.lIlIIlIIl(chatMessage.getMessage().contains(lIlIIIl[lIlIIlI[16]]) ? 1 : 0) || AutoAttack.lIlIIlIII(this.bz.teleportAfterTask() ? 1 : 0)) {
            return;
        }
        I lllIlllIllIIIII = lllIlllIllIIIlI.bz.teleportType();
        if (AutoAttack.lIlIlIIIl((Object)lllIlllIllIIIII, (Object)I.TAB)) {
            lllIlllIllIIIlI.am();
            0;
            if (1 < 0) {
                return;
            }
        } else if (AutoAttack.lIlIlIIIl((Object)lllIlllIllIIIII, (Object)I.SPELL)) {
            lllIlllIllIIIlI.an();
            0;
            if ((0xAE ^ 0xAA) == -1) {
                return;
            }
        } else if (AutoAttack.lIlIlIIIl((Object)lllIlllIllIIIII, (Object)I.ITEM)) {
            lllIlllIllIIIlI.ao();
        }
        this.bA.setConfiguration(lIlIIIl[lIlIIlI[17]], lIlIIIl[lIlIIlI[18]], lIlIIIl[lIlIIlI[19]]);
    }

    private static boolean lIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public AutoAttack() {
        this.bD = lIlIIlI[0];
        this.bE = lIlIIlI[0];
    }

    private static boolean lIlIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.bB.invokeLater(() -> {
            if (AutoAttack.lIlIIlIIl(this.bz.fillSlayer() ? 1 : 0) && AutoAttack.lIlIIllIl(varbitChanged.getIndex(), lIlIIlI[24])) {
                AutoAttack lllIlllIlIIllll;
                String string = Static.getClient().getEnum(lIlIIlI[25]).getStringValue(Vars.getVarp((int)lIlIIlI[26]));
                if (AutoAttack.lIlIIlIIl(string.endsWith(lIlIIIl[lIlIIlI[27]]) ? 1 : 0)) {
                    String lllIlllIlIIllII;
                    String string2 = AutoAttack.b(string);
                    if (AutoAttack.lIlIIlIIl(string2.equals(lIlIIIl[lIlIIlI[28]]) ? 1 : 0)) {
                        lllIlllIlIIllII = lIlIIIl[lIlIIlI[29]];
                    }
                    lllIlllIlIIllll.bA.setConfiguration(lIlIIIl[lIlIIlI[30]], lIlIIIl[lIlIIlI[31]], lllIlllIlIIllII);
                    0;
                    if (-3 > 0) {
                        return;
                    }
                } else {
                    void lllIlllIlIIllIl;
                    lllIlllIlIIllll.bA.setConfiguration(lIlIIIl[lIlIIlI[32]], lIlIIIl[lIlIIlI[33]], (String)lllIlllIlIIllIl);
                }
            }
        });
    }

    public static String a(String string, int n2) {
        return string.substring(lIlIIlI[2], string.length() - n2);
    }

    private void an() {
        Magic.cast((Spell)this.bz.teleportSpell().getSpell());
    }
}

