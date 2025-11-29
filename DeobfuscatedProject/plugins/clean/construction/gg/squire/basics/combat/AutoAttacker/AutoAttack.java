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
import gg.squire.basics.combat.AutoAttacker.GameEnum61;
import gg.squire.basics.combat.AutoAttacker.GameEnum36;
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
     WorldPoint bC;
    @Inject
     AutoAttackConfig bz;
    @Inject
     ConfigManager bA;
    private  int bD;
    
    private  int bE;
    @Inject
     ClientThread bB;

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

        return String.valueOf(lllIlllIIIllIIl);
    }

    private static void lIlIIIllI() {
        lIlIIIl = new String[lIlIIlI[35]];
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[2]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[1]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[6]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[7]] = "Wield";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[8]] = "No inventory space to put on spec weapon.";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[9]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[10]] = "gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[11]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[12]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[13]] = "gargoyle";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[14]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[15]] = "Attack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[16]] = "completed your task!";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[17]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[18]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[19]] = "empty";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[20]] = "No teleport tabs left in inventory";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[21]] = "Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[22]] = "Wear";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[23]] = "Break";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[27]] = "s";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[28]] = "bird";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[29]] = "Chicken";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[30]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[31]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[32]] = "squireattacker";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[33]] = "npcAttack";
        AutoAttack.lIlIIIl[AutoAttack.lIlIIlI[34]] = "Attack";
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

            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(lllIlllIllIlIII.isDead() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[12]]);
                Time.sleep((long)2L);

            }
        }
        if (AutoAttack.lIlIIlIII(lllIlllIllIlIlI.bz.exactName() ? 1 : 0)) {
            lllIlllIllIlIII = Combat.getAttackableNPC(nPC -> {
                int n2;
                if (AutoAttack.lIlIIlIIl(nPC.getName().toLowerCase().contains(this.bz.npcName().toLowerCase()) ? 1 : 0) && AutoAttack.lIlIIlIII(nPC.isDead() ? 1 : 0) && AutoAttack.lIlIlIIlI(nPC.distanceTo((Locatable)Players.getLocal()), this.bz.npcDistance()) && AutoAttack.lIlIlIIlI(Walker.buildPath((WorldPoint)nPC.getWorldLocation()).size(), this.bz.npcDistance())) {
                    n2 = lIlIIlI[1];

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

            }
            if (AutoAttack.lIlIIlIIl(lllIlllIllIlIIl.isEmpty() ? 1 : 0) && AutoAttack.lIlIIlIII(Players.getLocal().isMoving() ? 1 : 0) && AutoAttack.lIlIIlIII(lllIlllIllIlIII.isDead() ? 1 : 0)) {
                lllIlllIllIlIII.interact(lIlIIIl[lIlIIlI[15]]);
                Time.sleep((long)2L);

            }
        }
    }

    static {
        AutoAttack.lIlIIIlll();
        AutoAttack.lIlIIIllI();
    }

    private void a(int[] nArray) {
        Inventory.getFirst((int[])nArray).interact(lIlIIIl[lIlIIlI[22]]);
    }

    private static boolean lIlIlIIIl(Object object, Object object2) {
        return object == object2;
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

            if (1 < 0) {
                return;
            }
        } else if (AutoAttack.lIlIlIIIl((Object)lllIlllIllIIIII, (Object)I.SPELL)) {
            lllIlllIllIIIlI.an();

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

