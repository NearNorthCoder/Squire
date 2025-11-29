/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.KephriManager;
import gg.squire.autotoa.tasks.GameEnum4;

/**
 * Task: Attack Akkha's Shadow during Butterfly Phase
 *
 * Mechanics:
 * - During Akkha's butterfly phase, shadows spawn in a circle pattern
 * - Players must move to specific positions and attack the shadow
 * - This task handles positioning and attacking the shadow NPCs
 * - Uses shadow attack style from config when attacking shadows
 *
 * Attack Pattern:
 * 1. Find current position in butterfly circle
 * 2. Move to next position in sequence
 * 3. Attack shadow when standing on marked tiles
 * 4. Maintain distance from shadow (not more than 2 tiles away)
 */
@TaskDesc(name="Attacking Akkha (Butterfly)")
public class AttackingAkkhaButterflyTask extends KephriManager {

    // NPC names and actions
    private static final String AKKHA_SHADOW_NAME = "Akkha's Shadow";
    private static final String ATTACK_ACTION = "Attack";

    // Task timing counter
    private int tickCounter;

    @Inject
    protected AttackingAkkhaButterflyTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
        this.tickCounter = 0;
    }

    @Override
    protected boolean shouldExecute() {
        // Check if we should be doing this task
        if (!this.bu()) {
            return false;
        }

        // Don't run while player is moving
        if (Players.getLocal().isMoving()) {
            bp();
        }

        // Get butterfly mechanic data
        o butterflyMechanic = bv();
        if (butterflyMechanic == null) {
            return false;
        }

        // Find next position in butterfly circle
        WorldPoint nextPosition = null;
        for (int i = 0; i < butterflyMechanic.M().size(); i++) {
            WorldPoint circlePoint = a(butterflyMechanic.M().get(i));
            if (circlePoint.equals(Players.getLocal().getWorldLocation())) {
                // Found our current position, get next one in sequence
                nextPosition = a(butterflyMechanic.M().get((i + 1) % butterflyMechanic.M().size()));
                break;
            }
        }

        // Get Akkha's Shadow NPC
        NPC akkhasShadow = J();

        // If shadow not found and we're not at spawn, find it near spawn point
        if (!g(akkhasShadow)) {
            WorldPoint spawnLocation = bx().a(cu);
            akkhasShadow = NPCs.getNearest(spawnLocation, AKKHA_SHADOW_NAME);
        }

        if (akkhasShadow == null) {
            return false;
        }

        // Check if we're standing on one of the marked attack tiles
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();
        for (Point markedTile : butterflyMechanic.N()) {
            if (playerLocation.equals(a(markedTile))) {
                // We're on an attack tile, attack the shadow
                akkhasShadow.interact(ATTACK_ACTION);
            }
        }

        // If no next position and player not moving, move to first position
        if (nextPosition == null && !Players.getLocal().isMoving()) {
            g(a(butterflyMechanic.M().get(0)));
            return true;
        }

        // Check if shadow is too far away (more than 2 tiles)
        NPC shadow = J();
        if (shadow.getWorldArea().distanceTo(Players.getLocal()) > 2) {
            return false;
        }

        // Move to next position if we have one
        if (nextPosition != null) {
            Movement.setDestination(nextPosition);
            return true;
        }

        return false;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        // Use shadow attack style when attacking Akkha's Shadow
        if (!g(J())) {
            return this.config.shadowAttackStyle();
        }
        return super.br();
    }
}
