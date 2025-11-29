/*
 * Deobfuscated CoX Tekton Task
 * Handles the Tekton boss encounter in Chambers of Xeric
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Task for fighting Tekton in Chambers of Xeric.
 *
 * Tekton Mechanics:
 * - Walking metallic golem boss that patrols the room
 * - Returns to anvil periodically to heal and become immune
 * - Can be flinched by attacking and stepping under him
 * - Uses melee attacks primarily
 * - Has a special meteor attack when at anvil
 * - Weak to crush weapons (Elder maul, Inquisitor's mace)
 */
@TaskDesc(name = "Tekton", priority = 10000, blocking = true, register = true)
public class TektonTask extends CoxTaskBase {

    // Animation IDs
    private static final int TEKTON_ANIMATION_IDLE = 660;
    private static final int TEKTON_ANIMATION_ENRAGED = 7488;
    private static final int TEKTON_ANIMATION_RETURNING = 7473;

    // Combat constants
    private static final int SPEC_ENERGY_THRESHOLD = 50;
    private static final int MIN_ANIMATION_FRAME = 10;
    private static final int MELEE_DISTANCE = 1;
    private static final int SAFE_DISTANCE = 5;

    // Weapon IDs for crush
    private static final int ELDER_MAUL = 21003;
    private static final int INQUISITORS_MACE = 24423;

    // Room state
    private NHelper currentRoom;
    private NHelper previousRoom;

    // Combat tracking
    private int lastAnimation;
    private int animationCounter;
    private int flinchAttempts;
    private int attackCounter;
    private int retreatCounter;
    private int ticksSinceLastAction;

    @Inject
    protected TektonTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.lastAnimation = 0;
        this.animationCounter = 0;
        this.flinchAttempts = 0;
        this.attackCounter = 0;
        this.retreatCounter = 0;
        this.ticksSinceLastAction = 0;
    }

    @Override
    public boolean validate() {
        this.currentRoom = stateManager.getCurrentRoom();
        this.previousRoom = stateManager.getPreviousRoom();

        return this.currentRoom != null && this.currentRoom.getRoomType() == RoomType.TEKTON;
    }

    @Override
    public boolean execute() {
        if (shouldMoveToStart()) {
            return moveToStart();
        }

        // Check if we can reach the start position
        WorldPoint tektonStart = RoomPoints.TEKTON_START.getPoint(currentRoom);

        // Find entrance if not reachable
        TileObject entrance = findRoomEntrance();
        if (!Reachable.isWalkable(tektonStart)) {
            if (entrance == null) {
                return moveToStart();
            }
            entrance.interact("Enter");
            return true;
        }

        // Find Tekton NPC
        NPC tekton = findTekton();
        if (tekton == null) {
            return moveToStart();
        }

        // Configure combat style
        setProperCombatStyle();

        // Handle different Tekton states
        if (tekton.getAnimation() == TEKTON_ANIMATION_IDLE || tekton.getAnimation() == TEKTON_ANIMATION_RETURNING) {
            flinchAttempts++;
            System.out.println("Tekton attempts: " + flinchAttempts);

            if (flinchAttempts <= 1) {
                tekton.interact("Attack");
                return true;
            }

            // Flinching - step under Tekton
            if (config.flinchTekton()) {
                Movement.setDestination(getPlayerSafeTile());
                return true;
            }

            // Advanced flinching - move to max melee range
            if (flinchAttempts <= 3 && config.flinchTekton()) {
                WorldPoint safeTile = player.getWorldArea()
                    .getMeleeTiles(client)
                    .stream()
                    .filter(Reachable::isWalkable)
                    .max(Comparator.comparingInt(wp -> tekton.getWorldArea().distanceTo(wp)))
                    .orElse(null);
                Movement.setDestination(safeTile);
                return true;
            }
        }

        // Reset flinch counter when Tekton moves
        flinchAttempts = 0;

        // Move to start if Tekton is walking away
        if (tekton.isMoving() && tekton.getWorldArea().distanceTo((Locatable) player) > 3) {
            WorldPoint startPoint = RoomPoints.TEKTON_START.getPoint(currentRoom);

            // Check for meteor projectiles
            Projectile meteor = Projectiles.getNearest(proj ->
                proj.getId() == 660 &&
                WorldPoint.fromLocal(client, proj.getTarget()).distanceTo(startPoint) <= 1
            );

            if (meteor != null) {
                return false; // Wait for meteor to land
            }

            Movement.setDestination(startPoint);
            return true;
        }

        // Handle when Tekton is at anvil (immune)
        if (tekton.getPoseAnimation() == TEKTON_ANIMATION_ENRAGED) {
            if (entrance != null) {
                Movement.setDestination(getTileNearExit());
                return true;
            }

            // Find safe tile away from anvil
            WorldPoint safeTile = tektonStart.createWorldArea(4)
                .toWorldPointList()
                .stream()
                .filter(wp -> Reachable.isWalkable(wp) && tekton.getWorldArea().distanceTo(wp) == MELEE_DISTANCE)
                .min(Comparator.comparingDouble(wp -> wp.distanceTo2DHypotenuse(tektonStart)))
                .orElse(null);

            if (safeTile == null) {
                return false;
            }

            Movement.setDestination(safeTile);
            return true;
        }

        // Use special attack when available
        useSpecialAttack();

        // Attack Tekton
        if (tekton.isMoving()) {
            if (player.getInteracting() != null && player.getInteracting().equals(tekton)) {
                return false;
            }
            tekton.interact("Attack");
            return true;
        }

        // Flinching logic when not moving
        if (!config.flinchTekton()) {
            WorldPoint attackTile = getAttackTile();
            if (attackTile == null) {
                return false;
            }

            WorldPoint currentTile = getFlinchTile();
            if (isInFlinchZone(currentTile)) {
                attackCounter = 0;
                retreatCounter++;

                if (retreatCounter == 1) {
                    tekton.interact("Attack");
                    return true;
                }

                Movement.setDestination(attackTile);
                return true;
            }

            retreatCounter = 0;
            WorldPoint retreatTile = getPlayerSafeTile();

            if (player.isMoving()) {
                return false;
            }

            Movement.setDestination(retreatTile);
        }

        int currentAnimation = tekton.getAnimation();

        // Check if in melee range
        if (tekton.getWorldArea().getMeleeTiles(client).contains(player.getWorldLocation())) {
            System.out.println("In melee range");
            ticksSinceLastAction = 0;

            WorldPoint escapePoint = player.getWorldArea()
                .getMeleeTiles(client)
                .stream()
                .filter(Reachable::isWalkable)
                .max(Comparator.comparingInt(wp -> tekton.getWorldArea().distanceTo(wp)))
                .orElse(null);

            Movement.setDestination(escapePoint);
            System.out.println("Escaping");
            return true;
        }

        System.out.println("last: " + lastAnimation + " | current: " + currentAnimation + " | frame: " + tekton.getAnimationFrame());

        // Attack when animation frame is right
        if (tekton.getAnimation() != -1 && tekton.getAnimationFrame() >= MIN_ANIMATION_FRAME && ticksSinceLastAction > 0) {
            lastAnimation = tekton.getAnimation();
            tekton.interact("Attack");
        }

        ticksSinceLastAction++;
        return true;
    }

    /**
     * Find the Tekton NPC
     */
    private NPC findTekton() {
        return NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Tekton")
        );
    }

    /**
     * Find room entrance
     */
    private TileObject findRoomEntrance() {
        return TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Passageway") &&
            obj.hasAction("Enter") &&
            currentRoom.contains(obj)
        );
    }

    /**
     * Move to starting position
     */
    private boolean moveToStart() {
        if (Reachable.isWalkable(currentRoom.getExitPoint())) {
            Movement.setDestination(previousRoom.getEnterPoint());
            return true;
        }

        TileObject entrance = findRoomEntrance();
        if (entrance == null) {
            return false;
        }

        if (player.isMoving() || player.isAnimating()) {
            return false;
        }

        entrance.interact("Enter");
        return true;
    }

    /**
     * Check if should move to start
     */
    private boolean shouldMoveToStart() {
        return false; // Placeholder
    }

    /**
     * Use special attack if available
     */
    private boolean useSpecialAttack() {
        if (Combat.getSpecEnergy() < SPEC_ENERGY_THRESHOLD) {
            return false;
        }

        Item specWeapon = equipmentManager.getSpecWeapon();
        if (specWeapon == null) {
            return false;
        }

        int equippedWeapon = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
        if (specWeapon.getId() != equippedWeapon) {
            return false;
        }

        Combat.toggleSpec();
        return true;
    }

    /**
     * Set proper combat style for Tekton
     */
    public void setProperCombatStyle() {
        if (!getGear().isFullyEquipped() || Combat.getAttackStyle() == Combat.AttackStyle.THIRD) {
            return;
        }

        // Use crush style if wielding crush weapon
        if (Equipment.contains(ELDER_MAUL, INQUISITORS_MACE)) {
            Combat.setAttackStyle(Combat.AttackStyle.THIRD);
        }
    }

    /**
     * Get the attack tile for flinching
     */
    private WorldPoint getAttackTile() {
        NPC tekton = findTekton();
        if (tekton == null) {
            return null;
        }

        WorldPoint tektonLoc = tekton.getWorldLocation();
        int orientation = tekton.getOrientation();
        int normalizedOrientation = normalizeOrientation(orientation);

        switch (normalizedOrientation) {
            case 0:
                return tektonLoc.dx(MELEE_DISTANCE).dy(-1);
            case 512:
                return tektonLoc.dx(-1).dy(0);
            case 1024:
                return tektonLoc.dx(0).dy(-2);
            case 1536:
                return tektonLoc.dx(-2).dy(MELEE_DISTANCE);
            default:
                return null;
        }
    }

    /**
     * Get the tile to stand on while flinching
     */
    private WorldPoint getFlinchTile() {
        NPC tekton = findTekton();
        if (tekton == null) {
            return null;
        }

        WorldPoint tektonLoc = tekton.getWorldLocation();
        int orientation = tekton.getOrientation();
        int normalizedOrientation = normalizeOrientation(orientation);

        switch (normalizedOrientation) {
            case 1536:
                return tektonLoc.dx(MELEE_DISTANCE).dy(-1);
            case 0:
                return tektonLoc.dx(-1).dy(0);
            case 512:
                return tektonLoc.dx(0).dy(-2);
            case 1024:
                return tektonLoc.dx(-2).dy(MELEE_DISTANCE);
            default:
                return null;
        }
    }

    /**
     * Get tiles around Tekton for flinching
     */
    private List<WorldPoint> getFlinchZone() {
        NPC tekton = findTekton();
        if (tekton == null) {
            return null;
        }

        WorldPoint loc = tekton.getWorldLocation();
        return List.of(
            loc.dx(MELEE_DISTANCE).dy(-1),
            loc.dx(-1).dy(0),
            loc.dx(0).dy(-2),
            loc.dx(-2).dy(MELEE_DISTANCE)
        );
    }

    /**
     * Check if player is in flinch zone
     */
    private boolean isInFlinchZone(WorldPoint tile) {
        List<WorldPoint> flinchZone = getFlinchZone();
        return flinchZone != null && flinchZone.contains(player.getWorldLocation());
    }

    /**
     * Get safe tile near exit
     */
    private WorldPoint getTileNearExit() {
        return currentRoom.getExitPoint();
    }

    /**
     * Get safe tile for player
     */
    private WorldPoint getPlayerSafeTile() {
        NPC tekton = findTekton();
        WorldPoint tektonStart = RoomPoints.TEKTON_START.getPoint(currentRoom);
        List<WorldPoint> projectileTiles = new ArrayList<>();

        // Get all meteor projectile locations
        List<Projectile> meteors = Projectiles.getAll(660);
        for (Projectile meteor : meteors) {
            WorldPoint target = WorldPoint.fromLocal(client, meteor.getTarget());
            projectileTiles.addAll(target.createWorldArea(1).toWorldPointList());
        }

        // Find safe tile away from meteors
        WorldPoint safeTile = player.getWorldLocation()
            .createWorldArea(3)
            .toWorldPointList()
            .stream()
            .filter(wp -> Reachable.isWalkable(wp) && !projectileTiles.contains(wp))
            .min(Comparator.comparingInt(wp -> wp.distanceTo((Locatable) player))
                .thenComparingDouble(wp -> wp.distanceTo2DHypotenuse(tektonStart)))
            .orElse(null);

        return safeTile;
    }

    /**
     * Normalize orientation to cardinal directions
     */
    private int normalizeOrientation(int orientation) {
        int offset = 0;

        for (int i = 0; i < MELEE_DISTANCE; i++) {
            if (isInRange(orientation, i * 512, 256)) {
                return i * 512;
            }
        }

        return 0;
    }

    /**
     * Check if value is in range
     */
    private boolean isInRange(int value, int target, int tolerance) {
        if (tolerance == 0) {
            return value <= 2048 - tolerance && value >= tolerance;
        }
        return value >= target - tolerance && value <= target + tolerance;
    }

    /**
     * Use stamina potion if needed
     */
    private boolean useStaminaPotion(int energyThreshold) {
        Item stamina = Inventory.getFirst(item ->
            item.getName().startsWith("Stamina potion")
        );

        if (stamina == null) {
            return false;
        }

        if (Movement.getRunEnergy() > energyThreshold) {
            return false;
        }

        stamina.interact("Drink");
        return true;
    }

    @Override
    public EquipmentSetup getGear() {
        // Use spec weapon if special attack is ready
        if (Combat.getSpecEnergy() >= SPEC_ENERGY_THRESHOLD && equipmentManager.getSpecWeapon() != null) {
            return equipmentManager.getSetup(equipmentManager.getSpecWeapon());
        }

        return equipmentManager.getSetup(equipmentManager.getWeapon(RoomType.TEKTON));
    }

    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        NPC tekton = NPCs.getNearest(npc ->
            npc.getName() != null && npc.getName().contains("Tekton")
        );

        if (tekton == null) {
            return null;
        }

        List<Prayer> offensivePrayers = Prayers.getOffensive();
        Prayer protectionPrayer = Prayer.PROTECT_FROM_MELEE;

        prayers.add(protectionPrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }
}
