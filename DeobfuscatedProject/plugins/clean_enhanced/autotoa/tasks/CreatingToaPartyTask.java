/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

/**
 * Creates a TOA party at the start of a raid.
 * This task handles opening the raid entry menu and creating a party
 * when the player is ready to enter the Tombs of Amascut.
 */
@TaskDesc(name="Creating TOA Party", priority=5, blocking=true)
public class CreatingToaPartyTask extends TOAConfigurableTask {
    // Varbit that tracks if player is in a TOA party (14386)
    private static final int TOA_PARTY_VARBIT = 14386;

    // Widget IDs
    private static final int PARTY_INTERFACE_WIDGET_ID = 50594947;  // Widget to create party (0x3043863)
    private static final int PARTY_INTERFACE_GROUP_ID = 773;        // Party interface group

    // Object IDs for the entry portal
    private static final int ENTRY_PORTAL_ID_1 = 45814;  // 0xB2F6 - Main entry object
    private static final int ENTRY_PORTAL_ID_2 = 45821;  // 0xB2FD - Alternate entry object

    @Inject
    protected CreatingToaPartyTask(Client client, TOAConfig config) {
        super(client, config);
    }

    @Override
    public boolean validate() {
        // If already in a party, don't need to create one
        if (Vars.getBit(TOA_PARTY_VARBIT) == 1) {
            return false;
        }

        // Don't try to create party if we still need to bank
        BankLoadout loadout = (BankLoadout) this.config.loadout().selected(BankLoadout.class);
        if (loadout.needsToBank()) {
            return false;
        }

        // Check if the party creation widget is visible
        Widget partyWidget = this.client.getWidget(PARTY_INTERFACE_WIDGET_ID);
        if (Widgets.isVisible(partyWidget)) {
            Log.info("[CreateParty] Creating a party");
            partyWidget.interact("Make Party");
            return true;
        }

        // Find and interact with the entry portal to open the party menu
        int[] portalIds = new int[] { ENTRY_PORTAL_ID_1, ENTRY_PORTAL_ID_2 };
        TileObject portal = TileObjects.getNearest(portalIds);
        if (portal != null) {
            Log.info("[CreateParty] Opening party menu");
            portal.interact("Inspect");
            return true;
        }

        return false;
    }
}
