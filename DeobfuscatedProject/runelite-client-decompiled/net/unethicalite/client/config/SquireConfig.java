/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.client.config;

import java.util.Set;
import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;

@ConfigGroup(value="squire")
public interface SquireConfig
extends Config {
    public static final String CONFIG_GROUP = "squire";
    @ConfigSection(name="Squire", description="Squire settings", position=0)
    public static final String squireSection = "SquireSettings";
    @ConfigSection(name="Pathfinder/Regions", position=1, description="")
    public static final String pathfinderSection = "Pathfinder/Regions";
    @ConfigSection(name="Other settings", position=3, description="")
    public static final String otherSettings = "Other settings";

    @ConfigItem(position=0, keyName="reload", name="Reload squire plugins", description="Reloads the squire plugins from the plugins folder", section="SquireSettings")
    default public Button reload() {
        return new Button();
    }

    @ConfigItem(position=1, keyName="logs", name="Open logs folder", description="Opens the squire logs folder", section="SquireSettings")
    default public Button logs() {
        return new Button();
    }

    @ConfigItem(position=2, keyName="neverLog", name="Neverlog", description="Skips idle checks", section="SquireSettings")
    default public boolean neverLog() {
        return false;
    }

    @ConfigItem(position=3, keyName="autoContinue", name="Auto continue", description="Automatically presses continue on non dialog interfaces", section="SquireSettings")
    default public boolean autoContinue() {
        return true;
    }

    @ConfigItem(position=4, keyName="bankPin", name="Bank pin", description="If filled, enters your bank pin on bank windows", section="SquireSettings")
    default public String bankPin() {
        return "";
    }

    @ConfigItem(position=3, keyName="disablePaint", name="Disables Infoboxes", description="Disables infoboxes for when you want to seem legit", section="SquireSettings")
    default public boolean disablePaint() {
        return false;
    }

    @ConfigItem(position=3, keyName="disableDebug", name="Disables Debug", description="Disables overlays/messages meant for debugging", section="SquireSettings")
    default public boolean disableDebugOverlay() {
        return true;
    }

    @ConfigItem(keyName="interactMethod", name="Interact method", description="Interaction method", position=0, hidden=true)
    default public InteractMethod interactMethod() {
        return InteractMethod.INVOKE;
    }

    @ConfigItem(keyName="forceForwarding", name="Force mouse forwarding", description="Forces mouse forwarding regardless of queued actions", hidden=true)
    default public boolean forceForwarding() {
        return false;
    }

    @ConfigItem(keyName="forwardMovement", name="Forward mouse movement", description="Forward mouse movement events", hidden=true)
    default public boolean forwardMovement() {
        return false;
    }

    @ConfigItem(keyName="clickLocation", name="Click coordinates", description="When not forwarding, specify client window coords to click on", hidden=true)
    default public String clickLocation() {
        return "0 0";
    }

    @ConfigItem(keyName="forceForwardMovement", name="Always forward movement", description="Always forward mouse movement regardless of queued actions", hidden=true)
    default public boolean forceForwardMovement() {
        return false;
    }

    @ConfigItem(keyName="forwardKeystrokes", name="Forward keystrokes as clicks", description="Converts keystrokes to mouse clicks and forwards them to the client", hidden=true)
    default public boolean forwardKeystrokes() {
        return false;
    }

    @ConfigItem(keyName="selectedMonitorsOnly", name="Forward from specific monitors", description="Forwards mouse events from selected monitors only", hidden=true)
    default public boolean selectedMonitorsOnly() {
        return false;
    }

    @ConfigItem(keyName="selectedMonitorIds", name="Monitor IDs", description="Selected monitor IDs", hidden=true)
    default public String selectedMonitorIds() {
        return "1,2";
    }

    @ConfigItem(keyName="selectedButtonsOnly", name="Forward only specific mouse buttons", description="Forward only specific mouse buttons", hidden=true)
    default public boolean selectedButtonsOnly() {
        return false;
    }

    @ConfigItem(keyName="selectedButtons", name="Button IDs", description="Selected button IDs", hidden=true)
    default public String selectedButtonIds() {
        return "1,2";
    }

    @ConfigItem(keyName="forwardLeftClick", name="Forward all clicks as left click", description="Converts all clicks to left mouse button and forwards them as a left click", hidden=true)
    default public boolean forwardLeftClick() {
        return false;
    }

    @ConfigItem(keyName="clickAfterInactivity", name="Clicks when you are inactive", description="If a menu action has been queued for 250ms, send a click from recording.", position=2, hidden=true, unhide="interactMethod", unhideValue="MOUSE_FORWARDING")
    default public boolean clickAfterInactivity() {
        return false;
    }

    @ConfigItem(keyName="naturalMouse", name="Natural mouse", description="Uses the 'natural mouse' algorithm to move and click", hidden=true)
    default public boolean naturalMouse() {
        return false;
    }

    @ConfigItem(keyName="disableMouse", name="Disable manual input", description="Disables manual input if a script/looped plugin is running", hidden=true)
    default public boolean disableMouse() {
        return false;
    }

    @ConfigItem(keyName="mouseBehavior", name="Mouse behavior", description="Type of clicks to send to the server", hidden=true)
    default public MouseBehavior mouseBehavior() {
        return MouseBehavior.CLICK_DATA_PLUGIN;
    }

    @ConfigItem(keyName="useTransports", name="Use transports", description="Include transport nodes when calculating paths", position=2, section="Pathfinder/Regions")
    default public boolean useTransports() {
        return true;
    }

    @ConfigItem(keyName="useTeleports", name="Use teleports", description="Include teleportation when calculating paths", position=2, section="Pathfinder/Regions")
    default public boolean useTeleports() {
        return true;
    }

    @ConfigItem(keyName="avoidWilderness", name="Avoid Wilderness", description="Avoids walking in the wilderness if the destination is not in the wildy", position=3, section="Pathfinder/Regions")
    default public boolean avoidWilderness() {
        return false;
    }

    @ConfigItem(keyName="downloadCollisionData", name="Download collision data", description="Downloads new collision data from the server and updates the currently used collision map", position=5, hidden=true, section="Pathfinder/Regions")
    default public Button download() {
        return new Button();
    }

    @ConfigItem(keyName="localCollisionData", name="Load cached collision data", description="Loads the locally stored collision data", position=6, section="Pathfinder/Regions", hidden=true)
    default public Button reloadLocalCollision() {
        return new Button();
    }

    @ConfigItem(keyName="usePoh", name="Use POH", description="", position=3, section="Pathfinder/Regions")
    default public boolean usePoh() {
        return false;
    }

    @ConfigItem(keyName="hasFairyRing", name="POH Fairy Ring/Tree", description="", position=4, section="Pathfinder/Regions")
    default public boolean hasFairyRing() {
        return false;
    }

    @ConfigItem(keyName="hasMountedGlory", name="Mounted Glory", description="", position=4, section="Pathfinder/Regions")
    default public boolean hasMountedGlory() {
        return false;
    }

    @ConfigItem(keyName="hasMountedDigsitePendant", name="Mounted Digsite Pendant", description="", position=4, section="Pathfinder/Regions")
    default public boolean hasMountedDigsitePendant() {
        return false;
    }

    @ConfigItem(keyName="hasMountedMythicalCape", name="Mounted Mythical Cape", description="", position=4, section="Pathfinder/Regions")
    default public boolean hasMountedMythicalCape() {
        return false;
    }

    @ConfigItem(keyName="hasMountedXericsTalisman", name="Mounted Xerics Talisman", description="", position=4, section="Pathfinder/Regions")
    default public boolean hasMountedXericsTalisman() {
        return false;
    }

    @ConfigItem(keyName="useMinigameTeleports", name="Minigame Teleports", description="", position=5, section="Pathfinder/Regions")
    default public boolean useMinigameTeleports() {
        return false;
    }

    @ConfigItem(keyName="hasJewelryBox", name="Jewelry Box", description="", position=4, section="Pathfinder/Regions")
    default public JewelryBox hasJewelryBox() {
        return JewelryBox.NONE;
    }

    @ConfigItem(keyName="useEquipmentJewellery", name="Use teleports from equipment", description="", position=4, section="Pathfinder/Regions")
    default public boolean useEquipmentJewellery() {
        return true;
    }

    @ConfigItem(keyName="housePortals", name="House Portals", description="", position=4, section="Pathfinder/Regions")
    default public Set<HousePortal> housePortals() {
        return Set.of();
    }

    @Range(min=1, max=50)
    @ConfigItem(position=0, hidden=true, keyName="fpsLimit", name="FPS limit", description="FPS limit")
    default public int fpsLimit() {
        return 15;
    }

    @ConfigItem(position=1, hidden=true, keyName="renderOff", name="Render off", description="Render off")
    default public boolean renderOff() {
        return false;
    }

    @ConfigItem(position=12, hidden=true, keyName="devMode", name="Dev mode", description="Dev mode")
    default public boolean devMode() {
        return false;
    }

    @ConfigItem(position=2, hidden=true, keyName="minimized", name="Start minimized", description="Start minimized")
    default public boolean minimized() {
        return false;
    }

    @ConfigItem(position=0, keyName="session", name="Send session (online users)", description="Sends your online status & your client mode to the backend.", hidden=true)
    default public boolean session() {
        return true;
    }

    @ConfigItem(position=0, keyName="regions", name="Send region", description="Sends your local region data to the backend.", hidden=true)
    default public boolean regions() {
        return true;
    }

    @ConfigItem(position=0, keyName="disableGroups", name="Disable Groups/Party", description="Disables the Party functionality (needs a restart).", section="Other settings")
    default public boolean disableGroups() {
        return false;
    }
}

