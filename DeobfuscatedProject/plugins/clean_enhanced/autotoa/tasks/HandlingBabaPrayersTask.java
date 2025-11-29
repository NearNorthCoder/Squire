/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

/**
 * Handles prayer switching for Ba-Ba boss fight.
 *
 * Attack Patterns:
 * - Ba-Ba (NPC ID 11780): Main boss, use Protect from Melee when engaged
 * - Baboon adds: When present, override to protect from their ranged attacks
 * - Boulder (Graphic ID 2111): When boulder lands on Ba-Ba, use Protect from Missiles
 *   for 5 ticks to avoid falling rocks
 * - Falling rocks deal ranged damage, so protect from missiles during boulder phase
 */
@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabaPrayersTask
extends AutotoaManager {
    // NPC IDs
    private static final int BABA_NPC_ID = 11780;
    private static final String BABA_NAME = "Ba-Ba";
    private static final String BABOON_NAME = "Baboon";

    // Graphics IDs
    private static final int BOULDER_GRAPHIC_ID = 2111;

    // Region IDs for Ba-Ba room
    private static final int REGION_ID_1 = 11778;
    private static final int REGION_ID_2 = 11811;

    // Priority
    private static final int TASK_PRIORITY = 15188;

    // Tick delay for boulder falling rocks
    private static final int BOULDER_TICK_DELAY = 5;

    // Tick when boulder falling rocks will hit
    private int boulderRocksTickEnd;

    @Inject
    public HandlingBabaPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.boulderRocksTickEnd = 0;
    }

    @Override
    public boolean isInCorrectRegion() {
        int[] regionIds = new int[3];
        regionIds[0] = REGION_ID_1;
        regionIds[1] = REGION_ID_2;
        regionIds[2] = BABA_NPC_ID;
        return this.cm.a(regionIds);
    }

    @Override
    public boolean isValid() {
        return true;
    }

    /**
     * Determines which prayers to use based on current situation:
     * 1. If Ba-Ba is in monkey form (transformed), use offensive prayer only
     * 2. If boulder rocks are active (within tick window), use Protect from Missiles + offensive
     * 3. Otherwise, use Protect from Melee + offensive (default for Ba-Ba)
     */
    @Override
    public List<Prayer> getPrayersToActivate() {
        // Check if Ba-Ba is transformed into monkey form
        NPC baba = NPCs.getNearest(BABA_NAME);
        if (baba != null && baba.getId() == BABA_NPC_ID) {
            return List.of(this.getOffensivePrayer());
        }

        // Check if baboons are present
        NPC baboon = NPCs.getNearest(BABOON_NAME);
        if (Static.getClient().getTickCount() > this.boulderRocksTickEnd && baboon != null) {
            return List.of(Prayer.PROTECT_FROM_MISSILES, this.getOffensivePrayer());
        }

        // Default: Protect from Melee for Ba-Ba
        return List.of(Prayer.PROTECT_FROM_MELEE, this.getOffensivePrayer());
    }

    /**
     * Detects when a boulder lands on Ba-Ba, triggering falling rocks.
     * The falling rocks deal ranged damage, so we need to protect from missiles
     * for the next 5 ticks.
     */
    public void onGraphicsObjectCreated(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (graphicsObject.getId() != BOULDER_GRAPHIC_ID) {
            return;
        }

        LocalPoint location = graphicsObject.getLocation();
        WorldPoint worldPoint = WorldPoint.fromLocal(Static.getClient(), location);

        NPC baba = NPCs.getNearest(BABA_NAME);
        if (baba == null) {
            return;
        }

        // If boulder lands on Ba-Ba, set tick end for falling rocks
        if (baba.getWorldArea().contains(worldPoint)) {
            this.boulderRocksTickEnd = Static.getClient().getTickCount() + BOULDER_TICK_DELAY;
        }
    }

    @Override
    public int getPriority() {
        return TASK_PRIORITY;
    }

    @Override
    public GameEnum10 getPrayerMode() {
        return GameEnum10.FLICK;
    }
}
